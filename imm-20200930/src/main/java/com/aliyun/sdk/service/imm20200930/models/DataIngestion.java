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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DataIngestion model) {
            this.actions = model.actions;
            this.createTime = model.createTime;
            this.error = model.error;
            this.id = model.id;
            this.input = model.input;
            this.marker = model.marker;
            this.notification = model.notification;
            this.phase = model.phase;
            this.serviceRole = model.serviceRole;
            this.state = model.state;
            this.statistic = model.statistic;
            this.tags = model.tags;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>A list of processing templates.</p>
         */
        public Builder actions(java.util.List<Actions> actions) {
            this.actions = actions;
            return this;
        }

        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-10T03:50:28Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>api returns error: SDKError: StatusCode: 404 Code: ResourceNotFound</p>
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * <p>The unique ID of the data ingestion.</p>
         * 
         * <strong>example:</strong>
         * <p>trigger-9f72636a-0f0c-4baf-ae78-38b27bfe****</p>
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * <p>The data source information.</p>
         */
        public Builder input(Input input) {
            this.input = input;
            return this;
        }

        /**
         * <p>The task execution position.</p>
         * 
         * <strong>example:</strong>
         * <p>MTIzNDU2Nzg6aW1tdGVzdDpleGFtcGxlYnVja2V0OmRhdGFzZXQwMDE6b3NzOi8vZXhhbXBsZWJ1Y2tldC9zYW1wbGVvYmplY3QxLmpw****</p>
         */
        public Builder marker(String marker) {
            this.marker = marker;
            return this;
        }

        /**
         * <p>The notification for task completion.</p>
         */
        public Builder notification(Notification notification) {
            this.notification = notification;
            return this;
        }

        /**
         * <p>The scanning phase.</p>
         * 
         * <strong>example:</strong>
         * <p>IncrementalScanning</p>
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * <p>The service authorization role.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunIMMBatchTriggerRole</p>
         */
        public Builder serviceRole(String serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }

        /**
         * <p>The state of the batch processing task:</p>
         * <ul>
         * <li><p>Ready: The task is ready. A newly created task is in the Ready state.</p>
         * </li>
         * <li><p>Running: The task is running. This is the state of a task that is executing normally.</p>
         * </li>
         * <li><p>Failed: The task failed. An error occurred during task execution, and the task cannot be automatically recovered.</p>
         * </li>
         * <li><p>Suspended: The task is paused.</p>
         * </li>
         * <li><p>Succeeded: The task is complete.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        /**
         * <p>The statistics information.</p>
         */
        public Builder statistic(Statistic statistic) {
            this.statistic = statistic;
            return this;
        }

        /**
         * <p>The task tags.</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            this.tags = tags;
            return this;
        }

        /**
         * <p>The time when the task was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-18T07:40:29Z</p>
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

            private Builder() {
            } 

            private Builder(Actions model) {
                this.fastFailPolicy = model.fastFailPolicy;
                this.name = model.name;
                this.parameters = model.parameters;
            } 

            /**
             * <p>The configuration of the fast-fail policy for data processing.</p>
             */
            public Builder fastFailPolicy(FastFailPolicy fastFailPolicy) {
                this.fastFailPolicy = fastFailPolicy;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>doc/convert</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The template parameters.</p>
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

            private Builder() {
            } 

            private Builder(Notification model) {
                this.endpoint = model.endpoint;
                this.MNS = model.MNS;
                this.rocketMQ = model.rocketMQ;
                this.topic = model.topic;
            } 

            /**
             * <p>The MNS Endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://1111111111.mns.cn-hangzhou.aliyuncs.com">http://1111111111.mns.cn-hangzhou.aliyuncs.com</a></p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>MNS</p>
             */
            public Builder MNS(MNS MNS) {
                this.MNS = MNS;
                return this;
            }

            /**
             * <p>RocketMQ</p>
             */
            public Builder rocketMQ(RocketMQ rocketMQ) {
                this.rocketMQ = rocketMQ;
                return this;
            }

            /**
             * <p>The MNS topic.</p>
             * 
             * <strong>example:</strong>
             * <p>topic1</p>
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

            private Builder() {
            } 

            private Builder(Statistic model) {
                this.skipFiles = model.skipFiles;
                this.submitFailure = model.submitFailure;
                this.submitSuccess = model.submitSuccess;
            } 

            /**
             * <p>The number of skipped files.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder skipFiles(Long skipFiles) {
                this.skipFiles = skipFiles;
                return this;
            }

            /**
             * <p>The number of failed submissions.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder submitFailure(Long submitFailure) {
                this.submitFailure = submitFailure;
                return this;
            }

            /**
             * <p>The number of successful submissions.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
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
