// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateNacosConfigRequest} extends {@link RequestModel}
 *
 * <p>CreateNacosConfigRequest</p>
 */
public class CreateNacosConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BetaIps")
    private String betaIps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Content")
    private String content;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Group")
    @com.aliyun.core.annotation.Validation(required = true)
    private String group;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateNacosConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.betaIps = builder.betaIps;
        this.content = builder.content;
        this.dataId = builder.dataId;
        this.desc = builder.desc;
        this.group = builder.group;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNacosConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return betaIps
     */
    public String getBetaIps() {
        return this.betaIps;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return desc
     */
    public String getDesc() {
        return this.desc;
    }

    /**
     * @return group
     */
    public String getGroup() {
        return this.group;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateNacosConfigRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String betaIps; 
        private String content; 
        private String dataId; 
        private String desc; 
        private String group; 
        private String instanceId; 
        private String namespaceId; 
        private String tags; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateNacosConfigRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.appName = request.appName;
            this.betaIps = request.betaIps;
            this.content = request.content;
            this.dataId = request.dataId;
            this.desc = request.desc;
            this.group = request.group;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.tags = request.tags;
            this.type = request.type;
        } 

        /**
         * <p>The language of the response. Valid values:</p>
         * <ul>
         * <li>zh: Chinese</li>
         * <li>en: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>saledatacenter-task</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The list of IP addresses where the beta release of the configuration is performed.</p>
         * 
         * <strong>example:</strong>
         * <p>100.117.XX.XX,100.117.XX.XX</p>
         */
        public Builder betaIps(String betaIps) {
            this.putQueryParameter("BetaIps", betaIps);
            this.betaIps = betaIps;
            return this;
        }

        /**
         * <p>The content of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>asdf</p>
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the data.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>common.yaml</p>
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * <p>The description of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Basic module configuration.</p>
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * <p>The ID of the group.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alime-bridge-aliyun</p>
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>mse_prepaid_public_cn-tl32****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>547fd2a0-d0d6-****-80db2a1afb82</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The tags of the configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>Basic configurations</p>
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>The format of the configuration. Supported formats include TEXT, JSON, and XML.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateNacosConfigRequest build() {
            return new CreateNacosConfigRequest(this);
        } 

    } 

}
