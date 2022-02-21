// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCatalogsRequest} extends {@link RequestModel}
 *
 * <p>ListCatalogsRequest</p>
 */
public class ListCatalogsRequest extends Request {
    @Query
    @NameInMap("IdPattern")
    private String idPattern;

    @Query
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 1000000)
    private Integer pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListCatalogsRequest(Builder builder) {
        super(builder);
        this.idPattern = builder.idPattern;
        this.nextPageToken = builder.nextPageToken;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCatalogsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return idPattern
     */
    public String getIdPattern() {
        return this.idPattern;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
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

    public static final class Builder extends Request.Builder<ListCatalogsRequest, Builder> {
        private String idPattern; 
        private String nextPageToken; 
        private Integer pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListCatalogsRequest response) {
            super(response);
            this.idPattern = response.idPattern;
            this.nextPageToken = response.nextPageToken;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
        } 

        /**
         * catalogId
         */
        public Builder idPattern(String idPattern) {
            this.putQueryParameter("IdPattern", idPattern);
            this.idPattern = idPattern;
            return this;
        }

        /**
         * namePattern
         */
        public Builder nextPageToken(String nextPageToken) {
            this.putQueryParameter("NextPageToken", nextPageToken);
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * pageSize
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListCatalogsRequest build() {
            return new ListCatalogsRequest(this);
        } 

    } 

}
