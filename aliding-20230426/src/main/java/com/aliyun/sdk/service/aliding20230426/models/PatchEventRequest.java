// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PatchEventRequest} extends {@link RequestModel}
 *
 * <p>PatchEventRequest</p>
 */
public class PatchEventRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Attendees")
    private java.util.List < Attendees> attendees;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CalendarId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String calendarId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CardInstances")
    private java.util.List < CardInstances> cardInstances;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("End")
    private End end;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String eventId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Extra")
    private java.util.Map < String, String > extra;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsAllDay")
    private Boolean isAllDay;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Location")
    private Location location;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Recurrence")
    private Recurrence recurrence;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Reminders")
    private java.util.List < Reminders> reminders;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Start")
    private Start start;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Summary")
    private String summary;

    private PatchEventRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.attendees = builder.attendees;
        this.calendarId = builder.calendarId;
        this.cardInstances = builder.cardInstances;
        this.description = builder.description;
        this.end = builder.end;
        this.eventId = builder.eventId;
        this.extra = builder.extra;
        this.isAllDay = builder.isAllDay;
        this.location = builder.location;
        this.recurrence = builder.recurrence;
        this.reminders = builder.reminders;
        this.start = builder.start;
        this.summary = builder.summary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PatchEventRequest create() {
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
     * @return calendarId
     */
    public String getCalendarId() {
        return this.calendarId;
    }

    /**
     * @return cardInstances
     */
    public java.util.List < CardInstances> getCardInstances() {
        return this.cardInstances;
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
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
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

    public static final class Builder extends Request.Builder<PatchEventRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List < Attendees> attendees; 
        private String calendarId; 
        private java.util.List < CardInstances> cardInstances; 
        private String description; 
        private End end; 
        private String eventId; 
        private java.util.Map < String, String > extra; 
        private Boolean isAllDay; 
        private Location location; 
        private Recurrence recurrence; 
        private java.util.List < Reminders> reminders; 
        private Start start; 
        private String summary; 

        private Builder() {
            super();
        } 

        private Builder(PatchEventRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.attendees = request.attendees;
            this.calendarId = request.calendarId;
            this.cardInstances = request.cardInstances;
            this.description = request.description;
            this.end = request.end;
            this.eventId = request.eventId;
            this.extra = request.extra;
            this.isAllDay = request.isAllDay;
            this.location = request.location;
            this.recurrence = request.recurrence;
            this.reminders = request.reminders;
            this.start = request.start;
            this.summary = request.summary;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>primary</p>
         */
        public Builder calendarId(String calendarId) {
            this.putBodyParameter("CalendarId", calendarId);
            this.calendarId = calendarId;
            return this;
        }

        /**
         * CardInstances.
         */
        public Builder cardInstances(java.util.List < CardInstances> cardInstances) {
            String cardInstancesShrink = shrink(cardInstances, "CardInstances", "json");
            this.putBodyParameter("CardInstances", cardInstancesShrink);
            this.cardInstances = cardInstances;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>iiiP35sJadba8aBSgjrwPRKgiEiF</p>
         */
        public Builder eventId(String eventId) {
            this.putBodyParameter("EventId", eventId);
            this.eventId = eventId;
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
         * Start.
         */
        public Builder start(Start start) {
            String startShrink = shrink(start, "Start", "json");
            this.putBodyParameter("Start", startShrink);
            this.start = start;
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

        @Override
        public PatchEventRequest build() {
            return new PatchEventRequest(this);
        } 

    } 

    /**
     * 
     * {@link PatchEventRequest} extends {@link TeaModel}
     *
     * <p>PatchEventRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
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
    /**
     * 
     * {@link PatchEventRequest} extends {@link TeaModel}
     *
     * <p>PatchEventRequest</p>
     */
    public static class Attendees extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("isOptional")
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
    /**
     * 
     * {@link PatchEventRequest} extends {@link TeaModel}
     *
     * <p>PatchEventRequest</p>
     */
    public static class CardInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutTrackId")
        private String outTrackId;

        @com.aliyun.core.annotation.NameInMap("Scenario")
        private String scenario;

        private CardInstances(Builder builder) {
            this.outTrackId = builder.outTrackId;
            this.scenario = builder.scenario;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CardInstances create() {
            return builder().build();
        }

        /**
         * @return outTrackId
         */
        public String getOutTrackId() {
            return this.outTrackId;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        public static final class Builder {
            private String outTrackId; 
            private String scenario; 

            /**
             * OutTrackId.
             */
            public Builder outTrackId(String outTrackId) {
                this.outTrackId = outTrackId;
                return this;
            }

            /**
             * Scenario.
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            public CardInstances build() {
                return new CardInstances(this);
            } 

        } 

    }
    /**
     * 
     * {@link PatchEventRequest} extends {@link TeaModel}
     *
     * <p>PatchEventRequest</p>
     */
    public static class End extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("dateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("timeZone")
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
    /**
     * 
     * {@link PatchEventRequest} extends {@link TeaModel}
     *
     * <p>PatchEventRequest</p>
     */
    public static class Location extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("displayName")
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
    /**
     * 
     * {@link PatchEventRequest} extends {@link TeaModel}
     *
     * <p>PatchEventRequest</p>
     */
    public static class Pattern extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dayOfMonth")
        private Integer dayOfMonth;

        @com.aliyun.core.annotation.NameInMap("daysOfWeek")
        private String daysOfWeek;

        @com.aliyun.core.annotation.NameInMap("index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("type")
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
    /**
     * 
     * {@link PatchEventRequest} extends {@link TeaModel}
     *
     * <p>PatchEventRequest</p>
     */
    public static class Range extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("endDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("numberOfOccurrences")
        private Integer numberOfOccurrences;

        @com.aliyun.core.annotation.NameInMap("type")
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
    /**
     * 
     * {@link PatchEventRequest} extends {@link TeaModel}
     *
     * <p>PatchEventRequest</p>
     */
    public static class Recurrence extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("pattern")
        private Pattern pattern;

        @com.aliyun.core.annotation.NameInMap("range")
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
    /**
     * 
     * {@link PatchEventRequest} extends {@link TeaModel}
     *
     * <p>PatchEventRequest</p>
     */
    public static class Reminders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("minutes")
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
    /**
     * 
     * {@link PatchEventRequest} extends {@link TeaModel}
     *
     * <p>PatchEventRequest</p>
     */
    public static class Start extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("dateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("timeZone")
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
