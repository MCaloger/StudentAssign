using System.ComponentModel.DataAnnotations;

namespace StudentAssignMVC.Assignment
{
    public class AssignmentModel
    {
        int id { get; set; }
        [Required]
        string title { get; set; }
        string description { get; set; }
        DateTime DueDate { get; set; }
    }
}
 