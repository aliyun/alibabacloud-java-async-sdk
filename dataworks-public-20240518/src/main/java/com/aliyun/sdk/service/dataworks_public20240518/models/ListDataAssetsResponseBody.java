// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListDataAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDataAssetsResponseBody</p>
 */
public class ListDataAssetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListDataAssetsResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataAssetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListDataAssetsResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0bc1ec92159376</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListDataAssetsResponseBody build() {
            return new ListDataAssetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDataAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAssetsResponseBody</p>
     */
    public static class DataAssetTagMappings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoTraceEnabled")
        private Boolean autoTraceEnabled;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("DataAssetId")
        private String dataAssetId;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("TagSource")
        private String tagSource;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private DataAssetTagMappings(Builder builder) {
            this.autoTraceEnabled = builder.autoTraceEnabled;
            this.creator = builder.creator;
            this.dataAssetId = builder.dataAssetId;
            this.key = builder.key;
            this.tagSource = builder.tagSource;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataAssetTagMappings create() {
            return builder().build();
        }

        /**
         * @return autoTraceEnabled
         */
        public Boolean getAutoTraceEnabled() {
            return this.autoTraceEnabled;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return dataAssetId
         */
        public String getDataAssetId() {
            return this.dataAssetId;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return tagSource
         */
        public String getTagSource() {
            return this.tagSource;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean autoTraceEnabled; 
            private String creator; 
            private String dataAssetId; 
            private String key; 
            private String tagSource; 
            private String value; 

            private Builder() {
            } 

            private Builder(DataAssetTagMappings model) {
                this.autoTraceEnabled = model.autoTraceEnabled;
                this.creator = model.creator;
                this.dataAssetId = model.dataAssetId;
                this.key = model.key;
                this.tagSource = model.tagSource;
                this.value = model.value;
            } 

            /**
             * <p>Indicates whether the lineage-based automatic backtrack feature is enabled for the mapping.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder autoTraceEnabled(Boolean autoTraceEnabled) {
                this.autoTraceEnabled = autoTraceEnabled;
                return this;
            }

            /**
             * <p>The creator of the mapping between the data asset and the tag.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The data asset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7259557313</p>
             */
            public Builder dataAssetId(String dataAssetId) {
                this.dataAssetId = dataAssetId;
                return this;
            }

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>key</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The way in which the mapping between the data asset and the tag is created. Valid values:</p>
             * <ul>
             * <li>System</li>
             * <li>UserDefined</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UserDefined</p>
             */
            public Builder tagSource(String tagSource) {
                this.tagSource = tagSource;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>value</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DataAssetTagMappings build() {
                return new DataAssetTagMappings(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAssetsResponseBody</p>
     */
    public static class DataAssets extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataAssetTagMappings")
        private java.util.List<DataAssetTagMappings> dataAssetTagMappings;

        @com.aliyun.core.annotation.NameInMap("EnvType")
        private String envType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataAssets(Builder builder) {
            this.dataAssetTagMappings = builder.dataAssetTagMappings;
            this.envType = builder.envType;
            this.id = builder.id;
            this.name = builder.name;
            this.projectId = builder.projectId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataAssets create() {
            return builder().build();
        }

        /**
         * @return dataAssetTagMappings
         */
        public java.util.List<DataAssetTagMappings> getDataAssetTagMappings() {
            return this.dataAssetTagMappings;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<DataAssetTagMappings> dataAssetTagMappings; 
            private String envType; 
            private String id; 
            private String name; 
            private Long projectId; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataAssets model) {
                this.dataAssetTagMappings = model.dataAssetTagMappings;
                this.envType = model.envType;
                this.id = model.id;
                this.name = model.name;
                this.projectId = model.projectId;
                this.type = model.type;
            } 

            /**
             * <p>The mappings between data assets and tags.</p>
             */
            public Builder dataAssetTagMappings(java.util.List<DataAssetTagMappings> dataAssetTagMappings) {
                this.dataAssetTagMappings = dataAssetTagMappings;
                return this;
            }

            /**
             * <p>The environment of the workspace to which the data asset belongs. Valid values:</p>
             * <ul>
             * <li>Dev: development environment</li>
             * <li>Prod: production environment</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prod</p>
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * <p>The data asset ID.</p>
             * 
             * <strong>example:</strong>
             * <p>7259557313</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the data asset.</p>
             * 
             * <strong>example:</strong>
             * <p>ali_cn_es_gfn</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The DataWorks workspace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>54275</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The type of the data asset. Valid values:</p>
             * <ul>
             * <li>ACS::DataWorks::Table</li>
             * <li>ACS::DataWorks::Task</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ACS::DataWorks::Task</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataAssets build() {
                return new DataAssets(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListDataAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDataAssetsResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataAssets")
        private java.util.List<DataAssets> dataAssets;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private PagingInfo(Builder builder) {
            this.dataAssets = builder.dataAssets;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return dataAssets
         */
        public java.util.List<DataAssets> getDataAssets() {
            return this.dataAssets;
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
            private java.util.List<DataAssets> dataAssets; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.dataAssets = model.dataAssets;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The data assets.</p>
             */
            public Builder dataAssets(java.util.List<DataAssets> dataAssets) {
                this.dataAssets = dataAssets;
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
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
