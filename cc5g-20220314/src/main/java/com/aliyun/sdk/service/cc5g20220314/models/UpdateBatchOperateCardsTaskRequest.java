// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateBatchOperateCardsTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateBatchOperateCardsTaskRequest</p>
 */
public class UpdateBatchOperateCardsTaskRequest extends Request {
    @Query
    @NameInMap("BatchOperateCardsTaskId")
    @Validation(required = true)
    private String batchOperateCardsTaskId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("EffectType")
    private String effectType;

    @Query
    @NameInMap("Iccids")
    private java.util.List < String > iccids;

    @Query
    @NameInMap("IccidsOssFilePath")
    private String iccidsOssFilePath;

    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("OperateType")
    private String operateType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Threshold")
    private Long threshold;

    @Query
    @NameInMap("WirelessCloudConnectorIds")
    private java.util.List < String > wirelessCloudConnectorIds;

    private UpdateBatchOperateCardsTaskRequest(Builder builder) {
        super(builder);
        this.batchOperateCardsTaskId = builder.batchOperateCardsTaskId;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.effectType = builder.effectType;
        this.iccids = builder.iccids;
        this.iccidsOssFilePath = builder.iccidsOssFilePath;
        this.name = builder.name;
        this.operateType = builder.operateType;
        this.regionId = builder.regionId;
        this.threshold = builder.threshold;
        this.wirelessCloudConnectorIds = builder.wirelessCloudConnectorIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBatchOperateCardsTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return batchOperateCardsTaskId
     */
    public String getBatchOperateCardsTaskId() {
        return this.batchOperateCardsTaskId;
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return effectType
     */
    public String getEffectType() {
        return this.effectType;
    }

    /**
     * @return iccids
     */
    public java.util.List < String > getIccids() {
        return this.iccids;
    }

    /**
     * @return iccidsOssFilePath
     */
    public String getIccidsOssFilePath() {
        return this.iccidsOssFilePath;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return threshold
     */
    public Long getThreshold() {
        return this.threshold;
    }

    /**
     * @return wirelessCloudConnectorIds
     */
    public java.util.List < String > getWirelessCloudConnectorIds() {
        return this.wirelessCloudConnectorIds;
    }

    public static final class Builder extends Request.Builder<UpdateBatchOperateCardsTaskRequest, Builder> {
        private String batchOperateCardsTaskId; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String effectType; 
        private java.util.List < String > iccids; 
        private String iccidsOssFilePath; 
        private String name; 
        private String operateType; 
        private String regionId; 
        private Long threshold; 
        private java.util.List < String > wirelessCloudConnectorIds; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBatchOperateCardsTaskRequest request) {
            super(request);
            this.batchOperateCardsTaskId = request.batchOperateCardsTaskId;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.effectType = request.effectType;
            this.iccids = request.iccids;
            this.iccidsOssFilePath = request.iccidsOssFilePath;
            this.name = request.name;
            this.operateType = request.operateType;
            this.regionId = request.regionId;
            this.threshold = request.threshold;
            this.wirelessCloudConnectorIds = request.wirelessCloudConnectorIds;
        } 

        /**
         * BatchOperateCardsTaskId.
         */
        public Builder batchOperateCardsTaskId(String batchOperateCardsTaskId) {
            this.putQueryParameter("BatchOperateCardsTaskId", batchOperateCardsTaskId);
            this.batchOperateCardsTaskId = batchOperateCardsTaskId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * EffectType.
         */
        public Builder effectType(String effectType) {
            this.putQueryParameter("EffectType", effectType);
            this.effectType = effectType;
            return this;
        }

        /**
         * Iccids.
         */
        public Builder iccids(java.util.List < String > iccids) {
            this.putQueryParameter("Iccids", iccids);
            this.iccids = iccids;
            return this;
        }

        /**
         * IccidsOssFilePath.
         */
        public Builder iccidsOssFilePath(String iccidsOssFilePath) {
            this.putQueryParameter("IccidsOssFilePath", iccidsOssFilePath);
            this.iccidsOssFilePath = iccidsOssFilePath;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Threshold.
         */
        public Builder threshold(Long threshold) {
            this.putQueryParameter("Threshold", threshold);
            this.threshold = threshold;
            return this;
        }

        /**
         * WirelessCloudConnectorIds.
         */
        public Builder wirelessCloudConnectorIds(java.util.List < String > wirelessCloudConnectorIds) {
            this.putQueryParameter("WirelessCloudConnectorIds", wirelessCloudConnectorIds);
            this.wirelessCloudConnectorIds = wirelessCloudConnectorIds;
            return this;
        }

        @Override
        public UpdateBatchOperateCardsTaskRequest build() {
            return new UpdateBatchOperateCardsTaskRequest(this);
        } 

    } 

}
