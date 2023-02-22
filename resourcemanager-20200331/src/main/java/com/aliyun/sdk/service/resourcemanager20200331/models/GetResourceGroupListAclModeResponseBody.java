// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupListAclModeResponseBody} extends {@link TeaModel}
 *
 * <p>GetResourceGroupListAclModeResponseBody</p>
 */
public class GetResourceGroupListAclModeResponseBody extends TeaModel {
    @NameInMap("Mode")
    private String mode;

    @NameInMap("RequestId")
    private String requestId;

    private GetResourceGroupListAclModeResponseBody(Builder builder) {
        this.mode = builder.mode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetResourceGroupListAclModeResponseBody create() {
        return builder().build();
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String mode; 
        private String requestId; 

        /**
         * Id of the request
         */
        public Builder mode(String mode) {
            this.mode = mode;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetResourceGroupListAclModeResponseBody build() {
            return new GetResourceGroupListAclModeResponseBody(this);
        } 

    } 

}
