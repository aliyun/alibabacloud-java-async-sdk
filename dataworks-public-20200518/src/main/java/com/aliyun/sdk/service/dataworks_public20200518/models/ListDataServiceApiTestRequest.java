// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDataServiceApiTestRequest} extends {@link RequestModel}
 *
 * <p>ListDataServiceApiTestRequest</p>
 */
public class ListDataServiceApiTestRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ApiId")
    @Validation(required = true)
    private Long apiId;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private ListDataServiceApiTestRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.apiId = builder.apiId;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataServiceApiTestRequest create() {
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
     * @return apiId
     */
    public Long getApiId() {
        return this.apiId;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListDataServiceApiTestRequest, Builder> {
        private String regionId; 
        private Long apiId; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDataServiceApiTestRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.apiId = request.apiId;
            this.pageSize = request.pageSize;
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
         * The ID of the DataService Studio API on which tests are performed.
         */
        public Builder apiId(Long apiId) {
            this.putQueryParameter("ApiId", apiId);
            this.apiId = apiId;
            return this;
        }

        /**
         * The number of entries to return on each page. Maximum value: 100.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListDataServiceApiTestRequest build() {
            return new ListDataServiceApiTestRequest(this);
        } 

    } 

}
