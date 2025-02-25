// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the VBR.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-bp1jcg5cmxjbl9xgc****</p>
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
