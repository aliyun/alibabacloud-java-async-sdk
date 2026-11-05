// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link DeleteCopilotSessionResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteCopilotSessionResponseBody</p>
 */
public class DeleteCopilotSessionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private DeleteCopilotSessionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteCopilotSessionResponseBody create() {
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DeleteCopilotSessionResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The status code.</p>
         * <ul>
         * <li>If <code>code</code> is <code>Success</code>, the authorization is successful.</li>
         * <li>Other status codes indicate that the authorization failed. If the authorization fails, check the <code>message</code> field for the detailed fault message.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned when the code is not Success.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID, which can be used for end-to-end diagnostics.</p>
         * 
         * <strong>example:</strong>
         * <p>5BC79EF5-798B-5499-9683-4E14EBBBF712</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteCopilotSessionResponseBody build() {
            return new DeleteCopilotSessionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DeleteCopilotSessionResponseBody} extends {@link TeaModel}
     *
     * <p>DeleteCopilotSessionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("deleted")
        private Boolean deleted;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        private Data(Builder builder) {
            this.deleted = builder.deleted;
            this.sessionId = builder.sessionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return deleted
         */
        public Boolean getDeleted() {
            return this.deleted;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        public static final class Builder {
            private Boolean deleted; 
            private String sessionId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.deleted = model.deleted;
                this.sessionId = model.sessionId;
            } 

            /**
             * <p>Indicates whether the session was deleted.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder deleted(Boolean deleted) {
                this.deleted = deleted;
                return this;
            }

            /**
             * <p>The ID of the deleted session.</p>
             * 
             * <strong>example:</strong>
             * <p>c356bc310e4345c3a602a2912322ad21</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
