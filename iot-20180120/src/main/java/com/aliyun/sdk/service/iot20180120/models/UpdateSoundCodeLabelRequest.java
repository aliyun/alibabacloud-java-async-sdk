// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSoundCodeLabelRequest} extends {@link RequestModel}
 *
 * <p>UpdateSoundCodeLabelRequest</p>
 */
public class UpdateSoundCodeLabelRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("Label")
    @Validation(required = true)
    private String label;

    @Body
    @NameInMap("SoundCode")
    @Validation(required = true)
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
         * Label.
         */
        public Builder label(String label) {
            this.putBodyParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * SoundCode.
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
