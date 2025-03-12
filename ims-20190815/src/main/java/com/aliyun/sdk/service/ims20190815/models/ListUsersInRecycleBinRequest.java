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
 * {@link ListUsersInRecycleBinRequest} extends {@link RequestModel}
 *
 * <p>ListUsersInRecycleBinRequest</p>
 */
public class ListUsersInRecycleBinRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Filter")
    private String filter;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxItems")
    private Integer maxItems;

    private ListUsersInRecycleBinRequest(Builder builder) {
        super(builder);
        this.filter = builder.filter;
        this.marker = builder.marker;
        this.maxItems = builder.maxItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersInRecycleBinRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filter
     */
    public String getFilter() {
        return this.filter;
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

    public static final class Builder extends Request.Builder<ListUsersInRecycleBinRequest, Builder> {
        private String filter; 
        private String marker; 
        private Integer maxItems; 

        private Builder() {
            super();
        } 

        private Builder(ListUsersInRecycleBinRequest request) {
            super(request);
            this.filter = request.filter;
            this.marker = request.marker;
            this.maxItems = request.maxItems;
        } 

        /**
         * <p>The filter condition that is used to query information about a specified RAM user in the recycle bin.</p>
         * <p>You must specify this parameter in the <code>UserPrincipalName eq &lt;username&gt;@&lt;AccountAlias&gt;.onaliyun.com</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>UserPrincipalName eq <a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
         */
        public Builder filter(String filter) {
            this.putQueryParameter("Filter", filter);
            this.filter = filter;
            return this;
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
         * <p>The number of entries to return. If a response is truncated because it reaches the value of <code>MaxItems</code>, the value of <code>IsTruncated</code> will be true.</p>
         * <p>Valid values: 1 to 100. Default value: 100.</p>
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
        public ListUsersInRecycleBinRequest build() {
            return new ListUsersInRecycleBinRequest(this);
        } 

    } 

}
