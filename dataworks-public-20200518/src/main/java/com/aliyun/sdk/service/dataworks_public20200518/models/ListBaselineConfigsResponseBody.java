// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1031203110005</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameters are invalid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListBaselineConfigsResponseBody build() {
            return new ListBaselineConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBaselineConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBaselineConfigsResponseBody</p>
     */
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
             * <p>The baseline ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder baselineId(Long baselineId) {
                this.baselineId = baselineId;
                return this;
            }

            /**
             * <p>The name of the baseline.</p>
             * 
             * <strong>example:</strong>
             * <p>Baseline name</p>
             */
            public Builder baselineName(String baselineName) {
                this.baselineName = baselineName;
                return this;
            }

            /**
             * <p>The type of the baseline. Valid values: DAILY and HOURLY.</p>
             * 
             * <strong>example:</strong>
             * <p>DAILY</p>
             */
            public Builder baselineType(String baselineType) {
                this.baselineType = baselineType;
                return this;
            }

            /**
             * <p>The hour in the alerting time of the day-level baseline. Valid values: [0, 47].</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder expHour(Integer expHour) {
                this.expHour = expHour;
                return this;
            }

            /**
             * <p>The minute in the alerting time of the day-level baseline. Valid values: [0, 59].</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder expMinu(Integer expMinu) {
                this.expMinu = expMinu;
                return this;
            }

            /**
             * <p>The alerting time of the hour-level baseline. This parameter is presented as key-value pairs in the JSON format. The key indicates the ID of the cycle, and the value is presented in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;1&quot;:&quot;03:28&quot;,&quot;2&quot;:&quot;04:28&quot;,&quot;3&quot;:&quot;05:28&quot;,&quot;4&quot;:&quot;06:28&quot;,&quot;5&quot;:&quot;07:28&quot;,&quot;6&quot;:&quot;08:28&quot;,&quot;7&quot;:&quot;09:28&quot;,&quot;8&quot;:&quot;10:28&quot;,&quot;9&quot;:&quot;11:28&quot;,&quot;10&quot;:&quot;12:28&quot;,&quot;11&quot;:&quot;13:28&quot;,&quot;12&quot;:&quot;14:28&quot;,&quot;13&quot;:&quot;15:28&quot;,&quot;14&quot;:&quot;16:28&quot;,&quot;15&quot;:&quot;17:28&quot;,&quot;16&quot;:&quot;18:28&quot;,&quot;17&quot;:&quot;19:28&quot;,&quot;18&quot;:&quot;20:28&quot;,&quot;19&quot;:&quot;21:28&quot;,&quot;20&quot;:&quot;22:28&quot;,&quot;21&quot;:&quot;23:28&quot;,&quot;22&quot;:&quot;24:28&quot;,&quot;23&quot;:&quot;25:28&quot;,&quot;24&quot;:&quot;26:28&quot;}</p>
             */
            public Builder hourExpDetail(String hourExpDetail) {
                this.hourExpDetail = hourExpDetail;
                return this;
            }

            /**
             * <p>The committed completion time of the hour-level baseline. This parameter is presented as key-value pairs in the JSON format. The key indicates the ID of the cycle, and the value is presented in the hh:mm format. Valid values of hh: [0,47]. Valid values of mm: [0,59].</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;1&quot;:&quot;03:58&quot;,&quot;2&quot;:&quot;04:58&quot;,&quot;3&quot;:&quot;05:58&quot;,&quot;4&quot;:&quot;06:58&quot;,&quot;5&quot;:&quot;07:58&quot;,&quot;6&quot;:&quot;08:58&quot;,&quot;7&quot;:&quot;09:58&quot;,&quot;8&quot;:&quot;10:58&quot;,&quot;9&quot;:&quot;11:58&quot;,&quot;10&quot;:&quot;12:58&quot;,&quot;11&quot;:&quot;13:58&quot;,&quot;12&quot;:&quot;14:58&quot;,&quot;13&quot;:&quot;15:58&quot;,&quot;14&quot;:&quot;16:58&quot;,&quot;15&quot;:&quot;17:58&quot;,&quot;16&quot;:&quot;18:58&quot;,&quot;17&quot;:&quot;19:58&quot;,&quot;18&quot;:&quot;20:58&quot;,&quot;19&quot;:&quot;21:58&quot;,&quot;20&quot;:&quot;22:58&quot;,&quot;21&quot;:&quot;23:58&quot;,&quot;22&quot;:&quot;24:58&quot;,&quot;23&quot;:&quot;25:58&quot;,&quot;24&quot;:&quot;26:58&quot;}</p>
             */
            public Builder hourSlaDetail(String hourSlaDetail) {
                this.hourSlaDetail = hourSlaDetail;
                return this;
            }

            /**
             * <p>Indicates whether the baseline is a default baseline of the workspace. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDefault(Boolean isDefault) {
                this.isDefault = isDefault;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account used by the baseline owner. Multiple IDs can be specified. The IDs are separated by commas (,).</p>
             * 
             * <strong>example:</strong>
             * <p>952795****</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The priority of the baseline. Valid values: {1,3,5,7,8}.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder priority(Integer priority) {
                this.priority = priority;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the baseline belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>9527</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The hour in the committed completion time of the day-level baseline. Valid values: [0, 47].</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder slaHour(Integer slaHour) {
                this.slaHour = slaHour;
                return this;
            }

            /**
             * <p>The minute in the alerting time of the day-level baseline. Valid values: [0, 59].</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder slaMinu(Integer slaMinu) {
                this.slaMinu = slaMinu;
                return this;
            }

            /**
             * <p>Indicates whether the baseline is enabled. Valid values: true and false.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
    /**
     * 
     * {@link ListBaselineConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBaselineConfigsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Baselines")
        private java.util.List<Baselines> baselines;

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
        public java.util.List<Baselines> getBaselines() {
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
            private java.util.List<Baselines> baselines; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * <p>The baselines.</p>
             */
            public Builder baselines(java.util.List<Baselines> baselines) {
                this.baselines = baselines;
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
             * <p>The total number of baselines returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
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
