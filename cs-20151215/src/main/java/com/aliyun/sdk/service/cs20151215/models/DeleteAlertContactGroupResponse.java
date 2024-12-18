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
 * {@link DeleteAlertContactGroupResponse} extends {@link TeaModel}
 *
 * <p>DeleteAlertContactGroupResponse</p>
 */
public class DeleteAlertContactGroupResponse extends Response {
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.NameInMap("statusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<DeleteAlertContactGroupResponseBody> body;

    private DeleteAlertContactGroupResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static DeleteAlertContactGroupResponse create() {
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
    public java.util.List<DeleteAlertContactGroupResponseBody> getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteAlertContactGroupResponse, Builder> {

        Builder headers(java.util.Map<String, String> headers);

        Builder statusCode(Integer statusCode);

        Builder body(java.util.List<DeleteAlertContactGroupResponseBody> body);

        @Override
        DeleteAlertContactGroupResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteAlertContactGroupResponse, Builder>
            implements Builder {
        private java.util.Map<String, String> headers; 
        private Integer statusCode; 
        private java.util.List<DeleteAlertContactGroupResponseBody> body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteAlertContactGroupResponse response) {
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
        public Builder body(java.util.List<DeleteAlertContactGroupResponseBody> body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteAlertContactGroupResponse build() {
            return new DeleteAlertContactGroupResponse(this);
        } 

    } 

    /**
     * 
     * {@link DeleteAlertContactGroupResponse} extends {@link TeaModel}
     *
     * <p>DeleteAlertContactGroupResponse</p>
     */
    public static class DeleteAlertContactGroupResponseBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("status")
        private Boolean status;

        @com.aliyun.core.annotation.NameInMap("msg")
        private String msg;

        @com.aliyun.core.annotation.NameInMap("contact_group_id")
        private String contactGroupId;

        private DeleteAlertContactGroupResponseBody(Builder builder) {
            this.status = builder.status;
            this.msg = builder.msg;
            this.contactGroupId = builder.contactGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeleteAlertContactGroupResponseBody create() {
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
         * @return contactGroupId
         */
        public String getContactGroupId() {
            return this.contactGroupId;
        }

        public static final class Builder {
            private Boolean status; 
            private String msg; 
            private String contactGroupId; 

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
             * contact_group_id.
             */
            public Builder contactGroupId(String contactGroupId) {
                this.contactGroupId = contactGroupId;
                return this;
            }

            public DeleteAlertContactGroupResponseBody build() {
                return new DeleteAlertContactGroupResponseBody(this);
            } 

        } 

    }
}
