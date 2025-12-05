// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link SubmitSceneBatchEditingJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSceneBatchEditingJobRequest</p>
 */
public class SubmitSceneBatchEditingJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitSceneBatchEditingJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.outputConfig = builder.outputConfig;
        this.projectIds = builder.projectIds;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSceneBatchEditingJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return outputConfig
     */
    public String getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @return projectIds
     */
    public String getProjectIds() {
        return this.projectIds;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitSceneBatchEditingJobRequest, Builder> {
        private String regionId; 
        private String outputConfig; 
        private String projectIds; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSceneBatchEditingJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.outputConfig = request.outputConfig;
            this.projectIds = request.projectIds;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The output configuration. The structure is the same as the <a href="https://help.aliyun.com/zh/ims/use-cases/create-highlight-videos?spm=a2c4g.11186623.help-menu-193643.d_3_2_0_3.3af86997GreVu9&scm=20140722.H_2863940._.OR_help-T_cn~zh-V_1#4111a373d0xbz">OutputConfig</a> for batch video generation, except that Count and GeneratePreviewOnly are not supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;MediaURL&quot;: &quot;<a href="http://test-bucket.oss-cn-shanghai.aliyuncs.com/xxx_%7Bindex%7D.mp4">http://test-bucket.oss-cn-shanghai.aliyuncs.com/xxx_{index}.mp4</a>&quot;,
         *   &quot;Width&quot;: 1080,
         *   &quot;Height&quot;: 1920
         * }</p>
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
            return this;
        }

        /**
         * <p>A comma-separated list of editing project IDs. The video is rendered based on the timeline from each project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>****ae91539d46bb9000f74b40b80dd2,****ae91539000f74b40b80dd9d46bb</p>
         */
        public Builder projectIds(String projectIds) {
            this.putQueryParameter("ProjectIds", projectIds);
            this.projectIds = projectIds;
            return this;
        }

        /**
         * <p>Custom user data, including callback configurations. For more information, see <a href="~~357745#section-urj-v3f-0s1~~">UserData</a>.</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitSceneBatchEditingJobRequest build() {
            return new SubmitSceneBatchEditingJobRequest(this);
        } 

    } 

}
