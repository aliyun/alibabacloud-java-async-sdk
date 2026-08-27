// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteServiceLinkedRoleResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteServiceLinkedRoleResponseBody</p>
 */
public class DeleteServiceLinkedRoleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeletionTaskId")
    private String deletionTaskId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DeleteServiceLinkedRoleResponseBody model) {
            this.deletionTaskId = model.deletionTaskId;
            this.requestId = model.requestId;
        } 

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
