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
 * {@link CountOralEvaluationStatisticsConcurrentRequest} extends {@link RequestModel}
 *
 * <p>CountOralEvaluationStatisticsConcurrentRequest</p>
 */
public class CountOralEvaluationStatisticsConcurrentRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private OralEvaluationStatisticsConcurrentCountRequest body;

    private CountOralEvaluationStatisticsConcurrentRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CountOralEvaluationStatisticsConcurrentRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public OralEvaluationStatisticsConcurrentCountRequest getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CountOralEvaluationStatisticsConcurrentRequest, Builder> {
        private OralEvaluationStatisticsConcurrentCountRequest body; 

        private Builder() {
            super();
        } 

        private Builder(CountOralEvaluationStatisticsConcurrentRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * body.
         */
        public Builder body(OralEvaluationStatisticsConcurrentCountRequest body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CountOralEvaluationStatisticsConcurrentRequest build() {
            return new CountOralEvaluationStatisticsConcurrentRequest(this);
        } 

    } 

}
