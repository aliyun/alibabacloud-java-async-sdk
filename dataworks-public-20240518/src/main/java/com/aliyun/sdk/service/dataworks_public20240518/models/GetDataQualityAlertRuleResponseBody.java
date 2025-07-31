// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link GetDataQualityAlertRuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataQualityAlertRuleResponseBody</p>
 */
public class GetDataQualityAlertRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DataQualityAlertRule")
    private DataQualityAlertRule dataQualityAlertRule;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataQualityAlertRuleResponseBody(Builder builder) {
        this.dataQualityAlertRule = builder.dataQualityAlertRule;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataQualityAlertRuleResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataQualityAlertRule
     */
    public DataQualityAlertRule getDataQualityAlertRule() {
        return this.dataQualityAlertRule;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DataQualityAlertRule dataQualityAlertRule; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataQualityAlertRuleResponseBody model) {
            this.dataQualityAlertRule = model.dataQualityAlertRule;
            this.requestId = model.requestId;
        } 

        /**
         * DataQualityAlertRule.
         */
        public Builder dataQualityAlertRule(DataQualityAlertRule dataQualityAlertRule) {
            this.dataQualityAlertRule = dataQualityAlertRule;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataQualityAlertRuleResponseBody build() {
            return new GetDataQualityAlertRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataQualityAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityAlertRuleResponseBody</p>
     */
    public static class Receivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        private String receiverType;

        @com.aliyun.core.annotation.NameInMap("ReceiverValues")
        private java.util.List<String> receiverValues;

        private Receivers(Builder builder) {
            this.extension = builder.extension;
            this.receiverType = builder.receiverType;
            this.receiverValues = builder.receiverValues;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Receivers create() {
            return builder().build();
        }

        /**
         * @return extension
         */
        public String getExtension() {
            return this.extension;
        }

        /**
         * @return receiverType
         */
        public String getReceiverType() {
            return this.receiverType;
        }

        /**
         * @return receiverValues
         */
        public java.util.List<String> getReceiverValues() {
            return this.receiverValues;
        }

        public static final class Builder {
            private String extension; 
            private String receiverType; 
            private java.util.List<String> receiverValues; 

            private Builder() {
            } 

            private Builder(Receivers model) {
                this.extension = model.extension;
                this.receiverType = model.receiverType;
                this.receiverValues = model.receiverValues;
            } 

            /**
             * Extension.
             */
            public Builder extension(String extension) {
                this.extension = extension;
                return this;
            }

            /**
             * ReceiverType.
             */
            public Builder receiverType(String receiverType) {
                this.receiverType = receiverType;
                return this;
            }

            /**
             * ReceiverValues.
             */
            public Builder receiverValues(java.util.List<String> receiverValues) {
                this.receiverValues = receiverValues;
                return this;
            }

            public Receivers build() {
                return new Receivers(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityAlertRuleResponseBody</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private java.util.List<String> channels;

        @com.aliyun.core.annotation.NameInMap("Receivers")
        private java.util.List<Receivers> receivers;

        private Notification(Builder builder) {
            this.channels = builder.channels;
            this.receivers = builder.receivers;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notification create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public java.util.List<String> getChannels() {
            return this.channels;
        }

        /**
         * @return receivers
         */
        public java.util.List<Receivers> getReceivers() {
            return this.receivers;
        }

        public static final class Builder {
            private java.util.List<String> channels; 
            private java.util.List<Receivers> receivers; 

            private Builder() {
            } 

            private Builder(Notification model) {
                this.channels = model.channels;
                this.receivers = model.receivers;
            } 

            /**
             * Channels.
             */
            public Builder channels(java.util.List<String> channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Receivers.
             */
            public Builder receivers(java.util.List<Receivers> receivers) {
                this.receivers = receivers;
                return this;
            }

            public Notification build() {
                return new Notification(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityAlertRuleResponseBody</p>
     */
    public static class Target extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Ids")
        private java.util.List<Long> ids;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Target(Builder builder) {
            this.ids = builder.ids;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Target create() {
            return builder().build();
        }

        /**
         * @return ids
         */
        public java.util.List<Long> getIds() {
            return this.ids;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Long> ids; 
            private String type; 

            private Builder() {
            } 

            private Builder(Target model) {
                this.ids = model.ids;
                this.type = model.type;
            } 

            /**
             * Ids.
             */
            public Builder ids(java.util.List<Long> ids) {
                this.ids = ids;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Target build() {
                return new Target(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataQualityAlertRuleResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataQualityAlertRuleResponseBody</p>
     */
    public static class DataQualityAlertRule extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Notification")
        private Notification notification;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Target")
        private Target target;

        private DataQualityAlertRule(Builder builder) {
            this.condition = builder.condition;
            this.id = builder.id;
            this.notification = builder.notification;
            this.projectId = builder.projectId;
            this.target = builder.target;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataQualityAlertRule create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return notification
         */
        public Notification getNotification() {
            return this.notification;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return target
         */
        public Target getTarget() {
            return this.target;
        }

        public static final class Builder {
            private String condition; 
            private Long id; 
            private Notification notification; 
            private Long projectId; 
            private Target target; 

            private Builder() {
            } 

            private Builder(DataQualityAlertRule model) {
                this.condition = model.condition;
                this.id = model.id;
                this.notification = model.notification;
                this.projectId = model.projectId;
                this.target = model.target;
            } 

            /**
             * Condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
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
             * ProjectId.
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Target.
             */
            public Builder target(Target target) {
                this.target = target;
                return this;
            }

            public DataQualityAlertRule build() {
                return new DataQualityAlertRule(this);
            } 

        } 

    }
}
