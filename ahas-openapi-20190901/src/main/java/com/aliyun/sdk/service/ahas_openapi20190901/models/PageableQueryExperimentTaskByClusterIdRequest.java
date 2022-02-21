// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageableQueryExperimentTaskByClusterIdRequest} extends {@link RequestModel}
 *
 * <p>PageableQueryExperimentTaskByClusterIdRequest</p>
 */
public class PageableQueryExperimentTaskByClusterIdRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("IncludeInvalidHost")
    private Boolean includeInvalidHost;

    @Query
    @NameInMap("Namespace")
    private String namespace;

    @Query
    @NameInMap("Page")
    private Integer page;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Size")
    private Integer size;

    private PageableQueryExperimentTaskByClusterIdRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.clusterId = builder.clusterId;
        this.includeInvalidHost = builder.includeInvalidHost;
        this.namespace = builder.namespace;
        this.page = builder.page;
        this.regionId = builder.regionId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageableQueryExperimentTaskByClusterIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ahasRegionId
     */
    public String getAhasRegionId() {
        return this.ahasRegionId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return includeInvalidHost
     */
    public Boolean getIncludeInvalidHost() {
        return this.includeInvalidHost;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return page
     */
    public Integer getPage() {
        return this.page;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<PageableQueryExperimentTaskByClusterIdRequest, Builder> {
        private String ahasRegionId; 
        private String clusterId; 
        private Boolean includeInvalidHost; 
        private String namespace; 
        private Integer page; 
        private String regionId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(PageableQueryExperimentTaskByClusterIdRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.clusterId = response.clusterId;
            this.includeInvalidHost = response.includeInvalidHost;
            this.namespace = response.namespace;
            this.page = response.page;
            this.regionId = response.regionId;
            this.size = response.size;
        } 

        /**
         * AhasRegionId.
         */
        public Builder ahasRegionId(String ahasRegionId) {
            this.putQueryParameter("AhasRegionId", ahasRegionId);
            this.ahasRegionId = ahasRegionId;
            return this;
        }

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * IncludeInvalidHost.
         */
        public Builder includeInvalidHost(Boolean includeInvalidHost) {
            this.putQueryParameter("IncludeInvalidHost", includeInvalidHost);
            this.includeInvalidHost = includeInvalidHost;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Integer page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public PageableQueryExperimentTaskByClusterIdRequest build() {
            return new PageableQueryExperimentTaskByClusterIdRequest(this);
        } 

    } 

}
