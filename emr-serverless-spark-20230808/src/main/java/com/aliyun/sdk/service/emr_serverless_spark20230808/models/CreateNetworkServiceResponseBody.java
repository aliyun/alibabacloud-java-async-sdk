// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link CreateNetworkServiceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateNetworkServiceResponseBody</p>
 */
public class CreateNetworkServiceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("operationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private CreateNetworkServiceResponseBody(Builder builder) {
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNetworkServiceResponseBody create() {
        return builder().build();
    }

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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String operationId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateNetworkServiceResponseBody model) {
            this.operationId = model.operationId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Workspace Id。</p>
         * 
         * <strong>example:</strong>
         * <p>w-******</p>
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>请求ID。</p>
         * 
         * <strong>example:</strong>
         * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateNetworkServiceResponseBody build() {
            return new CreateNetworkServiceResponseBody(this);
        } 

    } 

}
