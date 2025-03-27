// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link CreatePostpaidInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreatePostpaidInstanceResponseBody</p>
 */
public class CreatePostpaidInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreatePostpaidInstanceResponseBody(Builder builder) {
        this.instanceId = builder.instanceId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePostpaidInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String instanceId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreatePostpaidInstanceResponseBody model) {
            this.instanceId = model.instanceId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the WAF instance.</p>
         * 
         * <strong>example:</strong>
         * <p>waf_v2_public_cn-x0r****gr1i</p>
         */
        public Builder instanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>73A4E786-8235-50C0-9631-87C8****4A36</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreatePostpaidInstanceResponseBody build() {
            return new CreatePostpaidInstanceResponseBody(this);
        } 

    } 

}
