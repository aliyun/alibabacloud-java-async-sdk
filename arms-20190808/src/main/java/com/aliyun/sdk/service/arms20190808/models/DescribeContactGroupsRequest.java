// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContactGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeContactGroupsRequest</p>
 */
public class DescribeContactGroupsRequest extends Request {
    @Query
    @NameInMap("ContactGroupName")
    private String contactGroupName;

    @Query
    @NameInMap("GroupIds")
    private String groupIds;

    @Query
    @NameInMap("IsDetail")
    private Boolean isDetail;

    @Query
    @NameInMap("Page")
    @Validation(required = true)
    private Long page;

    @Query
    @NameInMap("Size")
    @Validation(required = true)
    private Long size;

    private DescribeContactGroupsRequest(Builder builder) {
        super(builder);
        this.contactGroupName = builder.contactGroupName;
        this.groupIds = builder.groupIds;
        this.isDetail = builder.isDetail;
        this.page = builder.page;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContactGroupsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contactGroupName
     */
    public String getContactGroupName() {
        return this.contactGroupName;
    }

    /**
     * @return groupIds
     */
    public String getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return isDetail
     */
    public Boolean getIsDetail() {
        return this.isDetail;
    }

    /**
     * @return page
     */
    public Long getPage() {
        return this.page;
    }

    /**
     * @return size
     */
    public Long getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<DescribeContactGroupsRequest, Builder> {
        private String contactGroupName; 
        private String groupIds; 
        private Boolean isDetail; 
        private Long page; 
        private Long size; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContactGroupsRequest request) {
            super(request);
            this.contactGroupName = request.contactGroupName;
            this.groupIds = request.groupIds;
            this.isDetail = request.isDetail;
            this.page = request.page;
            this.size = request.size;
        } 

        /**
         * 告警联系人组名称
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putQueryParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * GroupIds.
         */
        public Builder groupIds(String groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * 是否返回联系人分组中包含的所有联系人。默认不返回所有联系人。
         */
        public Builder isDetail(Boolean isDetail) {
            this.putQueryParameter("IsDetail", isDetail);
            this.isDetail = isDetail;
            return this;
        }

        /**
         * Page.
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Long size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public DescribeContactGroupsRequest build() {
            return new DescribeContactGroupsRequest(this);
        } 

    } 

}
