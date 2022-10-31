// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveAudioAuditNotifyConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveAudioAuditNotifyConfigRequest</p>
 */
public class UpdateLiveAudioAuditNotifyConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Callback")
    private String callback;

    @Query
    @NameInMap("CallbackTemplate")
    private String callbackTemplate;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private UpdateLiveAudioAuditNotifyConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.callback = builder.callback;
        this.callbackTemplate = builder.callbackTemplate;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveAudioAuditNotifyConfigRequest create() {
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
     * @return callback
     */
    public String getCallback() {
        return this.callback;
    }

    /**
     * @return callbackTemplate
     */
    public String getCallbackTemplate() {
        return this.callbackTemplate;
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

    public static final class Builder extends Request.Builder<UpdateLiveAudioAuditNotifyConfigRequest, Builder> {
        private String regionId; 
        private String callback; 
        private String callbackTemplate; 
        private String domainName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveAudioAuditNotifyConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.callback = request.callback;
            this.callbackTemplate = request.callbackTemplate;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
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
         * Callback.
         */
        public Builder callback(String callback) {
            this.putQueryParameter("Callback", callback);
            this.callback = callback;
            return this;
        }

        /**
         * CallbackTemplate.
         */
        public Builder callbackTemplate(String callbackTemplate) {
            this.putQueryParameter("CallbackTemplate", callbackTemplate);
            this.callbackTemplate = callbackTemplate;
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

        @Override
        public UpdateLiveAudioAuditNotifyConfigRequest build() {
            return new UpdateLiveAudioAuditNotifyConfigRequest(this);
        } 

    } 

}
