// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tingwu20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTranscriptionPhrasesRequest} extends {@link RequestModel}
 *
 * <p>ListTranscriptionPhrasesRequest</p>
 */
public class ListTranscriptionPhrasesRequest extends Request {
    private ListTranscriptionPhrasesRequest(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTranscriptionPhrasesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    public static final class Builder extends Request.Builder<ListTranscriptionPhrasesRequest, Builder> {

        private Builder() {
            super();
        } 

        private Builder(ListTranscriptionPhrasesRequest request) {
            super(request);
        } 

        @Override
        public ListTranscriptionPhrasesRequest build() {
            return new ListTranscriptionPhrasesRequest(this);
        } 

    } 

}
