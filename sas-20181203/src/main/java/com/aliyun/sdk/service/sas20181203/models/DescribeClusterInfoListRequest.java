// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterInfoListRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterInfoListRequest</p>
 */
public class DescribeClusterInfoListRequest extends Request {
    @Query
    @NameInMap("Target")
    private String target;

    @Query
    @NameInMap("TargetType")
    @Validation(required = true)
    private String targetType;

    @Query
    @NameInMap("Type")
    @Validation(required = true)
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
         * Target.
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * TargetType.
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * Type.
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
