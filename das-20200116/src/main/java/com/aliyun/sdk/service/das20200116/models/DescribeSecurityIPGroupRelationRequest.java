// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeSecurityIPGroupRelationRequest} extends {@link RequestModel}
 *
 * <p>DescribeSecurityIPGroupRelationRequest</p>
 */
public class DescribeSecurityIPGroupRelationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionName;

    private DescribeSecurityIPGroupRelationRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionName = builder.regionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSecurityIPGroupRelationRequest create() {
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
     * @return regionName
     */
    public String getRegionName() {
        return this.regionName;
    }

    public static final class Builder extends Request.Builder<DescribeSecurityIPGroupRelationRequest, Builder> {
        private String instanceId; 
        private String regionName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSecurityIPGroupRelationRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionName = request.regionName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2zegsc57ofexxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionName(String regionName) {
            this.putQueryParameter("RegionName", regionName);
            this.regionName = regionName;
            return this;
        }

        @Override
        public DescribeSecurityIPGroupRelationRequest build() {
            return new DescribeSecurityIPGroupRelationRequest(this);
        } 

    } 

}
