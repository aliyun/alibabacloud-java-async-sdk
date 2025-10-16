// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link UpdateSecurityProxyResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSecurityProxyResponseBody</p>
 */
public class UpdateSecurityProxyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Module")
    private String module;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateSecurityProxyResponseBody(Builder builder) {
        this.module = builder.module;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecurityProxyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String module; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateSecurityProxyResponseBody model) {
            this.module = model.module;
            this.requestId = model.requestId;
        } 

        /**
         * Module.
         */
        public Builder module(String module) {
            this.module = module;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateSecurityProxyResponseBody build() {
            return new UpdateSecurityProxyResponseBody(this);
        } 

    } 

}
