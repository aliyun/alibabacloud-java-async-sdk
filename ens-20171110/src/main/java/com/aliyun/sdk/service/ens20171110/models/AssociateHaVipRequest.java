// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link AssociateHaVipRequest} extends {@link RequestModel}
 *
 * <p>AssociateHaVipRequest</p>
 */
public class AssociateHaVipRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaVipId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haVipId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    private AssociateHaVipRequest(Builder builder) {
        super(builder);
        this.haVipId = builder.haVipId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateHaVipRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return haVipId
     */
    public String getHaVipId() {
        return this.haVipId;
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

    public static final class Builder extends Request.Builder<AssociateHaVipRequest, Builder> {
        private String haVipId; 
        private String instanceId; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(AssociateHaVipRequest request) {
            super(request);
            this.haVipId = request.haVipId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
        } 

        /**
         * <p>The ID of the HAVIP.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>havip-5p14t****</p>
         */
        public Builder haVipId(String haVipId) {
            this.putQueryParameter("HaVipId", haVipId);
            this.haVipId = haVipId;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-50c4****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the instance to be associated with the HAVIP. Valid values:</p>
         * <ul>
         * <li>EnsInstance (default): ENS instance</li>
         * <li>NetworkInterface: elastic network interface (ENI)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EnsInstance</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        @Override
        public AssociateHaVipRequest build() {
            return new AssociateHaVipRequest(this);
        } 

    } 

}
