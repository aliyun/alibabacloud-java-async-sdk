// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link ModifyUserDefinedSgRequest} extends {@link RequestModel}
 *
 * <p>ModifyUserDefinedSgRequest</p>
 */
public class ModifyUserDefinedSgRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SgIdList")
    private java.util.List<String> sgIdList;

    private ModifyUserDefinedSgRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.sgIdList = builder.sgIdList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyUserDefinedSgRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return sgIdList
     */
    public java.util.List<String> getSgIdList() {
        return this.sgIdList;
    }

    public static final class Builder extends Request.Builder<ModifyUserDefinedSgRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private java.util.List<String> sgIdList; 

        private Builder() {
            super();
        } 

        private Builder(ModifyUserDefinedSgRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.sgIdList = request.sgIdList;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SgIdList.
         */
        public Builder sgIdList(java.util.List<String> sgIdList) {
            String sgIdListShrink = shrink(sgIdList, "SgIdList", "json");
            this.putQueryParameter("SgIdList", sgIdListShrink);
            this.sgIdList = sgIdList;
            return this;
        }

        @Override
        public ModifyUserDefinedSgRequest build() {
            return new ModifyUserDefinedSgRequest(this);
        } 

    } 

}
