// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link ModifyApsJobRequest} extends {@link RequestModel}
 *
 * <p>ModifyApsJobRequest</p>
 */
public class ModifyApsJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApsJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apsJobId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DbList")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PartitionList")
    private String partitionList;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyApsJobRequest(Builder builder) {
        super(builder);
        this.apsJobId = builder.apsJobId;
        this.dbList = builder.dbList;
        this.partitionList = builder.partitionList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApsJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apsJobId
     */
    public String getApsJobId() {
        return this.apsJobId;
    }

    /**
     * @return dbList
     */
    public String getDbList() {
        return this.dbList;
    }

    /**
     * @return partitionList
     */
    public String getPartitionList() {
        return this.partitionList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyApsJobRequest, Builder> {
        private String apsJobId; 
        private String dbList; 
        private String partitionList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApsJobRequest request) {
            super(request);
            this.apsJobId = request.apsJobId;
            this.dbList = request.dbList;
            this.partitionList = request.partitionList;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The job ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aps-bj1xxxxxx</p>
         */
        public Builder apsJobId(String apsJobId) {
            this.putBodyParameter("ApsJobId", apsJobId);
            this.apsJobId = apsJobId;
            return this;
        }

        /**
         * <p>The objects to be synchronized.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;EntireInstance&quot;:true}</p>
         */
        public Builder dbList(String dbList) {
            this.putBodyParameter("DbList", dbList);
            this.dbList = dbList;
            return this;
        }

        /**
         * <p>The partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder partitionList(String partitionList) {
            this.putBodyParameter("PartitionList", partitionList);
            this.partitionList = partitionList;
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
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyApsJobRequest build() {
            return new ModifyApsJobRequest(this);
        } 

    } 

}
