// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link SubmitDynamicImageJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitDynamicImageJobRequest</p>
 */
public class SubmitDynamicImageJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DynamicImageTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dynamicImageTemplateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OverrideParams")
    private String overrideParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private SubmitDynamicImageJobRequest(Builder builder) {
        super(builder);
        this.dynamicImageTemplateId = builder.dynamicImageTemplateId;
        this.overrideParams = builder.overrideParams;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitDynamicImageJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dynamicImageTemplateId
     */
    public String getDynamicImageTemplateId() {
        return this.dynamicImageTemplateId;
    }

    /**
     * @return overrideParams
     */
    public String getOverrideParams() {
        return this.overrideParams;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<SubmitDynamicImageJobRequest, Builder> {
        private String dynamicImageTemplateId; 
        private String overrideParams; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitDynamicImageJobRequest request) {
            super(request);
            this.dynamicImageTemplateId = request.dynamicImageTemplateId;
            this.overrideParams = request.overrideParams;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The ID of the animated image template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1a443dc52ef10abc4794d700*****</p>
         */
        public Builder dynamicImageTemplateId(String dynamicImageTemplateId) {
            this.putQueryParameter("DynamicImageTemplateId", dynamicImageTemplateId);
            this.dynamicImageTemplateId = dynamicImageTemplateId;
            return this;
        }

        /**
         * <p>The override parameters in JSON string format. For more information, see <a href="https://help.aliyun.com/document_detail/98618.html">OverrideParams</a>. You can override the parameters in the animated image template configuration. For more information, see <a href="https://help.aliyun.com/document_detail/52839.html">DynamicImageTemplateConfig</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Watermarks&quot;:[{&quot;Content&quot;:&quot;UserID: 666**&quot;,&quot;WatermarkId&quot;:&quot;8ca03c884944bd05efccc312367****&quot;}]}</p>
         */
        public Builder overrideParams(String overrideParams) {
            this.putQueryParameter("OverrideParams", overrideParams);
            this.overrideParams = overrideParams;
            return this;
        }

        /**
         * <p>The video ID. You can obtain the video ID by using one of the following methods:</p>
         * <ul>
         * <li>For videos uploaded through the console, log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Assets</strong> &gt; <strong>Audio/Video</strong> to view the video ID.</li>
         * <li>When you call the <a href="https://help.aliyun.com/document_detail/55407.html">Obtain the upload URL and credential for a video</a> operation to obtain the upload URL and credential, the video ID is the value of the VideoId response parameter.</li>
         * <li>After a video is uploaded, you can call the <a href="https://help.aliyun.com/document_detail/86044.html">Search for media information</a> operation to query the video ID. The video ID is the value of the VideoId response parameter.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>7d2fbc3e273441bdb0e08e55f8****</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public SubmitDynamicImageJobRequest build() {
            return new SubmitDynamicImageJobRequest(this);
        } 

    } 

}
