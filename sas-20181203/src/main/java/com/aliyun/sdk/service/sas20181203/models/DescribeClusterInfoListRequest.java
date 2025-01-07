// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeClusterInfoListRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterInfoListRequest</p>
 */
public class DescribeClusterInfoListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private DescribeClusterInfoListRequest(Builder builder) {
        super(builder);
        this.target = builder.target;
        this.targetType = builder.targetType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterInfoListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return target
     */
    public String getTarget() {
        return this.target;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeClusterInfoListRequest, Builder> {
        private String target; 
        private String targetType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterInfoListRequest request) {
            super(request);
            this.target = request.target;
            this.targetType = request.targetType;
            this.type = request.type;
        } 

        /**
         * <p>The operation value. The value specifies the ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c23551de6149343e8a54e69fbefe6****</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>The dimension based on which you want to configure the feature. Valid values:</p>
         * <ul>
         * <li><strong>Cluster</strong>: the ID of the cluster</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The type of the feature. Valid values:</p>
         * <ul>
         * <li><strong>containerNetwork</strong>: container network</li>
         * <li><strong>interceptionSwitch</strong>: cluster microsegmentation</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>containerNetwork</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeClusterInfoListRequest build() {
            return new DescribeClusterInfoListRequest(this);
        } 

    } 

}
