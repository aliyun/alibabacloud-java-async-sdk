// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eds_user20210308.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteUserPropertyValueResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteUserPropertyValueResponseBody</p>
 */
public class DeleteUserPropertyValueResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private DeleteUserPropertyValueResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteUserPropertyValueResponseBody create() {
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

        public DeleteUserPropertyValueResponseBody build() {
            return new DeleteUserPropertyValueResponseBody(this);
        } 

    } 

}
