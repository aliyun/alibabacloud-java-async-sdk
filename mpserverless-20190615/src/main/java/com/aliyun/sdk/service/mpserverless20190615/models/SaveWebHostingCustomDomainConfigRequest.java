// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SaveWebHostingCustomDomainConfigRequest} extends {@link RequestModel}
 *
 * <p>SaveWebHostingCustomDomainConfigRequest</p>
 */
public class SaveWebHostingCustomDomainConfigRequest extends Request {
    @Body
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Body
    @NameInMap("ForceRedirectType")
    @Validation(required = true)
    private String forceRedirectType;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private SaveWebHostingCustomDomainConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.forceRedirectType = builder.forceRedirectType;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SaveWebHostingCustomDomainConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return forceRedirectType
     */
    public String getForceRedirectType() {
        return this.forceRedirectType;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<SaveWebHostingCustomDomainConfigRequest, Builder> {
        private String domainName; 
        private String forceRedirectType; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(SaveWebHostingCustomDomainConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.forceRedirectType = request.forceRedirectType;
            this.spaceId = request.spaceId;
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
         * ForceRedirectType.
         */
        public Builder forceRedirectType(String forceRedirectType) {
            this.putBodyParameter("ForceRedirectType", forceRedirectType);
            this.forceRedirectType = forceRedirectType;
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
        public SaveWebHostingCustomDomainConfigRequest build() {
            return new SaveWebHostingCustomDomainConfigRequest(this);
        } 

    } 

}
