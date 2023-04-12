// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcedirectorymaster20220419.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeregisterDelegatedAdministratorResponseBody} extends {@link TeaModel}
 *
 * <p>DeregisterDelegatedAdministratorResponseBody</p>
 */
public class DeregisterDelegatedAdministratorResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeregisterDelegatedAdministratorResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeregisterDelegatedAdministratorResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String requestId; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeregisterDelegatedAdministratorResponseBody build() {
            return new DeregisterDelegatedAdministratorResponseBody(this);
        } 

    } 

}
