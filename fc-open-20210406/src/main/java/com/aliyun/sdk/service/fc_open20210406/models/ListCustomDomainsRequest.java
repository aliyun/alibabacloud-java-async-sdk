// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCustomDomainsRequest} extends {@link RequestModel}
 *
 * <p>ListCustomDomainsRequest</p>
 */
public class ListCustomDomainsRequest extends Request {
    @Header
    @NameInMap("X-Fc-Account-Id")
    private String xFcAccountId;

    @Header
    @NameInMap("X-Fc-Date")
    private String xFcDate;

    @Header
    @NameInMap("X-Fc-Trace-Id")
    private String xFcTraceId;

    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("prefix")
    private String prefix;

    @Query
    @NameInMap("startKey")
    private String startKey;

    private ListCustomDomainsRequest(Builder builder) {
        super(builder);
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.prefix = builder.prefix;
        this.startKey = builder.startKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCustomDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return xFcAccountId
     */
    public String getXFcAccountId() {
        return this.xFcAccountId;
    }

    /**
     * @return xFcDate
     */
    public String getXFcDate() {
        return this.xFcDate;
    }

    /**
     * @return xFcTraceId
     */
    public String getXFcTraceId() {
        return this.xFcTraceId;
    }

    /**
     * @return limit
     */
    public Integer getLimit() {
        return this.limit;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return startKey
     */
    public String getStartKey() {
        return this.startKey;
    }

    public static final class Builder extends Request.Builder<ListCustomDomainsRequest, Builder> {
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private Integer limit; 
        private String nextToken; 
        private String prefix; 
        private String startKey; 

        private Builder() {
            super();
        } 

        private Builder(ListCustomDomainsRequest response) {
            super(response);
            this.xFcAccountId = response.xFcAccountId;
            this.xFcDate = response.xFcDate;
            this.xFcTraceId = response.xFcTraceId;
            this.limit = response.limit;
            this.nextToken = response.nextToken;
            this.prefix = response.prefix;
            this.startKey = response.startKey;
        } 

        /**
         * X-Fc-Account-Id.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * X-Fc-Date.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * X-Fc-Trace-Id.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * limit.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * nextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * prefix.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * startKey.
         */
        public Builder startKey(String startKey) {
            this.putQueryParameter("startKey", startKey);
            this.startKey = startKey;
            return this;
        }

        @Override
        public ListCustomDomainsRequest build() {
            return new ListCustomDomainsRequest(this);
        } 

    } 

}
