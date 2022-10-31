// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetCasterConfigRequest} extends {@link RequestModel}
 *
 * <p>SetCasterConfigRequest</p>
 */
public class SetCasterConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CallbackUrl")
    private String callbackUrl;

    @Query
    @NameInMap("CasterId")
    @Validation(required = true)
    private String casterId;

    @Query
    @NameInMap("CasterName")
    private String casterName;

    @Query
    @NameInMap("ChannelEnable")
    private Integer channelEnable;

    @Query
    @NameInMap("Delay")
    private Float delay;

    @Query
    @NameInMap("DomainName")
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ProgramEffect")
    private Integer programEffect;

    @Query
    @NameInMap("ProgramName")
    private String programName;

    @Query
    @NameInMap("RecordConfig")
    private String recordConfig;

    @Query
    @NameInMap("SideOutputUrl")
    private String sideOutputUrl;

    @Query
    @NameInMap("SideOutputUrlList")
    private String sideOutputUrlList;

    @Query
    @NameInMap("SyncGroupsConfig")
    private String syncGroupsConfig;

    @Query
    @NameInMap("TranscodeConfig")
    private String transcodeConfig;

    @Query
    @NameInMap("UrgentLiveStreamUrl")
    private String urgentLiveStreamUrl;

    @Query
    @NameInMap("UrgentMaterialId")
    private String urgentMaterialId;

    private SetCasterConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.callbackUrl = builder.callbackUrl;
        this.casterId = builder.casterId;
        this.casterName = builder.casterName;
        this.channelEnable = builder.channelEnable;
        this.delay = builder.delay;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.programEffect = builder.programEffect;
        this.programName = builder.programName;
        this.recordConfig = builder.recordConfig;
        this.sideOutputUrl = builder.sideOutputUrl;
        this.sideOutputUrlList = builder.sideOutputUrlList;
        this.syncGroupsConfig = builder.syncGroupsConfig;
        this.transcodeConfig = builder.transcodeConfig;
        this.urgentLiveStreamUrl = builder.urgentLiveStreamUrl;
        this.urgentMaterialId = builder.urgentMaterialId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetCasterConfigRequest create() {
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
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return casterId
     */
    public String getCasterId() {
        return this.casterId;
    }

    /**
     * @return casterName
     */
    public String getCasterName() {
        return this.casterName;
    }

    /**
     * @return channelEnable
     */
    public Integer getChannelEnable() {
        return this.channelEnable;
    }

    /**
     * @return delay
     */
    public Float getDelay() {
        return this.delay;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return programEffect
     */
    public Integer getProgramEffect() {
        return this.programEffect;
    }

    /**
     * @return programName
     */
    public String getProgramName() {
        return this.programName;
    }

    /**
     * @return recordConfig
     */
    public String getRecordConfig() {
        return this.recordConfig;
    }

    /**
     * @return sideOutputUrl
     */
    public String getSideOutputUrl() {
        return this.sideOutputUrl;
    }

    /**
     * @return sideOutputUrlList
     */
    public String getSideOutputUrlList() {
        return this.sideOutputUrlList;
    }

    /**
     * @return syncGroupsConfig
     */
    public String getSyncGroupsConfig() {
        return this.syncGroupsConfig;
    }

    /**
     * @return transcodeConfig
     */
    public String getTranscodeConfig() {
        return this.transcodeConfig;
    }

    /**
     * @return urgentLiveStreamUrl
     */
    public String getUrgentLiveStreamUrl() {
        return this.urgentLiveStreamUrl;
    }

    /**
     * @return urgentMaterialId
     */
    public String getUrgentMaterialId() {
        return this.urgentMaterialId;
    }

    public static final class Builder extends Request.Builder<SetCasterConfigRequest, Builder> {
        private String regionId; 
        private String callbackUrl; 
        private String casterId; 
        private String casterName; 
        private Integer channelEnable; 
        private Float delay; 
        private String domainName; 
        private Long ownerId; 
        private Integer programEffect; 
        private String programName; 
        private String recordConfig; 
        private String sideOutputUrl; 
        private String sideOutputUrlList; 
        private String syncGroupsConfig; 
        private String transcodeConfig; 
        private String urgentLiveStreamUrl; 
        private String urgentMaterialId; 

        private Builder() {
            super();
        } 

        private Builder(SetCasterConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.callbackUrl = request.callbackUrl;
            this.casterId = request.casterId;
            this.casterName = request.casterName;
            this.channelEnable = request.channelEnable;
            this.delay = request.delay;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.programEffect = request.programEffect;
            this.programName = request.programName;
            this.recordConfig = request.recordConfig;
            this.sideOutputUrl = request.sideOutputUrl;
            this.sideOutputUrlList = request.sideOutputUrlList;
            this.syncGroupsConfig = request.syncGroupsConfig;
            this.transcodeConfig = request.transcodeConfig;
            this.urgentLiveStreamUrl = request.urgentLiveStreamUrl;
            this.urgentMaterialId = request.urgentMaterialId;
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
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putQueryParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * CasterId.
         */
        public Builder casterId(String casterId) {
            this.putQueryParameter("CasterId", casterId);
            this.casterId = casterId;
            return this;
        }

        /**
         * CasterName.
         */
        public Builder casterName(String casterName) {
            this.putQueryParameter("CasterName", casterName);
            this.casterName = casterName;
            return this;
        }

        /**
         * ChannelEnable.
         */
        public Builder channelEnable(Integer channelEnable) {
            this.putQueryParameter("ChannelEnable", channelEnable);
            this.channelEnable = channelEnable;
            return this;
        }

        /**
         * Delay.
         */
        public Builder delay(Float delay) {
            this.putQueryParameter("Delay", delay);
            this.delay = delay;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * ProgramEffect.
         */
        public Builder programEffect(Integer programEffect) {
            this.putQueryParameter("ProgramEffect", programEffect);
            this.programEffect = programEffect;
            return this;
        }

        /**
         * ProgramName.
         */
        public Builder programName(String programName) {
            this.putQueryParameter("ProgramName", programName);
            this.programName = programName;
            return this;
        }

        /**
         * RecordConfig.
         */
        public Builder recordConfig(String recordConfig) {
            this.putQueryParameter("RecordConfig", recordConfig);
            this.recordConfig = recordConfig;
            return this;
        }

        /**
         * SideOutputUrl.
         */
        public Builder sideOutputUrl(String sideOutputUrl) {
            this.putQueryParameter("SideOutputUrl", sideOutputUrl);
            this.sideOutputUrl = sideOutputUrl;
            return this;
        }

        /**
         * SideOutputUrlList.
         */
        public Builder sideOutputUrlList(String sideOutputUrlList) {
            this.putQueryParameter("SideOutputUrlList", sideOutputUrlList);
            this.sideOutputUrlList = sideOutputUrlList;
            return this;
        }

        /**
         * SyncGroupsConfig.
         */
        public Builder syncGroupsConfig(String syncGroupsConfig) {
            this.putQueryParameter("SyncGroupsConfig", syncGroupsConfig);
            this.syncGroupsConfig = syncGroupsConfig;
            return this;
        }

        /**
         * TranscodeConfig.
         */
        public Builder transcodeConfig(String transcodeConfig) {
            this.putQueryParameter("TranscodeConfig", transcodeConfig);
            this.transcodeConfig = transcodeConfig;
            return this;
        }

        /**
         * UrgentLiveStreamUrl.
         */
        public Builder urgentLiveStreamUrl(String urgentLiveStreamUrl) {
            this.putQueryParameter("UrgentLiveStreamUrl", urgentLiveStreamUrl);
            this.urgentLiveStreamUrl = urgentLiveStreamUrl;
            return this;
        }

        /**
         * UrgentMaterialId.
         */
        public Builder urgentMaterialId(String urgentMaterialId) {
            this.putQueryParameter("UrgentMaterialId", urgentMaterialId);
            this.urgentMaterialId = urgentMaterialId;
            return this;
        }

        @Override
        public SetCasterConfigRequest build() {
            return new SetCasterConfigRequest(this);
        } 

    } 

}
