// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddUsersToGroupResponseBody} extends {@link TeaModel}
 *
 * <p>AddUsersToGroupResponseBody</p>
 */
public class AddUsersToGroupResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AddUsersToGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUsersToGroupResponseBody create() {
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
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddUsersToGroupResponseBody build() {
            return new AddUsersToGroupResponseBody(this);
        } 

    } 

}
