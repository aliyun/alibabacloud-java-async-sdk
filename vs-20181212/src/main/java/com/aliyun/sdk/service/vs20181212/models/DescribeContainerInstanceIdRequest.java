// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeContainerInstanceIdRequest} extends {@link RequestModel}
 *
 * <p>DescribeContainerInstanceIdRequest</p>
 */
public class DescribeContainerInstanceIdRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PodIndex")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer podIndex;

    private DescribeContainerInstanceIdRequest(Builder builder) {
        super(builder);
        this.nodeName = builder.nodeName;
        this.ownerId = builder.ownerId;
        this.podIndex = builder.podIndex;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeContainerInstanceIdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return podIndex
     */
    public Integer getPodIndex() {
        return this.podIndex;
    }

    public static final class Builder extends Request.Builder<DescribeContainerInstanceIdRequest, Builder> {
        private String nodeName; 
        private Long ownerId; 
        private Integer podIndex; 

        private Builder() {
            super();
        } 

        private Builder(DescribeContainerInstanceIdRequest request) {
            super(request);
            this.nodeName = request.nodeName;
            this.ownerId = request.ownerId;
            this.podIndex = request.podIndex;
        } 

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.putQueryParameter("NodeName", nodeName);
            this.nodeName = nodeName;
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

        /**
         * PodIndex.
         */
        public Builder podIndex(Integer podIndex) {
            this.putQueryParameter("PodIndex", podIndex);
            this.podIndex = podIndex;
            return this;
        }

        @Override
        public DescribeContainerInstanceIdRequest build() {
            return new DescribeContainerInstanceIdRequest(this);
        } 

    } 

}
