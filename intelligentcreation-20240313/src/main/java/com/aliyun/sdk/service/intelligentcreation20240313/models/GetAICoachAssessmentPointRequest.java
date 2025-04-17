// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetAICoachAssessmentPointRequest} extends {@link RequestModel}
 *
 * <p>GetAICoachAssessmentPointRequest</p>
 */
public class GetAICoachAssessmentPointRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pointId")
    private String pointId;

    private GetAICoachAssessmentPointRequest(Builder builder) {
        super(builder);
        this.pointId = builder.pointId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachAssessmentPointRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pointId
     */
    public String getPointId() {
        return this.pointId;
    }

    public static final class Builder extends Request.Builder<GetAICoachAssessmentPointRequest, Builder> {
        private String pointId; 

        private Builder() {
            super();
        } 

        private Builder(GetAICoachAssessmentPointRequest request) {
            super(request);
            this.pointId = request.pointId;
        } 

        /**
         * pointId.
         */
        public Builder pointId(String pointId) {
            this.putQueryParameter("pointId", pointId);
            this.pointId = pointId;
            return this;
        }

        @Override
        public GetAICoachAssessmentPointRequest build() {
            return new GetAICoachAssessmentPointRequest(this);
        } 

    } 

}
