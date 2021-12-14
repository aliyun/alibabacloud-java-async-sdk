// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link CreateCertificateByCertificateIdRequest} extends {@link RequestModel}
 *
 * <p>CreateCertificateByCertificateIdRequest</p>
 */
public class CreateCertificateByCertificateIdRequest extends Request {
    @Query
    @NameInMap("CertificateId")
    private Long certificateId;

    @Query
    @NameInMap("Domain")
    private String domain;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;


    private CreateCertificateByCertificateIdRequest(Builder builder) {
        super(builder);
        this.certificateId = builder.certificateId;
        this.domain = builder.domain;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCertificateByCertificateIdRequest create() {
        return builder().build();
    }

    /**
     * @return certificateId
     */
    public Long getCertificateId() {
        return this.certificateId;
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

    public static final class Builder extends Request.Builder {
        private Long certificateId; 
        private String domain; 
        private String instanceId; 

        /**
         * <p>CertificateId.</p>
         */
        public Builder certificateId(Long certificateId) {
            this.putQueryParameter("CertificateId", certificateId);
            this.certificateId = certificateId;
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

        public CreateCertificateByCertificateIdRequest build() {
            return new CreateCertificateByCertificateIdRequest(this);
        } 

    } 

}
