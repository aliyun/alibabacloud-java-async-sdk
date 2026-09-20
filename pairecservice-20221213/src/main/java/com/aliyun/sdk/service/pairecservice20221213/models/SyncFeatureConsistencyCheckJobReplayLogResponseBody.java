// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link SyncFeatureConsistencyCheckJobReplayLogResponseBody} extends {@link TeaModel}
 *
 * <p>SyncFeatureConsistencyCheckJobReplayLogResponseBody</p>
 */
public class SyncFeatureConsistencyCheckJobReplayLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private SyncFeatureConsistencyCheckJobReplayLogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncFeatureConsistencyCheckJobReplayLogResponseBody create() {
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

    public static final class Builder {
        private String requestId; 

        private Builder() {
        } 

        private Builder(SyncFeatureConsistencyCheckJobReplayLogResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C7D0B48F-0105-52B9-B60A-FA7606E2234D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public SyncFeatureConsistencyCheckJobReplayLogResponseBody build() {
            return new SyncFeatureConsistencyCheckJobReplayLogResponseBody(this);
        } 

    } 

}
