// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertContactWithAlertSettingIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertContactWithAlertSettingIdRequest</p>
 */
public class DescribeAlertContactWithAlertSettingIdRequest extends Request {
    @Body
    @NameInMap("AlertSettingId")
    @Validation(required = true)
    private Long alertSettingId;

    @Body
    @NameInMap("ContactType")
    private Long contactType;

    private DescribeAlertContactWithAlertSettingIdRequest(Builder builder) {
        super(builder);
        this.alertSettingId = builder.alertSettingId;
        this.contactType = builder.contactType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertContactWithAlertSettingIdRequest create() {
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
     * @return contactType
     */
    public Long getContactType() {
        return this.contactType;
    }

    public static final class Builder extends Request.Builder<DescribeAlertContactWithAlertSettingIdRequest, Builder> {
        private Long alertSettingId; 
        private Long contactType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertContactWithAlertSettingIdRequest request) {
            super(request);
            this.alertSettingId = request.alertSettingId;
            this.contactType = request.contactType;
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
         * ContactType.
         */
        public Builder contactType(Long contactType) {
            this.putBodyParameter("ContactType", contactType);
            this.contactType = contactType;
            return this;
        }

        @Override
        public DescribeAlertContactWithAlertSettingIdRequest build() {
            return new DescribeAlertContactWithAlertSettingIdRequest(this);
        } 

    } 

}
