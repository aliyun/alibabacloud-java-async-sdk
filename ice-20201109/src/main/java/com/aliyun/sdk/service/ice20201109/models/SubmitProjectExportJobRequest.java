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
 * {@link SubmitProjectExportJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitProjectExportJobRequest</p>
 */
public class SubmitProjectExportJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExportType")
    private String exportType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputMediaConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String outputMediaConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Timeline")
    private String timeline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitProjectExportJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.exportType = builder.exportType;
        this.outputMediaConfig = builder.outputMediaConfig;
        this.projectId = builder.projectId;
        this.timeline = builder.timeline;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitProjectExportJobRequest create() {
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
     * @return exportType
     */
    public String getExportType() {
        return this.exportType;
    }

    /**
     * @return outputMediaConfig
     */
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return timeline
     */
    public String getTimeline() {
        return this.timeline;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitProjectExportJobRequest, Builder> {
        private String regionId; 
        private String exportType; 
        private String outputMediaConfig; 
        private String projectId; 
        private String timeline; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitProjectExportJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.exportType = request.exportType;
            this.outputMediaConfig = request.outputMediaConfig;
            this.projectId = request.projectId;
            this.timeline = request.timeline;
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
         * <p>The export type. Valid values:</p>
         * <ul>
         * <li><strong>BaseTimeline</strong>: exports the timeline.</li>
         * <li><strong>AdobePremierePro</strong>: exports an Adobe Premiere Pro project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BaseTimeline</p>
         */
        public Builder exportType(String exportType) {
            this.putQueryParameter("ExportType", exportType);
            this.exportType = exportType;
            return this;
        }

        /**
         * <p>The output path for the exported project and generated intermediate files, in JSON format. The export destination only supports OSS. Path fields:</p>
         * <ul>
         * <li><strong>Bucket</strong>: Required. The OSS bucket name.</li>
         * <li><strong>Prefix</strong>: Optional. The path prefix. If not specified, it defaults to the root directory.</li>
         * <li><strong>Width</strong>: Optional. The width of the output. The value must be a positive integer. If not provided, the system automatically calculates the value based on the input project or timeline.</li>
         * <li><strong>Height</strong>: Optional. The height of the output. The value must be a positive integer. If not provided, the system automatically calculates the value based on the input project or timeline.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Bucket&quot;: &quot;example-bucket&quot;,
         *         &quot;Prefix&quot;: &quot;example_prefix&quot;,
         *         &quot;Width&quot;: 1920,
         *         &quot;Height&quot;: 1080
         * }</p>
         */
        public Builder outputMediaConfig(String outputMediaConfig) {
            this.putQueryParameter("OutputMediaConfig", outputMediaConfig);
            this.outputMediaConfig = outputMediaConfig;
            return this;
        }

        /**
         * <p>The ID of the online editing project.</p>
         * <blockquote>
         * <p>Notice: Either ProjectId or Timeline must be provided.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p><em><strong><strong>67ae06542b9b93e0d1c387</strong></strong></em></p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The timeline of the online editing job. For data structure, see <a href="https://help.aliyun.com/document_detail/198823.html">Timeline</a>.</p>
         * <blockquote>
         * <p>Notice: Either ProjectId or Timeline must be provided.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
         */
        public Builder timeline(String timeline) {
            this.putBodyParameter("Timeline", timeline);
            this.timeline = timeline;
            return this;
        }

        /**
         * <p>The user-defined data in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22,%22Key%22:%22Valuexxx%22%7D">http://xx.xx.xxx&quot;,&quot;Key&quot;:&quot;Valuexxx&quot;}</a></p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitProjectExportJobRequest build() {
            return new SubmitProjectExportJobRequest(this);
        } 

    } 

}
