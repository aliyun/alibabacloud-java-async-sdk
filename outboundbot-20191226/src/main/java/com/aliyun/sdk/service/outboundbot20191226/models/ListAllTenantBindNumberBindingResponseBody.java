// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link ListAllTenantBindNumberBindingResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllTenantBindNumberBindingResponseBody</p>
 */
public class ListAllTenantBindNumberBindingResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAllTenantBindNumberBindingResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllTenantBindNumberBindingResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAllTenantBindNumberBindingResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAllTenantBindNumberBindingResponseBody build() {
            return new ListAllTenantBindNumberBindingResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAllTenantBindNumberBindingResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllTenantBindNumberBindingResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BillingType")
        private String billingType;

        @com.aliyun.core.annotation.NameInMap("BindingId")
        private String bindingId;

        @com.aliyun.core.annotation.NameInMap("InstanceNameList")
        private java.util.List<String> instanceNameList;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("SerializedParams")
        private String serializedParams;

        @com.aliyun.core.annotation.NameInMap("TrunkName")
        private String trunkName;

        private List(Builder builder) {
            this.billingType = builder.billingType;
            this.bindingId = builder.bindingId;
            this.instanceNameList = builder.instanceNameList;
            this.number = builder.number;
            this.serializedParams = builder.serializedParams;
            this.trunkName = builder.trunkName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return billingType
         */
        public String getBillingType() {
            return this.billingType;
        }

        /**
         * @return bindingId
         */
        public String getBindingId() {
            return this.bindingId;
        }

        /**
         * @return instanceNameList
         */
        public java.util.List<String> getInstanceNameList() {
            return this.instanceNameList;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return serializedParams
         */
        public String getSerializedParams() {
            return this.serializedParams;
        }

        /**
         * @return trunkName
         */
        public String getTrunkName() {
            return this.trunkName;
        }

        public static final class Builder {
            private String billingType; 
            private String bindingId; 
            private java.util.List<String> instanceNameList; 
            private String number; 
            private String serializedParams; 
            private String trunkName; 

            private Builder() {
            } 

            private Builder(List model) {
                this.billingType = model.billingType;
                this.bindingId = model.bindingId;
                this.instanceNameList = model.instanceNameList;
                this.number = model.number;
                this.serializedParams = model.serializedParams;
                this.trunkName = model.trunkName;
            } 

            /**
             * BillingType.
             */
            public Builder billingType(String billingType) {
                this.billingType = billingType;
                return this;
            }

            /**
             * BindingId.
             */
            public Builder bindingId(String bindingId) {
                this.bindingId = bindingId;
                return this;
            }

            /**
             * InstanceNameList.
             */
            public Builder instanceNameList(java.util.List<String> instanceNameList) {
                this.instanceNameList = instanceNameList;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * SerializedParams.
             */
            public Builder serializedParams(String serializedParams) {
                this.serializedParams = serializedParams;
                return this;
            }

            /**
             * TrunkName.
             */
            public Builder trunkName(String trunkName) {
                this.trunkName = trunkName;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAllTenantBindNumberBindingResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllTenantBindNumberBindingResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        private Data(Builder builder) {
            this.list = builder.list;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List<List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List<List> list; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
            } 

            /**
             * List.
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
