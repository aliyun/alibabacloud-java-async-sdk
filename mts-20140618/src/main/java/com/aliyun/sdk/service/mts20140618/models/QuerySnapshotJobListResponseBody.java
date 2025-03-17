// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
 * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySnapshotJobListResponseBody</p>
 */
public class QuerySnapshotJobListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("NonExistSnapshotJobIds")
    private NonExistSnapshotJobIds nonExistSnapshotJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SnapshotJobList")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(QuerySnapshotJobListResponseBody model) {
            this.nextPageToken = model.nextPageToken;
            this.nonExistSnapshotJobIds = model.nonExistSnapshotJobIds;
            this.requestId = model.requestId;
            this.snapshotJobList = model.snapshotJobList;
        } 

        /**
         * <p>The OSS object that is used as the input file.</p>
         * 
         * <strong>example:</strong>
         * <p>b11c171cced04565b1f38f1ecc39****</p>
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * <p>The OSS object that is generated as the output file of the tiling job.</p>
         */
        public Builder nonExistSnapshotJobIds(NonExistSnapshotJobIds nonExistSnapshotJobIds) {
            this.nonExistSnapshotJobIds = nonExistSnapshotJobIds;
            return this;
        }

        /**
         * <p>The ID of the snapshot job.</p>
         * 
         * <strong>example:</strong>
         * <p>34BCAB31-2833-43A7-9FBD-B34302AB23EQ</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The distance between images.</p>
         * <ul>
         * <li>Default value: <strong>0</strong>.</li>
         * <li>Unit: pixel.</li>
         * </ul>
         */
        public Builder snapshotJobList(SnapshotJobList snapshotJobList) {
            this.snapshotJobList = snapshotJobList;
            return this;
        }

        public QuerySnapshotJobListResponseBody build() {
            return new QuerySnapshotJobListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySnapshotJobListResponseBody</p>
     */
    public static class NonExistSnapshotJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

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
        public java.util.List<String> getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List<String> string; 

            private Builder() {
            } 

            private Builder(NonExistSnapshotJobIds model) {
                this.string = model.string;
            } 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistSnapshotJobIds build() {
                return new NonExistSnapshotJobIds(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySnapshotJobListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Input model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
                this.roleArn = model.roleArn;
            } 

            /**
             * <p>The ID of the snapshot job.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the MPS queue to which the snapshot job was submitted.</p>
             * 
             * <strong>example:</strong>
             * <p>example-location</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The error code returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
             * 
             * <strong>example:</strong>
             * <p>example.flv</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>The custom data.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1:role/testrole</p>
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
    /**
     * 
     * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySnapshotJobListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(MNSMessageResult model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.messageId = model.messageId;
            } 

            /**
             * <p>The number of snapshots that were taken.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The OSS bucket that stores the input file.</p>
             * 
             * <strong>example:</strong>
             * <p>The resource operated InputFile is bad</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The ID of the region in which the input OSS bucket is located.</p>
             * 
             * <strong>example:</strong>
             * <p>799454621135656C7F815F198A76****</p>
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
     * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySnapshotJobListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(OutputFile model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
                this.roleArn = model.roleArn;
            } 

            /**
             * <p>The OSS bucket that stores the output file.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The ID of the region in which the output OSS bucket is located.</p>
             * 
             * <strong>example:</strong>
             * <p>example-location</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The OSS object that is generated as the output file of the tiling job.</p>
             * 
             * <strong>example:</strong>
             * <p>example.png</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>The ARN of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1:role/testrole</p>
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
    /**
     * 
     * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySnapshotJobListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TileOut model) {
                this.cellHeight = model.cellHeight;
                this.cellSelStep = model.cellSelStep;
                this.cellWidth = model.cellWidth;
                this.color = model.color;
                this.columns = model.columns;
                this.isKeepCellPic = model.isKeepCellPic;
                this.lines = model.lines;
                this.margin = model.margin;
                this.padding = model.padding;
            } 

            /**
             * <p>The interval for taking snapshots.</p>
             * <ul>
             * <li>If this Interval parameter is specified in the request, snapshots are taken at intervals. The value must be greater than 0.</li>
             * <li>Unit: seconds.</li>
             * <li>Default value: <strong>10</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cellHeight(String cellHeight) {
                this.cellHeight = cellHeight;
                return this;
            }

            /**
             * <p>The number of rows that the tiled image can contain. Default value: <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder cellSelStep(String cellSelStep) {
                this.cellSelStep = cellSelStep;
                return this;
            }

            /**
             * <p>The type of the snapshot. Valid values:</p>
             * <ul>
             * <li><strong>normal</strong>: normal frames.</li>
             * <li><strong>intra</strong>: I-frames.</li>
             * <li>Default value: <strong>intra</strong>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder cellWidth(String cellWidth) {
                this.cellWidth = cellWidth;
                return this;
            }

            /**
             * <p>Indicates whether the single images are retained. Default value: <strong>true</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>black</p>
             */
            public Builder color(String color) {
                this.color = color;
                return this;
            }

            /**
             * <p>The height of the output snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder columns(String columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The Object Storage Service (OSS) output file of the snapshot job.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isKeepCellPic(String isKeepCellPic) {
                this.isKeepCellPic = isKeepCellPic;
                return this;
            }

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder lines(String lines) {
                this.lines = lines;
                return this;
            }

            /**
             * <p>The width of the output snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder margin(String margin) {
                this.margin = margin;
                return this;
            }

            /**
             * <p>The number of columns that the tiled image can contain. Default value: <strong>10</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
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
    /**
     * 
     * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySnapshotJobListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(TileOutputFile model) {
                this.bucket = model.bucket;
                this.location = model.location;
                this.object = model.object;
                this.roleArn = model.roleArn;
            } 

            /**
             * <p>The error code returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The error message returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
             * 
             * <strong>example:</strong>
             * <p>example-location</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The ID of the message. This parameter is not returned if the job fails.</p>
             * 
             * <strong>example:</strong>
             * <p>example.png</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>The message sent by MNS to notify the user of the job result.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:ram::1:role/testrole</p>
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
    /**
     * 
     * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySnapshotJobListResponseBody</p>
     */
    public static class TimeArray extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TimePointList")
        private java.util.List<Long> timePointList;

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
        public java.util.List<Long> getTimePointList() {
            return this.timePointList;
        }

        public static final class Builder {
            private java.util.List<Long> timePointList; 

            private Builder() {
            } 

            private Builder(TimeArray model) {
                this.timePointList = model.timePointList;
            } 

            /**
             * TimePointList.
             */
            public Builder timePointList(java.util.List<Long> timePointList) {
                this.timePointList = timePointList;
                return this;
            }

            public TimeArray build() {
                return new TimeArray(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySnapshotJobListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SnapshotConfig model) {
                this.frameType = model.frameType;
                this.height = model.height;
                this.interval = model.interval;
                this.num = model.num;
                this.outputFile = model.outputFile;
                this.tileOut = model.tileOut;
                this.tileOutputFile = model.tileOutputFile;
                this.time = model.time;
                this.timeArray = model.timeArray;
                this.width = model.width;
            } 

            /**
             * <p>The ID of the region in which the output OSS bucket is located.</p>
             * 
             * <strong>example:</strong>
             * <p>intra</p>
             */
            public Builder frameType(String frameType) {
                this.frameType = frameType;
                return this;
            }

            /**
             * <p>The number of snapshots to take. If the Num parameter is set in the request, snapshots are taken at intervals.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
             */
            public Builder height(String height) {
                this.height = height;
                return this;
            }

            /**
             * <p>The OSS object that is generated as the output file of the snapshot job.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The status of the snapshot job. </p>
             * <ul>
             * <li><strong>Submitted</strong>: The job was submitted.</li>
             * <li><strong>Snapshoting</strong>: The job is being processed.</li>
             * <li><strong>Success</strong>: The job was successfully processed.</li>
             * <li><strong>Fail</strong>: The job failed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder num(String num) {
                this.num = num;
                return this;
            }

            /**
             * <p>The OSS output file of the tiling job.</p>
             */
            public Builder outputFile(OutputFile outputFile) {
                this.outputFile = outputFile;
                return this;
            }

            /**
             * <p>The margin width of the tiled image.</p>
             * <ul>
             * <li>Default value: <strong>0</strong>.</li>
             * <li>Unit: pixel.</li>
             * </ul>
             */
            public Builder tileOut(TileOut tileOut) {
                this.tileOut = tileOut;
                return this;
            }

            /**
             * <p>The error message returned when the job fails. This parameter is not returned if the job is successfully processed.</p>
             */
            public Builder tileOutputFile(TileOutputFile tileOutputFile) {
                this.tileOutputFile = tileOutputFile;
                return this;
            }

            /**
             * <p>The width of a single image. The default value is the width of the output snapshot.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
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
             * <p>The OSS bucket that stores the output file.</p>
             * 
             * <strong>example:</strong>
             * <p>8</p>
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
    /**
     * 
     * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySnapshotJobListResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(SnapshotJob model) {
                this.code = model.code;
                this.count = model.count;
                this.creationTime = model.creationTime;
                this.id = model.id;
                this.input = model.input;
                this.MNSMessageResult = model.MNSMessageResult;
                this.message = model.message;
                this.pipelineId = model.pipelineId;
                this.snapshotConfig = model.snapshotConfig;
                this.state = model.state;
                this.tileCount = model.tileCount;
                this.userData = model.userData;
            } 

            /**
             * <p>You can call this operation to query up to 10 snapshot jobs at a time.</p>
             * <h2>Limits on QPS</h2>
             * <p>You can call this operation up to 100 times per second per account. If the number of calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation. For more information, see <a href="https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/qps-limit">QPS limit</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>InvalidParameter</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The stride of a single image.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-06-30T12:34:29Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The OSS output file of the tiling job.</p>
             * 
             * <strong>example:</strong>
             * <p>cc6cbef8e8d5481ca536f5d2a466****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The number of snapshots that are contained in the tiled image.</p>
             */
            public Builder input(Input input) {
                this.input = input;
                return this;
            }

            /**
             * <p>The OSS object that is used as the input file.</p>
             */
            public Builder MNSMessageResult(MNSMessageResult MNSMessageResult) {
                this.MNSMessageResult = MNSMessageResult;
                return this;
            }

            /**
             * <p>The ARN of the specified RAM role. Format: acs:ram::$accountID:role/$roleName.</p>
             * 
             * <strong>example:</strong>
             * <p>The resource operated InputFile is bad</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The start time for taking snapshots. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>b11c171cced04565b1f38f1ecc39****</p>
             */
            public Builder pipelineId(String pipelineId) {
                this.pipelineId = pipelineId;
                return this;
            }

            /**
             * <p>The height of a single image. The default value is the height of the output snapshot.</p>
             */
            public Builder snapshotConfig(SnapshotConfig snapshotConfig) {
                this.snapshotConfig = snapshotConfig;
                return this;
            }

            /**
             * <p>The information about the job input.</p>
             * 
             * <strong>example:</strong>
             * <p>Snapshoting</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The snapshot job IDs that do not exist. This parameter is not returned if all specified snapshot jobs are found.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder tileCount(String tileCount) {
                this.tileCount = tileCount;
                return this;
            }

            /**
             * <p>The token that is used to retrieve the next page of the query results. The value is a 32-bit UUID. If the returned query results cannot be displayed within one page, this parameter is returned. The value of this parameter is updated for each query.</p>
             * 
             * <strong>example:</strong>
             * <p>testid-001</p>
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
    /**
     * 
     * {@link QuerySnapshotJobListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySnapshotJobListResponseBody</p>
     */
    public static class SnapshotJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SnapshotJob")
        private java.util.List<SnapshotJob> snapshotJob;

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
        public java.util.List<SnapshotJob> getSnapshotJob() {
            return this.snapshotJob;
        }

        public static final class Builder {
            private java.util.List<SnapshotJob> snapshotJob; 

            private Builder() {
            } 

            private Builder(SnapshotJobList model) {
                this.snapshotJob = model.snapshotJob;
            } 

            /**
             * SnapshotJob.
             */
            public Builder snapshotJob(java.util.List<SnapshotJob> snapshotJob) {
                this.snapshotJob = snapshotJob;
                return this;
            }

            public SnapshotJobList build() {
                return new SnapshotJobList(this);
            } 

        } 

    }
}
