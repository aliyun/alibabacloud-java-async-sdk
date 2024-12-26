// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link QueryCustomAuthConnectBlackRequest} extends {@link RequestModel}
 *
 * <p>QueryCustomAuthConnectBlackRequest</p>
 */
public class QueryCustomAuthConnectBlackRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientId")
    private String clientId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 100, minimum = 1)
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
         * <p>The ID of the client to be queried.</p>
         * 
         * <strong>example:</strong>
         * <p>GID_test@@@test</p>
         */
        public Builder clientId(String clientId) {
            this.putQueryParameter("ClientId", clientId);
            this.clientId = clientId;
            return this;
        }

        /**
         * <p>The ID of the ApsaraMQ for MQTT instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>post-111****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The token that marks the end position of the previous returned page. To obtain the next batch of data, call the operation again by using the value of NextToken returned by the previous request. If you call this operation for the first time or want to query all results, set NextToken to an empty string.</p>
         * 
         * <strong>example:</strong>
         * <p>xOfRU60sGEwN1OlFBIL8Ew==</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The number of clients to be queried. Maximum value: 100.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
