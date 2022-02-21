// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNacosConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateNacosConfigRequest</p>
 */
public class UpdateNacosConfigRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("BetaIps")
    private String betaIps;

    @Query
    @NameInMap("Content")
    private String content;

    @Query
    @NameInMap("DataId")
    @Validation(required = true)
    private String dataId;

    @Query
    @NameInMap("Desc")
    private String desc;

    @Query
    @NameInMap("EncryptedDataKey")
    private String encryptedDataKey;

    @Query
    @NameInMap("Group")
    @Validation(required = true)
    private String group;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Md5")
    private String md5;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("Type")
    private String type;

    private UpdateNacosConfigRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.appName = builder.appName;
        this.betaIps = builder.betaIps;
        this.content = builder.content;
        this.dataId = builder.dataId;
        this.desc = builder.desc;
        this.encryptedDataKey = builder.encryptedDataKey;
        this.group = builder.group;
        this.instanceId = builder.instanceId;
        this.md5 = builder.md5;
        this.namespaceId = builder.namespaceId;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNacosConfigRequest create() {
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
     * @return encryptedDataKey
     */
    public String getEncryptedDataKey() {
        return this.encryptedDataKey;
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
     * @return md5
     */
    public String getMd5() {
        return this.md5;
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

    public static final class Builder extends Request.Builder<UpdateNacosConfigRequest, Builder> {
        private String acceptLanguage; 
        private String appName; 
        private String betaIps; 
        private String content; 
        private String dataId; 
        private String desc; 
        private String encryptedDataKey; 
        private String group; 
        private String instanceId; 
        private String md5; 
        private String namespaceId; 
        private String tags; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNacosConfigRequest response) {
            super(response);
            this.acceptLanguage = response.acceptLanguage;
            this.appName = response.appName;
            this.betaIps = response.betaIps;
            this.content = response.content;
            this.dataId = response.dataId;
            this.desc = response.desc;
            this.encryptedDataKey = response.encryptedDataKey;
            this.group = response.group;
            this.instanceId = response.instanceId;
            this.md5 = response.md5;
            this.namespaceId = response.namespaceId;
            this.tags = response.tags;
            this.type = response.type;
        } 

        /**
         * AcceptLanguage.
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * BetaIps.
         */
        public Builder betaIps(String betaIps) {
            this.putQueryParameter("BetaIps", betaIps);
            this.betaIps = betaIps;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putQueryParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DataId.
         */
        public Builder dataId(String dataId) {
            this.putQueryParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putQueryParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * EncryptedDataKey.
         */
        public Builder encryptedDataKey(String encryptedDataKey) {
            this.putQueryParameter("EncryptedDataKey", encryptedDataKey);
            this.encryptedDataKey = encryptedDataKey;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putQueryParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Md5.
         */
        public Builder md5(String md5) {
            this.putQueryParameter("Md5", md5);
            this.md5 = md5;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public UpdateNacosConfigRequest build() {
            return new UpdateNacosConfigRequest(this);
        } 

    } 

}
