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
 * {@link UpdateTemplateRequest} extends {@link RequestModel}
 *
 * <p>UpdateTemplateRequest</p>
 */
public class UpdateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoverUrl")
    private String coverUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreviewMedia")
    private String previewMedia;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RelatedMediaids")
    private String relatedMediaids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    private UpdateTemplateRequest(Builder builder) {
        super(builder);
        this.config = builder.config;
        this.coverUrl = builder.coverUrl;
        this.name = builder.name;
        this.previewMedia = builder.previewMedia;
        this.relatedMediaids = builder.relatedMediaids;
        this.source = builder.source;
        this.status = builder.status;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return coverUrl
     */
    public String getCoverUrl() {
        return this.coverUrl;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return previewMedia
     */
    public String getPreviewMedia() {
        return this.previewMedia;
    }

    /**
     * @return relatedMediaids
     */
    public String getRelatedMediaids() {
        return this.relatedMediaids;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<UpdateTemplateRequest, Builder> {
        private String config; 
        private String coverUrl; 
        private String name; 
        private String previewMedia; 
        private String relatedMediaids; 
        private String source; 
        private String status; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTemplateRequest request) {
            super(request);
            this.config = request.config;
            this.coverUrl = request.coverUrl;
            this.name = request.name;
            this.previewMedia = request.previewMedia;
            this.relatedMediaids = request.relatedMediaids;
            this.source = request.source;
            this.status = request.status;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The template configuration. For more information, see <a href="https://help.aliyun.com/document_detail/456193.html">Common template configuration details</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;VideoTracks&quot;: [
         *         {
         *             &quot;VideoTrackClips&quot;: [
         *                 {
         *                     &quot;Sys_Type&quot; : &quot;ArrayItems&quot;,
         *                     &quot;Sys_ArrayObject&quot; : &quot;$VideoArray&quot;,
         *                     &quot;Sys_Template&quot; : {
         *                         &quot;MediaId&quot; : &quot;$MediaId&quot;
         *                     }
         *                 }
         *             ]
         *         }
         *     ]
         * }</p>
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * <p>The URL of the template cover.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg">http://example-bucket.oss-cn-shanghai.aliyuncs.com/cover.jpg</a></p>
         */
        public Builder coverUrl(String coverUrl) {
            this.putQueryParameter("CoverUrl", coverUrl);
            this.coverUrl = coverUrl;
            return this;
        }

        /**
         * <p>The name of the cloud editing template.</p>
         * 
         * <strong>example:</strong>
         * <p>Cloud Clip Template 1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the preview video media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1ae320b48fb04483915d4f2cd8ac****</p>
         */
        public Builder previewMedia(String previewMedia) {
            this.putQueryParameter("PreviewMedia", previewMedia);
            this.previewMedia = previewMedia;
            return this;
        }

        /**
         * <p>The media assets associated with the template, used by the common template editor.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;video&quot;:[&quot;f64c6acc840247edb6b12f575c66****&quot;,&quot;9675dcf040ba4525bb037c29d156****&quot;],&quot;audio&quot;:[&quot;62a54019d9114009a5ae9bcfd70b****&quot;],&quot;image&quot;:[&quot;743ffbeb7e004c758cdc1fb34c04****&quot;]}</p>
         */
        public Builder relatedMediaids(String relatedMediaids) {
            this.putQueryParameter("RelatedMediaids", relatedMediaids);
            this.relatedMediaids = relatedMediaids;
            return this;
        }

        /**
         * <p>The update source. Default value: OpenAPI. Valid values:</p>
         * <ul>
         * <li>AliyunConsole: Created through the Alibaba Cloud Management Console.</li>
         * <li>OpenAPI: Created through OpenAPI.</li>
         * <li>WebSDK: Created through WebSDK.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>The template status. Valid values:</p>
         * <ul>
         * <li>Available: Normal.</li>
         * <li>Created: Created but unavailable.</li>
         * <li>Uploading: Uploading.</li>
         * <li>Processing: Analyzing the advanced template.</li>
         * <li>UploadFailed: Upload failed.</li>
         * <li>ProcessFailed: Advanced template analysis failed.</li>
         * </ul>
         * <blockquote>
         * <p>After an advanced template is created, it requires analysis time and its status is Processing. The template is unavailable during this period and can only be used when its status changes to Available. The analysis time depends on the template file size and typically ranges from 10 seconds to 5 minutes.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The ID of the cloud editing template. You can obtain the ID from the <a href="https://ice.console.aliyun.com/production/template/list/common">Intelligent Media Services console</a> or the response parameters of the <a href="https://help.aliyun.com/document_detail/441161.html">CreateTemplate</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>23923ec3318f4c359e42e1e5b296****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public UpdateTemplateRequest build() {
            return new UpdateTemplateRequest(this);
        } 

    } 

}
