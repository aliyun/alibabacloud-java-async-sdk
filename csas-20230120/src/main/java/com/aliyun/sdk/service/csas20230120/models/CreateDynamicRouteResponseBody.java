// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDynamicRouteResponseBody} extends {@link TeaModel}
 *
 * <p>CreateDynamicRouteResponseBody</p>
 */
public class CreateDynamicRouteResponseBody extends TeaModel {
    @NameInMap("DynamicRouteId")
    private String dynamicRouteId;

    @NameInMap("RequestId")
    private String requestId;

    private CreateDynamicRouteResponseBody(Builder builder) {
        this.dynamicRouteId = builder.dynamicRouteId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDynamicRouteResponseBody create() {
        return builder().build();
    }

    /**
     * @return dynamicRouteId
     */
    public String getDynamicRouteId() {
        return this.dynamicRouteId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String dynamicRouteId; 
        private String requestId; 

        /**
         * DynamicRouteId.
         */
        public Builder dynamicRouteId(String dynamicRouteId) {
            this.dynamicRouteId = dynamicRouteId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateDynamicRouteResponseBody build() {
            return new CreateDynamicRouteResponseBody(this);
        } 

    } 

}
