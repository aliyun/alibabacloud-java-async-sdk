// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link GetVideoModerationResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetVideoModerationResultResponseBody</p>
 */
public class GetVideoModerationResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("EventId")
    private String eventId;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ModerationResult")
    private ModerationResult moderationResult;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("TaskId")
    private String taskId;

    @com.aliyun.core.annotation.NameInMap("TaskType")
    private String taskType;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private GetVideoModerationResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.endTime = builder.endTime;
        this.eventId = builder.eventId;
        this.message = builder.message;
        this.moderationResult = builder.moderationResult;
        this.projectName = builder.projectName;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
        this.status = builder.status;
        this.taskId = builder.taskId;
        this.taskType = builder.taskType;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVideoModerationResultResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return moderationResult
     */
    public ModerationResult getModerationResult() {
        return this.moderationResult;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return taskType
     */
    public String getTaskType() {
        return this.taskType;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String code; 
        private String endTime; 
        private String eventId; 
        private String message; 
        private ModerationResult moderationResult; 
        private String projectName; 
        private String requestId; 
        private String startTime; 
        private String status; 
        private String taskId; 
        private String taskType; 
        private String userData; 

        private Builder() {
        } 

        private Builder(GetVideoModerationResultResponseBody model) {
            this.code = model.code;
            this.endTime = model.endTime;
            this.eventId = model.eventId;
            this.message = model.message;
            this.moderationResult = model.moderationResult;
            this.projectName = model.projectName;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
            this.status = model.status;
            this.taskId = model.taskId;
            this.taskType = model.taskType;
            this.userData = model.userData;
        } 

        /**
         * <p>The task error code.</p>
         * 
         * <strong>example:</strong>
         * <p>ResourceNotFound</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The time when the task ended. The value is a UTC timestamp in ISO 8601 format with millisecond precision.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-03T10:20:56.87Z</p>
         */
        public Builder endTime(String endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The event ID.</p>
         * 
         * <strong>example:</strong>
         * <p>05C-1XBQvsG2Tn5kBx2dUWo43******</p>
         */
        public Builder eventId(String eventId) {
            this.eventId = eventId;
            return this;
        }

        /**
         * <p>The task error message.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified resource TaskId is not found.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The content moderation details.</p>
         */
        public Builder moderationResult(ModerationResult moderationResult) {
            this.moderationResult = moderationResult;
            return this;
        }

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>VideoModeration-d0f0df1d-531d-4ab4-b353-e7f475******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The time when the task started. The value is a UTC timestamp in ISO 8601 format with millisecond precision.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-03T10:20:41.432Z</p>
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>Running: The task is running.</li>
         * <li>Succeeded: The task succeeded.</li>
         * <li>Failed: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>VideoModeration-d0f0df1d-531d-4ab4-b353-e7f4750******</p>
         */
        public Builder taskId(String taskId) {
            this.taskId = taskId;
            return this;
        }

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>VideoModeration</p>
         */
        public Builder taskType(String taskType) {
            this.taskType = taskType;
            return this;
        }

        /**
         * <p>The custom user data.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;id&quot;: &quot;test-id&quot;,
         *       &quot;name&quot;: &quot;test-name&quot;
         * }</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public GetVideoModerationResultResponseBody build() {
            return new GetVideoModerationResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoModerationResultResponseBody</p>
     */
    public static class BlockFrames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("Offset")
        private Integer offset;

        @com.aliyun.core.annotation.NameInMap("Rate")
        private Double rate;

        private BlockFrames(Builder builder) {
            this.label = builder.label;
            this.offset = builder.offset;
            this.rate = builder.rate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockFrames create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return offset
         */
        public Integer getOffset() {
            return this.offset;
        }

        /**
         * @return rate
         */
        public Double getRate() {
            return this.rate;
        }

        public static final class Builder {
            private String label; 
            private Integer offset; 
            private Double rate; 

            private Builder() {
            } 

            private Builder(BlockFrames model) {
                this.label = model.label;
                this.offset = model.offset;
                this.rate = model.rate;
            } 

            /**
             * <p>The violation label.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;teat&quot;:&quot;val&quot;}</p>
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * <p>The offset of the frame.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder offset(Integer offset) {
                this.offset = offset;
                return this;
            }

            /**
             * <p>The confidence score of the violation.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            public BlockFrames build() {
                return new BlockFrames(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoModerationResultResponseBody</p>
     */
    public static class Frames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlockFrames")
        private java.util.List<BlockFrames> blockFrames;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Frames(Builder builder) {
            this.blockFrames = builder.blockFrames;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Frames create() {
            return builder().build();
        }

        /**
         * @return blockFrames
         */
        public java.util.List<BlockFrames> getBlockFrames() {
            return this.blockFrames;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<BlockFrames> blockFrames; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Frames model) {
                this.blockFrames = model.blockFrames;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The frames that contain violations.</p>
             */
            public Builder blockFrames(java.util.List<BlockFrames> blockFrames) {
                this.blockFrames = blockFrames;
                return this;
            }

            /**
             * <p>The total number of frames inspected.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Frames build() {
                return new Frames(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetVideoModerationResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetVideoModerationResultResponseBody</p>
     */
    public static class ModerationResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Categories")
        private java.util.List<String> categories;

        @com.aliyun.core.annotation.NameInMap("Frames")
        private Frames frames;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("URI")
        private String URI;

        private ModerationResult(Builder builder) {
            this.categories = builder.categories;
            this.frames = builder.frames;
            this.suggestion = builder.suggestion;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModerationResult create() {
            return builder().build();
        }

        /**
         * @return categories
         */
        public java.util.List<String> getCategories() {
            return this.categories;
        }

        /**
         * @return frames
         */
        public Frames getFrames() {
            return this.frames;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return URI
         */
        public String getURI() {
            return this.URI;
        }

        public static final class Builder {
            private java.util.List<String> categories; 
            private Frames frames; 
            private String suggestion; 
            private String URI; 

            private Builder() {
            } 

            private Builder(ModerationResult model) {
                this.categories = model.categories;
                this.frames = model.frames;
                this.suggestion = model.suggestion;
                this.URI = model.URI;
            } 

            /**
             * <p>The category list.</p>
             */
            public Builder categories(java.util.List<String> categories) {
                this.categories = categories;
                return this;
            }

            /**
             * <p>The frame-related information for video and animated image moderation.</p>
             */
            public Builder frames(Frames frames) {
                this.frames = frames;
                return this;
            }

            /**
             * <p>The moderation result suggestion. Valid values:</p>
             * <ul>
             * <li><strong>block</strong>: Violation detected.</li>
             * <li><strong>review</strong>: Suspected violation.</li>
             * <li><strong>pass</strong>: Passed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>block</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * <p>The file URI. The storage address of the OSS file. The address follows the format <code>oss://${bucketname}/${objectname}</code>, where <code>bucketname</code> is the name of an OSS bucket in the same region as the current project, and <code>objectname</code> is the file path.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://test-bucket/test-object</p>
             */
            public Builder URI(String URI) {
                this.URI = URI;
                return this;
            }

            public ModerationResult build() {
                return new ModerationResult(this);
            } 

        } 

    }
}
