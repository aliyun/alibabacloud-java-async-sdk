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
 * {@link UpgradeVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeVersionRequest</p>
 */
public class UpgradeVersionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FastMode")
    private Boolean fastMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Minor")
    private Boolean minor;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetVersion;

    private UpgradeVersionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fastMode = builder.fastMode;
        this.instanceId = builder.instanceId;
        this.minor = builder.minor;
        this.targetVersion = builder.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeVersionRequest create() {
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
     * @return fastMode
     */
    public Boolean getFastMode() {
        return this.fastMode;
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

    /**
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public static final class Builder extends Request.Builder<UpgradeVersionRequest, Builder> {
        private String regionId; 
        private Boolean fastMode; 
        private String instanceId; 
        private Boolean minor; 
        private String targetVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeVersionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fastMode = request.fastMode;
            this.instanceId = request.instanceId;
            this.minor = request.minor;
            this.targetVersion = request.targetVersion;
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
         * FastMode.
         */
        public Builder fastMode(Boolean fastMode) {
            this.putQueryParameter("FastMode", fastMode);
            this.fastMode = fastMode;
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
         * <p>Specifies whether the minor version is upgraded. Default value: true. Valid values:</p>
         * <ul>
         * <li>true: The minor version is upgraded.</li>
         * <li>false: The major version is upgraded.</li>
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

        /**
         * <p>The version to which you want to upgrade.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3.3.2-1.77-1.6.4</p>
         */
        public Builder targetVersion(String targetVersion) {
            this.putQueryParameter("TargetVersion", targetVersion);
            this.targetVersion = targetVersion;
            return this;
        }

        @Override
        public UpgradeVersionRequest build() {
            return new UpgradeVersionRequest(this);
        } 

    } 

}
