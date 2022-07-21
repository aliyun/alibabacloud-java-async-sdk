// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCpuRequest} extends {@link RequestModel}
 *
 * <p>StartCpuRequest</p>
 */
public class StartCpuRequest extends Request {
    @Query
    @NameInMap("IotId")
    @Validation(required = true)
    private String iotId;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("TargetValue")
    @Validation(required = true)
    private String targetValue;

    private StartCpuRequest(Builder builder) {
        super(builder);
        this.iotId = builder.iotId;
        this.iotInstanceId = builder.iotInstanceId;
        this.targetValue = builder.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCpuRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotId
     */
    public String getIotId() {
        return this.iotId;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return targetValue
     */
    public String getTargetValue() {
        return this.targetValue;
    }

    public static final class Builder extends Request.Builder<StartCpuRequest, Builder> {
        private String iotId; 
        private String iotInstanceId; 
        private String targetValue; 

        private Builder() {
            super();
        } 

        private Builder(StartCpuRequest request) {
            super(request);
            this.iotId = request.iotId;
            this.iotInstanceId = request.iotInstanceId;
            this.targetValue = request.targetValue;
        } 

        /**
         * IotId.
         */
        public Builder iotId(String iotId) {
            this.putQueryParameter("IotId", iotId);
            this.iotId = iotId;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * TargetValue.
         */
        public Builder targetValue(String targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        @Override
        public StartCpuRequest build() {
            return new StartCpuRequest(this);
        } 

    } 

}
