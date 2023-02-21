// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcJusticeAuctionResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcJusticeAuctionResponseBody</p>
 */
public class GetOcJusticeAuctionResponseBody extends TeaModel {
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

    private GetOcJusticeAuctionResponseBody(Builder builder) {
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

    public static GetOcJusticeAuctionResponseBody create() {
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

        public GetOcJusticeAuctionResponseBody build() {
            return new GetOcJusticeAuctionResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AuctionDate")
        private String auctionDate;

        @NameInMap("AuctionName")
        private String auctionName;

        @NameInMap("Basis")
        private String basis;

        @NameInMap("Certificate")
        private String certificate;

        @NameInMap("Court")
        private String court;

        @NameInMap("Description")
        private String description;

        @NameInMap("Document")
        private String document;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("EstPrice")
        private String estPrice;

        @NameInMap("Owner")
        private String owner;

        @NameInMap("Restrict")
        private String restrict;

        @NameInMap("StartPrice")
        private String startPrice;

        private Data(Builder builder) {
            this.auctionDate = builder.auctionDate;
            this.auctionName = builder.auctionName;
            this.basis = builder.basis;
            this.certificate = builder.certificate;
            this.court = builder.court;
            this.description = builder.description;
            this.document = builder.document;
            this.entName = builder.entName;
            this.estPrice = builder.estPrice;
            this.owner = builder.owner;
            this.restrict = builder.restrict;
            this.startPrice = builder.startPrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return auctionDate
         */
        public String getAuctionDate() {
            return this.auctionDate;
        }

        /**
         * @return auctionName
         */
        public String getAuctionName() {
            return this.auctionName;
        }

        /**
         * @return basis
         */
        public String getBasis() {
            return this.basis;
        }

        /**
         * @return certificate
         */
        public String getCertificate() {
            return this.certificate;
        }

        /**
         * @return court
         */
        public String getCourt() {
            return this.court;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return document
         */
        public String getDocument() {
            return this.document;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return estPrice
         */
        public String getEstPrice() {
            return this.estPrice;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return restrict
         */
        public String getRestrict() {
            return this.restrict;
        }

        /**
         * @return startPrice
         */
        public String getStartPrice() {
            return this.startPrice;
        }

        public static final class Builder {
            private String auctionDate; 
            private String auctionName; 
            private String basis; 
            private String certificate; 
            private String court; 
            private String description; 
            private String document; 
            private String entName; 
            private String estPrice; 
            private String owner; 
            private String restrict; 
            private String startPrice; 

            /**
             * 拍卖时间
             */
            public Builder auctionDate(String auctionDate) {
                this.auctionDate = auctionDate;
                return this;
            }

            /**
             * 拍卖标的名称
             */
            public Builder auctionName(String auctionName) {
                this.auctionName = auctionName;
                return this;
            }

            /**
             * 权利来源
             */
            public Builder basis(String basis) {
                this.basis = basis;
                return this;
            }

            /**
             * 证明文件
             */
            public Builder certificate(String certificate) {
                this.certificate = certificate;
                return this;
            }

            /**
             * 委托法院
             */
            public Builder court(String court) {
                this.court = court;
                return this;
            }

            /**
             * 拍品介绍
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 法律文书
             */
            public Builder document(String document) {
                this.document = document;
                return this;
            }

            /**
             * 公司名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 拍品评估价(万元)
             */
            public Builder estPrice(String estPrice) {
                this.estPrice = estPrice;
                return this;
            }

            /**
             * 标的所有人
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * 权利限制情况
             */
            public Builder restrict(String restrict) {
                this.restrict = restrict;
                return this;
            }

            /**
             * 起拍价
             */
            public Builder startPrice(String startPrice) {
                this.startPrice = startPrice;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
