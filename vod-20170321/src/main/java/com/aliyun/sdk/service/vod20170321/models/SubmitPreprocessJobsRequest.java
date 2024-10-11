// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitPreprocessJobsRequest} extends {@link RequestModel}
 *
 * <p>SubmitPreprocessJobsRequest</p>
 */
public class SubmitPreprocessJobsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PreprocessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String preprocessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoId;

    private SubmitPreprocessJobsRequest(Builder builder) {
        super(builder);
        this.preprocessType = builder.preprocessType;
        this.videoId = builder.videoId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitPreprocessJobsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return preprocessType
     */
    public String getPreprocessType() {
        return this.preprocessType;
    }

    /**
     * @return videoId
     */
    public String getVideoId() {
        return this.videoId;
    }

    public static final class Builder extends Request.Builder<SubmitPreprocessJobsRequest, Builder> {
        private String preprocessType; 
        private String videoId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitPreprocessJobsRequest request) {
            super(request);
            this.preprocessType = request.preprocessType;
            this.videoId = request.videoId;
        } 

        /**
         * <p>The preprocessing type. Set the value to <strong>LivePreprocess</strong>. LivePreprocess specifies that the video is preprocessed in the production studio.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>LivePreprocess</p>
         */
        public Builder preprocessType(String preprocessType) {
            this.putQueryParameter("PreprocessType", preprocessType);
            this.preprocessType = preprocessType;
            return this;
        }

        /**
         * <p>The ID of the video. You can use one of the following methods to obtain the ID:</p>
         * <ul>
         * <li>After you upload a video in the ApsaraVideo VOD console, you can log on to the <a href="https://vod.console.aliyun.com">ApsaraVideo VOD console</a> and choose <strong>Media Files</strong> &gt; <strong>Audio/Video</strong> to view the ID of the video.</li>
         * <li>Obtain the VideoId from the response to the <a href="https://help.aliyun.com/document_detail/55407.html">CreateUploadVideo</a> operation that you call to upload videos.</li>
         * <li>Obtain the VideoId from the response to the <a href="https://help.aliyun.com/document_detail/86044.html">SearchMedia</a> operation that you call to query videos.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d3e680e618708efbf2cae7cc9312****</p>
         */
        public Builder videoId(String videoId) {
            this.putQueryParameter("VideoId", videoId);
            this.videoId = videoId;
            return this;
        }

        @Override
        public SubmitPreprocessJobsRequest build() {
            return new SubmitPreprocessJobsRequest(this);
        } 

    } 

}
