// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DeleteBinarySecurityPolicyRequest} extends {@link RequestModel}
 *
 * <p>DeleteBinarySecurityPolicyRequest</p>
 */
public class DeleteBinarySecurityPolicyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private DeleteBinarySecurityPolicyRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteBinarySecurityPolicyRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<DeleteBinarySecurityPolicyRequest, Builder> {
        private String name; 
        private Long resourceOwnerId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(DeleteBinarySecurityPolicyRequest request) {
            super(request);
            this.name = request.name;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The name of the binary security policy.</p>
         * 
         * <strong>example:</strong>
         * <p>policy-auto-bfu7pm</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>42.120.XXX.XXX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public DeleteBinarySecurityPolicyRequest build() {
            return new DeleteBinarySecurityPolicyRequest(this);
        } 

    } 

}
