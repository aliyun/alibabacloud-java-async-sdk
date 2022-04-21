// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWebHostingCertificateDetailRequest} extends {@link RequestModel}
 *
 * <p>GetWebHostingCertificateDetailRequest</p>
 */
public class GetWebHostingCertificateDetailRequest extends Request {
    @Body
    @NameInMap("CustomDomain")
    @Validation(required = true)
    private String customDomain;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private GetWebHostingCertificateDetailRequest(Builder builder) {
        super(builder);
        this.customDomain = builder.customDomain;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWebHostingCertificateDetailRequest create() {
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
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<GetWebHostingCertificateDetailRequest, Builder> {
        private String customDomain; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetWebHostingCertificateDetailRequest request) {
            super(request);
            this.customDomain = request.customDomain;
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
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public GetWebHostingCertificateDetailRequest build() {
            return new GetWebHostingCertificateDetailRequest(this);
        } 

    } 

}
