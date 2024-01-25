// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStoreConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateStoreConfigRequest</p>
 */
public class UpdateStoreConfigRequest extends Request {
    @Body
    @NameInMap("EnableNotification")
    private Boolean enableNotification;

    @Body
    @NameInMap("ExtraParams")
    private String extraParams;

    @Body
    @NameInMap("NotificationSilentTimes")
    private String notificationSilentTimes;

    @Body
    @NameInMap("NotificationWebHook")
    private String notificationWebHook;

    @Body
    @NameInMap("StoreId")
    @Validation(required = true)
    private String storeId;

    @Body
    @NameInMap("SubscribeContents")
    private String subscribeContents;

    private UpdateStoreConfigRequest(Builder builder) {
        super(builder);
        this.enableNotification = builder.enableNotification;
        this.extraParams = builder.extraParams;
        this.notificationSilentTimes = builder.notificationSilentTimes;
        this.notificationWebHook = builder.notificationWebHook;
        this.storeId = builder.storeId;
        this.subscribeContents = builder.subscribeContents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStoreConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableNotification
     */
    public Boolean getEnableNotification() {
        return this.enableNotification;
    }

    /**
     * @return extraParams
     */
    public String getExtraParams() {
        return this.extraParams;
    }

    /**
     * @return notificationSilentTimes
     */
    public String getNotificationSilentTimes() {
        return this.notificationSilentTimes;
    }

    /**
     * @return notificationWebHook
     */
    public String getNotificationWebHook() {
        return this.notificationWebHook;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    /**
     * @return subscribeContents
     */
    public String getSubscribeContents() {
        return this.subscribeContents;
    }

    public static final class Builder extends Request.Builder<UpdateStoreConfigRequest, Builder> {
        private Boolean enableNotification; 
        private String extraParams; 
        private String notificationSilentTimes; 
        private String notificationWebHook; 
        private String storeId; 
        private String subscribeContents; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStoreConfigRequest request) {
            super(request);
            this.enableNotification = request.enableNotification;
            this.extraParams = request.extraParams;
            this.notificationSilentTimes = request.notificationSilentTimes;
            this.notificationWebHook = request.notificationWebHook;
            this.storeId = request.storeId;
            this.subscribeContents = request.subscribeContents;
        } 

        /**
         * EnableNotification.
         */
        public Builder enableNotification(Boolean enableNotification) {
            this.putBodyParameter("EnableNotification", enableNotification);
            this.enableNotification = enableNotification;
            return this;
        }

        /**
         * ExtraParams.
         */
        public Builder extraParams(String extraParams) {
            this.putBodyParameter("ExtraParams", extraParams);
            this.extraParams = extraParams;
            return this;
        }

        /**
         * NotificationSilentTimes.
         */
        public Builder notificationSilentTimes(String notificationSilentTimes) {
            this.putBodyParameter("NotificationSilentTimes", notificationSilentTimes);
            this.notificationSilentTimes = notificationSilentTimes;
            return this;
        }

        /**
         * NotificationWebHook.
         */
        public Builder notificationWebHook(String notificationWebHook) {
            this.putBodyParameter("NotificationWebHook", notificationWebHook);
            this.notificationWebHook = notificationWebHook;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        /**
         * SubscribeContents.
         */
        public Builder subscribeContents(String subscribeContents) {
            this.putBodyParameter("SubscribeContents", subscribeContents);
            this.subscribeContents = subscribeContents;
            return this;
        }

        @Override
        public UpdateStoreConfigRequest build() {
            return new UpdateStoreConfigRequest(this);
        } 

    } 

}
