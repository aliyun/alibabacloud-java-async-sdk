// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20220101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ResetAccountPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetAccountPasswordRequest</p>
 */
public class ResetAccountPasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Account")
    @com.aliyun.core.annotation.Validation(required = true)
    private String account;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PasswordSha256Hex")
    private String passwordSha256Hex;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ResetAccountPasswordRequest(Builder builder) {
        super(builder);
        this.account = builder.account;
        this.DBClusterId = builder.DBClusterId;
        this.password = builder.password;
        this.passwordSha256Hex = builder.passwordSha256Hex;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetAccountPasswordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return account
     */
    public String getAccount() {
        return this.account;
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return passwordSha256Hex
     */
    public String getPasswordSha256Hex() {
        return this.passwordSha256Hex;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ResetAccountPasswordRequest, Builder> {
        private String account; 
        private String DBClusterId; 
        private String password; 
        private String passwordSha256Hex; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResetAccountPasswordRequest request) {
            super(request);
            this.account = request.account;
            this.DBClusterId = request.DBClusterId;
            this.password = request.password;
            this.passwordSha256Hex = request.passwordSha256Hex;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder account(String account) {
            this.putQueryParameter("Account", account);
            this.account = account;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cc-bp108z124a8o7****</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * Password.
         */
        public Builder password(String password) {
            this.putQueryParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * PasswordSha256Hex.
         */
        public Builder passwordSha256Hex(String passwordSha256Hex) {
            this.putQueryParameter("PasswordSha256Hex", passwordSha256Hex);
            this.passwordSha256Hex = passwordSha256Hex;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ResetAccountPasswordRequest build() {
            return new ResetAccountPasswordRequest(this);
        } 

    } 

}
