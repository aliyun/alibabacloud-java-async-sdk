// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutAlertIgnoreRequest} extends {@link RequestModel}
 *
 * <p>PutAlertIgnoreRequest</p>
 */
public class PutAlertIgnoreRequest extends Request {
    @Query
    @NameInMap("AlertId")
    @Validation(required = true)
    private Long alertId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    private PutAlertIgnoreRequest(Builder builder) {
        super(builder);
        this.alertId = builder.alertId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutAlertIgnoreRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alertId
     */
    public Long getAlertId() {
        return this.alertId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<PutAlertIgnoreRequest, Builder> {
        private Long alertId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(PutAlertIgnoreRequest request) {
            super(request);
            this.alertId = request.alertId;
            this.operaUid = request.operaUid;
        } 

        /**
         * AlertId.
         */
        public Builder alertId(Long alertId) {
            this.putQueryParameter("AlertId", alertId);
            this.alertId = alertId;
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
        public PutAlertIgnoreRequest build() {
            return new PutAlertIgnoreRequest(this);
        } 

    } 

}
