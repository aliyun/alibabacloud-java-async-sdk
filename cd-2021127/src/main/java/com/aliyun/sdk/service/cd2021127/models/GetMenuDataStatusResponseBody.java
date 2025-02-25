// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link GetMenuDataStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetMenuDataStatusResponseBody</p>
 */
public class GetMenuDataStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BatchId")
    private String batchId;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Failed")
    private Long failed;

    @com.aliyun.core.annotation.NameInMap("FailedProductContainerList")
    private java.util.List<String> failedProductContainerList;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("ProductContainerId")
    private String productContainerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private GetMenuDataStatusResponseBody(Builder builder) {
        this.batchId = builder.batchId;
        this.code = builder.code;
        this.failed = builder.failed;
        this.failedProductContainerList = builder.failedProductContainerList;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.productContainerId = builder.productContainerId;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMenuDataStatusResponseBody create() {
        return builder().build();
    }

    /**
     * @return batchId
     */
    public String getBatchId() {
        return this.batchId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return failed
     */
    public Long getFailed() {
        return this.failed;
    }

    /**
     * @return failedProductContainerList
     */
    public java.util.List<String> getFailedProductContainerList() {
        return this.failedProductContainerList;
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
     * @return productContainerId
     */
    public String getProductContainerId() {
        return this.productContainerId;
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

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String batchId; 
        private String code; 
        private Long failed; 
        private java.util.List<String> failedProductContainerList; 
        private Integer httpStatusCode; 
        private String message; 
        private String productContainerId; 
        private String requestId; 
        private Boolean success; 
        private Long total; 

        /**
         * BatchId.
         */
        public Builder batchId(String batchId) {
            this.batchId = batchId;
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
         * Failed.
         */
        public Builder failed(Long failed) {
            this.failed = failed;
            return this;
        }

        /**
         * FailedProductContainerList.
         */
        public Builder failedProductContainerList(java.util.List<String> failedProductContainerList) {
            this.failedProductContainerList = failedProductContainerList;
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
         * ProductContainerId.
         */
        public Builder productContainerId(String productContainerId) {
            this.productContainerId = productContainerId;
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

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetMenuDataStatusResponseBody build() {
            return new GetMenuDataStatusResponseBody(this);
        } 

    } 

}
