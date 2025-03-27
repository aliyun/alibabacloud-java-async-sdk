// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link GetUnionIdResponseBody} extends {@link TeaModel}
 *
 * <p>GetUnionIdResponseBody</p>
 */
public class GetUnionIdResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private java.util.List<Result> result;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Integer statusCode;

    private GetUnionIdResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUnionIdResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private java.util.List<Result> result; 
        private Integer statusCode; 

        private Builder() {
        } 

        private Builder(GetUnionIdResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.result = model.result;
            this.statusCode = model.statusCode;
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
         * Result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public GetUnionIdResponseBody build() {
            return new GetUnionIdResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUnionIdResponseBody} extends {@link TeaModel}
     *
     * <p>GetUnionIdResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OrganizationId")
        private String organizationId;

        @com.aliyun.core.annotation.NameInMap("UnionId")
        private String unionId;

        private Result(Builder builder) {
            this.organizationId = builder.organizationId;
            this.unionId = builder.unionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return organizationId
         */
        public String getOrganizationId() {
            return this.organizationId;
        }

        /**
         * @return unionId
         */
        public String getUnionId() {
            return this.unionId;
        }

        public static final class Builder {
            private String organizationId; 
            private String unionId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.organizationId = model.organizationId;
                this.unionId = model.unionId;
            } 

            /**
             * OrganizationId.
             */
            public Builder organizationId(String organizationId) {
                this.organizationId = organizationId;
                return this;
            }

            /**
             * UnionId.
             */
            public Builder unionId(String unionId) {
                this.unionId = unionId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
