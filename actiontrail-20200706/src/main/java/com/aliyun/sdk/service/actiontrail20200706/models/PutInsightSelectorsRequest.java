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
 * {@link PutInsightSelectorsRequest} extends {@link RequestModel}
 *
 * <p>PutInsightSelectorsRequest</p>
 */
public class PutInsightSelectorsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InsightSelectors")
    private String insightSelectors;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TrailName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String trailName;

    private PutInsightSelectorsRequest(Builder builder) {
        super(builder);
        this.insightSelectors = builder.insightSelectors;
        this.trailName = builder.trailName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutInsightSelectorsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return insightSelectors
     */
    public String getInsightSelectors() {
        return this.insightSelectors;
    }

    /**
     * @return trailName
     */
    public String getTrailName() {
        return this.trailName;
    }

    public static final class Builder extends Request.Builder<PutInsightSelectorsRequest, Builder> {
        private String insightSelectors; 
        private String trailName; 

        private Builder() {
            super();
        } 

        private Builder(PutInsightSelectorsRequest request) {
            super(request);
            this.insightSelectors = request.insightSelectors;
            this.trailName = request.trailName;
        } 

        /**
         * InsightSelectors.
         */
        public Builder insightSelectors(String insightSelectors) {
            this.putQueryParameter("InsightSelectors", insightSelectors);
            this.insightSelectors = insightSelectors;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>trail-name</p>
         */
        public Builder trailName(String trailName) {
            this.putQueryParameter("TrailName", trailName);
            this.trailName = trailName;
            return this;
        }

        @Override
        public PutInsightSelectorsRequest build() {
            return new PutInsightSelectorsRequest(this);
        } 

    } 

}
