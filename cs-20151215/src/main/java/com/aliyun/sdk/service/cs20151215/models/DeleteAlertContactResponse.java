// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertContactResponse} extends {@link TeaModel}
 *
 * <p>DeleteAlertContactResponse</p>
 */
public class DeleteAlertContactResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    @NameInMap("body")
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
    public DeleteAlertContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAlertContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        Builder body(DeleteAlertContactResponseBody body);

        @Override
        DeleteAlertContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAlertContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
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
        public Builder body(DeleteAlertContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAlertContactResponse build() {
            return new DeleteAlertContactResponse(this);
        } 

    } 

    public static class BodyBody extends TeaModel {
        @NameInMap("status")
        private Boolean status;

        @NameInMap("msg")
        private String msg;

        @NameInMap("contact_id")
        private String contactId;

        private BodyBody(Builder builder) {
            this.status = builder.status;
            this.msg = builder.msg;
            this.contactId = builder.contactId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BodyBody create() {
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

            public BodyBody build() {
                return new BodyBody(this);
            } 

        } 

    }
    public static class DeleteAlertContactResponseBody extends TeaModel {
        @NameInMap("body")
        private java.util.List < BodyBody> body;

        private DeleteAlertContactResponseBody(Builder builder) {
            this.body = builder.body;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteAlertContactResponseBody create() {
            return builder().build();
        }

        /**
         * @return body
         */
        public java.util.List < BodyBody> getBody() {
            return this.body;
        }

        public static final class Builder {
            private java.util.List < BodyBody> body; 

            /**
             * body.
             */
            public Builder body(java.util.List < BodyBody> body) {
                this.body = body;
                return this;
            }

            public DeleteAlertContactResponseBody build() {
                return new DeleteAlertContactResponseBody(this);
            } 

        } 

    }
}
