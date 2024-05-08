// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeImportOASTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeImportOASTaskRequest</p>
 */
public class DescribeImportOASTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeImportOASTaskRequest(Builder builder) {
        super(builder);
        this.operationId = builder.operationId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeImportOASTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeImportOASTaskRequest, Builder> {
        private String operationId; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeImportOASTaskRequest request) {
            super(request);
            this.operationId = request.operationId;
            this.securityToken = request.securityToken;
        } 

        /**
         * The ID of the asynchronous API import task that was generated during the import operation. This ID is used to query the execution status of the API import task.
         */
        public Builder operationId(String operationId) {
            this.putQueryParameter("OperationId", operationId);
            this.operationId = operationId;
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
        public DescribeImportOASTaskRequest build() {
            return new DescribeImportOASTaskRequest(this);
        } 

    } 

}
