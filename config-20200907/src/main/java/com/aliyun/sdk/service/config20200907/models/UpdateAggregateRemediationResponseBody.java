// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link UpdateAggregateRemediationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAggregateRemediationResponseBody</p>
 */
public class UpdateAggregateRemediationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RemediationId")
    private String remediationId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateAggregateRemediationResponseBody(Builder builder) {
        this.remediationId = builder.remediationId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAggregateRemediationResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return remediationId
     */
    public String getRemediationId() {
        return this.remediationId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String remediationId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateAggregateRemediationResponseBody model) {
            this.remediationId = model.remediationId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the remediation setting.</p>
         * 
         * <strong>example:</strong>
         * <p>crr-909ba2d4716700eb****</p>
         */
        public Builder remediationId(String remediationId) {
            this.remediationId = remediationId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C7817373-78CB-4F9A-8AFA-E7A88E9D64A2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateAggregateRemediationResponseBody build() {
            return new UpdateAggregateRemediationResponseBody(this);
        } 

    } 

}
