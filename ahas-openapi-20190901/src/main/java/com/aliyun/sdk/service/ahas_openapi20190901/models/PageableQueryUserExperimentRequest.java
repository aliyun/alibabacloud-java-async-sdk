// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ahas_openapi20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PageableQueryUserExperimentRequest} extends {@link RequestModel}
 *
 * <p>PageableQueryUserExperimentRequest</p>
 */
public class PageableQueryUserExperimentRequest extends Request {
    @Query
    @NameInMap("AhasRegionId")
    private String ahasRegionId;

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
    @NameInMap("Results")
    private java.util.List < String > results;

    @Query
    @NameInMap("SearchKey")
    private String searchKey;

    @Query
    @NameInMap("Size")
    private Integer size;

    @Query
    @NameInMap("State")
    private String state;

    @Query
    @NameInMap("Tags")
    private java.util.List < String > tags;

    @Query
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private PageableQueryUserExperimentRequest(Builder builder) {
        super(builder);
        this.ahasRegionId = builder.ahasRegionId;
        this.namespace = builder.namespace;
        this.page = builder.page;
        this.regionId = builder.regionId;
        this.results = builder.results;
        this.searchKey = builder.searchKey;
        this.size = builder.size;
        this.state = builder.state;
        this.tags = builder.tags;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PageableQueryUserExperimentRequest create() {
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
     * @return results
     */
    public java.util.List < String > getResults() {
        return this.results;
    }

    /**
     * @return searchKey
     */
    public String getSearchKey() {
        return this.searchKey;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return tags
     */
    public java.util.List < String > getTags() {
        return this.tags;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<PageableQueryUserExperimentRequest, Builder> {
        private String ahasRegionId; 
        private String namespace; 
        private Integer page; 
        private String regionId; 
        private java.util.List < String > results; 
        private String searchKey; 
        private Integer size; 
        private String state; 
        private java.util.List < String > tags; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(PageableQueryUserExperimentRequest response) {
            super(response);
            this.ahasRegionId = response.ahasRegionId;
            this.namespace = response.namespace;
            this.page = response.page;
            this.regionId = response.regionId;
            this.results = response.results;
            this.searchKey = response.searchKey;
            this.size = response.size;
            this.state = response.state;
            this.tags = response.tags;
            this.workspaceId = response.workspaceId;
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
         * Results.
         */
        public Builder results(java.util.List < String > results) {
            this.putQueryParameter("Results", results);
            this.results = results;
            return this;
        }

        /**
         * SearchKey.
         */
        public Builder searchKey(String searchKey) {
            this.putQueryParameter("SearchKey", searchKey);
            this.searchKey = searchKey;
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

        /**
         * State.
         */
        public Builder state(String state) {
            this.putQueryParameter("State", state);
            this.state = state;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < String > tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public PageableQueryUserExperimentRequest build() {
            return new PageableQueryUserExperimentRequest(this);
        } 

    } 

}
