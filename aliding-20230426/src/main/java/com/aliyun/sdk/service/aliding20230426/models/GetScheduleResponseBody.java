// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>GetScheduleResponseBody</p>
 */
public class GetScheduleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("scheduleInformation")
    private java.util.List<ScheduleInformation> scheduleInformation;

    @com.aliyun.core.annotation.NameInMap("vendorRequestId")
    private String vendorRequestId;

    @com.aliyun.core.annotation.NameInMap("vendorType")
    private String vendorType;

    private GetScheduleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scheduleInformation = builder.scheduleInformation;
        this.vendorRequestId = builder.vendorRequestId;
        this.vendorType = builder.vendorType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<ScheduleInformation> getScheduleInformation() {
        return this.scheduleInformation;
    }

    /**
     * @return vendorRequestId
     */
    public String getVendorRequestId() {
        return this.vendorRequestId;
    }

    /**
     * @return vendorType
     */
    public String getVendorType() {
        return this.vendorType;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ScheduleInformation> scheduleInformation; 
        private String vendorRequestId; 
        private String vendorType; 

        private Builder() {
        } 

        private Builder(GetScheduleResponseBody model) {
            this.requestId = model.requestId;
            this.scheduleInformation = model.scheduleInformation;
            this.vendorRequestId = model.vendorRequestId;
            this.vendorType = model.vendorType;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * scheduleInformation.
         */
        public Builder scheduleInformation(java.util.List<ScheduleInformation> scheduleInformation) {
            this.scheduleInformation = scheduleInformation;
            return this;
        }

        /**
         * vendorRequestId.
         */
        public Builder vendorRequestId(String vendorRequestId) {
            this.vendorRequestId = vendorRequestId;
            return this;
        }

        /**
         * vendorType.
         */
        public Builder vendorType(String vendorType) {
            this.vendorType = vendorType;
            return this;
        }

        public GetScheduleResponseBody build() {
            return new GetScheduleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduleResponseBody</p>
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

            private Builder() {
            } 

            private Builder(End model) {
                this.date = model.date;
                this.dateTime = model.dateTime;
                this.timeZone = model.timeZone;
            } 

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
     * {@link GetScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduleResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Start model) {
                this.date = model.date;
                this.dateTime = model.dateTime;
                this.timeZone = model.timeZone;
            } 

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
    /**
     * 
     * {@link GetScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduleResponseBody</p>
     */
    public static class ScheduleItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("End")
        private End end;

        @com.aliyun.core.annotation.NameInMap("Start")
        private Start start;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ScheduleItems(Builder builder) {
            this.end = builder.end;
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
            private Start start; 
            private String status; 

            private Builder() {
            } 

            private Builder(ScheduleItems model) {
                this.end = model.end;
                this.start = model.start;
                this.status = model.status;
            } 

            /**
             * End.
             */
            public Builder end(End end) {
                this.end = end;
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
     * {@link GetScheduleResponseBody} extends {@link TeaModel}
     *
     * <p>GetScheduleResponseBody</p>
     */
    public static class ScheduleInformation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("ScheduleItems")
        private java.util.List<ScheduleItems> scheduleItems;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private ScheduleInformation(Builder builder) {
            this.error = builder.error;
            this.scheduleItems = builder.scheduleItems;
            this.userId = builder.userId;
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
         * @return scheduleItems
         */
        public java.util.List<ScheduleItems> getScheduleItems() {
            return this.scheduleItems;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String error; 
            private java.util.List<ScheduleItems> scheduleItems; 
            private String userId; 

            private Builder() {
            } 

            private Builder(ScheduleInformation model) {
                this.error = model.error;
                this.scheduleItems = model.scheduleItems;
                this.userId = model.userId;
            } 

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * ScheduleItems.
             */
            public Builder scheduleItems(java.util.List<ScheduleItems> scheduleItems) {
                this.scheduleItems = scheduleItems;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public ScheduleInformation build() {
                return new ScheduleInformation(this);
            } 

        } 

    }
}
