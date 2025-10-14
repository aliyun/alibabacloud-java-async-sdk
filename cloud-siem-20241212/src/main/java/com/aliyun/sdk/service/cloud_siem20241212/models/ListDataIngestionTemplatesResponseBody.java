// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link ListDataIngestionTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataIngestionTemplatesResponseBody</p>
 */
public class ListDataIngestionTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataIngestionTemplates")
    private java.util.List<DataIngestionTemplates> dataIngestionTemplates;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataIngestionTemplatesResponseBody(Builder builder) {
        this.dataIngestionTemplates = builder.dataIngestionTemplates;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataIngestionTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataIngestionTemplates
     */
    public java.util.List<DataIngestionTemplates> getDataIngestionTemplates() {
        return this.dataIngestionTemplates;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<DataIngestionTemplates> dataIngestionTemplates; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataIngestionTemplatesResponseBody model) {
            this.dataIngestionTemplates = model.dataIngestionTemplates;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * DataIngestionTemplates.
         */
        public Builder dataIngestionTemplates(java.util.List<DataIngestionTemplates> dataIngestionTemplates) {
            this.dataIngestionTemplates = dataIngestionTemplates;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataIngestionTemplatesResponseBody build() {
            return new ListDataIngestionTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataIngestionTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataIngestionTemplatesResponseBody</p>
     */
    public static class DataIngestionTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityCount")
        private String capacityCount;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataIngestionMode")
        private String dataIngestionMode;

        @com.aliyun.core.annotation.NameInMap("DataIngestionStatus")
        private String dataIngestionStatus;

        @com.aliyun.core.annotation.NameInMap("DataIngestionTemplateId")
        private String dataIngestionTemplateId;

        @com.aliyun.core.annotation.NameInMap("DataIngestionTemplateName")
        private String dataIngestionTemplateName;

        @com.aliyun.core.annotation.NameInMap("DataIngestionTemplateStatus")
        private String dataIngestionTemplateStatus;

        @com.aliyun.core.annotation.NameInMap("DataSourceTemplateId")
        private String dataSourceTemplateId;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleId")
        private String normalizationRuleId;

        @com.aliyun.core.annotation.NameInMap("NormalizationRuleName")
        private String normalizationRuleName;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private DataIngestionTemplates(Builder builder) {
            this.capacityCount = builder.capacityCount;
            this.createTime = builder.createTime;
            this.dataIngestionMode = builder.dataIngestionMode;
            this.dataIngestionStatus = builder.dataIngestionStatus;
            this.dataIngestionTemplateId = builder.dataIngestionTemplateId;
            this.dataIngestionTemplateName = builder.dataIngestionTemplateName;
            this.dataIngestionTemplateStatus = builder.dataIngestionTemplateStatus;
            this.dataSourceTemplateId = builder.dataSourceTemplateId;
            this.normalizationRuleId = builder.normalizationRuleId;
            this.normalizationRuleName = builder.normalizationRuleName;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataIngestionTemplates create() {
            return builder().build();
        }

        /**
         * @return capacityCount
         */
        public String getCapacityCount() {
            return this.capacityCount;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataIngestionMode
         */
        public String getDataIngestionMode() {
            return this.dataIngestionMode;
        }

        /**
         * @return dataIngestionStatus
         */
        public String getDataIngestionStatus() {
            return this.dataIngestionStatus;
        }

        /**
         * @return dataIngestionTemplateId
         */
        public String getDataIngestionTemplateId() {
            return this.dataIngestionTemplateId;
        }

        /**
         * @return dataIngestionTemplateName
         */
        public String getDataIngestionTemplateName() {
            return this.dataIngestionTemplateName;
        }

        /**
         * @return dataIngestionTemplateStatus
         */
        public String getDataIngestionTemplateStatus() {
            return this.dataIngestionTemplateStatus;
        }

        /**
         * @return dataSourceTemplateId
         */
        public String getDataSourceTemplateId() {
            return this.dataSourceTemplateId;
        }

        /**
         * @return normalizationRuleId
         */
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        /**
         * @return normalizationRuleName
         */
        public String getNormalizationRuleName() {
            return this.normalizationRuleName;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String capacityCount; 
            private Long createTime; 
            private String dataIngestionMode; 
            private String dataIngestionStatus; 
            private String dataIngestionTemplateId; 
            private String dataIngestionTemplateName; 
            private String dataIngestionTemplateStatus; 
            private String dataSourceTemplateId; 
            private String normalizationRuleId; 
            private String normalizationRuleName; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(DataIngestionTemplates model) {
                this.capacityCount = model.capacityCount;
                this.createTime = model.createTime;
                this.dataIngestionMode = model.dataIngestionMode;
                this.dataIngestionStatus = model.dataIngestionStatus;
                this.dataIngestionTemplateId = model.dataIngestionTemplateId;
                this.dataIngestionTemplateName = model.dataIngestionTemplateName;
                this.dataIngestionTemplateStatus = model.dataIngestionTemplateStatus;
                this.dataSourceTemplateId = model.dataSourceTemplateId;
                this.normalizationRuleId = model.normalizationRuleId;
                this.normalizationRuleName = model.normalizationRuleName;
                this.updateTime = model.updateTime;
            } 

            /**
             * CapacityCount.
             */
            public Builder capacityCount(String capacityCount) {
                this.capacityCount = capacityCount;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataIngestionMode.
             */
            public Builder dataIngestionMode(String dataIngestionMode) {
                this.dataIngestionMode = dataIngestionMode;
                return this;
            }

            /**
             * DataIngestionStatus.
             */
            public Builder dataIngestionStatus(String dataIngestionStatus) {
                this.dataIngestionStatus = dataIngestionStatus;
                return this;
            }

            /**
             * DataIngestionTemplateId.
             */
            public Builder dataIngestionTemplateId(String dataIngestionTemplateId) {
                this.dataIngestionTemplateId = dataIngestionTemplateId;
                return this;
            }

            /**
             * DataIngestionTemplateName.
             */
            public Builder dataIngestionTemplateName(String dataIngestionTemplateName) {
                this.dataIngestionTemplateName = dataIngestionTemplateName;
                return this;
            }

            /**
             * DataIngestionTemplateStatus.
             */
            public Builder dataIngestionTemplateStatus(String dataIngestionTemplateStatus) {
                this.dataIngestionTemplateStatus = dataIngestionTemplateStatus;
                return this;
            }

            /**
             * DataSourceTemplateId.
             */
            public Builder dataSourceTemplateId(String dataSourceTemplateId) {
                this.dataSourceTemplateId = dataSourceTemplateId;
                return this;
            }

            /**
             * NormalizationRuleId.
             */
            public Builder normalizationRuleId(String normalizationRuleId) {
                this.normalizationRuleId = normalizationRuleId;
                return this;
            }

            /**
             * NormalizationRuleName.
             */
            public Builder normalizationRuleName(String normalizationRuleName) {
                this.normalizationRuleName = normalizationRuleName;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataIngestionTemplates build() {
                return new DataIngestionTemplates(this);
            } 

        } 

    }
}
