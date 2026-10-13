// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link ListMetaProfilingResultCatalogPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetaProfilingResultCatalogPageResponseBody</p>
 */
public class ListMetaProfilingResultCatalogPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("pageIndex")
    private Integer pageIndex;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListMetaProfilingResultCatalogPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.pageIndex = builder.pageIndex;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetaProfilingResultCatalogPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
    }

    /**
     * @return errMessage
     */
    public String getErrMessage() {
        return this.errMessage;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errCode; 
        private String errMessage; 
        private Integer pageIndex; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListMetaProfilingResultCatalogPageResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.pageIndex = model.pageIndex;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * errMessage.
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * pageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListMetaProfilingResultCatalogPageResponseBody build() {
            return new ListMetaProfilingResultCatalogPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListMetaProfilingResultCatalogPageResponseBody} extends {@link TeaModel}
     *
     * <p>ListMetaProfilingResultCatalogPageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("catalogName")
        private String catalogName;

        @com.aliyun.core.annotation.NameInMap("created")
        private String created;

        @com.aliyun.core.annotation.NameInMap("jobId")
        private Long jobId;

        @com.aliyun.core.annotation.NameInMap("lastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("metaDatasourceId")
        private Long metaDatasourceId;

        @com.aliyun.core.annotation.NameInMap("metaDatasourceType")
        private String metaDatasourceType;

        @com.aliyun.core.annotation.NameInMap("migrationProgress")
        private Double migrationProgress;

        @com.aliyun.core.annotation.NameInMap("migrationStatus")
        private String migrationStatus;

        @com.aliyun.core.annotation.NameInMap("partitionCount")
        private Integer partitionCount;

        @com.aliyun.core.annotation.NameInMap("ptTableCount")
        private Integer ptTableCount;

        @com.aliyun.core.annotation.NameInMap("recordCount")
        private Long recordCount;

        @com.aliyun.core.annotation.NameInMap("schemaCount")
        private Integer schemaCount;

        @com.aliyun.core.annotation.NameInMap("storageSize")
        private String storageSize;

        @com.aliyun.core.annotation.NameInMap("tableCount")
        private Integer tableCount;

        @com.aliyun.core.annotation.NameInMap("viewCount")
        private Integer viewCount;

        private Data(Builder builder) {
            this.catalogName = builder.catalogName;
            this.created = builder.created;
            this.jobId = builder.jobId;
            this.lastModified = builder.lastModified;
            this.metaDatasourceId = builder.metaDatasourceId;
            this.metaDatasourceType = builder.metaDatasourceType;
            this.migrationProgress = builder.migrationProgress;
            this.migrationStatus = builder.migrationStatus;
            this.partitionCount = builder.partitionCount;
            this.ptTableCount = builder.ptTableCount;
            this.recordCount = builder.recordCount;
            this.schemaCount = builder.schemaCount;
            this.storageSize = builder.storageSize;
            this.tableCount = builder.tableCount;
            this.viewCount = builder.viewCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return catalogName
         */
        public String getCatalogName() {
            return this.catalogName;
        }

        /**
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return jobId
         */
        public Long getJobId() {
            return this.jobId;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return metaDatasourceId
         */
        public Long getMetaDatasourceId() {
            return this.metaDatasourceId;
        }

        /**
         * @return metaDatasourceType
         */
        public String getMetaDatasourceType() {
            return this.metaDatasourceType;
        }

        /**
         * @return migrationProgress
         */
        public Double getMigrationProgress() {
            return this.migrationProgress;
        }

        /**
         * @return migrationStatus
         */
        public String getMigrationStatus() {
            return this.migrationStatus;
        }

        /**
         * @return partitionCount
         */
        public Integer getPartitionCount() {
            return this.partitionCount;
        }

        /**
         * @return ptTableCount
         */
        public Integer getPtTableCount() {
            return this.ptTableCount;
        }

        /**
         * @return recordCount
         */
        public Long getRecordCount() {
            return this.recordCount;
        }

        /**
         * @return schemaCount
         */
        public Integer getSchemaCount() {
            return this.schemaCount;
        }

        /**
         * @return storageSize
         */
        public String getStorageSize() {
            return this.storageSize;
        }

        /**
         * @return tableCount
         */
        public Integer getTableCount() {
            return this.tableCount;
        }

        /**
         * @return viewCount
         */
        public Integer getViewCount() {
            return this.viewCount;
        }

        public static final class Builder {
            private String catalogName; 
            private String created; 
            private Long jobId; 
            private String lastModified; 
            private Long metaDatasourceId; 
            private String metaDatasourceType; 
            private Double migrationProgress; 
            private String migrationStatus; 
            private Integer partitionCount; 
            private Integer ptTableCount; 
            private Long recordCount; 
            private Integer schemaCount; 
            private String storageSize; 
            private Integer tableCount; 
            private Integer viewCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.catalogName = model.catalogName;
                this.created = model.created;
                this.jobId = model.jobId;
                this.lastModified = model.lastModified;
                this.metaDatasourceId = model.metaDatasourceId;
                this.metaDatasourceType = model.metaDatasourceType;
                this.migrationProgress = model.migrationProgress;
                this.migrationStatus = model.migrationStatus;
                this.partitionCount = model.partitionCount;
                this.ptTableCount = model.ptTableCount;
                this.recordCount = model.recordCount;
                this.schemaCount = model.schemaCount;
                this.storageSize = model.storageSize;
                this.tableCount = model.tableCount;
                this.viewCount = model.viewCount;
            } 

            /**
             * catalogName.
             */
            public Builder catalogName(String catalogName) {
                this.catalogName = catalogName;
                return this;
            }

            /**
             * created.
             */
            public Builder created(String created) {
                this.created = created;
                return this;
            }

            /**
             * jobId.
             */
            public Builder jobId(Long jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * lastModified.
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * metaDatasourceId.
             */
            public Builder metaDatasourceId(Long metaDatasourceId) {
                this.metaDatasourceId = metaDatasourceId;
                return this;
            }

            /**
             * metaDatasourceType.
             */
            public Builder metaDatasourceType(String metaDatasourceType) {
                this.metaDatasourceType = metaDatasourceType;
                return this;
            }

            /**
             * migrationProgress.
             */
            public Builder migrationProgress(Double migrationProgress) {
                this.migrationProgress = migrationProgress;
                return this;
            }

            /**
             * migrationStatus.
             */
            public Builder migrationStatus(String migrationStatus) {
                this.migrationStatus = migrationStatus;
                return this;
            }

            /**
             * partitionCount.
             */
            public Builder partitionCount(Integer partitionCount) {
                this.partitionCount = partitionCount;
                return this;
            }

            /**
             * ptTableCount.
             */
            public Builder ptTableCount(Integer ptTableCount) {
                this.ptTableCount = ptTableCount;
                return this;
            }

            /**
             * recordCount.
             */
            public Builder recordCount(Long recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * schemaCount.
             */
            public Builder schemaCount(Integer schemaCount) {
                this.schemaCount = schemaCount;
                return this;
            }

            /**
             * storageSize.
             */
            public Builder storageSize(String storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * tableCount.
             */
            public Builder tableCount(Integer tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * viewCount.
             */
            public Builder viewCount(Integer viewCount) {
                this.viewCount = viewCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
