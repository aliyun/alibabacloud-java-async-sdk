// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAvailableCertificatesRequest} extends {@link RequestModel}
 *
 * <p>ListAvailableCertificatesRequest</p>
 */
public class ListAvailableCertificatesRequest extends Request {
    @Body
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private ListAvailableCertificatesRequest(Builder builder) {
        super(builder);
        this.domain = builder.domain;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableCertificatesRequest create() {
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

    public static final class Builder extends Request.Builder<ListAvailableCertificatesRequest, Builder> {
        private String domain; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(ListAvailableCertificatesRequest request) {
            super(request);
            this.domain = request.domain;
            this.spaceId = request.spaceId;
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

        @Override
        public ListAvailableCertificatesRequest build() {
            return new ListAvailableCertificatesRequest(this);
        } 

    } 

}
