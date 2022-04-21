// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyWebHostingDomainOwnerRequest} extends {@link RequestModel}
 *
 * <p>VerifyWebHostingDomainOwnerRequest</p>
 */
public class VerifyWebHostingDomainOwnerRequest extends Request {
    @Body
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    @Body
    @NameInMap("VerifyType")
    @Validation(required = true)
    private String verifyType;

    private VerifyWebHostingDomainOwnerRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.spaceId = builder.spaceId;
        this.verifyType = builder.verifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyWebHostingDomainOwnerRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return verifyType
     */
    public String getVerifyType() {
        return this.verifyType;
    }

    public static final class Builder extends Request.Builder<VerifyWebHostingDomainOwnerRequest, Builder> {
        private String domain; 
        private String spaceId; 
        private String verifyType; 

        private Builder() {
            super();
        } 

        private Builder(VerifyWebHostingDomainOwnerRequest request) {
            super(request);
            this.domain = request.domain;
            this.spaceId = request.spaceId;
            this.verifyType = request.verifyType;
        } 

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("Domain", domain);
            this.domain = domain;
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

        /**
         * VerifyType.
         */
        public Builder verifyType(String verifyType) {
            this.putBodyParameter("VerifyType", verifyType);
            this.verifyType = verifyType;
            return this;
        }

        @Override
        public VerifyWebHostingDomainOwnerRequest build() {
            return new VerifyWebHostingDomainOwnerRequest(this);
        } 

    } 

}
