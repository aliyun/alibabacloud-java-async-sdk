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
 * {@link QuerySaasRecordNewResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySaasRecordNewResponseBody</p>
 */
public class QuerySaasRecordNewResponseBody extends TeaModel {
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

    private QuerySaasRecordNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySaasRecordNewResponseBody create() {
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

        private Builder(QuerySaasRecordNewResponseBody model) {
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

        public QuerySaasRecordNewResponseBody build() {
            return new QuerySaasRecordNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySaasRecordNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySaasRecordNewResponseBody</p>
     */
    public static class SaasRecord extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("DetailPkId")
        private Long detailPkId;

        @com.aliyun.core.annotation.NameInMap("IndexCol")
        private String indexCol;

        @com.aliyun.core.annotation.NameInMap("LastDealDate")
        private String lastDealDate;

        @com.aliyun.core.annotation.NameInMap("RecordBizExpireDate")
        private String recordBizExpireDate;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("ResultDesc")
        private String resultDesc;

        @com.aliyun.core.annotation.NameInMap("SaasContent")
        private String saasContent;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private SaasRecord(Builder builder) {
            this.bizType = builder.bizType;
            this.detailPkId = builder.detailPkId;
            this.indexCol = builder.indexCol;
            this.lastDealDate = builder.lastDealDate;
            this.recordBizExpireDate = builder.recordBizExpireDate;
            this.result = builder.result;
            this.resultDesc = builder.resultDesc;
            this.saasContent = builder.saasContent;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SaasRecord create() {
            return builder().build();
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return detailPkId
         */
        public Long getDetailPkId() {
            return this.detailPkId;
        }

        /**
         * @return indexCol
         */
        public String getIndexCol() {
            return this.indexCol;
        }

        /**
         * @return lastDealDate
         */
        public String getLastDealDate() {
            return this.lastDealDate;
        }

        /**
         * @return recordBizExpireDate
         */
        public String getRecordBizExpireDate() {
            return this.recordBizExpireDate;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return resultDesc
         */
        public String getResultDesc() {
            return this.resultDesc;
        }

        /**
         * @return saasContent
         */
        public String getSaasContent() {
            return this.saasContent;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String bizType; 
            private Long detailPkId; 
            private String indexCol; 
            private String lastDealDate; 
            private String recordBizExpireDate; 
            private String result; 
            private String resultDesc; 
            private String saasContent; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(SaasRecord model) {
                this.bizType = model.bizType;
                this.detailPkId = model.detailPkId;
                this.indexCol = model.indexCol;
                this.lastDealDate = model.lastDealDate;
                this.recordBizExpireDate = model.recordBizExpireDate;
                this.result = model.result;
                this.resultDesc = model.resultDesc;
                this.saasContent = model.saasContent;
                this.suggestion = model.suggestion;
            } 

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * DetailPkId.
             */
            public Builder detailPkId(Long detailPkId) {
                this.detailPkId = detailPkId;
                return this;
            }

            /**
             * IndexCol.
             */
            public Builder indexCol(String indexCol) {
                this.indexCol = indexCol;
                return this;
            }

            /**
             * LastDealDate.
             */
            public Builder lastDealDate(String lastDealDate) {
                this.lastDealDate = lastDealDate;
                return this;
            }

            /**
             * RecordBizExpireDate.
             */
            public Builder recordBizExpireDate(String recordBizExpireDate) {
                this.recordBizExpireDate = recordBizExpireDate;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * ResultDesc.
             */
            public Builder resultDesc(String resultDesc) {
                this.resultDesc = resultDesc;
                return this;
            }

            /**
             * SaasContent.
             */
            public Builder saasContent(String saasContent) {
                this.saasContent = saasContent;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public SaasRecord build() {
                return new SaasRecord(this);
            } 

        } 

    }
    /**
     * 
     * {@link QuerySaasRecordNewResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySaasRecordNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SaasRecord")
        private java.util.List<SaasRecord> saasRecord;

        private List(Builder builder) {
            this.saasRecord = builder.saasRecord;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return saasRecord
         */
        public java.util.List<SaasRecord> getSaasRecord() {
            return this.saasRecord;
        }

        public static final class Builder {
            private java.util.List<SaasRecord> saasRecord; 

            private Builder() {
            } 

            private Builder(List model) {
                this.saasRecord = model.saasRecord;
            } 

            /**
             * SaasRecord.
             */
            public Builder saasRecord(java.util.List<SaasRecord> saasRecord) {
                this.saasRecord = saasRecord;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
