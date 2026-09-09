// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link CreateCloudAccountResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudAccountResponseBody</p>
 */
public class CreateCloudAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CloudAccountId")
    private String cloudAccountId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateCloudAccountResponseBody(Builder builder) {
        this.cloudAccountId = builder.cloudAccountId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cloudAccountId
     */
    public String getCloudAccountId() {
        return this.cloudAccountId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String cloudAccountId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateCloudAccountResponseBody model) {
            this.cloudAccountId = model.cloudAccountId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cloud account ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ca_01kmegjc11qa1txxxxx</p>
         */
        public Builder cloudAccountId(String cloudAccountId) {
            this.cloudAccountId = cloudAccountId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateCloudAccountResponseBody build() {
            return new CreateCloudAccountResponseBody(this);
        } 

    } 

}
