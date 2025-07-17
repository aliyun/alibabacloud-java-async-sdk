// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

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
 * {@link GrafanaWorkspaceVpcRegion} extends {@link TeaModel}
 *
 * <p>GrafanaWorkspaceVpcRegion</p>
 */
public class GrafanaWorkspaceVpcRegion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("regionName")
    private String regionName;

    private GrafanaWorkspaceVpcRegion(Builder builder) {
        this.regionId = builder.regionId;
        this.regionName = builder.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrafanaWorkspaceVpcRegion create() {
        return builder().build();
    }

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
     * @return regionName
     */
    public String getRegionName() {
        return this.regionName;
    }

    public static final class Builder {
        private String regionId; 
        private String regionName; 

        private Builder() {
        } 

        private Builder(GrafanaWorkspaceVpcRegion model) {
            this.regionId = model.regionId;
            this.regionName = model.regionName;
        } 

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * regionName.
         */
        public Builder regionName(String regionName) {
            this.regionName = regionName;
            return this;
        }

        public GrafanaWorkspaceVpcRegion build() {
            return new GrafanaWorkspaceVpcRegion(this);
        } 

    } 

}
