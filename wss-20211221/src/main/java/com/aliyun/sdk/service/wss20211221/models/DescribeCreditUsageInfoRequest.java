// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wss20211221.models;

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
 * {@link DescribeCreditUsageInfoRequest} extends {@link RequestModel}
 *
 * <p>DescribeCreditUsageInfoRequest</p>
 */
public class DescribeCreditUsageInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizType")
    private String bizType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    private java.util.List<String> instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneType")
    private String sceneType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsageType")
    private String usageType;

    private DescribeCreditUsageInfoRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.instanceIds = builder.instanceIds;
        this.sceneType = builder.sceneType;
        this.usageType = builder.usageType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreditUsageInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return instanceIds
     */
    public java.util.List<String> getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return sceneType
     */
    public String getSceneType() {
        return this.sceneType;
    }

    /**
     * @return usageType
     */
    public String getUsageType() {
        return this.usageType;
    }

    public static final class Builder extends Request.Builder<DescribeCreditUsageInfoRequest, Builder> {
        private String bizType; 
        private java.util.List<String> instanceIds; 
        private String sceneType; 
        private String usageType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCreditUsageInfoRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.instanceIds = request.instanceIds;
            this.sceneType = request.sceneType;
            this.usageType = request.usageType;
        } 

        /**
         * <p>The business type.</p>
         * 
         * <strong>example:</strong>
         * <p>BUSINESS</p>
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * <p>The JSON string of the instance ID list. This parameter can be omitted when <code>UsageType</code> is set to <code>User</code>. Set it to the credit package instance ID when <code>UsageType</code> is <code>CreditPackage</code>, and the agent ID when <code>UsageType</code> is <code>Agent</code>.</p>
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The operator Scenarios type. Valid values:</p>
         * <ul>
         * <li>Not specified or NaturalMonthlyOwn: Natural monthly exclusive.</li>
         * <li>JzYearlyShare: Jz annual shared.</li>
         * <li>JzYearlyOwn: Jz annual exclusive.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JzYearlyShare</p>
         */
        public Builder sceneType(String sceneType) {
            this.putQueryParameter("SceneType", sceneType);
            this.sceneType = sceneType;
            return this;
        }

        /**
         * <p>The usage type. Valid values:</p>
         * <ul>
         * <li>User: Returns the used amount, remaining amount, and consumption trend of the currently active credit packages for the user.</li>
         * <li>CreditPackage: Requires a credit package ID. Returns the total amount and remaining amount of the specified credit package.</li>
         * <li>Agent: Requires an agent ID. Returns the cumulative credit usage, cumulative allocated quota, and the percentage between the two.</li>
         * <li>EndUser: Requires a Wuying ID. Returns the shared credit usage, pay-as-you-go credit usage, and total credit usage for the current period of the Wuying user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>User</p>
         */
        public Builder usageType(String usageType) {
            this.putQueryParameter("UsageType", usageType);
            this.usageType = usageType;
            return this;
        }

        @Override
        public DescribeCreditUsageInfoRequest build() {
            return new DescribeCreditUsageInfoRequest(this);
        } 

    } 

}
