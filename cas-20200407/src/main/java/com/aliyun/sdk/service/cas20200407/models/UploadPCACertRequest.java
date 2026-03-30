// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cas20200407.models;

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
 * {@link UploadPCACertRequest} extends {@link RequestModel}
 *
 * <p>UploadPCACertRequest</p>
 */
public class UploadPCACertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cert")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cert;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrivateKey")
    private String privateKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WarehouseId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         *     <RequestId>15C66C7B-671A-4297-9187-2C4477247A74</RequestId>
         * </UploadPCACertResponse>
         * 
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE----- MIIEJDCCAwygAwIBAgIQITRHItTLTQizTyd3K7AMRTANBgkqhkiG9w0BAQsFADBe **************** 5/akmr2GK/Y= -----END CERTIFICATE----- -----BEGIN CERTIFICATE----- MIIDuzCCAqOgAwIBAgIQSEIWDPfWTDKZcWNyL2O+fjANBgkqhkiG9w0BAQsFADBf **************** URUHyMW5Qd5Q9g6Y4sDOIm6It9TF7EjpwMs42R30agcRYzuUsN72ZFBYFJwnBX8= -----END CERTIFICATE----- -----BEGIN CERTIFICATE----- MIIDizCCAnOgAwIBAgIRAMfjPkDKfELTo07l3A3cUSYwDQYJKoZIhvcNAQELBQAw ********* CjWTnYPhCcO2uIcnqMt7zCVs5LXBK/XSwlAXKMvKT0uuzw9VxeMfEabflKu0By8= -----END CERTIFICATE-----</p>
         */
        public Builder cert(String cert) {
            this.putQueryParameter("Cert", cert);
            this.cert = cert;
            return this;
        }

        /**
         * <p>UploadPCACert</p>
         * 
         * <strong>example:</strong>
         * <p>cert_name</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>Uploads a private certificate to a certificate repository.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN RSA PRIVATE KEY----- MIIEowIBAAKCAQEA5SIfpNCBoiDrZhX1H39CHwQMVD0kBNeBTWfP9xkeesvfzbOz ******* POVNFfDf9h7pJtQ5fRZNTYTDs/d+cH62Z3+nS74mNnEfff0nkvne -----END RSA PRIVATE KEY-----</p>
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        /**
         * <p>The ID of the repository.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/455805.html">ListCertWarehouse</a> operation to query the ID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
