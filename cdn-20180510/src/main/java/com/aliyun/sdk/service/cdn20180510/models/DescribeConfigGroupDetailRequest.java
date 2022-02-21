// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigGroupDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeConfigGroupDetailRequest</p>
 */
public class DescribeConfigGroupDetailRequest extends Request {
    @Query
    @NameInMap("ConfigGroupId")
    private String configGroupId;

    @Query
    @NameInMap("ConfigGroupName")
    private String configGroupName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeConfigGroupDetailRequest(Builder builder) {
        super(builder);
        this.configGroupId = builder.configGroupId;
        this.configGroupName = builder.configGroupName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigGroupDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configGroupId
     */
    public String getConfigGroupId() {
        return this.configGroupId;
    }

    /**
     * @return configGroupName
     */
    public String getConfigGroupName() {
        return this.configGroupName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    public static final class Builder extends Request.Builder<DescribeConfigGroupDetailRequest, Builder> {
        private String configGroupId; 
        private String configGroupName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeConfigGroupDetailRequest response) {
            super(response);
            this.configGroupId = response.configGroupId;
            this.configGroupName = response.configGroupName;
            this.ownerId = response.ownerId;
        } 

        /**
         * ConfigGroupId.
         */
        public Builder configGroupId(String configGroupId) {
            this.putQueryParameter("ConfigGroupId", configGroupId);
            this.configGroupId = configGroupId;
            return this;
        }

        /**
         * ConfigGroupName.
         */
        public Builder configGroupName(String configGroupName) {
            this.putQueryParameter("ConfigGroupName", configGroupName);
            this.configGroupName = configGroupName;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        @Override
        public DescribeConfigGroupDetailRequest build() {
            return new DescribeConfigGroupDetailRequest(this);
        } 

    } 

}
