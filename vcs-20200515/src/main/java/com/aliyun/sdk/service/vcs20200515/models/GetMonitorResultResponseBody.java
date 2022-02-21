// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonitorResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetMonitorResultResponseBody</p>
 */
public class GetMonitorResultResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetMonitorResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonitorResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMonitorResultResponseBody build() {
            return new GetMonitorResultResponseBody(this);
        } 

    } 

    public static class ExtendInfo extends TeaModel {
        @NameInMap("PlateNo")
        private String plateNo;

        private ExtendInfo(Builder builder) {
            this.plateNo = builder.plateNo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendInfo create() {
            return builder().build();
        }

        /**
         * @return plateNo
         */
        public String getPlateNo() {
            return this.plateNo;
        }

        public static final class Builder {
            private String plateNo; 

            /**
             * PlateNo.
             */
            public Builder plateNo(String plateNo) {
                this.plateNo = plateNo;
                return this;
            }

            public ExtendInfo build() {
                return new ExtendInfo(this);
            } 

        } 

    }
    public static class Records extends TeaModel {
        @NameInMap("ExtendInfo")
        private ExtendInfo extendInfo;

        @NameInMap("GbId")
        private String gbId;

        @NameInMap("LeftUpX")
        private String leftUpX;

        @NameInMap("LeftUpY")
        private String leftUpY;

        @NameInMap("MonitorPicUrl")
        private String monitorPicUrl;

        @NameInMap("PicUrl")
        private String picUrl;

        @NameInMap("RightBottomX")
        private String rightBottomX;

        @NameInMap("RightBottomY")
        private String rightBottomY;

        @NameInMap("Score")
        private String score;

        @NameInMap("ShotTime")
        private String shotTime;

        @NameInMap("TargetPicUrl")
        private String targetPicUrl;

        @NameInMap("TaskId")
        private String taskId;

        private Records(Builder builder) {
            this.extendInfo = builder.extendInfo;
            this.gbId = builder.gbId;
            this.leftUpX = builder.leftUpX;
            this.leftUpY = builder.leftUpY;
            this.monitorPicUrl = builder.monitorPicUrl;
            this.picUrl = builder.picUrl;
            this.rightBottomX = builder.rightBottomX;
            this.rightBottomY = builder.rightBottomY;
            this.score = builder.score;
            this.shotTime = builder.shotTime;
            this.targetPicUrl = builder.targetPicUrl;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return extendInfo
         */
        public ExtendInfo getExtendInfo() {
            return this.extendInfo;
        }

        /**
         * @return gbId
         */
        public String getGbId() {
            return this.gbId;
        }

        /**
         * @return leftUpX
         */
        public String getLeftUpX() {
            return this.leftUpX;
        }

        /**
         * @return leftUpY
         */
        public String getLeftUpY() {
            return this.leftUpY;
        }

        /**
         * @return monitorPicUrl
         */
        public String getMonitorPicUrl() {
            return this.monitorPicUrl;
        }

        /**
         * @return picUrl
         */
        public String getPicUrl() {
            return this.picUrl;
        }

        /**
         * @return rightBottomX
         */
        public String getRightBottomX() {
            return this.rightBottomX;
        }

        /**
         * @return rightBottomY
         */
        public String getRightBottomY() {
            return this.rightBottomY;
        }

        /**
         * @return score
         */
        public String getScore() {
            return this.score;
        }

        /**
         * @return shotTime
         */
        public String getShotTime() {
            return this.shotTime;
        }

        /**
         * @return targetPicUrl
         */
        public String getTargetPicUrl() {
            return this.targetPicUrl;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private ExtendInfo extendInfo; 
            private String gbId; 
            private String leftUpX; 
            private String leftUpY; 
            private String monitorPicUrl; 
            private String picUrl; 
            private String rightBottomX; 
            private String rightBottomY; 
            private String score; 
            private String shotTime; 
            private String targetPicUrl; 
            private String taskId; 

            /**
             * ExtendInfo.
             */
            public Builder extendInfo(ExtendInfo extendInfo) {
                this.extendInfo = extendInfo;
                return this;
            }

            /**
             * GbId.
             */
            public Builder gbId(String gbId) {
                this.gbId = gbId;
                return this;
            }

            /**
             * LeftUpX.
             */
            public Builder leftUpX(String leftUpX) {
                this.leftUpX = leftUpX;
                return this;
            }

            /**
             * LeftUpY.
             */
            public Builder leftUpY(String leftUpY) {
                this.leftUpY = leftUpY;
                return this;
            }

            /**
             * MonitorPicUrl.
             */
            public Builder monitorPicUrl(String monitorPicUrl) {
                this.monitorPicUrl = monitorPicUrl;
                return this;
            }

            /**
             * PicUrl.
             */
            public Builder picUrl(String picUrl) {
                this.picUrl = picUrl;
                return this;
            }

            /**
             * RightBottomX.
             */
            public Builder rightBottomX(String rightBottomX) {
                this.rightBottomX = rightBottomX;
                return this;
            }

            /**
             * RightBottomY.
             */
            public Builder rightBottomY(String rightBottomY) {
                this.rightBottomY = rightBottomY;
                return this;
            }

            /**
             * Score.
             */
            public Builder score(String score) {
                this.score = score;
                return this;
            }

            /**
             * ShotTime.
             */
            public Builder shotTime(String shotTime) {
                this.shotTime = shotTime;
                return this;
            }

            /**
             * TargetPicUrl.
             */
            public Builder targetPicUrl(String targetPicUrl) {
                this.targetPicUrl = targetPicUrl;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("MaxId")
        private String maxId;

        @NameInMap("Records")
        private java.util.List < Records> records;

        private Data(Builder builder) {
            this.maxId = builder.maxId;
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return maxId
         */
        public String getMaxId() {
            return this.maxId;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private String maxId; 
            private java.util.List < Records> records; 

            /**
             * MaxId.
             */
            public Builder maxId(String maxId) {
                this.maxId = maxId;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
