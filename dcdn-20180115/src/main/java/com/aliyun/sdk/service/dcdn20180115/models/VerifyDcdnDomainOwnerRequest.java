// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyDcdnDomainOwnerRequest} extends {@link RequestModel}
 *
 * <p>VerifyDcdnDomainOwnerRequest</p>
 */
public class VerifyDcdnDomainOwnerRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("VerifyType")
    @Validation(required = true)
    private String verifyType;

    private VerifyDcdnDomainOwnerRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.verifyType = builder.verifyType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyDcdnDomainOwnerRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return verifyType
     */
    public String getVerifyType() {
        return this.verifyType;
    }

    public static final class Builder extends Request.Builder<VerifyDcdnDomainOwnerRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private String verifyType; 

        private Builder() {
            super();
        } 

        private Builder(VerifyDcdnDomainOwnerRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.ownerId = response.ownerId;
            this.verifyType = response.verifyType;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * VerifyType.
         */
        public Builder verifyType(String verifyType) {
            this.putQueryParameter("VerifyType", verifyType);
            this.verifyType = verifyType;
            return this;
        }

        @Override
        public VerifyDcdnDomainOwnerRequest build() {
            return new VerifyDcdnDomainOwnerRequest(this);
        } 

    } 

}
