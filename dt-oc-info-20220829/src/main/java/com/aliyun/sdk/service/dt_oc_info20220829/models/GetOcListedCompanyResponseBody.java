// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcListedCompanyResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcListedCompanyResponseBody</p>
 */
public class GetOcListedCompanyResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageIndex")
    private Integer pageIndex;

    @NameInMap("PageNum")
    private Integer pageNum;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalNum")
    private Integer totalNum;

    private GetOcListedCompanyResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.pageIndex = builder.pageIndex;
        this.pageNum = builder.pageNum;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalNum = builder.totalNum;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOcListedCompanyResponseBody create() {
        return builder().build();
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
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageIndex
     */
    public Integer getPageIndex() {
        return this.pageIndex;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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

    /**
     * @return totalNum
     */
    public Integer getTotalNum() {
        return this.totalNum;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private Integer pageIndex; 
        private Integer pageNum; 
        private String requestId; 
        private Boolean success; 
        private Integer totalNum; 

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
        public Builder data(java.util.List < Data> data) {
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
         * PageIndex.
         */
        public Builder pageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
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

        /**
         * TotalNum.
         */
        public Builder totalNum(Integer totalNum) {
            this.totalNum = totalNum;
            return this;
        }

        public GetOcListedCompanyResponseBody build() {
            return new GetOcListedCompanyResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CirculationMarketValue")
        private String circulationMarketValue;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("EntNameEng")
        private String entNameEng;

        @NameInMap("ListDate")
        private String listDate;

        @NameInMap("SecuritiesCode")
        private String securitiesCode;

        @NameInMap("SecuritiesMarket")
        private String securitiesMarket;

        @NameInMap("SecuritiesName")
        private String securitiesName;

        @NameInMap("TotalFlowShares")
        private String totalFlowShares;

        @NameInMap("TotalShares")
        private String totalShares;

        private Data(Builder builder) {
            this.circulationMarketValue = builder.circulationMarketValue;
            this.entName = builder.entName;
            this.entNameEng = builder.entNameEng;
            this.listDate = builder.listDate;
            this.securitiesCode = builder.securitiesCode;
            this.securitiesMarket = builder.securitiesMarket;
            this.securitiesName = builder.securitiesName;
            this.totalFlowShares = builder.totalFlowShares;
            this.totalShares = builder.totalShares;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return circulationMarketValue
         */
        public String getCirculationMarketValue() {
            return this.circulationMarketValue;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return entNameEng
         */
        public String getEntNameEng() {
            return this.entNameEng;
        }

        /**
         * @return listDate
         */
        public String getListDate() {
            return this.listDate;
        }

        /**
         * @return securitiesCode
         */
        public String getSecuritiesCode() {
            return this.securitiesCode;
        }

        /**
         * @return securitiesMarket
         */
        public String getSecuritiesMarket() {
            return this.securitiesMarket;
        }

        /**
         * @return securitiesName
         */
        public String getSecuritiesName() {
            return this.securitiesName;
        }

        /**
         * @return totalFlowShares
         */
        public String getTotalFlowShares() {
            return this.totalFlowShares;
        }

        /**
         * @return totalShares
         */
        public String getTotalShares() {
            return this.totalShares;
        }

        public static final class Builder {
            private String circulationMarketValue; 
            private String entName; 
            private String entNameEng; 
            private String listDate; 
            private String securitiesCode; 
            private String securitiesMarket; 
            private String securitiesName; 
            private String totalFlowShares; 
            private String totalShares; 

            /**
             * 股票流通市值
             */
            public Builder circulationMarketValue(String circulationMarketValue) {
                this.circulationMarketValue = circulationMarketValue;
                return this;
            }

            /**
             * 企业名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 企业英文名称
             */
            public Builder entNameEng(String entNameEng) {
                this.entNameEng = entNameEng;
                return this;
            }

            /**
             * 上市日期
             */
            public Builder listDate(String listDate) {
                this.listDate = listDate;
                return this;
            }

            /**
             * 证劵代码
             */
            public Builder securitiesCode(String securitiesCode) {
                this.securitiesCode = securitiesCode;
                return this;
            }

            /**
             * 交易所
             */
            public Builder securitiesMarket(String securitiesMarket) {
                this.securitiesMarket = securitiesMarket;
                return this;
            }

            /**
             * 证劵名称
             */
            public Builder securitiesName(String securitiesName) {
                this.securitiesName = securitiesName;
                return this;
            }

            /**
             * 总流通股本（单位：万股）
             */
            public Builder totalFlowShares(String totalFlowShares) {
                this.totalFlowShares = totalFlowShares;
                return this;
            }

            /**
             * 总股本（单位：万股）
             */
            public Builder totalShares(String totalShares) {
                this.totalShares = totalShares;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
