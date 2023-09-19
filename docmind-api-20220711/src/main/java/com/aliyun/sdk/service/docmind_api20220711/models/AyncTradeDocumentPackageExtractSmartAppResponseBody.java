// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.docmind_api20220711.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AyncTradeDocumentPackageExtractSmartAppResponseBody} extends {@link TeaModel}
 *
 * <p>AyncTradeDocumentPackageExtractSmartAppResponseBody</p>
 */
public class AyncTradeDocumentPackageExtractSmartAppResponseBody extends TeaModel {
    @NameInMap("Completed")
    private Boolean completed;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("Data")
    private Object data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    @NameInMap("Success")
    private Boolean success;

    private AyncTradeDocumentPackageExtractSmartAppResponseBody(Builder builder) {
        this.completed = builder.completed;
        this.createTime = builder.createTime;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AyncTradeDocumentPackageExtractSmartAppResponseBody create() {
        return builder().build();
    }

    /**
     * @return completed
     */
    public Boolean getCompleted() {
        return this.completed;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return data
     */
    public Object getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Boolean completed; 
        private String createTime; 
        private Object data; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        /**
         * Completed.
         */
        public Builder completed(Boolean completed) {
            this.completed = completed;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Object data) {
            this.data = data;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public AyncTradeDocumentPackageExtractSmartAppResponseBody build() {
            return new AyncTradeDocumentPackageExtractSmartAppResponseBody(this);
        } 

    } 

}
