// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDeviceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListDeviceGroupsRequest</p>
 */
public class ListDeviceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceGroupIds")
    private java.util.List<String> deviceGroupIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer pageSize;

    private ListDeviceGroupsRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.deviceGroupIds = builder.deviceGroupIds;
        this.name = builder.name;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deviceGroupIds
     */
    public java.util.List<String> getDeviceGroupIds() {
        return this.deviceGroupIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListDeviceGroupsRequest, Builder> {
        private Integer currentPage; 
        private java.util.List<String> deviceGroupIds; 
        private String name; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListDeviceGroupsRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.deviceGroupIds = request.deviceGroupIds;
            this.name = request.name;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DeviceGroupIds.
         */
        public Builder deviceGroupIds(java.util.List<String> deviceGroupIds) {
            this.putQueryParameter("DeviceGroupIds", deviceGroupIds);
            this.deviceGroupIds = deviceGroupIds;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListDeviceGroupsRequest build() {
            return new ListDeviceGroupsRequest(this);
        } 

    } 

}
