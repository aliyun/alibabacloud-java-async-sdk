// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeContactGroupsRequest} extends {@link RequestModel}
 *
 * <p>DescribeContactGroupsRequest</p>
 */
public class DescribeContactGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ContactGroupName")
    private String contactGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private String groupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsDetail")
    private Boolean isDetail;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Page")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long page;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long size;

    private DescribeContactGroupsRequest(Builder builder) {
        super(builder);
        this.contactGroupName = builder.contactGroupName;
        this.groupIds = builder.groupIds;
        this.isDetail = builder.isDetail;
        this.page = builder.page;
        this.regionId = builder.regionId;
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

    public static final class Builder extends Request.Builder<DescribeContactGroupsRequest, Builder> {
        private String contactGroupName; 
        private String groupIds; 
        private Boolean isDetail; 
        private Long page; 
        private String regionId; 
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
            this.regionId = request.regionId;
            this.size = request.size;
        } 

        /**
         * <p>The name of the alert contact group.</p>
         * 
         * <strong>example:</strong>
         * <p>TestGroup</p>
         */
        public Builder contactGroupName(String contactGroupName) {
            this.putQueryParameter("ContactGroupName", contactGroupName);
            this.contactGroupName = contactGroupName;
            return this;
        }

        /**
         * <p>The ID of the alert contact group.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder groupIds(String groupIds) {
            this.putQueryParameter("GroupIds", groupIds);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * <p>Specifies whether to return all the alert contacts in the queried alert contact group. Valid values:</p>
         * <ul>
         * <li><code>false</code></li>
         * <li><code>true</code></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isDetail(Boolean isDetail) {
            this.putQueryParameter("IsDetail", isDetail);
            this.isDetail = isDetail;
            return this;
        }

        /**
         * <p>The number of the page to return.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder page(Long page) {
            this.putQueryParameter("Page", page);
            this.page = page;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The number of alert contact groups displayed on each page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
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
