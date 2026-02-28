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
 * {@link UpdateSoundCodeLabelRequest} extends {@link RequestModel}
 *
 * <p>UpdateSoundCodeLabelRequest</p>
 */
public class UpdateSoundCodeLabelRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Label")
    @com.aliyun.core.annotation.Validation(required = true)
    private String label;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoundCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String soundCode;

    private UpdateSoundCodeLabelRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.label = builder.label;
        this.soundCode = builder.soundCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSoundCodeLabelRequest create() {
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
     * @return soundCode
     */
    public String getSoundCode() {
        return this.soundCode;
    }

    public static final class Builder extends Request.Builder<UpdateSoundCodeLabelRequest, Builder> {
        private String iotInstanceId; 
        private String label; 
        private String soundCode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSoundCodeLabelRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.label = request.label;
            this.soundCode = request.soundCode;
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
        public Builder soundCode(String soundCode) {
            this.putBodyParameter("SoundCode", soundCode);
            this.soundCode = soundCode;
            return this;
        }

        @Override
        public UpdateSoundCodeLabelRequest build() {
            return new UpdateSoundCodeLabelRequest(this);
        } 

    } 

}
