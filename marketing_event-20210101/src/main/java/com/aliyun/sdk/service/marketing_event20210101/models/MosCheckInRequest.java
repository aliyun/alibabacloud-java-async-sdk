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
 * {@link MosCheckInRequest} extends {@link RequestModel}
 *
 * <p>MosCheckInRequest</p>
 */
public class MosCheckInRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ActivityId")
    private String activityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtParam")
    private String extParam;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QrCode")
    private String qrCode;

    private MosCheckInRequest(Builder builder) {
        super(builder);
        this.activityId = builder.activityId;
        this.extParam = builder.extParam;
        this.qrCode = builder.qrCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MosCheckInRequest create() {
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
     * @return extParam
     */
    public String getExtParam() {
        return this.extParam;
    }

    /**
     * @return qrCode
     */
    public String getQrCode() {
        return this.qrCode;
    }

    public static final class Builder extends Request.Builder<MosCheckInRequest, Builder> {
        private String activityId; 
        private String extParam; 
        private String qrCode; 

        private Builder() {
            super();
        } 

        private Builder(MosCheckInRequest request) {
            super(request);
            this.activityId = request.activityId;
            this.extParam = request.extParam;
            this.qrCode = request.qrCode;
        } 

        /**
         * ActivityId.
         */
        public Builder activityId(String activityId) {
            this.putBodyParameter("ActivityId", activityId);
            this.activityId = activityId;
            return this;
        }

        /**
         * ExtParam.
         */
        public Builder extParam(String extParam) {
            this.putBodyParameter("ExtParam", extParam);
            this.extParam = extParam;
            return this;
        }

        /**
         * QrCode.
         */
        public Builder qrCode(String qrCode) {
            this.putBodyParameter("QrCode", qrCode);
            this.qrCode = qrCode;
            return this;
        }

        @Override
        public MosCheckInRequest build() {
            return new MosCheckInRequest(this);
        } 

    } 

}
