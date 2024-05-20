// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendBizCocChangeCallbackRequest} extends {@link RequestModel}
 *
 * <p>SendBizCocChangeCallbackRequest</p>
 */
public class SendBizCocChangeCallbackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlatformSessionId")
    private String platformSessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Result")
    private Boolean result;

    private SendBizCocChangeCallbackRequest(Builder builder) {
        super(builder);
        this.platformSessionId = builder.platformSessionId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendBizCocChangeCallbackRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return platformSessionId
     */
    public String getPlatformSessionId() {
        return this.platformSessionId;
    }

    /**
     * @return result
     */
    public Boolean getResult() {
        return this.result;
    }

    public static final class Builder extends Request.Builder<SendBizCocChangeCallbackRequest, Builder> {
        private String platformSessionId; 
        private Boolean result; 

        private Builder() {
            super();
        } 

        private Builder(SendBizCocChangeCallbackRequest request) {
            super(request);
            this.platformSessionId = request.platformSessionId;
            this.result = request.result;
        } 

        /**
         * PlatformSessionId.
         */
        public Builder platformSessionId(String platformSessionId) {
            this.putQueryParameter("PlatformSessionId", platformSessionId);
            this.platformSessionId = platformSessionId;
            return this;
        }

        /**
         * Result.
         */
        public Builder result(Boolean result) {
            this.putQueryParameter("Result", result);
            this.result = result;
            return this;
        }

        @Override
        public SendBizCocChangeCallbackRequest build() {
            return new SendBizCocChangeCallbackRequest(this);
        } 

    } 

}
