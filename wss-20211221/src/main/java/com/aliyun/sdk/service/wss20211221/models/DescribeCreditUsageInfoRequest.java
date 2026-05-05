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
    @com.aliyun.core.annotation.NameInMap("UsageType")
    private String usageType;

    private DescribeCreditUsageInfoRequest(Builder builder) {
        super(builder);
        this.bizType = builder.bizType;
        this.instanceIds = builder.instanceIds;
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
     * @return usageType
     */
    public String getUsageType() {
        return this.usageType;
    }

    public static final class Builder extends Request.Builder<DescribeCreditUsageInfoRequest, Builder> {
        private String bizType; 
        private java.util.List<String> instanceIds; 
        private String usageType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCreditUsageInfoRequest request) {
            super(request);
            this.bizType = request.bizType;
            this.instanceIds = request.instanceIds;
            this.usageType = request.usageType;
        } 

        /**
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(java.util.List<String> instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * UsageType.
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
