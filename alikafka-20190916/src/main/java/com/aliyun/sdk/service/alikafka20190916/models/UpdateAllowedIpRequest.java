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
 * {@link UpdateAllowedIpRequest} extends {@link RequestModel}
 *
 * <p>UpdateAllowedIpRequest</p>
 */
public class UpdateAllowedIpRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowedListIp")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allowedListIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowedListType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String allowedListType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PortRange")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String updateType;

    private UpdateAllowedIpRequest(Builder builder) {
        super(builder);
        this.allowedListIp = builder.allowedListIp;
        this.allowedListType = builder.allowedListType;
        this.description = builder.description;
        this.instanceId = builder.instanceId;
        this.portRange = builder.portRange;
        this.regionId = builder.regionId;
        this.updateType = builder.updateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAllowedIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedListIp
     */
    public String getAllowedListIp() {
        return this.allowedListIp;
    }

    /**
     * @return allowedListType
     */
    public String getAllowedListType() {
        return this.allowedListType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return portRange
     */
    public String getPortRange() {
        return this.portRange;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return updateType
     */
    public String getUpdateType() {
        return this.updateType;
    }

    public static final class Builder extends Request.Builder<UpdateAllowedIpRequest, Builder> {
        private String allowedListIp; 
        private String allowedListType; 
        private String description; 
        private String instanceId; 
        private String portRange; 
        private String regionId; 
        private String updateType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAllowedIpRequest request) {
            super(request);
            this.allowedListIp = request.allowedListIp;
            this.allowedListType = request.allowedListType;
            this.description = request.description;
            this.instanceId = request.instanceId;
            this.portRange = request.portRange;
            this.regionId = request.regionId;
            this.updateType = request.updateType;
        } 

        /**
         * <p>The IP addresses that you want to manage. You can specify a CIDR block. Example: <strong>192.168.0.0/16</strong>.</p>
         * <ul>
         * <li>If the <strong>UpdateType</strong> parameter is set to <strong>add</strong>, specify one or more IP addresses for this parameter. Separate multiple IP addresses with commas (,).</li>
         * <li>If the <strong>UpdateType</strong> parameter is set to <strong>delete</strong>, specify only one IP address.</li>
         * <li>Exercise caution when you delete IP addresses.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0.0.0.0/0</p>
         */
        public Builder allowedListIp(String allowedListIp) {
            this.putQueryParameter("AllowedListIp", allowedListIp);
            this.allowedListIp = allowedListIp;
            return this;
        }

        /**
         * <p>The type of the whitelist. Valid values:</p>
         * <ul>
         * <li><strong>vpc</strong>: a whitelist for access from a VPC.</li>
         * <li><strong>internet</strong>: a whitelist for access from the Internet.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc</p>
         */
        public Builder allowedListType(String allowedListType) {
            this.putQueryParameter("AllowedListType", allowedListType);
            this.allowedListType = allowedListType;
            return this;
        }

        /**
         * <p>The description of the whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>tf-testAccEcsImageConfigBasic3549descriptionChange</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-0pp1cng20***</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The port range. Valid values:</p>
         * <ul>
         * <li><strong>9092/9092</strong>: Messages are transmitted in a virtual private cloud (VPC) by using the PLAINTEXT protocol.</li>
         * <li><strong>9093/9093</strong>: Messages are transmitted over the Internet by using the SASL_SSL protocol.</li>
         * <li><strong>9094/9094</strong>: Messages are transmitted in a VPC by using the SASL_PLAINTEXT protocol.</li>
         * <li><strong>9095/9095</strong>: Messages are transmitted in a VPC by using the SASL_SSL protocol.</li>
         * </ul>
         * <p>This parameter must correspond to <strong>AllowdedListType</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9092/9092</p>
         */
        public Builder portRange(String portRange) {
            this.putQueryParameter("PortRange", portRange);
            this.portRange = portRange;
            return this;
        }

        /**
         * <p>The ID of the region where the instance resides.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The type of configuration change. Valid values:</p>
         * <ul>
         * <li><strong>add</strong></li>
         * <li><strong>delete</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        public Builder updateType(String updateType) {
            this.putQueryParameter("UpdateType", updateType);
            this.updateType = updateType;
            return this;
        }

        @Override
        public UpdateAllowedIpRequest build() {
            return new UpdateAllowedIpRequest(this);
        } 

    } 

}
