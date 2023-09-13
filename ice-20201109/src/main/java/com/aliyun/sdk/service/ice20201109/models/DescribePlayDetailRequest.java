// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePlayDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayDetailRequest</p>
 */
public class DescribePlayDetailRequest extends Request {
    @Query
    @NameInMap("PlayTs")
    private String playTs;

    @Query
    @NameInMap("SessionId")
    @Validation(required = true)
    private String sessionId;

    private DescribePlayDetailRequest(Builder builder) {
        super(builder);
        this.playTs = builder.playTs;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePlayDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return playTs
     */
    public String getPlayTs() {
        return this.playTs;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<DescribePlayDetailRequest, Builder> {
        private String playTs; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlayDetailRequest request) {
            super(request);
            this.playTs = request.playTs;
            this.sessionId = request.sessionId;
        } 

        /**
         * PlayTs.
         */
        public Builder playTs(String playTs) {
            this.putQueryParameter("PlayTs", playTs);
            this.playTs = playTs;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public DescribePlayDetailRequest build() {
            return new DescribePlayDetailRequest(this);
        } 

    } 

}
