// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePkgVersionsRequest} extends {@link RequestModel}
 *
 * <p>DescribePkgVersionsRequest</p>
 */
public class DescribePkgVersionsRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("PkgVersionLabel")
    private String pkgVersionLabel;

    @Query
    @NameInMap("PkgVersionSearch")
    private String pkgVersionSearch;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private DescribePkgVersionsRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.pkgVersionLabel = builder.pkgVersionLabel;
        this.pkgVersionSearch = builder.pkgVersionSearch;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePkgVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
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
     * @return pkgVersionLabel
     */
    public String getPkgVersionLabel() {
        return this.pkgVersionLabel;
    }

    /**
     * @return pkgVersionSearch
     */
    public String getPkgVersionSearch() {
        return this.pkgVersionSearch;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribePkgVersionsRequest, Builder> {
        private String appId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String pkgVersionLabel; 
        private String pkgVersionSearch; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePkgVersionsRequest response) {
            super(response);
            this.appId = response.appId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.pkgVersionLabel = response.pkgVersionLabel;
            this.pkgVersionSearch = response.pkgVersionSearch;
            this.regionId = response.regionId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
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
         * PkgVersionLabel.
         */
        public Builder pkgVersionLabel(String pkgVersionLabel) {
            this.putQueryParameter("PkgVersionLabel", pkgVersionLabel);
            this.pkgVersionLabel = pkgVersionLabel;
            return this;
        }

        /**
         * PkgVersionSearch.
         */
        public Builder pkgVersionSearch(String pkgVersionSearch) {
            this.putQueryParameter("PkgVersionSearch", pkgVersionSearch);
            this.pkgVersionSearch = pkgVersionSearch;
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

        @Override
        public DescribePkgVersionsRequest build() {
            return new DescribePkgVersionsRequest(this);
        } 

    } 

}
