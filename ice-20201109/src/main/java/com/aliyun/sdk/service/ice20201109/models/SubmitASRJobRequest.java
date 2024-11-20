// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitASRJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitASRJobRequest</p>
 */
public class SubmitASRJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputFile")
    private String inputFile;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitASRJobRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.duration = builder.duration;
        this.inputFile = builder.inputFile;
        this.startTime = builder.startTime;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitASRJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return duration
     */
    public String getDuration() {
        return this.duration;
    }

    /**
     * @return inputFile
     */
    public String getInputFile() {
        return this.inputFile;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitASRJobRequest, Builder> {
        private String description; 
        private String duration; 
        private String inputFile; 
        private String startTime; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitASRJobRequest request) {
            super(request);
            this.description = request.description;
            this.duration = request.duration;
            this.inputFile = request.inputFile;
            this.startTime = request.startTime;
            this.title = request.title;
            this.userData = request.userData;
        } 

        /**
         * <p>The job description, which can up to 128 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>测试描述</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The speech duration.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:10</p>
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * <p>The input file. You can specify an Object Storage Service (OSS) URL or the ID of a media asset in the media asset library.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://example-bucket.oss-cn-shanghai.aliyuncs.com/example.mp4 或 <strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
         */
        public Builder inputFile(String inputFile) {
            this.putQueryParameter("InputFile", inputFile);
            this.inputFile = inputFile;
            return this;
        }

        /**
         * <p>The start time of the speech to recognize.</p>
         * 
         * <strong>example:</strong>
         * <p>00:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The job title, which can be up to 128 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>测试标题</p>
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
            return this;
        }

        /**
         * <p>The user-defined data in the JSON format. You can specify your business information, such as the business environment and job information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;user&quot;: &quot;data&quot;,
         *       &quot;env&quot;: &quot;prod&quot;
         * }</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitASRJobRequest build() {
            return new SubmitASRJobRequest(this);
        } 

    } 

}
