// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMeetingRoomsScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>GetMeetingRoomsScheduleResponseBody</p>
 */
public class GetMeetingRoomsScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scheduleInformation")
    private java.util.List < ScheduleInformation> scheduleInformation;

    private GetMeetingRoomsScheduleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scheduleInformation = builder.scheduleInformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMeetingRoomsScheduleResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scheduleInformation
     */
    public java.util.List < ScheduleInformation> getScheduleInformation() {
        return this.scheduleInformation;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ScheduleInformation> scheduleInformation; 

        /**
         * <p>requestId</p>
         * 
         * <strong>example:</strong>
         * <p>0FAAEC9C-C6C8-5C87-AF8E-1195889BBXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * scheduleInformation.
         */
        public Builder scheduleInformation(java.util.List < ScheduleInformation> scheduleInformation) {
            this.scheduleInformation = scheduleInformation;
            return this;
        }

        public GetMeetingRoomsScheduleResponseBody build() {
            return new GetMeetingRoomsScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMeetingRoomsScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetMeetingRoomsScheduleResponseBody</p>
     */
    public static class End extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private End(Builder builder) {
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
            private String dateTime; 
            private String timeZone; 

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
     * {@link GetMeetingRoomsScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetMeetingRoomsScheduleResponseBody</p>
     */
    public static class Organizer extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private Organizer(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Organizer create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String id; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Organizer build() {
                return new Organizer(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMeetingRoomsScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetMeetingRoomsScheduleResponseBody</p>
     */
    public static class Start extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateTime")
        private String dateTime;

        @com.aliyun.core.annotation.NameInMap("TimeZone")
        private String timeZone;

        private Start(Builder builder) {
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
            private String dateTime; 
            private String timeZone; 

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
    /**
     * 
     * {@link GetMeetingRoomsScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetMeetingRoomsScheduleResponseBody</p>
     */
    public static class ScheduleItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private End end;

        @com.aliyun.core.annotation.NameInMap("EventId")
        private String eventId;

        @com.aliyun.core.annotation.NameInMap("Organizer")
        private Organizer organizer;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Start start;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ScheduleItems(Builder builder) {
            this.end = builder.end;
            this.eventId = builder.eventId;
            this.organizer = builder.organizer;
            this.start = builder.start;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleItems create() {
            return builder().build();
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
         * @return organizer
         */
        public Organizer getOrganizer() {
            return this.organizer;
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

        public static final class Builder {
            private End end; 
            private String eventId; 
            private Organizer organizer; 
            private Start start; 
            private String status; 

            /**
             * End.
             */
            public Builder end(End end) {
                this.end = end;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * Organizer.
             */
            public Builder organizer(Organizer organizer) {
                this.organizer = organizer;
                return this;
            }

            /**
             * Start.
             */
            public Builder start(Start start) {
                this.start = start;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ScheduleItems build() {
                return new ScheduleItems(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMeetingRoomsScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetMeetingRoomsScheduleResponseBody</p>
     */
    public static class ScheduleInformation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("RoomId")
        private String roomId;

        @com.aliyun.core.annotation.NameInMap("ScheduleItems")
        private java.util.List < ScheduleItems> scheduleItems;

        private ScheduleInformation(Builder builder) {
            this.error = builder.error;
            this.roomId = builder.roomId;
            this.scheduleItems = builder.scheduleItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ScheduleInformation create() {
            return builder().build();
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return roomId
         */
        public String getRoomId() {
            return this.roomId;
        }

        /**
         * @return scheduleItems
         */
        public java.util.List < ScheduleItems> getScheduleItems() {
            return this.scheduleItems;
        }

        public static final class Builder {
            private String error; 
            private String roomId; 
            private java.util.List < ScheduleItems> scheduleItems; 

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * RoomId.
             */
            public Builder roomId(String roomId) {
                this.roomId = roomId;
                return this;
            }

            /**
             * ScheduleItems.
             */
            public Builder scheduleItems(java.util.List < ScheduleItems> scheduleItems) {
                this.scheduleItems = scheduleItems;
                return this;
            }

            public ScheduleInformation build() {
                return new ScheduleInformation(this);
            } 

        } 

    }
}
