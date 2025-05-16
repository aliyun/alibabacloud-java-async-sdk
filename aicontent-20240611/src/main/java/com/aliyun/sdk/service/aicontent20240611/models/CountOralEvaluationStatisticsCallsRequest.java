// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link CountOralEvaluationStatisticsCallsRequest} extends {@link RequestModel}
 *
 * <p>CountOralEvaluationStatisticsCallsRequest</p>
 */
public class CountOralEvaluationStatisticsCallsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private OralEvaluationStatisticsCallsCountRequest body;

    private CountOralEvaluationStatisticsCallsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountOralEvaluationStatisticsCallsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public OralEvaluationStatisticsCallsCountRequest getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CountOralEvaluationStatisticsCallsRequest, Builder> {
        private OralEvaluationStatisticsCallsCountRequest body; 

        private Builder() {
            super();
        } 

        private Builder(CountOralEvaluationStatisticsCallsRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(OralEvaluationStatisticsCallsCountRequest body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CountOralEvaluationStatisticsCallsRequest build() {
            return new CountOralEvaluationStatisticsCallsRequest(this);
        } 

    } 

}
