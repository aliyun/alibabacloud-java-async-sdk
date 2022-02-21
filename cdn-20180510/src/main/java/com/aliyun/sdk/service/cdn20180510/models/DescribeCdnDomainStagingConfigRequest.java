// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainStagingConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnDomainStagingConfigRequest</p>
 */
public class DescribeCdnDomainStagingConfigRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("FunctionNames")
    @Validation(required = true)
    private String functionNames;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeCdnDomainStagingConfigRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functionNames = builder.functionNames;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainStagingConfigRequest create() {
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
     * @return functionNames
     */
    public String getFunctionNames() {
        return this.functionNames;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeCdnDomainStagingConfigRequest, Builder> {
        private String domainName; 
        private String functionNames; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnDomainStagingConfigRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.functionNames = response.functionNames;
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
         * FunctionNames.
         */
        public Builder functionNames(String functionNames) {
            this.putQueryParameter("FunctionNames", functionNames);
            this.functionNames = functionNames;
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
        public DescribeCdnDomainStagingConfigRequest build() {
            return new DescribeCdnDomainStagingConfigRequest(this);
        } 

    } 

}
