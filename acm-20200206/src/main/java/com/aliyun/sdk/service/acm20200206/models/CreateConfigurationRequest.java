// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigurationRequest} extends {@link RequestModel}
 *
 * <p>CreateConfigurationRequest</p>
 */
public class CreateConfigurationRequest extends Request {
    @Body
    @NameInMap("AppName")
    private String appName;

    @Body
    @NameInMap("Content")
    @Validation(required = true)
    private String content;

    @Body
    @NameInMap("DataId")
    @Validation(required = true)
    private String dataId;

    @Body
    @NameInMap("Desc")
    private String desc;

    @Body
    @NameInMap("Group")
    @Validation(required = true)
    private String group;

    @Body
    @NameInMap("NamespaceId")
    @Validation(required = true)
    private String namespaceId;

    @Body
    @NameInMap("Tags")
    private String tags;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
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

        private Builder(CreateConfigurationRequest response) {
            super(response);
            this.appName = response.appName;
            this.content = response.content;
            this.dataId = response.dataId;
            this.desc = response.desc;
            this.group = response.group;
            this.namespaceId = response.namespaceId;
            this.tags = response.tags;
            this.type = response.type;
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
