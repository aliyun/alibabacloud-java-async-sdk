// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AnalyzeSQLLineageRequest} extends {@link RequestModel}
 *
 * <p>AnalyzeSQLLineageRequest</p>
 */
public class AnalyzeSQLLineageRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SqlContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sqlContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
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
         * <p>The database ID.</p>
         * <blockquote>
         * <p> You can call one of the <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a>, <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a>, and <a href="https://help.aliyun.com/document_detail/141869.html">GetDatabase</a> operations to obtain the database ID provided in the DatabaseId response parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123***</p>
         */
        public Builder dbId(Long dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
            return this;
        }

        /**
         * <p>The SQL statement.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>insert into a (id) select id from b;</p>
         */
        public Builder sqlContent(String sqlContent) {
            this.putQueryParameter("SqlContent", sqlContent);
            this.sqlContent = sqlContent;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <blockquote>
         * <p> To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3***</p>
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
