// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20201126.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyFeatureTableResponseBody} extends {@link TeaModel}
 *
 * <p>ModifyFeatureTableResponseBody</p>
 */
public class ModifyFeatureTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private FeatureTable result;

    private ModifyFeatureTableResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFeatureTableResponseBody create() {
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
         * <p>Modifies a feature table.</p>
         * 
         * <strong>example:</strong>
         * <p>8B90B646-1678-41A3-B23F-EAC6587B0E48</p>
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

        public ModifyFeatureTableResponseBody build() {
            return new ModifyFeatureTableResponseBody(this);
        } 

    } 

}
