// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link AiTokenRateLimitConfigRule} extends {@link TeaModel}
 *
 * <p>AiTokenRateLimitConfigRule</p>
 */
public class AiTokenRateLimitConfigRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("limitMode")
    private String limitMode;

    @com.aliyun.core.annotation.NameInMap("limitType")
    private String limitType;

    @com.aliyun.core.annotation.NameInMap("limitValue")
    private Integer limitValue;

    @com.aliyun.core.annotation.NameInMap("matchKey")
    private String matchKey;

    @com.aliyun.core.annotation.NameInMap("matchType")
    private String matchType;

    @com.aliyun.core.annotation.NameInMap("matchValue")
    private String matchValue;

    private AiTokenRateLimitConfigRule(Builder builder) {
        this.limitMode = builder.limitMode;
        this.limitType = builder.limitType;
        this.limitValue = builder.limitValue;
        this.matchKey = builder.matchKey;
        this.matchType = builder.matchType;
        this.matchValue = builder.matchValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AiTokenRateLimitConfigRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return limitMode
     */
    public String getLimitMode() {
        return this.limitMode;
    }

    /**
     * @return limitType
     */
    public String getLimitType() {
        return this.limitType;
    }

    /**
     * @return limitValue
     */
    public Integer getLimitValue() {
        return this.limitValue;
    }

    /**
     * @return matchKey
     */
    public String getMatchKey() {
        return this.matchKey;
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
    }

    /**
     * @return matchValue
     */
    public String getMatchValue() {
        return this.matchValue;
    }

    public static final class Builder {
        private String limitMode; 
        private String limitType; 
        private Integer limitValue; 
        private String matchKey; 
        private String matchType; 
        private String matchValue; 

        private Builder() {
        } 

        private Builder(AiTokenRateLimitConfigRule model) {
            this.limitMode = model.limitMode;
            this.limitType = model.limitType;
            this.limitValue = model.limitValue;
            this.matchKey = model.matchKey;
            this.matchType = model.matchType;
            this.matchValue = model.matchValue;
        } 

        /**
         * limitMode.
         */
        public Builder limitMode(String limitMode) {
            this.limitMode = limitMode;
            return this;
        }

        /**
         * limitType.
         */
        public Builder limitType(String limitType) {
            this.limitType = limitType;
            return this;
        }

        /**
         * limitValue.
         */
        public Builder limitValue(Integer limitValue) {
            this.limitValue = limitValue;
            return this;
        }

        /**
         * matchKey.
         */
        public Builder matchKey(String matchKey) {
            this.matchKey = matchKey;
            return this;
        }

        /**
         * matchType.
         */
        public Builder matchType(String matchType) {
            this.matchType = matchType;
            return this;
        }

        /**
         * matchValue.
         */
        public Builder matchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }

        public AiTokenRateLimitConfigRule build() {
            return new AiTokenRateLimitConfigRule(this);
        } 

    } 

}
