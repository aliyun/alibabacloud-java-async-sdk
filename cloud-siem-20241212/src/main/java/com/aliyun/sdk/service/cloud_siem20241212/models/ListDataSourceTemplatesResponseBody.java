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
 * {@link ListDataSourceTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataSourceTemplatesResponseBody</p>
 */
public class ListDataSourceTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataSourceTemplates")
    private java.util.List<DataSourceTemplates> dataSourceTemplates;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private String pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private String pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataSourceTemplatesResponseBody(Builder builder) {
        this.dataSourceTemplates = builder.dataSourceTemplates;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataSourceTemplates
     */
    public java.util.List<DataSourceTemplates> getDataSourceTemplates() {
        return this.dataSourceTemplates;
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
        private java.util.List<DataSourceTemplates> dataSourceTemplates; 
        private String pageNumber; 
        private String pageSize; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataSourceTemplatesResponseBody model) {
            this.dataSourceTemplates = model.dataSourceTemplates;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
        } 

        /**
         * DataSourceTemplates.
         */
        public Builder dataSourceTemplates(java.util.List<DataSourceTemplates> dataSourceTemplates) {
            this.dataSourceTemplates = dataSourceTemplates;
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

        public ListDataSourceTemplatesResponseBody build() {
            return new ListDataSourceTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataSourceTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataSourceTemplatesResponseBody</p>
     */
    public static class DataSourceTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoScanNew")
        private String autoScanNew;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSourceFrom")
        private String dataSourceFrom;

        @com.aliyun.core.annotation.NameInMap("DataSourceRecognizeEnabled")
        private Boolean dataSourceRecognizeEnabled;

        @com.aliyun.core.annotation.NameInMap("DataSourceRecognizer")
        private String dataSourceRecognizer;

        @com.aliyun.core.annotation.NameInMap("DataSourceTemplateId")
        private String dataSourceTemplateId;

        @com.aliyun.core.annotation.NameInMap("DataSourceTemplateName")
        private String dataSourceTemplateName;

        @com.aliyun.core.annotation.NameInMap("LogProjectPattern")
        private String logProjectPattern;

        @com.aliyun.core.annotation.NameInMap("LogRegionIds")
        private java.util.List<String> logRegionIds;

        @com.aliyun.core.annotation.NameInMap("LogStorePattern")
        private String logStorePattern;

        @com.aliyun.core.annotation.NameInMap("LogUserIds")
        private java.util.List<String> logUserIds;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private DataSourceTemplates(Builder builder) {
            this.autoScanNew = builder.autoScanNew;
            this.createTime = builder.createTime;
            this.dataSourceFrom = builder.dataSourceFrom;
            this.dataSourceRecognizeEnabled = builder.dataSourceRecognizeEnabled;
            this.dataSourceRecognizer = builder.dataSourceRecognizer;
            this.dataSourceTemplateId = builder.dataSourceTemplateId;
            this.dataSourceTemplateName = builder.dataSourceTemplateName;
            this.logProjectPattern = builder.logProjectPattern;
            this.logRegionIds = builder.logRegionIds;
            this.logStorePattern = builder.logStorePattern;
            this.logUserIds = builder.logUserIds;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSourceTemplates create() {
            return builder().build();
        }

        /**
         * @return autoScanNew
         */
        public String getAutoScanNew() {
            return this.autoScanNew;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSourceFrom
         */
        public String getDataSourceFrom() {
            return this.dataSourceFrom;
        }

        /**
         * @return dataSourceRecognizeEnabled
         */
        public Boolean getDataSourceRecognizeEnabled() {
            return this.dataSourceRecognizeEnabled;
        }

        /**
         * @return dataSourceRecognizer
         */
        public String getDataSourceRecognizer() {
            return this.dataSourceRecognizer;
        }

        /**
         * @return dataSourceTemplateId
         */
        public String getDataSourceTemplateId() {
            return this.dataSourceTemplateId;
        }

        /**
         * @return dataSourceTemplateName
         */
        public String getDataSourceTemplateName() {
            return this.dataSourceTemplateName;
        }

        /**
         * @return logProjectPattern
         */
        public String getLogProjectPattern() {
            return this.logProjectPattern;
        }

        /**
         * @return logRegionIds
         */
        public java.util.List<String> getLogRegionIds() {
            return this.logRegionIds;
        }

        /**
         * @return logStorePattern
         */
        public String getLogStorePattern() {
            return this.logStorePattern;
        }

        /**
         * @return logUserIds
         */
        public java.util.List<String> getLogUserIds() {
            return this.logUserIds;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String autoScanNew; 
            private Long createTime; 
            private String dataSourceFrom; 
            private Boolean dataSourceRecognizeEnabled; 
            private String dataSourceRecognizer; 
            private String dataSourceTemplateId; 
            private String dataSourceTemplateName; 
            private String logProjectPattern; 
            private java.util.List<String> logRegionIds; 
            private String logStorePattern; 
            private java.util.List<String> logUserIds; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(DataSourceTemplates model) {
                this.autoScanNew = model.autoScanNew;
                this.createTime = model.createTime;
                this.dataSourceFrom = model.dataSourceFrom;
                this.dataSourceRecognizeEnabled = model.dataSourceRecognizeEnabled;
                this.dataSourceRecognizer = model.dataSourceRecognizer;
                this.dataSourceTemplateId = model.dataSourceTemplateId;
                this.dataSourceTemplateName = model.dataSourceTemplateName;
                this.logProjectPattern = model.logProjectPattern;
                this.logRegionIds = model.logRegionIds;
                this.logStorePattern = model.logStorePattern;
                this.logUserIds = model.logUserIds;
                this.updateTime = model.updateTime;
            } 

            /**
             * AutoScanNew.
             */
            public Builder autoScanNew(String autoScanNew) {
                this.autoScanNew = autoScanNew;
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
             * DataSourceFrom.
             */
            public Builder dataSourceFrom(String dataSourceFrom) {
                this.dataSourceFrom = dataSourceFrom;
                return this;
            }

            /**
             * DataSourceRecognizeEnabled.
             */
            public Builder dataSourceRecognizeEnabled(Boolean dataSourceRecognizeEnabled) {
                this.dataSourceRecognizeEnabled = dataSourceRecognizeEnabled;
                return this;
            }

            /**
             * DataSourceRecognizer.
             */
            public Builder dataSourceRecognizer(String dataSourceRecognizer) {
                this.dataSourceRecognizer = dataSourceRecognizer;
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
             * DataSourceTemplateName.
             */
            public Builder dataSourceTemplateName(String dataSourceTemplateName) {
                this.dataSourceTemplateName = dataSourceTemplateName;
                return this;
            }

            /**
             * LogProjectPattern.
             */
            public Builder logProjectPattern(String logProjectPattern) {
                this.logProjectPattern = logProjectPattern;
                return this;
            }

            /**
             * LogRegionIds.
             */
            public Builder logRegionIds(java.util.List<String> logRegionIds) {
                this.logRegionIds = logRegionIds;
                return this;
            }

            /**
             * LogStorePattern.
             */
            public Builder logStorePattern(String logStorePattern) {
                this.logStorePattern = logStorePattern;
                return this;
            }

            /**
             * LogUserIds.
             */
            public Builder logUserIds(java.util.List<String> logUserIds) {
                this.logUserIds = logUserIds;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DataSourceTemplates build() {
                return new DataSourceTemplates(this);
            } 

        } 

    }
}
