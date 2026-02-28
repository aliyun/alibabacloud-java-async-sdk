// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link CreateSharePromotionActivityRequest} extends {@link RequestModel}
 *
 * <p>CreateSharePromotionActivityRequest</p>
 */
public class CreateSharePromotionActivityRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SharePromotionActivityName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sharePromotionActivityName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    private CreateSharePromotionActivityRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.iotInstanceId = builder.iotInstanceId;
        this.sharePromotionActivityName = builder.sharePromotionActivityName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSharePromotionActivityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return sharePromotionActivityName
     */
    public String getSharePromotionActivityName() {
        return this.sharePromotionActivityName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateSharePromotionActivityRequest, Builder> {
        private Long endTime; 
        private String iotInstanceId; 
        private String sharePromotionActivityName; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateSharePromotionActivityRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.iotInstanceId = request.iotInstanceId;
            this.sharePromotionActivityName = request.sharePromotionActivityName;
            this.startTime = request.startTime;
        } 

        /**
         * EndTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task01</p>
         */
        public Builder sharePromotionActivityName(String sharePromotionActivityName) {
            this.putBodyParameter("SharePromotionActivityName", sharePromotionActivityName);
            this.sharePromotionActivityName = sharePromotionActivityName;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateSharePromotionActivityRequest build() {
            return new CreateSharePromotionActivityRequest(this);
        } 

    } 

}
