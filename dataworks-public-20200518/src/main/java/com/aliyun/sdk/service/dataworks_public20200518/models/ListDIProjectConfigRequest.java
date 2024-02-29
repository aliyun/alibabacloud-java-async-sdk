// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDIProjectConfigRequest} extends {@link RequestModel}
 *
 * <p>ListDIProjectConfigRequest</p>
 */
public class ListDIProjectConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DestinationType")
    @Validation(required = true)
    private String destinationType;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true, maximum = 10000000000D, minimum = 1)
    private Long projectId;

    @Query
    @NameInMap("SourceType")
    private String sourceType;

    private ListDIProjectConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.destinationType = builder.destinationType;
        this.projectId = builder.projectId;
        this.sourceType = builder.sourceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDIProjectConfigRequest create() {
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
     * @return destinationType
     */
    public String getDestinationType() {
        return this.destinationType;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    public static final class Builder extends Request.Builder<ListDIProjectConfigRequest, Builder> {
        private String regionId; 
        private String destinationType; 
        private Long projectId; 
        private String sourceType; 

        private Builder() {
            super();
        } 

        private Builder(ListDIProjectConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.destinationType = request.destinationType;
            this.projectId = request.projectId;
            this.sourceType = request.sourceType;
        } 

        /**
         * The ID of the region in which the sync solution resides. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The type of the destination data source of the sync solution. This parameter cannot be left empty.
         * <p>
         * 
         * Valid values: analyticdb_for_mysql, odps, elasticsearch, holo, mysql, and polardb. You can call the ListDIProjectConfig operation to query the supported types of destination data sources.
         */
        public Builder destinationType(String destinationType) {
            this.putQueryParameter("DestinationType", destinationType);
            this.destinationType = destinationType;
            return this;
        }

        /**
         * The ID of the DataWorks workspace. You can log on to the [DataWorks console](https://workbench.data.aliyun.com/console) and go to the Workspace Management page to obtain the workspace ID.
         */
        public Builder projectId(Long projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * The type of the source data source of the sync solution.
         * <p>
         * 
         * Valid values: oracle, mysql, polardb, datahub, drds, and analyticdb_for_mysql. You can call the ListDIProjectConfig operation to query the supported types of source data sources.
         * 
         * If you do not set this parameter, DataWorks applies the default global configuration to all the source data sources of the preceding types.
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        @Override
        public ListDIProjectConfigRequest build() {
            return new ListDIProjectConfigRequest(this);
        } 

    } 

}
