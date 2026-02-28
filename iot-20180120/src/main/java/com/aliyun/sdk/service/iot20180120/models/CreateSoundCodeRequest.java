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
 * {@link CreateSoundCodeRequest} extends {@link RequestModel}
 *
 * <p>CreateSoundCodeRequest</p>
 */
public class CreateSoundCodeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Duration")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer duration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IotInstanceId")
    private String iotInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OpenType")
    private String openType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SoundCodeContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String soundCodeContent;

    private CreateSoundCodeRequest(Builder builder) {
        super(builder);
        this.duration = builder.duration;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.openType = builder.openType;
        this.soundCodeContent = builder.soundCodeContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSoundCodeRequest create() {
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
     * @return openType
     */
    public String getOpenType() {
        return this.openType;
    }

    /**
     * @return soundCodeContent
     */
    public String getSoundCodeContent() {
        return this.soundCodeContent;
    }

    public static final class Builder extends Request.Builder<CreateSoundCodeRequest, Builder> {
        private Integer duration; 
        private String iotInstanceId; 
        private String name; 
        private String openType; 
        private String soundCodeContent; 

        private Builder() {
            super();
        } 

        private Builder(CreateSoundCodeRequest request) {
            super(request);
            this.duration = request.duration;
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.openType = request.openType;
            this.soundCodeContent = request.soundCodeContent;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
         * OpenType.
         */
        public Builder openType(String openType) {
            this.putBodyParameter("OpenType", openType);
            this.openType = openType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.taobao.com">www.taobao.com</a></p>
         */
        public Builder soundCodeContent(String soundCodeContent) {
            this.putBodyParameter("SoundCodeContent", soundCodeContent);
            this.soundCodeContent = soundCodeContent;
            return this;
        }

        @Override
        public CreateSoundCodeRequest build() {
            return new CreateSoundCodeRequest(this);
        } 

    } 

}
