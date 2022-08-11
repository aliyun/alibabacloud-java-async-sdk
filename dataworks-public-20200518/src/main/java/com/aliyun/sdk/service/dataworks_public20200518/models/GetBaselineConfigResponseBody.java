// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBaselineConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetBaselineConfigResponseBody</p>
 */
public class GetBaselineConfigResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetBaselineConfigResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBaselineConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
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
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        public GetBaselineConfigResponseBody build() {
            return new GetBaselineConfigResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BaselineId")
        private Long baselineId;

        @NameInMap("BaselineName")
        private String baselineName;

        @NameInMap("BaselineType")
        private String baselineType;

        @NameInMap("ExpHour")
        private Integer expHour;

        @NameInMap("ExpMinu")
        private Integer expMinu;

        @NameInMap("HourExpDetail")
        private String hourExpDetail;

        @NameInMap("HourSlaDetail")
        private String hourSlaDetail;

        @NameInMap("IsDefault")
        private Boolean isDefault;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Priority")
        private Integer priority;

        @NameInMap("ProjectId")
        private Long projectId;

        @NameInMap("SlaHour")
        private Integer slaHour;

        @NameInMap("SlaMinu")
        private Integer slaMinu;

        @NameInMap("UseFlag")
        private Boolean useFlag;

        private Data(Builder builder) {
            this.baselineId = builder.baselineId;
            this.baselineName = builder.baselineName;
            this.baselineType = builder.baselineType;
            this.expHour = builder.expHour;
            this.expMinu = builder.expMinu;
            this.hourExpDetail = builder.hourExpDetail;
            this.hourSlaDetail = builder.hourSlaDetail;
            this.isDefault = builder.isDefault;
            this.owner = builder.owner;
            this.priority = builder.priority;
            this.projectId = builder.projectId;
            this.slaHour = builder.slaHour;
            this.slaMinu = builder.slaMinu;
            this.useFlag = builder.useFlag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baselineId
         */
        public Long getBaselineId() {
            return this.baselineId;
        }

        /**
         * @return baselineName
         */
        public String getBaselineName() {
            return this.baselineName;
        }

        /**
         * @return baselineType
         */
        public String getBaselineType() {
            return this.baselineType;
        }

        /**
         * @return expHour
         */
        public Integer getExpHour() {
            return this.expHour;
        }

        /**
         * @return expMinu
         */
        public Integer getExpMinu() {
            return this.expMinu;
        }

        /**
         * @return hourExpDetail
         */
        public String getHourExpDetail() {
            return this.hourExpDetail;
        }

        /**
         * @return hourSlaDetail
         */
        public String getHourSlaDetail() {
            return this.hourSlaDetail;
        }

        /**
         * @return isDefault
         */
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return priority
         */
        public Integer getPriority() {
            return this.priority;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return slaHour
         */
        public Integer getSlaHour() {
            return this.slaHour;
        }

        /**
         * @return slaMinu
         */
        public Integer getSlaMinu() {
            return this.slaMinu;
        }

        /**
         * @return useFlag
         */
        public Boolean getUseFlag() {
            return this.useFlag;
        }

        public static final class Builder {
            private Long baselineId; 
            private String baselineName; 
            private String baselineType; 
            private Integer expHour; 
            private Integer expMinu; 
            private String hourExpDetail; 
            private String hourSlaDetail; 
            private Boolean isDefault; 
            private String owner; 
            private Integer priority; 
            private Long projectId; 
            private Integer slaHour; 
            private Integer slaMinu; 
            private Boolean useFlag; 

            /**
             * BaselineId.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * BaselineName.
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * BaselineType.
             */
            public Builder baselineType(String baselineType) {
                this.baselineType = baselineType;
                return this;
            }

            /**
             * ExpHour.
             */
            public Builder expHour(Integer expHour) {
                this.expHour = expHour;
                return this;
            }

            /**
             * ExpMinu.
             */
            public Builder expMinu(Integer expMinu) {
                this.expMinu = expMinu;
                return this;
            }

            /**
             * HourExpDetail.
             */
            public Builder hourExpDetail(String hourExpDetail) {
                this.hourExpDetail = hourExpDetail;
                return this;
            }

            /**
             * HourSlaDetail.
             */
            public Builder hourSlaDetail(String hourSlaDetail) {
                this.hourSlaDetail = hourSlaDetail;
                return this;
            }

            /**
             * IsDefault.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * Owner.
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * Priority.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * SlaHour.
             */
            public Builder slaHour(Integer slaHour) {
                this.slaHour = slaHour;
                return this;
            }

            /**
             * SlaMinu.
             */
            public Builder slaMinu(Integer slaMinu) {
                this.slaMinu = slaMinu;
                return this;
            }

            /**
             * UseFlag.
             */
            public Builder useFlag(Boolean useFlag) {
                this.useFlag = useFlag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
