// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateOperationTicketRequest} extends {@link RequestModel}
 *
 * <p>CreateOperationTicketRequest</p>
 */
public class CreateOperationTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApproveComment")
    @com.aliyun.core.annotation.Validation(required = true)
    private String approveComment;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetAccountName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetAccountName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectEndTime")
    private Long effectEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EffectStartTime")
    private Long effectStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsOneTimeEffect")
    private Boolean isOneTimeEffect;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProtocolName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocolName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateOperationTicketRequest(Builder builder) {
        super(builder);
        this.approveComment = builder.approveComment;
        this.assetAccountName = builder.assetAccountName;
        this.assetId = builder.assetId;
        this.effectEndTime = builder.effectEndTime;
        this.effectStartTime = builder.effectStartTime;
        this.instanceId = builder.instanceId;
        this.isOneTimeEffect = builder.isOneTimeEffect;
        this.protocolName = builder.protocolName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOperationTicketRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return approveComment
     */
    public String getApproveComment() {
        return this.approveComment;
    }

    /**
     * @return assetAccountName
     */
    public String getAssetAccountName() {
        return this.assetAccountName;
    }

    /**
     * @return assetId
     */
    public String getAssetId() {
        return this.assetId;
    }

    /**
     * @return effectEndTime
     */
    public Long getEffectEndTime() {
        return this.effectEndTime;
    }

    /**
     * @return effectStartTime
     */
    public Long getEffectStartTime() {
        return this.effectStartTime;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isOneTimeEffect
     */
    public Boolean getIsOneTimeEffect() {
        return this.isOneTimeEffect;
    }

    /**
     * @return protocolName
     */
    public String getProtocolName() {
        return this.protocolName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateOperationTicketRequest, Builder> {
        private String approveComment; 
        private String assetAccountName; 
        private String assetId; 
        private Long effectEndTime; 
        private Long effectStartTime; 
        private String instanceId; 
        private Boolean isOneTimeEffect; 
        private String protocolName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOperationTicketRequest request) {
            super(request);
            this.approveComment = request.approveComment;
            this.assetAccountName = request.assetAccountName;
            this.assetId = request.assetId;
            this.effectEndTime = request.effectEndTime;
            this.effectStartTime = request.effectStartTime;
            this.instanceId = request.instanceId;
            this.isOneTimeEffect = request.isOneTimeEffect;
            this.protocolName = request.protocolName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder approveComment(String approveComment) {
            this.putQueryParameter("ApproveComment", approveComment);
            this.approveComment = approveComment;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>root</p>
         */
        public Builder assetAccountName(String assetAccountName) {
            this.putQueryParameter("AssetAccountName", assetAccountName);
            this.assetAccountName = assetAccountName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder assetId(String assetId) {
            this.putQueryParameter("AssetId", assetId);
            this.assetId = assetId;
            return this;
        }

        /**
         * EffectEndTime.
         */
        public Builder effectEndTime(Long effectEndTime) {
            this.putQueryParameter("EffectEndTime", effectEndTime);
            this.effectEndTime = effectEndTime;
            return this;
        }

        /**
         * EffectStartTime.
         */
        public Builder effectStartTime(Long effectStartTime) {
            this.putQueryParameter("EffectStartTime", effectStartTime);
            this.effectStartTime = effectStartTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-st220aw****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsOneTimeEffect.
         */
        public Builder isOneTimeEffect(Boolean isOneTimeEffect) {
            this.putQueryParameter("IsOneTimeEffect", isOneTimeEffect);
            this.isOneTimeEffect = isOneTimeEffect;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SSH</p>
         */
        public Builder protocolName(String protocolName) {
            this.putQueryParameter("ProtocolName", protocolName);
            this.protocolName = protocolName;
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

        @Override
        public CreateOperationTicketRequest build() {
            return new CreateOperationTicketRequest(this);
        } 

    } 

}
