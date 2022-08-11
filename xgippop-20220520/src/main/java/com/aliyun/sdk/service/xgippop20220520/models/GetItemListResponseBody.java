// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetItemListResponseBody} extends {@link TeaModel}
 *
 * <p>GetItemListResponseBody</p>
 */
public class GetItemListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rt")
    private Long rt;

    @NameInMap("Success")
    private Boolean success;

    private GetItemListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.rt = builder.rt;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetItemListResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rt
     */
    public Long getRt() {
        return this.rt;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private java.util.List < Data> data; 
        private String message; 
        private String requestId; 
        private Long rt; 
        private Boolean success; 

        /**
         * 结果码
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * 结果
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 结果描述
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求链路ID，如POP请求进来的requestId，返回时原样返回
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 服务端处理耗时，ms
         */
        public Builder rt(Long rt) {
            this.rt = rt;
            return this;
        }

        /**
         * 是否成功
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetItemListResponseBody build() {
            return new GetItemListResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("BizCode")
        private String bizCode;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("ItemBuyUrl")
        private String itemBuyUrl;

        @NameInMap("ItemCode")
        private String itemCode;

        @NameInMap("ItemName")
        private String itemName;

        @NameInMap("Name")
        private String name;

        private Data(Builder builder) {
            this.bizCode = builder.bizCode;
            this.bizType = builder.bizType;
            this.itemBuyUrl = builder.itemBuyUrl;
            this.itemCode = builder.itemCode;
            this.itemName = builder.itemName;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bizCode
         */
        public String getBizCode() {
            return this.bizCode;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return itemBuyUrl
         */
        public String getItemBuyUrl() {
            return this.itemBuyUrl;
        }

        /**
         * @return itemCode
         */
        public String getItemCode() {
            return this.itemCode;
        }

        /**
         * @return itemName
         */
        public String getItemName() {
            return this.itemName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String bizCode; 
            private String bizType; 
            private String itemBuyUrl; 
            private String itemCode; 
            private String itemName; 
            private String name; 

            /**
             * 业务类型 flow/gos
             */
            public Builder bizCode(String bizCode) {
                this.bizCode = bizCode;
                return this;
            }

            /**
             * 业务类型
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * buy地址
             */
            public Builder itemBuyUrl(String itemBuyUrl) {
                this.itemBuyUrl = itemBuyUrl;
                return this;
            }

            /**
             * 商品code
             */
            public Builder itemCode(String itemCode) {
                this.itemCode = itemCode;
                return this;
            }

            /**
             * 商品名称
             */
            public Builder itemName(String itemName) {
                this.itemName = itemName;
                return this;
            }

            /**
             * 类目名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
