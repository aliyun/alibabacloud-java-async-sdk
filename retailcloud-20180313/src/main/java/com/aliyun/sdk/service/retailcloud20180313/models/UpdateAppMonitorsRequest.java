// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppMonitorsRequest} extends {@link RequestModel}
 *
 * <p>UpdateAppMonitorsRequest</p>
 */
public class UpdateAppMonitorsRequest extends Request {
    @Body
    @NameInMap("MainUserId")
    @Validation(required = true, maximum = 999999999999999D)
    private Long mainUserId;

    @Body
    @NameInMap("MonitorIds")
    private java.util.List < Long > monitorIds;

    @Body
    @NameInMap("SilenceTime")
    private String silenceTime;

    @Body
    @NameInMap("TemplateId")
    @Validation(required = true, maximum = 999999999999999D)
    private Long templateId;

    private UpdateAppMonitorsRequest(Builder builder) {
        super(builder);
        this.mainUserId = builder.mainUserId;
        this.monitorIds = builder.monitorIds;
        this.silenceTime = builder.silenceTime;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppMonitorsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return mainUserId
     */
    public Long getMainUserId() {
        return this.mainUserId;
    }

    /**
     * @return monitorIds
     */
    public java.util.List < Long > getMonitorIds() {
        return this.monitorIds;
    }

    /**
     * @return silenceTime
     */
    public String getSilenceTime() {
        return this.silenceTime;
    }

    /**
     * @return templateId
     */
    public Long getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<UpdateAppMonitorsRequest, Builder> {
        private Long mainUserId; 
        private java.util.List < Long > monitorIds; 
        private String silenceTime; 
        private Long templateId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAppMonitorsRequest request) {
            super(request);
            this.mainUserId = request.mainUserId;
            this.monitorIds = request.monitorIds;
            this.silenceTime = request.silenceTime;
            this.templateId = request.templateId;
        } 

        /**
         * MainUserId.
         */
        public Builder mainUserId(Long mainUserId) {
            this.putBodyParameter("MainUserId", mainUserId);
            this.mainUserId = mainUserId;
            return this;
        }

        /**
         * MonitorIds.
         */
        public Builder monitorIds(java.util.List < Long > monitorIds) {
            this.putBodyParameter("MonitorIds", monitorIds);
            this.monitorIds = monitorIds;
            return this;
        }

        /**
         * SilenceTime.
         */
        public Builder silenceTime(String silenceTime) {
            this.putBodyParameter("SilenceTime", silenceTime);
            this.silenceTime = silenceTime;
            return this;
        }

        /**
         * TemplateId.
         */
        public Builder templateId(Long templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public UpdateAppMonitorsRequest build() {
            return new UpdateAppMonitorsRequest(this);
        } 

    } 

}
