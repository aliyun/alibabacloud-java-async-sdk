// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListEiamInstancesRequest} extends {@link RequestModel}
 *
 * <p>ListEiamInstancesRequest</p>
 */
public class ListEiamInstancesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceRegionId")
    @com.aliyun.core.annotation.Validation(maxLength = 32)
    private String instanceRegionId;

    private ListEiamInstancesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceIds = builder.instanceIds;
        this.instanceRegionId = builder.instanceRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEiamInstancesRequest create() {
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
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instanceRegionId
     */
    public String getInstanceRegionId() {
        return this.instanceRegionId;
    }

    public static final class Builder extends Request.Builder<ListEiamInstancesRequest, Builder> {
        private String regionId; 
        private java.util.List<String> instanceIds; 
        private String instanceRegionId; 

        private Builder() {
            super();
        } 

        private Builder(ListEiamInstancesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceIds = request.instanceIds;
            this.instanceRegionId = request.instanceRegionId;
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
         * <p>实例ID列表，支持0到100个</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>实例所属Region</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder instanceRegionId(String instanceRegionId) {
            this.putQueryParameter("InstanceRegionId", instanceRegionId);
            this.instanceRegionId = instanceRegionId;
            return this;
        }

        @Override
        public ListEiamInstancesRequest build() {
            return new ListEiamInstancesRequest(this);
        } 

    } 

}
