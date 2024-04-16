// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePublishRequest} extends {@link RequestModel}
 *
 * <p>CreatePublishRequest</p>
 */
public class CreatePublishRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Query
    @NameInMap("CommitId")
    @Validation(required = true)
    private String commitId;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EnvType")
    @Validation(required = true)
    private String envType;

    @Query
    @NameInMap("PublishType")
    @Validation(required = true)
    private String publishType;

    @Query
    @NameInMap("Source")
    private String source;

    @Query
    @NameInMap("VersionNumber")
    private String versionNumber;

    private CreatePublishRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.clientToken = builder.clientToken;
        this.commitId = builder.commitId;
        this.description = builder.description;
        this.envType = builder.envType;
        this.publishType = builder.publishType;
        this.source = builder.source;
        this.versionNumber = builder.versionNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePublishRequest create() {
        return builder().build();
    }

    @Override
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return commitId
     */
    public String getCommitId() {
        return this.commitId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return envType
     */
    public String getEnvType() {
        return this.envType;
    }

    /**
     * @return publishType
     */
    public String getPublishType() {
        return this.publishType;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return versionNumber
     */
    public String getVersionNumber() {
        return this.versionNumber;
    }

    public static final class Builder extends Request.Builder<CreatePublishRequest, Builder> {
        private String appId; 
        private String clientToken; 
        private String commitId; 
        private String description; 
        private String envType; 
        private String publishType; 
        private String source; 
        private String versionNumber; 

        private Builder() {
            super();
        } 

        private Builder(CreatePublishRequest request) {
            super(request);
            this.appId = request.appId;
            this.clientToken = request.clientToken;
            this.commitId = request.commitId;
            this.description = request.description;
            this.envType = request.envType;
            this.publishType = request.publishType;
            this.source = request.source;
            this.versionNumber = request.versionNumber;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
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
         * CommitId.
         */
        public Builder commitId(String commitId) {
            this.putQueryParameter("CommitId", commitId);
            this.commitId = commitId;
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
         * EnvType.
         */
        public Builder envType(String envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * PublishType.
         */
        public Builder publishType(String publishType) {
            this.putQueryParameter("PublishType", publishType);
            this.publishType = publishType;
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

        /**
         * VersionNumber.
         */
        public Builder versionNumber(String versionNumber) {
            this.putQueryParameter("VersionNumber", versionNumber);
            this.versionNumber = versionNumber;
            return this;
        }

        @Override
        public CreatePublishRequest build() {
            return new CreatePublishRequest(this);
        } 

    } 

}
