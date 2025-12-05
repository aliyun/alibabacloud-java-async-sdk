// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link GetPtsReportDetailsRequest} extends {@link RequestModel}
 *
 * <p>GetPtsReportDetailsRequest</p>
 */
public class GetPtsReportDetailsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private GetPtsReportDetailsRequest(Builder builder) {
        super(builder);
        this.planId = builder.planId;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPtsReportDetailsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<GetPtsReportDetailsRequest, Builder> {
        private String planId; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(GetPtsReportDetailsRequest request) {
            super(request);
            this.planId = request.planId;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>The ID of the performance testing task. A task ID is generated each time a PTS scenario is started.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>OH5HA3VB</p>
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>The ID of the scenario.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>G5HCVS</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public GetPtsReportDetailsRequest build() {
            return new GetPtsReportDetailsRequest(this);
        } 

    } 

}
