// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link QueryUpgradableVersionsRequest} extends {@link RequestModel}
 *
 * <p>QueryUpgradableVersionsRequest</p>
 */
public class QueryUpgradableVersionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Minor")
    private Boolean minor;

    private QueryUpgradableVersionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.minor = builder.minor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryUpgradableVersionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return minor
     */
    public Boolean getMinor() {
        return this.minor;
    }

    public static final class Builder extends Request.Builder<QueryUpgradableVersionsRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private Boolean minor; 

        private Builder() {
            super();
        } 

        private Builder(QueryUpgradableVersionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.minor = request.minor;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to query the minor versions that you can upgrade to. Default value: true. Valid values:</p>
         * <ul>
         * <li>true: The minor versions that you can upgrade to.</li>
         * <li>false: The major versions that you can upgrade to.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder minor(Boolean minor) {
            this.putQueryParameter("Minor", minor);
            this.minor = minor;
            return this;
        }

        @Override
        public QueryUpgradableVersionsRequest build() {
            return new QueryUpgradableVersionsRequest(this);
        } 

    } 

}
