// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CreateConsumerRequest} extends {@link RequestModel}
 *
 * <p>CreateConsumerRequest</p>
 */
public class CreateConsumerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConsumerGroupName")
    private String consumerGroupName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyType")
    private String keyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NickName")
    private String nickName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CreateConsumerRequest(Builder builder) {
        super(builder);
        this.consumerGroupName = builder.consumerGroupName;
        this.gwClusterId = builder.gwClusterId;
        this.keyType = builder.keyType;
        this.name = builder.name;
        this.nickName = builder.nickName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return consumerGroupName
     */
    public String getConsumerGroupName() {
        return this.consumerGroupName;
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return keyType
     */
    public String getKeyType() {
        return this.keyType;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nickName
     */
    public String getNickName() {
        return this.nickName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateConsumerRequest, Builder> {
        private String consumerGroupName; 
        private String gwClusterId; 
        private String keyType; 
        private String name; 
        private String nickName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsumerRequest request) {
            super(request);
            this.consumerGroupName = request.consumerGroupName;
            this.gwClusterId = request.gwClusterId;
            this.keyType = request.keyType;
            this.name = request.name;
            this.nickName = request.nickName;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The consumer group name.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-p3gk2oh55c**</p>
         */
        public Builder consumerGroupName(String consumerGroupName) {
            this.putQueryParameter("ConsumerGroupName", consumerGroupName);
            this.consumerGroupName = consumerGroupName;
            return this;
        }

        /**
         * <p>The gateway instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * <p>The key type. The only supported value is ApiKey.</p>
         * 
         * <strong>example:</strong>
         * <p>ApiKey</p>
         */
        public Builder keyType(String keyType) {
            this.putQueryParameter("KeyType", keyType);
            this.keyType = keyType;
            return this;
        }

        /**
         * <p>The user name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The user nickname.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder nickName(String nickName) {
            this.putQueryParameter("NickName", nickName);
            this.nickName = nickName;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateConsumerRequest build() {
            return new CreateConsumerRequest(this);
        } 

    } 

}
