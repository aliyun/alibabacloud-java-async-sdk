// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.marketing_event20210101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link VerifyActivityAdmissionRequest} extends {@link RequestModel}
 *
 * <p>VerifyActivityAdmissionRequest</p>
 */
public class VerifyActivityAdmissionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long activityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IdCardNo")
    @com.aliyun.core.annotation.Validation(required = true)
    private String idCardNo;

    private VerifyActivityAdmissionRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
        this.idCardNo = builder.idCardNo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static VerifyActivityAdmissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return activityId
     */
    public Long getActivityId() {
        return this.activityId;
    }

    /**
     * @return idCardNo
     */
    public String getIdCardNo() {
        return this.idCardNo;
    }

    public static final class Builder extends Request.Builder<VerifyActivityAdmissionRequest, Builder> {
        private Long activityId; 
        private String idCardNo; 

        private Builder() {
            super();
        } 

        private Builder(VerifyActivityAdmissionRequest request) {
            super(request);
            this.activityId = request.activityId;
            this.idCardNo = request.idCardNo;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder activityId(Long activityId) {
            this.putBodyParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder idCardNo(String idCardNo) {
            this.putBodyParameter("IdCardNo", idCardNo);
            this.idCardNo = idCardNo;
            return this;
        }

        @Override
        public VerifyActivityAdmissionRequest build() {
            return new VerifyActivityAdmissionRequest(this);
        } 

    } 

}
