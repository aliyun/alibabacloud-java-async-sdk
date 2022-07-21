// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSoundCodeScheduleResponseBody} extends {@link TeaModel}
 *
 * <p>GetSoundCodeScheduleResponseBody</p>
 */
public class GetSoundCodeScheduleResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetSoundCodeScheduleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSoundCodeScheduleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetSoundCodeScheduleResponseBody build() {
            return new GetSoundCodeScheduleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("GmtCreate")
        private Long gmtCreate;

        @NameInMap("Name")
        private String name;

        @NameInMap("OpenType")
        private String openType;

        @NameInMap("ScheduleCode")
        private String scheduleCode;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.description = builder.description;
            this.endDate = builder.endDate;
            this.endTime = builder.endTime;
            this.gmtCreate = builder.gmtCreate;
            this.name = builder.name;
            this.openType = builder.openType;
            this.scheduleCode = builder.scheduleCode;
            this.startDate = builder.startDate;
            this.startTime = builder.startTime;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return openType
         */
        public String getOpenType() {
            return this.openType;
        }

        /**
         * @return scheduleCode
         */
        public String getScheduleCode() {
            return this.scheduleCode;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String description; 
            private String endDate; 
            private String endTime; 
            private Long gmtCreate; 
            private String name; 
            private String openType; 
            private String scheduleCode; 
            private String startDate; 
            private String startTime; 
            private String status; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OpenType.
             */
            public Builder openType(String openType) {
                this.openType = openType;
                return this;
            }

            /**
             * ScheduleCode.
             */
            public Builder scheduleCode(String scheduleCode) {
                this.scheduleCode = scheduleCode;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
