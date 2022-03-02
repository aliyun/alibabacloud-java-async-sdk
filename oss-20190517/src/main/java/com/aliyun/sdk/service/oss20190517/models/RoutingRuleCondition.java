// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

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
         * A short description of struct
         */
        public Builder httpErrorCodeReturnedEquals(Long httpErrorCodeReturnedEquals) {
            this.httpErrorCodeReturnedEquals = httpErrorCodeReturnedEquals;
            return this;
        }

        /**
         * A short description of struct
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
