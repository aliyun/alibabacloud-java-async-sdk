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
 * {@link GetSoundCodeAudioRequest} extends {@link RequestModel}
 *
 * <p>GetSoundCodeAudioRequest</p>
 */
public class GetSoundCodeAudioRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoundCodeList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> soundCodeList;

    private GetSoundCodeAudioRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.soundCodeList = builder.soundCodeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSoundCodeAudioRequest create() {
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
     * @return soundCodeList
     */
    public java.util.List<String> getSoundCodeList() {
        return this.soundCodeList;
    }

    public static final class Builder extends Request.Builder<GetSoundCodeAudioRequest, Builder> {
        private String iotInstanceId; 
        private java.util.List<String> soundCodeList; 

        private Builder() {
            super();
        } 

        private Builder(GetSoundCodeAudioRequest request) {
            super(request);
            this.iotInstanceId = request.iotInstanceId;
            this.soundCodeList = request.soundCodeList;
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
         * <p>Md3ZiTL888K9llXDy7890***********</p>
         */
        public Builder soundCodeList(java.util.List<String> soundCodeList) {
            this.putBodyParameter("SoundCodeList", soundCodeList);
            this.soundCodeList = soundCodeList;
            return this;
        }

        @Override
        public GetSoundCodeAudioRequest build() {
            return new GetSoundCodeAudioRequest(this);
        } 

    } 

}
