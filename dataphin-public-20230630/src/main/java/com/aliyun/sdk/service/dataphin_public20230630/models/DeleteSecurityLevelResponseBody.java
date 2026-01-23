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
 * {@link DeleteSecurityLevelResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteSecurityLevelResponseBody</p>
 */
public class DeleteSecurityLevelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DeleteResult")
    private DeleteResult deleteResult;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DeleteSecurityLevelResponseBody(Builder builder) {
        this.code = builder.code;
        this.deleteResult = builder.deleteResult;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSecurityLevelResponseBody create() {
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
     * @return deleteResult
     */
    public DeleteResult getDeleteResult() {
        return this.deleteResult;
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
        private DeleteResult deleteResult; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DeleteSecurityLevelResponseBody model) {
            this.code = model.code;
            this.deleteResult = model.deleteResult;
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
         * DeleteResult.
         */
        public Builder deleteResult(DeleteResult deleteResult) {
            this.deleteResult = deleteResult;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DeleteSecurityLevelResponseBody build() {
            return new DeleteSecurityLevelResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteSecurityLevelResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteSecurityLevelResponseBody</p>
     */
    public static class DeleteResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("RelatedClassifyIdList")
        private java.util.List<Long> relatedClassifyIdList;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private DeleteResult(Builder builder) {
            this.errorCode = builder.errorCode;
            this.relatedClassifyIdList = builder.relatedClassifyIdList;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteResult create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return relatedClassifyIdList
         */
        public java.util.List<Long> getRelatedClassifyIdList() {
            return this.relatedClassifyIdList;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private String errorCode; 
            private java.util.List<Long> relatedClassifyIdList; 
            private Boolean success; 

            private Builder() {
            } 

            private Builder(DeleteResult model) {
                this.errorCode = model.errorCode;
                this.relatedClassifyIdList = model.relatedClassifyIdList;
                this.success = model.success;
            } 

            /**
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * RelatedClassifyIdList.
             */
            public Builder relatedClassifyIdList(java.util.List<Long> relatedClassifyIdList) {
                this.relatedClassifyIdList = relatedClassifyIdList;
                return this;
            }

            /**
             * Success.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public DeleteResult build() {
                return new DeleteResult(this);
            } 

        } 

    }
}
