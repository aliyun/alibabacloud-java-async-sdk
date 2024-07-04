// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CloneModuleRequest} extends {@link RequestModel}
 *
 * <p>CloneModuleRequest</p>
 */
public class CloneModuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleSource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("moduleVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String moduleVersion;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private CloneModuleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.moduleId = builder.moduleId;
        this.moduleSource = builder.moduleSource;
        this.moduleVersion = builder.moduleVersion;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneModuleRequest create() {
        return builder().build();
    }

    @Override
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
     * @return moduleId
     */
    public String getModuleId() {
        return this.moduleId;
    }

    /**
     * @return moduleSource
     */
    public String getModuleSource() {
        return this.moduleSource;
    }

    /**
     * @return moduleVersion
     */
    public String getModuleVersion() {
        return this.moduleVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<CloneModuleRequest, Builder> {
        private String description; 
        private String moduleId; 
        private String moduleSource; 
        private String moduleVersion; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(CloneModuleRequest request) {
            super(request);
            this.description = request.description;
            this.moduleId = request.moduleId;
            this.moduleSource = request.moduleSource;
            this.moduleVersion = request.moduleVersion;
            this.name = request.name;
        } 

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * moduleId.
         */
        public Builder moduleId(String moduleId) {
            this.putBodyParameter("moduleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * moduleSource.
         */
        public Builder moduleSource(String moduleSource) {
            this.putBodyParameter("moduleSource", moduleSource);
            this.moduleSource = moduleSource;
            return this;
        }

        /**
         * moduleVersion.
         */
        public Builder moduleVersion(String moduleVersion) {
            this.putBodyParameter("moduleVersion", moduleVersion);
            this.moduleVersion = moduleVersion;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        @Override
        public CloneModuleRequest build() {
            return new CloneModuleRequest(this);
        } 

    } 

}
