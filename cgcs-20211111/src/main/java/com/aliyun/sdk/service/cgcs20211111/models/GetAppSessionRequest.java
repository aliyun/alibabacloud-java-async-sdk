// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAppSessionRequest} extends {@link RequestModel}
 *
 * <p>GetAppSessionRequest</p>
 */
public class GetAppSessionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomSessionId")
    private String customSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformSessionId")
    private String platformSessionId;

    private GetAppSessionRequest(Builder builder) {
        super(builder);
        this.customSessionId = builder.customSessionId;
        this.platformSessionId = builder.platformSessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customSessionId
     */
    public String getCustomSessionId() {
        return this.customSessionId;
    }

    /**
     * @return platformSessionId
     */
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    public static final class Builder extends Request.Builder<GetAppSessionRequest, Builder> {
        private String customSessionId; 
        private String platformSessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetAppSessionRequest request) {
            super(request);
            this.customSessionId = request.customSessionId;
            this.platformSessionId = request.platformSessionId;
        } 

        /**
         * CustomSessionId.
         */
        public Builder customSessionId(String customSessionId) {
            this.putQueryParameter("CustomSessionId", customSessionId);
            this.customSessionId = customSessionId;
            return this;
        }

        /**
         * PlatformSessionId.
         */
        public Builder platformSessionId(String platformSessionId) {
            this.putQueryParameter("PlatformSessionId", platformSessionId);
            this.platformSessionId = platformSessionId;
            return this;
        }

        @Override
        public GetAppSessionRequest build() {
            return new GetAppSessionRequest(this);
        } 

    } 

}
