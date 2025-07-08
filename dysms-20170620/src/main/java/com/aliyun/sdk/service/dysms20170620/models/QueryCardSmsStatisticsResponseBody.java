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
 * {@link QueryCardSmsStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCardSmsStatisticsResponseBody</p>
 */
public class QueryCardSmsStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCardSmsStatisticsResponseBody(Builder builder) {
        this.code = builder.code;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCardSmsStatisticsResponseBody create() {
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

        private Builder(QueryCardSmsStatisticsResponseBody model) {
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

        public QueryCardSmsStatisticsResponseBody build() {
            return new QueryCardSmsStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCardSmsStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCardSmsStatisticsResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RenderSuccessTotal")
        private Long renderSuccessTotal;

        @com.aliyun.core.annotation.NameInMap("SendDate")
        private String sendDate;

        @com.aliyun.core.annotation.NameInMap("SignName")
        private String signName;

        @com.aliyun.core.annotation.NameInMap("TmpCode")
        private String tmpCode;

        @com.aliyun.core.annotation.NameInMap("TmpName")
        private String tmpName;

        @com.aliyun.core.annotation.NameInMap("UrlGenerateTotal")
        private Long urlGenerateTotal;

        private Records(Builder builder) {
            this.renderSuccessTotal = builder.renderSuccessTotal;
            this.sendDate = builder.sendDate;
            this.signName = builder.signName;
            this.tmpCode = builder.tmpCode;
            this.tmpName = builder.tmpName;
            this.urlGenerateTotal = builder.urlGenerateTotal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return renderSuccessTotal
         */
        public Long getRenderSuccessTotal() {
            return this.renderSuccessTotal;
        }

        /**
         * @return sendDate
         */
        public String getSendDate() {
            return this.sendDate;
        }

        /**
         * @return signName
         */
        public String getSignName() {
            return this.signName;
        }

        /**
         * @return tmpCode
         */
        public String getTmpCode() {
            return this.tmpCode;
        }

        /**
         * @return tmpName
         */
        public String getTmpName() {
            return this.tmpName;
        }

        /**
         * @return urlGenerateTotal
         */
        public Long getUrlGenerateTotal() {
            return this.urlGenerateTotal;
        }

        public static final class Builder {
            private Long renderSuccessTotal; 
            private String sendDate; 
            private String signName; 
            private String tmpCode; 
            private String tmpName; 
            private Long urlGenerateTotal; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.renderSuccessTotal = model.renderSuccessTotal;
                this.sendDate = model.sendDate;
                this.signName = model.signName;
                this.tmpCode = model.tmpCode;
                this.tmpName = model.tmpName;
                this.urlGenerateTotal = model.urlGenerateTotal;
            } 

            /**
             * RenderSuccessTotal.
             */
            public Builder renderSuccessTotal(Long renderSuccessTotal) {
                this.renderSuccessTotal = renderSuccessTotal;
                return this;
            }

            /**
             * SendDate.
             */
            public Builder sendDate(String sendDate) {
                this.sendDate = sendDate;
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
             * TmpCode.
             */
            public Builder tmpCode(String tmpCode) {
                this.tmpCode = tmpCode;
                return this;
            }

            /**
             * TmpName.
             */
            public Builder tmpName(String tmpName) {
                this.tmpName = tmpName;
                return this;
            }

            /**
             * UrlGenerateTotal.
             */
            public Builder urlGenerateTotal(Long urlGenerateTotal) {
                this.urlGenerateTotal = urlGenerateTotal;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCardSmsStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCardSmsStatisticsResponseBody</p>
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
