// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeleteVsDomainConfigsRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteVsDomainConfigsRequest</p>
 */
public class BatchDeleteVsDomainConfigsRequest extends Request {
    @Query
    @NameInMap("DomainNames")
    @Validation(required = true)
    private String domainNames;

    @Query
    @NameInMap("FunctionNames")
    @Validation(required = true)
    private String functionNames;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private BatchDeleteVsDomainConfigsRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.functionNames = builder.functionNames;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteVsDomainConfigsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainNames
     */
    public String getDomainNames() {
        return this.domainNames;
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

    public static final class Builder extends Request.Builder<BatchDeleteVsDomainConfigsRequest, Builder> {
        private String domainNames; 
        private String functionNames; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteVsDomainConfigsRequest response) {
            super(response);
            this.domainNames = response.domainNames;
            this.functionNames = response.functionNames;
            this.ownerId = response.ownerId;
        } 

        /**
         * DomainNames.
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
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
        public BatchDeleteVsDomainConfigsRequest build() {
            return new BatchDeleteVsDomainConfigsRequest(this);
        } 

    } 

}
