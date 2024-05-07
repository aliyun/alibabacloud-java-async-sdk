// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSAMLProvidersRequest} extends {@link RequestModel}
 *
 * <p>ListSAMLProvidersRequest</p>
 */
public class ListSAMLProvidersRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxItems")
    private Integer maxItems;

    private ListSAMLProvidersRequest(Builder builder) {
        super(builder);
        this.marker = builder.marker;
        this.maxItems = builder.maxItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSAMLProvidersRequest create() {
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

    public static final class Builder extends Request.Builder<ListSAMLProvidersRequest, Builder> {
        private String marker; 
        private Integer maxItems; 

        private Builder() {
            super();
        } 

        private Builder(ListSAMLProvidersRequest request) {
            super(request);
            this.marker = request.marker;
            this.maxItems = request.maxItems;
        } 

        /**
         * The `marker`. If part of a previous response is truncated, you can use this parameter to obtain the truncated part.
         */
        public Builder marker(String marker) {
            this.putQueryParameter("Marker", marker);
            this.marker = marker;
            return this;
        }

        /**
         * The number of entries to return. If a response is truncated because it reaches the value of `MaxItems`, the value of `IsTruncated` will be `true`.
         * <p>
         * 
         * Valid values: 1 to 100. Default value: 100.
         */
        public Builder maxItems(Integer maxItems) {
            this.putQueryParameter("MaxItems", maxItems);
            this.maxItems = maxItems;
            return this;
        }

        @Override
        public ListSAMLProvidersRequest build() {
            return new ListSAMLProvidersRequest(this);
        } 

    } 

}
