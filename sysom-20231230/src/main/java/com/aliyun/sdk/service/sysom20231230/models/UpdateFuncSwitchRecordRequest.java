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
 * {@link UpdateFuncSwitchRecordRequest} extends {@link RequestModel}
 *
 * <p>UpdateFuncSwitchRecordRequest</p>
 */
public class UpdateFuncSwitchRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("channel")
    @com.aliyun.core.annotation.Validation(required = true)
    private String channel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("params")
    @com.aliyun.core.annotation.Validation(required = true)
    private Params params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("service_name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    private UpdateFuncSwitchRecordRequest(Builder builder) {
        super(builder);
        this.channel = builder.channel;
        this.params = builder.params;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFuncSwitchRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return params
     */
    public Params getParams() {
        return this.params;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<UpdateFuncSwitchRecordRequest, Builder> {
        private String channel; 
        private Params params; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFuncSwitchRecordRequest request) {
            super(request);
            this.channel = request.channel;
            this.params = request.params;
            this.serviceName = request.serviceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder channel(String channel) {
            this.putQueryParameter("channel", channel);
            this.channel = channel;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder params(Params params) {
            String paramsShrink = shrink(params, "params", "json");
            this.putQueryParameter("params", paramsShrink);
            this.params = params;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>livetrace</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("service_name", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public UpdateFuncSwitchRecordRequest build() {
            return new UpdateFuncSwitchRecordRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateFuncSwitchRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateFuncSwitchRecordRequest</p>
     */
    public static class Args extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("add_cmd")
        private String addCmd;

        @com.aliyun.core.annotation.NameInMap("cpu")
        private String cpu;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("java_store_path")
        private String javaStorePath;

        @com.aliyun.core.annotation.NameInMap("locks")
        private String locks;

        @com.aliyun.core.annotation.NameInMap("loop")
        private Integer loop;

        @com.aliyun.core.annotation.NameInMap("mem")
        private String mem;

        @com.aliyun.core.annotation.NameInMap("pid")
        private Integer pid;

        @com.aliyun.core.annotation.NameInMap("system_profiling")
        private String systemProfiling;

        private Args(Builder builder) {
            this.addCmd = builder.addCmd;
            this.cpu = builder.cpu;
            this.duration = builder.duration;
            this.javaStorePath = builder.javaStorePath;
            this.locks = builder.locks;
            this.loop = builder.loop;
            this.mem = builder.mem;
            this.pid = builder.pid;
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
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
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
         * @return pid
         */
        public Integer getPid() {
            return this.pid;
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
            private Integer duration; 
            private String javaStorePath; 
            private String locks; 
            private Integer loop; 
            private String mem; 
            private Integer pid; 
            private String systemProfiling; 

            private Builder() {
            } 

            private Builder(Args model) {
                this.addCmd = model.addCmd;
                this.cpu = model.cpu;
                this.duration = model.duration;
                this.javaStorePath = model.javaStorePath;
                this.locks = model.locks;
                this.loop = model.loop;
                this.mem = model.mem;
                this.pid = model.pid;
                this.systemProfiling = model.systemProfiling;
            } 

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
             * duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
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
             * pid.
             */
            public Builder pid(Integer pid) {
                this.pid = pid;
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
     * {@link UpdateFuncSwitchRecordRequest} extends {@link TeaModel}
     *
     * <p>UpdateFuncSwitchRecordRequest</p>
     */
    public static class Params extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("args")
        private Args args;

        @com.aliyun.core.annotation.NameInMap("function_name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String functionName;

        @com.aliyun.core.annotation.NameInMap("instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("op")
        private String op;

        @com.aliyun.core.annotation.NameInMap("region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("uid")
        private String uid;

        private Params(Builder builder) {
            this.args = builder.args;
            this.functionName = builder.functionName;
            this.instance = builder.instance;
            this.op = builder.op;
            this.region = builder.region;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Params create() {
            return builder().build();
        }

        /**
         * @return args
         */
        public Args getArgs() {
            return this.args;
        }

        /**
         * @return functionName
         */
        public String getFunctionName() {
            return this.functionName;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return op
         */
        public String getOp() {
            return this.op;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return uid
         */
        public String getUid() {
            return this.uid;
        }

        public static final class Builder {
            private Args args; 
            private String functionName; 
            private String instance; 
            private String op; 
            private String region; 
            private String uid; 

            private Builder() {
            } 

            private Builder(Params model) {
                this.args = model.args;
                this.functionName = model.functionName;
                this.instance = model.instance;
                this.op = model.op;
                this.region = model.region;
                this.uid = model.uid;
            } 

            /**
             * args.
             */
            public Builder args(Args args) {
                this.args = args;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>mullprof</p>
             */
            public Builder functionName(String functionName) {
                this.functionName = functionName;
                return this;
            }

            /**
             * instance.
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * op.
             */
            public Builder op(String op) {
                this.op = op;
                return this;
            }

            /**
             * region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(String uid) {
                this.uid = uid;
                return this;
            }

            public Params build() {
                return new Params(this);
            } 

        } 

    }
}
