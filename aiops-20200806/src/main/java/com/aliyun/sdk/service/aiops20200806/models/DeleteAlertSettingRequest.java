// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAlertSettingRequest} extends {@link RequestModel}
 *
 * <p>DeleteAlertSettingRequest</p>
 */
public class DeleteAlertSettingRequest extends Request {
    @Body
    @NameInMap("AlertSettingId")
    @Validation(required = true)
    private Long alertSettingId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private DeleteAlertSettingRequest(Builder builder) {
        super(builder);
        this.alertSettingId = builder.alertSettingId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAlertSettingRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteAlertSettingRequest, Builder> {
        private Long alertSettingId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAlertSettingRequest request) {
            super(request);
            this.alertSettingId = request.alertSettingId;
            this.operaUid = request.operaUid;
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
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public DeleteAlertSettingRequest build() {
            return new DeleteAlertSettingRequest(this);
        } 

    } 

}
