// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeTransitRouterCapacityReservationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeTransitRouterCapacityReservationsRequest</p>
 */
public class DescribeTransitRouterCapacityReservationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TransitRouterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String transitRouterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Version")
    private String version;

    private DescribeTransitRouterCapacityReservationsRequest(Builder builder) {
        super(builder);
        this.transitRouterId = builder.transitRouterId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitRouterCapacityReservationsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return transitRouterId
     */
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeTransitRouterCapacityReservationsRequest, Builder> {
        private String transitRouterId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeTransitRouterCapacityReservationsRequest request) {
            super(request);
            this.transitRouterId = request.transitRouterId;
            this.version = request.version;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-uf6llz2286805i44g****</p>
         */
        public Builder transitRouterId(String transitRouterId) {
            this.putQueryParameter("TransitRouterId", transitRouterId);
            this.transitRouterId = transitRouterId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeTransitRouterCapacityReservationsRequest build() {
            return new DescribeTransitRouterCapacityReservationsRequest(this);
        } 

    } 

}
