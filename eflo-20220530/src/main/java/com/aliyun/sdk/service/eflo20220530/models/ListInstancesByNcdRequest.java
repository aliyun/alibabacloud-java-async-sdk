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
 * {@link ListInstancesByNcdRequest} extends {@link RequestModel}
 *
 * <p>ListInstancesByNcdRequest</p>
 */
public class ListInstancesByNcdRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxNcd")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer maxNcd;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ListInstancesByNcdRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.maxNcd = builder.maxNcd;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstancesByNcdRequest create() {
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
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return maxNcd
     */
    public Integer getMaxNcd() {
        return this.maxNcd;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListInstancesByNcdRequest, Builder> {
        private String instanceId; 
        private String instanceType; 
        private Integer maxNcd; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstancesByNcdRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.maxNcd = request.maxNcd;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lni-1234****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
         * <p>Maximum network communication distance</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder maxNcd(Integer maxNcd) {
            this.putBodyParameter("MaxNcd", maxNcd);
            this.maxNcd = maxNcd;
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
        public ListInstancesByNcdRequest build() {
            return new ListInstancesByNcdRequest(this);
        } 

    } 

}
