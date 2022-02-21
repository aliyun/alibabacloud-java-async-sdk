// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageableQueryExperimentTaskByExperimentIdRequest} extends {@link RequestModel}
 *
 * <p>PageableQueryExperimentTaskByExperimentIdRequest</p>
 */
public class PageableQueryExperimentTaskByExperimentIdRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

    @Query
    @NameInMap("ExperimentId")
    private String experimentId;

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

    private PageableQueryExperimentTaskByExperimentIdRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.experimentId = builder.experimentId;
        this.namespace = builder.namespace;
        this.page = builder.page;
        this.regionId = builder.regionId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageableQueryExperimentTaskByExperimentIdRequest create() {
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
     * @return experimentId
     */
    public String getExperimentId() {
        return this.experimentId;
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

    public static final class Builder extends Request.Builder<PageableQueryExperimentTaskByExperimentIdRequest, Builder> {
        private String ahasRegionId; 
        private String experimentId; 
        private String namespace; 
        private Integer page; 
        private String regionId; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(PageableQueryExperimentTaskByExperimentIdRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.experimentId = response.experimentId;
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
         * ExperimentId.
         */
        public Builder experimentId(String experimentId) {
            this.putQueryParameter("ExperimentId", experimentId);
            this.experimentId = experimentId;
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
        public PageableQueryExperimentTaskByExperimentIdRequest build() {
            return new PageableQueryExperimentTaskByExperimentIdRequest(this);
        } 

    } 

}
