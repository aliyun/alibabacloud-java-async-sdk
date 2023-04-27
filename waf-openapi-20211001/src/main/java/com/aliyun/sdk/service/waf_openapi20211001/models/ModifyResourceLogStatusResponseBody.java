// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyResourceLogStatusResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyResourceLogStatusResponseBody</p>
 */
public class ModifyResourceLogStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private Boolean status;

    private ModifyResourceLogStatusResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyResourceLogStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean status; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the log collection feature is enabled for the protected object. Valid values:
         * <p>
         * 
         * *   **true:** The log collection feature is enabled.
         * *   **false:** The log collection feature is disabled.
         */
        public Builder status(Boolean status) {
            this.status = status;
            return this;
        }

        public ModifyResourceLogStatusResponseBody build() {
            return new ModifyResourceLogStatusResponseBody(this);
        } 

    } 

}
