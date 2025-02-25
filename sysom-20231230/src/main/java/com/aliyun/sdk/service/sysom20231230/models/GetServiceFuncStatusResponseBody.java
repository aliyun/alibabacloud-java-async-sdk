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
 * {@link GetServiceFuncStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceFuncStatusResponseBody</p>
 */
public class GetServiceFuncStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetServiceFuncStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceFuncStatusResponseBody create() {
        return builder().build();
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

        /**
         * code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetServiceFuncStatusResponseBody build() {
            return new GetServiceFuncStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceFuncStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceFuncStatusResponseBody</p>
     */
    public static class Args extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("add_cmd")
        private String addCmd;

        @com.aliyun.core.annotation.NameInMap("cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("java_store_path")
        private String javaStorePath;

        @com.aliyun.core.annotation.NameInMap("locks")
        private String locks;

        @com.aliyun.core.annotation.NameInMap("loop")
        private Integer loop;

        @com.aliyun.core.annotation.NameInMap("mem")
        private String mem;

        @com.aliyun.core.annotation.NameInMap("system_profiling")
        private String systemProfiling;

        private Args(Builder builder) {
            this.addCmd = builder.addCmd;
            this.cpu = builder.cpu;
            this.javaStorePath = builder.javaStorePath;
            this.locks = builder.locks;
            this.loop = builder.loop;
            this.mem = builder.mem;
            this.systemProfiling = builder.systemProfiling;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Args create() {
            return builder().build();
        }

        /**
         * @return addCmd
         */
        public String getAddCmd() {
            return this.addCmd;
        }

        /**
         * @return cpu
         */
        public String getCpu() {
            return this.cpu;
        }

        /**
         * @return javaStorePath
         */
        public String getJavaStorePath() {
            return this.javaStorePath;
        }

        /**
         * @return locks
         */
        public String getLocks() {
            return this.locks;
        }

        /**
         * @return loop
         */
        public Integer getLoop() {
            return this.loop;
        }

        /**
         * @return mem
         */
        public String getMem() {
            return this.mem;
        }

        /**
         * @return systemProfiling
         */
        public String getSystemProfiling() {
            return this.systemProfiling;
        }

        public static final class Builder {
            private String addCmd; 
            private String cpu; 
            private String javaStorePath; 
            private String locks; 
            private Integer loop; 
            private String mem; 
            private String systemProfiling; 

            /**
             * add_cmd.
             */
            public Builder addCmd(String addCmd) {
                this.addCmd = addCmd;
                return this;
            }

            /**
             * cpu.
             */
            public Builder cpu(String cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * java_store_path.
             */
            public Builder javaStorePath(String javaStorePath) {
                this.javaStorePath = javaStorePath;
                return this;
            }

            /**
             * locks.
             */
            public Builder locks(String locks) {
                this.locks = locks;
                return this;
            }

            /**
             * loop.
             */
            public Builder loop(Integer loop) {
                this.loop = loop;
                return this;
            }

            /**
             * mem.
             */
            public Builder mem(String mem) {
                this.mem = mem;
                return this;
            }

            /**
             * system_profiling.
             */
            public Builder systemProfiling(String systemProfiling) {
                this.systemProfiling = systemProfiling;
                return this;
            }

            public Args build() {
                return new Args(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetServiceFuncStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceFuncStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("args")
        private Args args;

        private Data(Builder builder) {
            this.args = builder.args;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public Args getArgs() {
            return this.args;
        }

        public static final class Builder {
            private Args args; 

            /**
             * args.
             */
            public Builder args(Args args) {
                this.args = args;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
