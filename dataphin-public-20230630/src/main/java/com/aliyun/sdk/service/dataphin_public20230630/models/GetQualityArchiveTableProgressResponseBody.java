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
 * {@link GetQualityArchiveTableProgressResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualityArchiveTableProgressResponseBody</p>
 */
public class GetQualityArchiveTableProgressResponseBody extends TeaModel {
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

    private GetQualityArchiveTableProgressResponseBody(Builder builder) {
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

    public static GetQualityArchiveTableProgressResponseBody create() {
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

        private Builder(GetQualityArchiveTableProgressResponseBody model) {
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
         * <p>The asynchronous task progress details.</p>
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
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetQualityArchiveTableProgressResponseBody build() {
            return new GetQualityArchiveTableProgressResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetQualityArchiveTableProgressResponseBody} extends {@link TeaModel}
     *
     * <p>GetQualityArchiveTableProgressResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveTableId")
        private Long archiveTableId;

        @com.aliyun.core.annotation.NameInMap("ArchiveTableName")
        private String archiveTableName;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.archiveTableId = builder.archiveTableId;
            this.archiveTableName = builder.archiveTableName;
            this.errorMessage = builder.errorMessage;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return archiveTableId
         */
        public Long getArchiveTableId() {
            return this.archiveTableId;
        }

        /**
         * @return archiveTableName
         */
        public String getArchiveTableName() {
            return this.archiveTableName;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long archiveTableId; 
            private String archiveTableName; 
            private String errorMessage; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.archiveTableId = model.archiveTableId;
                this.archiveTableName = model.archiveTableName;
                this.errorMessage = model.errorMessage;
                this.status = model.status;
            } 

            /**
             * <p>The archived table ID. This parameter is returned after the task succeeds and can be used to switch the active table.</p>
             * 
             * <strong>example:</strong>
             * <p>88012</p>
             */
            public Builder archiveTableId(Long archiveTableId) {
                this.archiveTableId = archiveTableId;
                return this;
            }

            /**
             * <p>The full name of the archived table. This parameter is returned after the task succeeds. When creating a table, the name includes the automatically appended _exception_data suffix.</p>
             * 
             * <strong>example:</strong>
             * <p>Train.a01_reanme3_exception_data</p>
             */
            public Builder archiveTableName(String archiveTableName) {
                this.archiveTableName = archiveTableName;
                return this;
            }

            /**
             * <p>The reason for the task failure. This parameter is returned only when Status is FAILED.</p>
             * 
             * <strong>example:</strong>
             * <p>The archived table name already exists!</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>PROGRESS: In progress.</li>
             * <li>SUCCESS: Succeeded.</li>
             * <li>FAILED: Failed.</li>
             * <li>CANCEL: Canceled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SUCCESS</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
