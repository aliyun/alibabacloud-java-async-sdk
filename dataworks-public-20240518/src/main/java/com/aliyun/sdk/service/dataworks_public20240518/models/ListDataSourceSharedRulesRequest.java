// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListDataSourceSharedRulesRequest} extends {@link RequestModel}
 *
 * <p>ListDataSourceSharedRulesRequest</p>
 */
public class ListDataSourceSharedRulesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataSourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataSourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetProjectId")
    private Long targetProjectId;

    private ListDataSourceSharedRulesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataSourceId = builder.dataSourceId;
        this.targetProjectId = builder.targetProjectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDataSourceSharedRulesRequest create() {
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
     * @return dataSourceId
     */
    public Long getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * @return targetProjectId
     */
    public Long getTargetProjectId() {
        return this.targetProjectId;
    }

    public static final class Builder extends Request.Builder<ListDataSourceSharedRulesRequest, Builder> {
        private String regionId; 
        private Long dataSourceId; 
        private Long targetProjectId; 

        private Builder() {
            super();
        } 

        private Builder(ListDataSourceSharedRulesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataSourceId = request.dataSourceId;
            this.targetProjectId = request.targetProjectId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder dataSourceId(Long dataSourceId) {
            this.putQueryParameter("DataSourceId", dataSourceId);
            this.dataSourceId = dataSourceId;
            return this;
        }

        /**
         * TargetProjectId.
         */
        public Builder targetProjectId(Long targetProjectId) {
            this.putQueryParameter("TargetProjectId", targetProjectId);
            this.targetProjectId = targetProjectId;
            return this;
        }

        @Override
        public ListDataSourceSharedRulesRequest build() {
            return new ListDataSourceSharedRulesRequest(this);
        } 

    } 

}
