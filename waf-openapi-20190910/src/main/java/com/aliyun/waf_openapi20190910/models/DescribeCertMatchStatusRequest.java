// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCertMatchStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeCertMatchStatusRequest</p>
 */
public class DescribeCertMatchStatusRequest extends Request {
    @Query
    @NameInMap("Certificate")
    private String certificate;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("PrivateKey")
    private String privateKey;


    private DescribeCertMatchStatusRequest(Builder builder) {
        super(builder);
        this.certificate = builder.certificate;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
        this.privateKey = builder.privateKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCertMatchStatusRequest create() {
        return builder().build();
    }

    /**
     * @return certificate
     */
    public String getCertificate() {
        return this.certificate;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return privateKey
     */
    public String getPrivateKey() {
        return this.privateKey;
    }

    public static final class Builder extends Request.Builder {
        private String certificate; 
        private String domain; 
        private String instanceId; 
        private String privateKey; 

        /**
         * <p>Certificate.</p>
         */
        public Builder certificate(String certificate) {
            this.putQueryParameter("Certificate", certificate);
            this.certificate = certificate;
            return this;
        }

        /**
         * <p>Domain.</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>InstanceId.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>PrivateKey.</p>
         */
        public Builder privateKey(String privateKey) {
            this.putQueryParameter("PrivateKey", privateKey);
            this.privateKey = privateKey;
            return this;
        }

        public DescribeCertMatchStatusRequest build() {
            return new DescribeCertMatchStatusRequest(this);
        } 

    } 

}
