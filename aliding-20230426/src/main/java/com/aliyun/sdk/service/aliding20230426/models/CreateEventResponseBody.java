// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEventResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEventResponseBody</p>
 */
public class CreateEventResponseBody extends TeaModel {
    @NameInMap("attendees")
    private java.util.List < Attendees> attendees;

    @NameInMap("createTime")
    private String createTime;

    @NameInMap("description")
    private String description;

    @NameInMap("end")
    private End end;

    @NameInMap("id")
    private String id;

    @NameInMap("isAllDay")
    private Boolean isAllDay;

    @NameInMap("location")
    private Location location;

    @NameInMap("onlineMeetingInfo")
    private OnlineMeetingInfo onlineMeetingInfo;

    @NameInMap("organizer")
    private Organizer organizer;

    @NameInMap("recurrence")
    private Recurrence recurrence;

    @NameInMap("reminders")
    private java.util.List < Reminders> reminders;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("start")
    private Start start;

    @NameInMap("summary")
    private String summary;

    @NameInMap("uiConfigs")
    private java.util.List < UiConfigs> uiConfigs;

    @NameInMap("updateTime")
    private String updateTime;

    private CreateEventResponseBody(Builder builder) {
        this.attendees = builder.attendees;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.end = builder.end;
        this.id = builder.id;
        this.isAllDay = builder.isAllDay;
        this.location = builder.location;
        this.onlineMeetingInfo = builder.onlineMeetingInfo;
        this.organizer = builder.organizer;
        this.recurrence = builder.recurrence;
        this.reminders = builder.reminders;
        this.requestId = builder.requestId;
        this.start = builder.start;
        this.summary = builder.summary;
        this.uiConfigs = builder.uiConfigs;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return attendees
     */
    public java.util.List < Attendees> getAttendees() {
        return this.attendees;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return end
     */
    public End getEnd() {
        return this.end;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return isAllDay
     */
    public Boolean getIsAllDay() {
        return this.isAllDay;
    }

    /**
     * @return location
     */
    public Location getLocation() {
        return this.location;
    }

    /**
     * @return onlineMeetingInfo
     */
    public OnlineMeetingInfo getOnlineMeetingInfo() {
        return this.onlineMeetingInfo;
    }

    /**
     * @return organizer
     */
    public Organizer getOrganizer() {
        return this.organizer;
    }

    /**
     * @return recurrence
     */
    public Recurrence getRecurrence() {
        return this.recurrence;
    }

    /**
     * @return reminders
     */
    public java.util.List < Reminders> getReminders() {
        return this.reminders;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return start
     */
    public Start getStart() {
        return this.start;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return uiConfigs
     */
    public java.util.List < UiConfigs> getUiConfigs() {
        return this.uiConfigs;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private java.util.List < Attendees> attendees; 
        private String createTime; 
        private String description; 
        private End end; 
        private String id; 
        private Boolean isAllDay; 
        private Location location; 
        private OnlineMeetingInfo onlineMeetingInfo; 
        private Organizer organizer; 
        private Recurrence recurrence; 
        private java.util.List < Reminders> reminders; 
        private String requestId; 
        private Start start; 
        private String summary; 
        private java.util.List < UiConfigs> uiConfigs; 
        private String updateTime; 

        /**
         * attendees.
         */
        public Builder attendees(java.util.List < Attendees> attendees) {
            this.attendees = attendees;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * end.
         */
        public Builder end(End end) {
            this.end = end;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * isAllDay.
         */
        public Builder isAllDay(Boolean isAllDay) {
            this.isAllDay = isAllDay;
            return this;
        }

        /**
         * location.
         */
        public Builder location(Location location) {
            this.location = location;
            return this;
        }

        /**
         * onlineMeetingInfo.
         */
        public Builder onlineMeetingInfo(OnlineMeetingInfo onlineMeetingInfo) {
            this.onlineMeetingInfo = onlineMeetingInfo;
            return this;
        }

        /**
         * organizer.
         */
        public Builder organizer(Organizer organizer) {
            this.organizer = organizer;
            return this;
        }

        /**
         * recurrence.
         */
        public Builder recurrence(Recurrence recurrence) {
            this.recurrence = recurrence;
            return this;
        }

        /**
         * reminders.
         */
        public Builder reminders(java.util.List < Reminders> reminders) {
            this.reminders = reminders;
            return this;
        }

        /**
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * start.
         */
        public Builder start(Start start) {
            this.start = start;
            return this;
        }

        /**
         * summary.
         */
        public Builder summary(String summary) {
            this.summary = summary;
            return this;
        }

        /**
         * uiConfigs.
         */
        public Builder uiConfigs(java.util.List < UiConfigs> uiConfigs) {
            this.uiConfigs = uiConfigs;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public CreateEventResponseBody build() {
            return new CreateEventResponseBody(this);
        } 

    } 

    public static class Attendees extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("IsOptional")
        private Boolean isOptional;

        @NameInMap("ResponseStatus")
        private String responseStatus;

        @NameInMap("Self")
        private Boolean self;

        private Attendees(Builder builder) {
            this.displayName = builder.displayName;
            this.isOptional = builder.isOptional;
            this.responseStatus = builder.responseStatus;
            this.self = builder.self;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attendees create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return isOptional
         */
        public Boolean getIsOptional() {
            return this.isOptional;
        }

        /**
         * @return responseStatus
         */
        public String getResponseStatus() {
            return this.responseStatus;
        }

        /**
         * @return self
         */
        public Boolean getSelf() {
            return this.self;
        }

        public static final class Builder {
            private String displayName; 
            private Boolean isOptional; 
            private String responseStatus; 
            private Boolean self; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * IsOptional.
             */
            public Builder isOptional(Boolean isOptional) {
                this.isOptional = isOptional;
                return this;
            }

            /**
             * ResponseStatus.
             */
            public Builder responseStatus(String responseStatus) {
                this.responseStatus = responseStatus;
                return this;
            }

            /**
             * Self.
             */
            public Builder self(Boolean self) {
                this.self = self;
                return this;
            }

            public Attendees build() {
                return new Attendees(this);
            } 

        } 

    }
    public static class End extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("DateTime")
        private String dateTime;

        @NameInMap("TimeZone")
        private String timeZone;

        private End(Builder builder) {
            this.date = builder.date;
            this.dateTime = builder.dateTime;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static End create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String date; 
            private String dateTime; 
            private String timeZone; 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * DateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * TimeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public End build() {
                return new End(this);
            } 

        } 

    }
    public static class Location extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        private Location(Builder builder) {
            this.displayName = builder.displayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Location create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        public static final class Builder {
            private String displayName; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    public static class OnlineMeetingInfo extends TeaModel {
        @NameInMap("ConferenceId")
        private String conferenceId;

        @NameInMap("ExtraInfo")
        private java.util.Map < String, ? > extraInfo;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        private OnlineMeetingInfo(Builder builder) {
            this.conferenceId = builder.conferenceId;
            this.extraInfo = builder.extraInfo;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlineMeetingInfo create() {
            return builder().build();
        }

        /**
         * @return conferenceId
         */
        public String getConferenceId() {
            return this.conferenceId;
        }

        /**
         * @return extraInfo
         */
        public java.util.Map < String, ? > getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String conferenceId; 
            private java.util.Map < String, ? > extraInfo; 
            private String type; 
            private String url; 

            /**
             * ConferenceId.
             */
            public Builder conferenceId(String conferenceId) {
                this.conferenceId = conferenceId;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(java.util.Map < String, ? > extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public OnlineMeetingInfo build() {
                return new OnlineMeetingInfo(this);
            } 

        } 

    }
    public static class Organizer extends TeaModel {
        @NameInMap("DisplayName")
        private String displayName;

        @NameInMap("Id")
        private String id;

        @NameInMap("ResponseStatus")
        private String responseStatus;

        @NameInMap("Self")
        private Boolean self;

        private Organizer(Builder builder) {
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.responseStatus = builder.responseStatus;
            this.self = builder.self;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Organizer create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return responseStatus
         */
        public String getResponseStatus() {
            return this.responseStatus;
        }

        /**
         * @return self
         */
        public Boolean getSelf() {
            return this.self;
        }

        public static final class Builder {
            private String displayName; 
            private String id; 
            private String responseStatus; 
            private Boolean self; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * ResponseStatus.
             */
            public Builder responseStatus(String responseStatus) {
                this.responseStatus = responseStatus;
                return this;
            }

            /**
             * Self.
             */
            public Builder self(Boolean self) {
                this.self = self;
                return this;
            }

            public Organizer build() {
                return new Organizer(this);
            } 

        } 

    }
    public static class Pattern extends TeaModel {
        @NameInMap("DayOfMonth")
        private Integer dayOfMonth;

        @NameInMap("DaysOfWeek")
        private String daysOfWeek;

        @NameInMap("Index")
        private String index;

        @NameInMap("Interval")
        private Integer interval;

        @NameInMap("Type")
        private String type;

        private Pattern(Builder builder) {
            this.dayOfMonth = builder.dayOfMonth;
            this.daysOfWeek = builder.daysOfWeek;
            this.index = builder.index;
            this.interval = builder.interval;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pattern create() {
            return builder().build();
        }

        /**
         * @return dayOfMonth
         */
        public Integer getDayOfMonth() {
            return this.dayOfMonth;
        }

        /**
         * @return daysOfWeek
         */
        public String getDaysOfWeek() {
            return this.daysOfWeek;
        }

        /**
         * @return index
         */
        public String getIndex() {
            return this.index;
        }

        /**
         * @return interval
         */
        public Integer getInterval() {
            return this.interval;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Integer dayOfMonth; 
            private String daysOfWeek; 
            private String index; 
            private Integer interval; 
            private String type; 

            /**
             * DayOfMonth.
             */
            public Builder dayOfMonth(Integer dayOfMonth) {
                this.dayOfMonth = dayOfMonth;
                return this;
            }

            /**
             * DaysOfWeek.
             */
            public Builder daysOfWeek(String daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * Index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Pattern build() {
                return new Pattern(this);
            } 

        } 

    }
    public static class Range extends TeaModel {
        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("NumberOfOccurrences")
        private Integer numberOfOccurrences;

        @NameInMap("Type")
        private String type;

        private Range(Builder builder) {
            this.endDate = builder.endDate;
            this.numberOfOccurrences = builder.numberOfOccurrences;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Range create() {
            return builder().build();
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return numberOfOccurrences
         */
        public Integer getNumberOfOccurrences() {
            return this.numberOfOccurrences;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String endDate; 
            private Integer numberOfOccurrences; 
            private String type; 

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * NumberOfOccurrences.
             */
            public Builder numberOfOccurrences(Integer numberOfOccurrences) {
                this.numberOfOccurrences = numberOfOccurrences;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Range build() {
                return new Range(this);
            } 

        } 

    }
    public static class Recurrence extends TeaModel {
        @NameInMap("Pattern")
        private Pattern pattern;

        @NameInMap("Range")
        private Range range;

        private Recurrence(Builder builder) {
            this.pattern = builder.pattern;
            this.range = builder.range;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Recurrence create() {
            return builder().build();
        }

        /**
         * @return pattern
         */
        public Pattern getPattern() {
            return this.pattern;
        }

        /**
         * @return range
         */
        public Range getRange() {
            return this.range;
        }

        public static final class Builder {
            private Pattern pattern; 
            private Range range; 

            /**
             * Pattern.
             */
            public Builder pattern(Pattern pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * Range.
             */
            public Builder range(Range range) {
                this.range = range;
                return this;
            }

            public Recurrence build() {
                return new Recurrence(this);
            } 

        } 

    }
    public static class Reminders extends TeaModel {
        @NameInMap("Method")
        private String method;

        @NameInMap("Minutes")
        private String minutes;

        private Reminders(Builder builder) {
            this.method = builder.method;
            this.minutes = builder.minutes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Reminders create() {
            return builder().build();
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return minutes
         */
        public String getMinutes() {
            return this.minutes;
        }

        public static final class Builder {
            private String method; 
            private String minutes; 

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Minutes.
             */
            public Builder minutes(String minutes) {
                this.minutes = minutes;
                return this;
            }

            public Reminders build() {
                return new Reminders(this);
            } 

        } 

    }
    public static class Start extends TeaModel {
        @NameInMap("Date")
        private String date;

        @NameInMap("DateTime")
        private String dateTime;

        @NameInMap("TimeZone")
        private String timeZone;

        private Start(Builder builder) {
            this.date = builder.date;
            this.dateTime = builder.dateTime;
            this.timeZone = builder.timeZone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Start create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        /**
         * @return timeZone
         */
        public String getTimeZone() {
            return this.timeZone;
        }

        public static final class Builder {
            private String date; 
            private String dateTime; 
            private String timeZone; 

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * DateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * TimeZone.
             */
            public Builder timeZone(String timeZone) {
                this.timeZone = timeZone;
                return this;
            }

            public Start build() {
                return new Start(this);
            } 

        } 

    }
    public static class UiConfigs extends TeaModel {
        @NameInMap("UiName")
        private String uiName;

        @NameInMap("UiStatus")
        private String uiStatus;

        private UiConfigs(Builder builder) {
            this.uiName = builder.uiName;
            this.uiStatus = builder.uiStatus;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UiConfigs create() {
            return builder().build();
        }

        /**
         * @return uiName
         */
        public String getUiName() {
            return this.uiName;
        }

        /**
         * @return uiStatus
         */
        public String getUiStatus() {
            return this.uiStatus;
        }

        public static final class Builder {
            private String uiName; 
            private String uiStatus; 

            /**
             * UiName.
             */
            public Builder uiName(String uiName) {
                this.uiName = uiName;
                return this;
            }

            /**
             * UiStatus.
             */
            public Builder uiStatus(String uiStatus) {
                this.uiStatus = uiStatus;
                return this;
            }

            public UiConfigs build() {
                return new UiConfigs(this);
            } 

        } 

    }
}
