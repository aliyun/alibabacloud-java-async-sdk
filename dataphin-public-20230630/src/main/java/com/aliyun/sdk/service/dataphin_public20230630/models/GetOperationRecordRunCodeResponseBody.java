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
 * {@link GetOperationRecordRunCodeResponseBody} extends {@link TeaModel}
 *
 * <p>GetOperationRecordRunCodeResponseBody</p>
 */
public class GetOperationRecordRunCodeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("OperationLogCodeResponse")
    private OperationLogCodeResponse operationLogCodeResponse;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetOperationRecordRunCodeResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.operationLogCodeResponse = builder.operationLogCodeResponse;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperationRecordRunCodeResponseBody create() {
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
     * @return operationLogCodeResponse
     */
    public OperationLogCodeResponse getOperationLogCodeResponse() {
        return this.operationLogCodeResponse;
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
        private Integer httpStatusCode; 
        private String message; 
        private OperationLogCodeResponse operationLogCodeResponse; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetOperationRecordRunCodeResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.operationLogCodeResponse = model.operationLogCodeResponse;
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
         * OperationLogCodeResponse.
         */
        public Builder operationLogCodeResponse(OperationLogCodeResponse operationLogCodeResponse) {
            this.operationLogCodeResponse = operationLogCodeResponse;
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

        public GetOperationRecordRunCodeResponseBody build() {
            return new GetOperationRecordRunCodeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOperationRecordRunCodeResponseBody} extends {@link TeaModel}
     *
     * <p>GetOperationRecordRunCodeResponseBody</p>
     */
    public static class OperationLogCodeResponse extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("OperatorId")
        private Integer operatorId;

        @com.aliyun.core.annotation.NameInMap("OperatorName")
        private String operatorName;

        @com.aliyun.core.annotation.NameInMap("SqlNum")
        private Integer sqlNum;

        private OperationLogCodeResponse(Builder builder) {
            this.code = builder.code;
            this.operatorId = builder.operatorId;
            this.operatorName = builder.operatorName;
            this.sqlNum = builder.sqlNum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationLogCodeResponse create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return operatorId
         */
        public Integer getOperatorId() {
            return this.operatorId;
        }

        /**
         * @return operatorName
         */
        public String getOperatorName() {
            return this.operatorName;
        }

        /**
         * @return sqlNum
         */
        public Integer getSqlNum() {
            return this.sqlNum;
        }

        public static final class Builder {
            private String code; 
            private Integer operatorId; 
            private String operatorName; 
            private Integer sqlNum; 

            private Builder() {
            } 

            private Builder(OperationLogCodeResponse model) {
                this.code = model.code;
                this.operatorId = model.operatorId;
                this.operatorName = model.operatorName;
                this.sqlNum = model.sqlNum;
            } 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * OperatorId.
             */
            public Builder operatorId(Integer operatorId) {
                this.operatorId = operatorId;
                return this;
            }

            /**
             * OperatorName.
             */
            public Builder operatorName(String operatorName) {
                this.operatorName = operatorName;
                return this;
            }

            /**
             * SqlNum.
             */
            public Builder sqlNum(Integer sqlNum) {
                this.sqlNum = sqlNum;
                return this;
            }

            public OperationLogCodeResponse build() {
                return new OperationLogCodeResponse(this);
            } 

        } 

    }
}
