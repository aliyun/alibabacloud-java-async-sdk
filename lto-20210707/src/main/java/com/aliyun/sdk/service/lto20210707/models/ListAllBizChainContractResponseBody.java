// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lto20210707.models;

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
 * {@link ListAllBizChainContractResponseBody} extends {@link TeaModel}
 *
 * <p>ListAllBizChainContractResponseBody</p>
 */
public class ListAllBizChainContractResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAllBizChainContractResponseBody(Builder builder) {
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

    public static ListAllBizChainContractResponseBody create() {
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
    public java.util.List<Data> getData() {
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
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAllBizChainContractResponseBody model) {
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
        public Builder data(java.util.List<Data> data) {
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

        public ListAllBizChainContractResponseBody build() {
            return new ListAllBizChainContractResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAllBizChainContractResponseBody} extends {@link TeaModel}
     *
     * <p>ListAllBizChainContractResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContractName")
        private String contractName;

        @com.aliyun.core.annotation.NameInMap("ContractTemplateId")
        private String contractTemplateId;

        @com.aliyun.core.annotation.NameInMap("InvokeType")
        private String invokeType;

        private Data(Builder builder) {
            this.contractName = builder.contractName;
            this.contractTemplateId = builder.contractTemplateId;
            this.invokeType = builder.invokeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return contractName
         */
        public String getContractName() {
            return this.contractName;
        }

        /**
         * @return contractTemplateId
         */
        public String getContractTemplateId() {
            return this.contractTemplateId;
        }

        /**
         * @return invokeType
         */
        public String getInvokeType() {
            return this.invokeType;
        }

        public static final class Builder {
            private String contractName; 
            private String contractTemplateId; 
            private String invokeType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.contractName = model.contractName;
                this.contractTemplateId = model.contractTemplateId;
                this.invokeType = model.invokeType;
            } 

            /**
             * ContractName.
             */
            public Builder contractName(String contractName) {
                this.contractName = contractName;
                return this;
            }

            /**
             * ContractTemplateId.
             */
            public Builder contractTemplateId(String contractTemplateId) {
                this.contractTemplateId = contractTemplateId;
                return this;
            }

            /**
             * InvokeType.
             */
            public Builder invokeType(String invokeType) {
                this.invokeType = invokeType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
