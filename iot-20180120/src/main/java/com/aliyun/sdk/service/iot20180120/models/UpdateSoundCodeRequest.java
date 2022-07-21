// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSoundCodeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSoundCodeRequest</p>
 */
public class UpdateSoundCodeRequest extends Request {
    @Body
    @NameInMap("Duration")
    private Integer duration;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("Name")
    private String name;

    @Body
    @NameInMap("SoundCode")
    @Validation(required = true)
    private String soundCode;

    @Body
    @NameInMap("SoundCodeContent")
    private String soundCodeContent;

    private UpdateSoundCodeRequest(Builder builder) {
        super(builder);
        this.duration = builder.duration;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.soundCode = builder.soundCode;
        this.soundCodeContent = builder.soundCodeContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSoundCodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return soundCode
     */
    public String getSoundCode() {
        return this.soundCode;
    }

    /**
     * @return soundCodeContent
     */
    public String getSoundCodeContent() {
        return this.soundCodeContent;
    }

    public static final class Builder extends Request.Builder<UpdateSoundCodeRequest, Builder> {
        private Integer duration; 
        private String iotInstanceId; 
        private String name; 
        private String soundCode; 
        private String soundCodeContent; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSoundCodeRequest request) {
            super(request);
            this.duration = request.duration;
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.soundCode = request.soundCode;
            this.soundCodeContent = request.soundCodeContent;
        } 

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putBodyParameter("Duration", duration);
            this.duration = duration;
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
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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

        /**
         * SoundCodeContent.
         */
        public Builder soundCodeContent(String soundCodeContent) {
            this.putBodyParameter("SoundCodeContent", soundCodeContent);
            this.soundCodeContent = soundCodeContent;
            return this;
        }

        @Override
        public UpdateSoundCodeRequest build() {
            return new UpdateSoundCodeRequest(this);
        } 

    } 

}
