// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateCalendarRequest} extends {@link RequestModel}
 *
 * <p>CreateCalendarRequest</p>
 */
public class CreateCalendarRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllProjects")
    private Boolean allProjects;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 2048, minLength = 5)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndDate")
    private String endDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExpirationReminder")
    private String expirationReminder;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FallbackPolicy")
    private String fallbackPolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 100)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OverduePolicy")
    private String overduePolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Owner")
    @com.aliyun.core.annotation.Validation(required = true)
    private String owner;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectIds")
    private java.util.List<Long> projectIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SchedulePolicy")
    @com.aliyun.core.annotation.Validation(required = true)
    private SchedulePolicy schedulePolicy;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartDate")
    private String startDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateCalendarRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.allProjects = builder.allProjects;
        this.description = builder.description;
        this.endDate = builder.endDate;
        this.expirationReminder = builder.expirationReminder;
        this.fallbackPolicy = builder.fallbackPolicy;
        this.name = builder.name;
        this.overduePolicy = builder.overduePolicy;
        this.owner = builder.owner;
        this.projectIds = builder.projectIds;
        this.schedulePolicy = builder.schedulePolicy;
        this.startDate = builder.startDate;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCalendarRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return allProjects
     */
    public Boolean getAllProjects() {
        return this.allProjects;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return expirationReminder
     */
    public String getExpirationReminder() {
        return this.expirationReminder;
    }

    /**
     * @return fallbackPolicy
     */
    public String getFallbackPolicy() {
        return this.fallbackPolicy;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return overduePolicy
     */
    public String getOverduePolicy() {
        return this.overduePolicy;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return projectIds
     */
    public java.util.List<Long> getProjectIds() {
        return this.projectIds;
    }

    /**
     * @return schedulePolicy
     */
    public SchedulePolicy getSchedulePolicy() {
        return this.schedulePolicy;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateCalendarRequest, Builder> {
        private String regionId; 
        private Boolean allProjects; 
        private String description; 
        private String endDate; 
        private String expirationReminder; 
        private String fallbackPolicy; 
        private String name; 
        private String overduePolicy; 
        private String owner; 
        private java.util.List<Long> projectIds; 
        private SchedulePolicy schedulePolicy; 
        private String startDate; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateCalendarRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.allProjects = request.allProjects;
            this.description = request.description;
            this.endDate = request.endDate;
            this.expirationReminder = request.expirationReminder;
            this.fallbackPolicy = request.fallbackPolicy;
            this.name = request.name;
            this.overduePolicy = request.overduePolicy;
            this.owner = request.owner;
            this.projectIds = request.projectIds;
            this.schedulePolicy = request.schedulePolicy;
            this.startDate = request.startDate;
            this.type = request.type;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether the calendar applies to all workspaces. Default value: false.</p>
         * <ul>
         * <li>true: all workspaces.</li>
         * <li>false: the workspaces specified by ProjectIds.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allProjects(Boolean allProjects) {
            this.putBodyParameter("AllProjects", allProjects);
            this.allProjects = allProjects;
            return this;
        }

        /**
         * <p>The description of the scheduling calendar. The description must be 5 to 2,048 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Weekday scheduling calendar</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The end date of the calendar validity period. Format: <code>yyyy-mm-dd</code>. This parameter is required when Type is set to StrongConstraint. The end date cannot be earlier than the start date, and the interval between the start date and the end date must be less than 5 years.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-09</p>
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * <p>The expiration reminder. This parameter is required when Type is set to StrongConstraint.</p>
         * <ul>
         * <li>OneMonthBefore: one month in advance.</li>
         * <li>OneWeekBefore: one week in advance.</li>
         * <li>ThreeDaysBefore: three days in advance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OneMonthBefore</p>
         */
        public Builder expirationReminder(String expirationReminder) {
            this.putBodyParameter("ExpirationReminder", expirationReminder);
            this.expirationReminder = expirationReminder;
            return this;
        }

        /**
         * <p>The default scheduling policy for dates that are not configured. This parameter is required when Type is set to WeakConstraint.</p>
         * <ul>
         * <li>Normal: normal scheduling.</li>
         * <li>Pause: pause scheduling.</li>
         * <li>Skip: dry run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        public Builder fallbackPolicy(String fallbackPolicy) {
            this.putBodyParameter("FallbackPolicy", fallbackPolicy);
            this.fallbackPolicy = fallbackPolicy;
            return this;
        }

        /**
         * <p>The name of the scheduling calendar. The name must be unique within the current tenant and can be up to 100 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>work_calendar</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The scheduling policy after the calendar expires. This parameter is required when Type is set to StrongConstraint.</p>
         * <ul>
         * <li>Normal: normal scheduling.</li>
         * <li>Pause: pause scheduling.</li>
         * <li>Skip: dry run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Skip</p>
         */
        public Builder overduePolicy(String overduePolicy) {
            this.putBodyParameter("OverduePolicy", overduePolicy);
            this.overduePolicy = overduePolicy;
            return this;
        }

        /**
         * <p>The account ID of the owner.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        public Builder owner(String owner) {
            this.putBodyParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * <p>The list of applicable workspace IDs.</p>
         * <ul>
         * <li>If AllProjects is set to false or left empty: This parameter is required and cannot be empty.</li>
         * <li>If AllProjects is set to true: Leave this parameter empty or pass an empty array.</li>
         * </ul>
         */
        public Builder projectIds(java.util.List<Long> projectIds) {
            String projectIdsShrink = shrink(projectIds, "ProjectIds", "json");
            this.putBodyParameter("ProjectIds", projectIdsShrink);
            this.projectIds = projectIds;
            return this;
        }

        /**
         * <p>The date scheduling policy. For a strong constraint calendar, the normal scheduling dates and non-scheduling dates must cover every day within the validity period and cannot overlap.</p>
         * <p>This parameter is required.</p>
         */
        public Builder schedulePolicy(SchedulePolicy schedulePolicy) {
            String schedulePolicyShrink = shrink(schedulePolicy, "SchedulePolicy", "json");
            this.putBodyParameter("SchedulePolicy", schedulePolicyShrink);
            this.schedulePolicy = schedulePolicy;
            return this;
        }

        /**
         * <p>The start date of the calendar validity period. Format: <code>yyyy-mm-dd</code>. This parameter is required when Type is set to StrongConstraint.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-10-08</p>
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        /**
         * <p>The type of the calendar.</p>
         * <ul>
         * <li>StrongConstraint: strong constraint calendar.</li>
         * <li>WeakConstraint: weak constraint calendar.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>StrongConstraint</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateCalendarRequest build() {
            return new CreateCalendarRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateCalendarRequest} extends {@link TeaModel}
     *
     * <p>CreateCalendarRequest</p>
     */
    public static class SchedulePolicy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NormalDates")
        private java.util.List<String> normalDates;

        @com.aliyun.core.annotation.NameInMap("SkipDates")
        private java.util.List<String> skipDates;

        private SchedulePolicy(Builder builder) {
            this.normalDates = builder.normalDates;
            this.skipDates = builder.skipDates;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SchedulePolicy create() {
            return builder().build();
        }

        /**
         * @return normalDates
         */
        public java.util.List<String> getNormalDates() {
            return this.normalDates;
        }

        /**
         * @return skipDates
         */
        public java.util.List<String> getSkipDates() {
            return this.skipDates;
        }

        public static final class Builder {
            private java.util.List<String> normalDates; 
            private java.util.List<String> skipDates; 

            private Builder() {
            } 

            private Builder(SchedulePolicy model) {
                this.normalDates = model.normalDates;
                this.skipDates = model.skipDates;
            } 

            /**
             * <p>The list of normal scheduling dates.</p>
             */
            public Builder normalDates(java.util.List<String> normalDates) {
                this.normalDates = normalDates;
                return this;
            }

            /**
             * <p>The list of non-scheduling dates. Tasks perform dry runs on these dates. This parameter is used only for strong constraint calendars.</p>
             */
            public Builder skipDates(java.util.List<String> skipDates) {
                this.skipDates = skipDates;
                return this;
            }

            public SchedulePolicy build() {
                return new SchedulePolicy(this);
            } 

        } 

    }
}
