// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDcdnDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>SetDcdnDomainStagingConfigRequest</p>
 */
public class SetDcdnDomainStagingConfigRequest extends Request {
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

    private SetDcdnDomainStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functions = builder.functions;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDcdnDomainStagingConfigRequest create() {
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

    public static final class Builder extends Request.Builder<SetDcdnDomainStagingConfigRequest, Builder> {
        private String domainName; 
        private String functions; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(SetDcdnDomainStagingConfigRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.functions = request.functions;
            this.ownerId = request.ownerId;
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
        public SetDcdnDomainStagingConfigRequest build() {
            return new SetDcdnDomainStagingConfigRequest(this);
        } 

    } 

}
