// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link SubmitImageGenerationJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitImageGenerationJobRequest</p>
 */
public class SubmitImageGenerationJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AspectRatio")
    private String aspectRatio;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private String input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobParameters")
    private String jobParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobType")
    private String jobType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("N")
    private String n;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    private String resolution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitImageGenerationJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aspectRatio = builder.aspectRatio;
        this.clientToken = builder.clientToken;
        this.input = builder.input;
        this.jobParameters = builder.jobParameters;
        this.jobType = builder.jobType;
        this.model = builder.model;
        this.n = builder.n;
        this.resolution = builder.resolution;
        this.scene = builder.scene;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitImageGenerationJobRequest create() {
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
     * @return aspectRatio
     */
    public String getAspectRatio() {
        return this.aspectRatio;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return jobParameters
     */
    public String getJobParameters() {
        return this.jobParameters;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return n
     */
    public String getN() {
        return this.n;
    }

    /**
     * @return resolution
     */
    public String getResolution() {
        return this.resolution;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitImageGenerationJobRequest, Builder> {
        private String regionId; 
        private String aspectRatio; 
        private String clientToken; 
        private String input; 
        private String jobParameters; 
        private String jobType; 
        private String model; 
        private String n; 
        private String resolution; 
        private String scene; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitImageGenerationJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aspectRatio = request.aspectRatio;
            this.clientToken = request.clientToken;
            this.input = request.input;
            this.jobParameters = request.jobParameters;
            this.jobType = request.jobType;
            this.model = request.model;
            this.n = request.n;
            this.resolution = request.resolution;
            this.scene = request.scene;
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
         * <p>The aspect ratio. Valid values: 16:9 (default), 9:16, 4:3, 3:4, 1:1, and 21:9.</p>
         * 
         * <strong>example:</strong>
         * <p>4:3</p>
         */
        public Builder aspectRatio(String aspectRatio) {
            this.putQueryParameter("AspectRatio", aspectRatio);
            this.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * <p>The idempotency token. A unique, case-sensitive string of up to 32 characters. This token ensures that the request is completed no more than once, preventing duplicate operations caused by multiple retries.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>3e761e9d11edba640c42a1b7</strong></strong></p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The task input. This parameter is required. The value is a JSON string that contains the following fields:</p>
         * <ul>
         * <li>Prompt: String. Required. The prompt for image generation.</li>
         * <li>Medias: A list of media items. Required when the task type is <code>image_to_image</code>. A maximum of 9 items are supported.<blockquote>
         * <p>The Media struct contains the following fields: Type, the media type, String, valid value: image. URL, the download URL of the media, String. MediaId, the media asset ID, String.</p>
         * </blockquote>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Prompt&quot;:&quot;xxx&quot;,&quot;Medias&quot;:[{&quot;Type&quot;:&quot;image&quot;,&quot;URL&quot;:&quot;xxx&quot;}]}</p>
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * <p>The task feature parameters. The value is a JSON string. You do not need to set this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder jobParameters(String jobParameters) {
            this.putQueryParameter("JobParameters", jobParameters);
            this.jobParameters = jobParameters;
            return this;
        }

        /**
         * <p>The type of the generation task. This parameter is required. Valid values:</p>
         * <ul>
         * <li>text_to_image: text-to-image generation.</li>
         * <li>image_to_image: image-to-image generation.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>text_to_image</p>
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * <p>The model name. This parameter is required. Valid values:</p>
         * <ul>
         * <li>qwen-image-3.0</li>
         * <li>qwen-image-2.0-pro</li>
         * <li>qwen-image-2.0</li>
         * <li>wan2.7-image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>wan2.7-image</p>
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>The number of images. Valid values: 1 to 4. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder n(String n) {
            this.putQueryParameter("N", n);
            this.n = n;
            return this;
        }

        /**
         * <p>The resolution. Valid values: 1K (default), 2K, and 4K.</p>
         * 
         * <strong>example:</strong>
         * <p>720P</p>
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * <p>The scenario. This is an enumeration type. Currently, only <code>general</code> is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * <p>The user business data in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;env&quot;:&quot;prd&quot;}</p>
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitImageGenerationJobRequest build() {
            return new SubmitImageGenerationJobRequest(this);
        } 

    } 

}
