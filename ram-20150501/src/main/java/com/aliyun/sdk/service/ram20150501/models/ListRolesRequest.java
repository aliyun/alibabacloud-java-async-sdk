// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link ListRolesRequest} extends {@link RequestModel}
 *
 * <p>ListRolesRequest</p>
 */
public class ListRolesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxItems")
    private Integer maxItems;

    private ListRolesRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.maxItems = builder.maxItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRolesRequest create() {
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

    public static final class Builder extends Request.Builder<ListRolesRequest, Builder> {
        private String marker; 
        private Integer maxItems; 

        private Builder() {
            super();
        } 

        private Builder(ListRolesRequest request) {
            super(request);
            this.marker = request.marker;
            this.maxItems = request.maxItems;
        } 

        /**
         * <p>The <code>marker</code>. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.</p>
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
         * <p>The number of entries to return. If a response is truncated because it reaches the value of <code>MaxItems</code>, the value of <code>IsTruncated</code> will be <code>true</code>.</p>
         * <p>Valid values: 1 to 1000. Default value: 100.</p>
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
        public ListRolesRequest build() {
            return new ListRolesRequest(this);
        } 

    } 

}
