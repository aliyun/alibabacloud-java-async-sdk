// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAlertBusinessGroupWithAlertSettingIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeAlertBusinessGroupWithAlertSettingIdRequest</p>
 */
public class DescribeAlertBusinessGroupWithAlertSettingIdRequest extends Request {
    @Body
    @NameInMap("AlertSettingId")
    @Validation(required = true)
    private Long alertSettingId;

    private DescribeAlertBusinessGroupWithAlertSettingIdRequest(Builder builder) {
        super(builder);
        this.alertSettingId = builder.alertSettingId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAlertBusinessGroupWithAlertSettingIdRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeAlertBusinessGroupWithAlertSettingIdRequest, Builder> {
        private Long alertSettingId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAlertBusinessGroupWithAlertSettingIdRequest request) {
            super(request);
            this.alertSettingId = request.alertSettingId;
        } 

        /**
         * AlertSettingId.
         */
        public Builder alertSettingId(Long alertSettingId) {
            this.putBodyParameter("AlertSettingId", alertSettingId);
            this.alertSettingId = alertSettingId;
            return this;
        }

        @Override
        public DescribeAlertBusinessGroupWithAlertSettingIdRequest build() {
            return new DescribeAlertBusinessGroupWithAlertSettingIdRequest(this);
        } 

    } 

}
