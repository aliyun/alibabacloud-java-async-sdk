// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.scdn20171115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetScdnBotInfoRequest} extends {@link RequestModel}
 *
 * <p>SetScdnBotInfoRequest</p>
 */
public class SetScdnBotInfoRequest extends Request {
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

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    private SetScdnBotInfoRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.enable = builder.enable;
        this.ownerId = builder.ownerId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetScdnBotInfoRequest create() {
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

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetScdnBotInfoRequest, Builder> {
        private String domainName; 
        private String enable; 
        private Long ownerId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SetScdnBotInfoRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.enable = response.enable;
            this.ownerId = response.ownerId;
            this.status = response.status;
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

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetScdnBotInfoRequest build() {
            return new SetScdnBotInfoRequest(this);
        } 

    } 

}
