// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTenantUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteTenantUsersResponseBody</p>
 */
public class DeleteTenantUsersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteTenantUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTenantUsersResponseBody create() {
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
         * DeleteTenantUsers
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteTenantUsersResponseBody build() {
            return new DeleteTenantUsersResponseBody(this);
        } 

    } 

}
