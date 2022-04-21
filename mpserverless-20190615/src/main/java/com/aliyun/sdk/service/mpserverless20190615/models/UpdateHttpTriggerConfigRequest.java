// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateHttpTriggerConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateHttpTriggerConfigRequest</p>
 */
public class UpdateHttpTriggerConfigRequest extends Request {
    @Body
    @NameInMap("CustomDomain")
    @Validation(maxLength = 253)
    private String customDomain;

    @Body
    @NameInMap("CustomDomainCertificate")
    private String customDomainCertificate;

    @Body
    @NameInMap("CustomDomainPrivateKey")
    private String customDomainPrivateKey;

    @Body
    @NameInMap("EnableService")
    @Validation(required = true)
    private Boolean enableService;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private UpdateHttpTriggerConfigRequest(Builder builder) {
        super(builder);
        this.customDomain = builder.customDomain;
        this.customDomainCertificate = builder.customDomainCertificate;
        this.customDomainPrivateKey = builder.customDomainPrivateKey;
        this.enableService = builder.enableService;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateHttpTriggerConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customDomain
     */
    public String getCustomDomain() {
        return this.customDomain;
    }

    /**
     * @return customDomainCertificate
     */
    public String getCustomDomainCertificate() {
        return this.customDomainCertificate;
    }

    /**
     * @return customDomainPrivateKey
     */
    public String getCustomDomainPrivateKey() {
        return this.customDomainPrivateKey;
    }

    /**
     * @return enableService
     */
    public Boolean getEnableService() {
        return this.enableService;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<UpdateHttpTriggerConfigRequest, Builder> {
        private String customDomain; 
        private String customDomainCertificate; 
        private String customDomainPrivateKey; 
        private Boolean enableService; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateHttpTriggerConfigRequest request) {
            super(request);
            this.customDomain = request.customDomain;
            this.customDomainCertificate = request.customDomainCertificate;
            this.customDomainPrivateKey = request.customDomainPrivateKey;
            this.enableService = request.enableService;
            this.spaceId = request.spaceId;
        } 

        /**
         * CustomDomain.
         */
        public Builder customDomain(String customDomain) {
            this.putBodyParameter("CustomDomain", customDomain);
            this.customDomain = customDomain;
            return this;
        }

        /**
         * CustomDomainCertificate.
         */
        public Builder customDomainCertificate(String customDomainCertificate) {
            this.putBodyParameter("CustomDomainCertificate", customDomainCertificate);
            this.customDomainCertificate = customDomainCertificate;
            return this;
        }

        /**
         * CustomDomainPrivateKey.
         */
        public Builder customDomainPrivateKey(String customDomainPrivateKey) {
            this.putBodyParameter("CustomDomainPrivateKey", customDomainPrivateKey);
            this.customDomainPrivateKey = customDomainPrivateKey;
            return this;
        }

        /**
         * EnableService.
         */
        public Builder enableService(Boolean enableService) {
            this.putBodyParameter("EnableService", enableService);
            this.enableService = enableService;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public UpdateHttpTriggerConfigRequest build() {
            return new UpdateHttpTriggerConfigRequest(this);
        } 

    } 

}
