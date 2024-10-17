// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DsgPlatformQueryProjectsAndSchemaFromMetaRequest} extends {@link RequestModel}
 *
 * <p>DsgPlatformQueryProjectsAndSchemaFromMetaRequest</p>
 */
public class DsgPlatformQueryProjectsAndSchemaFromMetaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String engineName;

    private DsgPlatformQueryProjectsAndSchemaFromMetaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.engineName = builder.engineName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgPlatformQueryProjectsAndSchemaFromMetaRequest create() {
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
     * @return engineName
     */
    public String getEngineName() {
        return this.engineName;
    }

    public static final class Builder extends Request.Builder<DsgPlatformQueryProjectsAndSchemaFromMetaRequest, Builder> {
        private String regionId; 
        private String engineName; 

        private Builder() {
            super();
        } 

        private Builder(DsgPlatformQueryProjectsAndSchemaFromMetaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.engineName = request.engineName;
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
         * <p>The type of the compute engine. Valid values:</p>
         * <ul>
         * <li>ODPS.ODPS</li>
         * <li>EMR</li>
         * <li>HOLO.POSTGRES</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EMR</p>
         */
        public Builder engineName(String engineName) {
            this.putQueryParameter("EngineName", engineName);
            this.engineName = engineName;
            return this;
        }

        @Override
        public DsgPlatformQueryProjectsAndSchemaFromMetaRequest build() {
            return new DsgPlatformQueryProjectsAndSchemaFromMetaRequest(this);
        } 

    } 

}
