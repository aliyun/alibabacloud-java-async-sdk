// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link CreateEipInstanceResponseBody} extends {@link TeaModel}
 *
 * <p>CreateEipInstanceResponseBody</p>
 */
public class CreateEipInstanceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AllocationId")
    private String allocationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateEipInstanceResponseBody(Builder builder) {
        this.allocationId = builder.allocationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEipInstanceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationId
     */
    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String allocationId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateEipInstanceResponseBody model) {
            this.allocationId = model.allocationId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the EIP.</p>
         * 
         * <strong>example:</strong>
         * <p>eip-25877c70gddh****</p>
         */
        public Builder allocationId(String allocationId) {
            this.allocationId = allocationId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9DB6123F-470D-510A-A9EB-EBA799340452</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateEipInstanceResponseBody build() {
            return new CreateEipInstanceResponseBody(this);
        } 

    } 

}
