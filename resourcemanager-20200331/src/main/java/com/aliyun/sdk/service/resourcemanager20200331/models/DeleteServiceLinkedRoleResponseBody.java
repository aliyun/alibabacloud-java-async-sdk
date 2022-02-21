// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcemanager20200331.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteServiceLinkedRoleResponseBody</p>
 */
public class DeleteServiceLinkedRoleResponseBody extends TeaModel {
    @NameInMap("DeletionTaskId")
    private String deletionTaskId;

    @NameInMap("RequestId")
    private String requestId;

    private DeleteServiceLinkedRoleResponseBody(Builder builder) {
        this.deletionTaskId = builder.deletionTaskId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceLinkedRoleResponseBody create() {
        return builder().build();
    }

    /**
     * @return deletionTaskId
     */
    public String getDeletionTaskId() {
        return this.deletionTaskId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String deletionTaskId; 
        private String requestId; 

        /**
         * DeletionTaskId.
         */
        public Builder deletionTaskId(String deletionTaskId) {
            this.deletionTaskId = deletionTaskId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteServiceLinkedRoleResponseBody build() {
            return new DeleteServiceLinkedRoleResponseBody(this);
        } 

    } 

}
