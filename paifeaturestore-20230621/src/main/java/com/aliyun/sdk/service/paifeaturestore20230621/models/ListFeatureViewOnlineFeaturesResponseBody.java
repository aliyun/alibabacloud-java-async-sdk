// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFeatureViewOnlineFeaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeatureViewOnlineFeaturesResponseBody</p>
 */
public class ListFeatureViewOnlineFeaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("OnlineFeatures")
    private java.util.List < String > onlineFeatures;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFeatureViewOnlineFeaturesResponseBody(Builder builder) {
        this.onlineFeatures = builder.onlineFeatures;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureViewOnlineFeaturesResponseBody create() {
        return builder().build();
    }

    /**
     * @return onlineFeatures
     */
    public java.util.List < String > getOnlineFeatures() {
        return this.onlineFeatures;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < String > onlineFeatures; 
        private String requestId; 

        /**
         * OnlineFeatures.
         */
        public Builder onlineFeatures(java.util.List < String > onlineFeatures) {
            this.onlineFeatures = onlineFeatures;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFeatureViewOnlineFeaturesResponseBody build() {
            return new ListFeatureViewOnlineFeaturesResponseBody(this);
        } 

    } 

}
