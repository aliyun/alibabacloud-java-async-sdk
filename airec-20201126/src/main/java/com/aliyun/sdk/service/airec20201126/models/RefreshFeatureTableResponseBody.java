// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RefreshFeatureTableResponseBody} extends {@link TeaModel}
 *
 * <p>RefreshFeatureTableResponseBody</p>
 */
public class RefreshFeatureTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private FeatureTable result;

    private RefreshFeatureTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshFeatureTableResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public FeatureTable getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private FeatureTable result; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(FeatureTable result) {
            this.result = result;
            return this;
        }

        public RefreshFeatureTableResponseBody build() {
            return new RefreshFeatureTableResponseBody(this);
        } 

    } 

}
