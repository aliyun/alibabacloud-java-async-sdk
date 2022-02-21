// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDBInstanceTDERequest} extends {@link RequestModel}
 *
 * <p>UpdateDBInstanceTDERequest</p>
 */
public class UpdateDBInstanceTDERequest extends Request {
    @Query
    @NameInMap("DBInstanceName")
    @Validation(required = true)
    private String DBInstanceName;

    @Query
    @NameInMap("EncryptionKey")
    private String encryptionKey;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("RoleArn")
    private String roleArn;

    @Query
    @NameInMap("TDEStatus")
    @Validation(required = true)
    private Integer TDEStatus;

    private UpdateDBInstanceTDERequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.encryptionKey = builder.encryptionKey;
        this.regionId = builder.regionId;
        this.roleArn = builder.roleArn;
        this.TDEStatus = builder.TDEStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDBInstanceTDERequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return encryptionKey
     */
    public String getEncryptionKey() {
        return this.encryptionKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleArn
     */
    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * @return TDEStatus
     */
    public Integer getTDEStatus() {
        return this.TDEStatus;
    }

    public static final class Builder extends Request.Builder<UpdateDBInstanceTDERequest, Builder> {
        private String DBInstanceName; 
        private String encryptionKey; 
        private String regionId; 
        private String roleArn; 
        private Integer TDEStatus; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDBInstanceTDERequest response) {
            super(response);
            this.DBInstanceName = response.DBInstanceName;
            this.encryptionKey = response.encryptionKey;
            this.regionId = response.regionId;
            this.roleArn = response.roleArn;
            this.TDEStatus = response.TDEStatus;
        } 

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * EncryptionKey.
         */
        public Builder encryptionKey(String encryptionKey) {
            this.putQueryParameter("EncryptionKey", encryptionKey);
            this.encryptionKey = encryptionKey;
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

        /**
         * RoleArn.
         */
        public Builder roleArn(String roleArn) {
            this.putQueryParameter("RoleArn", roleArn);
            this.roleArn = roleArn;
            return this;
        }

        /**
         * TDEStatus.
         */
        public Builder TDEStatus(Integer TDEStatus) {
            this.putQueryParameter("TDEStatus", TDEStatus);
            this.TDEStatus = TDEStatus;
            return this;
        }

        @Override
        public UpdateDBInstanceTDERequest build() {
            return new UpdateDBInstanceTDERequest(this);
        } 

    } 

}
