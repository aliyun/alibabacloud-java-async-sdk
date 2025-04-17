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
 * {@link CreateTriggerRequest} extends {@link RequestModel}
 *
 * <p>CreateTriggerRequest</p>
 */
public class CreateTriggerRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Actions")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Actions> actions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Input")
    @com.aliyun.core.annotation.Validation(required = true)
    private Input input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Notification")
    private Notification notification;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceRole")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceRole;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.Map<String, ?> tags;

    private CreateTriggerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.actions = builder.actions;
        this.input = builder.input;
        this.notification = builder.notification;
        this.projectName = builder.projectName;
        this.serviceRole = builder.serviceRole;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTriggerRequest create() {
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
     * @return actions
     */
    public java.util.List<Actions> getActions() {
        return this.actions;
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return notification
     */
    public Notification getNotification() {
        return this.notification;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return serviceRole
     */
    public String getServiceRole() {
        return this.serviceRole;
    }

    /**
     * @return tags
     */
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public static final class Builder extends Request.Builder<CreateTriggerRequest, Builder> {
        private String regionId; 
        private java.util.List<Actions> actions; 
        private Input input; 
        private Notification notification; 
        private String projectName; 
        private String serviceRole; 
        private java.util.Map<String, ?> tags; 

        private Builder() {
            super();
        } 

        private Builder(CreateTriggerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.actions = request.actions;
            this.input = request.input;
            this.notification = request.notification;
            this.projectName = request.projectName;
            this.serviceRole = request.serviceRole;
            this.tags = request.tags;
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
         * <p>The templates.</p>
         * <p>This parameter is required.</p>
         */
        public Builder actions(java.util.List<Actions> actions) {
            String actionsShrink = shrink(actions, "Actions", "json");
            this.putBodyParameter("Actions", actionsShrink);
            this.actions = actions;
            return this;
        }

        /**
         * <p>The data source configurations.</p>
         * <p>This parameter is required.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putBodyParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The notification settings. The operation supports multiple messaging middleware options. For more information about notification messages, see Asynchronous message examples. You can use one of the following methods to receive notification messages:</p>
         * <p>In the region in which the IMM project is located, use EventBridge to receive task notifications. For more information, see IMM events. In the region in which the IMM project is located, configure a Simple Message Queue (SMQ) subscription to receive task notifications.</p>
         */
        public Builder notification(Notification notification) {
            String notificationShrink = shrink(notification, "Notification", "json");
            this.putBodyParameter("Notification", notificationShrink);
            this.notification = notification;
            return this;
        }

        /**
         * <p>The name of the project.<a href="~~478153~~"></a></p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The service role. IMM assumes the service role so that it can access resources in other cloud services, such as OSS. Default value: AliyunIMMBatchTriggerRole.</p>
         * <p>You can also create a custom service role in the RAM console and grant the required permissions to the role based on your business requirements. For more information, see <a href="https://help.aliyun.com/document_detail/116800.html">Create a regular service role</a> and <a href="https://help.aliyun.com/document_detail/116147.html">Grant permissions to a role</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AliyunIMMDefaultRole</p>
         */
        public Builder serviceRole(String serviceRole) {
            this.putBodyParameter("ServiceRole", serviceRole);
            this.serviceRole = serviceRole;
            return this;
        }

        /**
         * <p>The custom tags. You can search for or filter asynchronous tasks by custom tag.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;val&quot;}</p>
         */
        public Builder tags(java.util.Map<String, ?> tags) {
            String tagsShrink = shrink(tags, "Tags", "json");
            this.putBodyParameter("Tags", tagsShrink);
            this.tags = tags;
            return this;
        }

        @Override
        public CreateTriggerRequest build() {
            return new CreateTriggerRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTriggerRequest} extends {@link TeaModel}
     *
     * <p>CreateTriggerRequest</p>
     */
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FastFailPolicy")
        private FastFailPolicy fastFailPolicy;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The policy configurations for handling failures.</p>
             */
            public Builder fastFailPolicy(FastFailPolicy fastFailPolicy) {
                this.fastFailPolicy = fastFailPolicy;
                return this;
            }

            /**
             * <p>The name of the template.</p>
             * <p>This parameter is required.</p>
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
     * {@link CreateTriggerRequest} extends {@link TeaModel}
     *
     * <p>CreateTriggerRequest</p>
     */
    public static class Notification extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MNS")
        private MNS MNS;

        private Notification(Builder builder) {
            this.MNS = builder.MNS;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Notification create() {
            return builder().build();
        }

        /**
         * @return MNS
         */
        public MNS getMNS() {
            return this.MNS;
        }

        public static final class Builder {
            private MNS MNS; 

            private Builder() {
            } 

            private Builder(Notification model) {
                this.MNS = model.MNS;
            } 

            /**
             * <p>The SMQ notification settings.</p>
             */
            public Builder MNS(MNS MNS) {
                this.MNS = MNS;
                return this;
            }

            public Notification build() {
                return new Notification(this);
            } 

        } 

    }
}
