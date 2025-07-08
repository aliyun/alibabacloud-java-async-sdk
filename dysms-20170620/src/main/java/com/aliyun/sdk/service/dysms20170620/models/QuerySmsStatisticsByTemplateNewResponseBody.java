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
 * {@link QuerySmsStatisticsByTemplateNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySmsStatisticsByTemplateNewResponseBody</p>
 */
public class QuerySmsStatisticsByTemplateNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private QuerySmsStatisticsByTemplateNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySmsStatisticsByTemplateNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private List list; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QuerySmsStatisticsByTemplateNewResponseBody model) {
            this.list = model.list;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QuerySmsStatisticsByTemplateNewResponseBody build() {
            return new QuerySmsStatisticsByTemplateNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySmsStatisticsByTemplateNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsStatisticsByTemplateNewResponseBody</p>
     */
    public static class SmsStatisticsResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DetailStsDate")
        private String detailStsDate;

        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("SendSuccessRate")
        private String sendSuccessRate;

        @com.aliyun.core.annotation.NameInMap("SendTotal")
        private Long sendTotal;

        @com.aliyun.core.annotation.NameInMap("SendTotalFail")
        private Long sendTotalFail;

        @com.aliyun.core.annotation.NameInMap("SendTotalSuccess")
        private Long sendTotalSuccess;

        @com.aliyun.core.annotation.NameInMap("SendTotalUnknown")
        private Long sendTotalUnknown;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private SmsStatisticsResponse(Builder builder) {
            this.detailStsDate = builder.detailStsDate;
            this.downloadUrl = builder.downloadUrl;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.sendSuccessRate = builder.sendSuccessRate;
            this.sendTotal = builder.sendTotal;
            this.sendTotalFail = builder.sendTotalFail;
            this.sendTotalSuccess = builder.sendTotalSuccess;
            this.sendTotalUnknown = builder.sendTotalUnknown;
            this.status = builder.status;
            this.templateCode = builder.templateCode;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SmsStatisticsResponse create() {
            return builder().build();
        }

        /**
         * @return detailStsDate
         */
        public String getDetailStsDate() {
            return this.detailStsDate;
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sendSuccessRate
         */
        public String getSendSuccessRate() {
            return this.sendSuccessRate;
        }

        /**
         * @return sendTotal
         */
        public Long getSendTotal() {
            return this.sendTotal;
        }

        /**
         * @return sendTotalFail
         */
        public Long getSendTotalFail() {
            return this.sendTotalFail;
        }

        /**
         * @return sendTotalSuccess
         */
        public Long getSendTotalSuccess() {
            return this.sendTotalSuccess;
        }

        /**
         * @return sendTotalUnknown
         */
        public Long getSendTotalUnknown() {
            return this.sendTotalUnknown;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        public static final class Builder {
            private String detailStsDate; 
            private String downloadUrl; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String sendSuccessRate; 
            private Long sendTotal; 
            private Long sendTotalFail; 
            private Long sendTotalSuccess; 
            private Long sendTotalUnknown; 
            private String status; 
            private String templateCode; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(SmsStatisticsResponse model) {
                this.detailStsDate = model.detailStsDate;
                this.downloadUrl = model.downloadUrl;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.sendSuccessRate = model.sendSuccessRate;
                this.sendTotal = model.sendTotal;
                this.sendTotalFail = model.sendTotalFail;
                this.sendTotalSuccess = model.sendTotalSuccess;
                this.sendTotalUnknown = model.sendTotalUnknown;
                this.status = model.status;
                this.templateCode = model.templateCode;
                this.templateName = model.templateName;
            } 

            /**
             * DetailStsDate.
             */
            public Builder detailStsDate(String detailStsDate) {
                this.detailStsDate = detailStsDate;
                return this;
            }

            /**
             * DownloadUrl.
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
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
             * SendSuccessRate.
             */
            public Builder sendSuccessRate(String sendSuccessRate) {
                this.sendSuccessRate = sendSuccessRate;
                return this;
            }

            /**
             * SendTotal.
             */
            public Builder sendTotal(Long sendTotal) {
                this.sendTotal = sendTotal;
                return this;
            }

            /**
             * SendTotalFail.
             */
            public Builder sendTotalFail(Long sendTotalFail) {
                this.sendTotalFail = sendTotalFail;
                return this;
            }

            /**
             * SendTotalSuccess.
             */
            public Builder sendTotalSuccess(Long sendTotalSuccess) {
                this.sendTotalSuccess = sendTotalSuccess;
                return this;
            }

            /**
             * SendTotalUnknown.
             */
            public Builder sendTotalUnknown(Long sendTotalUnknown) {
                this.sendTotalUnknown = sendTotalUnknown;
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
             * TemplateCode.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public SmsStatisticsResponse build() {
                return new SmsStatisticsResponse(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySmsStatisticsByTemplateNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySmsStatisticsByTemplateNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SmsStatisticsResponse")
        private java.util.List<SmsStatisticsResponse> smsStatisticsResponse;

        private List(Builder builder) {
            this.smsStatisticsResponse = builder.smsStatisticsResponse;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return smsStatisticsResponse
         */
        public java.util.List<SmsStatisticsResponse> getSmsStatisticsResponse() {
            return this.smsStatisticsResponse;
        }

        public static final class Builder {
            private java.util.List<SmsStatisticsResponse> smsStatisticsResponse; 

            private Builder() {
            } 

            private Builder(List model) {
                this.smsStatisticsResponse = model.smsStatisticsResponse;
            } 

            /**
             * SmsStatisticsResponse.
             */
            public Builder smsStatisticsResponse(java.util.List<SmsStatisticsResponse> smsStatisticsResponse) {
                this.smsStatisticsResponse = smsStatisticsResponse;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
