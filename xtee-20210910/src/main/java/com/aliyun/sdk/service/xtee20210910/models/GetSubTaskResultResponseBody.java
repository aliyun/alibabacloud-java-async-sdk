// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link GetSubTaskResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetSubTaskResultResponseBody</p>
 */
public class GetSubTaskResultResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    private GetSubTaskResultResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSubTaskResultResponseBody create() {
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
     * @return httpStatusCode
     */
    public String getHttpStatusCode() {
        return this.httpStatusCode;
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

    /**
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(GetSubTaskResultResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(String httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * ResultObject.
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public GetSubTaskResultResponseBody build() {
            return new GetSubTaskResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSubTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubTaskResultResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private String item;

        @com.aliyun.core.annotation.NameInMap("ItemDesc")
        private String itemDesc;

        @com.aliyun.core.annotation.NameInMap("SampleItem")
        private String sampleItem;

        @com.aliyun.core.annotation.NameInMap("SampleItems")
        private java.util.List<String> sampleItems;

        private Config(Builder builder) {
            this.item = builder.item;
            this.itemDesc = builder.itemDesc;
            this.sampleItem = builder.sampleItem;
            this.sampleItems = builder.sampleItems;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public String getItem() {
            return this.item;
        }

        /**
         * @return itemDesc
         */
        public String getItemDesc() {
            return this.itemDesc;
        }

        /**
         * @return sampleItem
         */
        public String getSampleItem() {
            return this.sampleItem;
        }

        /**
         * @return sampleItems
         */
        public java.util.List<String> getSampleItems() {
            return this.sampleItems;
        }

        public static final class Builder {
            private String item; 
            private String itemDesc; 
            private String sampleItem; 
            private java.util.List<String> sampleItems; 

            private Builder() {
            } 

            private Builder(Config model) {
                this.item = model.item;
                this.itemDesc = model.itemDesc;
                this.sampleItem = model.sampleItem;
                this.sampleItems = model.sampleItems;
            } 

            /**
             * Item.
             */
            public Builder item(String item) {
                this.item = item;
                return this;
            }

            /**
             * ItemDesc.
             */
            public Builder itemDesc(String itemDesc) {
                this.itemDesc = itemDesc;
                return this;
            }

            /**
             * SampleItem.
             */
            public Builder sampleItem(String sampleItem) {
                this.sampleItem = sampleItem;
                return this;
            }

            /**
             * SampleItems.
             */
            public Builder sampleItems(java.util.List<String> sampleItems) {
                this.sampleItems = sampleItems;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubTaskResultResponseBody</p>
     */
    public static class Col extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("A0")
        private String a0;

        @com.aliyun.core.annotation.NameInMap("A1")
        private String a1;

        @com.aliyun.core.annotation.NameInMap("A10")
        private String a10;

        @com.aliyun.core.annotation.NameInMap("A11")
        private String a11;

        @com.aliyun.core.annotation.NameInMap("A2")
        private String a2;

        @com.aliyun.core.annotation.NameInMap("A3")
        private String a3;

        @com.aliyun.core.annotation.NameInMap("A4")
        private String a4;

        @com.aliyun.core.annotation.NameInMap("A5")
        private String a5;

        @com.aliyun.core.annotation.NameInMap("A6")
        private String a6;

        @com.aliyun.core.annotation.NameInMap("A7")
        private String a7;

        @com.aliyun.core.annotation.NameInMap("A8")
        private String a8;

        @com.aliyun.core.annotation.NameInMap("A9")
        private String a9;

        private Col(Builder builder) {
            this.a0 = builder.a0;
            this.a1 = builder.a1;
            this.a10 = builder.a10;
            this.a11 = builder.a11;
            this.a2 = builder.a2;
            this.a3 = builder.a3;
            this.a4 = builder.a4;
            this.a5 = builder.a5;
            this.a6 = builder.a6;
            this.a7 = builder.a7;
            this.a8 = builder.a8;
            this.a9 = builder.a9;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Col create() {
            return builder().build();
        }

        /**
         * @return a0
         */
        public String getA0() {
            return this.a0;
        }

        /**
         * @return a1
         */
        public String getA1() {
            return this.a1;
        }

        /**
         * @return a10
         */
        public String getA10() {
            return this.a10;
        }

        /**
         * @return a11
         */
        public String getA11() {
            return this.a11;
        }

        /**
         * @return a2
         */
        public String getA2() {
            return this.a2;
        }

        /**
         * @return a3
         */
        public String getA3() {
            return this.a3;
        }

        /**
         * @return a4
         */
        public String getA4() {
            return this.a4;
        }

        /**
         * @return a5
         */
        public String getA5() {
            return this.a5;
        }

        /**
         * @return a6
         */
        public String getA6() {
            return this.a6;
        }

        /**
         * @return a7
         */
        public String getA7() {
            return this.a7;
        }

        /**
         * @return a8
         */
        public String getA8() {
            return this.a8;
        }

        /**
         * @return a9
         */
        public String getA9() {
            return this.a9;
        }

        public static final class Builder {
            private String a0; 
            private String a1; 
            private String a10; 
            private String a11; 
            private String a2; 
            private String a3; 
            private String a4; 
            private String a5; 
            private String a6; 
            private String a7; 
            private String a8; 
            private String a9; 

            private Builder() {
            } 

            private Builder(Col model) {
                this.a0 = model.a0;
                this.a1 = model.a1;
                this.a10 = model.a10;
                this.a11 = model.a11;
                this.a2 = model.a2;
                this.a3 = model.a3;
                this.a4 = model.a4;
                this.a5 = model.a5;
                this.a6 = model.a6;
                this.a7 = model.a7;
                this.a8 = model.a8;
                this.a9 = model.a9;
            } 

            /**
             * <p>A0。</p>
             * 
             * <strong>example:</strong>
             * <p>A0</p>
             */
            public Builder a0(String a0) {
                this.a0 = a0;
                return this;
            }

            /**
             * <p>A1。</p>
             * 
             * <strong>example:</strong>
             * <p>A1</p>
             */
            public Builder a1(String a1) {
                this.a1 = a1;
                return this;
            }

            /**
             * <p>A10。</p>
             * 
             * <strong>example:</strong>
             * <p>A10</p>
             */
            public Builder a10(String a10) {
                this.a10 = a10;
                return this;
            }

            /**
             * <p>A11。</p>
             * 
             * <strong>example:</strong>
             * <p>A11</p>
             */
            public Builder a11(String a11) {
                this.a11 = a11;
                return this;
            }

            /**
             * <p>A2。</p>
             * 
             * <strong>example:</strong>
             * <p>A2</p>
             */
            public Builder a2(String a2) {
                this.a2 = a2;
                return this;
            }

            /**
             * <p>A3。</p>
             * 
             * <strong>example:</strong>
             * <p>A3</p>
             */
            public Builder a3(String a3) {
                this.a3 = a3;
                return this;
            }

            /**
             * <p>A4。</p>
             * 
             * <strong>example:</strong>
             * <p>A4</p>
             */
            public Builder a4(String a4) {
                this.a4 = a4;
                return this;
            }

            /**
             * <p>A5。</p>
             * 
             * <strong>example:</strong>
             * <p>A5</p>
             */
            public Builder a5(String a5) {
                this.a5 = a5;
                return this;
            }

            /**
             * <p>A6。</p>
             * 
             * <strong>example:</strong>
             * <p>A6</p>
             */
            public Builder a6(String a6) {
                this.a6 = a6;
                return this;
            }

            /**
             * <p>A7。</p>
             * 
             * <strong>example:</strong>
             * <p>A7</p>
             */
            public Builder a7(String a7) {
                this.a7 = a7;
                return this;
            }

            /**
             * <p>A8。</p>
             * 
             * <strong>example:</strong>
             * <p>A8</p>
             */
            public Builder a8(String a8) {
                this.a8 = a8;
                return this;
            }

            /**
             * <p>A9。</p>
             * 
             * <strong>example:</strong>
             * <p>A9</p>
             */
            public Builder a9(String a9) {
                this.a9 = a9;
                return this;
            }

            public Col build() {
                return new Col(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubTaskResultResponseBody</p>
     */
    public static class File extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Col")
        private java.util.List<Col> col;

        @com.aliyun.core.annotation.NameInMap("Title")
        private java.util.List<String> title;

        private File(Builder builder) {
            this.col = builder.col;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static File create() {
            return builder().build();
        }

        /**
         * @return col
         */
        public java.util.List<Col> getCol() {
            return this.col;
        }

        /**
         * @return title
         */
        public java.util.List<String> getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List<Col> col; 
            private java.util.List<String> title; 

            private Builder() {
            } 

            private Builder(File model) {
                this.col = model.col;
                this.title = model.title;
            } 

            /**
             * Col.
             */
            public Builder col(java.util.List<Col> col) {
                this.col = col;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(java.util.List<String> title) {
                this.title = title;
                return this;
            }

            public File build() {
                return new File(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubTaskResultResponseBody</p>
     */
    public static class Log extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OperateType")
        private String operateType;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Time")
        private Long time;

        private Log(Builder builder) {
            this.operateType = builder.operateType;
            this.reason = builder.reason;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Log create() {
            return builder().build();
        }

        /**
         * @return operateType
         */
        public String getOperateType() {
            return this.operateType;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return time
         */
        public Long getTime() {
            return this.time;
        }

        public static final class Builder {
            private String operateType; 
            private String reason; 
            private Long time; 

            private Builder() {
            } 

            private Builder(Log model) {
                this.operateType = model.operateType;
                this.reason = model.reason;
                this.time = model.time;
            } 

            /**
             * OperateType.
             */
            public Builder operateType(String operateType) {
                this.operateType = operateType;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(Long time) {
                this.time = time;
                return this;
            }

            public Log build() {
                return new Log(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetSubTaskResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetSubTaskResultResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.List<Config> config;

        @com.aliyun.core.annotation.NameInMap("ExtraInfo")
        private String extraInfo;

        @com.aliyun.core.annotation.NameInMap("File")
        private File file;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("FileUrl")
        private String fileUrl;

        @com.aliyun.core.annotation.NameInMap("IsCharge")
        private Boolean isCharge;

        @com.aliyun.core.annotation.NameInMap("Log")
        private java.util.List<Log> log;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("ResultUrl")
        private String resultUrl;

        @com.aliyun.core.annotation.NameInMap("ScheduleType")
        private String scheduleType;

        @com.aliyun.core.annotation.NameInMap("ServiceCode")
        private String serviceCode;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private Long userId;

        private ResultObject(Builder builder) {
            this.config = builder.config;
            this.extraInfo = builder.extraInfo;
            this.file = builder.file;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.fileUrl = builder.fileUrl;
            this.isCharge = builder.isCharge;
            this.log = builder.log;
            this.reason = builder.reason;
            this.resultUrl = builder.resultUrl;
            this.scheduleType = builder.scheduleType;
            this.serviceCode = builder.serviceCode;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.List<Config> getConfig() {
            return this.config;
        }

        /**
         * @return extraInfo
         */
        public String getExtraInfo() {
            return this.extraInfo;
        }

        /**
         * @return file
         */
        public File getFile() {
            return this.file;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return fileUrl
         */
        public String getFileUrl() {
            return this.fileUrl;
        }

        /**
         * @return isCharge
         */
        public Boolean getIsCharge() {
            return this.isCharge;
        }

        /**
         * @return log
         */
        public java.util.List<Log> getLog() {
            return this.log;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return resultUrl
         */
        public String getResultUrl() {
            return this.resultUrl;
        }

        /**
         * @return scheduleType
         */
        public String getScheduleType() {
            return this.scheduleType;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
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
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<Config> config; 
            private String extraInfo; 
            private File file; 
            private String fileName; 
            private String fileType; 
            private String fileUrl; 
            private Boolean isCharge; 
            private java.util.List<Log> log; 
            private String reason; 
            private String resultUrl; 
            private String scheduleType; 
            private String serviceCode; 
            private String serviceName; 
            private String status; 
            private String taskId; 
            private String taskName; 
            private Long userId; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.config = model.config;
                this.extraInfo = model.extraInfo;
                this.file = model.file;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.fileUrl = model.fileUrl;
                this.isCharge = model.isCharge;
                this.log = model.log;
                this.reason = model.reason;
                this.resultUrl = model.resultUrl;
                this.scheduleType = model.scheduleType;
                this.serviceCode = model.serviceCode;
                this.serviceName = model.serviceName;
                this.status = model.status;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.userId = model.userId;
            } 

            /**
             * Config.
             */
            public Builder config(java.util.List<Config> config) {
                this.config = config;
                return this;
            }

            /**
             * ExtraInfo.
             */
            public Builder extraInfo(String extraInfo) {
                this.extraInfo = extraInfo;
                return this;
            }

            /**
             * File.
             */
            public Builder file(File file) {
                this.file = file;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * FileUrl.
             */
            public Builder fileUrl(String fileUrl) {
                this.fileUrl = fileUrl;
                return this;
            }

            /**
             * IsCharge.
             */
            public Builder isCharge(Boolean isCharge) {
                this.isCharge = isCharge;
                return this;
            }

            /**
             * Log.
             */
            public Builder log(java.util.List<Log> log) {
                this.log = log;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * ResultUrl.
             */
            public Builder resultUrl(String resultUrl) {
                this.resultUrl = resultUrl;
                return this;
            }

            /**
             * ScheduleType.
             */
            public Builder scheduleType(String scheduleType) {
                this.scheduleType = scheduleType;
                return this;
            }

            /**
             * ServiceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
