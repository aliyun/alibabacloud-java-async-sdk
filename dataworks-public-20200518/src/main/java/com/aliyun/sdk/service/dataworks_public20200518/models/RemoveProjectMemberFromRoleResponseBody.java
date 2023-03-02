// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveProjectMemberFromRoleResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveProjectMemberFromRoleResponseBody</p>
 */
public class RemoveProjectMemberFromRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private RemoveProjectMemberFromRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveProjectMemberFromRoleResponseBody create() {
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

        public RemoveProjectMemberFromRoleResponseBody build() {
            return new RemoveProjectMemberFromRoleResponseBody(this);
        } 

    } 

}
