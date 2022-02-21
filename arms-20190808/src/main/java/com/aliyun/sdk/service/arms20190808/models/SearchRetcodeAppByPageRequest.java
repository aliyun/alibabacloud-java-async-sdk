// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SearchRetcodeAppByPageRequest} extends {@link RequestModel}
 *
 * <p>SearchRetcodeAppByPageRequest</p>
 */
public class SearchRetcodeAppByPageRequest extends Request {
    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RetcodeAppName")
    private String retcodeAppName;

    private SearchRetcodeAppByPageRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
        this.retcodeAppName = builder.retcodeAppName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SearchRetcodeAppByPageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return retcodeAppName
     */
    public String getRetcodeAppName() {
        return this.retcodeAppName;
    }

    public static final class Builder extends Request.Builder<SearchRetcodeAppByPageRequest, Builder> {
        private Integer pageNumber; 
        private Integer pageSize; 
        private String regionId; 
        private String retcodeAppName; 

        private Builder() {
            super();
        } 

        private Builder(SearchRetcodeAppByPageRequest response) {
            super(response);
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
            this.retcodeAppName = response.retcodeAppName;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RetcodeAppName.
         */
        public Builder retcodeAppName(String retcodeAppName) {
            this.putQueryParameter("RetcodeAppName", retcodeAppName);
            this.retcodeAppName = retcodeAppName;
            return this;
        }

        @Override
        public SearchRetcodeAppByPageRequest build() {
            return new SearchRetcodeAppByPageRequest(this);
        } 

    } 

}
