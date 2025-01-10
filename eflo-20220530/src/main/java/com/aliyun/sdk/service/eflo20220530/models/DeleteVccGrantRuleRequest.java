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
 * {@link DeleteVccGrantRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteVccGrantRuleRequest</p>
 */
public class DeleteVccGrantRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErId")
    private String erId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GrantRuleId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String grantRuleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private DeleteVccGrantRuleRequest(Builder builder) {
        super(builder);
        this.erId = builder.erId;
        this.grantRuleId = builder.grantRuleId;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteVccGrantRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return erId
     */
    public String getErId() {
        return this.erId;
    }

    /**
     * @return grantRuleId
     */
    public String getGrantRuleId() {
        return this.grantRuleId;
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

    public static final class Builder extends Request.Builder<DeleteVccGrantRuleRequest, Builder> {
        private String erId; 
        private String grantRuleId; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteVccGrantRuleRequest request) {
            super(request);
            this.erId = request.erId;
            this.grantRuleId = request.grantRuleId;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Lingjun HUB ID</p>
         * 
         * <strong>example:</strong>
         * <p>er-kkopgtne</p>
         */
        public Builder erId(String erId) {
            this.putBodyParameter("ErId", erId);
            this.erId = erId;
            return this;
        }

        /**
         * <p>Authorization Entry ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>grant-rule-jaj34d75h01</p>
         */
        public Builder grantRuleId(String grantRuleId) {
            this.putBodyParameter("GrantRuleId", grantRuleId);
            this.grantRuleId = grantRuleId;
            return this;
        }

        /**
         * <p>Network Instance ID</p>
         * 
         * <strong>example:</strong>
         * <p>vcc-cn-jaj34d75h01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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
        public DeleteVccGrantRuleRequest build() {
            return new DeleteVccGrantRuleRequest(this);
        } 

    } 

}
