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
         * <p>The ID of the frame animation template.</p>
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
         * <p>The override parameter. Specify the value in the JSON format. For more information, see <a href="https://help.aliyun.com/document_detail/98618.html">Parameters for media processing</a>. You can use this parameter to override configurations in the animated image template. For more information, see the &quot;DynamicImageTemplateConfig: the configurations of an animated sticker template&quot; section of the <a href="https://help.aliyun.com/document_detail/52839.html">Basic data types</a> topic.</p>
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
         * <p>The ID of the video. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>Log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD</a> console. In the left-side navigation pane, choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong>. On the Video and Audio page, view the ID of the media file. This method is applicable to files that are uploaded by using the ApsaraVideo VOD console.</li>
         * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to upload media files.</li>
         * <li>Obtain the value of VideoId from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation after you upload media files.</li>
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
