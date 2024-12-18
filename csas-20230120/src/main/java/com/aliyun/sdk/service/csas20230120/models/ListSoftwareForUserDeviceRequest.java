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
 * {@link ListSoftwareForUserDeviceRequest} extends {@link RequestModel}
 *
 * <p>ListSoftwareForUserDeviceRequest</p>
 */
public class ListSoftwareForUserDeviceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long currentPage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceTag")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceTag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pageSize;

    private ListSoftwareForUserDeviceRequest(Builder builder) {
        super(builder);
        this.currentPage = builder.currentPage;
        this.deviceTag = builder.deviceTag;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSoftwareForUserDeviceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deviceTag
     */
    public String getDeviceTag() {
        return this.deviceTag;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    public static final class Builder extends Request.Builder<ListSoftwareForUserDeviceRequest, Builder> {
        private Long currentPage; 
        private String deviceTag; 
        private Long pageSize; 

        private Builder() {
            super();
        } 

        private Builder(ListSoftwareForUserDeviceRequest request) {
            super(request);
            this.currentPage = request.currentPage;
            this.deviceTag = request.deviceTag;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.putQueryParameter("CurrentPage", currentPage);
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>36efa42d-2c32-c4dc-e3fc-8541e33a****</p>
         */
        public Builder deviceTag(String deviceTag) {
            this.putQueryParameter("DeviceTag", deviceTag);
            this.deviceTag = deviceTag;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Long pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public ListSoftwareForUserDeviceRequest build() {
            return new ListSoftwareForUserDeviceRequest(this);
        } 

    } 

}
