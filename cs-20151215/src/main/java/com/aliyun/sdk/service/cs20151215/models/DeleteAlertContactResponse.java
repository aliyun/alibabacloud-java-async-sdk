// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertContactResponse} extends {@link TeaModel}
 *
 * <p>DeleteAlertContactResponse</p>
 */
public class DeleteAlertContactResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map < String, String > headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List < DeleteAlertContactResponseBody> body;

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
    public java.util.Map < String, String > getHeaders() {
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
    public java.util.List < DeleteAlertContactResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAlertContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List < DeleteAlertContactResponseBody> body);

        @Override
        DeleteAlertContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAlertContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 
        private java.util.List < DeleteAlertContactResponseBody> body; 

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
        public Builder headers(java.util.Map < String, String > headers) {
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
        public Builder body(java.util.List < DeleteAlertContactResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAlertContactResponse build() {
            return new DeleteAlertContactResponse(this);
        } 

    } 

    public static class DeleteAlertContactResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private Boolean status;

        @com.aliyun.core.annotation.NameInMap("msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("contact_id")
        private String contactId;

        private DeleteAlertContactResponseBody(Builder builder) {
            this.status = builder.status;
            this.msg = builder.msg;
            this.contactId = builder.contactId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteAlertContactResponseBody create() {
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

            /**
             * status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * msg.
             */
            public Builder msg(String msg) {
                this.msg = msg;
                return this;
            }

            /**
             * contact_id.
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            public DeleteAlertContactResponseBody build() {
                return new DeleteAlertContactResponseBody(this);
            } 

        } 

    }
}
