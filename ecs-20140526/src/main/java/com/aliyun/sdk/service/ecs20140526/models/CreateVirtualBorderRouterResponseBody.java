// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualBorderRouterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateVirtualBorderRouterResponseBody</p>
 */
public class CreateVirtualBorderRouterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VbrId")
    private String vbrId;

    private CreateVirtualBorderRouterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vbrId = builder.vbrId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVirtualBorderRouterResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vbrId
     */
    public String getVbrId() {
        return this.vbrId;
    }

    public static final class Builder {
        private String requestId; 
        private String vbrId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VbrId.
         */
        public Builder vbrId(String vbrId) {
            this.vbrId = vbrId;
            return this;
        }

        public CreateVirtualBorderRouterResponseBody build() {
            return new CreateVirtualBorderRouterResponseBody(this);
        } 

    } 

}
