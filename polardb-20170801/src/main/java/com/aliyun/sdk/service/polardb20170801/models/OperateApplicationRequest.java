// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link OperateApplicationRequest} extends {@link RequestModel}
 *
 * <p>OperateApplicationRequest</p>
 */
public class OperateApplicationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    private String operation;

    private OperateApplicationRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.operation = builder.operation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateApplicationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    public static final class Builder extends Request.Builder<OperateApplicationRequest, Builder> {
        private String applicationId; 
        private String operation; 

        private Builder() {
            super();
        } 

        private Builder(OperateApplicationRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.operation = request.operation;
        } 

        /**
         * ApplicationId.
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Operation.
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        @Override
        public OperateApplicationRequest build() {
            return new OperateApplicationRequest(this);
        } 

    } 

}
