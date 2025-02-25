// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_cnp20230828.models;

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
 * {@link ListExperimentPlansResponseBody} extends {@link TeaModel}
 *
 * <p>ListExperimentPlansResponseBody</p>
 */
public class ListExperimentPlansResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListExperimentPlansResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListExperimentPlansResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private java.util.List<Data> data; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>Access Denied Detail</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>Data</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>FA9F1DE7-103B-5C18-AE9E-EB2BFF11C685</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Total</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListExperimentPlansResponseBody build() {
            return new ListExperimentPlansResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListExperimentPlansResponseBody} extends {@link TeaModel}
     *
     * <p>ListExperimentPlansResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("PlanId")
        private Long planId;

        @com.aliyun.core.annotation.NameInMap("PlanTaskStatus")
        private java.util.Map<String, Integer> planTaskStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.endTime = builder.endTime;
            this.planId = builder.planId;
            this.planTaskStatus = builder.planTaskStatus;
            this.resourceGroupId = builder.resourceGroupId;
            this.resourceName = builder.resourceName;
            this.startTime = builder.startTime;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return planId
         */
        public Long getPlanId() {
            return this.planId;
        }

        /**
         * @return planTaskStatus
         */
        public java.util.Map<String, Integer> getPlanTaskStatus() {
            return this.planTaskStatus;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String endTime; 
            private Long planId; 
            private java.util.Map<String, Integer> planTaskStatus; 
            private String resourceGroupId; 
            private String resourceName; 
            private String startTime; 
            private Long templateId; 
            private String templateName; 
            private String updateTime; 

            /**
             * <p>Creation Time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-08 10:12:42</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>End Time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-08 10:22:42</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>Plan ID</p>
             * 
             * <strong>example:</strong>
             * <p>189</p>
             */
            public Builder planId(Long planId) {
                this.planId = planId;
                return this;
            }

            /**
             * <p>Test Plan Execution Status</p>
             */
            public Builder planTaskStatus(java.util.Map<String, Integer> planTaskStatus) {
                this.planTaskStatus = planTaskStatus;
                return this;
            }

            /**
             * <p>Resource Group ID</p>
             * 
             * <strong>example:</strong>
             * <p>rg-aek5behqmwbfhuy</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * <p>Associated Resource Name</p>
             * 
             * <strong>example:</strong>
             * <p>q_ecs_xpec_postpay_c</p>
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * <p>Start Time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-08 10:12:42</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>Associated Test Plan Template ID</p>
             * 
             * <strong>example:</strong>
             * <p>6</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>Associated Test Plan Template Name</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>Update Time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-08 10:12:42</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
