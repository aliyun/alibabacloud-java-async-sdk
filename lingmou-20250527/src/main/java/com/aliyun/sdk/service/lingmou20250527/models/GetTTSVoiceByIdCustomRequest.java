// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.lingmou20250527.models;

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
 * {@link GetTTSVoiceByIdCustomRequest} extends {@link RequestModel}
 *
 * <p>GetTTSVoiceByIdCustomRequest</p>
 */
public class GetTTSVoiceByIdCustomRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("voiceId")
    private String voiceId;

    private GetTTSVoiceByIdCustomRequest(Builder builder) {
        super(builder);
        this.voiceId = builder.voiceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTTSVoiceByIdCustomRequest create() {
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

    public static final class Builder extends Request.Builder<GetTTSVoiceByIdCustomRequest, Builder> {
        private String voiceId; 

        private Builder() {
            super();
        } 

        private Builder(GetTTSVoiceByIdCustomRequest request) {
            super(request);
            this.voiceId = request.voiceId;
        } 

        /**
         * voiceId.
         */
        public Builder voiceId(String voiceId) {
            this.putQueryParameter("voiceId", voiceId);
            this.voiceId = voiceId;
            return this;
        }

        @Override
        public GetTTSVoiceByIdCustomRequest build() {
            return new GetTTSVoiceByIdCustomRequest(this);
        } 

    } 

}
