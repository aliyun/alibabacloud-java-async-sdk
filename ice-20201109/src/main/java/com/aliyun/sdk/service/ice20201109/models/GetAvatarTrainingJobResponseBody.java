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
 * {@link GetAvatarTrainingJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetAvatarTrainingJobResponseBody</p>
 */
public class GetAvatarTrainingJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAvatarTrainingJobResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAvatarTrainingJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The data returned if the request was successful.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAvatarTrainingJobResponseBody build() {
            return new GetAvatarTrainingJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAvatarTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAvatarTrainingJobResponseBody</p>
     */
    public static class AvatarTrainingJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarDescription")
        private String avatarDescription;

        @com.aliyun.core.annotation.NameInMap("AvatarId")
        private String avatarId;

        @com.aliyun.core.annotation.NameInMap("AvatarName")
        private String avatarName;

        @com.aliyun.core.annotation.NameInMap("AvatarType")
        private String avatarType;

        @com.aliyun.core.annotation.NameInMap("FirstTrainingTime")
        private String firstTrainingTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("LastTrainingTime")
        private String lastTrainingTime;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Portrait")
        private String portrait;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Thumbnail")
        private String thumbnail;

        @com.aliyun.core.annotation.NameInMap("Transparent")
        private Boolean transparent;

        @com.aliyun.core.annotation.NameInMap("Video")
        private String video;

        private AvatarTrainingJob(Builder builder) {
            this.avatarDescription = builder.avatarDescription;
            this.avatarId = builder.avatarId;
            this.avatarName = builder.avatarName;
            this.avatarType = builder.avatarType;
            this.firstTrainingTime = builder.firstTrainingTime;
            this.jobId = builder.jobId;
            this.lastTrainingTime = builder.lastTrainingTime;
            this.message = builder.message;
            this.portrait = builder.portrait;
            this.status = builder.status;
            this.thumbnail = builder.thumbnail;
            this.transparent = builder.transparent;
            this.video = builder.video;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvatarTrainingJob create() {
            return builder().build();
        }

        /**
         * @return avatarDescription
         */
        public String getAvatarDescription() {
            return this.avatarDescription;
        }

        /**
         * @return avatarId
         */
        public String getAvatarId() {
            return this.avatarId;
        }

        /**
         * @return avatarName
         */
        public String getAvatarName() {
            return this.avatarName;
        }

        /**
         * @return avatarType
         */
        public String getAvatarType() {
            return this.avatarType;
        }

        /**
         * @return firstTrainingTime
         */
        public String getFirstTrainingTime() {
            return this.firstTrainingTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return lastTrainingTime
         */
        public String getLastTrainingTime() {
            return this.lastTrainingTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return portrait
         */
        public String getPortrait() {
            return this.portrait;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return thumbnail
         */
        public String getThumbnail() {
            return this.thumbnail;
        }

        /**
         * @return transparent
         */
        public Boolean getTransparent() {
            return this.transparent;
        }

        /**
         * @return video
         */
        public String getVideo() {
            return this.video;
        }

        public static final class Builder {
            private String avatarDescription; 
            private String avatarId; 
            private String avatarName; 
            private String avatarType; 
            private String firstTrainingTime; 
            private String jobId; 
            private String lastTrainingTime; 
            private String message; 
            private String portrait; 
            private String status; 
            private String thumbnail; 
            private Boolean transparent; 
            private String video; 

            /**
             * <p>The description of the digital human.</p>
             */
            public Builder avatarDescription(String avatarDescription) {
                this.avatarDescription = avatarDescription;
                return this;
            }

            /**
             * <p>The ID of the digital human.</p>
             * 
             * <strong>example:</strong>
             * <p>Avatar-XXXX</p>
             */
            public Builder avatarId(String avatarId) {
                this.avatarId = avatarId;
                return this;
            }

            /**
             * <p>The name of the digital human.</p>
             */
            public Builder avatarName(String avatarName) {
                this.avatarName = avatarName;
                return this;
            }

            /**
             * <p>The type of the digital human.</p>
             * 
             * <strong>example:</strong>
             * <p>2DAvatar</p>
             */
            public Builder avatarType(String avatarType) {
                this.avatarType = avatarType;
                return this;
            }

            /**
             * <ul>
             * <li>The time when the first training was initiated.</li>
             * <li>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2020-12-23T13:33:40Z</p>
             */
            public Builder firstTrainingTime(String firstTrainingTime) {
                this.firstTrainingTime = firstTrainingTime;
                return this;
            }

            /**
             * <p>The ID of the digital human training job.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>55d86f7f4587943ce7734d6b</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <ul>
             * <li>The time when the last training was initiated.</li>
             * <li>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2020-12-23T13:33:40Z</p>
             */
            public Builder lastTrainingTime(String lastTrainingTime) {
                this.lastTrainingTime = lastTrainingTime;
                return this;
            }

            /**
             * <p>The status description.</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The media asset ID of the portrait image.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
             */
            public Builder portrait(String portrait) {
                this.portrait = portrait;
                return this;
            }

            /**
             * <ul>
             * <li>The state of the digital human training job.</li>
             * <li>Valid values: Init, Queuing, Training, Success, and Fail.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The thumbnail URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png">https://your-bucket.oss-cn-hangzhou.aliyuncs.com/thumbnail.png</a></p>
             */
            public Builder thumbnail(String thumbnail) {
                this.thumbnail = thumbnail;
                return this;
            }

            /**
             * <p>Indicates whether the input video supports alpha channels.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder transparent(Boolean transparent) {
                this.transparent = transparent;
                return this;
            }

            /**
             * <p>The ID of the video used for training.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>571c704445f9a0ee011406c2</strong></strong></p>
             */
            public Builder video(String video) {
                this.video = video;
                return this;
            }

            public AvatarTrainingJob build() {
                return new AvatarTrainingJob(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAvatarTrainingJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetAvatarTrainingJobResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarTrainingJob")
        private AvatarTrainingJob avatarTrainingJob;

        private Data(Builder builder) {
            this.avatarTrainingJob = builder.avatarTrainingJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avatarTrainingJob
         */
        public AvatarTrainingJob getAvatarTrainingJob() {
            return this.avatarTrainingJob;
        }

        public static final class Builder {
            private AvatarTrainingJob avatarTrainingJob; 

            /**
             * <p>The information about the digital human training job.</p>
             */
            public Builder avatarTrainingJob(AvatarTrainingJob avatarTrainingJob) {
                this.avatarTrainingJob = avatarTrainingJob;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
