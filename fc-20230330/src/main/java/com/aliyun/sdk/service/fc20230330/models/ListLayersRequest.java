// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

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
    @Query
    @NameInMap("limit")
    private Integer limit;

    @Query
    @NameInMap("nextToken")
    private String nextToken;

    @Query
    @NameInMap("official")
    private String official;

    @Query
    @NameInMap("prefix")
    private String prefix;

    @Query
    @NameInMap("public")
    private String _public;

    private ListLayersRequest(Builder builder) {
        super(builder);
        this.limit = builder.limit;
        this.nextToken = builder.nextToken;
        this.official = builder.official;
        this.prefix = builder.prefix;
        this._public = builder._public;
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
    public String getOfficial() {
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
    public String get_public() {
        return this._public;
    }

    public static final class Builder extends Request.Builder<ListLayersRequest, Builder> {
        private Integer limit; 
        private String nextToken; 
        private String official; 
        private String prefix; 
        private String _public; 

        private Builder() {
            super();
        } 

        private Builder(ListLayersRequest request) {
            super(request);
            this.limit = request.limit;
            this.nextToken = request.nextToken;
            this.official = request.official;
            this.prefix = request.prefix;
            this._public = request._public;
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
         * official.
         */
        public Builder official(String official) {
            this.putQueryParameter("official", official);
            this.official = official;
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
         * public.
         */
        public Builder _public(String _public) {
            this.putQueryParameter("public", _public);
            this._public = _public;
            return this;
        }

        @Override
        public ListLayersRequest build() {
            return new ListLayersRequest(this);
        } 

    } 

}
