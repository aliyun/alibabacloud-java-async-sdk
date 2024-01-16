// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadPCACertRequest} extends {@link RequestModel}
 *
 * <p>UploadPCACertRequest</p>
 */
public class UploadPCACertRequest extends Request {
    @Query
    @NameInMap("Cert")
    @Validation(required = true)
    private String cert;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PrivateKey")
    private String privateKey;

    @Query
    @NameInMap("WarehouseId")
    @Validation(required = true)
    private Long warehouseId;

    private UploadPCACertRequest(Builder builder) {
        super(builder);
        this.cert = builder.cert;
        this.name = builder.name;
        this.privateKey = builder.privateKey;
        this.warehouseId = builder.warehouseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadPCACertRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cert
     */
    public String getCert() {
        return this.cert;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * @return warehouseId
     */
    public Long getWarehouseId() {
        return this.warehouseId;
    }

    public static final class Builder extends Request.Builder<UploadPCACertRequest, Builder> {
        private String cert; 
        private String name; 
        private String privateKey; 
        private Long warehouseId; 

        private Builder() {
            super();
        } 

        private Builder(UploadPCACertRequest request) {
            super(request);
            this.cert = request.cert;
            this.name = request.name;
            this.privateKey = request.privateKey;
            this.warehouseId = request.warehouseId;
        } 

        /**
         * <UploadPCACertResponse>
         * <p>
         *     <RequestId>15C66C7B-671A-4297-9187-2C4477247A74</RequestId>
         * </UploadPCACertResponse>
         */
        public Builder cert(String cert) {
            this.putQueryParameter("Cert", cert);
            this.cert = cert;
            return this;
        }

        /**
         * UploadPCACert
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * Uploads a private certificate to a certificate repository.
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * {
         * <p>
         *     "RequestId": "15C66C7B-671A-4297-9187-2C4477247A74"
         * }
         */
        public Builder warehouseId(Long warehouseId) {
            this.putQueryParameter("WarehouseId", warehouseId);
            this.warehouseId = warehouseId;
            return this;
        }

        @Override
        public UploadPCACertRequest build() {
            return new UploadPCACertRequest(this);
        } 

    } 

}
