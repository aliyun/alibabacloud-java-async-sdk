// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDBInstanceSSLRequest} extends {@link RequestModel}
 *
 * <p>UpdateDBInstanceSSLRequest</p>
 */
public class UpdateDBInstanceSSLRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CertCommonName")
    private String certCommonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSSL")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableSSL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpdateDBInstanceSSLRequest(Builder builder) {
        super(builder);
        this.certCommonName = builder.certCommonName;
        this.DBInstanceName = builder.DBInstanceName;
        this.enableSSL = builder.enableSSL;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDBInstanceSSLRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return certCommonName
     */
    public String getCertCommonName() {
        return this.certCommonName;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return enableSSL
     */
    public Boolean getEnableSSL() {
        return this.enableSSL;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateDBInstanceSSLRequest, Builder> {
        private String certCommonName; 
        private String DBInstanceName; 
        private Boolean enableSSL; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDBInstanceSSLRequest request) {
            super(request);
            this.certCommonName = request.certCommonName;
            this.DBInstanceName = request.DBInstanceName;
            this.enableSSL = request.enableSSL;
            this.regionId = request.regionId;
        } 

        /**
         * CertCommonName.
         */
        public Builder certCommonName(String certCommonName) {
            this.putQueryParameter("CertCommonName", certCommonName);
            this.certCommonName = certCommonName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzjasd****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSSL(Boolean enableSSL) {
            this.putQueryParameter("EnableSSL", enableSSL);
            this.enableSSL = enableSSL;
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
        public UpdateDBInstanceSSLRequest build() {
            return new UpdateDBInstanceSSLRequest(this);
        } 

    } 

}
