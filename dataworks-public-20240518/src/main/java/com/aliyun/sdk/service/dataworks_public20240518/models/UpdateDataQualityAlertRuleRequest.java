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
 * {@link UpdateDataQualityAlertRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataQualityAlertRuleRequest</p>
 */
public class UpdateDataQualityAlertRuleRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Condition")
    private String condition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Target")
    private Target target;

    private UpdateDataQualityAlertRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.condition = builder.condition;
        this.id = builder.id;
        this.notification = builder.notification;
        this.projectId = builder.projectId;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataQualityAlertRuleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<UpdateDataQualityAlertRuleRequest, Builder> {
        private String regionId; 
        private String condition; 
        private Long id; 
        private Notification notification; 
        private Long projectId; 
        private Target target; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataQualityAlertRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.condition = request.condition;
            this.id = request.id;
            this.notification = request.notification;
            this.projectId = request.projectId;
            this.target = request.target;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Condition.
         */
        public Builder condition(String condition) {
            this.putBodyParameter("Condition", condition);
            this.condition = condition;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * Notification.
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putBodyParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * Target.
         */
        public Builder target(Target target) {
            String targetShrink = shrink(target, "Target", "json");
            this.putBodyParameter("Target", targetShrink);
            this.target = target;
            return this;
        }

        @Override
        public UpdateDataQualityAlertRuleRequest build() {
            return new UpdateDataQualityAlertRuleRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataQualityAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityAlertRuleRequest</p>
     */
    public static class Receivers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Extension")
        private String extension;

        @com.aliyun.core.annotation.NameInMap("ReceiverType")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>TaskOwner</p>
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
     * {@link UpdateDataQualityAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityAlertRuleRequest</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>This parameter is required.</p>
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
     * {@link UpdateDataQualityAlertRuleRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataQualityAlertRuleRequest</p>
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
}
