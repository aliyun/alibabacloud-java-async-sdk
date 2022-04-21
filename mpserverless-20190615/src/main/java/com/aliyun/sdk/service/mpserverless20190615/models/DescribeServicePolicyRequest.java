// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServicePolicyRequest} extends {@link RequestModel}
 *
 * <p>DescribeServicePolicyRequest</p>
 */
public class DescribeServicePolicyRequest extends Request {
    @Body
    @NameInMap("CollectionName")
    private String collectionName;

    @Body
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private DescribeServicePolicyRequest(Builder builder) {
        super(builder);
        this.collectionName = builder.collectionName;
        this.serviceName = builder.serviceName;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServicePolicyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collectionName
     */
    public String getCollectionName() {
        return this.collectionName;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<DescribeServicePolicyRequest, Builder> {
        private String collectionName; 
        private String serviceName; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServicePolicyRequest request) {
            super(request);
            this.collectionName = request.collectionName;
            this.serviceName = request.serviceName;
            this.spaceId = request.spaceId;
        } 

        /**
         * CollectionName.
         */
        public Builder collectionName(String collectionName) {
            this.putBodyParameter("CollectionName", collectionName);
            this.collectionName = collectionName;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putBodyParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public DescribeServicePolicyRequest build() {
            return new DescribeServicePolicyRequest(this);
        } 

    } 

}
