// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListMarketingFlowResponseBody} extends {@link TeaModel}
 *
 * <p>ListMarketingFlowResponseBody</p>
 */
public class ListMarketingFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListMarketingFlowResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMarketingFlowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListMarketingFlowResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The details about the access denial.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The request status code.</p>
         * <ul>
         * <li><p>OK indicates that the request was successful.</p>
         * </li>
         * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data object.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The message returned for the request.</p>
         * 
         * <strong>example:</strong>
         * <p>NULL</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>CB6122C9-09B5-5926-**476A96CB0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li>true: The call was successful.                                 </li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries in the list.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMarketingFlowResponseBody build() {
            return new ListMarketingFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMarketingFlowResponseBody} extends {@link TeaModel}
     *
     * <p>ListMarketingFlowResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityCode")
        private String activityCode;

        @com.aliyun.core.annotation.NameInMap("ActivityDesc")
        private String activityDesc;

        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("ActivityStatus")
        private String activityStatus;

        @com.aliyun.core.annotation.NameInMap("BizCode")
        private String bizCode;

        @com.aliyun.core.annotation.NameInMap("BizExtend")
        private java.util.Map<String, ?> bizExtend;

        @com.aliyun.core.annotation.NameInMap("CronExpression")
        private String cronExpression;

        @com.aliyun.core.annotation.NameInMap("EndDate")
        private String endDate;

        @com.aliyun.core.annotation.NameInMap("ExecutionType")
        private String executionType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModifier")
        private String gmtModifier;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("ParamFlag")
        private String paramFlag;

        @com.aliyun.core.annotation.NameInMap("Params")
        private java.util.Map<String, ?> params;

        @com.aliyun.core.annotation.NameInMap("RelatedFlowCode")
        private String relatedFlowCode;

        @com.aliyun.core.annotation.NameInMap("RelatedFlowName")
        private String relatedFlowName;

        @com.aliyun.core.annotation.NameInMap("RelatedGroupId")
        private String relatedGroupId;

        @com.aliyun.core.annotation.NameInMap("RelatedGroupName")
        private String relatedGroupName;

        @com.aliyun.core.annotation.NameInMap("SpecificTime")
        private String specificTime;

        @com.aliyun.core.annotation.NameInMap("StartDate")
        private String startDate;

        @com.aliyun.core.annotation.NameInMap("TenantCode")
        private String tenantCode;

        private Data(Builder builder) {
            this.activityCode = builder.activityCode;
            this.activityDesc = builder.activityDesc;
            this.activityName = builder.activityName;
            this.activityStatus = builder.activityStatus;
            this.bizCode = builder.bizCode;
            this.bizExtend = builder.bizExtend;
            this.cronExpression = builder.cronExpression;
            this.endDate = builder.endDate;
            this.executionType = builder.executionType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModifier = builder.gmtModifier;
            this.id = builder.id;
            this.paramFlag = builder.paramFlag;
            this.params = builder.params;
            this.relatedFlowCode = builder.relatedFlowCode;
            this.relatedFlowName = builder.relatedFlowName;
            this.relatedGroupId = builder.relatedGroupId;
            this.relatedGroupName = builder.relatedGroupName;
            this.specificTime = builder.specificTime;
            this.startDate = builder.startDate;
            this.tenantCode = builder.tenantCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return activityCode
         */
        public String getActivityCode() {
            return this.activityCode;
        }

        /**
         * @return activityDesc
         */
        public String getActivityDesc() {
            return this.activityDesc;
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return activityStatus
         */
        public String getActivityStatus() {
            return this.activityStatus;
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return bizExtend
         */
        public java.util.Map<String, ?> getBizExtend() {
            return this.bizExtend;
        }

        /**
         * @return cronExpression
         */
        public String getCronExpression() {
            return this.cronExpression;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return executionType
         */
        public String getExecutionType() {
            return this.executionType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModifier
         */
        public String getGmtModifier() {
            return this.gmtModifier;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return paramFlag
         */
        public String getParamFlag() {
            return this.paramFlag;
        }

        /**
         * @return params
         */
        public java.util.Map<String, ?> getParams() {
            return this.params;
        }

        /**
         * @return relatedFlowCode
         */
        public String getRelatedFlowCode() {
            return this.relatedFlowCode;
        }

        /**
         * @return relatedFlowName
         */
        public String getRelatedFlowName() {
            return this.relatedFlowName;
        }

        /**
         * @return relatedGroupId
         */
        public String getRelatedGroupId() {
            return this.relatedGroupId;
        }

        /**
         * @return relatedGroupName
         */
        public String getRelatedGroupName() {
            return this.relatedGroupName;
        }

        /**
         * @return specificTime
         */
        public String getSpecificTime() {
            return this.specificTime;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return tenantCode
         */
        public String getTenantCode() {
            return this.tenantCode;
        }

        public static final class Builder {
            private String activityCode; 
            private String activityDesc; 
            private String activityName; 
            private String activityStatus; 
            private String bizCode; 
            private java.util.Map<String, ?> bizExtend; 
            private String cronExpression; 
            private String endDate; 
            private String executionType; 
            private String gmtCreate; 
            private String gmtModifier; 
            private Long id; 
            private String paramFlag; 
            private java.util.Map<String, ?> params; 
            private String relatedFlowCode; 
            private String relatedFlowName; 
            private String relatedGroupId; 
            private String relatedGroupName; 
            private String specificTime; 
            private String startDate; 
            private String tenantCode; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.activityCode = model.activityCode;
                this.activityDesc = model.activityDesc;
                this.activityName = model.activityName;
                this.activityStatus = model.activityStatus;
                this.bizCode = model.bizCode;
                this.bizExtend = model.bizExtend;
                this.cronExpression = model.cronExpression;
                this.endDate = model.endDate;
                this.executionType = model.executionType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModifier = model.gmtModifier;
                this.id = model.id;
                this.paramFlag = model.paramFlag;
                this.params = model.params;
                this.relatedFlowCode = model.relatedFlowCode;
                this.relatedFlowName = model.relatedFlowName;
                this.relatedGroupId = model.relatedGroupId;
                this.relatedGroupName = model.relatedGroupName;
                this.specificTime = model.specificTime;
                this.startDate = model.startDate;
                this.tenantCode = model.tenantCode;
            } 

            /**
             * <p>The campaign code.</p>
             * 
             * <strong>example:</strong>
             * <p>3243243***</p>
             */
            public Builder activityCode(String activityCode) {
                this.activityCode = activityCode;
                return this;
            }

            /**
             * <p>The campaign description.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder activityDesc(String activityDesc) {
                this.activityDesc = activityDesc;
                return this;
            }

            /**
             * <p>The campaign name.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * <p>The campaign status.</p>
             * 
             * <strong>example:</strong>
             * <p>active</p>
             */
            public Builder activityStatus(String activityStatus) {
                this.activityStatus = activityStatus;
                return this;
            }

            /**
             * <p>The business tenant code. Default value: ALICOM_OPAAS.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * <p>The business extension information. Default value: &quot;{}&quot;.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder bizExtend(java.util.Map<String, ?> bizExtend) {
                this.bizExtend = bizExtend;
                return this;
            }

            /**
             * <p>The upgrade start time. The upgrade start time is specified as a cron expression.</p>
             * <p>For example, <code>0 0 4 1/1 * ?</code> indicates that the upgrade starts at 4:00 on the first day of each month and runs at 4:00 every day.</p>
             * 
             * <strong>example:</strong>
             * <p>0 0 4 1/1 * ?</p>
             */
            public Builder cronExpression(String cronExpression) {
                this.cronExpression = cronExpression;
                return this;
            }

            /**
             * <p>The end time in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-01 XX1:11:11</p>
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * <p>The execution method.</p>
             * 
             * <strong>example:</strong>
             * <p>1(default cron)</p>
             */
            public Builder executionType(String executionType) {
                this.executionType = executionType;
                return this;
            }

            /**
             * <p>The creation time in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-XX-01 11:11:11</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p><strong>[Deprecated]</strong> The modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>N/A</p>
             */
            public Builder gmtModifier(String gmtModifier) {
                this.gmtModifier = gmtModifier;
                return this;
            }

            /**
             * <p>The operational activity ID.</p>
             * 
             * <strong>example:</strong>
             * <p>99</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether custom parameters are enabled.</p>
             * 
             * <strong>example:</strong>
             * <p>Y</p>
             */
            public Builder paramFlag(String paramFlag) {
                this.paramFlag = paramFlag;
                return this;
            }

            /**
             * <p>The custom user parameters.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;CustomerLimit\&quot;:false}</p>
             */
            public Builder params(java.util.Map<String, ?> params) {
                this.params = params;
                return this;
            }

            /**
             * <p>The associated flow code.</p>
             * 
             * <strong>example:</strong>
             * <p>dsafdsf***</p>
             */
            public Builder relatedFlowCode(String relatedFlowCode) {
                this.relatedFlowCode = relatedFlowCode;
                return this;
            }

            /**
             * <p>The name of the associated flow.</p>
             * 
             * <strong>example:</strong>
             * <p>aaa</p>
             */
            public Builder relatedFlowName(String relatedFlowName) {
                this.relatedFlowName = relatedFlowName;
                return this;
            }

            /**
             * <p>The ID of the associated group.</p>
             * 
             * <strong>example:</strong>
             * <p>54354**</p>
             */
            public Builder relatedGroupId(String relatedGroupId) {
                this.relatedGroupId = relatedGroupId;
                return this;
            }

            /**
             * <p>The name of the associated group.</p>
             * 
             * <strong>example:</strong>
             * <p>AAA</p>
             */
            public Builder relatedGroupName(String relatedGroupName) {
                this.relatedGroupName = relatedGroupName;
                return this;
            }

            /**
             * <p>The specific time. This parameter is valid when ExecutionType is set to 2.</p>
             * 
             * <strong>example:</strong>
             * <p>Specific time (when ExecutionType is 2)</p>
             */
            public Builder specificTime(String specificTime) {
                this.specificTime = specificTime;
                return this;
            }

            /**
             * <p>The start time in the YYYY-MM-DD HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-01-XX 11:11:11</p>
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * <p>The tenant.</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder tenantCode(String tenantCode) {
                this.tenantCode = tenantCode;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
