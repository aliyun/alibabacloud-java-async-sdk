// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link BatchSetVsDomainConfigsRequest} extends {@link RequestModel}
 *
 * <p>BatchSetVsDomainConfigsRequest</p>
 */
public class BatchSetVsDomainConfigsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Functions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    private BatchSetVsDomainConfigsRequest(Builder builder) {
        super(builder);
        this.domainNames = builder.domainNames;
        this.functions = builder.functions;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchSetVsDomainConfigsRequest create() {
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

    public static final class Builder extends Request.Builder<BatchSetVsDomainConfigsRequest, Builder> {
        private String domainNames; 
        private String functions; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(BatchSetVsDomainConfigsRequest request) {
            super(request);
            this.domainNames = request.domainNames;
            this.functions = request.functions;
            this.ownerId = request.ownerId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder domainNames(String domainNames) {
            this.putQueryParameter("DomainNames", domainNames);
            this.domainNames = domainNames;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{“functionArgs”:[{“argName”:”domain_name”,”argValue”:”api.hellodtworld.com”}],”functionName”:”set_req_host_header”}]</p>
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
        public BatchSetVsDomainConfigsRequest build() {
            return new BatchSetVsDomainConfigsRequest(this);
        } 

    } 

}
