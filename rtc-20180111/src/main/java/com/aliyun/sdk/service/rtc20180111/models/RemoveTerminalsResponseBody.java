// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
    private Terminals terminals;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return terminals
     */
    public Terminals getTerminals() {
        return this.terminals;
    }

    public static final class Builder {
        private String requestId; 
        private Terminals terminals; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Terminals.
         */
        public Builder terminals(Terminals terminals) {
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
    public static class Terminal extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private Integer code;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        private Terminal(Builder builder) {
            this.code = builder.code;
            this.id = builder.id;
            this.message = builder.message;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Terminal create() {
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

            /**
             * Code.
             */
            public Builder code(Integer code) {
                this.code = code;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            public Terminal build() {
                return new Terminal(this);
            } 

        } 

    }
    /**
     * 
     * {@link RemoveTerminalsResponseBody} extends {@link TeaModel}
     *
     * <p>RemoveTerminalsResponseBody</p>
     */
    public static class Terminals extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Terminal")
        private java.util.List<Terminal> terminal;

        private Terminals(Builder builder) {
            this.terminal = builder.terminal;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Terminals create() {
            return builder().build();
        }

        /**
         * @return terminal
         */
        public java.util.List<Terminal> getTerminal() {
            return this.terminal;
        }

        public static final class Builder {
            private java.util.List<Terminal> terminal; 

            /**
             * Terminal.
             */
            public Builder terminal(java.util.List<Terminal> terminal) {
                this.terminal = terminal;
                return this;
            }

            public Terminals build() {
                return new Terminals(this);
            } 

        } 

    }
}
