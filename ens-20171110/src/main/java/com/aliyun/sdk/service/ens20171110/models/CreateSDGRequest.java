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
 * {@link CreateSDGRequest} extends {@link RequestModel}
 *
 * <p>CreateSDGRequest</p>
 */
public class CreateSDGRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BillingCycle")
    private String billingCycle;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiskType")
    private String diskType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FromSDGId")
    private String fromSDGId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PerformanceLevel")
    private Long performanceLevel;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Size")
    private String size;

    private CreateSDGRequest(Builder builder) {
        super(builder);
        this.billingCycle = builder.billingCycle;
        this.description = builder.description;
        this.diskType = builder.diskType;
        this.fromSDGId = builder.fromSDGId;
        this.instanceId = builder.instanceId;
        this.performanceLevel = builder.performanceLevel;
        this.size = builder.size;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSDGRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return billingCycle
     */
    public String getBillingCycle() {
        return this.billingCycle;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return diskType
     */
    public String getDiskType() {
        return this.diskType;
    }

    /**
     * @return fromSDGId
     */
    public String getFromSDGId() {
        return this.fromSDGId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return performanceLevel
     */
    public Long getPerformanceLevel() {
        return this.performanceLevel;
    }

    /**
     * @return size
     */
    public String getSize() {
        return this.size;
    }

    public static final class Builder extends Request.Builder<CreateSDGRequest, Builder> {
        private String billingCycle; 
        private String description; 
        private String diskType; 
        private String fromSDGId; 
        private String instanceId; 
        private Long performanceLevel; 
        private String size; 

        private Builder() {
            super();
        } 

        private Builder(CreateSDGRequest request) {
            super(request);
            this.billingCycle = request.billingCycle;
            this.description = request.description;
            this.diskType = request.diskType;
            this.fromSDGId = request.fromSDGId;
            this.instanceId = request.instanceId;
            this.performanceLevel = request.performanceLevel;
            this.size = request.size;
        } 

        /**
         * <p>The billing logic for SDG child disks. This parameter specifies the billing method for the RBD child disks produced by this SDG. This parameter does not apply to standard cloud disks.
         * Optional parameter values:</p>
         * <ul>
         * <li><p>Hour.</p>
         * </li>
         * <li><p>Day. This is the default value.</p>
         * </li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Parameter description: The longer the cycle, the lower the cost. If the disk is released before the billing cycle ends, a service fee is charged.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Day</p>
         */
        public Builder billingCycle(String billingCycle) {
            this.putQueryParameter("BillingCycle", billingCycle);
            this.billingCycle = billingCycle;
            return this;
        }

        /**
         * <p>The description of the SDG.</p>
         * <blockquote>
         * <p>Provide a detailed description for easier future queries.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Test SDG</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The type of the source disk.
         * Optional parameter values:</p>
         * <ul>
         * <li>standard: standard cloud disk. This is the default value.</li>
         * <li>rbd: RBD disk.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Limits: RBD disk SDGs and standard disk SDGs cannot inherit from each other.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>standard</p>
         */
        public Builder diskType(String diskType) {
            this.putQueryParameter("DiskType", diskType);
            this.diskType = diskType;
            return this;
        }

        /**
         * <p>The ID of an existing SDG.</p>
         * <blockquote>
         * <ul>
         * <li>If you are creating an SDG for the first time, leave <strong>FromSDGId</strong> empty.</li>
         * <li>If <strong>FromSDGId</strong> is invalid or the corresponding raw cloud disk cannot be found, an error is returned.</li>
         * <li>If <strong>FromSDGId</strong> is not empty, this indicates that you are operating on an existing SDG rather than creating one for the first time.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>sdg-xxxxx</p>
         */
        public Builder fromSDGId(String fromSDGId) {
            this.putQueryParameter("FromSDGId", fromSDGId);
            this.fromSDGId = fromSDGId;
            return this;
        }

        /**
         * <p>The AIC instance ID. You can call the <a href="~~DescribeARMServerInstances~~">DescribeARMServerInstances</a> operation to obtain the InstanceId value.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aic-xxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The SDG sharing ratio parameter. This parameter supports cloud disks with different maximum sharing ratios.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder performanceLevel(Long performanceLevel) {
            this.putQueryParameter("PerformanceLevel", performanceLevel);
            this.performanceLevel = performanceLevel;
            return this;
        }

        /**
         * <p>The maximum capacity of the SDG. Unit: GB.</p>
         * <blockquote>
         * <ul>
         * <li>To reduce costs, evaluate the required capacity as needed.</li>
         * <li>If you are creating an SDG for the first time, <strong>Size</strong> is required.</li>
         * <li>If the data volume increases later, pass a new <strong>Size</strong> value to expand the capacity. If <strong>Size</strong> is not empty and is greater than the original <strong>Size</strong> value of the SDG, the raw cloud disk of the SDG is expanded to the specified <strong>Size</strong>. If <strong>Size</strong> is empty or the specified <strong>Size</strong> is less than the original <strong>Size</strong> value of the SDG, no action is taken.</li>
         * </ul>
         * </blockquote>
         * <p>The minimum tested usable value is 150 GB.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        public Builder size(String size) {
            this.putQueryParameter("Size", size);
            this.size = size;
            return this;
        }

        @Override
        public CreateSDGRequest build() {
            return new CreateSDGRequest(this);
        } 

    } 

}
