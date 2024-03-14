// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewayActionsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeGatewayActionsResponseBody</p>
 */
public class DescribeGatewayActionsResponseBody extends TeaModel {
    @NameInMap("Actions")
    private Actions actions;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeGatewayActionsResponseBody(Builder builder) {
        this.actions = builder.actions;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewayActionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return actions
     */
    public Actions getActions() {
        return this.actions;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Actions actions; 
        private String code; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Actions.
         */
        public Builder actions(Actions actions) {
            this.actions = actions;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeGatewayActionsResponseBody build() {
            return new DescribeGatewayActionsResponseBody(this);
        } 

    } 

    public static class Action extends TeaModel {
        @NameInMap("AdLdap")
        private String adLdap;

        @NameInMap("Cache")
        private String cache;

        @NameInMap("Disk")
        private String disk;

        @NameInMap("GatewayId")
        private String gatewayId;

        @NameInMap("Monitor")
        private String monitor;

        @NameInMap("Self")
        private String self;

        @NameInMap("SmbUser")
        private String smbUser;

        @NameInMap("Target")
        private String target;

        private Action(Builder builder) {
            this.adLdap = builder.adLdap;
            this.cache = builder.cache;
            this.disk = builder.disk;
            this.gatewayId = builder.gatewayId;
            this.monitor = builder.monitor;
            this.self = builder.self;
            this.smbUser = builder.smbUser;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Action create() {
            return builder().build();
        }

        /**
         * @return adLdap
         */
        public String getAdLdap() {
            return this.adLdap;
        }

        /**
         * @return cache
         */
        public String getCache() {
            return this.cache;
        }

        /**
         * @return disk
         */
        public String getDisk() {
            return this.disk;
        }

        /**
         * @return gatewayId
         */
        public String getGatewayId() {
            return this.gatewayId;
        }

        /**
         * @return monitor
         */
        public String getMonitor() {
            return this.monitor;
        }

        /**
         * @return self
         */
        public String getSelf() {
            return this.self;
        }

        /**
         * @return smbUser
         */
        public String getSmbUser() {
            return this.smbUser;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String adLdap; 
            private String cache; 
            private String disk; 
            private String gatewayId; 
            private String monitor; 
            private String self; 
            private String smbUser; 
            private String target; 

            /**
             * AdLdap.
             */
            public Builder adLdap(String adLdap) {
                this.adLdap = adLdap;
                return this;
            }

            /**
             * Cache.
             */
            public Builder cache(String cache) {
                this.cache = cache;
                return this;
            }

            /**
             * Disk.
             */
            public Builder disk(String disk) {
                this.disk = disk;
                return this;
            }

            /**
             * GatewayId.
             */
            public Builder gatewayId(String gatewayId) {
                this.gatewayId = gatewayId;
                return this;
            }

            /**
             * Monitor.
             */
            public Builder monitor(String monitor) {
                this.monitor = monitor;
                return this;
            }

            /**
             * Self.
             */
            public Builder self(String self) {
                this.self = self;
                return this;
            }

            /**
             * SmbUser.
             */
            public Builder smbUser(String smbUser) {
                this.smbUser = smbUser;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            public Action build() {
                return new Action(this);
            } 

        } 

    }
    public static class Actions extends TeaModel {
        @NameInMap("Action")
        private java.util.List < Action> action;

        private Actions(Builder builder) {
            this.action = builder.action;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public java.util.List < Action> getAction() {
            return this.action;
        }

        public static final class Builder {
            private java.util.List < Action> action; 

            /**
             * Action.
             */
            public Builder action(java.util.List < Action> action) {
                this.action = action;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
}
