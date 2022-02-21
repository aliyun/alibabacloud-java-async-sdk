// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySnapshotJobListResponseBody</p>
 */
public class QuerySnapshotJobListResponseBody extends TeaModel {
    @NameInMap("NextPageToken")
    private String nextPageToken;

    @NameInMap("NonExistSnapshotJobIds")
    private NonExistSnapshotJobIds nonExistSnapshotJobIds;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SnapshotJobList")
    private SnapshotJobList snapshotJobList;

    private QuerySnapshotJobListResponseBody(Builder builder) {
        this.nextPageToken = builder.nextPageToken;
        this.nonExistSnapshotJobIds = builder.nonExistSnapshotJobIds;
        this.requestId = builder.requestId;
        this.snapshotJobList = builder.snapshotJobList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySnapshotJobListResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return nonExistSnapshotJobIds
     */
    public NonExistSnapshotJobIds getNonExistSnapshotJobIds() {
        return this.nonExistSnapshotJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return snapshotJobList
     */
    public SnapshotJobList getSnapshotJobList() {
        return this.snapshotJobList;
    }

    public static final class Builder {
        private String nextPageToken; 
        private NonExistSnapshotJobIds nonExistSnapshotJobIds; 
        private String requestId; 
        private SnapshotJobList snapshotJobList; 

        /**
         * NextPageToken.
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * NonExistSnapshotJobIds.
         */
        public Builder nonExistSnapshotJobIds(NonExistSnapshotJobIds nonExistSnapshotJobIds) {
            this.nonExistSnapshotJobIds = nonExistSnapshotJobIds;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SnapshotJobList.
         */
        public Builder snapshotJobList(SnapshotJobList snapshotJobList) {
            this.snapshotJobList = snapshotJobList;
            return this;
        }

        public QuerySnapshotJobListResponseBody build() {
            return new QuerySnapshotJobListResponseBody(this);
        } 

    } 

    public static class NonExistSnapshotJobIds extends TeaModel {
        @NameInMap("String")
        private java.util.List < String > string;

        private NonExistSnapshotJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistSnapshotJobIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistSnapshotJobIds build() {
                return new NonExistSnapshotJobIds(this);
            } 

        } 

    }
    public static class Input extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        @NameInMap("RoleArn")
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
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * RoleArn.
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
        @NameInMap("ErrorCode")
        private String errorCode;

        @NameInMap("ErrorMessage")
        private String errorMessage;

        @NameInMap("MessageId")
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * MessageId.
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
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        @NameInMap("RoleArn")
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
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * RoleArn.
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
        @NameInMap("CellHeight")
        private String cellHeight;

        @NameInMap("CellSelStep")
        private String cellSelStep;

        @NameInMap("CellWidth")
        private String cellWidth;

        @NameInMap("Color")
        private String color;

        @NameInMap("Columns")
        private String columns;

        @NameInMap("IsKeepCellPic")
        private String isKeepCellPic;

        @NameInMap("Lines")
        private String lines;

        @NameInMap("Margin")
        private String margin;

        @NameInMap("Padding")
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
             * CellHeight.
             */
            public Builder cellHeight(String cellHeight) {
                this.cellHeight = cellHeight;
                return this;
            }

            /**
             * CellSelStep.
             */
            public Builder cellSelStep(String cellSelStep) {
                this.cellSelStep = cellSelStep;
                return this;
            }

            /**
             * CellWidth.
             */
            public Builder cellWidth(String cellWidth) {
                this.cellWidth = cellWidth;
                return this;
            }

            /**
             * Color.
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * Columns.
             */
            public Builder columns(String columns) {
                this.columns = columns;
                return this;
            }

            /**
             * IsKeepCellPic.
             */
            public Builder isKeepCellPic(String isKeepCellPic) {
                this.isKeepCellPic = isKeepCellPic;
                return this;
            }

            /**
             * Lines.
             */
            public Builder lines(String lines) {
                this.lines = lines;
                return this;
            }

            /**
             * Margin.
             */
            public Builder margin(String margin) {
                this.margin = margin;
                return this;
            }

            /**
             * Padding.
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
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Location")
        private String location;

        @NameInMap("Object")
        private String object;

        @NameInMap("RoleArn")
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
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * RoleArn.
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
    public static class SnapshotConfig extends TeaModel {
        @NameInMap("FrameType")
        private String frameType;

        @NameInMap("Height")
        private String height;

        @NameInMap("Interval")
        private String interval;

        @NameInMap("Num")
        private String num;

        @NameInMap("OutputFile")
        private OutputFile outputFile;

        @NameInMap("TileOut")
        private TileOut tileOut;

        @NameInMap("TileOutputFile")
        private TileOutputFile tileOutputFile;

        @NameInMap("Time")
        private String time;

        @NameInMap("Width")
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
            private String width; 

            /**
             * FrameType.
             */
            public Builder frameType(String frameType) {
                this.frameType = frameType;
                return this;
            }

            /**
             * Height.
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * Interval.
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * Num.
             */
            public Builder num(String num) {
                this.num = num;
                return this;
            }

            /**
             * OutputFile.
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * TileOut.
             */
            public Builder tileOut(TileOut tileOut) {
                this.tileOut = tileOut;
                return this;
            }

            /**
             * TileOutputFile.
             */
            public Builder tileOutputFile(TileOutputFile tileOutputFile) {
                this.tileOutputFile = tileOutputFile;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * Width.
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
        @NameInMap("Code")
        private String code;

        @NameInMap("Count")
        private String count;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Id")
        private String id;

        @NameInMap("Input")
        private Input input;

        @NameInMap("MNSMessageResult")
        private MNSMessageResult MNSMessageResult;

        @NameInMap("Message")
        private String message;

        @NameInMap("PipelineId")
        private String pipelineId;

        @NameInMap("SnapshotConfig")
        private SnapshotConfig snapshotConfig;

        @NameInMap("State")
        private String state;

        @NameInMap("TileCount")
        private String tileCount;

        @NameInMap("UserData")
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
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * CreationTime.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Input.
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * MNSMessageResult.
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * PipelineId.
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * SnapshotConfig.
             */
            public Builder snapshotConfig(SnapshotConfig snapshotConfig) {
                this.snapshotConfig = snapshotConfig;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * TileCount.
             */
            public Builder tileCount(String tileCount) {
                this.tileCount = tileCount;
                return this;
            }

            /**
             * UserData.
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
    public static class SnapshotJobList extends TeaModel {
        @NameInMap("SnapshotJob")
        private java.util.List < SnapshotJob> snapshotJob;

        private SnapshotJobList(Builder builder) {
            this.snapshotJob = builder.snapshotJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotJobList create() {
            return builder().build();
        }

        /**
         * @return snapshotJob
         */
        public java.util.List < SnapshotJob> getSnapshotJob() {
            return this.snapshotJob;
        }

        public static final class Builder {
            private java.util.List < SnapshotJob> snapshotJob; 

            /**
             * SnapshotJob.
             */
            public Builder snapshotJob(java.util.List < SnapshotJob> snapshotJob) {
                this.snapshotJob = snapshotJob;
                return this;
            }

            public SnapshotJobList build() {
                return new SnapshotJobList(this);
            } 

        } 

    }
}
