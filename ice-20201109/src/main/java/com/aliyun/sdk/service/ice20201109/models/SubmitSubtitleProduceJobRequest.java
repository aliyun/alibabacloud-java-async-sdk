// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSubtitleProduceJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitSubtitleProduceJobRequest</p>
 */
public class SubmitSubtitleProduceJobRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

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
    @NameInMap("IsAsync")
    private Long isAsync;

    @Query
    @NameInMap("OutputConfig")
    private String outputConfig;

    @Query
    @NameInMap("Title")
    private String title;

    @Query
    @NameInMap("Type")
    private String type;

    @Query
    @NameInMap("UserData")
    private String userData;

    private SubmitSubtitleProduceJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.editingConfig = builder.editingConfig;
        this.inputConfig = builder.inputConfig;
        this.isAsync = builder.isAsync;
        this.outputConfig = builder.outputConfig;
        this.title = builder.title;
        this.type = builder.type;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitSubtitleProduceJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
     * @return isAsync
     */
    public Long getIsAsync() {
        return this.isAsync;
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

    public static final class Builder extends Request.Builder<SubmitSubtitleProduceJobRequest, Builder> {
        private String regionId; 
        private String description; 
        private String editingConfig; 
        private String inputConfig; 
        private Long isAsync; 
        private String outputConfig; 
        private String title; 
        private String type; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitSubtitleProduceJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.editingConfig = request.editingConfig;
            this.inputConfig = request.inputConfig;
            this.isAsync = request.isAsync;
            this.outputConfig = request.outputConfig;
            this.title = request.title;
            this.type = request.type;
            this.userData = request.userData;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * IsAsync.
         */
        public Builder isAsync(Long isAsync) {
            this.putQueryParameter("IsAsync", isAsync);
            this.isAsync = isAsync;
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
        public SubmitSubtitleProduceJobRequest build() {
            return new SubmitSubtitleProduceJobRequest(this);
        } 

    } 

}
