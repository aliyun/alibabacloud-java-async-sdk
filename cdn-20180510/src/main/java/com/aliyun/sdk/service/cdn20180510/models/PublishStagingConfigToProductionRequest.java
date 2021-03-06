// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PublishStagingConfigToProductionRequest} extends {@link RequestModel}
 *
 * <p>PublishStagingConfigToProductionRequest</p>
 */
public class PublishStagingConfigToProductionRequest extends Request {
    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("FunctionName")
    @Validation(required = true)
    private String functionName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private PublishStagingConfigToProductionRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.functionName = builder.functionName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PublishStagingConfigToProductionRequest create() {
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
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<PublishStagingConfigToProductionRequest, Builder> {
        private String domainName; 
        private String functionName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(PublishStagingConfigToProductionRequest response) {
            super(response);
            this.domainName = response.domainName;
            this.functionName = response.functionName;
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
         * FunctionName.
         */
        public Builder functionName(String functionName) {
            this.putQueryParameter("FunctionName", functionName);
            this.functionName = functionName;
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
        public PublishStagingConfigToProductionRequest build() {
            return new PublishStagingConfigToProductionRequest(this);
        } 

    } 

}
