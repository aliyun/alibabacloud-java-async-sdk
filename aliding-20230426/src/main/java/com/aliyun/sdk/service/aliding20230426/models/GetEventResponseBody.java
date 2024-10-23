// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetEventResponseBody} extends {@link TeaModel}
 *
 * <p>GetEventResponseBody</p>
 */
public class GetEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("attendees")
    private java.util.List < Attendees> attendees;

    @com.aliyun.core.annotation.NameInMap("categories")
    private java.util.List < Categories> categories;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("end")
    private End end;

    @com.aliyun.core.annotation.NameInMap("extendedProperties")
    private ExtendedProperties extendedProperties;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("isAllDay")
    private Boolean isAllDay;

    @com.aliyun.core.annotation.NameInMap("location")
    private Location location;

    @com.aliyun.core.annotation.NameInMap("meetingRooms")
    private java.util.List < MeetingRooms> meetingRooms;

    @com.aliyun.core.annotation.NameInMap("onlineMeetingInfo")
    private OnlineMeetingInfo onlineMeetingInfo;

    @com.aliyun.core.annotation.NameInMap("organizer")
    private Organizer organizer;

    @com.aliyun.core.annotation.NameInMap("originStart")
    private OriginStart originStart;

    @com.aliyun.core.annotation.NameInMap("recurrence")
    private Recurrence recurrence;

    @com.aliyun.core.annotation.NameInMap("reminders")
    private java.util.List < Reminders> reminders;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("richTextDescription")
    private RichTextDescription richTextDescription;

    @com.aliyun.core.annotation.NameInMap("seriesMasterId")
    private String seriesMasterId;

    @com.aliyun.core.annotation.NameInMap("start")
    private Start start;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("summary")
    private String summary;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private String updateTime;

    private GetEventResponseBody(Builder builder) {
        this.attendees = builder.attendees;
        this.categories = builder.categories;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.end = builder.end;
        this.extendedProperties = builder.extendedProperties;
        this.id = builder.id;
        this.isAllDay = builder.isAllDay;
        this.location = builder.location;
        this.meetingRooms = builder.meetingRooms;
        this.onlineMeetingInfo = builder.onlineMeetingInfo;
        this.organizer = builder.organizer;
        this.originStart = builder.originStart;
        this.recurrence = builder.recurrence;
        this.reminders = builder.reminders;
        this.requestId = builder.requestId;
        this.richTextDescription = builder.richTextDescription;
        this.seriesMasterId = builder.seriesMasterId;
        this.start = builder.start;
        this.status = builder.status;
        this.summary = builder.summary;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventResponseBody create() {
        return builder().build();
    }

    /**
     * @return attendees
     */
    public java.util.List < Attendees> getAttendees() {
        return this.attendees;
    }

    /**
     * @return categories
     */
    public java.util.List < Categories> getCategories() {
        return this.categories;
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
     * @return extendedProperties
     */
    public ExtendedProperties getExtendedProperties() {
        return this.extendedProperties;
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
     * @return meetingRooms
     */
    public java.util.List < MeetingRooms> getMeetingRooms() {
        return this.meetingRooms;
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
     * @return originStart
     */
    public OriginStart getOriginStart() {
        return this.originStart;
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
     * @return richTextDescription
     */
    public RichTextDescription getRichTextDescription() {
        return this.richTextDescription;
    }

    /**
     * @return seriesMasterId
     */
    public String getSeriesMasterId() {
        return this.seriesMasterId;
    }

    /**
     * @return start
     */
    public Start getStart() {
        return this.start;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return summary
     */
    public String getSummary() {
        return this.summary;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private java.util.List < Attendees> attendees; 
        private java.util.List < Categories> categories; 
        private String createTime; 
        private String description; 
        private End end; 
        private ExtendedProperties extendedProperties; 
        private String id; 
        private Boolean isAllDay; 
        private Location location; 
        private java.util.List < MeetingRooms> meetingRooms; 
        private OnlineMeetingInfo onlineMeetingInfo; 
        private Organizer organizer; 
        private OriginStart originStart; 
        private Recurrence recurrence; 
        private java.util.List < Reminders> reminders; 
        private String requestId; 
        private RichTextDescription richTextDescription; 
        private String seriesMasterId; 
        private Start start; 
        private String status; 
        private String summary; 
        private String updateTime; 

        /**
         * attendees.
         */
        public Builder attendees(java.util.List < Attendees> attendees) {
            this.attendees = attendees;
            return this;
        }

        /**
         * categories.
         */
        public Builder categories(java.util.List < Categories> categories) {
            this.categories = categories;
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
         * extendedProperties.
         */
        public Builder extendedProperties(ExtendedProperties extendedProperties) {
            this.extendedProperties = extendedProperties;
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
         * meetingRooms.
         */
        public Builder meetingRooms(java.util.List < MeetingRooms> meetingRooms) {
            this.meetingRooms = meetingRooms;
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
         * originStart.
         */
        public Builder originStart(OriginStart originStart) {
            this.originStart = originStart;
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
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>requestId</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * richTextDescription.
         */
        public Builder richTextDescription(RichTextDescription richTextDescription) {
            this.richTextDescription = richTextDescription;
            return this;
        }

        /**
         * seriesMasterId.
         */
        public Builder seriesMasterId(String seriesMasterId) {
            this.seriesMasterId = seriesMasterId;
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
         * status.
         */
        public Builder status(String status) {
            this.status = status;
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
         * updateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public GetEventResponseBody build() {
            return new GetEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class Attendees extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsOptional")
        private Boolean isOptional;

        @com.aliyun.core.annotation.NameInMap("ResponseStatus")
        private String responseStatus;

        @com.aliyun.core.annotation.NameInMap("Self")
        private Boolean self;

        private Attendees(Builder builder) {
            this.displayName = builder.displayName;
            this.id = builder.id;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
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
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class Categories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        private Categories(Builder builder) {
            this.displayName = builder.displayName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
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

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class End extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("DateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
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
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class SharedProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BelongCorpId")
        private String belongCorpId;

        @com.aliyun.core.annotation.NameInMap("SourceOpenCid")
        private String sourceOpenCid;

        private SharedProperties(Builder builder) {
            this.belongCorpId = builder.belongCorpId;
            this.sourceOpenCid = builder.sourceOpenCid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SharedProperties create() {
            return builder().build();
        }

        /**
         * @return belongCorpId
         */
        public String getBelongCorpId() {
            return this.belongCorpId;
        }

        /**
         * @return sourceOpenCid
         */
        public String getSourceOpenCid() {
            return this.sourceOpenCid;
        }

        public static final class Builder {
            private String belongCorpId; 
            private String sourceOpenCid; 

            /**
             * BelongCorpId.
             */
            public Builder belongCorpId(String belongCorpId) {
                this.belongCorpId = belongCorpId;
                return this;
            }

            /**
             * SourceOpenCid.
             */
            public Builder sourceOpenCid(String sourceOpenCid) {
                this.sourceOpenCid = sourceOpenCid;
                return this;
            }

            public SharedProperties build() {
                return new SharedProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class ExtendedProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SharedProperties")
        private SharedProperties sharedProperties;

        private ExtendedProperties(Builder builder) {
            this.sharedProperties = builder.sharedProperties;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendedProperties create() {
            return builder().build();
        }

        /**
         * @return sharedProperties
         */
        public SharedProperties getSharedProperties() {
            return this.sharedProperties;
        }

        public static final class Builder {
            private SharedProperties sharedProperties; 

            /**
             * SharedProperties.
             */
            public Builder sharedProperties(SharedProperties sharedProperties) {
                this.sharedProperties = sharedProperties;
                return this;
            }

            public ExtendedProperties build() {
                return new ExtendedProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class Location extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("MeetingRooms")
        private java.util.List < String > meetingRooms;

        private Location(Builder builder) {
            this.displayName = builder.displayName;
            this.meetingRooms = builder.meetingRooms;
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

        /**
         * @return meetingRooms
         */
        public java.util.List < String > getMeetingRooms() {
            return this.meetingRooms;
        }

        public static final class Builder {
            private String displayName; 
            private java.util.List < String > meetingRooms; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>--</p>
             */
            public Builder meetingRooms(java.util.List < String > meetingRooms) {
                this.meetingRooms = meetingRooms;
                return this;
            }

            public Location build() {
                return new Location(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class MeetingRooms extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("ResponseStatus")
        private String responseStatus;

        @com.aliyun.core.annotation.NameInMap("RoomId")
        private String roomId;

        private MeetingRooms(Builder builder) {
            this.displayName = builder.displayName;
            this.responseStatus = builder.responseStatus;
            this.roomId = builder.roomId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MeetingRooms create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return responseStatus
         */
        public String getResponseStatus() {
            return this.responseStatus;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        public static final class Builder {
            private String displayName; 
            private String responseStatus; 
            private String roomId; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
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
             * RoomId.
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            public MeetingRooms build() {
                return new MeetingRooms(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class OnlineMeetingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConferenceId")
        private String conferenceId;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private java.util.Map < String, ? > extraInfo;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
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
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class Organizer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("ResponseStatus")
        private String responseStatus;

        @com.aliyun.core.annotation.NameInMap("Self")
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
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class OriginStart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateTime")
        private String dateTime;

        private OriginStart(Builder builder) {
            this.dateTime = builder.dateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OriginStart create() {
            return builder().build();
        }

        /**
         * @return dateTime
         */
        public String getDateTime() {
            return this.dateTime;
        }

        public static final class Builder {
            private String dateTime; 

            /**
             * DateTime.
             */
            public Builder dateTime(String dateTime) {
                this.dateTime = dateTime;
                return this;
            }

            public OriginStart build() {
                return new OriginStart(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class Pattern extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DayOfMonth")
        private Integer dayOfMonth;

        @com.aliyun.core.annotation.NameInMap("DaysOfWeek")
        private String daysOfWeek;

        @com.aliyun.core.annotation.NameInMap("Index")
        private String index;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private Integer interval;

        @com.aliyun.core.annotation.NameInMap("Type")
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
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class Range extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("NumberOfOccurrences")
        private Integer numberOfOccurrences;

        @com.aliyun.core.annotation.NameInMap("Type")
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
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class Recurrence extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Pattern")
        private Pattern pattern;

        @com.aliyun.core.annotation.NameInMap("Range")
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
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class Reminders extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Minutes")
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
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class RichTextDescription extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Text")
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
             * Text.
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
    /**
     * 
     * {@link GetEventResponseBody} extends {@link TeaModel}
     *
     * <p>GetEventResponseBody</p>
     */
    public static class Start extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("DateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
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
}
