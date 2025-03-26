// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link CreateRCDeploymentSetRequest} extends {@link RequestModel}
 *
 * <p>CreateRCDeploymentSetRequest</p>
 */
public class CreateRCDeploymentSetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeploymentSetName")
    private String deploymentSetName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupCount")
    private Long groupCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnUnableToRedeployFailedInstance")
    private String onUnableToRedeployFailedInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Strategy")
    private String strategy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    private CreateRCDeploymentSetRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.deploymentSetName = builder.deploymentSetName;
        this.description = builder.description;
        this.groupCount = builder.groupCount;
        this.onUnableToRedeployFailedInstance = builder.onUnableToRedeployFailedInstance;
        this.regionId = builder.regionId;
        this.strategy = builder.strategy;
        this.tag = builder.tag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRCDeploymentSetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deploymentSetName
     */
    public String getDeploymentSetName() {
        return this.deploymentSetName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return groupCount
     */
    public Long getGroupCount() {
        return this.groupCount;
    }

    /**
     * @return onUnableToRedeployFailedInstance
     */
    public String getOnUnableToRedeployFailedInstance() {
        return this.onUnableToRedeployFailedInstance;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return strategy
     */
    public String getStrategy() {
        return this.strategy;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
    }

    public static final class Builder extends Request.Builder<CreateRCDeploymentSetRequest, Builder> {
        private String clientToken; 
        private String deploymentSetName; 
        private String description; 
        private Long groupCount; 
        private String onUnableToRedeployFailedInstance; 
        private String regionId; 
        private String strategy; 
        private java.util.List<Tag> tag; 

        private Builder() {
            super();
        } 

        private Builder(CreateRCDeploymentSetRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.deploymentSetName = request.deploymentSetName;
            this.description = request.description;
            this.groupCount = request.groupCount;
            this.onUnableToRedeployFailedInstance = request.onUnableToRedeployFailedInstance;
            this.regionId = request.regionId;
            this.strategy = request.strategy;
            this.tag = request.tag;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>ETnLKlblzczshOTUbOCz****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The deployment set name. The name must be 2 to 128 characters in length. The name must start with a letter and cannot start with <code>http://</code> or <code>https://</code>. The name can contain letters, digits, colons (.), underscores (_), and hyphens (-).</p>
         * 
         * <strong>example:</strong>
         * <p>deployment_test</p>
         */
        public Builder deploymentSetName(String deploymentSetName) {
            this.putQueryParameter("DeploymentSetName", deploymentSetName);
            this.deploymentSetName = deploymentSetName;
            return this;
        }

        /**
         * <p>The description of the deployment set. The value must be 2 to 256 characters in length and cannot start with http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The number of groups in the deployment set. Valid values: 1 to 7.</p>
         * <p>Default value: 3.</p>
         * <blockquote>
         * <p> This parameter takes effect only when <code>Strategy is set to AvailabilityGroup</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder groupCount(Long groupCount) {
            this.putQueryParameter("GroupCount", groupCount);
            this.groupCount = groupCount;
            return this;
        }

        /**
         * <p>The emergency solution to use in the scenario in which instances in the deployment set cannot be evenly distributed to different zones due to resource insufficiency after the instances failover. Valid values:</p>
         * <ul>
         * <li><strong>CancelMembershipAndStart</strong>: removes the instances from the deployment set and restarts the instances immediately after the failover is complete.</li>
         * <li><strong>KeepStopped</strong>: does not remove the instances from the deployment set and keeps the instances in the Stopped state.</li>
         * </ul>
         * <p>Default value: CancelMembershipAndStart.</p>
         * 
         * <strong>example:</strong>
         * <p>CancelMembershipAndStart</p>
         */
        public Builder onUnableToRedeployFailedInstance(String onUnableToRedeployFailedInstance) {
            this.putQueryParameter("OnUnableToRedeployFailedInstance", onUnableToRedeployFailedInstance);
            this.onUnableToRedeployFailedInstance = onUnableToRedeployFailedInstance;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The deployment strategy. Valid values:</p>
         * <ul>
         * <li><strong>Availability</strong>: high-availability strategy</li>
         * <li><strong>AvailabilityGroup</strong>: high-availability group strategy</li>
         * <li><strong>LowLatency</strong>: low latency strategy</li>
         * </ul>
         * <p>Default value: Availability.</p>
         * 
         * <strong>example:</strong>
         * <p>Availability</p>
         */
        public Builder strategy(String strategy) {
            this.putQueryParameter("Strategy", strategy);
            this.strategy = strategy;
            return this;
        }

        /**
         * Tag.
         */
        public Builder tag(java.util.List<Tag> tag) {
            this.putQueryParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        @Override
        public CreateRCDeploymentSetRequest build() {
            return new CreateRCDeploymentSetRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRCDeploymentSetRequest} extends {@link TeaModel}
     *
     * <p>CreateRCDeploymentSetRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
