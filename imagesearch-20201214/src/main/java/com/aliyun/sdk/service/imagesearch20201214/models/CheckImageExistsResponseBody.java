// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link CheckImageExistsResponseBody} extends {@link TeaModel}
 *
 * <p>CheckImageExistsResponseBody</p>
 */
public class CheckImageExistsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Auctions")
    private Auctions auctions;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Exists")
    private Boolean exists;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CheckImageExistsResponseBody(Builder builder) {
        this.auctions = builder.auctions;
        this.code = builder.code;
        this.exists = builder.exists;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckImageExistsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return auctions
     */
    public Auctions getAuctions() {
        return this.auctions;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return exists
     */
    public Boolean getExists() {
        return this.exists;
    }

    /**
     * @return msg
     */
    public String getMsg() {
        return this.msg;
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
        private Auctions auctions; 
        private Integer code; 
        private Boolean exists; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(CheckImageExistsResponseBody model) {
            this.auctions = model.auctions;
            this.code = model.code;
            this.exists = model.exists;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Auctions.
         */
        public Builder auctions(Auctions auctions) {
            this.auctions = auctions;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Exists.
         */
        public Builder exists(Boolean exists) {
            this.exists = exists;
            return this;
        }

        /**
         * Msg.
         */
        public Builder msg(String msg) {
            this.msg = msg;
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

        public CheckImageExistsResponseBody build() {
            return new CheckImageExistsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CheckImageExistsResponseBody} extends {@link TeaModel}
     *
     * <p>CheckImageExistsResponseBody</p>
     */
    public static class Auctions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CategoryId")
        private Integer categoryId;

        @com.aliyun.core.annotation.NameInMap("CustomContent")
        private String customContent;

        @com.aliyun.core.annotation.NameInMap("IntAttr")
        private Integer intAttr;

        @com.aliyun.core.annotation.NameInMap("IntAttr2")
        private Integer intAttr2;

        @com.aliyun.core.annotation.NameInMap("IntAttr3")
        private Integer intAttr3;

        @com.aliyun.core.annotation.NameInMap("IntAttr4")
        private Integer intAttr4;

        @com.aliyun.core.annotation.NameInMap("PicName")
        private String picName;

        @com.aliyun.core.annotation.NameInMap("ProductId")
        private String productId;

        @com.aliyun.core.annotation.NameInMap("StrAttr")
        private String strAttr;

        @com.aliyun.core.annotation.NameInMap("StrAttr2")
        private String strAttr2;

        @com.aliyun.core.annotation.NameInMap("StrAttr3")
        private String strAttr3;

        @com.aliyun.core.annotation.NameInMap("StrAttr4")
        private String strAttr4;

        private Auctions(Builder builder) {
            this.categoryId = builder.categoryId;
            this.customContent = builder.customContent;
            this.intAttr = builder.intAttr;
            this.intAttr2 = builder.intAttr2;
            this.intAttr3 = builder.intAttr3;
            this.intAttr4 = builder.intAttr4;
            this.picName = builder.picName;
            this.productId = builder.productId;
            this.strAttr = builder.strAttr;
            this.strAttr2 = builder.strAttr2;
            this.strAttr3 = builder.strAttr3;
            this.strAttr4 = builder.strAttr4;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Auctions create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public Integer getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return customContent
         */
        public String getCustomContent() {
            return this.customContent;
        }

        /**
         * @return intAttr
         */
        public Integer getIntAttr() {
            return this.intAttr;
        }

        /**
         * @return intAttr2
         */
        public Integer getIntAttr2() {
            return this.intAttr2;
        }

        /**
         * @return intAttr3
         */
        public Integer getIntAttr3() {
            return this.intAttr3;
        }

        /**
         * @return intAttr4
         */
        public Integer getIntAttr4() {
            return this.intAttr4;
        }

        /**
         * @return picName
         */
        public String getPicName() {
            return this.picName;
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return strAttr
         */
        public String getStrAttr() {
            return this.strAttr;
        }

        /**
         * @return strAttr2
         */
        public String getStrAttr2() {
            return this.strAttr2;
        }

        /**
         * @return strAttr3
         */
        public String getStrAttr3() {
            return this.strAttr3;
        }

        /**
         * @return strAttr4
         */
        public String getStrAttr4() {
            return this.strAttr4;
        }

        public static final class Builder {
            private Integer categoryId; 
            private String customContent; 
            private Integer intAttr; 
            private Integer intAttr2; 
            private Integer intAttr3; 
            private Integer intAttr4; 
            private String picName; 
            private String productId; 
            private String strAttr; 
            private String strAttr2; 
            private String strAttr3; 
            private String strAttr4; 

            private Builder() {
            } 

            private Builder(Auctions model) {
                this.categoryId = model.categoryId;
                this.customContent = model.customContent;
                this.intAttr = model.intAttr;
                this.intAttr2 = model.intAttr2;
                this.intAttr3 = model.intAttr3;
                this.intAttr4 = model.intAttr4;
                this.picName = model.picName;
                this.productId = model.productId;
                this.strAttr = model.strAttr;
                this.strAttr2 = model.strAttr2;
                this.strAttr3 = model.strAttr3;
                this.strAttr4 = model.strAttr4;
            } 

            /**
             * CategoryId.
             */
            public Builder categoryId(Integer categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CustomContent.
             */
            public Builder customContent(String customContent) {
                this.customContent = customContent;
                return this;
            }

            /**
             * IntAttr.
             */
            public Builder intAttr(Integer intAttr) {
                this.intAttr = intAttr;
                return this;
            }

            /**
             * IntAttr2.
             */
            public Builder intAttr2(Integer intAttr2) {
                this.intAttr2 = intAttr2;
                return this;
            }

            /**
             * IntAttr3.
             */
            public Builder intAttr3(Integer intAttr3) {
                this.intAttr3 = intAttr3;
                return this;
            }

            /**
             * IntAttr4.
             */
            public Builder intAttr4(Integer intAttr4) {
                this.intAttr4 = intAttr4;
                return this;
            }

            /**
             * PicName.
             */
            public Builder picName(String picName) {
                this.picName = picName;
                return this;
            }

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * StrAttr.
             */
            public Builder strAttr(String strAttr) {
                this.strAttr = strAttr;
                return this;
            }

            /**
             * StrAttr2.
             */
            public Builder strAttr2(String strAttr2) {
                this.strAttr2 = strAttr2;
                return this;
            }

            /**
             * StrAttr3.
             */
            public Builder strAttr3(String strAttr3) {
                this.strAttr3 = strAttr3;
                return this;
            }

            /**
             * StrAttr4.
             */
            public Builder strAttr4(String strAttr4) {
                this.strAttr4 = strAttr4;
                return this;
            }

            public Auctions build() {
                return new Auctions(this);
            } 

        } 

    }
}
