// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCreatePrePaidInstanceResultRequest} extends {@link RequestModel}
 *
 * <p>DescribeCreatePrePaidInstanceResultRequest</p>
 */
public class DescribeCreatePrePaidInstanceResultRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("Version")
    @Validation(required = true)
    private String version;

    private DescribeCreatePrePaidInstanceResultRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCreatePrePaidInstanceResultRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<DescribeCreatePrePaidInstanceResultRequest, Builder> {
        private String instanceId; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCreatePrePaidInstanceResultRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.version = response.version;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putQueryParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public DescribeCreatePrePaidInstanceResultRequest build() {
            return new DescribeCreatePrePaidInstanceResultRequest(this);
        } 

    } 

}
