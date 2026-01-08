// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ListBindDmAccountResponseBody} extends {@link TeaModel}
 *
 * <p>ListBindDmAccountResponseBody</p>
 */
public class ListBindDmAccountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListBindDmAccountResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindDmAccountResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
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
    public java.util.List<Data> getData() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListBindDmAccountResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
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
        public Builder data(java.util.List<Data> data) {
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

        public ListBindDmAccountResponseBody build() {
            return new ListBindDmAccountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBindDmAccountResponseBody} extends {@link TeaModel}
     *
     * <p>ListBindDmAccountResponseBody</p>
     */
    public static class ExtendAttr extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("SendType")
        private String sendType;

        private ExtendAttr(Builder builder) {
            this.accountName = builder.accountName;
            this.sendType = builder.sendType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendAttr create() {
            return builder().build();
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return sendType
         */
        public String getSendType() {
            return this.sendType;
        }

        public static final class Builder {
            private String accountName; 
            private String sendType; 

            private Builder() {
            } 

            private Builder(ExtendAttr model) {
                this.accountName = model.accountName;
                this.sendType = model.sendType;
            } 

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * SendType.
             */
            public Builder sendType(String sendType) {
                this.sendType = sendType;
                return this;
            }

            public ExtendAttr build() {
                return new ExtendAttr(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListBindDmAccountResponseBody} extends {@link TeaModel}
     *
     * <p>ListBindDmAccountResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountCode")
        private String accountCode;

        @com.aliyun.core.annotation.NameInMap("ExtendAttr")
        private ExtendAttr extendAttr;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("InstanceName")
        private String instanceName;

        private Data(Builder builder) {
            this.accountCode = builder.accountCode;
            this.extendAttr = builder.extendAttr;
            this.instanceId = builder.instanceId;
            this.instanceName = builder.instanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountCode
         */
        public String getAccountCode() {
            return this.accountCode;
        }

        /**
         * @return extendAttr
         */
        public ExtendAttr getExtendAttr() {
            return this.extendAttr;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return instanceName
         */
        public String getInstanceName() {
            return this.instanceName;
        }

        public static final class Builder {
            private String accountCode; 
            private ExtendAttr extendAttr; 
            private String instanceId; 
            private String instanceName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.accountCode = model.accountCode;
                this.extendAttr = model.extendAttr;
                this.instanceId = model.instanceId;
                this.instanceName = model.instanceName;
            } 

            /**
             * AccountCode.
             */
            public Builder accountCode(String accountCode) {
                this.accountCode = accountCode;
                return this;
            }

            /**
             * ExtendAttr.
             */
            public Builder extendAttr(ExtendAttr extendAttr) {
                this.extendAttr = extendAttr;
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
             * InstanceName.
             */
            public Builder instanceName(String instanceName) {
                this.instanceName = instanceName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
