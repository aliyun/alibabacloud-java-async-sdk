// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

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
 * {@link TriggerExecutionRequest} extends {@link RequestModel}
 *
 * <p>TriggerExecutionRequest</p>
 */
public class TriggerExecutionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ExecutionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String executionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private TriggerExecutionRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.content = builder.content;
        this.executionId = builder.executionId;
        this.regionId = builder.regionId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TriggerExecutionRequest create() {
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
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return executionId
     */
    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<TriggerExecutionRequest, Builder> {
        private String clientToken; 
        private String content; 
        private String executionId; 
        private String regionId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(TriggerExecutionRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.content = request.content;
            this.executionId = request.executionId;
            this.regionId = request.regionId;
            this.type = request.type;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>dswe2-3i0-029</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The message body to be sent to the trigger task.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;eventTime&quot;: &quot;20181226T220114.058+0800&quot;, &quot;id&quot;: &quot;9435EAD6-3CF6-4494-8F7A-3A<strong><strong><strong><strong>77&quot;,&quot;level&quot;: &quot;INFO&quot;,&quot;name&quot;: &quot;Instance:StateChange&quot;,&quot;product&quot;: &quot;ECS&quot;,&quot;regionId&quot;:&quot;cn-hangzhou&quot;,&quot;resourceId&quot;: &quot;acs:ecs:cn-hangzhou:169070</strong></strong></strong></strong>30:instance/i-bp1ecr<strong><strong><strong><strong>5go2go&quot;,&quot;userId&quot;: &quot;169070</strong></strong></strong></strong>30&quot;,&quot;ver&quot;: &quot;1.0&quot;,&quot;content&quot;: {&quot;resourceId&quot;: &quot;i-bp1ecr********5go2go&quot;, &quot;resourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;,&quot;state&quot;: &quot;Stopping&quot;} }</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the event-, alert-, or timer-triggered execution.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>exec-sadw3f23rsad</p>
         */
        public Builder executionId(String executionId) {
            this.putQueryParameter("ExecutionId", executionId);
            this.executionId = executionId;
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
         * <p>The type of the trigger. Valid values:</p>
         * <ul>
         * <li>Event</li>
         * <li>Alarm</li>
         * <li>Timer</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Event</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public TriggerExecutionRequest build() {
            return new TriggerExecutionRequest(this);
        } 

    } 

}
