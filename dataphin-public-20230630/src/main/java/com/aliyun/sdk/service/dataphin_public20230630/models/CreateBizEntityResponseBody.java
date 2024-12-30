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
 * {@link CreateBizEntityResponseBody} extends {@link TeaModel}
 *
 * <p>CreateBizEntityResponseBody</p>
 */
public class CreateBizEntityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CreateResult")
    private CreateResult createResult;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private CreateBizEntityResponseBody(Builder builder) {
        this.code = builder.code;
        this.createResult = builder.createResult;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateBizEntityResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return createResult
     */
    public CreateResult getCreateResult() {
        return this.createResult;
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
        private CreateResult createResult; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CreateResult.
         */
        public Builder createResult(CreateResult createResult) {
            this.createResult = createResult;
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

        public CreateBizEntityResponseBody build() {
            return new CreateBizEntityResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateBizEntityResponseBody} extends {@link TeaModel}
     *
     * <p>CreateBizEntityResponseBody</p>
     */
    public static class CreateResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizEntityId")
        private Long bizEntityId;

        private CreateResult(Builder builder) {
            this.bizEntityId = builder.bizEntityId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateResult create() {
            return builder().build();
        }

        /**
         * @return bizEntityId
         */
        public Long getBizEntityId() {
            return this.bizEntityId;
        }

        public static final class Builder {
            private Long bizEntityId; 

            /**
             * BizEntityId.
             */
            public Builder bizEntityId(Long bizEntityId) {
                this.bizEntityId = bizEntityId;
                return this;
            }

            public CreateResult build() {
                return new CreateResult(this);
            } 

        } 

    }
}
