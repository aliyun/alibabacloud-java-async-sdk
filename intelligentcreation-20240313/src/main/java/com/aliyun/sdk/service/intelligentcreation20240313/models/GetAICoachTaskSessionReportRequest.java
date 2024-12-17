// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link GetAICoachTaskSessionReportRequest} extends {@link RequestModel}
 *
 * <p>GetAICoachTaskSessionReportRequest</p>
 */
public class GetAICoachTaskSessionReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private GetAICoachTaskSessionReportRequest(Builder builder) {
        super(builder);
        this.sessionId = builder.sessionId;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAICoachTaskSessionReportRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder extends Request.Builder<GetAICoachTaskSessionReportRequest, Builder> {
        private String sessionId; 
        private String uid; 

        private Builder() {
            super();
        } 

        private Builder(GetAICoachTaskSessionReportRequest request) {
            super(request);
            this.sessionId = request.sessionId;
            this.uid = request.uid;
        } 

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.putQueryParameter("uid", uid);
            this.uid = uid;
            return this;
        }

        @Override
        public GetAICoachTaskSessionReportRequest build() {
            return new GetAICoachTaskSessionReportRequest(this);
        } 

    } 

}
