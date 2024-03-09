// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoTrialCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHpoTrialCommandsResponseBody</p>
 */
public class ListHpoTrialCommandsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Commands")
    private java.util.List < Commands> commands;

    @NameInMap("Detail")
    private java.util.Map < String, String > detail;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private ListHpoTrialCommandsResponseBody(Builder builder) {
        this.code = builder.code;
        this.commands = builder.commands;
        this.detail = builder.detail;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHpoTrialCommandsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return commands
     */
    public java.util.List < Commands> getCommands() {
        return this.commands;
    }

    /**
     * @return detail
     */
    public java.util.Map < String, String > getDetail() {
        return this.detail;
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
        private java.util.List < Commands> commands; 
        private java.util.Map < String, String > detail; 
        private String message; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Commands.
         */
        public Builder commands(java.util.List < Commands> commands) {
            this.commands = commands;
            return this;
        }

        /**
         * Detail.
         */
        public Builder detail(java.util.Map < String, String > detail) {
            this.detail = detail;
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

        public ListHpoTrialCommandsResponseBody build() {
            return new ListHpoTrialCommandsResponseBody(this);
        } 

    } 

    public static class Commands extends TeaModel {
        @NameInMap("Command")
        private String command;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("Output")
        private String output;

        private Commands(Builder builder) {
            this.command = builder.command;
            this.id = builder.id;
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Commands create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private String command; 
            private Integer id; 
            private String output; 

            /**
             * Command.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public Commands build() {
                return new Commands(this);
            } 

        } 

    }
}
