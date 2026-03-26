// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link GetInsightSelectorsResponseBody} extends {@link TeaModel}
 *
 * <p>GetInsightSelectorsResponseBody</p>
 */
public class GetInsightSelectorsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InsightSelectors")
    private java.util.List<String> insightSelectors;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrailArn")
    private String trailArn;

    private GetInsightSelectorsResponseBody(Builder builder) {
        this.insightSelectors = builder.insightSelectors;
        this.requestId = builder.requestId;
        this.trailArn = builder.trailArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInsightSelectorsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return insightSelectors
     */
    public java.util.List<String> getInsightSelectors() {
        return this.insightSelectors;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trailArn
     */
    public String getTrailArn() {
        return this.trailArn;
    }

    public static final class Builder {
        private java.util.List<String> insightSelectors; 
        private String requestId; 
        private String trailArn; 

        private Builder() {
        } 

        private Builder(GetInsightSelectorsResponseBody model) {
            this.insightSelectors = model.insightSelectors;
            this.requestId = model.requestId;
            this.trailArn = model.trailArn;
        } 

        /**
         * InsightSelectors.
         */
        public Builder insightSelectors(java.util.List<String> insightSelectors) {
            this.insightSelectors = insightSelectors;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrailArn.
         */
        public Builder trailArn(String trailArn) {
            this.trailArn = trailArn;
            return this;
        }

        public GetInsightSelectorsResponseBody build() {
            return new GetInsightSelectorsResponseBody(this);
        } 

    } 

}
