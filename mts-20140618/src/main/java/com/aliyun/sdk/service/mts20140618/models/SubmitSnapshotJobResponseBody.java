// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSnapshotJobResponseBody} extends {@link TeaModel}
 *
 * <p>SubmitSnapshotJobResponseBody</p>
 */
public class SubmitSnapshotJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotJob")
    private SnapshotJob snapshotJob;

    private SubmitSnapshotJobResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.snapshotJob = builder.snapshotJob;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSnapshotJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotJob
     */
    public SnapshotJob getSnapshotJob() {
        return this.snapshotJob;
    }

    public static final class Builder {
        private String requestId; 
        private SnapshotJob snapshotJob; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the snapshot job.
         */
        public Builder snapshotJob(SnapshotJob snapshotJob) {
            this.snapshotJob = snapshotJob;
            return this;
        }

        public SubmitSnapshotJobResponseBody build() {
            return new SubmitSnapshotJobResponseBody(this);
        } 

    } 

    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        private Input(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
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

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 
            private String roleArn; 

            /**
             * The OSS bucket that stores the object.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The region in which the OSS bucket resides.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The OSS object that is used as the input file.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * The ARN of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

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
             * The error code returned if the job fails. This parameter is not returned if the job is successful.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * The error message returned if the job fails. This parameter is not returned if the job is successful.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * The ID of the message. This parameter is not returned if the job fails.
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
    public static class OutputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        private OutputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputFile create() {
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

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 
            private String roleArn; 

            /**
             * The OSS bucket that stores the output snapshot.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The OSS region in which the OSS bucket for storing the output snapshot resides.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The OSS object that is generated as the output file of the snapshot job.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * The Alibaba Cloud Resource Name (ARN) of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public OutputFile build() {
                return new OutputFile(this);
            } 

        } 

    }
    public static class TileOut extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CellHeight")
        private String cellHeight;

        @com.aliyun.core.annotation.NameInMap("CellSelStep")
        private String cellSelStep;

        @com.aliyun.core.annotation.NameInMap("CellWidth")
        private String cellWidth;

        @com.aliyun.core.annotation.NameInMap("Color")
        private String color;

        @com.aliyun.core.annotation.NameInMap("Columns")
        private String columns;

        @com.aliyun.core.annotation.NameInMap("IsKeepCellPic")
        private String isKeepCellPic;

        @com.aliyun.core.annotation.NameInMap("Lines")
        private String lines;

        @com.aliyun.core.annotation.NameInMap("Margin")
        private String margin;

        @com.aliyun.core.annotation.NameInMap("Padding")
        private String padding;

        private TileOut(Builder builder) {
            this.cellHeight = builder.cellHeight;
            this.cellSelStep = builder.cellSelStep;
            this.cellWidth = builder.cellWidth;
            this.color = builder.color;
            this.columns = builder.columns;
            this.isKeepCellPic = builder.isKeepCellPic;
            this.lines = builder.lines;
            this.margin = builder.margin;
            this.padding = builder.padding;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TileOut create() {
            return builder().build();
        }

        /**
         * @return cellHeight
         */
        public String getCellHeight() {
            return this.cellHeight;
        }

        /**
         * @return cellSelStep
         */
        public String getCellSelStep() {
            return this.cellSelStep;
        }

        /**
         * @return cellWidth
         */
        public String getCellWidth() {
            return this.cellWidth;
        }

        /**
         * @return color
         */
        public String getColor() {
            return this.color;
        }

        /**
         * @return columns
         */
        public String getColumns() {
            return this.columns;
        }

        /**
         * @return isKeepCellPic
         */
        public String getIsKeepCellPic() {
            return this.isKeepCellPic;
        }

        /**
         * @return lines
         */
        public String getLines() {
            return this.lines;
        }

        /**
         * @return margin
         */
        public String getMargin() {
            return this.margin;
        }

        /**
         * @return padding
         */
        public String getPadding() {
            return this.padding;
        }

        public static final class Builder {
            private String cellHeight; 
            private String cellSelStep; 
            private String cellWidth; 
            private String color; 
            private String columns; 
            private String isKeepCellPic; 
            private String lines; 
            private String margin; 
            private String padding; 

            /**
             * The height of a single image. The default value is the height of the output snapshot.
             */
            public Builder cellHeight(String cellHeight) {
                this.cellHeight = cellHeight;
                return this;
            }

            /**
             * The step for selecting a single image.
             */
            public Builder cellSelStep(String cellSelStep) {
                this.cellSelStep = cellSelStep;
                return this;
            }

            /**
             * The width of a single image. The default value is the width of the output snapshot.
             */
            public Builder cellWidth(String cellWidth) {
                this.cellWidth = cellWidth;
                return this;
            }

            /**
             * The background color.
             * <p>
             * 
             * *   Default value: **black**.
             * *   You can set the Color parameter to a **color keyword** or **random** in the request.
             * 
             * > If you want to set the background color to black, you can specify the color keyword in one of the following three formats: Black, black, and #000000.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * The number of columns that the tiled image contains. Default value: **10**.
             */
            public Builder columns(String columns) {
                this.columns = columns;
                return this;
            }

            /**
             * Indicates whether the single images are retained. Valid values:
             * <p>
             * 
             * *   **true**: The single images are retained.
             * *   **false**: The single images are not retained.
             * *   Default value: **true**.
             */
            public Builder isKeepCellPic(String isKeepCellPic) {
                this.isKeepCellPic = isKeepCellPic;
                return this;
            }

            /**
             * The number of rows that the tiled image contains. Default value: **10**.
             */
            public Builder lines(String lines) {
                this.lines = lines;
                return this;
            }

            /**
             * The margin width of the tiled image.
             * <p>
             * 
             * *   Default value: **0**.
             * *   Unit: pixel.
             */
            public Builder margin(String margin) {
                this.margin = margin;
                return this;
            }

            /**
             * The distance between two consecutive single images in the tiled image.
             * <p>
             * 
             * *   Default value: **0**.
             * *   Unit: pixel.
             */
            public Builder padding(String padding) {
                this.padding = padding;
                return this;
            }

            public TileOut build() {
                return new TileOut(this);
            } 

        } 

    }
    public static class TileOutputFile extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("RoleArn")
        private String roleArn;

        private TileOutputFile(Builder builder) {
            this.bucket = builder.bucket;
            this.location = builder.location;
            this.object = builder.object;
            this.roleArn = builder.roleArn;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TileOutputFile create() {
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

        /**
         * @return roleArn
         */
        public String getRoleArn() {
            return this.roleArn;
        }

        public static final class Builder {
            private String bucket; 
            private String location; 
            private String object; 
            private String roleArn; 

            /**
             * The OSS bucket that stores the object.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * The ID of the region in which the OSS bucket that stores the object is located.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * The OSS object that is generated as the output file of the tiling job.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * The ARN of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.
             */
            public Builder roleArn(String roleArn) {
                this.roleArn = roleArn;
                return this;
            }

            public TileOutputFile build() {
                return new TileOutputFile(this);
            } 

        } 

    }
    public static class TimeArray extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimePointList")
        private java.util.List < Long > timePointList;

        private TimeArray(Builder builder) {
            this.timePointList = builder.timePointList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TimeArray create() {
            return builder().build();
        }

        /**
         * @return timePointList
         */
        public java.util.List < Long > getTimePointList() {
            return this.timePointList;
        }

        public static final class Builder {
            private java.util.List < Long > timePointList; 

            /**
             * TimePointList.
             */
            public Builder timePointList(java.util.List < Long > timePointList) {
                this.timePointList = timePointList;
                return this;
            }

            public TimeArray build() {
                return new TimeArray(this);
            } 

        } 

    }
    public static class SnapshotConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FrameType")
        private String frameType;

        @com.aliyun.core.annotation.NameInMap("Height")
        private String height;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private String interval;

        @com.aliyun.core.annotation.NameInMap("Num")
        private String num;

        @com.aliyun.core.annotation.NameInMap("OutputFile")
        private OutputFile outputFile;

        @com.aliyun.core.annotation.NameInMap("TileOut")
        private TileOut tileOut;

        @com.aliyun.core.annotation.NameInMap("TileOutputFile")
        private TileOutputFile tileOutputFile;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("TimeArray")
        private TimeArray timeArray;

        @com.aliyun.core.annotation.NameInMap("Width")
        private String width;

        private SnapshotConfig(Builder builder) {
            this.frameType = builder.frameType;
            this.height = builder.height;
            this.interval = builder.interval;
            this.num = builder.num;
            this.outputFile = builder.outputFile;
            this.tileOut = builder.tileOut;
            this.tileOutputFile = builder.tileOutputFile;
            this.time = builder.time;
            this.timeArray = builder.timeArray;
            this.width = builder.width;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotConfig create() {
            return builder().build();
        }

        /**
         * @return frameType
         */
        public String getFrameType() {
            return this.frameType;
        }

        /**
         * @return height
         */
        public String getHeight() {
            return this.height;
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        /**
         * @return num
         */
        public String getNum() {
            return this.num;
        }

        /**
         * @return outputFile
         */
        public OutputFile getOutputFile() {
            return this.outputFile;
        }

        /**
         * @return tileOut
         */
        public TileOut getTileOut() {
            return this.tileOut;
        }

        /**
         * @return tileOutputFile
         */
        public TileOutputFile getTileOutputFile() {
            return this.tileOutputFile;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return timeArray
         */
        public TimeArray getTimeArray() {
            return this.timeArray;
        }

        /**
         * @return width
         */
        public String getWidth() {
            return this.width;
        }

        public static final class Builder {
            private String frameType; 
            private String height; 
            private String interval; 
            private String num; 
            private OutputFile outputFile; 
            private TileOut tileOut; 
            private TileOutputFile tileOutputFile; 
            private String time; 
            private TimeArray timeArray; 
            private String width; 

            /**
             * The type of the snapshot. Default value: **Normal**. Valid values:
             * <p>
             * 
             * *   **normal**: normal frames.
             * *   **intra**: I-frames (keyframes).
             * 
             * > If the FrameType parameter is set to intra in the request, only keyframes are captured. If no keyframe is found at the specified point in time, the keyframe closest to the specified point in time is captured. Keyframes are captured faster than normal frames if the same snapshot rules are applied.
             */
            public Builder frameType(String frameType) {
                this.frameType = frameType;
                return this;
            }

            /**
             * The height of the output snapshot.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * The interval for capturing snapshots.
             * <p>
             * 
             * *   If this parameter is specified in the request, snapshots are captured at intervals. The value must be greater than 0 in the request.
             * *   Unit: seconds.
             * *   Default value: **10**.
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The number of snapshots. If the Num parameter is set in the request, snapshots are captured at intervals.
             */
            public Builder num(String num) {
                this.num = num;
                return this;
            }

            /**
             * The information about the output file of the snapshot job.
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * The tiling configurations.
             */
            public Builder tileOut(TileOut tileOut) {
                this.tileOut = tileOut;
                return this;
            }

            /**
             * The information about the output file of the tiling job.
             */
            public Builder tileOutputFile(TileOutputFile tileOutputFile) {
                this.tileOutputFile = tileOutputFile;
                return this;
            }

            /**
             * The start time for capturing snapshots. Unit: milliseconds.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * TimeArray.
             */
            public Builder timeArray(TimeArray timeArray) {
                this.timeArray = timeArray;
                return this;
            }

            /**
             * The width of the output snapshot.
             */
            public Builder width(String width) {
                this.width = width;
                return this;
            }

            public SnapshotConfig build() {
                return new SnapshotConfig(this);
            } 

        } 

    }
    public static class SnapshotJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("Count")
        private String count;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Input")
        private Input input;

        @com.aliyun.core.annotation.NameInMap("MNSMessageResult")
        private MNSMessageResult MNSMessageResult;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("PipelineId")
        private String pipelineId;

        @com.aliyun.core.annotation.NameInMap("SnapshotConfig")
        private SnapshotConfig snapshotConfig;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("TileCount")
        private String tileCount;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private SnapshotJob(Builder builder) {
            this.code = builder.code;
            this.count = builder.count;
            this.creationTime = builder.creationTime;
            this.id = builder.id;
            this.input = builder.input;
            this.MNSMessageResult = builder.MNSMessageResult;
            this.message = builder.message;
            this.pipelineId = builder.pipelineId;
            this.snapshotConfig = builder.snapshotConfig;
            this.state = builder.state;
            this.tileCount = builder.tileCount;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotJob create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return input
         */
        public Input getInput() {
            return this.input;
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
         * @return pipelineId
         */
        public String getPipelineId() {
            return this.pipelineId;
        }

        /**
         * @return snapshotConfig
         */
        public SnapshotConfig getSnapshotConfig() {
            return this.snapshotConfig;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return tileCount
         */
        public String getTileCount() {
            return this.tileCount;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String code; 
            private String count; 
            private String creationTime; 
            private String id; 
            private Input input; 
            private MNSMessageResult MNSMessageResult; 
            private String message; 
            private String pipelineId; 
            private SnapshotConfig snapshotConfig; 
            private String state; 
            private String tileCount; 
            private String userData; 

            /**
             * The error code returned if the job fails. This parameter is not returned if the job is successful.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The number of snapshots that are captured.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * The time when the job was created.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The ID of the snapshot job.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The information about the job input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * The message sent by MNS to notify the user of the job result.
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * The error message returned if the job fails. This parameter is not returned if the job is successful.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The ID of the MPS queue to which the snapshot job is submitted.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * The snapshot configurations.
             */
            public Builder snapshotConfig(SnapshotConfig snapshotConfig) {
                this.snapshotConfig = snapshotConfig;
                return this;
            }

            /**
             * The status of the snapshot job. Valid values:
             * <p>
             * 
             * *   **Submitted**: The job is submitted.
             * *   **Snapshoting**: The job is being processed.
             * *   **Success**: The job is successful.
             * *   **Fail**: The job fails.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * The number of single images that are contained in the tiled image.
             */
            public Builder tileCount(String tileCount) {
                this.tileCount = tileCount;
                return this;
            }

            /**
             * The custom data.
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public SnapshotJob build() {
                return new SnapshotJob(this);
            } 

        } 

    }
}
