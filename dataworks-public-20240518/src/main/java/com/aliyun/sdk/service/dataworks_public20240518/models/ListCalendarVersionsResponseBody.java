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
 * {@link ListCalendarVersionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCalendarVersionsResponseBody</p>
 */
public class ListCalendarVersionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCalendarVersionsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCalendarVersionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListCalendarVersionsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6A6CBE87-9F91-1323-B680-E7A7065XXXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCalendarVersionsResponseBody build() {
            return new ListCalendarVersionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCalendarVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCalendarVersionsResponseBody</p>
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
             * <p>The list of non-scheduling dates. Tasks perform dry runs on these dates.</p>
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
    /**
     * 
     * {@link ListCalendarVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCalendarVersionsResponseBody</p>
     */
    public static class CalendarVersions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllProjects")
        private Boolean allProjects;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("ExpirationReminder")
        private String expirationReminder;

        @com.aliyun.core.annotation.NameInMap("FallbackPolicy")
        private String fallbackPolicy;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OverduePolicy")
        private String overduePolicy;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectIds")
        private java.util.List<Long> projectIds;

        @com.aliyun.core.annotation.NameInMap("SchedulePolicy")
        private SchedulePolicy schedulePolicy;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Integer version;

        private CalendarVersions(Builder builder) {
            this.allProjects = builder.allProjects;
            this.description = builder.description;
            this.endDate = builder.endDate;
            this.expirationReminder = builder.expirationReminder;
            this.fallbackPolicy = builder.fallbackPolicy;
            this.id = builder.id;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.overduePolicy = builder.overduePolicy;
            this.owner = builder.owner;
            this.projectIds = builder.projectIds;
            this.schedulePolicy = builder.schedulePolicy;
            this.startDate = builder.startDate;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CalendarVersions create() {
            return builder().build();
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
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
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

        /**
         * @return version
         */
        public Integer getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean allProjects; 
            private String description; 
            private String endDate; 
            private String expirationReminder; 
            private String fallbackPolicy; 
            private Long id; 
            private Long modifyTime; 
            private String name; 
            private String overduePolicy; 
            private String owner; 
            private java.util.List<Long> projectIds; 
            private SchedulePolicy schedulePolicy; 
            private String startDate; 
            private String type; 
            private Integer version; 

            private Builder() {
            } 

            private Builder(CalendarVersions model) {
                this.allProjects = model.allProjects;
                this.description = model.description;
                this.endDate = model.endDate;
                this.expirationReminder = model.expirationReminder;
                this.fallbackPolicy = model.fallbackPolicy;
                this.id = model.id;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.overduePolicy = model.overduePolicy;
                this.owner = model.owner;
                this.projectIds = model.projectIds;
                this.schedulePolicy = model.schedulePolicy;
                this.startDate = model.startDate;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>Specifies whether the calendar applies to all workspaces.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allProjects(Boolean allProjects) {
                this.allProjects = allProjects;
                return this;
            }

            /**
             * <p>The description of the scheduling calendar.</p>
             * 
             * <strong>example:</strong>
             * <p>Weekday scheduling calendar</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The end date of the calendar validity period, in the <code>yyyy-mm-dd</code> format. This parameter is returned only for strongly constrained calendars.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-09</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The expiration reminder. This parameter is returned only for strongly constrained calendars. Valid values:</p>
             * <ul>
             * <li>OneMonthBefore: One month in advance.</li>
             * <li>OneWeekBefore: One week in advance.</li>
             * <li>ThreeDaysBefore: Three days in advance.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OneMonthBefore</p>
             */
            public Builder expirationReminder(String expirationReminder) {
                this.expirationReminder = expirationReminder;
                return this;
            }

            /**
             * <p>The default scheduling policy for dates that are not specified. This parameter is returned only for weakly constrained calendars. Valid values:</p>
             * <ul>
             * <li>Normal: Normal scheduling.</li>
             * <li>Pause: Pause scheduling.</li>
             * <li>Skip: Dry run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder fallbackPolicy(String fallbackPolicy) {
                this.fallbackPolicy = fallbackPolicy;
                return this;
            }

            /**
             * <p>The ID of the scheduling calendar.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The time when the calendar was modified. The value is a UNIX timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1640000000000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the scheduling calendar.</p>
             * 
             * <strong>example:</strong>
             * <p>work_calendar</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The scheduling policy after the calendar expires. This parameter is returned only for strongly constrained calendars. Valid values:</p>
             * <ul>
             * <li>Normal: Normal scheduling.</li>
             * <li>Pause: Pause scheduling.</li>
             * <li>Skip: Dry run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Skip</p>
             */
            public Builder overduePolicy(String overduePolicy) {
                this.overduePolicy = overduePolicy;
                return this;
            }

            /**
             * <p>The account ID of the owner.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The list of applicable workspace IDs. An empty array is returned if AllProjects is set to true.</p>
             */
            public Builder projectIds(java.util.List<Long> projectIds) {
                this.projectIds = projectIds;
                return this;
            }

            /**
             * <p>The date scheduling policy.</p>
             */
            public Builder schedulePolicy(SchedulePolicy schedulePolicy) {
                this.schedulePolicy = schedulePolicy;
                return this;
            }

            /**
             * <p>The start date of the calendar validity period, in the <code>yyyy-mm-dd</code> format. This parameter is returned only for strongly constrained calendars.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-08</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The calendar type. Valid values:</p>
             * <ul>
             * <li>StrongConstraint: Strongly constrained calendar.</li>
             * <li>WeakConstraint: Weakly constrained calendar.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>StrongConstraint</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Integer version) {
                this.version = version;
                return this;
            }

            public CalendarVersions build() {
                return new CalendarVersions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCalendarVersionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCalendarVersionsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CalendarVersions")
        private java.util.List<CalendarVersions> calendarVersions;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        @com.aliyun.core.annotation.Validation(maximum = 100, minimum = 1)
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.calendarVersions = builder.calendarVersions;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return calendarVersions
         */
        public java.util.List<CalendarVersions> getCalendarVersions() {
            return this.calendarVersions;
        }

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<CalendarVersions> calendarVersions; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.calendarVersions = model.calendarVersions;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The complete list of historical versions of the scheduling calendar, sorted in descending order by version number.</p>
             */
            public Builder calendarVersions(java.util.List<CalendarVersions> calendarVersions) {
                this.calendarVersions = calendarVersions;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
