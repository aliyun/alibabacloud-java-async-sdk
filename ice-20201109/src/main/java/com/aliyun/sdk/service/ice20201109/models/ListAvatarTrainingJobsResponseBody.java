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
 * {@link ListAvatarTrainingJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAvatarTrainingJobsResponseBody</p>
 */
public class ListAvatarTrainingJobsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAvatarTrainingJobsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvatarTrainingJobsResponseBody create() {
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
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAvatarTrainingJobsResponseBody build() {
            return new ListAvatarTrainingJobsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAvatarTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvatarTrainingJobsResponseBody</p>
     */
    public static class AvatarTrainingJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarDescription")
        private String avatarDescription;

        @com.aliyun.core.annotation.NameInMap("AvatarId")
        private String avatarId;

        @com.aliyun.core.annotation.NameInMap("AvatarName")
        private String avatarName;

        @com.aliyun.core.annotation.NameInMap("AvatarType")
        private String avatarType;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

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

        private AvatarTrainingJobList(Builder builder) {
            this.avatarDescription = builder.avatarDescription;
            this.avatarId = builder.avatarId;
            this.avatarName = builder.avatarName;
            this.avatarType = builder.avatarType;
            this.createTime = builder.createTime;
            this.firstTrainingTime = builder.firstTrainingTime;
            this.jobId = builder.jobId;
            this.lastTrainingTime = builder.lastTrainingTime;
            this.message = builder.message;
            this.portrait = builder.portrait;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AvatarTrainingJobList create() {
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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

        public static final class Builder {
            private String avatarDescription; 
            private String avatarId; 
            private String avatarName; 
            private String avatarType; 
            private String createTime; 
            private String firstTrainingTime; 
            private String jobId; 
            private String lastTrainingTime; 
            private String message; 
            private String portrait; 
            private String status; 

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
             * <p>Avatar-XXX</p>
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
             * <li>The time when the job was created.</li>
             * <li>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2020-12-23T13:33:40Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * <p><em><strong><strong>aded114489ea02e0addf93</strong></strong></em></p>
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
             * <p><em><strong><strong>aded114489ea02e0addf93</strong></strong></em></p>
             */
            public Builder portrait(String portrait) {
                this.portrait = portrait;
                return this;
            }

            /**
             * <p>The state of the digital human training job.</p>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public AvatarTrainingJobList build() {
                return new AvatarTrainingJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAvatarTrainingJobsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAvatarTrainingJobsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AvatarTrainingJobList")
        private java.util.List<AvatarTrainingJobList> avatarTrainingJobList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.avatarTrainingJobList = builder.avatarTrainingJobList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return avatarTrainingJobList
         */
        public java.util.List<AvatarTrainingJobList> getAvatarTrainingJobList() {
            return this.avatarTrainingJobList;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<AvatarTrainingJobList> avatarTrainingJobList; 
            private Long totalCount; 

            /**
             * <p>The list of digital human training jobs.</p>
             */
            public Builder avatarTrainingJobList(java.util.List<AvatarTrainingJobList> avatarTrainingJobList) {
                this.avatarTrainingJobList = avatarTrainingJobList;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
