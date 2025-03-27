// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DescribeSpotDiscountHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeSpotDiscountHistoryRequest</p>
 */
public class DescribeSpotDiscountHistoryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsProtect")
    private Boolean isProtect;

    private DescribeSpotDiscountHistoryRequest(Builder builder) {
        super(builder);
        this.instanceType = builder.instanceType;
        this.isProtect = builder.isProtect;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSpotDiscountHistoryRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return isProtect
     */
    public Boolean getIsProtect() {
        return this.isProtect;
    }

    public static final class Builder extends Request.Builder<DescribeSpotDiscountHistoryRequest, Builder> {
        private String instanceType; 
        private Boolean isProtect; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSpotDiscountHistoryRequest request) {
            super(request);
            this.instanceType = request.instanceType;
            this.isProtect = request.isProtect;
        } 

        /**
         * <p>The type of the Elastic Algorithm Service (EAS) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecs.c6.4xlarge</p>
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>Specifies whether the preemptible instance has a protection period. During the 1-hour protection period of the preemptible instance, the preemptible instance will not be released.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isProtect(Boolean isProtect) {
            this.putQueryParameter("IsProtect", isProtect);
            this.isProtect = isProtect;
            return this;
        }

        @Override
        public DescribeSpotDiscountHistoryRequest build() {
            return new DescribeSpotDiscountHistoryRequest(this);
        } 

    } 

}
