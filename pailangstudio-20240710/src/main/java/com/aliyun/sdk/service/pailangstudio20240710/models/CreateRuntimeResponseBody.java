// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pailangstudio20240710.models;

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
 * {@link CreateRuntimeResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRuntimeResponseBody</p>
 */
public class CreateRuntimeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuntimeId")
    private String runtimeId;

    private CreateRuntimeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.runtimeId = builder.runtimeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRuntimeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return runtimeId
     */
    public String getRuntimeId() {
        return this.runtimeId;
    }

    public static final class Builder {
        private String requestId; 
        private String runtimeId; 

        private Builder() {
        } 

        private Builder(CreateRuntimeResponseBody model) {
            this.requestId = model.requestId;
            this.runtimeId = model.runtimeId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RuntimeId.
         */
        public Builder runtimeId(String runtimeId) {
            this.runtimeId = runtimeId;
            return this;
        }

        public CreateRuntimeResponseBody build() {
            return new CreateRuntimeResponseBody(this);
        } 

    } 

}
