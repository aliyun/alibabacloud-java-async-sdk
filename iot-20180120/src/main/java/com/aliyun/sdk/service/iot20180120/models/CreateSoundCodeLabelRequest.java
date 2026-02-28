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
 * {@link CreateSoundCodeLabelRequest} extends {@link RequestModel}
 *
 * <p>CreateSoundCodeLabelRequest</p>
 */
public class CreateSoundCodeLabelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    @com.aliyun.core.annotation.Validation(required = true)
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ScheduleCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scheduleCode;

    private CreateSoundCodeLabelRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.label = builder.label;
        this.scheduleCode = builder.scheduleCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSoundCodeLabelRequest create() {
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
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return scheduleCode
     */
    public String getScheduleCode() {
        return this.scheduleCode;
    }

    public static final class Builder extends Request.Builder<CreateSoundCodeLabelRequest, Builder> {
        private String iotInstanceId; 
        private String label; 
        private String scheduleCode; 

        private Builder() {
            super();
        } 

        private Builder(CreateSoundCodeLabelRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.label = request.label;
            this.scheduleCode = request.scheduleCode;
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
         * <p>test</p>
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        public Builder scheduleCode(String scheduleCode) {
            this.putBodyParameter("ScheduleCode", scheduleCode);
            this.scheduleCode = scheduleCode;
            return this;
        }

        @Override
        public CreateSoundCodeLabelRequest build() {
            return new CreateSoundCodeLabelRequest(this);
        } 

    } 

}
