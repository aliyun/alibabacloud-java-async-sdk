// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link DeleteContextResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteContextResponseBody</p>
 */
public class DeleteContextResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contextId")
    private String contextId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private DeleteContextResponseBody(Builder builder) {
        this.contextId = builder.contextId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteContextResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contextId
     */
    public String getContextId() {
        return this.contextId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String contextId; 
        private String requestId; 
        private String status; 

        private Builder() {
        } 

        private Builder(DeleteContextResponseBody model) {
            this.contextId = model.contextId;
            this.requestId = model.requestId;
            this.status = model.status;
        } 

        /**
         * contextId.
         */
        public Builder contextId(String contextId) {
            this.contextId = contextId;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DeleteContextResponseBody build() {
            return new DeleteContextResponseBody(this);
        } 

    } 

}
