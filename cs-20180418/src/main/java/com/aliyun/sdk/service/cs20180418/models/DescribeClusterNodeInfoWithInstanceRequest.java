// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20180418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterNodeInfoWithInstanceRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterNodeInfoWithInstanceRequest</p>
 */
public class DescribeClusterNodeInfoWithInstanceRequest extends Request {
    @Path
    @NameInMap("Token")
    @Validation(required = true)
    private String token;

    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DescribeClusterNodeInfoWithInstanceRequest(Builder builder) {
        super(builder);
        this.token = builder.token;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterNodeInfoWithInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<DescribeClusterNodeInfoWithInstanceRequest, Builder> {
        private String token; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterNodeInfoWithInstanceRequest response) {
            super(response);
            this.token = response.token;
            this.instanceId = response.instanceId;
        } 

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putPathParameter("Token", token);
            this.token = token;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeClusterNodeInfoWithInstanceRequest build() {
            return new DescribeClusterNodeInfoWithInstanceRequest(this);
        } 

    } 

}
