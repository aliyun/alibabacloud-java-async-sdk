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
 * {@link DeleteNotifyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteNotifyPolicyResponseBody</p>
 */
public class DeleteNotifyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    private DeleteNotifyPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNotifyPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private String requestId; 
        private Boolean success; 
        private String uuid; 

        private Builder() {
        } 

        private Builder(DeleteNotifyPolicyResponseBody model) {
            this.requestId = model.requestId;
            this.success = model.success;
            this.uuid = model.uuid;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>已删除 NotifyPolicy 的 uuid</p>
         * 
         * <strong>example:</strong>
         * <p>np-12345678-1234-1234-1234-123456789012</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public DeleteNotifyPolicyResponseBody build() {
            return new DeleteNotifyPolicyResponseBody(this);
        } 

    } 

}
