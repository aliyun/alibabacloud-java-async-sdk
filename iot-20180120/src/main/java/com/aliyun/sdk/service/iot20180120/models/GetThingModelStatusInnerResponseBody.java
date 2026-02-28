// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link GetThingModelStatusInnerResponseBody} extends {@link TeaModel}
 *
 * <p>GetThingModelStatusInnerResponseBody</p>
 */
public class GetThingModelStatusInnerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("LocalizedMsg")
    private String localizedMsg;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetThingModelStatusInnerResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.localizedMsg = builder.localizedMsg;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetThingModelStatusInnerResponseBody create() {
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
     * @return localizedMsg
     */
    public String getLocalizedMsg() {
        return this.localizedMsg;
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

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String localizedMsg; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetThingModelStatusInnerResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.localizedMsg = model.localizedMsg;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * LocalizedMsg.
         */
        public Builder localizedMsg(String localizedMsg) {
            this.localizedMsg = localizedMsg;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetThingModelStatusInnerResponseBody build() {
            return new GetThingModelStatusInnerResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetThingModelStatusInnerResponseBody} extends {@link TeaModel}
     *
     * <p>GetThingModelStatusInnerResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Info")
        private String info;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private Long modifiedTime;

        @com.aliyun.core.annotation.NameInMap("OutTime")
        private Long outTime;

        @com.aliyun.core.annotation.NameInMap("ProductKey")
        private String productKey;

        @com.aliyun.core.annotation.NameInMap("RbacTenantId")
        private String rbacTenantId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        private Data(Builder builder) {
            this.info = builder.info;
            this.instanceId = builder.instanceId;
            this.modifiedTime = builder.modifiedTime;
            this.outTime = builder.outTime;
            this.productKey = builder.productKey;
            this.rbacTenantId = builder.rbacTenantId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return info
         */
        public String getInfo() {
            return this.info;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return outTime
         */
        public Long getOutTime() {
            return this.outTime;
        }

        /**
         * @return productKey
         */
        public String getProductKey() {
            return this.productKey;
        }

        /**
         * @return rbacTenantId
         */
        public String getRbacTenantId() {
            return this.rbacTenantId;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String info; 
            private String instanceId; 
            private Long modifiedTime; 
            private Long outTime; 
            private String productKey; 
            private String rbacTenantId; 
            private Integer status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.info = model.info;
                this.instanceId = model.instanceId;
                this.modifiedTime = model.modifiedTime;
                this.outTime = model.outTime;
                this.productKey = model.productKey;
                this.rbacTenantId = model.rbacTenantId;
                this.status = model.status;
            } 

            /**
             * Info.
             */
            public Builder info(String info) {
                this.info = info;
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
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * OutTime.
             */
            public Builder outTime(Long outTime) {
                this.outTime = outTime;
                return this;
            }

            /**
             * ProductKey.
             */
            public Builder productKey(String productKey) {
                this.productKey = productKey;
                return this;
            }

            /**
             * RbacTenantId.
             */
            public Builder rbacTenantId(String rbacTenantId) {
                this.rbacTenantId = rbacTenantId;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
