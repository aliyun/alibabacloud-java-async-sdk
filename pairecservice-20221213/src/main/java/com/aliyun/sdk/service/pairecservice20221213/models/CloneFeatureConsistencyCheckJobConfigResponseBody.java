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
 * {@link CloneFeatureConsistencyCheckJobConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CloneFeatureConsistencyCheckJobConfigResponseBody</p>
 */
public class CloneFeatureConsistencyCheckJobConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckId")
    private String featureConsistencyCheckId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloneFeatureConsistencyCheckJobConfigResponseBody(Builder builder) {
        this.featureConsistencyCheckId = builder.featureConsistencyCheckId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneFeatureConsistencyCheckJobConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return featureConsistencyCheckId
     */
    public String getFeatureConsistencyCheckId() {
        return this.featureConsistencyCheckId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String featureConsistencyCheckId; 
        private String requestId; 

        /**
         * FeatureConsistencyCheckId.
         */
        public Builder featureConsistencyCheckId(String featureConsistencyCheckId) {
            this.featureConsistencyCheckId = featureConsistencyCheckId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CloneFeatureConsistencyCheckJobConfigResponseBody build() {
            return new CloneFeatureConsistencyCheckJobConfigResponseBody(this);
        } 

    } 

}
