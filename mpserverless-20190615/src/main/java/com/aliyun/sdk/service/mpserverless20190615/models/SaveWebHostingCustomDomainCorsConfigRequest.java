// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWebHostingCustomDomainCorsConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveWebHostingCustomDomainCorsConfigRequest</p>
 */
public class SaveWebHostingCustomDomainCorsConfigRequest extends Request {
    @Body
    @NameInMap("AccessControlAllowOrigin")
    private String accessControlAllowOrigin;

    @Body
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Body
    @NameInMap("EnableCors")
    @Validation(required = true)
    private Boolean enableCors;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private SaveWebHostingCustomDomainCorsConfigRequest(Builder builder) {
        super(builder);
        this.accessControlAllowOrigin = builder.accessControlAllowOrigin;
        this.domainName = builder.domainName;
        this.enableCors = builder.enableCors;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWebHostingCustomDomainCorsConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessControlAllowOrigin
     */
    public String getAccessControlAllowOrigin() {
        return this.accessControlAllowOrigin;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return enableCors
     */
    public Boolean getEnableCors() {
        return this.enableCors;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<SaveWebHostingCustomDomainCorsConfigRequest, Builder> {
        private String accessControlAllowOrigin; 
        private String domainName; 
        private Boolean enableCors; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(SaveWebHostingCustomDomainCorsConfigRequest request) {
            super(request);
            this.accessControlAllowOrigin = request.accessControlAllowOrigin;
            this.domainName = request.domainName;
            this.enableCors = request.enableCors;
            this.spaceId = request.spaceId;
        } 

        /**
         * AccessControlAllowOrigin.
         */
        public Builder accessControlAllowOrigin(String accessControlAllowOrigin) {
            this.putBodyParameter("AccessControlAllowOrigin", accessControlAllowOrigin);
            this.accessControlAllowOrigin = accessControlAllowOrigin;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * EnableCors.
         */
        public Builder enableCors(Boolean enableCors) {
            this.putBodyParameter("EnableCors", enableCors);
            this.enableCors = enableCors;
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
        public SaveWebHostingCustomDomainCorsConfigRequest build() {
            return new SaveWebHostingCustomDomainCorsConfigRequest(this);
        } 

    } 

}
