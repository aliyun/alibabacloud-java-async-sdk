// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Principal} extends {@link TeaModel}
 *
 * <p>Principal</p>
 */
public class Principal extends TeaModel {
    @NameInMap("PrincipalArn")
    private String principalArn;

    private Principal(Builder builder) {
        this.principalArn = builder.principalArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Principal create() {
        return builder().build();
    }

    /**
     * @return principalArn
     */
    public String getPrincipalArn() {
        return this.principalArn;
    }

    public static final class Builder {
        private String principalArn; 

        /**
         * PrincipalArn.
         */
        public Builder principalArn(String principalArn) {
            this.principalArn = principalArn;
            return this;
        }

        public Principal build() {
            return new Principal(this);
        } 

    } 

}
