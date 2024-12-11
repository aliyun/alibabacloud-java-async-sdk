// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSparkReplSessionRequest} extends {@link RequestModel}
 *
 * <p>GetSparkReplSessionRequest</p>
 */
public class GetSparkReplSessionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SessionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sessionId;

    private GetSparkReplSessionRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSparkReplSessionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return sessionId
     */
    public Long getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<GetSparkReplSessionRequest, Builder> {
        private String appId; 
        private Long sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetSparkReplSessionRequest request) {
            super(request);
            this.appId = request.appId;
            this.sessionId = request.sessionId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder sessionId(Long sessionId) {
            this.putBodyParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public GetSparkReplSessionRequest build() {
            return new GetSparkReplSessionRequest(this);
        } 

    } 

}
