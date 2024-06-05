// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Identity} extends {@link TeaModel}
 *
 * <p>Identity</p>
 */
public class Identity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("identity_id")
    private String identityId;

    @com.aliyun.core.annotation.NameInMap("identity_type")
    private String identityType;

    private Identity(Builder builder) {
        this.identityId = builder.identityId;
        this.identityType = builder.identityType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Identity create() {
        return builder().build();
    }

    /**
     * @return identityId
     */
    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    public static final class Builder {
        private String identityId; 
        private String identityType; 

        /**
         * identity_id.
         */
        public Builder identityId(String identityId) {
            this.identityId = identityId;
            return this;
        }

        /**
         * identity_type.
         */
        public Builder identityType(String identityType) {
            this.identityType = identityType;
            return this;
        }

        public Identity build() {
            return new Identity(this);
        } 

    } 

}
