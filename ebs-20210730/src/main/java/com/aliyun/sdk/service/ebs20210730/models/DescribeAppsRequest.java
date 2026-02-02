// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link DescribeAppsRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppsRequest</p>
 */
public class DescribeAppsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppIds")
    private java.util.List<String> appIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppNames")
    private java.util.List<String> appNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Owner")
    private String owner;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DescribeAppsRequest(Builder builder) {
        super(builder);
        this.appIds = builder.appIds;
        this.appNames = builder.appNames;
        this.clientToken = builder.clientToken;
        this.owner = builder.owner;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appIds
     */
    public java.util.List<String> getAppIds() {
        return this.appIds;
    }

    /**
     * @return appNames
     */
    public java.util.List<String> getAppNames() {
        return this.appNames;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return owner
     */
    public String getOwner() {
        return this.owner;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeAppsRequest, Builder> {
        private java.util.List<String> appIds; 
        private java.util.List<String> appNames; 
        private String clientToken; 
        private String owner; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppsRequest request) {
            super(request);
            this.appIds = request.appIds;
            this.appNames = request.appNames;
            this.clientToken = request.clientToken;
            this.owner = request.owner;
            this.regionId = request.regionId;
        } 

        /**
         * AppIds.
         */
        public Builder appIds(java.util.List<String> appIds) {
            this.putQueryParameter("AppIds", appIds);
            this.appIds = appIds;
            return this;
        }

        /**
         * AppNames.
         */
        public Builder appNames(java.util.List<String> appNames) {
            this.putQueryParameter("AppNames", appNames);
            this.appNames = appNames;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Owner.
         */
        public Builder owner(String owner) {
            this.putQueryParameter("Owner", owner);
            this.owner = owner;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeAppsRequest build() {
            return new DescribeAppsRequest(this);
        } 

    } 

}
