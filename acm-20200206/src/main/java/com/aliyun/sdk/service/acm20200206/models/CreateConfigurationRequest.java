// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigurationRequest</p>
 */
public class CreateConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Content")
    @com.aliyun.core.annotation.Validation(required = true)
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Desc")
    private String desc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Group")
    @com.aliyun.core.annotation.Validation(required = true)
    private String group;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private CreateConfigurationRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.content = builder.content;
        this.dataId = builder.dataId;
        this.desc = builder.desc;
        this.group = builder.group;
        this.namespaceId = builder.namespaceId;
        this.tags = builder.tags;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
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

    public static final class Builder extends Request.Builder<CreateConfigurationRequest, Builder> {
        private String appName; 
        private String content; 
        private String dataId; 
        private String desc; 
        private String group; 
        private String namespaceId; 
        private String tags; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateConfigurationRequest request) {
            super(request);
            this.appName = request.appName;
            this.content = request.content;
            this.dataId = request.dataId;
            this.desc = request.desc;
            this.group = request.group;
            this.namespaceId = request.namespaceId;
            this.tags = request.tags;
            this.type = request.type;
        } 

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.putBodyParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * Content.
         */
        public Builder content(String content) {
            this.putBodyParameter("Content", content);
            this.content = content;
            return this;
        }

        /**
         * DataId.
         */
        public Builder dataId(String dataId) {
            this.putBodyParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * Desc.
         */
        public Builder desc(String desc) {
            this.putBodyParameter("Desc", desc);
            this.desc = desc;
            return this;
        }

        /**
         * Group.
         */
        public Builder group(String group) {
            this.putBodyParameter("Group", group);
            this.group = group;
            return this;
        }

        /**
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putBodyParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateConfigurationRequest build() {
            return new CreateConfigurationRequest(this);
        } 

    } 

}
