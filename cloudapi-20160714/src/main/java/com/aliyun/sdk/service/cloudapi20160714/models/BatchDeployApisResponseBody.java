// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link BatchDeployApisResponseBody} extends {@link TeaModel}
 *
 * <p>BatchDeployApisResponseBody</p>
 */
public class BatchDeployApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BatchDeployApisResponseBody(Builder builder) {
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeployApisResponseBody create() {
        return builder().build();
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

        /**
         * <p>The ID of the operation.</p>
         * 
         * <strong>example:</strong>
         * <p>2a322599-8e38-428a-a306-9b21ea2129bf</p>
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E7FE7172-AA75-5880-B6F7-C00893E9BC06</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchDeployApisResponseBody build() {
            return new BatchDeployApisResponseBody(this);
        } 

    } 

}
