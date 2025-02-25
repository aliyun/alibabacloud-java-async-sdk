// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdp20210402.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDefaultComponentsRequest} extends {@link RequestModel}
 *
 * <p>ListDefaultComponentsRequest</p>
 */
public class ListDefaultComponentsRequest extends Request {
    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    @Query
    @NameInMap("SecurityMode")
    private String securityMode;

    private ListDefaultComponentsRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.securityMode = builder.securityMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDefaultComponentsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return securityMode
     */
    public String getSecurityMode() {
        return this.securityMode;
    }

    public static final class Builder extends Request.Builder<ListDefaultComponentsRequest, Builder> {
        private String clusterType; 
        private String securityMode; 

        private Builder() {
            super();
        } 

        private Builder(ListDefaultComponentsRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.securityMode = request.securityMode;
        } 

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * SecurityMode.
         */
        public Builder securityMode(String securityMode) {
            this.putQueryParameter("SecurityMode", securityMode);
            this.securityMode = securityMode;
            return this;
        }

        @Override
        public ListDefaultComponentsRequest build() {
            return new ListDefaultComponentsRequest(this);
        } 

    } 

}
