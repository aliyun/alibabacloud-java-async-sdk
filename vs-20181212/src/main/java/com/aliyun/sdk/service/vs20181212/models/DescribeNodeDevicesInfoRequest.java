// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeDevicesInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodeDevicesInfoRequest</p>
 */
public class DescribeNodeDevicesInfoRequest extends Request {
    @Query
    @NameInMap("NodeName")
    private String nodeName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    private DescribeNodeDevicesInfoRequest(Builder builder) {
        super(builder);
        this.nodeName = builder.nodeName;
        this.ownerId = builder.ownerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeDevicesInfoRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeNodeDevicesInfoRequest, Builder> {
        private String nodeName; 
        private Long ownerId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodeDevicesInfoRequest response) {
            super(response);
            this.nodeName = response.nodeName;
            this.ownerId = response.ownerId;
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

        @Override
        public DescribeNodeDevicesInfoRequest build() {
            return new DescribeNodeDevicesInfoRequest(this);
        } 

    } 

}
