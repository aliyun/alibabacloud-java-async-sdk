// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyRCInstanceRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCInstanceRequest</p>
 */
public class ModifyRCInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoPay")
    private Boolean autoPay;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Direction")
    private String direction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private ModifyRCInstanceRequest(Builder builder) {
        super(builder);
        this.autoPay = builder.autoPay;
        this.direction = builder.direction;
        this.dryRun = builder.dryRun;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoPay
     */
    public Boolean getAutoPay() {
        return this.autoPay;
    }

    /**
     * @return direction
     */
    public String getDirection() {
        return this.direction;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyRCInstanceRequest, Builder> {
        private Boolean autoPay; 
        private String direction; 
        private Boolean dryRun; 
        private String instanceId; 
        private String instanceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCInstanceRequest request) {
            super(request);
            this.autoPay = request.autoPay;
            this.direction = request.direction;
            this.dryRun = request.dryRun;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to enable the automatic payment feature. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enables the feature. You must make sure that your account balance is sufficient.</li>
         * <li><strong>false</strong>: disables the feature. An unpaid order is generated.</li>
         * </ul>
         * <blockquote>
         * <p> If your account balance is insufficient, you can set AutoPay to false. In this case, an unpaid order is generated. You can complete the payment in the Expenses and Costs console.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder autoPay(Boolean autoPay) {
            this.putQueryParameter("AutoPay", autoPay);
            this.autoPay = autoPay;
            return this;
        }

        /**
         * <p>The type of the change that you want to perform on the instance. Valid values:</p>
         * <blockquote>
         * <p> This parameter is optional. The system can automatically determine whether the instance change is an upgrade or a downgrade. If you want to specify this parameter, take note of the following items:</p>
         * </blockquote>
         * <ul>
         * <li><strong>Upgrade</strong> (default): upgrades the instance type. Make sure that your account balance is sufficient.</li>
         * <li><strong>Down</strong>: downgrades the instance type. If the new instance type specified by InstanceType has lower specifications than the current instance type, set Direction to Down.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Up</p>
         */
        public Builder direction(String direction) {
            this.putQueryParameter("Direction", direction);
            this.direction = direction;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, service limits, and resource inventory.</li>
         * <li><strong>false</strong>: performs a dry run and performs the actual request. If the request passes the dry run, the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf62br2491p5l****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The new instance type. For more information about the instance types that are supported by RDS Custom instances, see <a href="https://help.aliyun.com/document_detail/2844823.html">Instance types of RDS Custom instances</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>mysql.i8.large.2cm</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hagnzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyRCInstanceRequest build() {
            return new ModifyRCInstanceRequest(this);
        } 

    } 

}
