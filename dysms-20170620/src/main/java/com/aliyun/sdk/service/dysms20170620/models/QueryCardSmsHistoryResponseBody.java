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
 * {@link QueryCardSmsHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCardSmsHistoryResponseBody</p>
 */
public class QueryCardSmsHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCardSmsHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardSmsHistoryResponseBody create() {
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
     * @return model
     */
    public Model getModel() {
        return this.model;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Model model; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryCardSmsHistoryResponseBody model) {
            this.code = model.code;
            this.model = model.model;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(Model model) {
            this.model = model;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCardSmsHistoryResponseBody build() {
            return new QueryCardSmsHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCardSmsHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCardSmsHistoryResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AcceptDate")
        private Long acceptDate;

        @com.aliyun.core.annotation.NameInMap("ApiSend")
        private Long apiSend;

        @com.aliyun.core.annotation.NameInMap("CardTemplateType")
        private String cardTemplateType;

        @com.aliyun.core.annotation.NameInMap("CustomTmpCode")
        private String customTmpCode;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("FuuId")
        private String fuuId;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private Long gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("IsSupport")
        private Long isSupport;

        @com.aliyun.core.annotation.NameInMap("OutId")
        private String outId;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private Long pid;

        @com.aliyun.core.annotation.NameInMap("ReceiveState")
        private Long receiveState;

        @com.aliyun.core.annotation.NameInMap("Receiver")
        private String receiver;

        @com.aliyun.core.annotation.NameInMap("RenderDate")
        private Long renderDate;

        @com.aliyun.core.annotation.NameInMap("RenderState")
        private Long renderState;

        @com.aliyun.core.annotation.NameInMap("ShortUrl")
        private String shortUrl;

        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("SmsContent")
        private String smsContent;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        @com.aliyun.core.annotation.NameInMap("TmpCode")
        private String tmpCode;

        @com.aliyun.core.annotation.NameInMap("TmpId")
        private String tmpId;

        @com.aliyun.core.annotation.NameInMap("TmpType")
        private Long tmpType;

        @com.aliyun.core.annotation.NameInMap("TmpTypeName")
        private String tmpTypeName;

        private Records(Builder builder) {
            this.acceptDate = builder.acceptDate;
            this.apiSend = builder.apiSend;
            this.cardTemplateType = builder.cardTemplateType;
            this.customTmpCode = builder.customTmpCode;
            this.description = builder.description;
            this.fuuId = builder.fuuId;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.isSupport = builder.isSupport;
            this.outId = builder.outId;
            this.pid = builder.pid;
            this.receiveState = builder.receiveState;
            this.receiver = builder.receiver;
            this.renderDate = builder.renderDate;
            this.renderState = builder.renderState;
            this.shortUrl = builder.shortUrl;
            this.signName = builder.signName;
            this.smsContent = builder.smsContent;
            this.suggestion = builder.suggestion;
            this.tmpCode = builder.tmpCode;
            this.tmpId = builder.tmpId;
            this.tmpType = builder.tmpType;
            this.tmpTypeName = builder.tmpTypeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return acceptDate
         */
        public Long getAcceptDate() {
            return this.acceptDate;
        }

        /**
         * @return apiSend
         */
        public Long getApiSend() {
            return this.apiSend;
        }

        /**
         * @return cardTemplateType
         */
        public String getCardTemplateType() {
            return this.cardTemplateType;
        }

        /**
         * @return customTmpCode
         */
        public String getCustomTmpCode() {
            return this.customTmpCode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return fuuId
         */
        public String getFuuId() {
            return this.fuuId;
        }

        /**
         * @return gmtCreate
         */
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return isSupport
         */
        public Long getIsSupport() {
            return this.isSupport;
        }

        /**
         * @return outId
         */
        public String getOutId() {
            return this.outId;
        }

        /**
         * @return pid
         */
        public Long getPid() {
            return this.pid;
        }

        /**
         * @return receiveState
         */
        public Long getReceiveState() {
            return this.receiveState;
        }

        /**
         * @return receiver
         */
        public String getReceiver() {
            return this.receiver;
        }

        /**
         * @return renderDate
         */
        public Long getRenderDate() {
            return this.renderDate;
        }

        /**
         * @return renderState
         */
        public Long getRenderState() {
            return this.renderState;
        }

        /**
         * @return shortUrl
         */
        public String getShortUrl() {
            return this.shortUrl;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return smsContent
         */
        public String getSmsContent() {
            return this.smsContent;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        /**
         * @return tmpCode
         */
        public String getTmpCode() {
            return this.tmpCode;
        }

        /**
         * @return tmpId
         */
        public String getTmpId() {
            return this.tmpId;
        }

        /**
         * @return tmpType
         */
        public Long getTmpType() {
            return this.tmpType;
        }

        /**
         * @return tmpTypeName
         */
        public String getTmpTypeName() {
            return this.tmpTypeName;
        }

        public static final class Builder {
            private Long acceptDate; 
            private Long apiSend; 
            private String cardTemplateType; 
            private String customTmpCode; 
            private String description; 
            private String fuuId; 
            private Long gmtCreate; 
            private Long gmtModified; 
            private Long id; 
            private Long isSupport; 
            private String outId; 
            private Long pid; 
            private Long receiveState; 
            private String receiver; 
            private Long renderDate; 
            private Long renderState; 
            private String shortUrl; 
            private String signName; 
            private String smsContent; 
            private String suggestion; 
            private String tmpCode; 
            private String tmpId; 
            private Long tmpType; 
            private String tmpTypeName; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.acceptDate = model.acceptDate;
                this.apiSend = model.apiSend;
                this.cardTemplateType = model.cardTemplateType;
                this.customTmpCode = model.customTmpCode;
                this.description = model.description;
                this.fuuId = model.fuuId;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.isSupport = model.isSupport;
                this.outId = model.outId;
                this.pid = model.pid;
                this.receiveState = model.receiveState;
                this.receiver = model.receiver;
                this.renderDate = model.renderDate;
                this.renderState = model.renderState;
                this.shortUrl = model.shortUrl;
                this.signName = model.signName;
                this.smsContent = model.smsContent;
                this.suggestion = model.suggestion;
                this.tmpCode = model.tmpCode;
                this.tmpId = model.tmpId;
                this.tmpType = model.tmpType;
                this.tmpTypeName = model.tmpTypeName;
            } 

            /**
             * AcceptDate.
             */
            public Builder acceptDate(Long acceptDate) {
                this.acceptDate = acceptDate;
                return this;
            }

            /**
             * ApiSend.
             */
            public Builder apiSend(Long apiSend) {
                this.apiSend = apiSend;
                return this;
            }

            /**
             * CardTemplateType.
             */
            public Builder cardTemplateType(String cardTemplateType) {
                this.cardTemplateType = cardTemplateType;
                return this;
            }

            /**
             * CustomTmpCode.
             */
            public Builder customTmpCode(String customTmpCode) {
                this.customTmpCode = customTmpCode;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * FuuId.
             */
            public Builder fuuId(String fuuId) {
                this.fuuId = fuuId;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(Long gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * IsSupport.
             */
            public Builder isSupport(Long isSupport) {
                this.isSupport = isSupport;
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
             * Pid.
             */
            public Builder pid(Long pid) {
                this.pid = pid;
                return this;
            }

            /**
             * ReceiveState.
             */
            public Builder receiveState(Long receiveState) {
                this.receiveState = receiveState;
                return this;
            }

            /**
             * Receiver.
             */
            public Builder receiver(String receiver) {
                this.receiver = receiver;
                return this;
            }

            /**
             * RenderDate.
             */
            public Builder renderDate(Long renderDate) {
                this.renderDate = renderDate;
                return this;
            }

            /**
             * RenderState.
             */
            public Builder renderState(Long renderState) {
                this.renderState = renderState;
                return this;
            }

            /**
             * ShortUrl.
             */
            public Builder shortUrl(String shortUrl) {
                this.shortUrl = shortUrl;
                return this;
            }

            /**
             * SignName.
             */
            public Builder signName(String signName) {
                this.signName = signName;
                return this;
            }

            /**
             * SmsContent.
             */
            public Builder smsContent(String smsContent) {
                this.smsContent = smsContent;
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
             * TmpCode.
             */
            public Builder tmpCode(String tmpCode) {
                this.tmpCode = tmpCode;
                return this;
            }

            /**
             * TmpId.
             */
            public Builder tmpId(String tmpId) {
                this.tmpId = tmpId;
                return this;
            }

            /**
             * TmpType.
             */
            public Builder tmpType(Long tmpType) {
                this.tmpType = tmpType;
                return this;
            }

            /**
             * TmpTypeName.
             */
            public Builder tmpTypeName(String tmpTypeName) {
                this.tmpTypeName = tmpTypeName;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCardSmsHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCardSmsHistoryResponseBody</p>
     */
    public static class Model extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNo")
        private Long pageNo;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Model(Builder builder) {
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.records = builder.records;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Model create() {
            return builder().build();
        }

        /**
         * @return pageNo
         */
        public Long getPageNo() {
            return this.pageNo;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Long pageNo; 
            private Long pageSize; 
            private java.util.List<Records> records; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Model model) {
                this.pageNo = model.pageNo;
                this.pageSize = model.pageSize;
                this.records = model.records;
                this.totalCount = model.totalCount;
            } 

            /**
             * PageNo.
             */
            public Builder pageNo(Long pageNo) {
                this.pageNo = pageNo;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Records.
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Model build() {
                return new Model(this);
            } 

        } 

    }
}
