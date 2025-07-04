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
 * {@link CreateFeatureConsistencyCheckJobConfigResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFeatureConsistencyCheckJobConfigResponseBody</p>
 */
public class CreateFeatureConsistencyCheckJobConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobConfigId")
    private String featureConsistencyCheckJobConfigId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFeatureConsistencyCheckJobConfigResponseBody(Builder builder) {
        this.featureConsistencyCheckJobConfigId = builder.featureConsistencyCheckJobConfigId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFeatureConsistencyCheckJobConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureConsistencyCheckJobConfigId
     */
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String featureConsistencyCheckJobConfigId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateFeatureConsistencyCheckJobConfigResponseBody model) {
            this.featureConsistencyCheckJobConfigId = model.featureConsistencyCheckJobConfigId;
            this.requestId = model.requestId;
        } 

        /**
         * FeatureConsistencyCheckJobConfigId.
         */
        public Builder featureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
            this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFeatureConsistencyCheckJobConfigResponseBody build() {
            return new CreateFeatureConsistencyCheckJobConfigResponseBody(this);
        } 

    } 

}
