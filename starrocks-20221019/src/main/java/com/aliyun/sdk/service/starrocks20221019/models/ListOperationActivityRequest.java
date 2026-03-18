// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link ListOperationActivityRequest} extends {@link RequestModel}
 *
 * <p>ListOperationActivityRequest</p>
 */
public class ListOperationActivityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationId")
    private String operationId;

    private ListOperationActivityRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.operationId = builder.operationId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationActivityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operationId
     */
    public String getOperationId() {
        return this.operationId;
    }

    public static final class Builder extends Request.Builder<ListOperationActivityRequest, Builder> {
        private String instanceId; 
        private String operationId; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationActivityRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.operationId = request.operationId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OperationId.
         */
        public Builder operationId(String operationId) {
            this.putQueryParameter("OperationId", operationId);
            this.operationId = operationId;
            return this;
        }

        @Override
        public ListOperationActivityRequest build() {
            return new ListOperationActivityRequest(this);
        } 

    } 

}
