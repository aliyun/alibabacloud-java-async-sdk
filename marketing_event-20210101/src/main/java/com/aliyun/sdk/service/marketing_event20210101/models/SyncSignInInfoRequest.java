// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncSignInInfoRequest} extends {@link RequestModel}
 *
 * <p>SyncSignInInfoRequest</p>
 */
public class SyncSignInInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String activityId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QRCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String QRCode;

    private SyncSignInInfoRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
        this.QRCode = builder.QRCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncSignInInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityId
     */
    public String getActivityId() {
        return this.activityId;
    }

    /**
     * @return QRCode
     */
    public String getQRCode() {
        return this.QRCode;
    }

    public static final class Builder extends Request.Builder<SyncSignInInfoRequest, Builder> {
        private String activityId; 
        private String QRCode; 

        private Builder() {
            super();
        } 

        private Builder(SyncSignInInfoRequest request) {
            super(request);
            this.activityId = request.activityId;
            this.QRCode = request.QRCode;
        } 

        /**
         * ActivityId.
         */
        public Builder activityId(String activityId) {
            this.putQueryParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * QRCode.
         */
        public Builder QRCode(String QRCode) {
            this.putQueryParameter("QRCode", QRCode);
            this.QRCode = QRCode;
            return this;
        }

        @Override
        public SyncSignInInfoRequest build() {
            return new SyncSignInInfoRequest(this);
        } 

    } 

}
