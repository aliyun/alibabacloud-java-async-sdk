// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTrainingJobRequest} extends {@link RequestModel}
 *
 * <p>CreateTrainingJobRequest</p>
 */
public class CreateTrainingJobRequest extends Request {
    @Body
    @NameInMap("Algorithm")
    private String algorithm;

    @Body
    @NameInMap("CampaignId")
    private String campaignId;

    @Body
    @NameInMap("DataPath")
    private String dataPath;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("Remark")
    private String remark;

    @Body
    @NameInMap("UserConfig")
    private String userConfig;

    private CreateTrainingJobRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.campaignId = builder.campaignId;
        this.dataPath = builder.dataPath;
        this.name = builder.name;
        this.remark = builder.remark;
        this.userConfig = builder.userConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTrainingJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return campaignId
     */
    public String getCampaignId() {
        return this.campaignId;
    }

    /**
     * @return dataPath
     */
    public String getDataPath() {
        return this.dataPath;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return userConfig
     */
    public String getUserConfig() {
        return this.userConfig;
    }

    public static final class Builder extends Request.Builder<CreateTrainingJobRequest, Builder> {
        private String algorithm; 
        private String campaignId; 
        private String dataPath; 
        private String name; 
        private String remark; 
        private String userConfig; 

        private Builder() {
            super();
        } 

        private Builder(CreateTrainingJobRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.campaignId = request.campaignId;
            this.dataPath = request.dataPath;
            this.name = request.name;
            this.remark = request.remark;
            this.userConfig = request.userConfig;
        } 

        /**
         * 关联算法Id。
         */
        public Builder algorithm(String algorithm) {
            this.putBodyParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * 关联运营活动Id。
         */
        public Builder campaignId(String campaignId) {
            this.putBodyParameter("CampaignId", campaignId);
            this.campaignId = campaignId;
            return this;
        }

        /**
         * 训练数据路径。
         */
        public Builder dataPath(String dataPath) {
            this.putBodyParameter("DataPath", dataPath);
            this.dataPath = dataPath;
            return this;
        }

        /**
         * 训练任务名称。
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 备注。
         */
        public Builder remark(String remark) {
            this.putBodyParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * 用户配置。
         */
        public Builder userConfig(String userConfig) {
            this.putBodyParameter("UserConfig", userConfig);
            this.userConfig = userConfig;
            return this;
        }

        @Override
        public CreateTrainingJobRequest build() {
            return new CreateTrainingJobRequest(this);
        } 

    } 

}
