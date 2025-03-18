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
 * {@link PutBucketLifecycleResponseBody} extends {@link TeaModel}
 *
 * <p>PutBucketLifecycleResponseBody</p>
 */
public class PutBucketLifecycleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RuleId")
    private String ruleId;

    private PutBucketLifecycleResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutBucketLifecycleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    public static final class Builder {
        private String requestId; 
        private String ruleId; 

        private Builder() {
        } 

        private Builder(PutBucketLifecycleResponseBody model) {
            this.requestId = model.requestId;
            this.ruleId = model.ruleId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>62373E71-5521-4620-8AAB-133CCE49357A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>b8f93xxxxx4881xxxxxc71d991</p>
         */
        public Builder ruleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }

        public PutBucketLifecycleResponseBody build() {
            return new PutBucketLifecycleResponseBody(this);
        } 

    } 

}
