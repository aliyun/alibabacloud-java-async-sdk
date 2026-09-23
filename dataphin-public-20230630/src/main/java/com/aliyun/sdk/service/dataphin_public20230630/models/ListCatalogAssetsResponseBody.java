// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ListCatalogAssetsResponseBody} extends {@link TeaModel}
 *
 * <p>ListCatalogAssetsResponseBody</p>
 */
public class ListCatalogAssetsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListCatalogAssetsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCatalogAssetsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListCatalogAssetsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data catalog asset list.</p>
         */
        public Builder data(Data data) {
            this.data = data;
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
         * <p>The backend response exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListCatalogAssetsResponseBody build() {
            return new ListCatalogAssetsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListCatalogAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCatalogAssetsResponseBody</p>
     */
    public static class Directories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DirectoryId")
        private Long directoryId;

        @com.aliyun.core.annotation.NameInMap("DirectoryName")
        private String directoryName;

        @com.aliyun.core.annotation.NameInMap("TopicId")
        private Long topicId;

        @com.aliyun.core.annotation.NameInMap("TopicName")
        private String topicName;

        private Directories(Builder builder) {
            this.directoryId = builder.directoryId;
            this.directoryName = builder.directoryName;
            this.topicId = builder.topicId;
            this.topicName = builder.topicName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Directories create() {
            return builder().build();
        }

        /**
         * @return directoryId
         */
        public Long getDirectoryId() {
            return this.directoryId;
        }

        /**
         * @return directoryName
         */
        public String getDirectoryName() {
            return this.directoryName;
        }

        /**
         * @return topicId
         */
        public Long getTopicId() {
            return this.topicId;
        }

        /**
         * @return topicName
         */
        public String getTopicName() {
            return this.topicName;
        }

        public static final class Builder {
            private Long directoryId; 
            private String directoryName; 
            private Long topicId; 
            private String topicName; 

            private Builder() {
            } 

            private Builder(Directories model) {
                this.directoryId = model.directoryId;
                this.directoryName = model.directoryName;
                this.topicId = model.topicId;
                this.topicName = model.topicName;
            } 

            /**
             * <p>The ID of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>102260</p>
             */
            public Builder directoryId(Long directoryId) {
                this.directoryId = directoryId;
                return this;
            }

            /**
             * <p>The name of the directory.</p>
             * 
             * <strong>example:</strong>
             * <p>Online E-commerce Platform</p>
             */
            public Builder directoryName(String directoryName) {
                this.directoryName = directoryName;
                return this;
            }

            /**
             * <p>The ID of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>101676</p>
             */
            public Builder topicId(Long topicId) {
                this.topicId = topicId;
                return this;
            }

            /**
             * <p>The name of the topic.</p>
             * 
             * <strong>example:</strong>
             * <p>Omni-channel Data Topic</p>
             */
            public Builder topicName(String topicName) {
                this.topicName = topicName;
                return this;
            }

            public Directories build() {
                return new Directories(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCatalogAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCatalogAssetsResponseBody</p>
     */
    public static class AssetList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiCallMode")
        private String apiCallMode;

        @com.aliyun.core.annotation.NameInMap("ApiGroupName")
        private String apiGroupName;

        @com.aliyun.core.annotation.NameInMap("ApiId")
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("ApiRequestMethod")
        private String apiRequestMethod;

        @com.aliyun.core.annotation.NameInMap("AssetDescription")
        private String assetDescription;

        @com.aliyun.core.annotation.NameInMap("AssetDisplayName")
        private String assetDisplayName;

        @com.aliyun.core.annotation.NameInMap("AssetFrom")
        private String assetFrom;

        @com.aliyun.core.annotation.NameInMap("AssetFullName")
        private String assetFullName;

        @com.aliyun.core.annotation.NameInMap("AssetName")
        private String assetName;

        @com.aliyun.core.annotation.NameInMap("AssetTags")
        private java.util.List<String> assetTags;

        @com.aliyun.core.annotation.NameInMap("AssetType")
        private String assetType;

        @com.aliyun.core.annotation.NameInMap("BiCatalog")
        private String biCatalog;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("BizUnitName")
        private String bizUnitName;

        @com.aliyun.core.annotation.NameInMap("ChartCount")
        private Long chartCount;

        @com.aliyun.core.annotation.NameInMap("DataCellId")
        private String dataCellId;

        @com.aliyun.core.annotation.NameInMap("DataCellName")
        private String dataCellName;

        @com.aliyun.core.annotation.NameInMap("DataSourceName")
        private String dataSourceName;

        @com.aliyun.core.annotation.NameInMap("DatasourceId")
        private Long datasourceId;

        @com.aliyun.core.annotation.NameInMap("Directories")
        private java.util.List<Directories> directories;

        @com.aliyun.core.annotation.NameInMap("Granularity")
        private String granularity;

        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        @com.aliyun.core.annotation.NameInMap("IsDeleted")
        private Boolean isDeleted;

        @com.aliyun.core.annotation.NameInMap("MaxSecurityLevel")
        private String maxSecurityLevel;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        @com.aliyun.core.annotation.NameInMap("SubType")
        private String subType;

        @com.aliyun.core.annotation.NameInMap("SumTableGuid")
        private String sumTableGuid;

        @com.aliyun.core.annotation.NameInMap("SumTableName")
        private String sumTableName;

        private AssetList(Builder builder) {
            this.apiCallMode = builder.apiCallMode;
            this.apiGroupName = builder.apiGroupName;
            this.apiId = builder.apiId;
            this.apiRequestMethod = builder.apiRequestMethod;
            this.assetDescription = builder.assetDescription;
            this.assetDisplayName = builder.assetDisplayName;
            this.assetFrom = builder.assetFrom;
            this.assetFullName = builder.assetFullName;
            this.assetName = builder.assetName;
            this.assetTags = builder.assetTags;
            this.assetType = builder.assetType;
            this.biCatalog = builder.biCatalog;
            this.bizUnitId = builder.bizUnitId;
            this.bizUnitName = builder.bizUnitName;
            this.chartCount = builder.chartCount;
            this.dataCellId = builder.dataCellId;
            this.dataCellName = builder.dataCellName;
            this.dataSourceName = builder.dataSourceName;
            this.datasourceId = builder.datasourceId;
            this.directories = builder.directories;
            this.granularity = builder.granularity;
            this.guid = builder.guid;
            this.isDeleted = builder.isDeleted;
            this.maxSecurityLevel = builder.maxSecurityLevel;
            this.projectId = builder.projectId;
            this.projectName = builder.projectName;
            this.subType = builder.subType;
            this.sumTableGuid = builder.sumTableGuid;
            this.sumTableName = builder.sumTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AssetList create() {
            return builder().build();
        }

        /**
         * @return apiCallMode
         */
        public String getApiCallMode() {
            return this.apiCallMode;
        }

        /**
         * @return apiGroupName
         */
        public String getApiGroupName() {
            return this.apiGroupName;
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return apiRequestMethod
         */
        public String getApiRequestMethod() {
            return this.apiRequestMethod;
        }

        /**
         * @return assetDescription
         */
        public String getAssetDescription() {
            return this.assetDescription;
        }

        /**
         * @return assetDisplayName
         */
        public String getAssetDisplayName() {
            return this.assetDisplayName;
        }

        /**
         * @return assetFrom
         */
        public String getAssetFrom() {
            return this.assetFrom;
        }

        /**
         * @return assetFullName
         */
        public String getAssetFullName() {
            return this.assetFullName;
        }

        /**
         * @return assetName
         */
        public String getAssetName() {
            return this.assetName;
        }

        /**
         * @return assetTags
         */
        public java.util.List<String> getAssetTags() {
            return this.assetTags;
        }

        /**
         * @return assetType
         */
        public String getAssetType() {
            return this.assetType;
        }

        /**
         * @return biCatalog
         */
        public String getBiCatalog() {
            return this.biCatalog;
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return bizUnitName
         */
        public String getBizUnitName() {
            return this.bizUnitName;
        }

        /**
         * @return chartCount
         */
        public Long getChartCount() {
            return this.chartCount;
        }

        /**
         * @return dataCellId
         */
        public String getDataCellId() {
            return this.dataCellId;
        }

        /**
         * @return dataCellName
         */
        public String getDataCellName() {
            return this.dataCellName;
        }

        /**
         * @return dataSourceName
         */
        public String getDataSourceName() {
            return this.dataSourceName;
        }

        /**
         * @return datasourceId
         */
        public Long getDatasourceId() {
            return this.datasourceId;
        }

        /**
         * @return directories
         */
        public java.util.List<Directories> getDirectories() {
            return this.directories;
        }

        /**
         * @return granularity
         */
        public String getGranularity() {
            return this.granularity;
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        /**
         * @return isDeleted
         */
        public Boolean getIsDeleted() {
            return this.isDeleted;
        }

        /**
         * @return maxSecurityLevel
         */
        public String getMaxSecurityLevel() {
            return this.maxSecurityLevel;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return sumTableGuid
         */
        public String getSumTableGuid() {
            return this.sumTableGuid;
        }

        /**
         * @return sumTableName
         */
        public String getSumTableName() {
            return this.sumTableName;
        }

        public static final class Builder {
            private String apiCallMode; 
            private String apiGroupName; 
            private Long apiId; 
            private String apiRequestMethod; 
            private String assetDescription; 
            private String assetDisplayName; 
            private String assetFrom; 
            private String assetFullName; 
            private String assetName; 
            private java.util.List<String> assetTags; 
            private String assetType; 
            private String biCatalog; 
            private Long bizUnitId; 
            private String bizUnitName; 
            private Long chartCount; 
            private String dataCellId; 
            private String dataCellName; 
            private String dataSourceName; 
            private Long datasourceId; 
            private java.util.List<Directories> directories; 
            private String granularity; 
            private String guid; 
            private Boolean isDeleted; 
            private String maxSecurityLevel; 
            private Long projectId; 
            private String projectName; 
            private String subType; 
            private String sumTableGuid; 
            private String sumTableName; 

            private Builder() {
            } 

            private Builder(AssetList model) {
                this.apiCallMode = model.apiCallMode;
                this.apiGroupName = model.apiGroupName;
                this.apiId = model.apiId;
                this.apiRequestMethod = model.apiRequestMethod;
                this.assetDescription = model.assetDescription;
                this.assetDisplayName = model.assetDisplayName;
                this.assetFrom = model.assetFrom;
                this.assetFullName = model.assetFullName;
                this.assetName = model.assetName;
                this.assetTags = model.assetTags;
                this.assetType = model.assetType;
                this.biCatalog = model.biCatalog;
                this.bizUnitId = model.bizUnitId;
                this.bizUnitName = model.bizUnitName;
                this.chartCount = model.chartCount;
                this.dataCellId = model.dataCellId;
                this.dataCellName = model.dataCellName;
                this.dataSourceName = model.dataSourceName;
                this.datasourceId = model.datasourceId;
                this.directories = model.directories;
                this.granularity = model.granularity;
                this.guid = model.guid;
                this.isDeleted = model.isDeleted;
                this.maxSecurityLevel = model.maxSecurityLevel;
                this.projectId = model.projectId;
                this.projectName = model.projectName;
                this.subType = model.subType;
                this.sumTableGuid = model.sumTableGuid;
                this.sumTableName = model.sumTableName;
            } 

            /**
             * <p>The API call mode. Returned when the asset type is API. Valid values:</p>
             * <ul>
             * <li>1: Synchronous call.</li>
             * <li>2: Asynchronous call.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder apiCallMode(String apiCallMode) {
                this.apiCallMode = apiCallMode;
                return this;
            }

            /**
             * <p>The API group name. Returned when the asset type is API.</p>
             * 
             * <strong>example:</strong>
             * <p>Default API Group</p>
             */
            public Builder apiGroupName(String apiGroupName) {
                this.apiGroupName = apiGroupName;
                return this;
            }

            /**
             * <p>The API ID. Returned when the asset type is API.</p>
             * 
             * <strong>example:</strong>
             * <p>10441</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The API operation type. Returned when the asset type is API. Valid values:</p>
             * <ul>
             * <li>1: Get.</li>
             * <li>2: List.</li>
             * <li>3: Create.</li>
             * <li>4: Update.</li>
             * <li>5: Delete.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder apiRequestMethod(String apiRequestMethod) {
                this.apiRequestMethod = apiRequestMethod;
                return this;
            }

            /**
             * <p>The description of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder assetDescription(String assetDescription) {
                this.assetDescription = assetDescription;
                return this;
            }

            /**
             * <p>The display name of the asset. This parameter is returned when the asset type is TABLE, INDEX, or BIZ_INDEX.</p>
             * 
             * <strong>example:</strong>
             * <p>abc table</p>
             */
            public Builder assetDisplayName(String assetDisplayName) {
                this.assetDisplayName = assetDisplayName;
                return this;
            }

            /**
             * <p>The source of the asset. For TABLE (physical table), the value is returned in the format of &quot;Dataphin-Workspace Type-Project Chinese Name (Project English Name)&quot;. For TABLE (logical table), the value is returned in the format of &quot;Dataphin-Workspace Type-Data Domain Chinese Name (Data Domain English Name)&quot;. For TABLE (data source table), the value is returned in the format of &quot;Source System Name-Data Source Name-Database/Schema Name&quot;. For INDEX (standard modeling metric), the value is the asset source of the associated aggregate table. For INDEX (custom metric), the value is the asset source of the source table. For API, the value is the data service project name. For PAGE, the value is the application system name.</p>
             * 
             * <strong>example:</strong>
             * <p>Dataphin-Middle Layer-Fashion Retail (LD_Fashion)</p>
             */
            public Builder assetFrom(String assetFrom) {
                this.assetFrom = assetFrom;
                return this;
            }

            /**
             * <p>The full name of the asset. This parameter is returned when the asset type is TABLE or INDEX.</p>
             * 
             * <strong>example:</strong>
             * <p>dwd_all.abc</p>
             */
            public Builder assetFullName(String assetFullName) {
                this.assetFullName = assetFullName;
                return this;
            }

            /**
             * <p>The name of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder assetName(String assetName) {
                this.assetName = assetName;
                return this;
            }

            /**
             * <p>The tags of the asset.</p>
             */
            public Builder assetTags(java.util.List<String> assetTags) {
                this.assetTags = assetTags;
                return this;
            }

            /**
             * <p>The asset type. Valid values:</p>
             * <ul>
             * <li>TABLE: table, including views and materialized views.</li>
             * <li>INDEX: technical metric.</li>
             * <li>BIZ_INDEX: business metric.</li>
             * <li>API: API.</li>
             * <li>PAGE: dashboard.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TABLE</p>
             */
            public Builder assetType(String assetType) {
                this.assetType = assetType;
                return this;
            }

            /**
             * <p>The BI space or folder to which the asset belongs. Returned when the asset type is PAGE (dashboard).</p>
             * 
             * <strong>example:</strong>
             * <p>dataphin demo space</p>
             */
            public Builder biCatalog(String biCatalog) {
                this.biCatalog = biCatalog;
                return this;
            }

            /**
             * <p>The ID of the business unit to which the asset belongs. This parameter is returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>6865277495315392</p>
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * <p>The name of the business unit to which the asset belongs. This parameter is returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>Fashion Retail (LD_Fashion)</p>
             */
            public Builder bizUnitName(String bizUnitName) {
                this.bizUnitName = bizUnitName;
                return this;
            }

            /**
             * <p>The total number of charts. Returned when the asset type is PAGE (dashboard).</p>
             * 
             * <strong>example:</strong>
             * <p>23</p>
             */
            public Builder chartCount(Long chartCount) {
                this.chartCount = chartCount;
                return this;
            }

            /**
             * <p>The ID of the data domain to which the asset belongs. This parameter is returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>49837403</p>
             */
            public Builder dataCellId(String dataCellId) {
                this.dataCellId = dataCellId;
                return this;
            }

            /**
             * <p>The name of the data domain to which the asset belongs. Returned when the asset type is TABLE (logical tables only) or INDEX (technical metrics whose source table is a logical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>Course Domain</p>
             */
            public Builder dataCellName(String dataCellName) {
                this.dataCellName = dataCellName;
                return this;
            }

            /**
             * <p>The name of the data source to which the asset belongs. This parameter is returned when the asset type is TABLE (data source tables only) or INDEX (technical metrics whose source table is a data source table only).</p>
             * 
             * <strong>example:</strong>
             * <p>demo_mysql</p>
             */
            public Builder dataSourceName(String dataSourceName) {
                this.dataSourceName = dataSourceName;
                return this;
            }

            /**
             * <p>The ID of the data source to which the asset belongs. This parameter is returned when the asset type is TABLE (data source tables only) or INDEX (technical metrics whose source table is a data source table only).</p>
             * 
             * <strong>example:</strong>
             * <p>7305549302863001856</p>
             */
            public Builder datasourceId(Long datasourceId) {
                this.datasourceId = datasourceId;
                return this;
            }

            /**
             * <p>The directories to which the asset belongs, including topic ID, topic name, directory ID, and directory name.</p>
             */
            public Builder directories(java.util.List<Directories> directories) {
                this.directories = directories;
                return this;
            }

            /**
             * <p>The statistical granularity name of the technical metric. This parameter is returned when the asset type is INDEX.</p>
             * 
             * <strong>example:</strong>
             * <p>Course</p>
             */
            public Builder granularity(String granularity) {
                this.granularity = granularity;
                return this;
            }

            /**
             * <p>The GUID of the asset, which serves as the unique identifier of the asset.</p>
             * 
             * <strong>example:</strong>
             * <p>dp_ds_table.300023201.7311626611751680256.load_test.abc</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            /**
             * <p>Indicates whether the asset is deleted.</p>
             */
            public Builder isDeleted(Boolean isDeleted) {
                this.isDeleted = isDeleted;
                return this;
            }

            /**
             * <p>The maximum sensitivity level. This parameter is returned when the asset type is TABLE.</p>
             * 
             * <strong>example:</strong>
             * <p>L3</p>
             */
            public Builder maxSecurityLevel(String maxSecurityLevel) {
                this.maxSecurityLevel = maxSecurityLevel;
                return this;
            }

            /**
             * <p>The ID of the project to which the asset belongs. This parameter is returned when the asset type is TABLE (physical tables only) or INDEX (technical metrics whose source table is a physical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>6865331517728384</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The name of the project to which the asset belongs. This parameter is returned when the asset type is TABLE (physical tables only) or INDEX (technical metrics whose source table is a physical table only).</p>
             * 
             * <strong>example:</strong>
             * <p>train</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            /**
             * <p>The subtype of the asset. Valid values:</p>
             * <ul>
             * <li>DIM_NORMAL: common logical dimension table.</li>
             * <li>DIM_ENUM: enumeration logical dimension table.</li>
             * <li>DIM_VIRTUAL: virtual logical dimension table.</li>
             * <li>SUM_BIZ_UNIT: aggregate table.</li>
             * <li>FACT_EVENT: event fact logical table.</li>
             * <li>FACT_SNAPSHOT: snapshot fact logical table.</li>
             * <li>DATASOURCE_TABLE: data source table.</li>
             * <li>PHYSICAL_TABLE: physical table.</li>
             * <li>DATASOURCE_VIEW: view (data source view).</li>
             * <li>PHYSICAL_VIEW: physical view.</li>
             * <li>MATERIALIZED_VIEW: materialized view.</li>
             * <li>BIZ_INDEX: business metric.</li>
             * <li>INDEX: technical metric (standard modeling metric).</li>
             * <li>CUSTOM_INDEX: technical metric (custom metric).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>DIM_NORMAL</p>
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * <p>The GUID of the aggregate table to which the asset belongs. This parameter is returned when the asset type is INDEX.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.300023201.test.ads_gross</p>
             */
            public Builder sumTableGuid(String sumTableGuid) {
                this.sumTableGuid = sumTableGuid;
                return this;
            }

            /**
             * <p>The name of the aggregate table to which the asset belongs. This parameter is returned when the asset type is INDEX.</p>
             * 
             * <strong>example:</strong>
             * <p>ads_gross</p>
             */
            public Builder sumTableName(String sumTableName) {
                this.sumTableName = sumTableName;
                return this;
            }

            public AssetList build() {
                return new AssetList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListCatalogAssetsResponseBody} extends {@link TeaModel}
     *
     * <p>ListCatalogAssetsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetList")
        private java.util.List<AssetList> assetList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.assetList = builder.assetList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return assetList
         */
        public java.util.List<AssetList> getAssetList() {
            return this.assetList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<AssetList> assetList; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.assetList = model.assetList;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The asset list.</p>
             */
            public Builder assetList(java.util.List<AssetList> assetList) {
                this.assetList = assetList;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>68</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
