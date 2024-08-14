// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBaselineConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBaselineConfigsResponseBody</p>
 */
public class ListBaselineConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListBaselineConfigsResponseBody(Builder builder) {
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

    public static ListBaselineConfigsResponseBody create() {
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
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The HTTP status code.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListBaselineConfigsResponseBody build() {
            return new ListBaselineConfigsResponseBody(this);
        } 

    } 

    public static class Baselines extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BaselineId")
        private Long baselineId;

        @com.aliyun.core.annotation.NameInMap("BaselineName")
        private String baselineName;

        @com.aliyun.core.annotation.NameInMap("BaselineType")
        private String baselineType;

        @com.aliyun.core.annotation.NameInMap("ExpHour")
        private Integer expHour;

        @com.aliyun.core.annotation.NameInMap("ExpMinu")
        private Integer expMinu;

        @com.aliyun.core.annotation.NameInMap("HourExpDetail")
        private String hourExpDetail;

        @com.aliyun.core.annotation.NameInMap("HourSlaDetail")
        private String hourSlaDetail;

        @com.aliyun.core.annotation.NameInMap("IsDefault")
        private Boolean isDefault;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Priority")
        private Integer priority;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("SlaHour")
        private Integer slaHour;

        @com.aliyun.core.annotation.NameInMap("SlaMinu")
        private Integer slaMinu;

        @com.aliyun.core.annotation.NameInMap("UseFlag")
        private Boolean useFlag;

        private Baselines(Builder builder) {
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

        public static Baselines create() {
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
             * The baseline ID.
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * The name of the baseline.
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * The type of the baseline. Valid values: DAILY and HOURLY.
             */
            public Builder baselineType(String baselineType) {
                this.baselineType = baselineType;
                return this;
            }

            /**
             * The hour in the alerting time of the day-level baseline. Valid values: \[0, 47].
             */
            public Builder expHour(Integer expHour) {
                this.expHour = expHour;
                return this;
            }

            /**
             * The minute in the alerting time of the day-level baseline. Valid values: \[0, 59].
             */
            public Builder expMinu(Integer expMinu) {
                this.expMinu = expMinu;
                return this;
            }

            /**
             * The alerting time of the hour-level baseline. This parameter is presented as key-value pairs in the JSON format. The key indicates the ID of the cycle, and the value is presented in the hh:mm format. Valid values of hh: \[0,47]. Valid values of mm: \[0,59].
             */
            public Builder hourExpDetail(String hourExpDetail) {
                this.hourExpDetail = hourExpDetail;
                return this;
            }

            /**
             * The committed completion time of the hour-level baseline. This parameter is presented as key-value pairs in the JSON format. The key indicates the ID of the cycle, and the value is presented in the hh:mm format. Valid values of hh: \[0,47]. Valid values of mm: \[0,59].
             */
            public Builder hourSlaDetail(String hourSlaDetail) {
                this.hourSlaDetail = hourSlaDetail;
                return this;
            }

            /**
             * Indicates whether the baseline is a default baseline of the workspace. Valid values: true and false.
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs can be specified. The IDs are separated by commas (,).
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * The priority of the baseline. Valid values: {1,3,5,7,8}.
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * The ID of the workspace to which the baseline belongs.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * The hour in the committed completion time of the day-level baseline. Valid values: \[0, 47].
             */
            public Builder slaHour(Integer slaHour) {
                this.slaHour = slaHour;
                return this;
            }

            /**
             * The minute in the alerting time of the day-level baseline. Valid values: \[0, 59].
             */
            public Builder slaMinu(Integer slaMinu) {
                this.slaMinu = slaMinu;
                return this;
            }

            /**
             * Indicates whether the baseline is enabled. Valid values: true and false.
             */
            public Builder useFlag(Boolean useFlag) {
                this.useFlag = useFlag;
                return this;
            }

            public Baselines build() {
                return new Baselines(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Baselines")
        private java.util.List < Baselines> baselines;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.baselines = builder.baselines;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return baselines
         */
        public java.util.List < Baselines> getBaselines() {
            return this.baselines;
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
            private java.util.List < Baselines> baselines; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * The list of baselines.
             */
            public Builder baselines(java.util.List < Baselines> baselines) {
                this.baselines = baselines;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of baselines returned.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
