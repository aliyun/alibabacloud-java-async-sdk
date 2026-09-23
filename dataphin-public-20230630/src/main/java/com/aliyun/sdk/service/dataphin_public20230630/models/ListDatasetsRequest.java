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
 * {@link ListDatasetsRequest} extends {@link RequestModel}
 *
 * <p>ListDatasetsRequest</p>
 */
public class ListDatasetsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DatasetQuery")
    private DatasetQuery datasetQuery;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private ListDatasetsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.datasetQuery = builder.datasetQuery;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatasetsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return datasetQuery
     */
    public DatasetQuery getDatasetQuery() {
        return this.datasetQuery;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<ListDatasetsRequest, Builder> {
        private String regionId; 
        private DatasetQuery datasetQuery; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(ListDatasetsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.datasetQuery = request.datasetQuery;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The request body.</p>
         */
        public Builder datasetQuery(DatasetQuery datasetQuery) {
            String datasetQueryShrink = shrink(datasetQuery, "DatasetQuery", "json");
            this.putBodyParameter("DatasetQuery", datasetQueryShrink);
            this.datasetQuery = datasetQuery;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public ListDatasetsRequest build() {
            return new ListDatasetsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListDatasetsRequest} extends {@link TeaModel}
     *
     * <p>ListDatasetsRequest</p>
     */
    public static class DatasetQuery extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("DataUnit")
        private String dataUnit;

        @com.aliyun.core.annotation.NameInMap("IncludeVersionList")
        private Boolean includeVersionList;

        @com.aliyun.core.annotation.NameInMap("Keyword")
        private String keyword;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("Page")
        private Integer page;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Scenario")
        private String scenario;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("TenantId")
        private Long tenantId;

        @com.aliyun.core.annotation.NameInMap("TypeList")
        private java.util.List<String> typeList;

        private DatasetQuery(Builder builder) {
            this.contentType = builder.contentType;
            this.dataUnit = builder.dataUnit;
            this.includeVersionList = builder.includeVersionList;
            this.keyword = builder.keyword;
            this.owner = builder.owner;
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.projectId = builder.projectId;
            this.scenario = builder.scenario;
            this.storageType = builder.storageType;
            this.tenantId = builder.tenantId;
            this.typeList = builder.typeList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DatasetQuery create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return dataUnit
         */
        public String getDataUnit() {
            return this.dataUnit;
        }

        /**
         * @return includeVersionList
         */
        public Boolean getIncludeVersionList() {
            return this.includeVersionList;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return scenario
         */
        public String getScenario() {
            return this.scenario;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return tenantId
         */
        public Long getTenantId() {
            return this.tenantId;
        }

        /**
         * @return typeList
         */
        public java.util.List<String> getTypeList() {
            return this.typeList;
        }

        public static final class Builder {
            private String contentType; 
            private String dataUnit; 
            private Boolean includeVersionList; 
            private String keyword; 
            private String owner; 
            private Integer page; 
            private Integer pageSize; 
            private Long projectId; 
            private String scenario; 
            private String storageType; 
            private Long tenantId; 
            private java.util.List<String> typeList; 

            private Builder() {
            } 

            private Builder(DatasetQuery model) {
                this.contentType = model.contentType;
                this.dataUnit = model.dataUnit;
                this.includeVersionList = model.includeVersionList;
                this.keyword = model.keyword;
                this.owner = model.owner;
                this.page = model.page;
                this.pageSize = model.pageSize;
                this.projectId = model.projectId;
                this.scenario = model.scenario;
                this.storageType = model.storageType;
                this.tenantId = model.tenantId;
                this.typeList = model.typeList;
            } 

            /**
             * <p>The content type.</p>
             * 
             * <strong>example:</strong>
             * <p>GENERAL</p>
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * <p>The data domain ID.</p>
             * 
             * <strong>example:</strong>
             * <p>74280</p>
             */
            public Builder dataUnit(String dataUnit) {
                this.dataUnit = dataUnit;
                return this;
            }

            /**
             * <p>Specifies whether to include version details. Default value: FALSE.</p>
             */
            public Builder includeVersionList(Boolean includeVersionList) {
                this.includeVersionList = includeVersionList;
                return this;
            }

            /**
             * <p>The keyword.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            /**
             * <p>The owner ID.</p>
             * 
             * <strong>example:</strong>
             * <p>300001391</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder page(Integer page) {
                this.page = page;
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
             * <p>The project ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7273382541481536</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The dataset scenario. Valid values:</p>
             * <ul>
             * <li>OFFLINE: offline.</li>
             * <li>REALTIME: real-time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OFFLINE</p>
             */
            public Builder scenario(String scenario) {
                this.scenario = scenario;
                return this;
            }

            /**
             * <p>The storage type.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The tenant ID.</p>
             * 
             * <strong>example:</strong>
             * <p>30001011</p>
             */
            public Builder tenantId(Long tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            /**
             * <p>The dataset type. If left empty, all types are queried.</p>
             */
            public Builder typeList(java.util.List<String> typeList) {
                this.typeList = typeList;
                return this;
            }

            public DatasetQuery build() {
                return new DatasetQuery(this);
            } 

        } 

    }
}
