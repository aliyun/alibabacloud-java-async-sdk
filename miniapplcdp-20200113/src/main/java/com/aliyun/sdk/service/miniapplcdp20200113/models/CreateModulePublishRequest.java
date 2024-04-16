// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModulePublishRequest} extends {@link RequestModel}
 *
 * <p>CreateModulePublishRequest</p>
 */
public class CreateModulePublishRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ModuleId")
    @Validation(required = true)
    private String moduleId;

    @Query
    @NameInMap("PublishVersion")
    @Validation(required = true)
    private String publishVersion;

    @Query
    @NameInMap("Source")
    private String source;

    private CreateModulePublishRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.moduleId = builder.moduleId;
        this.publishVersion = builder.publishVersion;
        this.source = builder.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModulePublishRequest create() {
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
     * @return publishVersion
     */
    public String getPublishVersion() {
        return this.publishVersion;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    public static final class Builder extends Request.Builder<CreateModulePublishRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String moduleId; 
        private String publishVersion; 
        private String source; 

        private Builder() {
            super();
        } 

        private Builder(CreateModulePublishRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.moduleId = request.moduleId;
            this.publishVersion = request.publishVersion;
            this.source = request.source;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * ModuleId.
         */
        public Builder moduleId(String moduleId) {
            this.putQueryParameter("ModuleId", moduleId);
            this.moduleId = moduleId;
            return this;
        }

        /**
         * PublishVersion.
         */
        public Builder publishVersion(String publishVersion) {
            this.putQueryParameter("PublishVersion", publishVersion);
            this.publishVersion = publishVersion;
            return this;
        }

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        @Override
        public CreateModulePublishRequest build() {
            return new CreateModulePublishRequest(this);
        } 

    } 

}
