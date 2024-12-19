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
 * {@link ModifyVpcAccessAndUpdateApisResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyVpcAccessAndUpdateApisResponseBody</p>
 */
public class ModifyVpcAccessAndUpdateApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifyVpcAccessAndUpdateApisResponseBody(Builder builder) {
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVpcAccessAndUpdateApisResponseBody create() {
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
         * <p>The ID of the asynchronous task.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>If the associated API is updated, you can use the task ID in the <strong>DescribeUpdateVpcInfoTask</strong> operation to query the update result.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>7b6d0cb72b2e4215b0129f675c889746</p>
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C2CEC6EA-EEBA-5FD6-8BD9-2CF01980FE39</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifyVpcAccessAndUpdateApisResponseBody build() {
            return new ModifyVpcAccessAndUpdateApisResponseBody(this);
        } 

    } 

}
