// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPrivateAccessTagsForDynamicRouteRequest} extends {@link RequestModel}
 *
 * <p>ListPrivateAccessTagsForDynamicRouteRequest</p>
 */
public class ListPrivateAccessTagsForDynamicRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicRouteIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > dynamicRouteIds;

    private ListPrivateAccessTagsForDynamicRouteRequest(Builder builder) {
        super(builder);
        this.dynamicRouteIds = builder.dynamicRouteIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrivateAccessTagsForDynamicRouteRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicRouteIds
     */
    public java.util.List < String > getDynamicRouteIds() {
        return this.dynamicRouteIds;
    }

    public static final class Builder extends Request.Builder<ListPrivateAccessTagsForDynamicRouteRequest, Builder> {
        private java.util.List < String > dynamicRouteIds; 

        private Builder() {
            super();
        } 

        private Builder(ListPrivateAccessTagsForDynamicRouteRequest request) {
            super(request);
            this.dynamicRouteIds = request.dynamicRouteIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder dynamicRouteIds(java.util.List < String > dynamicRouteIds) {
            this.putQueryParameter("DynamicRouteIds", dynamicRouteIds);
            this.dynamicRouteIds = dynamicRouteIds;
            return this;
        }

        @Override
        public ListPrivateAccessTagsForDynamicRouteRequest build() {
            return new ListPrivateAccessTagsForDynamicRouteRequest(this);
        } 

    } 

}
