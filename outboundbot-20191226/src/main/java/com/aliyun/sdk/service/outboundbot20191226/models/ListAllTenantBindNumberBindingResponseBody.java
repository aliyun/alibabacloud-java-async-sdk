// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllTenantBindNumberBindingResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllTenantBindNumberBindingResponseBody</p>
 */
public class ListAllTenantBindNumberBindingResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    public static class List extends TeaModel {
        @NameInMap("BillingType")
        private String billingType;

        @NameInMap("BindingId")
        private String bindingId;

        @NameInMap("InstanceNameList")
        private java.util.List < String > instanceNameList;

        @NameInMap("Number")
        private String number;

        @NameInMap("SerializedParams")
        private String serializedParams;

        @NameInMap("TrunkName")
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
        public java.util.List < String > getInstanceNameList() {
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
            private java.util.List < String > instanceNameList; 
            private String number; 
            private String serializedParams; 
            private String trunkName; 

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
            public Builder instanceNameList(java.util.List < String > instanceNameList) {
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
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

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
        public java.util.List < List> getList() {
            return this.list;
        }

        public static final class Builder {
            private java.util.List < List> list; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
