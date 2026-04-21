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
 * {@link HiMarketIdentityMapping} extends {@link TeaModel}
 *
 * <p>HiMarketIdentityMapping</p>
 */
public class HiMarketIdentityMapping extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("emailField")
    private String emailField;

    @com.aliyun.core.annotation.NameInMap("userIdField")
    private String userIdField;

    @com.aliyun.core.annotation.NameInMap("userNameField")
    private String userNameField;

    private HiMarketIdentityMapping(Builder builder) {
        this.emailField = builder.emailField;
        this.userIdField = builder.userIdField;
        this.userNameField = builder.userNameField;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HiMarketIdentityMapping create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return emailField
     */
    public String getEmailField() {
        return this.emailField;
    }

    /**
     * @return userIdField
     */
    public String getUserIdField() {
        return this.userIdField;
    }

    /**
     * @return userNameField
     */
    public String getUserNameField() {
        return this.userNameField;
    }

    public static final class Builder {
        private String emailField; 
        private String userIdField; 
        private String userNameField; 

        private Builder() {
        } 

        private Builder(HiMarketIdentityMapping model) {
            this.emailField = model.emailField;
            this.userIdField = model.userIdField;
            this.userNameField = model.userNameField;
        } 

        /**
         * emailField.
         */
        public Builder emailField(String emailField) {
            this.emailField = emailField;
            return this;
        }

        /**
         * userIdField.
         */
        public Builder userIdField(String userIdField) {
            this.userIdField = userIdField;
            return this;
        }

        /**
         * userNameField.
         */
        public Builder userNameField(String userNameField) {
            this.userNameField = userNameField;
            return this;
        }

        public HiMarketIdentityMapping build() {
            return new HiMarketIdentityMapping(this);
        } 

    } 

}
