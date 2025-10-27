// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.push20160801.models;

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
 * {@link PushV2Request} extends {@link RequestModel}
 *
 * <p>PushV2Request</p>
 */
public class PushV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdempotentToken")
    @com.aliyun.core.annotation.Validation(maxLength = 36, minLength = 36)
    private String idempotentToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushTask")
    @com.aliyun.core.annotation.Validation(required = true)
    private PushTask pushTask;

    private PushV2Request(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.idempotentToken = builder.idempotentToken;
        this.pushTask = builder.pushTask;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushV2Request create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public Long getAppKey() {
        return this.appKey;
    }

    /**
     * @return idempotentToken
     */
    public String getIdempotentToken() {
        return this.idempotentToken;
    }

    /**
     * @return pushTask
     */
    public PushTask getPushTask() {
        return this.pushTask;
    }

    public static final class Builder extends Request.Builder<PushV2Request, Builder> {
        private Long appKey; 
        private String idempotentToken; 
        private PushTask pushTask; 

        private Builder() {
            super();
        } 

        private Builder(PushV2Request request) {
            super(request);
            this.appKey = request.appKey;
            this.idempotentToken = request.idempotentToken;
            this.pushTask = request.pushTask;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>****530646</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * IdempotentToken.
         */
        public Builder idempotentToken(String idempotentToken) {
            this.putQueryParameter("IdempotentToken", idempotentToken);
            this.idempotentToken = idempotentToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder pushTask(PushTask pushTask) {
            String pushTaskShrink = shrink(pushTask, "PushTask", "json");
            this.putQueryParameter("PushTask", pushTaskShrink);
            this.pushTask = pushTask;
            return this;
        }

        @Override
        public PushV2Request build() {
            return new PushV2Request(this);
        } 

    } 

}
