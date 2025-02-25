// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link ModifyAccountPasswordRequest} extends {@link RequestModel}
 *
 * <p>ModifyAccountPasswordRequest</p>
 */
public class ModifyAccountPasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NewAccountPassword")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newAccountPassword;

    private ModifyAccountPasswordRequest(Builder builder) {
        super(builder);
        this.accountName = builder.accountName;
        this.clusterId = builder.clusterId;
        this.newAccountPassword = builder.newAccountPassword;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyAccountPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return newAccountPassword
     */
    public String getNewAccountPassword() {
        return this.newAccountPassword;
    }

    public static final class Builder extends Request.Builder<ModifyAccountPasswordRequest, Builder> {
        private String accountName; 
        private String clusterId; 
        private String newAccountPassword; 

        private Builder() {
            super();
        } 

        private Builder(ModifyAccountPasswordRequest request) {
            super(request);
            this.accountName = request.accountName;
            this.clusterId = request.clusterId;
            this.newAccountPassword = request.newAccountPassword;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test01</p>
         */
        public Builder accountName(String accountName) {
            this.putQueryParameter("AccountName", accountName);
            this.accountName = accountName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-bp150tns0sjxs****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder newAccountPassword(String newAccountPassword) {
            this.putQueryParameter("NewAccountPassword", newAccountPassword);
            this.newAccountPassword = newAccountPassword;
            return this;
        }

        @Override
        public ModifyAccountPasswordRequest build() {
            return new ModifyAccountPasswordRequest(this);
        } 

    } 

}
