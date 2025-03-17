// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link SetDirectorySsoStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDirectorySsoStatusRequest</p>
 */
public class SetDirectorySsoStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EnableSso")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean enableSso;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private SetDirectorySsoStatusRequest(Builder builder) {
        super(builder);
        this.directoryId = builder.directoryId;
        this.enableSso = builder.enableSso;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDirectorySsoStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return enableSso
     */
    public Boolean getEnableSso() {
        return this.enableSso;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetDirectorySsoStatusRequest, Builder> {
        private String directoryId; 
        private Boolean enableSso; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetDirectorySsoStatusRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.enableSso = request.enableSso;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The AD directory ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+dir-h95efs1mbukd9****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>Specifies whether to enable SSO. Valid values:</p>
         * <ul>
         * <li>true: enables SSO.</li>
         * <li>false: disables SSO.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableSso(Boolean enableSso) {
            this.putQueryParameter("EnableSso", enableSso);
            this.enableSso = enableSso;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetDirectorySsoStatusRequest build() {
            return new SetDirectorySsoStatusRequest(this);
        } 

    } 

}
