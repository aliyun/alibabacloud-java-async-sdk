// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qssj20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrendSearchRecordRequest} extends {@link RequestModel}
 *
 * <p>GetTrendSearchRecordRequest</p>
 */
public class GetTrendSearchRecordRequest extends Request {
    @Body
    @NameInMap("Key")
    private String key;

    private GetTrendSearchRecordRequest(Builder builder) {
        super(builder);
        this.key = builder.key;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTrendSearchRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    public static final class Builder extends Request.Builder<GetTrendSearchRecordRequest, Builder> {
        private String key; 

        private Builder() {
            super();
        } 

        private Builder(GetTrendSearchRecordRequest request) {
            super(request);
            this.key = request.key;
        } 

        /**
         * Key.
         */
        public Builder key(String key) {
            this.putBodyParameter("Key", key);
            this.key = key;
            return this;
        }

        @Override
        public GetTrendSearchRecordRequest build() {
            return new GetTrendSearchRecordRequest(this);
        } 

    } 

}
