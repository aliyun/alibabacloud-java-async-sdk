// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260319.models;

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
 * {@link SubmitVideoGenerationJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitVideoGenerationJobRequest</p>
 */
public class SubmitVideoGenerationJobRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Duration")
    private String duration;

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
    private Integer n;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resolution")
    private String resolution;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitVideoGenerationJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.aspectRatio = builder.aspectRatio;
        this.clientToken = builder.clientToken;
        this.duration = builder.duration;
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

    public static SubmitVideoGenerationJobRequest create() {
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
     * @return duration
     */
    public String getDuration() {
        return this.duration;
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
    public Integer getN() {
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

    public static final class Builder extends Request.Builder<SubmitVideoGenerationJobRequest, Builder> {
        private String regionId; 
        private String aspectRatio; 
        private String clientToken; 
        private String duration; 
        private String input; 
        private String jobParameters; 
        private String jobType; 
        private String model; 
        private Integer n; 
        private String resolution; 
        private String scene; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitVideoGenerationJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.aspectRatio = request.aspectRatio;
            this.clientToken = request.clientToken;
            this.duration = request.duration;
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
         * AspectRatio.
         */
        public Builder aspectRatio(String aspectRatio) {
            this.putQueryParameter("AspectRatio", aspectRatio);
            this.aspectRatio = aspectRatio;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(String duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(String input) {
            this.putQueryParameter("Input", input);
            this.input = input;
            return this;
        }

        /**
         * JobParameters.
         */
        public Builder jobParameters(String jobParameters) {
            this.putQueryParameter("JobParameters", jobParameters);
            this.jobParameters = jobParameters;
            return this;
        }

        /**
         * JobType.
         */
        public Builder jobType(String jobType) {
            this.putQueryParameter("JobType", jobType);
            this.jobType = jobType;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putQueryParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * N.
         */
        public Builder n(Integer n) {
            this.putQueryParameter("N", n);
            this.n = n;
            return this;
        }

        /**
         * Resolution.
         */
        public Builder resolution(String resolution) {
            this.putQueryParameter("Resolution", resolution);
            this.resolution = resolution;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitVideoGenerationJobRequest build() {
            return new SubmitVideoGenerationJobRequest(this);
        } 

    } 

}
