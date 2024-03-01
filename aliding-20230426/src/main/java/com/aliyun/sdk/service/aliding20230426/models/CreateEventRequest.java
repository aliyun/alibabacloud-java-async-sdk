// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEventRequest} extends {@link RequestModel}
 *
 * <p>CreateEventRequest</p>
 */
public class CreateEventRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("Attendees")
    private java.util.List < Attendees> attendees;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("End")
    private End end;

    @Body
    @NameInMap("Extra")
    private java.util.Map < String, String > extra;

    @Body
    @NameInMap("IsAllDay")
    private Boolean isAllDay;

    @Body
    @NameInMap("Location")
    private Location location;

    @Body
    @NameInMap("OnlineMeetingInfo")
    private OnlineMeetingInfo onlineMeetingInfo;

    @Body
    @NameInMap("Recurrence")
    private Recurrence recurrence;

    @Body
    @NameInMap("Reminders")
    private java.util.List < Reminders> reminders;

    @Body
    @NameInMap("RichTextDescription")
    private RichTextDescription richTextDescription;

    @Body
    @NameInMap("Summary")
    @Validation(required = true)
    private String summary;

    @Body
    @NameInMap("UiConfigs")
    private java.util.List < UiConfigs> uiConfigs;

    @Body
    @NameInMap("calendarId")
    @Validation(required = true)
    private String calendarId;

    @Body
    @NameInMap("start")
    @Validation(required = true)
    private Start start;

    private CreateEventRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.attendees = builder.attendees;
        this.description = builder.description;
        this.end = builder.end;
        this.extra = builder.extra;
        this.isAllDay = builder.isAllDay;
        this.location = builder.location;
        this.onlineMeetingInfo = builder.onlineMeetingInfo;
        this.recurrence = builder.recurrence;
        this.reminders = builder.reminders;
        this.richTextDescription = builder.richTextDescription;
        this.summary = builder.summary;
        this.uiConfigs = builder.uiConfigs;
        this.calendarId = builder.calendarId;
        this.start = builder.start;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEventRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return attendees
     */
    public java.util.List < Attendees> getAttendees() {
        return this.attendees;
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
     * @return extra
     */
    public java.util.Map < String, String > getExtra() {
        return this.extra;
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
     * @return richTextDescription
     */
    public RichTextDescription getRichTextDescription() {
        return this.richTextDescription;
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
     * @return calendarId
     */
    public String getCalendarId() {
        return this.calendarId;
    }

    /**
     * @return start
     */
    public Start getStart() {
        return this.start;
    }

    public static final class Builder extends Request.Builder<CreateEventRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List < Attendees> attendees; 
        private String description; 
        private End end; 
        private java.util.Map < String, String > extra; 
        private Boolean isAllDay; 
        private Location location; 
        private OnlineMeetingInfo onlineMeetingInfo; 
        private Recurrence recurrence; 
        private java.util.List < Reminders> reminders; 
        private RichTextDescription richTextDescription; 
        private String summary; 
        private java.util.List < UiConfigs> uiConfigs; 
        private String calendarId; 
        private Start start; 

        private Builder() {
            super();
        } 

        private Builder(CreateEventRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.attendees = request.attendees;
            this.description = request.description;
            this.end = request.end;
            this.extra = request.extra;
            this.isAllDay = request.isAllDay;
            this.location = request.location;
            this.onlineMeetingInfo = request.onlineMeetingInfo;
            this.recurrence = request.recurrence;
            this.reminders = request.reminders;
            this.richTextDescription = request.richTextDescription;
            this.summary = request.summary;
            this.uiConfigs = request.uiConfigs;
            this.calendarId = request.calendarId;
            this.start = request.start;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * Attendees.
         */
        public Builder attendees(java.util.List < Attendees> attendees) {
            String attendeesShrink = shrink(attendees, "Attendees", "json");
            this.putBodyParameter("Attendees", attendeesShrink);
            this.attendees = attendees;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * End.
         */
        public Builder end(End end) {
            String endShrink = shrink(end, "End", "json");
            this.putBodyParameter("End", endShrink);
            this.end = end;
            return this;
        }

        /**
         * Extra.
         */
        public Builder extra(java.util.Map < String, String > extra) {
            String extraShrink = shrink(extra, "Extra", "json");
            this.putBodyParameter("Extra", extraShrink);
            this.extra = extra;
            return this;
        }

        /**
         * IsAllDay.
         */
        public Builder isAllDay(Boolean isAllDay) {
            this.putBodyParameter("IsAllDay", isAllDay);
            this.isAllDay = isAllDay;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(Location location) {
            String locationShrink = shrink(location, "Location", "json");
            this.putBodyParameter("Location", locationShrink);
            this.location = location;
            return this;
        }

        /**
         * OnlineMeetingInfo.
         */
        public Builder onlineMeetingInfo(OnlineMeetingInfo onlineMeetingInfo) {
            String onlineMeetingInfoShrink = shrink(onlineMeetingInfo, "OnlineMeetingInfo", "json");
            this.putBodyParameter("OnlineMeetingInfo", onlineMeetingInfoShrink);
            this.onlineMeetingInfo = onlineMeetingInfo;
            return this;
        }

        /**
         * Recurrence.
         */
        public Builder recurrence(Recurrence recurrence) {
            String recurrenceShrink = shrink(recurrence, "Recurrence", "json");
            this.putBodyParameter("Recurrence", recurrenceShrink);
            this.recurrence = recurrence;
            return this;
        }

        /**
         * Reminders.
         */
        public Builder reminders(java.util.List < Reminders> reminders) {
            String remindersShrink = shrink(reminders, "Reminders", "json");
            this.putBodyParameter("Reminders", remindersShrink);
            this.reminders = reminders;
            return this;
        }

        /**
         * RichTextDescription.
         */
        public Builder richTextDescription(RichTextDescription richTextDescription) {
            String richTextDescriptionShrink = shrink(richTextDescription, "RichTextDescription", "json");
            this.putBodyParameter("RichTextDescription", richTextDescriptionShrink);
            this.richTextDescription = richTextDescription;
            return this;
        }

        /**
         * Summary.
         */
        public Builder summary(String summary) {
            this.putBodyParameter("Summary", summary);
            this.summary = summary;
            return this;
        }

        /**
         * UiConfigs.
         */
        public Builder uiConfigs(java.util.List < UiConfigs> uiConfigs) {
            String uiConfigsShrink = shrink(uiConfigs, "UiConfigs", "json");
            this.putBodyParameter("UiConfigs", uiConfigsShrink);
            this.uiConfigs = uiConfigs;
            return this;
        }

        /**
         * calendarId.
         */
        public Builder calendarId(String calendarId) {
            this.putBodyParameter("calendarId", calendarId);
            this.calendarId = calendarId;
            return this;
        }

        /**
         * start.
         */
        public Builder start(Start start) {
            String startShrink = shrink(start, "start", "json");
            this.putBodyParameter("start", startShrink);
            this.start = start;
            return this;
        }

        @Override
        public CreateEventRequest build() {
            return new CreateEventRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("accountId")
        @Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            /**
             * accountId.
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
    public static class Attendees extends TeaModel {
        @NameInMap("id")
        private String id;

        @NameInMap("isOptional")
        private Boolean isOptional;

        private Attendees(Builder builder) {
            this.id = builder.id;
            this.isOptional = builder.isOptional;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attendees create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isOptional
         */
        public Boolean getIsOptional() {
            return this.isOptional;
        }

        public static final class Builder {
            private String id; 
            private Boolean isOptional; 

            /**
             * id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * isOptional.
             */
            public Builder isOptional(Boolean isOptional) {
                this.isOptional = isOptional;
                return this;
            }

            public Attendees build() {
                return new Attendees(this);
            } 

        } 

    }
    public static class End extends TeaModel {
        @NameInMap("date")
        private String date;

        @NameInMap("dateTime")
        private String dateTime;

        @NameInMap("timeZone")
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
             * date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * dateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * timeZone.
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
        @NameInMap("displayName")
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
             * displayName.
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
        @NameInMap("type")
        private String type;

        private OnlineMeetingInfo(Builder builder) {
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OnlineMeetingInfo create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String type; 

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public OnlineMeetingInfo build() {
                return new OnlineMeetingInfo(this);
            } 

        } 

    }
    public static class Pattern extends TeaModel {
        @NameInMap("dayOfMonth")
        private Integer dayOfMonth;

        @NameInMap("daysOfWeek")
        private String daysOfWeek;

        @NameInMap("index")
        private String index;

        @NameInMap("interval")
        private Integer interval;

        @NameInMap("type")
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
             * dayOfMonth.
             */
            public Builder dayOfMonth(Integer dayOfMonth) {
                this.dayOfMonth = dayOfMonth;
                return this;
            }

            /**
             * daysOfWeek.
             */
            public Builder daysOfWeek(String daysOfWeek) {
                this.daysOfWeek = daysOfWeek;
                return this;
            }

            /**
             * index.
             */
            public Builder index(String index) {
                this.index = index;
                return this;
            }

            /**
             * interval.
             */
            public Builder interval(Integer interval) {
                this.interval = interval;
                return this;
            }

            /**
             * type.
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
        @NameInMap("endDate")
        private String endDate;

        @NameInMap("numberOfOccurrences")
        private Integer numberOfOccurrences;

        @NameInMap("type")
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
             * endDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * numberOfOccurrences.
             */
            public Builder numberOfOccurrences(Integer numberOfOccurrences) {
                this.numberOfOccurrences = numberOfOccurrences;
                return this;
            }

            /**
             * type.
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
        @NameInMap("pattern")
        private Pattern pattern;

        @NameInMap("range")
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
             * pattern.
             */
            public Builder pattern(Pattern pattern) {
                this.pattern = pattern;
                return this;
            }

            /**
             * range.
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
        @NameInMap("method")
        private String method;

        @NameInMap("minutes")
        private Integer minutes;

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
        public Integer getMinutes() {
            return this.minutes;
        }

        public static final class Builder {
            private String method; 
            private Integer minutes; 

            /**
             * method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * minutes.
             */
            public Builder minutes(Integer minutes) {
                this.minutes = minutes;
                return this;
            }

            public Reminders build() {
                return new Reminders(this);
            } 

        } 

    }
    public static class RichTextDescription extends TeaModel {
        @NameInMap("text")
        private String text;

        private RichTextDescription(Builder builder) {
            this.text = builder.text;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RichTextDescription create() {
            return builder().build();
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        public static final class Builder {
            private String text; 

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            public RichTextDescription build() {
                return new RichTextDescription(this);
            } 

        } 

    }
    public static class UiConfigs extends TeaModel {
        @NameInMap("uiName")
        private String uiName;

        @NameInMap("uiStatus")
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
             * uiName.
             */
            public Builder uiName(String uiName) {
                this.uiName = uiName;
                return this;
            }

            /**
             * uiStatus.
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
    public static class Start extends TeaModel {
        @NameInMap("date")
        private String date;

        @NameInMap("dateTime")
        private String dateTime;

        @NameInMap("timeZone")
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
             * date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * dateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            /**
             * timeZone.
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
}
