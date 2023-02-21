// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcProductBandResponseBody} extends {@link TeaModel}
 *
 * <p>GetOcProductBandResponseBody</p>
 */
public class GetOcProductBandResponseBody extends TeaModel {
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

    private GetOcProductBandResponseBody(Builder builder) {
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

    public static GetOcProductBandResponseBody create() {
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

        public GetOcProductBandResponseBody build() {
            return new GetOcProductBandResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BrandIntroduction")
        private String brandIntroduction;

        @NameInMap("Device")
        private String device;

        @NameInMap("EntName")
        private String entName;

        @NameInMap("ProductIntroduction")
        private String productIntroduction;

        @NameInMap("ProductLogo")
        private String productLogo;

        @NameInMap("ProductName")
        private String productName;

        @NameInMap("ProductTag")
        private String productTag;

        @NameInMap("ProductWebsite")
        private String productWebsite;

        private Data(Builder builder) {
            this.brandIntroduction = builder.brandIntroduction;
            this.device = builder.device;
            this.entName = builder.entName;
            this.productIntroduction = builder.productIntroduction;
            this.productLogo = builder.productLogo;
            this.productName = builder.productName;
            this.productTag = builder.productTag;
            this.productWebsite = builder.productWebsite;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return brandIntroduction
         */
        public String getBrandIntroduction() {
            return this.brandIntroduction;
        }

        /**
         * @return device
         */
        public String getDevice() {
            return this.device;
        }

        /**
         * @return entName
         */
        public String getEntName() {
            return this.entName;
        }

        /**
         * @return productIntroduction
         */
        public String getProductIntroduction() {
            return this.productIntroduction;
        }

        /**
         * @return productLogo
         */
        public String getProductLogo() {
            return this.productLogo;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return productTag
         */
        public String getProductTag() {
            return this.productTag;
        }

        /**
         * @return productWebsite
         */
        public String getProductWebsite() {
            return this.productWebsite;
        }

        public static final class Builder {
            private String brandIntroduction; 
            private String device; 
            private String entName; 
            private String productIntroduction; 
            private String productLogo; 
            private String productName; 
            private String productTag; 
            private String productWebsite; 

            /**
             * 品牌介绍--产品所属品牌介绍
             */
            public Builder brandIntroduction(String brandIntroduction) {
                this.brandIntroduction = brandIntroduction;
                return this;
            }

            /**
             * 支持设备
             */
            public Builder device(String device) {
                this.device = device;
                return this;
            }

            /**
             * 产品所属企业名称
             */
            public Builder entName(String entName) {
                this.entName = entName;
                return this;
            }

            /**
             * 产品简介
             */
            public Builder productIntroduction(String productIntroduction) {
                this.productIntroduction = productIntroduction;
                return this;
            }

            /**
             * 产品logo链接
             */
            public Builder productLogo(String productLogo) {
                this.productLogo = productLogo;
                return this;
            }

            /**
             * 产品名称
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * 产品标签
             */
            public Builder productTag(String productTag) {
                this.productTag = productTag;
                return this;
            }

            /**
             * 产品官网
             */
            public Builder productWebsite(String productWebsite) {
                this.productWebsite = productWebsite;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
