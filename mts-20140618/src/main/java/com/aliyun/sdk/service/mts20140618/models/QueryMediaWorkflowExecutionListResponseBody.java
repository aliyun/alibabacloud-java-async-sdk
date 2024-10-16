// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryMediaWorkflowExecutionListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMediaWorkflowExecutionListResponseBody</p>
 */
public class QueryMediaWorkflowExecutionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaWorkflowExecutionList")
    private MediaWorkflowExecutionList mediaWorkflowExecutionList;

    @com.aliyun.core.annotation.NameInMap("NonExistRunIds")
    private NonExistRunIds nonExistRunIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryMediaWorkflowExecutionListResponseBody(Builder builder) {
        this.mediaWorkflowExecutionList = builder.mediaWorkflowExecutionList;
        this.nonExistRunIds = builder.nonExistRunIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMediaWorkflowExecutionListResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaWorkflowExecutionList
     */
    public MediaWorkflowExecutionList getMediaWorkflowExecutionList() {
        return this.mediaWorkflowExecutionList;
    }

    /**
     * @return nonExistRunIds
     */
    public NonExistRunIds getNonExistRunIds() {
        return this.nonExistRunIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MediaWorkflowExecutionList mediaWorkflowExecutionList; 
        private NonExistRunIds nonExistRunIds; 
        private String requestId; 

        /**
         * <p>The details of the media workflows.</p>
         */
        public Builder mediaWorkflowExecutionList(MediaWorkflowExecutionList mediaWorkflowExecutionList) {
            this.mediaWorkflowExecutionList = mediaWorkflowExecutionList;
            return this;
        }

        /**
         * <p>The IDs of the execution instances that do not exist.</p>
         */
        public Builder nonExistRunIds(NonExistRunIds nonExistRunIds) {
            this.nonExistRunIds = nonExistRunIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D1D5C080-8E2F-5030-8AB4-13092F17631B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryMediaWorkflowExecutionListResponseBody build() {
            return new QueryMediaWorkflowExecutionListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMediaWorkflowExecutionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaWorkflowExecutionListResponseBody</p>
     */
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
             * <p>The error code returned if the MNS message fails to be sent. This parameter is not returned if the MNS message is sent.</p>
             * 
             * <strong>example:</strong>
             * <p>The Topic/Queue config is empty, not send message</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message returned if the MNS message fails to be sent. This parameter is not returned if the MNS message is sent.</p>
             * 
             * <strong>example:</strong>
             * <p>MessageConfigEmpty</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the message that indicates the MNS message is sent. This parameter is not returned if the MNS message fails to be sent.</p>
             * 
             * <strong>example:</strong>
             * <p>4f3bc83233de4e2f81c7dade443e****</p>
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
    /**
     * 
     * {@link QueryMediaWorkflowExecutionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaWorkflowExecutionListResponseBody</p>
     */
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
             * <p>The error code.</p>
             * <ul>
             * <li>This parameter is returned only if <strong>Fail</strong> is returned for the State parameter.</li>
             * <li>This parameter is not returned if the method status is <strong>Success</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter.ResourceContentBad</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the method ends.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-04-01T06:53:44Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The IDs of the jobs that are generated when the methods are called, such as the job IDs for the analysis, transcode, and snapshot methods.</p>
             * 
             * <strong>example:</strong>
             * <p>2376030d9d0849399cd20e20f4f3****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The message sent by Message Service (MNS) to notify the user of the job result.</p>
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * <p>The error message.</p>
             * <ul>
             * <li>This parameter is returned only if <strong>Fail</strong> is returned for the State parameter.</li>
             * <li>This parameter is not returned if the method status is <strong>Success</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>The resource operated InputFile is bad</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The name of the method.</p>
             * <blockquote>
             * <p>The name of each method in a media workflow is unique.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Start</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The time when the method is called.</p>
             * 
             * <strong>example:</strong>
             * <p>2016-04-01T06:53:44Z</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The status of the workflow method. Valid values:</p>
             * <ul>
             * <li>Running: The method is being called.</li>
             * <li>Success: The method is called.</li>
             * <li>Fail: The method failed to be called.</li>
             * <li>Skipped: The method is skipped.</li>
             * </ul>
             * <blockquote>
             * <p>For example, after the analysis is complete, the transcode method is called and high-definition and standard-definition transcoding jobs are created. The system determines whether to run the jobs based on the analysis result. If the resolution of the input video is low, the high-definition transcoding job may be skipped.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The methods that are supported in the media workflow. Valid values: Start, Snapshot, Transcode, Analysis, and Report. For more information, see <a href="https://help.aliyun.com/document_detail/68494.html">Methods supported for media workflows</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>Start</p>
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
    /**
     * 
     * {@link QueryMediaWorkflowExecutionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaWorkflowExecutionListResponseBody</p>
     */
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
    /**
     * 
     * {@link QueryMediaWorkflowExecutionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaWorkflowExecutionListResponseBody</p>
     */
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
             * <p>The name of the OSS bucket in which the input file is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>example-bucket-****</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the OSS region in which the input file resides.</p>
             * 
             * <strong>example:</strong>
             * <p>mps-cn-shanghai</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the OSS object that is used as the input file.</p>
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
    /**
     * 
     * {@link QueryMediaWorkflowExecutionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaWorkflowExecutionListResponseBody</p>
     */
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
             * <p>The input file of the media workflow.</p>
             */
            public Builder inputFile(InputFile inputFile) {
                this.inputFile = inputFile;
                return this;
            }

            /**
             * <p>The user-defined data.</p>
             * 
             * <strong>example:</strong>
             * <p>example data ****</p>
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
    /**
     * 
     * {@link QueryMediaWorkflowExecutionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaWorkflowExecutionListResponseBody</p>
     */
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
             * <p>The methods that are called in the media workflow.</p>
             */
            public Builder activityList(ActivityList activityList) {
                this.activityList = activityList;
                return this;
            }

            /**
             * <p>The time when the media workflow was created.</p>
             * 
             * <strong>example:</strong>
             * <p>016-04-01T06:53:43Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The input data of the media workflow.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The ID of the media asset. A media file contains all the information about a media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>512046582a924698a41e0f8b0d2b****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The ID of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>93ab850b4f6f44eab54b6e91****81d4</p>
             */
            public Builder mediaWorkflowId(String mediaWorkflowId) {
                this.mediaWorkflowId = mediaWorkflowId;
                return this;
            }

            /**
             * <p>The name of the media workflow.</p>
             * 
             * <strong>example:</strong>
             * <p>example-mediaworkflow-****</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the execution instance.</p>
             * 
             * <strong>example:</strong>
             * <p>48e33690ac19445488c706924321****</p>
             */
            public Builder runId(String runId) {
                this.runId = runId;
                return this;
            }

            /**
             * <p>The status of the media workflow. Valid values:</p>
             * <ul>
             * <li>Running: The media workflow is running.</li>
             * <li>Completed: The media workflow is complete.</li>
             * </ul>
             * <blockquote>
             * <p>Completed only indicates that the media workflow is complete. View the status of each method in the workflow, such as the transcode and snapshot methods, to check whether the method is called.</p>
             * </blockquote>
             * <ul>
             * <li>Fail: The media workflow fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Completed</p>
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
    /**
     * 
     * {@link QueryMediaWorkflowExecutionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaWorkflowExecutionListResponseBody</p>
     */
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
    /**
     * 
     * {@link QueryMediaWorkflowExecutionListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMediaWorkflowExecutionListResponseBody</p>
     */
    public static class NonExistRunIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RunId")
        private java.util.List < String > runId;

        private NonExistRunIds(Builder builder) {
            this.runId = builder.runId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistRunIds create() {
            return builder().build();
        }

        /**
         * @return runId
         */
        public java.util.List < String > getRunId() {
            return this.runId;
        }

        public static final class Builder {
            private java.util.List < String > runId; 

            /**
             * <p>The ID of the execution instance.</p>
             * 
             * <strong>example:</strong>
             * <p>48e33690ac19445488c706924321****</p>
             */
            public Builder runId(java.util.List < String > runId) {
                this.runId = runId;
                return this;
            }

            public NonExistRunIds build() {
                return new NonExistRunIds(this);
            } 

        } 

    }
}
