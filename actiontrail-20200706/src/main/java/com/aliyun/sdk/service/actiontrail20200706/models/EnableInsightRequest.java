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
 * {@link EnableInsightRequest} extends {@link RequestModel}
 *
 * <p>EnableInsightRequest</p>
 */
public class EnableInsightRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InsightType")
    private String insightType;

    private EnableInsightRequest(Builder builder) {
        super(builder);
        this.insightType = builder.insightType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableInsightRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return insightType
     */
    public String getInsightType() {
        return this.insightType;
    }

    public static final class Builder extends Request.Builder<EnableInsightRequest, Builder> {
        private String insightType; 

        private Builder() {
            super();
        } 

        private Builder(EnableInsightRequest request) {
            super(request);
            this.insightType = request.insightType;
        } 

        /**
         * <p>The type of the Insights event. Valid values:</p>
         * <ul>
         * <li>IpInsight: Insights event on IP address</li>
         * <li>ApiCallRateInsight: Insights event on API call rate</li>
         * <li>ApiErrorRateInsight: Insights event on API error rate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IpInsight</p>
         */
        public Builder insightType(String insightType) {
            this.putQueryParameter("InsightType", insightType);
            this.insightType = insightType;
            return this;
        }

        @Override
        public EnableInsightRequest build() {
            return new EnableInsightRequest(this);
        } 

    } 

}
