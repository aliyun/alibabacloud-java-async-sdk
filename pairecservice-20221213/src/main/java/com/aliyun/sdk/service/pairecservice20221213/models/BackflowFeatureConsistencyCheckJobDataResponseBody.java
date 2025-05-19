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
 * {@link BackflowFeatureConsistencyCheckJobDataResponseBody} extends {@link TeaModel}
 *
 * <p>BackflowFeatureConsistencyCheckJobDataResponseBody</p>
 */
public class BackflowFeatureConsistencyCheckJobDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private BackflowFeatureConsistencyCheckJobDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BackflowFeatureConsistencyCheckJobDataResponseBody create() {
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

        private Builder(BackflowFeatureConsistencyCheckJobDataResponseBody model) {
            this.requestId = model.requestId;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BackflowFeatureConsistencyCheckJobDataResponseBody build() {
            return new BackflowFeatureConsistencyCheckJobDataResponseBody(this);
        } 

    } 

}
