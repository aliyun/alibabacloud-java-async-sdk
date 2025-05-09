// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link ListSmartVoiceGroupsRequest} extends {@link RequestModel}
 *
 * <p>ListSmartVoiceGroupsRequest</p>
 */
public class ListSmartVoiceGroupsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceType")
    private String voiceType;

    private ListSmartVoiceGroupsRequest(Builder builder) {
        super(builder);
        this.voiceType = builder.voiceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListSmartVoiceGroupsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return voiceType
     */
    public String getVoiceType() {
        return this.voiceType;
    }

    public static final class Builder extends Request.Builder<ListSmartVoiceGroupsRequest, Builder> {
        private String voiceType; 

        private Builder() {
            super();
        } 

        private Builder(ListSmartVoiceGroupsRequest request) {
            super(request);
            this.voiceType = request.voiceType;
        } 

        /**
         * VoiceType.
         */
        public Builder voiceType(String voiceType) {
            this.putQueryParameter("VoiceType", voiceType);
            this.voiceType = voiceType;
            return this;
        }

        @Override
        public ListSmartVoiceGroupsRequest build() {
            return new ListSmartVoiceGroupsRequest(this);
        } 

    } 

}
