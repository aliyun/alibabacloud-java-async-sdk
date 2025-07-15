// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link RemoveTerminalsResponseBody} extends {@link TeaModel}
 *
 * <p>RemoveTerminalsResponseBody</p>
 */
public class RemoveTerminalsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Terminals")
    private java.util.List<Terminals> terminals;

    private RemoveTerminalsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.terminals = builder.terminals;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveTerminalsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return terminals
     */
    public java.util.List<Terminals> getTerminals() {
        return this.terminals;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Terminals> terminals; 

        private Builder() {
        } 

        private Builder(RemoveTerminalsResponseBody model) {
            this.requestId = model.requestId;
            this.terminals = model.terminals;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4AF8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the users.</p>
         */
        public Builder terminals(java.util.List<Terminals> terminals) {
            this.terminals = terminals;
            return this;
        }

        public RemoveTerminalsResponseBody build() {
            return new RemoveTerminalsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RemoveTerminalsResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveTerminalsResponseBody</p>
     */
    public static class Terminals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Terminals(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Terminals create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public Integer getCode() {
            return this.code;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        public static final class Builder {
            private Integer code; 
            private String id; 
            private String message; 

            private Builder() {
            } 

            private Builder(Terminals model) {
                this.code = model.code;
                this.id = model.id;
                this.message = model.message;
            } 

            /**
             * <p>The returned status code. A value of 0 indicates that the request is successful. If the request fails, an error message is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The ID of the user.</p>
             * 
             * <strong>example:</strong>
             * <p>1811****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The result of removing the specified users from the channel. Valid values:</p>
             * <ul>
             * <li>Success</li>
             * <li>Failed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Terminals build() {
                return new Terminals(this);
            } 

        } 

    }
}
