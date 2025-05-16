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
 * {@link CountOralEvaluationStatisticsErrorRequest} extends {@link RequestModel}
 *
 * <p>CountOralEvaluationStatisticsErrorRequest</p>
 */
public class CountOralEvaluationStatisticsErrorRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private OralEvaluationStatisticsErrorCountRequest body;

    private CountOralEvaluationStatisticsErrorRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountOralEvaluationStatisticsErrorRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public OralEvaluationStatisticsErrorCountRequest getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CountOralEvaluationStatisticsErrorRequest, Builder> {
        private OralEvaluationStatisticsErrorCountRequest body; 

        private Builder() {
            super();
        } 

        private Builder(CountOralEvaluationStatisticsErrorRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(OralEvaluationStatisticsErrorCountRequest body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CountOralEvaluationStatisticsErrorRequest build() {
            return new CountOralEvaluationStatisticsErrorRequest(this);
        } 

    } 

}
