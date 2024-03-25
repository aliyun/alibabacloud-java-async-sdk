// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCustomAuthConnectBlackRequest} extends {@link RequestModel}
 *
 * <p>QueryCustomAuthConnectBlackRequest</p>
 */
public class QueryCustomAuthConnectBlackRequest extends Request {
    @Query
    @NameInMap("ClientId")
    private String clientId;

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

    private QueryCustomAuthConnectBlackRequest(Builder builder) {
        super(builder);
        this.clientId = builder.clientId;
        this.instanceId = builder.instanceId;
        this.nextToken = builder.nextToken;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomAuthConnectBlackRequest create() {
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

    public static final class Builder extends Request.Builder<QueryCustomAuthConnectBlackRequest, Builder> {
        private String clientId; 
        private String instanceId; 
        private String nextToken; 
        private Integer size; 

        private Builder() {
            super();
        } 

        private Builder(QueryCustomAuthConnectBlackRequest request) {
            super(request);
            this.clientId = request.clientId;
            this.instanceId = request.instanceId;
            this.nextToken = request.nextToken;
            this.size = request.size;
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

        @Override
        public QueryCustomAuthConnectBlackRequest build() {
            return new QueryCustomAuthConnectBlackRequest(this);
        } 

    } 

}
