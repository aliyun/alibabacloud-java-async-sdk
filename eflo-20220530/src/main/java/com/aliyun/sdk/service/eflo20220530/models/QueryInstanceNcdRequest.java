// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

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
 * {@link QueryInstanceNcdRequest} extends {@link RequestModel}
 *
 * <p>QueryInstanceNcdRequest</p>
 */
public class QueryInstanceNcdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId1")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId1;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId2")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId2;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private QueryInstanceNcdRequest(Builder builder) {
        super(builder);
        this.instanceId1 = builder.instanceId1;
        this.instanceId2 = builder.instanceId2;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryInstanceNcdRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId1
     */
    public String getInstanceId1() {
        return this.instanceId1;
    }

    /**
     * @return instanceId2
     */
    public String getInstanceId2() {
        return this.instanceId2;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<QueryInstanceNcdRequest, Builder> {
        private String instanceId1; 
        private String instanceId2; 
        private String instanceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(QueryInstanceNcdRequest request) {
            super(request);
            this.instanceId1 = request.instanceId1;
            this.instanceId2 = request.instanceId2;
            this.instanceType = request.instanceType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Instance 1ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lni-1235****</p>
         */
        public Builder instanceId1(String instanceId1) {
            this.putBodyParameter("InstanceId1", instanceId1);
            this.instanceId1 = instanceId1;
            return this;
        }

        /**
         * <p>Instance 2ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lni-1234****</p>
         */
        public Builder instanceId2(String instanceId2) {
            this.putBodyParameter("InstanceId2", instanceId2);
            this.instanceId2 = instanceId2;
            return this;
        }

        /**
         * <p>The parameter that specifies the instance type.</p>
         * <p>Valid value:</p>
         * <ul>
         * <li>node: Lingjun node.</li>
         * <li>lni: lingjun network interface controller.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lni</p>
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-wulanchabu</p>
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public QueryInstanceNcdRequest build() {
            return new QueryInstanceNcdRequest(this);
        } 

    } 

}
