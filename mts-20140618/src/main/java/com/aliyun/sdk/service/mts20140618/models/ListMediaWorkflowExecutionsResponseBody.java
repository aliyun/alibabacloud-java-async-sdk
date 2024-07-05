// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMediaWorkflowExecutionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListMediaWorkflowExecutionsResponseBody</p>
 */
public class ListMediaWorkflowExecutionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaWorkflowExecutionList")
    private MediaWorkflowExecutionList mediaWorkflowExecutionList;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListMediaWorkflowExecutionsResponseBody(Builder builder) {
        this.mediaWorkflowExecutionList = builder.mediaWorkflowExecutionList;
        this.nextPageToken = builder.nextPageToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMediaWorkflowExecutionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaWorkflowExecutionList
     */
    public MediaWorkflowExecutionList getMediaWorkflowExecutionList() {
        return this.mediaWorkflowExecutionList;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaWorkflowExecutionList mediaWorkflowExecutionList; 
        private String nextPageToken; 
        private String requestId; 

        /**
         * The details of the media workflows.
         */
        public Builder mediaWorkflowExecutionList(MediaWorkflowExecutionList mediaWorkflowExecutionList) {
            this.mediaWorkflowExecutionList = mediaWorkflowExecutionList;
            return this;
        }

        /**
         * The returned value of NextPageToken is a pagination token, which can be used in the next request to retrieve a new page of results.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListMediaWorkflowExecutionsResponseBody build() {
            return new ListMediaWorkflowExecutionsResponseBody(this);
        } 

    } 

    public static class MNSMessageResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("MessageId")
        private String messageId;

        private MNSMessageResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.messageId = builder.messageId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MNSMessageResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return messageId
         */
        public String getMessageId() {
            return this.messageId;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String messageId; 

            /**
             * The error code returned if the job failed. If the job was successful, this parameter is not returned.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned if the job failed. If the job was successful, this parameter is not returned.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The ID of the success message. If the job failed, this parameter is not returned.
             */
            public Builder messageId(String messageId) {
                this.messageId = messageId;
                return this;
            }

            public MNSMessageResult build() {
                return new MNSMessageResult(this);
            } 

        } 

    }
    public static class Activity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MNSMessageResult")
        private MNSMessageResult MNSMessageResult;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Activity(Builder builder) {
            this.code = builder.code;
            this.endTime = builder.endTime;
            this.jobId = builder.jobId;
            this.MNSMessageResult = builder.MNSMessageResult;
            this.message = builder.message;
            this.name = builder.name;
            this.startTime = builder.startTime;
            this.state = builder.state;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Activity create() {
            return builder().build();
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
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return MNSMessageResult
         */
        public MNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String endTime; 
            private String jobId; 
            private MNSMessageResult MNSMessageResult; 
            private String message; 
            private String name; 
            private String startTime; 
            private String state; 
            private String type; 

            /**
             * The error code returned if the request failed.
             * <p>
             * 
             * *   The specific error code appears if the state of the activity is **Fail**.
             * *   This parameter is not returned if the state of the activity is **Success**.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The end time of the activity.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * The ID of the job generated when the activity is executed. We recommend that you keep this ID for subsequent operation calls.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The message sent by Message Service (MNS) to notify the user of the job result.
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * The error message returned if the request failed.
             * <p>
             * 
             * *   The detailed error message appears if the state of the activity is **Fail**.
             * *   This parameter is not returned if the state of the activity is **Success**.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The name of the media workflow activity.
             * <p>
             * 
             * > The name of an activity in a media workflow is unique.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The start time of the activity.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * The status of the activity. Valid values:
             * <p>
             * 
             * *   **Running**: The activity is being executed.
             * *   **Fail**: The activity failed to be executed.
             * *   **Skipped**: The activity was skipped.
             * *   **Success**: The activity was successfully executed.
             * 
             * > For example, the high-definition and standard-definition transcoding activities are to be run after the analysis activity is complete. The system determines the activity to run based on the analysis result. If the definition of the input video content is insufficient, the high-definition transcoding activity may be skipped.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The type of the media workflow activity. Valid values: Start, Snapshot, Transcode, Analysis, and Report. For more information, see [Methods supported for media workflows](~~68494~~).
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Activity build() {
                return new Activity(this);
            } 

        } 

    }
    public static class ActivityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Activity")
        private java.util.List < Activity> activity;

        private ActivityList(Builder builder) {
            this.activity = builder.activity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ActivityList create() {
            return builder().build();
        }

        /**
         * @return activity
         */
        public java.util.List < Activity> getActivity() {
            return this.activity;
        }

        public static final class Builder {
            private java.util.List < Activity> activity; 

            /**
             * Activity.
             */
            public Builder activity(java.util.List < Activity> activity) {
                this.activity = activity;
                return this;
            }

            public ActivityList build() {
                return new ActivityList(this);
            } 

        } 

    }
    public static class InputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        private InputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputFile create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 

            /**
             * The name of the OSS bucket in which the input media file is stored.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The OSS region in which the input file resides.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The name of the OSS object that is used as the input media file.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            public InputFile build() {
                return new InputFile(this);
            } 

        } 

    }
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputFile")
        private InputFile inputFile;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Input(Builder builder) {
            this.inputFile = builder.inputFile;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return inputFile
         */
        public InputFile getInputFile() {
            return this.inputFile;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private InputFile inputFile; 
            private String userData; 

            /**
             * The information about the storage location of the input file of the media workflow in OSS.
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * The custom data.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class MediaWorkflowExecution extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityList")
        private ActivityList activityList;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("MediaWorkflowId")
        private String mediaWorkflowId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RunId")
        private String runId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        private MediaWorkflowExecution(Builder builder) {
            this.activityList = builder.activityList;
            this.creationTime = builder.creationTime;
            this.input = builder.input;
            this.mediaId = builder.mediaId;
            this.mediaWorkflowId = builder.mediaWorkflowId;
            this.name = builder.name;
            this.runId = builder.runId;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaWorkflowExecution create() {
            return builder().build();
        }

        /**
         * @return activityList
         */
        public ActivityList getActivityList() {
            return this.activityList;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
        }

        /**
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return mediaWorkflowId
         */
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return runId
         */
        public String getRunId() {
            return this.runId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private ActivityList activityList; 
            private String creationTime; 
            private Input input; 
            private String mediaId; 
            private String mediaWorkflowId; 
            private String name; 
            private String runId; 
            private String state; 

            /**
             * The activities that are executed in the media workflow.
             */
            public Builder activityList(ActivityList activityList) {
                this.activityList = activityList;
                return this;
            }

            /**
             * The time when the media workflow was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The custom data of the media workflow.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * The ID of the media file. A media file contains all the information about a media workflow.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * The ID of the media workflow.
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * The name of the media workflow.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The ID of the execution instance.
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * The status of the media workflow. Valid values:
             * <p>
             * 
             * *   **running**: The execution is in progress.
             * *   **Completed**: The execution is complete.
             * 
             * > A value of Completed indicates that the execution is complete. For the information about whether each activity, such as Transcode or Snapshot, is successful, check the status of the activity.
             * 
             * *   **Fail**: The execution failed.
             * *   **Success**: The execution was successful.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public MediaWorkflowExecution build() {
                return new MediaWorkflowExecution(this);
            } 

        } 

    }
    public static class MediaWorkflowExecutionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MediaWorkflowExecution")
        private java.util.List < MediaWorkflowExecution> mediaWorkflowExecution;

        private MediaWorkflowExecutionList(Builder builder) {
            this.mediaWorkflowExecution = builder.mediaWorkflowExecution;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaWorkflowExecutionList create() {
            return builder().build();
        }

        /**
         * @return mediaWorkflowExecution
         */
        public java.util.List < MediaWorkflowExecution> getMediaWorkflowExecution() {
            return this.mediaWorkflowExecution;
        }

        public static final class Builder {
            private java.util.List < MediaWorkflowExecution> mediaWorkflowExecution; 

            /**
             * MediaWorkflowExecution.
             */
            public Builder mediaWorkflowExecution(java.util.List < MediaWorkflowExecution> mediaWorkflowExecution) {
                this.mediaWorkflowExecution = mediaWorkflowExecution;
                return this;
            }

            public MediaWorkflowExecutionList build() {
                return new MediaWorkflowExecutionList(this);
            } 

        } 

    }
}
