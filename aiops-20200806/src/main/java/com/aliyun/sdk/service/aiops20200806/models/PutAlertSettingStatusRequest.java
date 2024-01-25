// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutAlertSettingStatusRequest} extends {@link RequestModel}
 *
 * <p>PutAlertSettingStatusRequest</p>
 */
public class PutAlertSettingStatusRequest extends Request {
    @Body
    @NameInMap("AlertSettingId")
    @Validation(required = true)
    private Long alertSettingId;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    @Body
    @NameInMap("SettingStatus")
    @Validation(required = true)
    private Long settingStatus;

    private PutAlertSettingStatusRequest(Builder builder) {
        super(builder);
        this.alertSettingId = builder.alertSettingId;
        this.operaUid = builder.operaUid;
        this.settingStatus = builder.settingStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAlertSettingStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertSettingId
     */
    public Long getAlertSettingId() {
        return this.alertSettingId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return settingStatus
     */
    public Long getSettingStatus() {
        return this.settingStatus;
    }

    public static final class Builder extends Request.Builder<PutAlertSettingStatusRequest, Builder> {
        private Long alertSettingId; 
        private String operaUid; 
        private Long settingStatus; 

        private Builder() {
            super();
        } 

        private Builder(PutAlertSettingStatusRequest request) {
            super(request);
            this.alertSettingId = request.alertSettingId;
            this.operaUid = request.operaUid;
            this.settingStatus = request.settingStatus;
        } 

        /**
         * AlertSettingId.
         */
        public Builder alertSettingId(Long alertSettingId) {
            this.putBodyParameter("AlertSettingId", alertSettingId);
            this.alertSettingId = alertSettingId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * SettingStatus.
         */
        public Builder settingStatus(Long settingStatus) {
            this.putBodyParameter("SettingStatus", settingStatus);
            this.settingStatus = settingStatus;
            return this;
        }

        @Override
        public PutAlertSettingStatusRequest build() {
            return new PutAlertSettingStatusRequest(this);
        } 

    } 

}
