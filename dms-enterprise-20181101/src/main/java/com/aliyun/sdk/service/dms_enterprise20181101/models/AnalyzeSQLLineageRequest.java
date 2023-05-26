// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AnalyzeSQLLineageRequest} extends {@link RequestModel}
 *
 * <p>AnalyzeSQLLineageRequest</p>
 */
public class AnalyzeSQLLineageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DbId")
    @Validation(required = true, minimum = 1)
    private Long dbId;

    @Query
    @NameInMap("SqlContent")
    @Validation(required = true)
    private String sqlContent;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private AnalyzeSQLLineageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dbId = builder.dbId;
        this.sqlContent = builder.sqlContent;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AnalyzeSQLLineageRequest create() {
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
     * @return dbId
     */
    public Long getDbId() {
        return this.dbId;
    }

    /**
     * @return sqlContent
     */
    public String getSqlContent() {
        return this.sqlContent;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<AnalyzeSQLLineageRequest, Builder> {
        private String regionId; 
        private Long dbId; 
        private String sqlContent; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(AnalyzeSQLLineageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dbId = request.dbId;
            this.sqlContent = request.sqlContent;
            this.tid = request.tid;
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
         * DbId.
         */
        public Builder dbId(Long dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * SqlContent.
         */
        public Builder sqlContent(String sqlContent) {
            this.putQueryParameter("SqlContent", sqlContent);
            this.sqlContent = sqlContent;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public AnalyzeSQLLineageRequest build() {
            return new AnalyzeSQLLineageRequest(this);
        } 

    } 

}
