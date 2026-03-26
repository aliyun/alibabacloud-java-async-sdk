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
 * {@link DisableInsightRequest} extends {@link RequestModel}
 *
 * <p>DisableInsightRequest</p>
 */
public class DisableInsightRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InsightType")
    private String insightType;

    private DisableInsightRequest(Builder builder) {
        super(builder);
        this.insightType = builder.insightType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableInsightRequest create() {
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

    public static final class Builder extends Request.Builder<DisableInsightRequest, Builder> {
        private String insightType; 

        private Builder() {
            super();
        } 

        private Builder(DisableInsightRequest request) {
            super(request);
            this.insightType = request.insightType;
        } 

        /**
         * InsightType.
         */
        public Builder insightType(String insightType) {
            this.putQueryParameter("InsightType", insightType);
            this.insightType = insightType;
            return this;
        }

        @Override
        public DisableInsightRequest build() {
            return new DisableInsightRequest(this);
        } 

    } 

}
