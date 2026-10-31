// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CreateRectifyFlowResponseBody} extends {@link TeaModel}
 *
 * <p>CreateRectifyFlowResponseBody</p>
 */
public class CreateRectifyFlowResponseBody extends TeaModel {
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

    private CreateRectifyFlowResponseBody(Builder builder) {
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

    public static CreateRectifyFlowResponseBody create() {
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

        private Builder(CreateRectifyFlowResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The backend response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The operation result.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The backend exception details.</p>
         * 
         * <strong>example:</strong>
         * <p>internal error</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public CreateRectifyFlowResponseBody build() {
            return new CreateRectifyFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateRectifyFlowResponseBody} extends {@link TeaModel}
     *
     * <p>CreateRectifyFlowResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProcessedIssueCount")
        private Long processedIssueCount;

        @com.aliyun.core.annotation.NameInMap("RectifyIds")
        private java.util.List<Long> rectifyIds;

        private Data(Builder builder) {
            this.processedIssueCount = builder.processedIssueCount;
            this.rectifyIds = builder.rectifyIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return processedIssueCount
         */
        public Long getProcessedIssueCount() {
            return this.processedIssueCount;
        }

        /**
         * @return rectifyIds
         */
        public java.util.List<Long> getRectifyIds() {
            return this.rectifyIds;
        }

        public static final class Builder {
            private Long processedIssueCount; 
            private java.util.List<Long> rectifyIds; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.processedIssueCount = model.processedIssueCount;
                this.rectifyIds = model.rectifyIds;
            } 

            /**
             * <p>The actual number of deduplicated issues successfully included in this operation. Skipped issues and historical issues of the original process are excluded. Issues brought in by scope expansion are included.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder processedIssueCount(Long processedIssueCount) {
                this.processedIssueCount = processedIssueCount;
                return this;
            }

            /**
             * <p>The list of process IDs for this operation.</p>
             */
            public Builder rectifyIds(java.util.List<Long> rectifyIds) {
                this.rectifyIds = rectifyIds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
