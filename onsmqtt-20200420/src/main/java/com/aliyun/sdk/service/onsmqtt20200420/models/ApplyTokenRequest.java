// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link ApplyTokenRequest} extends {@link RequestModel}
 *
 * <p>ApplyTokenRequest</p>
 */
public class ApplyTokenRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Actions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long expireTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Resources")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resources;

    private ApplyTokenRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.actions = builder.actions;
        this.expireTime = builder.expireTime;
        this.instanceId = builder.instanceId;
        this.resources = builder.resources;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyTokenRequest create() {
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
    public String getActions() {
        return this.actions;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return resources
     */
    public String getResources() {
        return this.resources;
    }

    public static final class Builder extends Request.Builder<ApplyTokenRequest, Builder> {
        private String regionId; 
        private String actions; 
        private Long expireTime; 
        private String instanceId; 
        private String resources; 

        private Builder() {
            super();
        } 

        private Builder(ApplyTokenRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.actions = request.actions;
            this.expireTime = request.expireTime;
            this.instanceId = request.instanceId;
            this.resources = request.resources;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The permission type of the token. Valid values:</p>
         * <ul>
         * <li><strong>R</strong>: read-only. You can only subscribe to the specified topics.</li>
         * <li><strong>W</strong>: write-only. You can only send messages to the specified topics.</li>
         * <li><strong>R,W</strong>: read and write. You can send messages to and subscribe to the specified topics. Separate <strong>R</strong> and <strong>W</strong> with a comma (,).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>R</p>
         */
        public Builder actions(String actions) {
            this.putQueryParameter("Actions", actions);
            this.actions = actions;
            return this;
        }

        /**
         * <p>The timestamp that indicates the point in time when the token expires. Unit: milliseconds. The minimum validity period of a token is 60 seconds, and the maximum validity period of a token is 30 days. If you specify a validity period of more than 30 days for a token, no errors are returned. However, the token is valid only for 30 days.</p>
         * <p>For example, you want to specify a validity period of 60 seconds for a token. If the current system timestamp is 1609434061000, you must set this parameter to <strong>1609434121000</strong>. The value is calculated by using the following formula: 1609434061000 + 60 x 1000 = 1609434121000.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1609434121000</p>
         */
        public Builder expireTime(Long expireTime) {
            this.putQueryParameter("ExpireTime", expireTime);
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance. The ID must be consistent with the ID of the instance that the ApsaraMQ for MQTT client uses. You can obtain the instance ID on the <strong>Instance Details</strong> page that corresponds to the instance in the <a href="https://mqtt.console.aliyun.com/">ApsaraMQ for MQTT console</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>post-cn-0pp12gl****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The topics on the ApsaraMQ for MQTT instance. Separate multiple topics with commas (,). Each token can be used to access up to 100 topics. Multiple topics are sorted in alphabetic order. MQTT wildcards, including single-level wildcards represented by plus signs (+) and multi-level wildcards represented by number signs (#), can be used for the Resources parameter that you register to apply for a token.</p>
         * <p>For example, if you set the <strong>Resources</strong> parameter to Topic1/+ when you apply for a token, the ApsaraMQ for MQTT client can manage the topics in Topic1/xxx. If you set the <strong>Resources</strong> parameter to Topic1/# when you apply for a token, the ApsaraMQ for MQTT client can manage topics of any level in Topic1/xxx/xxx/xxx.</p>
         * <blockquote>
         * <p> ApsaraMQ for MQTT supports subtopics. You can specify subtopics in the code for messaging instead of configuring them in the ApsaraMQ for MQTT console. Forward slashes (/) are used to separate topics of different levels. For more information, see <a href="https://help.aliyun.com/document_detail/42420.html">Terms</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>TopicA/+</p>
         */
        public Builder resources(String resources) {
            this.putQueryParameter("Resources", resources);
            this.resources = resources;
            return this;
        }

        @Override
        public ApplyTokenRequest build() {
            return new ApplyTokenRequest(this);
        } 

    } 

}
