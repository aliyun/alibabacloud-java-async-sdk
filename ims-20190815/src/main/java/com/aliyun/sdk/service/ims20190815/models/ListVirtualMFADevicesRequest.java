// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link ListVirtualMFADevicesRequest} extends {@link RequestModel}
 *
 * <p>ListVirtualMFADevicesRequest</p>
 */
public class ListVirtualMFADevicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxItems")
    private Integer maxItems;

    private ListVirtualMFADevicesRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.maxItems = builder.maxItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVirtualMFADevicesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return maxItems
     */
    public Integer getMaxItems() {
        return this.maxItems;
    }

    public static final class Builder extends Request.Builder<ListVirtualMFADevicesRequest, Builder> {
        private String marker; 
        private Integer maxItems; 

        private Builder() {
            super();
        } 

        private Builder(ListVirtualMFADevicesRequest request) {
            super(request);
            this.marker = request.marker;
            this.maxItems = request.maxItems;
        } 

        /**
         * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request.``</p>
         * <p>When you call the operation for the first time, if the total number of returned entries exceeds the value of <code>MaxItems</code>, the entries are truncated. The system returns entries based on the value of <code>MaxItems</code> and does not return the excess entries. In this case, the value of the response parameter <code>IsTruncated</code> is <code>true</code>, and <code>Marker</code> is returned. In the next call, you can use the value of <code>Marker</code> and maintain the settings of the other request parameters to query the excess entries. You can repeat the call until the value of the <code>IsTruncated</code> parameter becomes <code>false</code>. This way, all entries are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE</p>
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * <p>Valid values: 1 to 100.</p>
         * <p>Default value: 100.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder maxItems(Integer maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
            return this;
        }

        @Override
        public ListVirtualMFADevicesRequest build() {
            return new ListVirtualMFADevicesRequest(this);
        } 

    } 

}
