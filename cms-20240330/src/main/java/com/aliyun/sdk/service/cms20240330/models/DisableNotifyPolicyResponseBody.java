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
 * {@link DisableNotifyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DisableNotifyPolicyResponseBody</p>
 */
public class DisableNotifyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    private DisableNotifyPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableNotifyPolicyResponseBody create() {
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

        private Builder(DisableNotifyPolicyResponseBody model) {
            this.requestId = model.requestId;
            this.success = model.success;
            this.uuid = model.uuid;
        } 

        /**
         * <p>The unique ID of the request. Used for troubleshooting and ticket tracking.</p>
         * 
         * <strong>example:</strong>
         * <p>70D52620-2609-1802-9788-6BC592C83F03</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The uuid of the notification policy that was operated on.</p>
         * 
         * <strong>example:</strong>
         * <p>04779a183add4f2ca06ab440f16cc580</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public DisableNotifyPolicyResponseBody build() {
            return new DisableNotifyPolicyResponseBody(this);
        } 

    } 

}
