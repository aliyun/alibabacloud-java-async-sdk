// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetAIQueryResultRequest} extends {@link RequestModel}
 *
 * <p>GetAIQueryResultRequest</p>
 */
public class GetAIQueryResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("analysisId")
    private String analysisId;

    private GetAIQueryResultRequest(Builder builder) {
        super(builder);
        this.analysisId = builder.analysisId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIQueryResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return analysisId
     */
    public String getAnalysisId() {
        return this.analysisId;
    }

    public static final class Builder extends Request.Builder<GetAIQueryResultRequest, Builder> {
        private String analysisId; 

        private Builder() {
            super();
        } 

        private Builder(GetAIQueryResultRequest request) {
            super(request);
            this.analysisId = request.analysisId;
        } 

        /**
         * <p>The AI analysis ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16896fa8-37f6-4c70-bb32-67fa9817d426</p>
         */
        public Builder analysisId(String analysisId) {
            this.putBodyParameter("analysisId", analysisId);
            this.analysisId = analysisId;
            return this;
        }

        @Override
        public GetAIQueryResultRequest build() {
            return new GetAIQueryResultRequest(this);
        } 

    } 

}
