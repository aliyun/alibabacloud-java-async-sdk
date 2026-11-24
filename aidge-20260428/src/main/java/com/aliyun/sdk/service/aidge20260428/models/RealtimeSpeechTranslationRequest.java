// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aidge20260428.models;

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
 * {@link RealtimeSpeechTranslationRequest} extends {@link RequestModel}
 *
 * <p>RealtimeSpeechTranslationRequest</p>
 */
public class RealtimeSpeechTranslationRequest extends Request {
    private RealtimeSpeechTranslationRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RealtimeSpeechTranslationRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<RealtimeSpeechTranslationRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(RealtimeSpeechTranslationRequest request) {
            super(request);
        } 

        @Override
        public RealtimeSpeechTranslationRequest build() {
            return new RealtimeSpeechTranslationRequest(this);
        } 

    } 

}
