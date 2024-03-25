// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCustomAuthPermissionRequest} extends {@link RequestModel}
 *
 * <p>QueryCustomAuthPermissionRequest</p>
 */
public class QueryCustomAuthPermissionRequest extends Request {
    @Query
    @NameInMap("Identity")
    private String identity;

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
    @NameInMap("Topic")
    private String topic;

    private QueryCustomAuthPermissionRequest(Builder builder) {
        super(builder);
        this.identity = builder.identity;
        this.identityType = builder.identityType;
        this.instanceId = builder.instanceId;
        this.nextToken = builder.nextToken;
        this.size = builder.size;
        this.topic = builder.topic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCustomAuthPermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identity
     */
    public String getIdentity() {
        return this.identity;
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
     * @return topic
     */
    public String getTopic() {
        return this.topic;
    }

    public static final class Builder extends Request.Builder<QueryCustomAuthPermissionRequest, Builder> {
        private String identity; 
        private String identityType; 
        private String instanceId; 
        private String nextToken; 
        private Integer size; 
        private String topic; 

        private Builder() {
            super();
        } 

        private Builder(QueryCustomAuthPermissionRequest request) {
            super(request);
            this.identity = request.identity;
            this.identityType = request.identityType;
            this.instanceId = request.instanceId;
            this.nextToken = request.nextToken;
            this.size = request.size;
            this.topic = request.topic;
        } 

        /**
         * Identity.
         */
        public Builder identity(String identity) {
            this.putQueryParameter("Identity", identity);
            this.identity = identity;
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
         * Topic.
         */
        public Builder topic(String topic) {
            this.putQueryParameter("Topic", topic);
            this.topic = topic;
            return this;
        }

        @Override
        public QueryCustomAuthPermissionRequest build() {
            return new QueryCustomAuthPermissionRequest(this);
        } 

    } 

}
