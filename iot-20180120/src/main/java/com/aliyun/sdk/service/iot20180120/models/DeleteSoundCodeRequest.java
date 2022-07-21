// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSoundCodeRequest} extends {@link RequestModel}
 *
 * <p>DeleteSoundCodeRequest</p>
 */
public class DeleteSoundCodeRequest extends Request {
    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("SoundCode")
    @Validation(required = true)
    private String soundCode;

    private DeleteSoundCodeRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.soundCode = builder.soundCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSoundCodeRequest create() {
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
     * @return soundCode
     */
    public String getSoundCode() {
        return this.soundCode;
    }

    public static final class Builder extends Request.Builder<DeleteSoundCodeRequest, Builder> {
        private String iotInstanceId; 
        private String soundCode; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSoundCodeRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
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
         * SoundCode.
         */
        public Builder soundCode(String soundCode) {
            this.putBodyParameter("SoundCode", soundCode);
            this.soundCode = soundCode;
            return this;
        }

        @Override
        public DeleteSoundCodeRequest build() {
            return new DeleteSoundCodeRequest(this);
        } 

    } 

}
