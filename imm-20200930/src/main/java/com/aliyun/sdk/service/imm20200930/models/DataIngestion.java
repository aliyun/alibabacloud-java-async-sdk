// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link DataIngestion} extends {@link TeaModel}
 *
 * <p>DataIngestion</p>
 */
public class DataIngestion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Actions")
    private java.util.List<Actions> actions;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Error")
    private String error;

    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    @com.aliyun.core.annotation.NameInMap("Marker")
    private String marker;

    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("ServiceRole")
    private String serviceRole;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    @com.aliyun.core.annotation.NameInMap("Statistic")
    private Statistic statistic;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private DataIngestion(Builder builder) {
        this.actions = builder.actions;
        this.createTime = builder.createTime;
        this.error = builder.error;
        this.id = builder.id;
        this.input = builder.input;
        this.marker = builder.marker;
        this.notification = builder.notification;
        this.phase = builder.phase;
        this.serviceRole = builder.serviceRole;
        this.state = builder.state;
        this.statistic = builder.statistic;
        this.tags = builder.tags;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DataIngestion create() {
        return builder().build();
    }

    /**
     * @return actions
     */
    public java.util.List<Actions> getActions() {
        return this.actions;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return marker
     */
    public String getMarker() {
        return this.marker;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return serviceRole
     */
    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    /**
     * @return statistic
     */
    public Statistic getStatistic() {
        return this.statistic;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private java.util.List<Actions> actions; 
        private String createTime; 
        private String error; 
        private String id; 
        private Input input; 
        private String marker; 
        private Notification notification; 
        private String phase; 
        private String serviceRole; 
        private String state; 
        private Statistic statistic; 
        private java.util.Map<String, ?> tags; 
        private String updateTime; 

        /**
         * Actions.
         */
        public Builder actions(java.util.List<Actions> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Error.
         */
        public Builder error(String error) {
            this.error = error;
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
         * Input.
         */
        public Builder input(Input input) {
            this.input = input;
            return this;
        }

        /**
         * Marker.
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * Notification.
         */
        public Builder notification(Notification notification) {
            this.notification = notification;
            return this;
        }

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * ServiceRole.
         */
        public Builder serviceRole(String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        /**
         * State.
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * Statistic.
         */
        public Builder statistic(Statistic statistic) {
            this.statistic = statistic;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public DataIngestion build() {
            return new DataIngestion(this);
        } 

    } 

    /**
     * 
     * {@link DataIngestion} extends {@link TeaModel}
     *
     * <p>DataIngestion</p>
     */
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FastFailPolicy")
        private FastFailPolicy fastFailPolicy;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Parameters")
        private java.util.List<String> parameters;

        private Actions(Builder builder) {
            this.fastFailPolicy = builder.fastFailPolicy;
            this.name = builder.name;
            this.parameters = builder.parameters;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return fastFailPolicy
         */
        public FastFailPolicy getFastFailPolicy() {
            return this.fastFailPolicy;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parameters
         */
        public java.util.List<String> getParameters() {
            return this.parameters;
        }

        public static final class Builder {
            private FastFailPolicy fastFailPolicy; 
            private String name; 
            private java.util.List<String> parameters; 

            /**
             * FastFailPolicy.
             */
            public Builder fastFailPolicy(FastFailPolicy fastFailPolicy) {
                this.fastFailPolicy = fastFailPolicy;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Parameters.
             */
            public Builder parameters(java.util.List<String> parameters) {
                this.parameters = parameters;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataIngestion} extends {@link TeaModel}
     *
     * <p>DataIngestion</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("MNS")
        private MNS MNS;

        @com.aliyun.core.annotation.NameInMap("RocketMQ")
        private RocketMQ rocketMQ;

        @com.aliyun.core.annotation.NameInMap("Topic")
        private String topic;

        private Notification(Builder builder) {
            this.endpoint = builder.endpoint;
            this.MNS = builder.MNS;
            this.rocketMQ = builder.rocketMQ;
            this.topic = builder.topic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notification create() {
            return builder().build();
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return MNS
         */
        public MNS getMNS() {
            return this.MNS;
        }

        /**
         * @return rocketMQ
         */
        public RocketMQ getRocketMQ() {
            return this.rocketMQ;
        }

        /**
         * @return topic
         */
        public String getTopic() {
            return this.topic;
        }

        public static final class Builder {
            private String endpoint; 
            private MNS MNS; 
            private RocketMQ rocketMQ; 
            private String topic; 

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * MNS.
             */
            public Builder MNS(MNS MNS) {
                this.MNS = MNS;
                return this;
            }

            /**
             * RocketMQ.
             */
            public Builder rocketMQ(RocketMQ rocketMQ) {
                this.rocketMQ = rocketMQ;
                return this;
            }

            /**
             * Topic.
             */
            public Builder topic(String topic) {
                this.topic = topic;
                return this;
            }

            public Notification build() {
                return new Notification(this);
            } 

        } 

    }
    /**
     * 
     * {@link DataIngestion} extends {@link TeaModel}
     *
     * <p>DataIngestion</p>
     */
    public static class Statistic extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SkipFiles")
        private Long skipFiles;

        @com.aliyun.core.annotation.NameInMap("SubmitFailure")
        private Long submitFailure;

        @com.aliyun.core.annotation.NameInMap("SubmitSuccess")
        private Long submitSuccess;

        private Statistic(Builder builder) {
            this.skipFiles = builder.skipFiles;
            this.submitFailure = builder.submitFailure;
            this.submitSuccess = builder.submitSuccess;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistic create() {
            return builder().build();
        }

        /**
         * @return skipFiles
         */
        public Long getSkipFiles() {
            return this.skipFiles;
        }

        /**
         * @return submitFailure
         */
        public Long getSubmitFailure() {
            return this.submitFailure;
        }

        /**
         * @return submitSuccess
         */
        public Long getSubmitSuccess() {
            return this.submitSuccess;
        }

        public static final class Builder {
            private Long skipFiles; 
            private Long submitFailure; 
            private Long submitSuccess; 

            /**
             * SkipFiles.
             */
            public Builder skipFiles(Long skipFiles) {
                this.skipFiles = skipFiles;
                return this;
            }

            /**
             * SubmitFailure.
             */
            public Builder submitFailure(Long submitFailure) {
                this.submitFailure = submitFailure;
                return this;
            }

            /**
             * SubmitSuccess.
             */
            public Builder submitSuccess(Long submitSuccess) {
                this.submitSuccess = submitSuccess;
                return this;
            }

            public Statistic build() {
                return new Statistic(this);
            } 

        } 

    }
}
