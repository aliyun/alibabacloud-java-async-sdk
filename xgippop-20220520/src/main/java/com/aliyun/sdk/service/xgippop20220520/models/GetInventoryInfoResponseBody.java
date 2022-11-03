// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xgippop20220520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetInventoryInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetInventoryInfoResponseBody</p>
 */
public class GetInventoryInfoResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rt")
    private Long rt;

    @NameInMap("Success")
    private Boolean success;

    private GetInventoryInfoResponseBody(Builder builder) {
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

    public static GetInventoryInfoResponseBody create() {
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
    public Data getData() {
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
        private Data data; 
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
        public Builder data(Data data) {
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

        public GetInventoryInfoResponseBody build() {
            return new GetInventoryInfoResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Inventory")
        private Long inventory;

        @NameInMap("ResidualInventory")
        private Long residualInventory;

        @NameInMap("UsedStock")
        private Long usedStock;

        private Data(Builder builder) {
            this.inventory = builder.inventory;
            this.residualInventory = builder.residualInventory;
            this.usedStock = builder.usedStock;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return inventory
         */
        public Long getInventory() {
            return this.inventory;
        }

        /**
         * @return residualInventory
         */
        public Long getResidualInventory() {
            return this.residualInventory;
        }

        /**
         * @return usedStock
         */
        public Long getUsedStock() {
            return this.usedStock;
        }

        public static final class Builder {
            private Long inventory; 
            private Long residualInventory; 
            private Long usedStock; 

            /**
             * 总库存
             */
            public Builder inventory(Long inventory) {
                this.inventory = inventory;
                return this;
            }

            /**
             * 剩余库存
             */
            public Builder residualInventory(Long residualInventory) {
                this.residualInventory = residualInventory;
                return this;
            }

            /**
             * 用户使用库存
             */
            public Builder usedStock(Long usedStock) {
                this.usedStock = usedStock;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
