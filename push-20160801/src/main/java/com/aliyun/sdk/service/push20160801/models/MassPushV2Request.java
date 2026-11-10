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
 * {@link MassPushV2Request} extends {@link RequestModel}
 *
 * <p>MassPushV2Request</p>
 */
public class MassPushV2Request extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long appKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IdempotentToken")
    @com.aliyun.core.annotation.Validation(maxLength = 36, minLength = 36)
    private String idempotentToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PushTasks")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<PushTask> pushTasks;

    private MassPushV2Request(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.idempotentToken = builder.idempotentToken;
        this.pushTasks = builder.pushTasks;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MassPushV2Request create() {
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
     * @return pushTasks
     */
    public java.util.List<PushTask> getPushTasks() {
        return this.pushTasks;
    }

    public static final class Builder extends Request.Builder<MassPushV2Request, Builder> {
        private Long appKey; 
        private String idempotentToken; 
        private java.util.List<PushTask> pushTasks; 

        private Builder() {
            super();
        } 

        private Builder(MassPushV2Request request) {
            super(request);
            this.appKey = request.appKey;
            this.idempotentToken = request.idempotentToken;
            this.pushTasks = request.pushTasks;
        } 

        /**
         * <p>The AppKey information.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>23267***</p>
         */
        public Builder appKey(Long appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * <p>An idempotent parameter used to prevent duplicate pushes caused by API call retries on the client side. If the same IdempotentToken is used for calls within 15 minutes, only one push is performed, and subsequent calls return the result of the first successful push.</p>
         * <blockquote>
         * <ul>
         * <li>The parameter format is a standard 36-character UUID (8-4-4-4-12). Each valid character is a hexadecimal digit in the range 0-9 or a-f, case-insensitive.</li>
         * <li>This parameter only prevents duplicate pushes caused by retries. It cannot prevent duplicate pushes caused by concurrent calls.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>c8016d13-6e76-****-9bda-769383d11787</p>
         */
        public Builder idempotentToken(String idempotentToken) {
            this.putQueryParameter("IdempotentToken", idempotentToken);
            this.idempotentToken = idempotentToken;
            return this;
        }

        /**
         * <p>The batch push tasks.</p>
         * <p>This parameter is required.</p>
         */
        public Builder pushTasks(java.util.List<PushTask> pushTasks) {
            String pushTasksShrink = shrink(pushTasks, "PushTasks", "json");
            this.putQueryParameter("PushTasks", pushTasksShrink);
            this.pushTasks = pushTasks;
            return this;
        }

        @Override
        public MassPushV2Request build() {
            return new MassPushV2Request(this);
        } 

    } 

}
