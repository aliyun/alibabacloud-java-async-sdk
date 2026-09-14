// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link RestoreBranchResponseBody} extends {@link TeaModel}
 *
 * <p>RestoreBranchResponseBody</p>
 */
public class RestoreBranchResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BranchId")
    private String branchId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private RestoreBranchResponseBody(Builder builder) {
        this.branchId = builder.branchId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestoreBranchResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return branchId
     */
    public String getBranchId() {
        return this.branchId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String branchId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(RestoreBranchResponseBody model) {
            this.branchId = model.branchId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The branch ID that uniquely identifies a Supabase branch.</p>
         * 
         * <strong>example:</strong>
         * <p>br-xxxx</p>
         */
        public Builder branchId(String branchId) {
            this.branchId = branchId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ABB39CC3-4488-4857-905D-2E4A051D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public RestoreBranchResponseBody build() {
            return new RestoreBranchResponseBody(this);
        } 

    } 

}
