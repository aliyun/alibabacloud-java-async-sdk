// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetUserBuyStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserBuyStatusResponseBody</p>
 */
public class GetUserBuyStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Msg")
    private String msg;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetUserBuyStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.msg = builder.msg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserBuyStatusResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Integer code; 
        private Data data; 
        private String msg; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetUserBuyStatusResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.msg = model.msg;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>Error code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Further description of the error code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder msg(String msg) {
            this.msg = msg;
            return this;
        }

        /**
         * <p>ID assigned by the backend to uniquely identify a request. It can be used for troubleshooting.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Success indicator.</p>
         * 
         * <strong>example:</strong>
         * <p>True</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetUserBuyStatusResponseBody build() {
            return new GetUserBuyStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserBuyStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserBuyStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bid")
        private Long bid;

        @com.aliyun.core.annotation.NameInMap("Buy")
        private Boolean buy;

        @com.aliyun.core.annotation.NameInMap("Indebt")
        private Boolean indebt;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Tag")
        private String tag;

        private Data(Builder builder) {
            this.bid = builder.bid;
            this.buy = builder.buy;
            this.indebt = builder.indebt;
            this.instanceId = builder.instanceId;
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return bid
         */
        public Long getBid() {
            return this.bid;
        }

        /**
         * @return buy
         */
        public Boolean getBuy() {
            return this.buy;
        }

        /**
         * @return indebt
         */
        public Boolean getIndebt() {
            return this.indebt;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return tag
         */
        public String getTag() {
            return this.tag;
        }

        public static final class Builder {
            private Long bid; 
            private Boolean buy; 
            private Boolean indebt; 
            private String instanceId; 
            private String tag; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.bid = model.bid;
                this.buy = model.buy;
                this.indebt = model.indebt;
                this.instanceId = model.instanceId;
                this.tag = model.tag;
            } 

            /**
             * <p>Bid.</p>
             * 
             * <strong>example:</strong>
             * <p>26842</p>
             */
            public Builder bid(Long bid) {
                this.bid = bid;
                return this;
            }

            /**
             * <p>Indicates whether the product has been activated on Alibaba Cloud.</p>
             * 
             * <strong>example:</strong>
             * <p>True</p>
             */
            public Builder buy(Boolean buy) {
                this.buy = buy;
                return this;
            }

            /**
             * <p>Indicates whether there is an outstanding payment.</p>
             * 
             * <strong>example:</strong>
             * <p>False</p>
             */
            public Builder indebt(Boolean indebt) {
                this.indebt = indebt;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Tag.</p>
             * 
             * <strong>example:</strong>
             * <p>bailian</p>
             */
            public Builder tag(String tag) {
                this.tag = tag;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
