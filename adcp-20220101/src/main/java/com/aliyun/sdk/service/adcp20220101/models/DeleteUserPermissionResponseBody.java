// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserPermissionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteUserPermissionResponseBody</p>
 */
public class DeleteUserPermissionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteUserPermissionResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserPermissionResponseBody create() {
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

        public DeleteUserPermissionResponseBody build() {
            return new DeleteUserPermissionResponseBody(this);
        } 

    } 

}
