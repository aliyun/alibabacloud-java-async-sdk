// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DeleteControlPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteControlPolicyResponseBody</p>
 */
public class DeleteControlPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteControlPolicyResponseBody(Builder builder) {
        this.dryRun = builder.dryRun;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteControlPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Boolean dryRun; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteControlPolicyResponseBody model) {
            this.dryRun = model.dryRun;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Indicates whether the response is for a successful dry run. A value of true indicates that only the precheck is completed and no actual changes are made. This field is not returned or is set to false for actual calls.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteControlPolicyResponseBody build() {
            return new DeleteControlPolicyResponseBody(this);
        } 

    } 

}
