// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchExportConfigurationsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchExportConfigurationsResponseBody</p>
 */
public class BatchExportConfigurationsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("FileUrl")
    private String fileUrl;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private BatchExportConfigurationsResponseBody(Builder builder) {
        this.code = builder.code;
        this.fileUrl = builder.fileUrl;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchExportConfigurationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return fileUrl
     */
    public String getFileUrl() {
        return this.fileUrl;
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
        private String code; 
        private String fileUrl; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * FileUrl.
         */
        public Builder fileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
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

        public BatchExportConfigurationsResponseBody build() {
            return new BatchExportConfigurationsResponseBody(this);
        } 

    } 

}
