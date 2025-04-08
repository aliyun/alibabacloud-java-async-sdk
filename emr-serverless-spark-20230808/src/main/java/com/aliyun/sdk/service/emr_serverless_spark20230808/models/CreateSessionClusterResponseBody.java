// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateSessionClusterResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSessionClusterResponseBody</p>
 */
public class CreateSessionClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sessionClusterId")
    private String sessionClusterId;

    private CreateSessionClusterResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sessionClusterId = builder.sessionClusterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSessionClusterResponseBody create() {
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
     * @return sessionClusterId
     */
    public String getSessionClusterId() {
        return this.sessionClusterId;
    }

    public static final class Builder {
        private String requestId; 
        private String sessionClusterId; 

        private Builder() {
        } 

        private Builder(CreateSessionClusterResponseBody model) {
            this.requestId = model.requestId;
            this.sessionClusterId = model.sessionClusterId;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-******</p>
         */
        public Builder sessionClusterId(String sessionClusterId) {
            this.sessionClusterId = sessionClusterId;
            return this;
        }

        public CreateSessionClusterResponseBody build() {
            return new CreateSessionClusterResponseBody(this);
        } 

    } 

}
