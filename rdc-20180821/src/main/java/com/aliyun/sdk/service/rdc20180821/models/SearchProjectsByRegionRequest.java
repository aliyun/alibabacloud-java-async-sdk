// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdc20180821.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchProjectsByRegionRequest} extends {@link RequestModel}
 *
 * <p>SearchProjectsByRegionRequest</p>
 */
public class SearchProjectsByRegionRequest extends Request {
    @Query
    @NameInMap("CorpIdentifier")
    @Validation(required = true)
    private String corpIdentifier;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Query
    @NameInMap("Status")
    private String status;

    @Query
    @NameInMap("ToPage")
    private Integer toPage;

    private SearchProjectsByRegionRequest(Builder builder) {
        super(builder);
        this.corpIdentifier = builder.corpIdentifier;
        this.pageSize = builder.pageSize;
        this.region = builder.region;
        this.status = builder.status;
        this.toPage = builder.toPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchProjectsByRegionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return corpIdentifier
     */
    public String getCorpIdentifier() {
        return this.corpIdentifier;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return toPage
     */
    public Integer getToPage() {
        return this.toPage;
    }

    public static final class Builder extends Request.Builder<SearchProjectsByRegionRequest, Builder> {
        private String corpIdentifier; 
        private Integer pageSize; 
        private String region; 
        private String status; 
        private Integer toPage; 

        private Builder() {
            super();
        } 

        private Builder(SearchProjectsByRegionRequest response) {
            super(response);
            this.corpIdentifier = response.corpIdentifier;
            this.pageSize = response.pageSize;
            this.region = response.region;
            this.status = response.status;
            this.toPage = response.toPage;
        } 

        /**
         * CorpIdentifier.
         */
        public Builder corpIdentifier(String corpIdentifier) {
            this.putQueryParameter("CorpIdentifier", corpIdentifier);
            this.corpIdentifier = corpIdentifier;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * ToPage.
         */
        public Builder toPage(Integer toPage) {
            this.putQueryParameter("ToPage", toPage);
            this.toPage = toPage;
            return this;
        }

        @Override
        public SearchProjectsByRegionRequest build() {
            return new SearchProjectsByRegionRequest(this);
        } 

    } 

}
