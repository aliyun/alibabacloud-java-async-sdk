// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTextGenerateJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitTextGenerateJobRequest</p>
 */
public class SubmitTextGenerateJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GenerateConfig")
    private String generateConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Title")
    private String title;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitTextGenerateJobRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.generateConfig = builder.generateConfig;
        this.title = builder.title;
        this.type = builder.type;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTextGenerateJobRequest create() {
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
     * @return generateConfig
     */
    public String getGenerateConfig() {
        return this.generateConfig;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitTextGenerateJobRequest, Builder> {
        private String description; 
        private String generateConfig; 
        private String title; 
        private String type; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTextGenerateJobRequest request) {
            super(request);
            this.description = request.description;
            this.generateConfig = request.generateConfig;
            this.title = request.title;
            this.type = request.type;
            this.userData = request.userData;
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
         * GenerateConfig.
         */
        public Builder generateConfig(String generateConfig) {
            this.putQueryParameter("GenerateConfig", generateConfig);
            this.generateConfig = generateConfig;
            return this;
        }

        /**
         * Title.
         */
        public Builder title(String title) {
            this.putQueryParameter("Title", title);
            this.title = title;
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

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitTextGenerateJobRequest build() {
            return new SubmitTextGenerateJobRequest(this);
        } 

    } 

}
