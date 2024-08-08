// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiautoml20220828.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHpoTrialCommandsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHpoTrialCommandsResponseBody</p>
 */
public class ListHpoTrialCommandsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Commands")
    private java.util.List < Commands> commands;

    @com.aliyun.core.annotation.NameInMap("Detail")
    private java.util.Map < String, String > detail;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * The status code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The list of commands.
         */
        public Builder commands(java.util.List < Commands> commands) {
            this.commands = commands;
            return this;
        }

        /**
         * Extra error information.
         */
        public Builder detail(java.util.Map < String, String > detail) {
            this.detail = detail;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
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
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("Output")
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
             * The command that you want to run.
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            /**
             * The id of the command.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The output of the above command
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
