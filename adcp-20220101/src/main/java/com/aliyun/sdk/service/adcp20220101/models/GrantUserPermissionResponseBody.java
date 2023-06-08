// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantUserPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>GrantUserPermissionResponseBody</p>
 */
public class GrantUserPermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private GrantUserPermissionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantUserPermissionResponseBody create() {
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

        public GrantUserPermissionResponseBody build() {
            return new GrantUserPermissionResponseBody(this);
        } 

    } 

}
