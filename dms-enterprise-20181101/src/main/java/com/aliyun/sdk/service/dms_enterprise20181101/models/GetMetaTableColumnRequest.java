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
 * {@link GetMetaTableColumnRequest} extends {@link RequestModel}
 *
 * <p>GetMetaTableColumnRequest</p>
 */
public class GetMetaTableColumnRequest extends Request {
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

    private GetMetaTableColumnRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.tableGuid = builder.tableGuid;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMetaTableColumnRequest create() {
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

    public static final class Builder extends Request.Builder<GetMetaTableColumnRequest, Builder> {
        private String regionId; 
        private String tableGuid; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetMetaTableColumnRequest request) {
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
         * <p>The globally unique identifier (GUID) of the table in Data Management (DMS).</p>
         * <ul>
         * <li>If the database to which the table belongs is a logical database, you can call the <a href="https://help.aliyun.com/document_detail/141875.html">ListLogicTables</a> operation to obtain the value of this parameter.</li>
         * <li>If the database to which the table belongs is a physical database, you can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to obtain the value of this parameter.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>IDB_40753****.qntest2.activity_setting</p>
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        /**
         * <p>The ID of the tenant. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to obtain the tenant ID.</p>
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
        public GetMetaTableColumnRequest build() {
            return new GetMetaTableColumnRequest(this);
        } 

    } 

}
