// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.safconsole20250521.models;

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
 * {@link DescribeCustomerModuleBasicInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomerModuleBasicInfoResponseBody</p>
 */
public class DescribeCustomerModuleBasicInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Long httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultObject")
    private ResultObject resultObject;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeCustomerModuleBasicInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomerModuleBasicInfoResponseBody create() {
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
     * @return httpStatusCode
     */
    public Long getHttpStatusCode() {
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
     * @return resultObject
     */
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Long httpStatusCode; 
        private String message; 
        private String requestId; 
        private ResultObject resultObject; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeCustomerModuleBasicInfoResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
            this.success = model.success;
        } 

        /**
         * <p>Status code. A return value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Long httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Return message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>055f1546-f465-4c92-a2da-bfb86abe6f56</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned result.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        /**
         * <p>Indicates whether the application configuration information was successfully retrieved. Possible values: true: Success; false: Failure.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCustomerModuleBasicInfoResponseBody build() {
            return new DescribeCustomerModuleBasicInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomerModuleBasicInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomerModuleBasicInfoResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomerModuleName")
        private String customerModuleName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("InnerModuleName")
        private String innerModuleName;

        @com.aliyun.core.annotation.NameInMap("ModuleType")
        private String moduleType;

        @com.aliyun.core.annotation.NameInMap("StorePath")
        private String storePath;

        private ResultObject(Builder builder) {
            this.customerModuleName = builder.customerModuleName;
            this.description = builder.description;
            this.innerModuleName = builder.innerModuleName;
            this.moduleType = builder.moduleType;
            this.storePath = builder.storePath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return customerModuleName
         */
        public String getCustomerModuleName() {
            return this.customerModuleName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return innerModuleName
         */
        public String getInnerModuleName() {
            return this.innerModuleName;
        }

        /**
         * @return moduleType
         */
        public String getModuleType() {
            return this.moduleType;
        }

        /**
         * @return storePath
         */
        public String getStorePath() {
            return this.storePath;
        }

        public static final class Builder {
            private String customerModuleName; 
            private String description; 
            private String innerModuleName; 
            private String moduleType; 
            private String storePath; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.customerModuleName = model.customerModuleName;
                this.description = model.description;
                this.innerModuleName = model.innerModuleName;
                this.moduleType = model.moduleType;
                this.storePath = model.storePath;
            } 

            /**
             * <p>Customer model name.</p>
             * 
             * <strong>example:</strong>
             * <p>ModuleName</p>
             */
            public Builder customerModuleName(String customerModuleName) {
                this.customerModuleName = customerModuleName;
                return this;
            }

            /**
             * <p>Remarks.</p>
             * 
             * <strong>example:</strong>
             * <p>备注。</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Model identifier.</p>
             * 
             * <strong>example:</strong>
             * <p>ModuleName</p>
             */
            public Builder innerModuleName(String innerModuleName) {
                this.innerModuleName = innerModuleName;
                return this;
            }

            /**
             * <p>Module type.</p>
             * 
             * <strong>example:</strong>
             * <p>PMML</p>
             */
            public Builder moduleType(String moduleType) {
                this.moduleType = moduleType;
                return this;
            }

            /**
             * <p>Test address.</p>
             * 
             * <strong>example:</strong>
             * <p>model.pmml</p>
             */
            public Builder storePath(String storePath) {
                this.storePath = storePath;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
