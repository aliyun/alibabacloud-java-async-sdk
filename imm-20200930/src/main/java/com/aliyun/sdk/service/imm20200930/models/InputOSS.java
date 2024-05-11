// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InputOSS} extends {@link TeaModel}
 *
 * <p>InputOSS</p>
 */
public class InputOSS extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Bucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("MatchExpressions")
    private java.util.List < String > matchExpressions;

    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    private InputOSS(Builder builder) {
        this.bucket = builder.bucket;
        this.matchExpressions = builder.matchExpressions;
        this.prefix = builder.prefix;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InputOSS create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return matchExpressions
     */
    public java.util.List < String > getMatchExpressions() {
        return this.matchExpressions;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    public static final class Builder {
        private String bucket; 
        private java.util.List < String > matchExpressions; 
        private String prefix; 

        /**
         * Bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * MatchExpressions.
         */
        public Builder matchExpressions(java.util.List < String > matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * Prefix.
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        public InputOSS build() {
            return new InputOSS(this);
        } 

    } 

}
