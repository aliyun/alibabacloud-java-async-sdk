// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribePlayDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribePlayDetailRequest</p>
 */
public class DescribePlayDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayTs")
    private String playTs;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private DescribePlayDetailRequest(Builder builder) {
        super(builder);
        this.language = builder.language;
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
     * @return language
     */
    public String getLanguage() {
        return this.language;
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
        private String language; 
        private String playTs; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribePlayDetailRequest request) {
            super(request);
            this.language = request.language;
            this.playTs = request.playTs;
            this.sessionId = request.sessionId;
        } 

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
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
