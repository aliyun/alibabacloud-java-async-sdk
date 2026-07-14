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
 * {@link EnableNotifyPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>EnableNotifyPolicyResponseBody</p>
 */
public class EnableNotifyPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("uuid")
    private String uuid;

    private EnableNotifyPolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableNotifyPolicyResponseBody create() {
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

        private Builder(EnableNotifyPolicyResponseBody model) {
            this.requestId = model.requestId;
            this.success = model.success;
            this.uuid = model.uuid;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>0CEC5375-C554-562B-A65F-***</p>
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
         * <p>已启用的 NotifyPolicy uuid</p>
         * 
         * <strong>example:</strong>
         * <p>7076c75c-c804-461e-975f-c6f9ed5af745</p>
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public EnableNotifyPolicyResponseBody build() {
            return new EnableNotifyPolicyResponseBody(this);
        } 

    } 

}
