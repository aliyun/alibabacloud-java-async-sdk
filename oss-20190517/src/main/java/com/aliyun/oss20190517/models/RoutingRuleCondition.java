// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link RoutingRuleCondition} extends {@link TeaModel}
 *
 * <p>RoutingRuleCondition</p>
 */
public class RoutingRuleCondition extends TeaModel {
    @NameInMap("HttpErrorCodeReturnedEquals")
    private Long httpErrorCodeReturnedEquals;

    @NameInMap("KeyPrefixEquals")
    private String keyPrefixEquals;


    private RoutingRuleCondition(Builder builder) {
        this.httpErrorCodeReturnedEquals = builder.httpErrorCodeReturnedEquals;
        this.keyPrefixEquals = builder.keyPrefixEquals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RoutingRuleCondition create() {
        return builder().build();
    }

    /**
     * @return httpErrorCodeReturnedEquals
     */
    public Long getHttpErrorCodeReturnedEquals() {
        return this.httpErrorCodeReturnedEquals;
    }

    /**
     * @return keyPrefixEquals
     */
    public String getKeyPrefixEquals() {
        return this.keyPrefixEquals;
    }

    public static final class Builder {
        private Long httpErrorCodeReturnedEquals; 
        private String keyPrefixEquals; 

        /**
         * <p>A short description of struct</p>
         */
        public Builder httpErrorCodeReturnedEquals(Long httpErrorCodeReturnedEquals) {
            this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
            return this;
        }

        /**
         * <p>A short description of struct</p>
         */
        public Builder keyPrefixEquals(String keyPrefixEquals) {
            this.keyPrefixEquals = keyPrefixEquals;
            return this;
        }

        public RoutingRuleCondition build() {
            return new RoutingRuleCondition(this);
        } 

    } 

}
