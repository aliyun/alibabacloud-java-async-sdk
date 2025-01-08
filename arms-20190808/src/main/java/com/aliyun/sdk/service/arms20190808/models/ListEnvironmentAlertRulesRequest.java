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
 * {@link ListEnvironmentAlertRulesRequest} extends {@link RequestModel}
 *
 * <p>ListEnvironmentAlertRulesRequest</p>
 */
public class ListEnvironmentAlertRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddonName")
    private String addonName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnvironmentId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String environmentId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    private ListEnvironmentAlertRulesRequest(Builder builder) {
        super(builder);
        this.addonName = builder.addonName;
        this.environmentId = builder.environmentId;
        this.regionId = builder.regionId;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentAlertRulesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addonName
     */
    public String getAddonName() {
        return this.addonName;
    }

    /**
     * @return environmentId
     */
    public String getEnvironmentId() {
        return this.environmentId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<ListEnvironmentAlertRulesRequest, Builder> {
        private String addonName; 
        private String environmentId; 
        private String regionId; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(ListEnvironmentAlertRulesRequest request) {
            super(request);
            this.addonName = request.addonName;
            this.environmentId = request.environmentId;
            this.regionId = request.regionId;
            this.scene = request.scene;
        } 

        /**
         * <p>The name of the add-on. You must specify AddonName or Scene.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql</p>
         */
        public Builder addonName(String addonName) {
            this.putQueryParameter("AddonName", addonName);
            this.addonName = addonName;
            return this;
        }

        /**
         * <p>The environment ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>env-xxx</p>
         */
        public Builder environmentId(String environmentId) {
            this.putQueryParameter("EnvironmentId", environmentId);
            this.environmentId = environmentId;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The scenario of the add-on. You must specify AddonName or Scene.</p>
         * 
         * <strong>example:</strong>
         * <p>database</p>
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public ListEnvironmentAlertRulesRequest build() {
            return new ListEnvironmentAlertRulesRequest(this);
        } 

    } 

}
