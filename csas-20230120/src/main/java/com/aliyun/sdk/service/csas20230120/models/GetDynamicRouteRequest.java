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
 * {@link GetDynamicRouteRequest} extends {@link RequestModel}
 *
 * <p>GetDynamicRouteRequest</p>
 */
public class GetDynamicRouteRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicRouteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dynamicRouteId;

    private GetDynamicRouteRequest(Builder builder) {
        super(builder);
        this.dynamicRouteId = builder.dynamicRouteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDynamicRouteRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicRouteId
     */
    public String getDynamicRouteId() {
        return this.dynamicRouteId;
    }

    public static final class Builder extends Request.Builder<GetDynamicRouteRequest, Builder> {
        private String dynamicRouteId; 

        private Builder() {
            super();
        } 

        private Builder(GetDynamicRouteRequest request) {
            super(request);
            this.dynamicRouteId = request.dynamicRouteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dr-16ff07c8207d****</p>
         */
        public Builder dynamicRouteId(String dynamicRouteId) {
            this.putQueryParameter("DynamicRouteId", dynamicRouteId);
            this.dynamicRouteId = dynamicRouteId;
            return this;
        }

        @Override
        public GetDynamicRouteRequest build() {
            return new GetDynamicRouteRequest(this);
        } 

    } 

}
