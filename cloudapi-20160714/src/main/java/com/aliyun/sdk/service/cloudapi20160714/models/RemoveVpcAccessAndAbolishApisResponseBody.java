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
 * {@link RemoveVpcAccessAndAbolishApisResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveVpcAccessAndAbolishApisResponseBody</p>
 */
public class RemoveVpcAccessAndAbolishApisResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OperationId")
    private String operationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RemoveVpcAccessAndAbolishApisResponseBody(Builder builder) {
        this.operationId = builder.operationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveVpcAccessAndAbolishApisResponseBody create() {
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

        private Builder(RemoveVpcAccessAndAbolishApisResponseBody model) {
            this.operationId = model.operationId;
            this.requestId = model.requestId;
        } 

        /**
         * OperationId.
         */
        public Builder operationId(String operationId) {
            this.operationId = operationId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RemoveVpcAccessAndAbolishApisResponseBody build() {
            return new RemoveVpcAccessAndAbolishApisResponseBody(this);
        } 

    } 

}
