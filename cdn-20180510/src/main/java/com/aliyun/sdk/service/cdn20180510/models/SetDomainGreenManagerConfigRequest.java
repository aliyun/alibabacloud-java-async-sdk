// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDomainGreenManagerConfigRequest} extends {@link RequestModel}
 *
 * <p>SetDomainGreenManagerConfigRequest</p>
 */
public class SetDomainGreenManagerConfigRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Enable")
    @Validation(required = true)
    private String enable;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetDomainGreenManagerConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.enable = builder.enable;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDomainGreenManagerConfigRequest create() {
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
     * @return enable
     */
    public String getEnable() {
        return this.enable;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetDomainGreenManagerConfigRequest, Builder> {
        private String domainName; 
        private String enable; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetDomainGreenManagerConfigRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.enable = response.enable;
            this.ownerId = response.ownerId;
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
         * Enable.
         */
        public Builder enable(String enable) {
            this.putQueryParameter("Enable", enable);
            this.enable = enable;
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

        @Override
        public SetDomainGreenManagerConfigRequest build() {
            return new SetDomainGreenManagerConfigRequest(this);
        } 

    } 

}
