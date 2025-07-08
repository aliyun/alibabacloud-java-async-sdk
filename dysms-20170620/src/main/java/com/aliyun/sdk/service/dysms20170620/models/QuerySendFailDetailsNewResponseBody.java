// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QuerySendFailDetailsNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySendFailDetailsNewResponseBody</p>
 */
public class QuerySendFailDetailsNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApplyDateStr")
    private String applyDateStr;

    @com.aliyun.core.annotation.NameInMap("BillCount")
    private Long billCount;

    @com.aliyun.core.annotation.NameInMap("BizType")
    private Long bizType;

    @com.aliyun.core.annotation.NameInMap("InnerErrCode")
    private String innerErrCode;

    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SmsLength")
    private Long smsLength;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QuerySendFailDetailsNewResponseBody(Builder builder) {
        this.applyDateStr = builder.applyDateStr;
        this.billCount = builder.billCount;
        this.bizType = builder.bizType;
        this.innerErrCode = builder.innerErrCode;
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.smsLength = builder.smsLength;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySendFailDetailsNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyDateStr
     */
    public String getApplyDateStr() {
        return this.applyDateStr;
    }

    /**
     * @return billCount
     */
    public Long getBillCount() {
        return this.billCount;
    }

    /**
     * @return bizType
     */
    public Long getBizType() {
        return this.bizType;
    }

    /**
     * @return innerErrCode
     */
    public String getInnerErrCode() {
        return this.innerErrCode;
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
    }

    /**
     * @return pageNo
     */
    public Integer getPageNo() {
        return this.pageNo;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return smsLength
     */
    public Long getSmsLength() {
        return this.smsLength;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String applyDateStr; 
        private Long billCount; 
        private Long bizType; 
        private String innerErrCode; 
        private List list; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long smsLength; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QuerySendFailDetailsNewResponseBody model) {
            this.applyDateStr = model.applyDateStr;
            this.billCount = model.billCount;
            this.bizType = model.bizType;
            this.innerErrCode = model.innerErrCode;
            this.list = model.list;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.smsLength = model.smsLength;
            this.total = model.total;
        } 

        /**
         * ApplyDateStr.
         */
        public Builder applyDateStr(String applyDateStr) {
            this.applyDateStr = applyDateStr;
            return this;
        }

        /**
         * BillCount.
         */
        public Builder billCount(Long billCount) {
            this.billCount = billCount;
            return this;
        }

        /**
         * BizType.
         */
        public Builder bizType(Long bizType) {
            this.bizType = bizType;
            return this;
        }

        /**
         * InnerErrCode.
         */
        public Builder innerErrCode(String innerErrCode) {
            this.innerErrCode = innerErrCode;
            return this;
        }

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * PageNo.
         */
        public Builder pageNo(Integer pageNo) {
            this.pageNo = pageNo;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * SmsLength.
         */
        public Builder smsLength(Long smsLength) {
            this.smsLength = smsLength;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QuerySendFailDetailsNewResponseBody build() {
            return new QuerySendFailDetailsNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySendFailDetailsNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySendFailDetailsNewResponseBody</p>
     */
    public static class SmsSendDetailResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BlackListStatus")
        private Integer blackListStatus;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ErrCode")
        private String errCode;

        @com.aliyun.core.annotation.NameInMap("ErrCodeDesc")
        private String errCodeDesc;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("PhoneNum")
        private String phoneNum;

        @com.aliyun.core.annotation.NameInMap("ReceiveDateStr")
        private String receiveDateStr;

        @com.aliyun.core.annotation.NameInMap("SendDateStr")
        private String sendDateStr;

        @com.aliyun.core.annotation.NameInMap("SendStatus")
        private Long sendStatus;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        private SmsSendDetailResponse(Builder builder) {
            this.blackListStatus = builder.blackListStatus;
            this.content = builder.content;
            this.errCode = builder.errCode;
            this.errCodeDesc = builder.errCodeDesc;
            this.outId = builder.outId;
            this.phoneNum = builder.phoneNum;
            this.receiveDateStr = builder.receiveDateStr;
            this.sendDateStr = builder.sendDateStr;
            this.sendStatus = builder.sendStatus;
            this.suggestion = builder.suggestion;
            this.templateCode = builder.templateCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsSendDetailResponse create() {
            return builder().build();
        }

        /**
         * @return blackListStatus
         */
        public Integer getBlackListStatus() {
            return this.blackListStatus;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return errCode
         */
        public String getErrCode() {
            return this.errCode;
        }

        /**
         * @return errCodeDesc
         */
        public String getErrCodeDesc() {
            return this.errCodeDesc;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return phoneNum
         */
        public String getPhoneNum() {
            return this.phoneNum;
        }

        /**
         * @return receiveDateStr
         */
        public String getReceiveDateStr() {
            return this.receiveDateStr;
        }

        /**
         * @return sendDateStr
         */
        public String getSendDateStr() {
            return this.sendDateStr;
        }

        /**
         * @return sendStatus
         */
        public Long getSendStatus() {
            return this.sendStatus;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        public static final class Builder {
            private Integer blackListStatus; 
            private String content; 
            private String errCode; 
            private String errCodeDesc; 
            private String outId; 
            private String phoneNum; 
            private String receiveDateStr; 
            private String sendDateStr; 
            private Long sendStatus; 
            private String suggestion; 
            private String templateCode; 

            private Builder() {
            } 

            private Builder(SmsSendDetailResponse model) {
                this.blackListStatus = model.blackListStatus;
                this.content = model.content;
                this.errCode = model.errCode;
                this.errCodeDesc = model.errCodeDesc;
                this.outId = model.outId;
                this.phoneNum = model.phoneNum;
                this.receiveDateStr = model.receiveDateStr;
                this.sendDateStr = model.sendDateStr;
                this.sendStatus = model.sendStatus;
                this.suggestion = model.suggestion;
                this.templateCode = model.templateCode;
            } 

            /**
             * BlackListStatus.
             */
            public Builder blackListStatus(Integer blackListStatus) {
                this.blackListStatus = blackListStatus;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ErrCode.
             */
            public Builder errCode(String errCode) {
                this.errCode = errCode;
                return this;
            }

            /**
             * ErrCodeDesc.
             */
            public Builder errCodeDesc(String errCodeDesc) {
                this.errCodeDesc = errCodeDesc;
                return this;
            }

            /**
             * OutId.
             */
            public Builder outId(String outId) {
                this.outId = outId;
                return this;
            }

            /**
             * PhoneNum.
             */
            public Builder phoneNum(String phoneNum) {
                this.phoneNum = phoneNum;
                return this;
            }

            /**
             * ReceiveDateStr.
             */
            public Builder receiveDateStr(String receiveDateStr) {
                this.receiveDateStr = receiveDateStr;
                return this;
            }

            /**
             * SendDateStr.
             */
            public Builder sendDateStr(String sendDateStr) {
                this.sendDateStr = sendDateStr;
                return this;
            }

            /**
             * SendStatus.
             */
            public Builder sendStatus(Long sendStatus) {
                this.sendStatus = sendStatus;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            /**
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            public SmsSendDetailResponse build() {
                return new SmsSendDetailResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySendFailDetailsNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySendFailDetailsNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SmsSendDetailResponse")
        private java.util.List<SmsSendDetailResponse> smsSendDetailResponse;

        private List(Builder builder) {
            this.smsSendDetailResponse = builder.smsSendDetailResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return smsSendDetailResponse
         */
        public java.util.List<SmsSendDetailResponse> getSmsSendDetailResponse() {
            return this.smsSendDetailResponse;
        }

        public static final class Builder {
            private java.util.List<SmsSendDetailResponse> smsSendDetailResponse; 

            private Builder() {
            } 

            private Builder(List model) {
                this.smsSendDetailResponse = model.smsSendDetailResponse;
            } 

            /**
             * SmsSendDetailResponse.
             */
            public Builder smsSendDetailResponse(java.util.List<SmsSendDetailResponse> smsSendDetailResponse) {
                this.smsSendDetailResponse = smsSendDetailResponse;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
