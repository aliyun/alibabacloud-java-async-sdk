// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link GetCustomerCategoryDictionaryResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomerCategoryDictionaryResponseBody</p>
 */
public class GetCustomerCategoryDictionaryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetCustomerCategoryDictionaryResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerCategoryDictionaryResponseBody create() {
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
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetCustomerCategoryDictionaryResponseBody model) {
            this.code = model.code;
            this.data = model.data;
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

        public GetCustomerCategoryDictionaryResponseBody build() {
            return new GetCustomerCategoryDictionaryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetCustomerCategoryDictionaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomerCategoryDictionaryResponseBody</p>
     */
    public static class EnumConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enumName")
        private String enumName;

        @com.aliyun.core.annotation.NameInMap("enumValue")
        private String enumValue;

        private EnumConfig(Builder builder) {
            this.enumName = builder.enumName;
            this.enumValue = builder.enumValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EnumConfig create() {
            return builder().build();
        }

        /**
         * @return enumName
         */
        public String getEnumName() {
            return this.enumName;
        }

        /**
         * @return enumValue
         */
        public String getEnumValue() {
            return this.enumValue;
        }

        public static final class Builder {
            private String enumName; 
            private String enumValue; 

            private Builder() {
            } 

            private Builder(EnumConfig model) {
                this.enumName = model.enumName;
                this.enumValue = model.enumValue;
            } 

            /**
             * enumName.
             */
            public Builder enumName(String enumName) {
                this.enumName = enumName;
                return this;
            }

            /**
             * enumValue.
             */
            public Builder enumValue(String enumValue) {
                this.enumValue = enumValue;
                return this;
            }

            public EnumConfig build() {
                return new EnumConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetCustomerCategoryDictionaryResponseBody} extends {@link TeaModel}
     *
     * <p>GetCustomerCategoryDictionaryResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EnumConfig")
        private java.util.List<EnumConfig> enumConfig;

        private Data(Builder builder) {
            this.enumConfig = builder.enumConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return enumConfig
         */
        public java.util.List<EnumConfig> getEnumConfig() {
            return this.enumConfig;
        }

        public static final class Builder {
            private java.util.List<EnumConfig> enumConfig; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.enumConfig = model.enumConfig;
            } 

            /**
             * EnumConfig.
             */
            public Builder enumConfig(java.util.List<EnumConfig> enumConfig) {
                this.enumConfig = enumConfig;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
