// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xrengine20230313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDigitalHumanProjectRequest} extends {@link RequestModel}
 *
 * <p>QueryDigitalHumanProjectRequest</p>
 */
public class QueryDigitalHumanProjectRequest extends Request {
    @Body
    @NameInMap("Ids")
    private String ids;

    @Query
    @NameInMap("JwtToken")
    private String jwtToken;

    private QueryDigitalHumanProjectRequest(Builder builder) {
        super(builder);
        this.ids = builder.ids;
        this.jwtToken = builder.jwtToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDigitalHumanProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ids
     */
    public String getIds() {
        return this.ids;
    }

    /**
     * @return jwtToken
     */
    public String getJwtToken() {
        return this.jwtToken;
    }

    public static final class Builder extends Request.Builder<QueryDigitalHumanProjectRequest, Builder> {
        private String ids; 
        private String jwtToken; 

        private Builder() {
            super();
        } 

        private Builder(QueryDigitalHumanProjectRequest request) {
            super(request);
            this.ids = request.ids;
            this.jwtToken = request.jwtToken;
        } 

        /**
         * Ids.
         */
        public Builder ids(String ids) {
            this.putBodyParameter("Ids", ids);
            this.ids = ids;
            return this;
        }

        /**
         * JwtToken.
         */
        public Builder jwtToken(String jwtToken) {
            this.putQueryParameter("JwtToken", jwtToken);
            this.jwtToken = jwtToken;
            return this;
        }

        @Override
        public QueryDigitalHumanProjectRequest build() {
            return new QueryDigitalHumanProjectRequest(this);
        } 

    } 

}
