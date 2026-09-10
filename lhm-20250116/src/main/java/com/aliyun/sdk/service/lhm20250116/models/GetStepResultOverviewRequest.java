// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lhm20250116.models;

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
 * {@link GetStepResultOverviewRequest} extends {@link RequestModel}
 *
 * <p>GetStepResultOverviewRequest</p>
 */
public class GetStepResultOverviewRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resultId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resultId;

    private GetStepResultOverviewRequest(Builder builder) {
        super(builder);
        this.resultId = builder.resultId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetStepResultOverviewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return resultId
     */
    public String getResultId() {
        return this.resultId;
    }

    public static final class Builder extends Request.Builder<GetStepResultOverviewRequest, Builder> {
        private String resultId; 

        private Builder() {
            super();
        } 

        private Builder(GetStepResultOverviewRequest request) {
            super(request);
            this.resultId = request.resultId;
        } 

        /**
         * <p>The unique ID of the validation result.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001</p>
         */
        public Builder resultId(String resultId) {
            this.putQueryParameter("resultId", resultId);
            this.resultId = resultId;
            return this;
        }

        @Override
        public GetStepResultOverviewRequest build() {
            return new GetStepResultOverviewRequest(this);
        } 

    } 

}
