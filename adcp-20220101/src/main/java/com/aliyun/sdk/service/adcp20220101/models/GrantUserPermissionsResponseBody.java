// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantUserPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>GrantUserPermissionsResponseBody</p>
 */
public class GrantUserPermissionsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private GrantUserPermissionsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantUserPermissionsResponseBody create() {
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GrantUserPermissionsResponseBody build() {
            return new GrantUserPermissionsResponseBody(this);
        } 

    } 

}
