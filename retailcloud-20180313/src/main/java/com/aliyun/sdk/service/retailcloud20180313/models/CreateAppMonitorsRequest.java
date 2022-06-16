// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAppMonitorsRequest} extends {@link RequestModel}
 *
 * <p>CreateAppMonitorsRequest</p>
 */
public class CreateAppMonitorsRequest extends Request {
    @Query
    @NameInMap("AlarmTemplateId")
    @Validation(required = true, maximum = 999999999999999D)
    private Long alarmTemplateId;

    @Body
    @NameInMap("AppIds")
    private java.util.List < Long > appIds;

    @Query
    @NameInMap("EnvType")
    private Integer envType;

    @Query
    @NameInMap("MainUserId")
    @Validation(required = true, maximum = 999999999999999D)
    private Long mainUserId;

    @Query
    @NameInMap("SilenceTime")
    private String silenceTime;

    private CreateAppMonitorsRequest(Builder builder) {
        super(builder);
        this.alarmTemplateId = builder.alarmTemplateId;
        this.appIds = builder.appIds;
        this.envType = builder.envType;
        this.mainUserId = builder.mainUserId;
        this.silenceTime = builder.silenceTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAppMonitorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmTemplateId
     */
    public Long getAlarmTemplateId() {
        return this.alarmTemplateId;
    }

    /**
     * @return appIds
     */
    public java.util.List < Long > getAppIds() {
        return this.appIds;
    }

    /**
     * @return envType
     */
    public Integer getEnvType() {
        return this.envType;
    }

    /**
     * @return mainUserId
     */
    public Long getMainUserId() {
        return this.mainUserId;
    }

    /**
     * @return silenceTime
     */
    public String getSilenceTime() {
        return this.silenceTime;
    }

    public static final class Builder extends Request.Builder<CreateAppMonitorsRequest, Builder> {
        private Long alarmTemplateId; 
        private java.util.List < Long > appIds; 
        private Integer envType; 
        private Long mainUserId; 
        private String silenceTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateAppMonitorsRequest request) {
            super(request);
            this.alarmTemplateId = request.alarmTemplateId;
            this.appIds = request.appIds;
            this.envType = request.envType;
            this.mainUserId = request.mainUserId;
            this.silenceTime = request.silenceTime;
        } 

        /**
         * AlarmTemplateId.
         */
        public Builder alarmTemplateId(Long alarmTemplateId) {
            this.putQueryParameter("AlarmTemplateId", alarmTemplateId);
            this.alarmTemplateId = alarmTemplateId;
            return this;
        }

        /**
         * AppIds.
         */
        public Builder appIds(java.util.List < Long > appIds) {
            this.putBodyParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * EnvType.
         */
        public Builder envType(Integer envType) {
            this.putQueryParameter("EnvType", envType);
            this.envType = envType;
            return this;
        }

        /**
         * MainUserId.
         */
        public Builder mainUserId(Long mainUserId) {
            this.putQueryParameter("MainUserId", mainUserId);
            this.mainUserId = mainUserId;
            return this;
        }

        /**
         * SilenceTime.
         */
        public Builder silenceTime(String silenceTime) {
            this.putQueryParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        @Override
        public CreateAppMonitorsRequest build() {
            return new CreateAppMonitorsRequest(this);
        } 

    } 

}
