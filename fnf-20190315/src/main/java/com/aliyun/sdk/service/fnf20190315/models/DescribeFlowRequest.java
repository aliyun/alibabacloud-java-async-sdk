// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

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
 * {@link DescribeFlowRequest} extends {@link RequestModel}
 *
 * <p>DescribeFlowRequest</p>
 */
public class DescribeFlowRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowVersion")
    private String flowVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    private DescribeFlowRequest(Builder builder) {
        super(builder);
        this.flowVersion = builder.flowVersion;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flowVersion
     */
    public String getFlowVersion() {
        return this.flowVersion;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder extends Request.Builder<DescribeFlowRequest, Builder> {
        private String flowVersion; 
        private String name; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFlowRequest request) {
            super(request);
            this.flowVersion = request.flowVersion;
            this.name = request.name;
        } 

        /**
         * FlowVersion.
         */
        public Builder flowVersion(String flowVersion) {
            this.putQueryParameter("FlowVersion", flowVersion);
            this.flowVersion = flowVersion;
            return this;
        }

        /**
         * <p>The name of the flow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>flow</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        @Override
        public DescribeFlowRequest build() {
            return new DescribeFlowRequest(this);
        } 

    } 

}
