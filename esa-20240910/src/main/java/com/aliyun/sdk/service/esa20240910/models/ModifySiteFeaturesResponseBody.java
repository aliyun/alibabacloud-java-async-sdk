// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link ModifySiteFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ModifySiteFeaturesResponseBody</p>
 */
public class ModifySiteFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FailedFeatures")
    private String failedFeatures;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ModifySiteFeaturesResponseBody(Builder builder) {
        this.failedFeatures = builder.failedFeatures;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifySiteFeaturesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return failedFeatures
     */
    public String getFailedFeatures() {
        return this.failedFeatures;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String failedFeatures; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ModifySiteFeaturesResponseBody model) {
            this.failedFeatures = model.failedFeatures;
            this.requestId = model.requestId;
        } 

        /**
         * FailedFeatures.
         */
        public Builder failedFeatures(String failedFeatures) {
            this.failedFeatures = failedFeatures;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ModifySiteFeaturesResponseBody build() {
            return new ModifySiteFeaturesResponseBody(this);
        } 

    } 

}
