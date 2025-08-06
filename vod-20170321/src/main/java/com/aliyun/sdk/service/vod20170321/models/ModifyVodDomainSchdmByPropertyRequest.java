// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyVodDomainSchdmByPropertyRequest} extends {@link RequestModel}
 *
 * <p>ModifyVodDomainSchdmByPropertyRequest</p>
 */
public class ModifyVodDomainSchdmByPropertyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Property")
    @com.aliyun.core.annotation.Validation(required = true)
    private String property;

    private ModifyVodDomainSchdmByPropertyRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.property = builder.property;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVodDomainSchdmByPropertyRequest create() {
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
     * @return property
     */
    public String getProperty() {
        return this.property;
    }

    public static final class Builder extends Request.Builder<ModifyVodDomainSchdmByPropertyRequest, Builder> {
        private String domainName; 
        private Long ownerId; 
        private String property; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVodDomainSchdmByPropertyRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.property = request.property;
        } 

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder property(String property) {
            this.putQueryParameter("Property", property);
            this.property = property;
            return this;
        }

        @Override
        public ModifyVodDomainSchdmByPropertyRequest build() {
            return new ModifyVodDomainSchdmByPropertyRequest(this);
        } 

    } 

}
