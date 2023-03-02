// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddProjectMemberToRoleResponseBody} extends {@link TeaModel}
 *
 * <p>AddProjectMemberToRoleResponseBody</p>
 */
public class AddProjectMemberToRoleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    private AddProjectMemberToRoleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProjectMemberToRoleResponseBody create() {
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
         * The ID of the request. You can use the ID to search for logs and troubleshoot issues based on the logs.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AddProjectMemberToRoleResponseBody build() {
            return new AddProjectMemberToRoleResponseBody(this);
        } 

    } 

}
