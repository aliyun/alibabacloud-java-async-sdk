// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateAdditionalCertificatesWithListenerRequest} extends {@link RequestModel}
 *
 * <p>AssociateAdditionalCertificatesWithListenerRequest</p>
 */
public class AssociateAdditionalCertificatesWithListenerRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("Certificates")
    @Validation(required = true)
    private java.util.List < Certificates> certificates;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AssociateAdditionalCertificatesWithListenerRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.certificates = builder.certificates;
        this.clientToken = builder.clientToken;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateAdditionalCertificatesWithListenerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return certificates
     */
    public java.util.List < Certificates> getCertificates() {
        return this.certificates;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AssociateAdditionalCertificatesWithListenerRequest, Builder> {
        private String acceleratorId; 
        private java.util.List < Certificates> certificates; 
        private String clientToken; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AssociateAdditionalCertificatesWithListenerRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.certificates = response.certificates;
            this.clientToken = response.clientToken;
            this.listenerId = response.listenerId;
            this.regionId = response.regionId;
        } 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * Certificates.
         */
        public Builder certificates(java.util.List < Certificates> certificates) {
            this.putQueryParameter("Certificates", certificates);
            this.certificates = certificates;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * ListenerId.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
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
        public AssociateAdditionalCertificatesWithListenerRequest build() {
            return new AssociateAdditionalCertificatesWithListenerRequest(this);
        } 

    } 

    public static class Certificates extends TeaModel {
        @NameInMap("Domain")
        @Validation(required = true)
        private String domain;

        @NameInMap("Id")
        @Validation(required = true)
        private String id;

        private Certificates(Builder builder) {
            this.domain = builder.domain;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Certificates create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private String domain; 
            private String id; 

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public Certificates build() {
                return new Certificates(this);
            } 

        } 

    }
}
