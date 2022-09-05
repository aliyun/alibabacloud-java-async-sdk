// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNotificationPoliciesRequest} extends {@link RequestModel}
 *
 * <p>ListNotificationPoliciesRequest</p>
 */
public class ListNotificationPoliciesRequest extends Request {
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

    private ListNotificationPoliciesRequest(Builder builder) {
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

    public static ListNotificationPoliciesRequest create() {
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

    public static final class Builder extends Request.Builder<ListNotificationPoliciesRequest, Builder> {
        private Boolean isDetail; 
        private String name; 
        private Long page; 
        private String regionId; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(ListNotificationPoliciesRequest request) {
            super(request);
            this.isDetail = request.isDetail;
            this.name = request.name;
            this.page = request.page;
            this.regionId = request.regionId;
            this.size = request.size;
        } 

        /**
         * 是否查询详情信息
         */
        public Builder isDetail(Boolean isDetail) {
            this.putQueryParameter("IsDetail", isDetail);
            this.isDetail = isDetail;
            return this;
        }

        /**
         * 通知策略名称
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 页数
         */
        public Builder page(Long page) {
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
         * 每页展示数目
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public ListNotificationPoliciesRequest build() {
            return new ListNotificationPoliciesRequest(this);
        } 

    } 

}
