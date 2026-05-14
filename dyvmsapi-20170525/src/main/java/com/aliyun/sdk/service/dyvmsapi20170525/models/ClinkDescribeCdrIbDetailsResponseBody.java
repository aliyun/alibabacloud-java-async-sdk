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
 * {@link ClinkDescribeCdrIbDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkDescribeCdrIbDetailsResponseBody</p>
 */
public class ClinkDescribeCdrIbDetailsResponseBody extends TeaModel {
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

    private ClinkDescribeCdrIbDetailsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkDescribeCdrIbDetailsResponseBody create() {
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

        private Builder(ClinkDescribeCdrIbDetailsResponseBody model) {
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

        public ClinkDescribeCdrIbDetailsResponseBody build() {
            return new ClinkDescribeCdrIbDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkDescribeCdrIbDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkDescribeCdrIbDetailsResponseBody</p>
     */
    public static class CdrIbDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AnswerTime")
        private Long answerTime;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientNumber")
        private String clientNumber;

        @com.aliyun.core.annotation.NameInMap("ClientRingingTime")
        private Long clientRingingTime;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("MainUniqueId")
        private String mainUniqueId;

        @com.aliyun.core.annotation.NameInMap("Qno")
        private String qno;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private String recordFile;

        @com.aliyun.core.annotation.NameInMap("Remember")
        private String remember;

        @com.aliyun.core.annotation.NameInMap("SipCause")
        private String sipCause;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Long totalDuration;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        private CdrIbDetails(Builder builder) {
            this.answerTime = builder.answerTime;
            this.callType = builder.callType;
            this.clientName = builder.clientName;
            this.clientNumber = builder.clientNumber;
            this.clientRingingTime = builder.clientRingingTime;
            this.cno = builder.cno;
            this.endTime = builder.endTime;
            this.mainUniqueId = builder.mainUniqueId;
            this.qno = builder.qno;
            this.recordFile = builder.recordFile;
            this.remember = builder.remember;
            this.sipCause = builder.sipCause;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalDuration = builder.totalDuration;
            this.uniqueId = builder.uniqueId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdrIbDetails create() {
            return builder().build();
        }

        /**
         * @return answerTime
         */
        public Long getAnswerTime() {
            return this.answerTime;
        }

        /**
         * @return callType
         */
        public String getCallType() {
            return this.callType;
        }

        /**
         * @return clientName
         */
        public String getClientName() {
            return this.clientName;
        }

        /**
         * @return clientNumber
         */
        public String getClientNumber() {
            return this.clientNumber;
        }

        /**
         * @return clientRingingTime
         */
        public Long getClientRingingTime() {
            return this.clientRingingTime;
        }

        /**
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return mainUniqueId
         */
        public String getMainUniqueId() {
            return this.mainUniqueId;
        }

        /**
         * @return qno
         */
        public String getQno() {
            return this.qno;
        }

        /**
         * @return recordFile
         */
        public String getRecordFile() {
            return this.recordFile;
        }

        /**
         * @return remember
         */
        public String getRemember() {
            return this.remember;
        }

        /**
         * @return sipCause
         */
        public String getSipCause() {
            return this.sipCause;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalDuration
         */
        public Long getTotalDuration() {
            return this.totalDuration;
        }

        /**
         * @return uniqueId
         */
        public String getUniqueId() {
            return this.uniqueId;
        }

        public static final class Builder {
            private Long answerTime; 
            private String callType; 
            private String clientName; 
            private String clientNumber; 
            private Long clientRingingTime; 
            private String cno; 
            private Long endTime; 
            private String mainUniqueId; 
            private String qno; 
            private String recordFile; 
            private String remember; 
            private String sipCause; 
            private Long startTime; 
            private String status; 
            private Long totalDuration; 
            private String uniqueId; 

            private Builder() {
            } 

            private Builder(CdrIbDetails model) {
                this.answerTime = model.answerTime;
                this.callType = model.callType;
                this.clientName = model.clientName;
                this.clientNumber = model.clientNumber;
                this.clientRingingTime = model.clientRingingTime;
                this.cno = model.cno;
                this.endTime = model.endTime;
                this.mainUniqueId = model.mainUniqueId;
                this.qno = model.qno;
                this.recordFile = model.recordFile;
                this.remember = model.remember;
                this.sipCause = model.sipCause;
                this.startTime = model.startTime;
                this.status = model.status;
                this.totalDuration = model.totalDuration;
                this.uniqueId = model.uniqueId;
            } 

            /**
             * <p>接听时间</p>
             * 
             * <strong>example:</strong>
             * <p>1536115382</p>
             */
            public Builder answerTime(Long answerTime) {
                this.answerTime = answerTime;
                return this;
            }

            /**
             * <p>呼叫类型</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder callType(String callType) {
                this.callType = callType;
                return this;
            }

            /**
             * <p>座席名称</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder clientName(String clientName) {
                this.clientName = clientName;
                return this;
            }

            /**
             * <p>座席电话</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder clientNumber(String clientNumber) {
                this.clientNumber = clientNumber;
                return this;
            }

            /**
             * <p>座席响铃时间</p>
             * 
             * <strong>example:</strong>
             * <p>1536115379</p>
             */
            public Builder clientRingingTime(Long clientRingingTime) {
                this.clientRingingTime = clientRingingTime;
                return this;
            }

            /**
             * <p>座席号</p>
             * 
             * <strong>example:</strong>
             * <p>2005</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1536115391</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>通话记录主通道唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>AWS_DEV_MEDIA_SERVER_8-1536115322.0</p>
             */
            public Builder mainUniqueId(String mainUniqueId) {
                this.mainUniqueId = mainUniqueId;
                return this;
            }

            /**
             * <p>队列号</p>
             * 
             * <strong>example:</strong>
             * <p>2233</p>
             */
            public Builder qno(String qno) {
                this.qno = qno;
                return this;
            }

            /**
             * <p>录音文件</p>
             * 
             * <strong>example:</strong>
             * <p>8888888-20220406155839-15108207489-6666--record-medias_6-777788888.666</p>
             */
            public Builder recordFile(String recordFile) {
                this.recordFile = recordFile;
                return this;
            }

            /**
             * <p>是否开启主叫记忆</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder remember(String remember) {
                this.remember = remember;
                return this;
            }

            /**
             * <p>呼叫情况</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder sipCause(String sipCause) {
                this.sipCause = sipCause;
                return this;
            }

            /**
             * <p>接起时间</p>
             * 
             * <strong>example:</strong>
             * <p>1536115379</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>呼叫结果</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>通话时长</p>
             * 
             * <strong>example:</strong>
             * <p>47</p>
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * <p>通话记录详情唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>AWS_DEV_MEDIA_SERVER_8-1536115379.4</p>
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            public CdrIbDetails build() {
                return new CdrIbDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkDescribeCdrIbDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkDescribeCdrIbDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdrIbDetails")
        private java.util.List<CdrIbDetails> cdrIbDetails;

        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        private Data(Builder builder) {
            this.cdrIbDetails = builder.cdrIbDetails;
            this.clinkRequestId = builder.clinkRequestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cdrIbDetails
         */
        public java.util.List<CdrIbDetails> getCdrIbDetails() {
            return this.cdrIbDetails;
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public static final class Builder {
            private java.util.List<CdrIbDetails> cdrIbDetails; 
            private String clinkRequestId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cdrIbDetails = model.cdrIbDetails;
                this.clinkRequestId = model.clinkRequestId;
            } 

            /**
             * <p>[呼入通话记录明细] #呼入通话记录明细</p>
             */
            public Builder cdrIbDetails(java.util.List<CdrIbDetails> cdrIbDetails) {
                this.cdrIbDetails = cdrIbDetails;
                return this;
            }

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder clinkRequestId(String clinkRequestId) {
                this.clinkRequestId = clinkRequestId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
