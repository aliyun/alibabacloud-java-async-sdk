// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link ModifyQpsModeRequest} extends {@link RequestModel}
 *
 * <p>ModifyQpsModeRequest</p>
 */
public class ModifyQpsModeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mode;

    private ModifyQpsModeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyQpsModeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    public static final class Builder extends Request.Builder<ModifyQpsModeRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private String mode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyQpsModeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.mode = request.mode;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The region ID of the Anti-DDoS Pro instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/157459.html">DescribeInstanceIds</a> operation to query the IDs of all instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddoscoo-cn-7e225i41****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The metering method of QPS. Valid values:</p>
         * <ul>
         * <li><strong>month</strong>: monthly 95th percentile QPS.</li>
         * <li><strong>day</strong>: daily 95th percentile QPS.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>month</p>
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        @Override
        public ModifyQpsModeRequest build() {
            return new ModifyQpsModeRequest(this);
        } 

    } 

}
