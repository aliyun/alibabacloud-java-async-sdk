// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeExtensionsRequest} extends {@link RequestModel}
 *
 * <p>UpgradeExtensionsRequest</p>
 */
public class UpgradeExtensionsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extensions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extensions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UpgradeExtensionsRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.extensions = builder.extensions;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeExtensionsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return extensions
     */
    public String getExtensions() {
        return this.extensions;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpgradeExtensionsRequest, Builder> {
        private String DBInstanceId; 
        private String extensions; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeExtensionsRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.extensions = request.extensions;
            this.regionId = request.regionId;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Extensions.
         */
        public Builder extensions(String extensions) {
            this.putQueryParameter("Extensions", extensions);
            this.extensions = extensions;
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
        public UpgradeExtensionsRequest build() {
            return new UpgradeExtensionsRequest(this);
        } 

    } 

}
