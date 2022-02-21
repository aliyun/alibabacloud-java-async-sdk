// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetSpeechVoiceRequest} extends {@link RequestModel}
 *
 * <p>GetSpeechVoiceRequest</p>
 */
public class GetSpeechVoiceRequest extends Request {
    private GetSpeechVoiceRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSpeechVoiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<GetSpeechVoiceRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(GetSpeechVoiceRequest response) {
            super(response);
        } 

        @Override
        public GetSpeechVoiceRequest build() {
            return new GetSpeechVoiceRequest(this);
        } 

    } 

}
