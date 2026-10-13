// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link GetAnnotationMissionSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetAnnotationMissionSummaryRequest</p>
 */
public class GetAnnotationMissionSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AnnotationMissionId")
    private String annotationMissionId;

    private GetAnnotationMissionSummaryRequest(Builder builder) {
        super(builder);
        this.annotationMissionId = builder.annotationMissionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAnnotationMissionSummaryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return annotationMissionId
     */
    public String getAnnotationMissionId() {
        return this.annotationMissionId;
    }

    public static final class Builder extends Request.Builder<GetAnnotationMissionSummaryRequest, Builder> {
        private String annotationMissionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAnnotationMissionSummaryRequest request) {
            super(request);
            this.annotationMissionId = request.annotationMissionId;
        } 

        /**
         * <p>The ID of the annotation task.</p>
         * 
         * <strong>example:</strong>
         * <p>50e53ac8-24a4-46d5-b174-ee88867f4780</p>
         */
        public Builder annotationMissionId(String annotationMissionId) {
            this.putQueryParameter("AnnotationMissionId", annotationMissionId);
            this.annotationMissionId = annotationMissionId;
            return this;
        }

        @Override
        public GetAnnotationMissionSummaryRequest build() {
            return new GetAnnotationMissionSummaryRequest(this);
        } 

    } 

}
