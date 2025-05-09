// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DeleteAlertContactResponse} extends {@link TeaModel}
 *
 * <p>DeleteAlertContactResponse</p>
 */
public class DeleteAlertContactResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private DeleteAlertContactResponseBody body;

    private DeleteAlertContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteAlertContactResponse create() {
        return new BuilderImpl().build();
    }

@Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return body
     */
    public DeleteAlertContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAlertContactResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteAlertContactResponseBody body);

        @Override
        DeleteAlertContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAlertContactResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private DeleteAlertContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAlertContactResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        /**
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(DeleteAlertContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAlertContactResponse build() {
            return new DeleteAlertContactResponse(this);
        } 

    } 

    /**
     * 
     * {@link DeleteAlertContactResponse} extends {@link TeaModel}
     *
     * <p>DeleteAlertContactResponse</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private Boolean status;

        @com.aliyun.core.annotation.NameInMap("msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("contact_id")
        private String contactId;

        private Result(Builder builder) {
            this.status = builder.status;
            this.msg = builder.msg;
            this.contactId = builder.contactId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        /**
         * @return msg
         */
        public String getMsg() {
            return this.msg;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        public static final class Builder {
            private Boolean status; 
            private String msg; 
            private String contactId; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.status = model.status;
                this.msg = model.msg;
                this.contactId = model.contactId;
            } 

            /**
             * <p>The deletion status.</p>
             * <ul>
             * <li>true: The alert contact was deleted.</li>
             * <li>false: The alert contact failed to be deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The error message returned if the call fails.</p>
             * 
             * <strong>example:</strong>
             * <p>Delete contact resource failed.</p>
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * <p>An alert contact ID.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link DeleteAlertContactResponse} extends {@link TeaModel}
     *
     * <p>DeleteAlertContactResponse</p>
     */
    public static class DeleteAlertContactResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List<Result> result;

        private DeleteAlertContactResponseBody(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteAlertContactResponseBody create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List<Result> result; 

            private Builder() {
            } 

            private Builder(DeleteAlertContactResponseBody model) {
                this.result = model.result;
            } 

            /**
             * result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            public DeleteAlertContactResponseBody build() {
                return new DeleteAlertContactResponseBody(this);
            } 

        } 

    }
}
