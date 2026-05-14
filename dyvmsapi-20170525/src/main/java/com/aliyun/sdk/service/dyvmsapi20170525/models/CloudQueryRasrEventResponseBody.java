// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dyvmsapi20170525.models;

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
 * {@link CloudQueryRasrEventResponseBody} extends {@link TeaModel}
 *
 * <p>CloudQueryRasrEventResponseBody</p>
 */
public class CloudQueryRasrEventResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CloudQueryRasrEventResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloudQueryRasrEventResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(CloudQueryRasrEventResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

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

        public CloudQueryRasrEventResponseBody build() {
            return new CloudQueryRasrEventResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CloudQueryRasrEventResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryRasrEventResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BotText")
        private String botText;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CustomerNumber")
        private String customerNumber;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Engine")
        private String engine;

        @com.aliyun.core.annotation.NameInMap("EnterpriseId")
        private String enterpriseId;

        @com.aliyun.core.annotation.NameInMap("MainUniqueId")
        private String mainUniqueId;

        @com.aliyun.core.annotation.NameInMap("MixRecordFile")
        private String mixRecordFile;

        @com.aliyun.core.annotation.NameInMap("MonitorSide")
        private String monitorSide;

        @com.aliyun.core.annotation.NameInMap("OutRecordFile")
        private String outRecordFile;

        @com.aliyun.core.annotation.NameInMap("RasrDuration")
        private String rasrDuration;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private String recordFile;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        private List(Builder builder) {
            this.botText = builder.botText;
            this.cno = builder.cno;
            this.customerNumber = builder.customerNumber;
            this.endTime = builder.endTime;
            this.engine = builder.engine;
            this.enterpriseId = builder.enterpriseId;
            this.mainUniqueId = builder.mainUniqueId;
            this.mixRecordFile = builder.mixRecordFile;
            this.monitorSide = builder.monitorSide;
            this.outRecordFile = builder.outRecordFile;
            this.rasrDuration = builder.rasrDuration;
            this.recordFile = builder.recordFile;
            this.startTime = builder.startTime;
            this.text = builder.text;
            this.uniqueId = builder.uniqueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return botText
         */
        public String getBotText() {
            return this.botText;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return customerNumber
         */
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return engine
         */
        public String getEngine() {
            return this.engine;
        }

        /**
         * @return enterpriseId
         */
        public String getEnterpriseId() {
            return this.enterpriseId;
        }

        /**
         * @return mainUniqueId
         */
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        /**
         * @return mixRecordFile
         */
        public String getMixRecordFile() {
            return this.mixRecordFile;
        }

        /**
         * @return monitorSide
         */
        public String getMonitorSide() {
            return this.monitorSide;
        }

        /**
         * @return outRecordFile
         */
        public String getOutRecordFile() {
            return this.outRecordFile;
        }

        /**
         * @return rasrDuration
         */
        public String getRasrDuration() {
            return this.rasrDuration;
        }

        /**
         * @return recordFile
         */
        public String getRecordFile() {
            return this.recordFile;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        public static final class Builder {
            private String botText; 
            private String cno; 
            private String customerNumber; 
            private Long endTime; 
            private String engine; 
            private String enterpriseId; 
            private String mainUniqueId; 
            private String mixRecordFile; 
            private String monitorSide; 
            private String outRecordFile; 
            private String rasrDuration; 
            private String recordFile; 
            private Long startTime; 
            private String text; 
            private String uniqueId; 

            private Builder() {
            } 

            private Builder(List model) {
                this.botText = model.botText;
                this.cno = model.cno;
                this.customerNumber = model.customerNumber;
                this.endTime = model.endTime;
                this.engine = model.engine;
                this.enterpriseId = model.enterpriseId;
                this.mainUniqueId = model.mainUniqueId;
                this.mixRecordFile = model.mixRecordFile;
                this.monitorSide = model.monitorSide;
                this.outRecordFile = model.outRecordFile;
                this.rasrDuration = model.rasrDuration;
                this.recordFile = model.recordFile;
                this.startTime = model.startTime;
                this.text = model.text;
                this.uniqueId = model.uniqueId;
            } 

            /**
             * <p>机器人对话文本信息</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder botText(String botText) {
                this.botText = botText;
                return this;
            }

            /**
             * <p>坐席工号</p>
             * 
             * <strong>example:</strong>
             * <p>1111</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>客户号码</p>
             * 
             * <strong>example:</strong>
             * <p>177xxxx1313</p>
             */
            public Builder customerNumber(String customerNumber) {
                this.customerNumber = customerNumber;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1768615738</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>引擎</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;&quot;</p>
             */
            public Builder engine(String engine) {
                this.engine = engine;
                return this;
            }

            /**
             * <p>呼叫中心 id</p>
             * 
             * <strong>example:</strong>
             * <p>7000002</p>
             */
            public Builder enterpriseId(String enterpriseId) {
                this.enterpriseId = enterpriseId;
                return this;
            }

            /**
             * <p>通话唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>sip-2-1558615724.87</p>
             */
            public Builder mainUniqueId(String mainUniqueId) {
                this.mainUniqueId = mainUniqueId;
                return this;
            }

            /**
             * <p>混音录音文件名</p>
             * 
             * <strong>example:</strong>
             * <p>sip-2-1558615724.87-54529-mix</p>
             */
            public Builder mixRecordFile(String mixRecordFile) {
                this.mixRecordFile = mixRecordFile;
                return this;
            }

            /**
             * <p>1:座席侧（webcall是第二侧），2:客户侧（webcall是第一侧）</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder monitorSide(String monitorSide) {
                this.monitorSide = monitorSide;
                return this;
            }

            /**
             * <p>机器人侧录音文件名</p>
             * 
             * <strong>example:</strong>
             * <p>sip-2-1558615724.87-54529-out</p>
             */
            public Builder outRecordFile(String outRecordFile) {
                this.outRecordFile = outRecordFile;
                return this;
            }

            /**
             * <p>持续时间</p>
             * 
             * <strong>example:</strong>
             * <p>333</p>
             */
            public Builder rasrDuration(String rasrDuration) {
                this.rasrDuration = rasrDuration;
                return this;
            }

            /**
             * <p>客户侧录音文件名</p>
             * 
             * <strong>example:</strong>
             * <p>sip-2-1558615724.87-54529-in</p>
             */
            public Builder recordFile(String recordFile) {
                this.recordFile = recordFile;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>96</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>客户对话文本信息</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>通话唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>sip-2-1480660149.0</p>
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link CloudQueryRasrEventResponseBody} extends {@link TeaModel}
     *
     * <p>CloudQueryRasrEventResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        private Data(Builder builder) {
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List<List> list; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
            } 

            /**
             * <p>返回数据</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
