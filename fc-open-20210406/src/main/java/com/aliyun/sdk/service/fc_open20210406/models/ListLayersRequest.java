// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLayersRequest} extends {@link RequestModel}
 *
 * <p>ListLayersRequest</p>
 */
public class ListLayersRequest extends Request {
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
    @NameInMap("official")
    private Boolean official;

    @Query
    @NameInMap("prefix")
    private String prefix;

    @Query
    @NameInMap("public")
    private Boolean _public;

    @Query
    @NameInMap("startKey")
    private String startKey;

    private ListLayersRequest(Builder builder) {
        super(builder);
        this.xFcAccountId = builder.xFcAccountId;
        this.xFcDate = builder.xFcDate;
        this.xFcTraceId = builder.xFcTraceId;
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.official = builder.official;
        this.prefix = builder.prefix;
        this._public = builder._public;
        this.startKey = builder.startKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayersRequest create() {
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
     * @return official
     */
    public Boolean getOfficial() {
        return this.official;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
    }

    /**
     * @return _public
     */
    public Boolean get_public() {
        return this._public;
    }

    /**
     * @return startKey
     */
    public String getStartKey() {
        return this.startKey;
    }

    public static final class Builder extends Request.Builder<ListLayersRequest, Builder> {
        private String xFcAccountId; 
        private String xFcDate; 
        private String xFcTraceId; 
        private Integer limit; 
        private String nextToken; 
        private Boolean official; 
        private String prefix; 
        private Boolean _public; 
        private String startKey; 

        private Builder() {
            super();
        } 

        private Builder(ListLayersRequest request) {
            super(request);
            this.xFcAccountId = request.xFcAccountId;
            this.xFcDate = request.xFcDate;
            this.xFcTraceId = request.xFcTraceId;
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.official = request.official;
            this.prefix = request.prefix;
            this._public = request._public;
            this.startKey = request.startKey;
        } 

        /**
         * The ID of your Alibaba Cloud account.
         */
        public Builder xFcAccountId(String xFcAccountId) {
            this.putHeaderParameter("X-Fc-Account-Id", xFcAccountId);
            this.xFcAccountId = xFcAccountId;
            return this;
        }

        /**
         * The time when the function is invoked. The format is: **EEE,d MMM yyyy HH:mm:ss GMT**.
         */
        public Builder xFcDate(String xFcDate) {
            this.putHeaderParameter("X-Fc-Date", xFcDate);
            this.xFcDate = xFcDate;
            return this;
        }

        /**
         * The trace ID of the request for Function Compute API.
         */
        public Builder xFcTraceId(String xFcTraceId) {
            this.putHeaderParameter("X-Fc-Trace-Id", xFcTraceId);
            this.xFcTraceId = xFcTraceId;
            return this;
        }

        /**
         * The maximum number of resources to return. Default value: 20. Maximum value: 100. The number of returned configurations is less than or equal to the specified number.
         */
        public Builder limit(Integer limit) {
            this.putQueryParameter("limit", limit);
            this.limit = limit;
            return this;
        }

        /**
         * The token required to obtain more results. If the number of resources exceeds the limit, the nextToken parameter is returned. You can include the parameter in subsequent calls to obtain more results. You do not need to provide this parameter in the first call.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Specifies whether to obtain the official public layer. When the official parameter is set to true, the public field does not take effect. The default value is false.
         */
        public Builder official(Boolean official) {
            this.putQueryParameter("official", official);
            this.official = official;
            return this;
        }

        /**
         * The name prefix of the layer. The names of returned resources must contain the prefix. If the name prefix is a, the names of returned resources must start with a.
         */
        public Builder prefix(String prefix) {
            this.putQueryParameter("prefix", prefix);
            this.prefix = prefix;
            return this;
        }

        /**
         * Specifies whether to obtain only the common layer. Default value: false.
         */
        public Builder _public(Boolean _public) {
            this.putQueryParameter("public", _public);
            this._public = _public;
            return this;
        }

        /**
         * The name of the start layer. The returned layers are sorted in alphabetical order, and the layers that include and follow the layer specified by the startKey parameter are returned.
         */
        public Builder startKey(String startKey) {
            this.putQueryParameter("startKey", startKey);
            this.startKey = startKey;
            return this;
        }

        @Override
        public ListLayersRequest build() {
            return new ListLayersRequest(this);
        } 

    } 

}
