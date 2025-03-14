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
 * {@link GetAgentlessTaskCountRequest} extends {@link RequestModel}
 *
 * <p>GetAgentlessTaskCountRequest</p>
 */
public class GetAgentlessTaskCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    private String target;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    private Integer targetType;

    private GetAgentlessTaskCountRequest(Builder builder) {
        super(builder);
        this.target = builder.target;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentlessTaskCountRequest create() {
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
    public Integer getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<GetAgentlessTaskCountRequest, Builder> {
        private String target; 
        private Integer targetType; 

        private Builder() {
            super();
        } 

        private Builder(GetAgentlessTaskCountRequest request) {
            super(request);
            this.target = request.target;
            this.targetType = request.targetType;
        } 

        /**
         * <p>The instance ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>s-m5edddcwq7d57d******</p>
         */
        public Builder target(String target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        /**
         * <p>Specifies the type of the object being inspected. Valid values:</p>
         * <ul>
         * <li><strong>3</strong>: User Snapshot.</li>
         * <li><strong>4</strong>: User Image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder targetType(Integer targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public GetAgentlessTaskCountRequest build() {
            return new GetAgentlessTaskCountRequest(this);
        } 

    } 

}
