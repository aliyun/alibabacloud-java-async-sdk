// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link Lifecycle} extends {@link TeaModel}
 *
 * <p>Lifecycle</p>
 */
public class Lifecycle extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PostStart")
    private PostStart postStart;

    @com.aliyun.core.annotation.NameInMap("PreStop")
    private PreStop preStop;

    private Lifecycle(Builder builder) {
        this.postStart = builder.postStart;
        this.preStop = builder.preStop;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Lifecycle create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return postStart
     */
    public PostStart getPostStart() {
        return this.postStart;
    }

    /**
     * @return preStop
     */
    public PreStop getPreStop() {
        return this.preStop;
    }

    public static final class Builder {
        private PostStart postStart; 
        private PreStop preStop; 

        private Builder() {
        } 

        private Builder(Lifecycle model) {
            this.postStart = model.postStart;
            this.preStop = model.preStop;
        } 

        /**
         * PostStart.
         */
        public Builder postStart(PostStart postStart) {
            this.postStart = postStart;
            return this;
        }

        /**
         * PreStop.
         */
        public Builder preStop(PreStop preStop) {
            this.preStop = preStop;
            return this;
        }

        public Lifecycle build() {
            return new Lifecycle(this);
        } 

    } 

    /**
     * 
     * {@link Lifecycle} extends {@link TeaModel}
     *
     * <p>Lifecycle</p>
     */
    public static class Exec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private java.util.List<String> command;

        private Exec(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Exec create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public static final class Builder {
            private java.util.List<String> command; 

            private Builder() {
            } 

            private Builder(Exec model) {
                this.command = model.command;
            } 

            /**
             * Command.
             */
            public Builder command(java.util.List<String> command) {
                this.command = command;
                return this;
            }

            public Exec build() {
                return new Exec(this);
            } 

        } 

    }
    /**
     * 
     * {@link Lifecycle} extends {@link TeaModel}
     *
     * <p>Lifecycle</p>
     */
    public static class PostStart extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exec")
        private Exec exec;

        private PostStart(Builder builder) {
            this.exec = builder.exec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PostStart create() {
            return builder().build();
        }

        /**
         * @return exec
         */
        public Exec getExec() {
            return this.exec;
        }

        public static final class Builder {
            private Exec exec; 

            private Builder() {
            } 

            private Builder(PostStart model) {
                this.exec = model.exec;
            } 

            /**
             * Exec.
             */
            public Builder exec(Exec exec) {
                this.exec = exec;
                return this;
            }

            public PostStart build() {
                return new PostStart(this);
            } 

        } 

    }
    /**
     * 
     * {@link Lifecycle} extends {@link TeaModel}
     *
     * <p>Lifecycle</p>
     */
    public static class PreStopExec extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private java.util.List<String> command;

        private PreStopExec(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreStopExec create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public java.util.List<String> getCommand() {
            return this.command;
        }

        public static final class Builder {
            private java.util.List<String> command; 

            private Builder() {
            } 

            private Builder(PreStopExec model) {
                this.command = model.command;
            } 

            /**
             * Command.
             */
            public Builder command(java.util.List<String> command) {
                this.command = command;
                return this;
            }

            public PreStopExec build() {
                return new PreStopExec(this);
            } 

        } 

    }
    /**
     * 
     * {@link Lifecycle} extends {@link TeaModel}
     *
     * <p>Lifecycle</p>
     */
    public static class PreStop extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exec")
        private PreStopExec exec;

        private PreStop(Builder builder) {
            this.exec = builder.exec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreStop create() {
            return builder().build();
        }

        /**
         * @return exec
         */
        public PreStopExec getExec() {
            return this.exec;
        }

        public static final class Builder {
            private PreStopExec exec; 

            private Builder() {
            } 

            private Builder(PreStop model) {
                this.exec = model.exec;
            } 

            /**
             * Exec.
             */
            public Builder exec(PreStopExec exec) {
                this.exec = exec;
                return this;
            }

            public PreStop build() {
                return new PreStop(this);
            } 

        } 

    }
}
