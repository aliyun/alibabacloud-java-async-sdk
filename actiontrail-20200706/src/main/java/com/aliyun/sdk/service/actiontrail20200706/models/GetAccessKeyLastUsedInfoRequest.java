// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessKeyLastUsedInfoRequest} extends {@link RequestModel}
 *
 * <p>GetAccessKeyLastUsedInfoRequest</p>
 */
public class GetAccessKeyLastUsedInfoRequest extends Request {
    @Query
    @NameInMap("AccessKey")
    @Validation(required = true)
    private String accessKey;

    private GetAccessKeyLastUsedInfoRequest(Builder builder) {
        super(builder);
        this.accessKey = builder.accessKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccessKeyLastUsedInfoRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKey
     */
    public String getAccessKey() {
        return this.accessKey;
    }

    public static final class Builder extends Request.Builder<GetAccessKeyLastUsedInfoRequest, Builder> {
        private String accessKey; 

        private Builder() {
            super();
        } 

        private Builder(GetAccessKeyLastUsedInfoRequest request) {
            super(request);
            this.accessKey = request.accessKey;
        } 

        /**
         * The AccessKey secret.
         */
        public Builder accessKey(String accessKey) {
            this.putQueryParameter("AccessKey", accessKey);
            this.accessKey = accessKey;
            return this;
        }

        @Override
        public GetAccessKeyLastUsedInfoRequest build() {
            return new GetAccessKeyLastUsedInfoRequest(this);
        } 

    } 

}
