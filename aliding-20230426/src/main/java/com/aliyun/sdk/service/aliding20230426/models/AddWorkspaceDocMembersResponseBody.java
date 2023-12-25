// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddWorkspaceDocMembersResponseBody} extends {@link TeaModel}
 *
 * <p>AddWorkspaceDocMembersResponseBody</p>
 */
public class AddWorkspaceDocMembersResponseBody extends TeaModel {
    @NameInMap("requestId")
    private String requestId;

    private AddWorkspaceDocMembersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddWorkspaceDocMembersResponseBody create() {
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
         * requestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddWorkspaceDocMembersResponseBody build() {
            return new AddWorkspaceDocMembersResponseBody(this);
        } 

    } 

}
