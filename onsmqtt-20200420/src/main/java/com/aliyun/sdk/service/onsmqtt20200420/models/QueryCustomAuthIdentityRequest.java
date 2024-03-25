// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCustomAuthIdentityRequest} extends {@link RequestModel}
 *
 * <p>QueryCustomAuthIdentityRequest</p>
 */
public class QueryCustomAuthIdentityRequest extends Request {
    @Query
    @NameInMap("ClientId")
    private String clientId;

    @Query
    @NameInMap("IdentityType")
    private String identityType;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NextToken")
    private String nextToken;

    @Query
    @NameInMap("Size")
    @Validation(required = true, maximum = 100, minimum = 1)
    private Integer size;

    @Query
    @NameInMap("Username")
    private String username;

    private QueryCustomAuthIdentityRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.identityType = builder.identityType;
        this.instanceId = builder.instanceId;
        this.nextToken = builder.nextToken;
        this.size = builder.size;
        this.username = builder.username;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomAuthIdentityRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientId
     */
    public String getClientId() {
        return this.clientId;
    }

    /**
     * @return identityType
     */
    public String getIdentityType() {
        return this.identityType;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return size
     */
    public Integer getSize() {
        return this.size;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return this.username;
    }

    public static final class Builder extends Request.Builder<QueryCustomAuthIdentityRequest, Builder> {
        private String clientId; 
        private String identityType; 
        private String instanceId; 
        private String nextToken; 
        private Integer size; 
        private String username; 

        private Builder() {
            super();
        } 

        private Builder(QueryCustomAuthIdentityRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.identityType = request.identityType;
            this.instanceId = request.instanceId;
            this.nextToken = request.nextToken;
            this.size = request.size;
            this.username = request.username;
        } 

        /**
         * ClientId.
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * IdentityType.
         */
        public Builder identityType(String identityType) {
            this.putQueryParameter("IdentityType", identityType);
            this.identityType = identityType;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * Size.
         */
        public Builder size(Integer size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        /**
         * Username.
         */
        public Builder username(String username) {
            this.putQueryParameter("Username", username);
            this.username = username;
            return this;
        }

        @Override
        public QueryCustomAuthIdentityRequest build() {
            return new QueryCustomAuthIdentityRequest(this);
        } 

    } 

}
