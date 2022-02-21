// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imp20210630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListAppTemplatesRequest</p>
 */
public class ListAppTemplatesRequest extends Request {
    @Body
    @NameInMap("PageNumber")
    private String pageNumber;

    @Body
    @NameInMap("PageSize")
    private String pageSize;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private ListAppTemplatesRequest(Builder builder) {
        super(builder);
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListAppTemplatesRequest, Builder> {
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListAppTemplatesRequest response) {
            super(response);
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
            this.regionId = response.regionId;
        } 

        /**
         * 查询页码，参数为空默认查询第1页。
         */
        public Builder pageNumber(String pageNumber) {
            this.putBodyParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * 每页显示个数，参数为空默认显示个数为10。
         */
        public Builder pageSize(String pageSize) {
            this.putBodyParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * 地域
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListAppTemplatesRequest build() {
            return new ListAppTemplatesRequest(this);
        } 

    } 

}
