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
 * {@link QueryTmpEffectReportDayDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTmpEffectReportDayDataResponseBody</p>
 */
public class QueryTmpEffectReportDayDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Model")
    private Model model;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryTmpEffectReportDayDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.model = builder.model;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTmpEffectReportDayDataResponseBody create() {
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

        private Builder(QueryTmpEffectReportDayDataResponseBody model) {
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

        public QueryTmpEffectReportDayDataResponseBody build() {
            return new QueryTmpEffectReportDayDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTmpEffectReportDayDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTmpEffectReportDayDataResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClickPv")
        private String clickPv;

        @com.aliyun.core.annotation.NameInMap("ClickUv")
        private String clickUv;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("ExposePv")
        private String exposePv;

        @com.aliyun.core.annotation.NameInMap("ExposeUv")
        private String exposeUv;

        @com.aliyun.core.annotation.NameInMap("RptSuccessCount")
        private String rptSuccessCount;

        @com.aliyun.core.annotation.NameInMap("TmpCode")
        private String tmpCode;

        @com.aliyun.core.annotation.NameInMap("TmpName")
        private String tmpName;

        @com.aliyun.core.annotation.NameInMap("VendorName")
        private String vendorName;

        private Records(Builder builder) {
            this.clickPv = builder.clickPv;
            this.clickUv = builder.clickUv;
            this.date = builder.date;
            this.exposePv = builder.exposePv;
            this.exposeUv = builder.exposeUv;
            this.rptSuccessCount = builder.rptSuccessCount;
            this.tmpCode = builder.tmpCode;
            this.tmpName = builder.tmpName;
            this.vendorName = builder.vendorName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return clickPv
         */
        public String getClickPv() {
            return this.clickPv;
        }

        /**
         * @return clickUv
         */
        public String getClickUv() {
            return this.clickUv;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return exposePv
         */
        public String getExposePv() {
            return this.exposePv;
        }

        /**
         * @return exposeUv
         */
        public String getExposeUv() {
            return this.exposeUv;
        }

        /**
         * @return rptSuccessCount
         */
        public String getRptSuccessCount() {
            return this.rptSuccessCount;
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
         * @return vendorName
         */
        public String getVendorName() {
            return this.vendorName;
        }

        public static final class Builder {
            private String clickPv; 
            private String clickUv; 
            private String date; 
            private String exposePv; 
            private String exposeUv; 
            private String rptSuccessCount; 
            private String tmpCode; 
            private String tmpName; 
            private String vendorName; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.clickPv = model.clickPv;
                this.clickUv = model.clickUv;
                this.date = model.date;
                this.exposePv = model.exposePv;
                this.exposeUv = model.exposeUv;
                this.rptSuccessCount = model.rptSuccessCount;
                this.tmpCode = model.tmpCode;
                this.tmpName = model.tmpName;
                this.vendorName = model.vendorName;
            } 

            /**
             * ClickPv.
             */
            public Builder clickPv(String clickPv) {
                this.clickPv = clickPv;
                return this;
            }

            /**
             * ClickUv.
             */
            public Builder clickUv(String clickUv) {
                this.clickUv = clickUv;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * ExposePv.
             */
            public Builder exposePv(String exposePv) {
                this.exposePv = exposePv;
                return this;
            }

            /**
             * ExposeUv.
             */
            public Builder exposeUv(String exposeUv) {
                this.exposeUv = exposeUv;
                return this;
            }

            /**
             * RptSuccessCount.
             */
            public Builder rptSuccessCount(String rptSuccessCount) {
                this.rptSuccessCount = rptSuccessCount;
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
             * VendorName.
             */
            public Builder vendorName(String vendorName) {
                this.vendorName = vendorName;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTmpEffectReportDayDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTmpEffectReportDayDataResponseBody</p>
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
