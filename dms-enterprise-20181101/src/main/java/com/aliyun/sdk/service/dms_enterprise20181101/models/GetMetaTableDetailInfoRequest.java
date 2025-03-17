// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link GetMetaTableDetailInfoRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTableDetailInfoRequest</p>
 */
public class GetMetaTableDetailInfoRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableGuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private GetMetaTableDetailInfoRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.tableGuid = builder.tableGuid;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableDetailInfoRequest create() {
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
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetMetaTableDetailInfoRequest, Builder> {
        private String regionId; 
        private String tableGuid; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaTableDetailInfoRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.tableGuid = request.tableGuid;
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
         * <p>The GUID of the table in Data Management (DMS).</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/141875.html">ListLogicTables</a> operation with ReturnGuid set to true to query the GUIDs of logical tables in a specific logical database.</p>
         * </li>
         * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation with ReturnGuid set to true to query the GUIDs of tables in a specific physical database.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IDB_L_9032.db-test.yuyang_test</p>
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the Manage DMS tenants topic.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetMetaTableDetailInfoRequest build() {
            return new GetMetaTableDetailInfoRequest(this);
        } 

    } 

}
