// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link PermissionResult} extends {@link TeaModel}
 *
 * <p>PermissionResult</p>
 */
public class PermissionResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("allow")
    private Boolean allow;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private PermissionResult(Builder builder) {
        this.allow = builder.allow;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PermissionResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allow
     */
    public Boolean getAllow() {
        return this.allow;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean allow; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PermissionResult model) {
            this.allow = model.allow;
            this.requestId = model.requestId;
        } 

        /**
         * allow.
         */
        public Builder allow(Boolean allow) {
            this.allow = allow;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PermissionResult build() {
            return new PermissionResult(this);
        } 

    } 

}
