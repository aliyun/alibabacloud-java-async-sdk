// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAdaptationRequest} extends {@link RequestModel}
 *
 * <p>CreateAdaptationRequest</p>
 */
public class CreateAdaptationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AdaptTarget")
    private AdaptTarget adaptTarget;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appVersionId;

    private CreateAdaptationRequest(Builder builder) {
        super(builder);
        this.adaptTarget = builder.adaptTarget;
        this.appVersionId = builder.appVersionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAdaptationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adaptTarget
     */
    public AdaptTarget getAdaptTarget() {
        return this.adaptTarget;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    public static final class Builder extends Request.Builder<CreateAdaptationRequest, Builder> {
        private AdaptTarget adaptTarget; 
        private String appVersionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAdaptationRequest request) {
            super(request);
            this.adaptTarget = request.adaptTarget;
            this.appVersionId = request.appVersionId;
        } 

        /**
         * AdaptTarget.
         */
        public Builder adaptTarget(AdaptTarget adaptTarget) {
            String adaptTargetShrink = shrink(adaptTarget, "AdaptTarget", "json");
            this.putBodyParameter("AdaptTarget", adaptTargetShrink);
            this.adaptTarget = adaptTarget;
            return this;
        }

        /**
         * AppVersionId.
         */
        public Builder appVersionId(String appVersionId) {
            this.putBodyParameter("AppVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        @Override
        public CreateAdaptationRequest build() {
            return new CreateAdaptationRequest(this);
        } 

    } 

    public static class AdaptTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BitRate")
        private Integer bitRate;

        @com.aliyun.core.annotation.NameInMap("FrameRate")
        private Integer frameRate;

        @com.aliyun.core.annotation.NameInMap("Resolution")
        private String resolution;

        @com.aliyun.core.annotation.NameInMap("StartProgram")
        private String startProgram;

        private AdaptTarget(Builder builder) {
            this.bitRate = builder.bitRate;
            this.frameRate = builder.frameRate;
            this.resolution = builder.resolution;
            this.startProgram = builder.startProgram;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdaptTarget create() {
            return builder().build();
        }

        /**
         * @return bitRate
         */
        public Integer getBitRate() {
            return this.bitRate;
        }

        /**
         * @return frameRate
         */
        public Integer getFrameRate() {
            return this.frameRate;
        }

        /**
         * @return resolution
         */
        public String getResolution() {
            return this.resolution;
        }

        /**
         * @return startProgram
         */
        public String getStartProgram() {
            return this.startProgram;
        }

        public static final class Builder {
            private Integer bitRate; 
            private Integer frameRate; 
            private String resolution; 
            private String startProgram; 

            /**
             * BitRate.
             */
            public Builder bitRate(Integer bitRate) {
                this.bitRate = bitRate;
                return this;
            }

            /**
             * FrameRate.
             */
            public Builder frameRate(Integer frameRate) {
                this.frameRate = frameRate;
                return this;
            }

            /**
             * Resolution.
             */
            public Builder resolution(String resolution) {
                this.resolution = resolution;
                return this;
            }

            /**
             * StartProgram.
             */
            public Builder startProgram(String startProgram) {
                this.startProgram = startProgram;
                return this;
            }

            public AdaptTarget build() {
                return new AdaptTarget(this);
            } 

        } 

    }
}
