// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAdaptationResponseBody} extends {@link TeaModel}
 *
 * <p>GetAdaptationResponseBody</p>
 */
public class GetAdaptationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdaptApplyId")
    private Long adaptApplyId;

    @com.aliyun.core.annotation.NameInMap("AdaptTarget")
    private AdaptTarget adaptTarget;

    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    private String appVersionId;

    @com.aliyun.core.annotation.NameInMap("GmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAdaptationResponseBody(Builder builder) {
        this.adaptApplyId = builder.adaptApplyId;
        this.adaptTarget = builder.adaptTarget;
        this.appId = builder.appId;
        this.appVersionId = builder.appVersionId;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdaptationResponseBody create() {
        return builder().build();
    }

    /**
     * @return adaptApplyId
     */
    public Long getAdaptApplyId() {
        return this.adaptApplyId;
    }

    /**
     * @return adaptTarget
     */
    public AdaptTarget getAdaptTarget() {
        return this.adaptTarget;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Long adaptApplyId; 
        private AdaptTarget adaptTarget; 
        private String appId; 
        private String appVersionId; 
        private String gmtCreate; 
        private String gmtModified; 
        private String requestId; 

        /**
         * AdaptApplyId.
         */
        public Builder adaptApplyId(Long adaptApplyId) {
            this.adaptApplyId = adaptApplyId;
            return this;
        }

        /**
         * AdaptTarget.
         */
        public Builder adaptTarget(AdaptTarget adaptTarget) {
            this.adaptTarget = adaptTarget;
            return this;
        }

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AppVersionId.
         */
        public Builder appVersionId(String appVersionId) {
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * GmtCreate.
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * GmtModified.
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAdaptationResponseBody build() {
            return new GetAdaptationResponseBody(this);
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
