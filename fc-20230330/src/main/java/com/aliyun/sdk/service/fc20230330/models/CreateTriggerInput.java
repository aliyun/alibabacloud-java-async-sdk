// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
 * {@link CreateTriggerInput} extends {@link TeaModel}
 *
 * <p>CreateTriggerInput</p>
 */
public class CreateTriggerInput extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(maxLength = 256)
    private String description;

    @com.aliyun.core.annotation.NameInMap("invocationRole")
    @com.aliyun.core.annotation.Validation(maxLength = 300)
    private String invocationRole;

    @com.aliyun.core.annotation.NameInMap("qualifier")
    private String qualifier;

    @com.aliyun.core.annotation.NameInMap("sourceArn")
    @com.aliyun.core.annotation.Validation(maxLength = 300, minLength = 1)
    private String sourceArn;

    @com.aliyun.core.annotation.NameInMap("triggerConfig")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerConfig;

    @com.aliyun.core.annotation.NameInMap("triggerName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String triggerName;

    @com.aliyun.core.annotation.NameInMap("triggerType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String triggerType;

    private CreateTriggerInput(Builder builder) {
        this.description = builder.description;
        this.invocationRole = builder.invocationRole;
        this.qualifier = builder.qualifier;
        this.sourceArn = builder.sourceArn;
        this.triggerConfig = builder.triggerConfig;
        this.triggerName = builder.triggerName;
        this.triggerType = builder.triggerType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTriggerInput create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return invocationRole
     */
    public String getInvocationRole() {
        return this.invocationRole;
    }

    /**
     * @return qualifier
     */
    public String getQualifier() {
        return this.qualifier;
    }

    /**
     * @return sourceArn
     */
    public String getSourceArn() {
        return this.sourceArn;
    }

    /**
     * @return triggerConfig
     */
    public String getTriggerConfig() {
        return this.triggerConfig;
    }

    /**
     * @return triggerName
     */
    public String getTriggerName() {
        return this.triggerName;
    }

    /**
     * @return triggerType
     */
    public String getTriggerType() {
        return this.triggerType;
    }

    public static final class Builder {
        private String description; 
        private String invocationRole; 
        private String qualifier; 
        private String sourceArn; 
        private String triggerConfig; 
        private String triggerName; 
        private String triggerType; 

        private Builder() {
        } 

        private Builder(CreateTriggerInput model) {
            this.description = model.description;
            this.invocationRole = model.invocationRole;
            this.qualifier = model.qualifier;
            this.sourceArn = model.sourceArn;
            this.triggerConfig = model.triggerConfig;
            this.triggerName = model.triggerName;
            this.triggerType = model.triggerType;
        } 

        /**
         * <p>The description of the trigger.</p>
         * 
         * <strong>example:</strong>
         * <p>trigger for test</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The RAM role that is used by the event source such as Object Storage Service (OSS) to invoke the function.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::1234567890:role/fc-test</p>
         */
        public Builder invocationRole(String invocationRole) {
            this.invocationRole = invocationRole;
            return this;
        }

        /**
         * <p>The version or alias of the function.</p>
         * 
         * <strong>example:</strong>
         * <p>LATEST</p>
         */
        public Builder qualifier(String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the trigger event source.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:oss:cn-shanghai:12345:mybucket</p>
         */
        public Builder sourceArn(String sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }

        /**
         * <p>The configurations of the trigger. The configurations vary based on the trigger type. The following items list the data structures for different types of triggers:</p>
         * <ul>
         * <li>OSS triggers: <a href="https://help.aliyun.com/document_detail/2766465.html">OSSTriggerConfig</a>.</li>
         * <li>Simple Log Service trigger: <a href="https://help.aliyun.com/document_detail/2618711.html">LogTriggerConfig</a>.</li>
         * <li>Time triggers: <a href="https://help.aliyun.com/document_detail/2754638.html">TimerTriggerConfig</a>.</li>
         * <li>HTTP triggers: <a href="https://help.aliyun.com/document_detail/2766461.html">HTTPTriggerConfig</a>.</li>
         * <li>Tablestore triggers: Specify the <strong>SourceArnm</strong> parameter and leave this parameter empty.</li>
         * <li>Alibaba Cloud CDN event triggers: <a href="https://help.aliyun.com/document_detail/2766462.html">CDNEventsTriggerConfig</a>.</li>
         * <li>MNS topic triggers: <a href="https://help.aliyun.com/document_detail/2766464.html">MnsTopicTriggerConfig</a>.</li>
         * <li>EventBridge-based triggers: <a href="https://help.aliyun.com/document_detail/2766447.html">EventBridgeTriggerConfig</a>.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;events&quot;:[&quot;oss:ObjectCreated:*&quot;],&quot;filter&quot;:{&quot;key&quot;:{&quot;prefix&quot;:&quot;/prefix&quot;,&quot;suffix&quot;:&quot;.zip&quot;}}}</p>
         */
        public Builder triggerConfig(String triggerConfig) {
            this.triggerConfig = triggerConfig;
            return this;
        }

        /**
         * <p>The name of the trigger. The name can contain only letters, digits, hyphens (-), and underscores (_). The name must be 1 to 128 characters in length and cannot start with a digit or a hyphen (-).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss_create_object_demo</p>
         */
        public Builder triggerName(String triggerName) {
            this.triggerName = triggerName;
            return this;
        }

        /**
         * <p>The type of the trigger. Valid values:</p>
         * <ul>
         * <li><strong>oss</strong>: OSS event triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513613.html">Overview</a>.</li>
         * <li><strong>log</strong>: Simple Log Service triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513638.html">Simple Log Service triggers</a>.</li>
         * <li><strong>timer</strong>: time triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513611.html">Time triggers</a>.</li>
         * <li><strong>http</strong>: HTTP triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513634.html">Overview</a>.</li>
         * <li><strong>tablestore</strong>: Tablestore triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513640.html">Tablestore triggers</a>.</li>
         * <li><strong>cdn_events</strong>: CDN event triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513636.html">Overview</a>.</li>
         * <li><strong>mns_topic</strong>: Message Service (MNS) topic triggers. For more information, see <a href="https://help.aliyun.com/document_detail/2513641.html">MNS topic triggers</a>.</li>
         * <li><strong>eventbridge</strong>: EventBridge-based triggers.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss</p>
         */
        public Builder triggerType(String triggerType) {
            this.triggerType = triggerType;
            return this;
        }

        public CreateTriggerInput build() {
            return new CreateTriggerInput(this);
        } 

    } 

}
