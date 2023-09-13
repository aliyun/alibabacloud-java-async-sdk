// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitAvatarVideoJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitAvatarVideoJobRequest</p>
 */
public class SubmitAvatarVideoJobRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("EditingConfig")
    private String editingConfig;

    @Query
    @NameInMap("InputConfig")
    private String inputConfig;

    @Query
    @NameInMap("OutputConfig")
    private String outputConfig;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("UserData")
    private String userData;

    private SubmitAvatarVideoJobRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.editingConfig = builder.editingConfig;
        this.inputConfig = builder.inputConfig;
        this.outputConfig = builder.outputConfig;
        this.title = builder.title;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitAvatarVideoJobRequest create() {
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
     * @return editingConfig
     */
    public String getEditingConfig() {
        return this.editingConfig;
    }

    /**
     * @return inputConfig
     */
    public String getInputConfig() {
        return this.inputConfig;
    }

    /**
     * @return outputConfig
     */
    public String getOutputConfig() {
        return this.outputConfig;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return this.title;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitAvatarVideoJobRequest, Builder> {
        private String description; 
        private String editingConfig; 
        private String inputConfig; 
        private String outputConfig; 
        private String title; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitAvatarVideoJobRequest request) {
            super(request);
            this.description = request.description;
            this.editingConfig = request.editingConfig;
            this.inputConfig = request.inputConfig;
            this.outputConfig = request.outputConfig;
            this.title = request.title;
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
         * EditingConfig.
         */
        public Builder editingConfig(String editingConfig) {
            this.putQueryParameter("EditingConfig", editingConfig);
            this.editingConfig = editingConfig;
            return this;
        }

        /**
         * InputConfig.
         */
        public Builder inputConfig(String inputConfig) {
            this.putQueryParameter("InputConfig", inputConfig);
            this.inputConfig = inputConfig;
            return this;
        }

        /**
         * OutputConfig.
         */
        public Builder outputConfig(String outputConfig) {
            this.putQueryParameter("OutputConfig", outputConfig);
            this.outputConfig = outputConfig;
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
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitAvatarVideoJobRequest build() {
            return new SubmitAvatarVideoJobRequest(this);
        } 

    } 

}
