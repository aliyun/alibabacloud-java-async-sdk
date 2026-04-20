// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adbai20250812.models;

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
 * {@link DescribeChatMessageRequest} extends {@link RequestModel}
 *
 * <p>DescribeChatMessageRequest</p>
 */
public class DescribeChatMessageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    @com.aliyun.core.annotation.Validation(required = true)
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Timezone")
    private String timezone;

    private DescribeChatMessageRequest(Builder builder) {
        super(builder);
        this.query = builder.query;
        this.regionId = builder.regionId;
        this.sessionId = builder.sessionId;
        this.timezone = builder.timezone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChatMessageRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    /**
     * @return timezone
     */
    public String getTimezone() {
        return this.timezone;
    }

    public static final class Builder extends Request.Builder<DescribeChatMessageRequest, Builder> {
        private String query; 
        private String regionId; 
        private String sessionId; 
        private String timezone; 

        private Builder() {
            super();
        } 

        private Builder(DescribeChatMessageRequest request) {
            super(request);
            this.query = request.query;
            this.regionId = request.regionId;
            this.sessionId = request.sessionId;
            this.timezone = request.timezone;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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

        /**
         * Timezone.
         */
        public Builder timezone(String timezone) {
            this.putQueryParameter("Timezone", timezone);
            this.timezone = timezone;
            return this;
        }

        @Override
        public DescribeChatMessageRequest build() {
            return new DescribeChatMessageRequest(this);
        } 

    } 

}
