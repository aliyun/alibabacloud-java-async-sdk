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
 * {@link GetDBTopologyRequest} extends {@link RequestModel}
 *
 * <p>GetDBTopologyRequest</p>
 */
public class GetDBTopologyRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicDbId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long logicDbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private GetDBTopologyRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.logicDbId = builder.logicDbId;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDBTopologyRequest create() {
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
     * @return logicDbId
     */
    public Long getLogicDbId() {
        return this.logicDbId;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<GetDBTopologyRequest, Builder> {
        private String regionId; 
        private Long logicDbId; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(GetDBTopologyRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.logicDbId = request.logicDbId;
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
         * <p>The ID of the logical database. You can call the <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/listlogicdatabases">ListLogicDatabases</a> or <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/searchdatabase">SearchDatabase</a> operation to query the ID of the logical database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>134***</p>
         */
        public Builder logicDbId(Long logicDbId) {
            this.putQueryParameter("LogicDbId", logicDbId);
            this.logicDbId = logicDbId;
            return this;
        }

        /**
         * <p>The ID of the tenant.</p>
         * <blockquote>
         * <p>To view the tenant ID, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see <a href="https://help.aliyun.com/document_detail/181330.html">Manage DMS tenants</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>43***</p>
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public GetDBTopologyRequest build() {
            return new GetDBTopologyRequest(this);
        } 

    } 

}
