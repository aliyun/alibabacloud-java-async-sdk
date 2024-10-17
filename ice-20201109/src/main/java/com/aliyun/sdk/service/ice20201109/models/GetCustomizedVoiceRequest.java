// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetCustomizedVoiceRequest} extends {@link RequestModel}
 *
 * <p>GetCustomizedVoiceRequest</p>
 */
public class GetCustomizedVoiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceId")
    private String voiceId;

    private GetCustomizedVoiceRequest(Builder builder) {
        super(builder);
        this.voiceId = builder.voiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomizedVoiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return voiceId
     */
    public String getVoiceId() {
        return this.voiceId;
    }

    public static final class Builder extends Request.Builder<GetCustomizedVoiceRequest, Builder> {
        private String voiceId; 

        private Builder() {
            super();
        } 

        private Builder(GetCustomizedVoiceRequest request) {
            super(request);
            this.voiceId = request.voiceId;
        } 

        /**
         * VoiceId.
         */
        public Builder voiceId(String voiceId) {
            this.putQueryParameter("VoiceId", voiceId);
            this.voiceId = voiceId;
            return this;
        }

        @Override
        public GetCustomizedVoiceRequest build() {
            return new GetCustomizedVoiceRequest(this);
        } 

    } 

}
