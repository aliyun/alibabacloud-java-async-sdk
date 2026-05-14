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
 * {@link ClinkDescribeCdrObResponseBody} extends {@link TeaModel}
 *
 * <p>ClinkDescribeCdrObResponseBody</p>
 */
public class ClinkDescribeCdrObResponseBody extends TeaModel {
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

    private ClinkDescribeCdrObResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClinkDescribeCdrObResponseBody create() {
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

        private Builder(ClinkDescribeCdrObResponseBody model) {
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

        public ClinkDescribeCdrObResponseBody build() {
            return new ClinkDescribeCdrObResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ClinkDescribeCdrObResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkDescribeCdrObResponseBody</p>
     */
    public static class CdrOb extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BridgeDuration")
        private Long bridgeDuration;

        @com.aliyun.core.annotation.NameInMap("BridgeTime")
        private Long bridgeTime;

        @com.aliyun.core.annotation.NameInMap("CallId")
        private String callId;

        @com.aliyun.core.annotation.NameInMap("CallType")
        private String callType;

        @com.aliyun.core.annotation.NameInMap("ClientName")
        private String clientName;

        @com.aliyun.core.annotation.NameInMap("ClientNumber")
        private String clientNumber;

        @com.aliyun.core.annotation.NameInMap("Cno")
        private String cno;

        @com.aliyun.core.annotation.NameInMap("CustomerCity")
        private String customerCity;

        @com.aliyun.core.annotation.NameInMap("CustomerNumber")
        private String customerNumber;

        @com.aliyun.core.annotation.NameInMap("CustomerNumberEncrypt")
        private String customerNumberEncrypt;

        @com.aliyun.core.annotation.NameInMap("CustomerProvince")
        private String customerProvince;

        @com.aliyun.core.annotation.NameInMap("CustomerRingingTime")
        private Long customerRingingTime;

        @com.aliyun.core.annotation.NameInMap("EndReason")
        private String endReason;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Evaluation")
        private Long evaluation;

        @com.aliyun.core.annotation.NameInMap("Hotline")
        private String hotline;

        @com.aliyun.core.annotation.NameInMap("Investigation")
        private java.util.Map<String, ?> investigation;

        @com.aliyun.core.annotation.NameInMap("IvrName")
        private String ivrName;

        @com.aliyun.core.annotation.NameInMap("Mark")
        private Long mark;

        @com.aliyun.core.annotation.NameInMap("MarkData")
        private String markData;

        @com.aliyun.core.annotation.NameInMap("RecordFile")
        private String recordFile;

        @com.aliyun.core.annotation.NameInMap("SipCause")
        private String sipCause;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StatusCode")
        private String statusCode;

        @com.aliyun.core.annotation.NameInMap("TagNames")
        private java.util.List<String> tagNames;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<String> tags;

        @com.aliyun.core.annotation.NameInMap("TotalDuration")
        private Long totalDuration;

        @com.aliyun.core.annotation.NameInMap("UniqueId")
        private String uniqueId;

        @com.aliyun.core.annotation.NameInMap("Xnumber")
        private String xnumber;

        private CdrOb(Builder builder) {
            this.bridgeDuration = builder.bridgeDuration;
            this.bridgeTime = builder.bridgeTime;
            this.callId = builder.callId;
            this.callType = builder.callType;
            this.clientName = builder.clientName;
            this.clientNumber = builder.clientNumber;
            this.cno = builder.cno;
            this.customerCity = builder.customerCity;
            this.customerNumber = builder.customerNumber;
            this.customerNumberEncrypt = builder.customerNumberEncrypt;
            this.customerProvince = builder.customerProvince;
            this.customerRingingTime = builder.customerRingingTime;
            this.endReason = builder.endReason;
            this.endTime = builder.endTime;
            this.evaluation = builder.evaluation;
            this.hotline = builder.hotline;
            this.investigation = builder.investigation;
            this.ivrName = builder.ivrName;
            this.mark = builder.mark;
            this.markData = builder.markData;
            this.recordFile = builder.recordFile;
            this.sipCause = builder.sipCause;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.statusCode = builder.statusCode;
            this.tagNames = builder.tagNames;
            this.tags = builder.tags;
            this.totalDuration = builder.totalDuration;
            this.uniqueId = builder.uniqueId;
            this.xnumber = builder.xnumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdrOb create() {
            return builder().build();
        }

        /**
         * @return bridgeDuration
         */
        public Long getBridgeDuration() {
            return this.bridgeDuration;
        }

        /**
         * @return bridgeTime
         */
        public Long getBridgeTime() {
            return this.bridgeTime;
        }

        /**
         * @return callId
         */
        public String getCallId() {
            return this.callId;
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
         * @return cno
         */
        public String getCno() {
            return this.cno;
        }

        /**
         * @return customerCity
         */
        public String getCustomerCity() {
            return this.customerCity;
        }

        /**
         * @return customerNumber
         */
        public String getCustomerNumber() {
            return this.customerNumber;
        }

        /**
         * @return customerNumberEncrypt
         */
        public String getCustomerNumberEncrypt() {
            return this.customerNumberEncrypt;
        }

        /**
         * @return customerProvince
         */
        public String getCustomerProvince() {
            return this.customerProvince;
        }

        /**
         * @return customerRingingTime
         */
        public Long getCustomerRingingTime() {
            return this.customerRingingTime;
        }

        /**
         * @return endReason
         */
        public String getEndReason() {
            return this.endReason;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return evaluation
         */
        public Long getEvaluation() {
            return this.evaluation;
        }

        /**
         * @return hotline
         */
        public String getHotline() {
            return this.hotline;
        }

        /**
         * @return investigation
         */
        public java.util.Map<String, ?> getInvestigation() {
            return this.investigation;
        }

        /**
         * @return ivrName
         */
        public String getIvrName() {
            return this.ivrName;
        }

        /**
         * @return mark
         */
        public Long getMark() {
            return this.mark;
        }

        /**
         * @return markData
         */
        public String getMarkData() {
            return this.markData;
        }

        /**
         * @return recordFile
         */
        public String getRecordFile() {
            return this.recordFile;
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
         * @return statusCode
         */
        public String getStatusCode() {
            return this.statusCode;
        }

        /**
         * @return tagNames
         */
        public java.util.List<String> getTagNames() {
            return this.tagNames;
        }

        /**
         * @return tags
         */
        public java.util.List<String> getTags() {
            return this.tags;
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

        /**
         * @return xnumber
         */
        public String getXnumber() {
            return this.xnumber;
        }

        public static final class Builder {
            private Long bridgeDuration; 
            private Long bridgeTime; 
            private String callId; 
            private String callType; 
            private String clientName; 
            private String clientNumber; 
            private String cno; 
            private String customerCity; 
            private String customerNumber; 
            private String customerNumberEncrypt; 
            private String customerProvince; 
            private Long customerRingingTime; 
            private String endReason; 
            private Long endTime; 
            private Long evaluation; 
            private String hotline; 
            private java.util.Map<String, ?> investigation; 
            private String ivrName; 
            private Long mark; 
            private String markData; 
            private String recordFile; 
            private String sipCause; 
            private Long startTime; 
            private String status; 
            private String statusCode; 
            private java.util.List<String> tagNames; 
            private java.util.List<String> tags; 
            private Long totalDuration; 
            private String uniqueId; 
            private String xnumber; 

            private Builder() {
            } 

            private Builder(CdrOb model) {
                this.bridgeDuration = model.bridgeDuration;
                this.bridgeTime = model.bridgeTime;
                this.callId = model.callId;
                this.callType = model.callType;
                this.clientName = model.clientName;
                this.clientNumber = model.clientNumber;
                this.cno = model.cno;
                this.customerCity = model.customerCity;
                this.customerNumber = model.customerNumber;
                this.customerNumberEncrypt = model.customerNumberEncrypt;
                this.customerProvince = model.customerProvince;
                this.customerRingingTime = model.customerRingingTime;
                this.endReason = model.endReason;
                this.endTime = model.endTime;
                this.evaluation = model.evaluation;
                this.hotline = model.hotline;
                this.investigation = model.investigation;
                this.ivrName = model.ivrName;
                this.mark = model.mark;
                this.markData = model.markData;
                this.recordFile = model.recordFile;
                this.sipCause = model.sipCause;
                this.startTime = model.startTime;
                this.status = model.status;
                this.statusCode = model.statusCode;
                this.tagNames = model.tagNames;
                this.tags = model.tags;
                this.totalDuration = model.totalDuration;
                this.uniqueId = model.uniqueId;
                this.xnumber = model.xnumber;
            } 

            /**
             * <p>接通时长</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder bridgeDuration(Long bridgeDuration) {
                this.bridgeDuration = bridgeDuration;
                return this;
            }

            /**
             * <p>接通时间</p>
             * 
             * <strong>example:</strong>
             * <p>82</p>
             */
            public Builder bridgeTime(Long bridgeTime) {
                this.bridgeTime = bridgeTime;
                return this;
            }

            /**
             * <p>通话记录id</p>
             * 
             * <strong>example:</strong>
             * <p>ba078ace-717c-6666-af41-d4dd5035edd6</p>
             */
            public Builder callId(String callId) {
                this.callId = callId;
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
             * <p>示例值</p>
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
             * <p>座席号</p>
             * 
             * <strong>example:</strong>
             * <p>2555</p>
             */
            public Builder cno(String cno) {
                this.cno = cno;
                return this;
            }

            /**
             * <p>客户城市</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder customerCity(String customerCity) {
                this.customerCity = customerCity;
                return this;
            }

            /**
             * <p>客户号码，带区号</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder customerNumber(String customerNumber) {
                this.customerNumber = customerNumber;
                return this;
            }

            /**
             * <p>客户号码加密串</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder customerNumberEncrypt(String customerNumberEncrypt) {
                this.customerNumberEncrypt = customerNumberEncrypt;
                return this;
            }

            /**
             * <p>客户省份</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder customerProvince(String customerProvince) {
                this.customerProvince = customerProvince;
                return this;
            }

            /**
             * <p>客户响铃时间</p>
             * 
             * <strong>example:</strong>
             * <p>66</p>
             */
            public Builder customerRingingTime(Long customerRingingTime) {
                this.customerRingingTime = customerRingingTime;
                return this;
            }

            /**
             * <p>挂机方</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder endReason(String endReason) {
                this.endReason = endReason;
                return this;
            }

            /**
             * <p>结束时间</p>
             * 
             * <strong>example:</strong>
             * <p>1536892706</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>是否邀评 0: 否 1: 是</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder evaluation(Long evaluation) {
                this.evaluation = evaluation;
                return this;
            }

            /**
             * <p>热线号码</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder hotline(String hotline) {
                this.hotline = hotline;
                return this;
            }

            /**
             * <p>[满意度记录] #满意度记录</p>
             */
            public Builder investigation(java.util.Map<String, ?> investigation) {
                this.investigation = investigation;
                return this;
            }

            /**
             * <p>ivr名称</p>
             * 
             * <strong>example:</strong>
             * <p>name1</p>
             */
            public Builder ivrName(String ivrName) {
                this.ivrName = ivrName;
                return this;
            }

            /**
             * <p>标记</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder mark(Long mark) {
                this.mark = mark;
                return this;
            }

            /**
             * <p>备注</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值示例值</p>
             */
            public Builder markData(String markData) {
                this.markData = markData;
                return this;
            }

            /**
             * <p>录音文件名</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder recordFile(String recordFile) {
                this.recordFile = recordFile;
                return this;
            }

            /**
             * <p>呼叫结果</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder sipCause(String sipCause) {
                this.sipCause = sipCause;
                return this;
            }

            /**
             * <p>开始时间</p>
             * 
             * <strong>example:</strong>
             * <p>1536115324</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>接听状态</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>接听状态映射</p>
             * 
             * <strong>example:</strong>
             * <p>示例值示例值</p>
             */
            public Builder statusCode(String statusCode) {
                this.statusCode = statusCode;
                return this;
            }

            /**
             * <p>展示通话标签详情,当请求参数fields中包含tagNames时返回</p>
             */
            public Builder tagNames(java.util.List<String> tagNames) {
                this.tagNames = tagNames;
                return this;
            }

            /**
             * <p>标签</p>
             */
            public Builder tags(java.util.List<String> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>总时长</p>
             * 
             * <strong>example:</strong>
             * <p>64</p>
             */
            public Builder totalDuration(Long totalDuration) {
                this.totalDuration = totalDuration;
                return this;
            }

            /**
             * <p>通话记录唯一标识</p>
             * 
             * <strong>example:</strong>
             * <p>AWS_DEV_MEDIA_SERVER_8-1536892698.2</p>
             */
            public Builder uniqueId(String uniqueId) {
                this.uniqueId = uniqueId;
                return this;
            }

            /**
             * <p>虚拟号码</p>
             * 
             * <strong>example:</strong>
             * <p>xxx</p>
             */
            public Builder xnumber(String xnumber) {
                this.xnumber = xnumber;
                return this;
            }

            public CdrOb build() {
                return new CdrOb(this);
            } 

        } 

    }
    /**
     * 
     * {@link ClinkDescribeCdrObResponseBody} extends {@link TeaModel}
     *
     * <p>ClinkDescribeCdrObResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdrOb")
        private CdrOb cdrOb;

        @com.aliyun.core.annotation.NameInMap("ClinkRequestId")
        private String clinkRequestId;

        private Data(Builder builder) {
            this.cdrOb = builder.cdrOb;
            this.clinkRequestId = builder.clinkRequestId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return cdrOb
         */
        public CdrOb getCdrOb() {
            return this.cdrOb;
        }

        /**
         * @return clinkRequestId
         */
        public String getClinkRequestId() {
            return this.clinkRequestId;
        }

        public static final class Builder {
            private CdrOb cdrOb; 
            private String clinkRequestId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.cdrOb = model.cdrOb;
                this.clinkRequestId = model.clinkRequestId;
            } 

            /**
             * <p>[外呼通话记录] #外呼通话记录</p>
             */
            public Builder cdrOb(CdrOb cdrOb) {
                this.cdrOb = cdrOb;
                return this;
            }

            /**
             * <p>请求 id</p>
             * 
             * <strong>example:</strong>
             * <p>示例值</p>
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
