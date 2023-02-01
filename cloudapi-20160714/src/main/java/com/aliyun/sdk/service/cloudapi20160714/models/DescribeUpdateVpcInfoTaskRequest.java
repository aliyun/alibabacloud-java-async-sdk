// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUpdateVpcInfoTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeUpdateVpcInfoTaskRequest</p>
 */
public class DescribeUpdateVpcInfoTaskRequest extends Request {
    @Query
    @NameInMap("OperationUid")
    @Validation(required = true)
    private String operationUid;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeUpdateVpcInfoTaskRequest(Builder builder) {
        super(builder);
        this.operationUid = builder.operationUid;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUpdateVpcInfoTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationUid
     */
    public String getOperationUid() {
        return this.operationUid;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeUpdateVpcInfoTaskRequest, Builder> {
        private String operationUid; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUpdateVpcInfoTaskRequest request) {
            super(request);
            this.operationUid = request.operationUid;
            this.securityToken = request.securityToken;
        } 

        /**
         * The ID of the task.
         */
        public Builder operationUid(String operationUid) {
            this.putQueryParameter("OperationUid", operationUid);
            this.operationUid = operationUid;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeUpdateVpcInfoTaskRequest build() {
            return new DescribeUpdateVpcInfoTaskRequest(this);
        } 

    } 

}
