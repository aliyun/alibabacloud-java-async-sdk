// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetAppConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetAppConfigResponseBody</p>
 */
public class GetAppConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("Classify")
    private String classify;

    @com.aliyun.core.annotation.NameInMap("CustomConfig")
    private java.util.Map<String, ?> customConfig;

    @com.aliyun.core.annotation.NameInMap("DeployStatus")
    private String deployStatus;

    @com.aliyun.core.annotation.NameInMap("GmtModified")
    private String gmtModified;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("Option")
    private java.util.Map<String, ?> option;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("Version")
    private Long version;

    private GetAppConfigResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.classify = builder.classify;
        this.customConfig = builder.customConfig;
        this.deployStatus = builder.deployStatus;
        this.gmtModified = builder.gmtModified;
        this.name = builder.name;
        this.option = builder.option;
        this.requestId = builder.requestId;
        this.resourceType = builder.resourceType;
        this.type = builder.type;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return classify
     */
    public String getClassify() {
        return this.classify;
    }

    /**
     * @return customConfig
     */
    public java.util.Map<String, ?> getCustomConfig() {
        return this.customConfig;
    }

    /**
     * @return deployStatus
     */
    public String getDeployStatus() {
        return this.deployStatus;
    }

    /**
     * @return gmtModified
     */
    public String getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return option
     */
    public java.util.Map<String, ?> getOption() {
        return this.option;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return version
     */
    public Long getVersion() {
        return this.version;
    }

    public static final class Builder {
        private String appId; 
        private String classify; 
        private java.util.Map<String, ?> customConfig; 
        private String deployStatus; 
        private String gmtModified; 
        private String name; 
        private java.util.Map<String, ?> option; 
        private String requestId; 
        private String resourceType; 
        private String type; 
        private Long version; 

        private Builder() {
        } 

        private Builder(GetAppConfigResponseBody model) {
            this.appId = model.appId;
            this.classify = model.classify;
            this.customConfig = model.customConfig;
            this.deployStatus = model.deployStatus;
            this.gmtModified = model.gmtModified;
            this.name = model.name;
            this.option = model.option;
            this.requestId = model.requestId;
            this.resourceType = model.resourceType;
            this.type = model.type;
            this.version = model.version;
        } 

        /**
         * <p>App ID。</p>
         * 
         * <strong>example:</strong>
         * <p>txt_check_pro_agent_01</p>
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * <p>The category.</p>
         * 
         * <strong>example:</strong>
         * <p>guard-scene</p>
         */
        public Builder classify(String classify) {
            this.classify = classify;
            return this;
        }

        /**
         * <p>The configuration details.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;agentItemConfigs&quot;: &quot;[{\&quot;agentId\&quot;:\&quot;ag.abcxxx\&quot;,\&quot;enable\&quot;:true,\&quot;name\&quot;:\&quot;Agent 1\&quot;}]&quot;}</p>
         */
        public Builder customConfig(java.util.Map<String, ?> customConfig) {
            this.customConfig = customConfig;
            return this;
        }

        /**
         * <p>The publish status.</p>
         * 
         * <strong>example:</strong>
         * <p>editing</p>
         */
        public Builder deployStatus(String deployStatus) {
            this.deployStatus = deployStatus;
            return this;
        }

        /**
         * <p>The modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-06-09 10:12:50</p>
         */
        public Builder gmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom text moderation</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The preset options.</p>
         */
        public Builder option(java.util.Map<String, ?> option) {
            this.option = option;
            return this;
        }

        /**
         * <p>The ID assigned by the backend to uniquely identify a request. This ID can be used to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>AAAAAA-BBBB-CCCCC-DDDD-EEEEEEEE****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * 
         * <strong>example:</strong>
         * <p>agent_text</p>
         */
        public Builder resourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>plus</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The version number.</p>
         * 
         * <strong>example:</strong>
         * <p>1785898163</p>
         */
        public Builder version(Long version) {
            this.version = version;
            return this;
        }

        public GetAppConfigResponseBody build() {
            return new GetAppConfigResponseBody(this);
        } 

    } 

}
