// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link CreateFeatureViewResponseBody} extends {@link TeaModel}
 *
 * <p>CreateFeatureViewResponseBody</p>
 */
public class CreateFeatureViewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FeatureViewId")
    private String featureViewId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateFeatureViewResponseBody(Builder builder) {
        this.featureViewId = builder.featureViewId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFeatureViewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return featureViewId
     */
    public String getFeatureViewId() {
        return this.featureViewId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String featureViewId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CreateFeatureViewResponseBody model) {
            this.featureViewId = model.featureViewId;
            this.requestId = model.requestId;
        } 

        /**
         * FeatureViewId.
         */
        public Builder featureViewId(String featureViewId) {
            this.featureViewId = featureViewId;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateFeatureViewResponseBody build() {
            return new CreateFeatureViewResponseBody(this);
        } 

    } 

}
