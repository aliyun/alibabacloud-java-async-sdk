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
 * {@link UpdatePtsSceneBaseLineRequest} extends {@link RequestModel}
 *
 * <p>UpdatePtsSceneBaseLineRequest</p>
 */
public class UpdatePtsSceneBaseLineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiBaselines")
    private java.util.Map<String, ?> apiBaselines;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneBaseline")
    private java.util.Map<String, ?> sceneBaseline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private UpdatePtsSceneBaseLineRequest(Builder builder) {
        super(builder);
        this.apiBaselines = builder.apiBaselines;
        this.sceneBaseline = builder.sceneBaseline;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePtsSceneBaseLineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiBaselines
     */
    public java.util.Map<String, ?> getApiBaselines() {
        return this.apiBaselines;
    }

    /**
     * @return sceneBaseline
     */
    public java.util.Map<String, ?> getSceneBaseline() {
        return this.sceneBaseline;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<UpdatePtsSceneBaseLineRequest, Builder> {
        private java.util.Map<String, ?> apiBaselines; 
        private java.util.Map<String, ?> sceneBaseline; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePtsSceneBaseLineRequest request) {
            super(request);
            this.apiBaselines = request.apiBaselines;
            this.sceneBaseline = request.sceneBaseline;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>null null</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;avgRt&quot;:1,&quot;avgTps&quot;:1,&quot;failCountBiz&quot;:1,&quot;failCountReq&quot;:182381,&quot;id&quot;:362447,&quot;maxRt&quot;:3051,&quot;minRt&quot;:0,&quot;name&quot;:&quot;1-1&quot;,&quot;seg50Rt&quot;:1,&quot;seg75Rt&quot;:1,&quot;seg90Rt&quot;:1,&quot;seg99Rt&quot;:3,&quot;successRateBiz&quot;:1,&quot;successRateReq&quot;:0,&quot;timingConnAvg&quot;:0},{&quot;avgRt&quot;:1.06,&quot;avgTps&quot;:1,&quot;failCountBiz&quot;:0,&quot;failCountReq&quot;:151143,&quot;id&quot;:362446,&quot;maxRt&quot;:3068,&quot;minRt&quot;:0,&quot;name&quot;:&quot;dd&quot;,&quot;seg50Rt&quot;:1,&quot;seg75Rt&quot;:1,&quot;seg90Rt&quot;:1,&quot;seg99Rt&quot;:2,&quot;successRateBiz&quot;:1,&quot;successRateReq&quot;:0}]</p>
         */
        public Builder apiBaselines(java.util.Map<String, ?> apiBaselines) {
            String apiBaselinesShrink = shrink(apiBaselines, "ApiBaselines", "json");
            this.putQueryParameter("ApiBaselines", apiBaselinesShrink);
            this.apiBaselines = apiBaselines;
            return this;
        }

        /**
         * <p>null null</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;avgRt&quot;:1,&quot;avgTps&quot;:1,&quot;failCountBiz&quot;:1,&quot;failCountReq&quot;:1,&quot;seg90Rt&quot;:1,&quot;seg99Rt&quot;:2,&quot;successRateBiz&quot;:0.5,&quot;successRateReq&quot;:1}</p>
         */
        public Builder sceneBaseline(java.util.Map<String, ?> sceneBaseline) {
            String sceneBaselineShrink = shrink(sceneBaseline, "SceneBaseline", "json");
            this.putQueryParameter("SceneBaseline", sceneBaselineShrink);
            this.sceneBaseline = sceneBaseline;
            return this;
        }

        /**
         * <p>The ID of the scene. For more information, see the <a href="https://help.aliyun.com/document_detail/201321.html">table</a> provided in this topic.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>NB54CV</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public UpdatePtsSceneBaseLineRequest build() {
            return new UpdatePtsSceneBaseLineRequest(this);
        } 

    } 

}
