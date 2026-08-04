// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link IncrByCacheOperateSyncRequest} extends {@link RequestModel}
 *
 * <p>IncrByCacheOperateSyncRequest</p>
 */
public class IncrByCacheOperateSyncRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DefaultValue")
    private Integer defaultValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireSeconds")
    private Integer expireSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Step")
    private Integer step;

    private IncrByCacheOperateSyncRequest(Builder builder) {
        super(builder);
        this.defaultValue = builder.defaultValue;
        this.expireSeconds = builder.expireSeconds;
        this.key = builder.key;
        this.step = builder.step;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IncrByCacheOperateSyncRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return defaultValue
     */
    public Integer getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return expireSeconds
     */
    public Integer getExpireSeconds() {
        return this.expireSeconds;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return step
     */
    public Integer getStep() {
        return this.step;
    }

    public static final class Builder extends Request.Builder<IncrByCacheOperateSyncRequest, Builder> {
        private Integer defaultValue; 
        private Integer expireSeconds; 
        private String key; 
        private Integer step; 

        private Builder() {
            super();
        } 

        private Builder(IncrByCacheOperateSyncRequest request) {
            super(request);
            this.defaultValue = request.defaultValue;
            this.expireSeconds = request.expireSeconds;
            this.key = request.key;
            this.step = request.step;
        } 

        /**
         * DefaultValue.
         */
        public Builder defaultValue(Integer defaultValue) {
            this.putQueryParameter("DefaultValue", defaultValue);
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * ExpireSeconds.
         */
        public Builder expireSeconds(Integer expireSeconds) {
            this.putQueryParameter("ExpireSeconds", expireSeconds);
            this.expireSeconds = expireSeconds;
            return this;
        }

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putQueryParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * Step.
         */
        public Builder step(Integer step) {
            this.putQueryParameter("Step", step);
            this.step = step;
            return this;
        }

        @Override
        public IncrByCacheOperateSyncRequest build() {
            return new IncrByCacheOperateSyncRequest(this);
        } 

    } 

}
