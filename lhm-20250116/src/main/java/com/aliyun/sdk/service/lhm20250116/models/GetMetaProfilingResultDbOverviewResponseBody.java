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
 * {@link GetMetaProfilingResultDbOverviewResponseBody} extends {@link TeaModel}
 *
 * <p>GetMetaProfilingResultDbOverviewResponseBody</p>
 */
public class GetMetaProfilingResultDbOverviewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("errMessage")
    private String errMessage;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetMetaProfilingResultDbOverviewResponseBody(Builder builder) {
        this.data = builder.data;
        this.errCode = builder.errCode;
        this.errMessage = builder.errMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaProfilingResultDbOverviewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
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
        private String errCode; 
        private String errMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMetaProfilingResultDbOverviewResponseBody model) {
            this.data = model.data;
            this.errCode = model.errCode;
            this.errMessage = model.errMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The data source-level metadata profiling overview object. For more information about each field, see the descriptions of the sub-fields.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. It is an empty string if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message. It is an empty string if the call is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder errMessage(String errMessage) {
            this.errMessage = errMessage;
            return this;
        }

        /**
         * <p>The request ID, which is used to locate and troubleshoot issues related to this call.</p>
         * 
         * <strong>example:</strong>
         * <p>4C467B38-3910-4477-9B0B-6963D83B4E72</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call is successful. Valid values:</p>
         * <ul>
         * <li>true: The call is successful.</li>
         * <li>false: The call failed. If the call fails, troubleshoot the issue based on the errCode and errMessage parameters.</li>
         * </ul>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMetaProfilingResultDbOverviewResponseBody build() {
            return new GetMetaProfilingResultDbOverviewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMetaProfilingResultDbOverviewResponseBody} extends {@link TeaModel}
     *
     * <p>GetMetaProfilingResultDbOverviewResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("catalogCount")
        private Integer catalogCount;

        @com.aliyun.core.annotation.NameInMap("componentId")
        private Long componentId;

        @com.aliyun.core.annotation.NameInMap("componentType")
        private Integer componentType;

        @com.aliyun.core.annotation.NameInMap("dsName")
        private String dsName;

        @com.aliyun.core.annotation.NameInMap("dsVersion")
        private String dsVersion;

        @com.aliyun.core.annotation.NameInMap("etTableCount")
        private Integer etTableCount;

        @com.aliyun.core.annotation.NameInMap("funcCount")
        private Integer funcCount;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("lastModified")
        private String lastModified;

        @com.aliyun.core.annotation.NameInMap("noPtTableCount")
        private Integer noPtTableCount;

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

        @com.aliyun.core.annotation.NameInMap("transactionalCount")
        private Integer transactionalCount;

        @com.aliyun.core.annotation.NameInMap("viewCount")
        private Integer viewCount;

        private Data(Builder builder) {
            this.catalogCount = builder.catalogCount;
            this.componentId = builder.componentId;
            this.componentType = builder.componentType;
            this.dsName = builder.dsName;
            this.dsVersion = builder.dsVersion;
            this.etTableCount = builder.etTableCount;
            this.funcCount = builder.funcCount;
            this.gmtCreate = builder.gmtCreate;
            this.lastModified = builder.lastModified;
            this.noPtTableCount = builder.noPtTableCount;
            this.partitionCount = builder.partitionCount;
            this.ptTableCount = builder.ptTableCount;
            this.recordCount = builder.recordCount;
            this.schemaCount = builder.schemaCount;
            this.storageSize = builder.storageSize;
            this.tableCount = builder.tableCount;
            this.transactionalCount = builder.transactionalCount;
            this.viewCount = builder.viewCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return catalogCount
         */
        public Integer getCatalogCount() {
            return this.catalogCount;
        }

        /**
         * @return componentId
         */
        public Long getComponentId() {
            return this.componentId;
        }

        /**
         * @return componentType
         */
        public Integer getComponentType() {
            return this.componentType;
        }

        /**
         * @return dsName
         */
        public String getDsName() {
            return this.dsName;
        }

        /**
         * @return dsVersion
         */
        public String getDsVersion() {
            return this.dsVersion;
        }

        /**
         * @return etTableCount
         */
        public Integer getEtTableCount() {
            return this.etTableCount;
        }

        /**
         * @return funcCount
         */
        public Integer getFuncCount() {
            return this.funcCount;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return lastModified
         */
        public String getLastModified() {
            return this.lastModified;
        }

        /**
         * @return noPtTableCount
         */
        public Integer getNoPtTableCount() {
            return this.noPtTableCount;
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
         * @return transactionalCount
         */
        public Integer getTransactionalCount() {
            return this.transactionalCount;
        }

        /**
         * @return viewCount
         */
        public Integer getViewCount() {
            return this.viewCount;
        }

        public static final class Builder {
            private Integer catalogCount; 
            private Long componentId; 
            private Integer componentType; 
            private String dsName; 
            private String dsVersion; 
            private Integer etTableCount; 
            private Integer funcCount; 
            private String gmtCreate; 
            private String lastModified; 
            private Integer noPtTableCount; 
            private Integer partitionCount; 
            private Integer ptTableCount; 
            private Long recordCount; 
            private Integer schemaCount; 
            private String storageSize; 
            private Integer tableCount; 
            private Integer transactionalCount; 
            private Integer viewCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.catalogCount = model.catalogCount;
                this.componentId = model.componentId;
                this.componentType = model.componentType;
                this.dsName = model.dsName;
                this.dsVersion = model.dsVersion;
                this.etTableCount = model.etTableCount;
                this.funcCount = model.funcCount;
                this.gmtCreate = model.gmtCreate;
                this.lastModified = model.lastModified;
                this.noPtTableCount = model.noPtTableCount;
                this.partitionCount = model.partitionCount;
                this.ptTableCount = model.ptTableCount;
                this.recordCount = model.recordCount;
                this.schemaCount = model.schemaCount;
                this.storageSize = model.storageSize;
                this.tableCount = model.tableCount;
                this.transactionalCount = model.transactionalCount;
                this.viewCount = model.viewCount;
            } 

            /**
             * <p>The number of catalogs.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder catalogCount(Integer catalogCount) {
                this.catalogCount = catalogCount;
                return this;
            }

            /**
             * <p>The component ID, which is the primary key identifier of the data source component.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder componentId(Long componentId) {
                this.componentId = componentId;
                return this;
            }

            /**
             * <p>The identifier of the data source component type.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder componentType(Integer componentType) {
                this.componentType = componentType;
                return this;
            }

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>ds_demo</p>
             */
            public Builder dsName(String dsName) {
                this.dsName = dsName;
                return this;
            }

            /**
             * <p>The version of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>3.2.0</p>
             */
            public Builder dsVersion(String dsVersion) {
                this.dsVersion = dsVersion;
                return this;
            }

            /**
             * <p>The number of external tables.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder etTableCount(Integer etTableCount) {
                this.etTableCount = etTableCount;
                return this;
            }

            /**
             * <p>The number of functions.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder funcCount(Integer funcCount) {
                this.funcCount = funcCount;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-16T10:00:00Z</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The last modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-07-19 22:00:02</p>
             */
            public Builder lastModified(String lastModified) {
                this.lastModified = lastModified;
                return this;
            }

            /**
             * <p>The number of non-partitioned tables.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder noPtTableCount(Integer noPtTableCount) {
                this.noPtTableCount = noPtTableCount;
                return this;
            }

            /**
             * <p>The number of partitions.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder partitionCount(Integer partitionCount) {
                this.partitionCount = partitionCount;
                return this;
            }

            /**
             * <p>The number of partitioned tables.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder ptTableCount(Integer ptTableCount) {
                this.ptTableCount = ptTableCount;
                return this;
            }

            /**
             * <p>The number of data rows.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder recordCount(Long recordCount) {
                this.recordCount = recordCount;
                return this;
            }

            /**
             * <p>The number of schemas.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder schemaCount(Integer schemaCount) {
                this.schemaCount = schemaCount;
                return this;
            }

            /**
             * <p>The data storage size.</p>
             * 
             * <strong>example:</strong>
             * <p>1.5</p>
             */
            public Builder storageSize(String storageSize) {
                this.storageSize = storageSize;
                return this;
            }

            /**
             * <p>The number of tables.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder tableCount(Integer tableCount) {
                this.tableCount = tableCount;
                return this;
            }

            /**
             * <p>The number of transactional tables.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder transactionalCount(Integer transactionalCount) {
                this.transactionalCount = transactionalCount;
                return this;
            }

            /**
             * <p>The number of views.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
