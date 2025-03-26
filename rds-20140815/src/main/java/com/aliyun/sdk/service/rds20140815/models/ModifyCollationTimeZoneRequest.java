// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyCollationTimeZoneRequest} extends {@link RequestModel}
 *
 * <p>ModifyCollationTimeZoneRequest</p>
 */
public class ModifyCollationTimeZoneRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collation")
    private String collation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerAccount")
    private String resourceOwnerAccount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    private ModifyCollationTimeZoneRequest(Builder builder) {
        super(builder);
        this.collation = builder.collation;
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.resourceOwnerAccount = builder.resourceOwnerAccount;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.timezone = builder.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCollationTimeZoneRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collation
     */
    public String getCollation() {
        return this.collation;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceOwnerAccount
     */
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    public static final class Builder extends Request.Builder<ModifyCollationTimeZoneRequest, Builder> {
        private String collation; 
        private String DBInstanceId; 
        private Long ownerId; 
        private String resourceOwnerAccount; 
        private Long resourceOwnerId; 
        private String timezone; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCollationTimeZoneRequest request) {
            super(request);
            this.collation = request.collation;
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.resourceOwnerAccount = request.resourceOwnerAccount;
            this.resourceOwnerId = request.resourceOwnerId;
            this.timezone = request.timezone;
        } 

        /**
         * <p>The character set collation of the instance. By default, the system does not modify the character set collation of the instance. Valid values:</p>
         * <ul>
         * <li><strong>Chinese_PRC_CI_AS</strong></li>
         * <li><strong>Chinese_PRC_CS_AS</strong></li>
         * <li><strong>Chinese_PRC_BIN</strong></li>
         * <li><strong>Latin1_General_CI_AS</strong></li>
         * <li><strong>Latin1_General_CS_AS</strong></li>
         * <li><strong>SQL_Latin1_General_CP1_CI_AS</strong></li>
         * <li><strong>SQL_Latin1_General_CP1_CS_AS</strong></li>
         * <li><strong>Japanese_CI_AS</strong></li>
         * <li><strong>Japanese_CS_AS</strong></li>
         * <li><strong>Chinese_Taiwan_Stroke_CI_AS</strong></li>
         * <li><strong>Chinese_Taiwan_Stroke_CS_AS</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>The default character set collation of the instance is <strong>Chinese_PRC_CI_AS</strong>.</li>
         * <li>You must specify one of the <strong>Collation</strong> and <strong>Timezone</strong> parameters.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Latin1_General_CI_AS</p>
         */
        public Builder collation(String collation) {
            this.putQueryParameter("Collation", collation);
            this.collation = collation;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ResourceOwnerAccount.
         */
        public Builder resourceOwnerAccount(String resourceOwnerAccount) {
            this.putQueryParameter("ResourceOwnerAccount", resourceOwnerAccount);
            this.resourceOwnerAccount = resourceOwnerAccount;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The time zone of the instance. By default, the system does not modify the time zone.</p>
         * <blockquote>
         * <ul>
         * <li>The default time zone of the instance is <strong>China Standard Time</strong>.</li>
         * <li>You must specify one of the <strong>Collation</strong> and <strong>Timezone</strong> parameters.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>China Standard Time</p>
         */
        public Builder timezone(String timezone) {
            this.putQueryParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        @Override
        public ModifyCollationTimeZoneRequest build() {
            return new ModifyCollationTimeZoneRequest(this);
        } 

    } 

}
