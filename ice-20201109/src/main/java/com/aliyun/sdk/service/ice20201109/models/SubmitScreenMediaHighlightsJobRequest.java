// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitScreenMediaHighlightsJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitScreenMediaHighlightsJobRequest</p>
 */
public class SubmitScreenMediaHighlightsJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EditingConfig")
    private String editingConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InputConfig")
    private String inputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputConfig")
    private String outputConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitScreenMediaHighlightsJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.editingConfig = builder.editingConfig;
        this.inputConfig = builder.inputConfig;
        this.outputConfig = builder.outputConfig;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitScreenMediaHighlightsJobRequest create() {
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
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitScreenMediaHighlightsJobRequest, Builder> {
        private String regionId; 
        private String editingConfig; 
        private String inputConfig; 
        private String outputConfig; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitScreenMediaHighlightsJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.editingConfig = request.editingConfig;
            this.inputConfig = request.inputConfig;
            this.outputConfig = request.outputConfig;
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
         * EditingConfig.
         */
        public Builder editingConfig(String editingConfig) {
            this.putBodyParameter("EditingConfig", editingConfig);
            this.editingConfig = editingConfig;
            return this;
        }

        /**
         * InputConfig.
         */
        public Builder inputConfig(String inputConfig) {
            this.putBodyParameter("InputConfig", inputConfig);
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
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitScreenMediaHighlightsJobRequest build() {
            return new SubmitScreenMediaHighlightsJobRequest(this);
        } 

    } 

}
