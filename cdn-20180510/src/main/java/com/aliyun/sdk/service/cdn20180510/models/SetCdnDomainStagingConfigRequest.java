// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCdnDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>SetCdnDomainStagingConfigRequest</p>
 */
public class SetCdnDomainStagingConfigRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Functions")
    @Validation(required = true)
    private String functions;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private SetCdnDomainStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functions = builder.functions;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCdnDomainStagingConfigRequest create() {
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
     * @return functions
     */
    public String getFunctions() {
        return this.functions;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<SetCdnDomainStagingConfigRequest, Builder> {
        private String domainName; 
        private String functions; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetCdnDomainStagingConfigRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.functions = response.functions;
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
         * Functions.
         */
        public Builder functions(String functions) {
            this.putQueryParameter("Functions", functions);
            this.functions = functions;
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
        public SetCdnDomainStagingConfigRequest build() {
            return new SetCdnDomainStagingConfigRequest(this);
        } 

    } 

}
