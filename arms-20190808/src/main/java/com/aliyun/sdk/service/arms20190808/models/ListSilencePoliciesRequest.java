// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSilencePoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListSilencePoliciesRequest</p>
 */
public class ListSilencePoliciesRequest extends Request {
    @Query
    @NameInMap("IsDetail")
    private Boolean isDetail;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    private ListSilencePoliciesRequest(Builder builder) {
        super(builder);
        this.isDetail = builder.isDetail;
        this.name = builder.name;
        this.page = builder.page;
        this.regionId = builder.regionId;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSilencePoliciesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isDetail
     */
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return page
     */
    public Long getPage() {
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
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<ListSilencePoliciesRequest, Builder> {
        private Boolean isDetail; 
        private String name; 
        private Long page; 
        private String regionId; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListSilencePoliciesRequest request) {
            super(request);
            this.isDetail = request.isDetail;
            this.name = request.name;
            this.page = request.page;
            this.regionId = request.regionId;
            this.size = request.size;
        } 

        /**
         * Specifies whether to query the details of a silence policy. Valid values:
         * <p>
         * 
         * *   `true`: Details of the silence policy are queried.
         * *   `false`: Details about notification policies are not queried.
         */
        public Builder isDetail(Boolean isDetail) {
            this.putQueryParameter("IsDetail", isDetail);
            this.isDetail = isDetail;
            return this;
        }

        /**
         * The name of the silence policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The number of the page to return.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * The ID of the region.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The number of entries to return on each page.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListSilencePoliciesRequest build() {
            return new ListSilencePoliciesRequest(this);
        } 

    } 

}
