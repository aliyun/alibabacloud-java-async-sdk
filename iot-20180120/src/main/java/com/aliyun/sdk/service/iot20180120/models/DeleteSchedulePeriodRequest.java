// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSchedulePeriodRequest} extends {@link RequestModel}
 *
 * <p>DeleteSchedulePeriodRequest</p>
 */
public class DeleteSchedulePeriodRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("PeriodCode")
    @Validation(required = true)
    private String periodCode;

    private DeleteSchedulePeriodRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.periodCode = builder.periodCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSchedulePeriodRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return periodCode
     */
    public String getPeriodCode() {
        return this.periodCode;
    }

    public static final class Builder extends Request.Builder<DeleteSchedulePeriodRequest, Builder> {
        private String iotInstanceId; 
        private String periodCode; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSchedulePeriodRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.periodCode = request.periodCode;
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
         * PeriodCode.
         */
        public Builder periodCode(String periodCode) {
            this.putBodyParameter("PeriodCode", periodCode);
            this.periodCode = periodCode;
            return this;
        }

        @Override
        public DeleteSchedulePeriodRequest build() {
            return new DeleteSchedulePeriodRequest(this);
        } 

    } 

}
