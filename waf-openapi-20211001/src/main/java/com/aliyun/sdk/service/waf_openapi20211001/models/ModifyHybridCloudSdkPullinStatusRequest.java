// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link ModifyHybridCloudSdkPullinStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyHybridCloudSdkPullinStatusRequest</p>
 */
public class ModifyHybridCloudSdkPullinStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PullinStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pullinStatus;

    private ModifyHybridCloudSdkPullinStatusRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.mid = builder.mid;
        this.pullinStatus = builder.pullinStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyHybridCloudSdkPullinStatusRequest create() {
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
     * @return mid
     */
    public String getMid() {
        return this.mid;
    }

    /**
     * @return pullinStatus
     */
    public String getPullinStatus() {
        return this.pullinStatus;
    }

    public static final class Builder extends Request.Builder<ModifyHybridCloudSdkPullinStatusRequest, Builder> {
        private String instanceId; 
        private String mid; 
        private String pullinStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyHybridCloudSdkPullinStatusRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.mid = request.mid;
            this.pullinStatus = request.pullinStatus;
        } 

        /**
         * <p>The ID of the WAF instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/140857.html">DescribeInstanceInfo</a> operation to query the ID of the WAF instance.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>waf-cn-7pp2le***01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the SDK.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b3dbc5153317c79d8ca9f9***ea</p>
         */
        public Builder mid(String mid) {
            this.putQueryParameter("Mid", mid);
            this.mid = mid;
            return this;
        }

        /**
         * <p>The status of traffic redirection. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder pullinStatus(String pullinStatus) {
            this.putQueryParameter("PullinStatus", pullinStatus);
            this.pullinStatus = pullinStatus;
            return this;
        }

        @Override
        public ModifyHybridCloudSdkPullinStatusRequest build() {
            return new ModifyHybridCloudSdkPullinStatusRequest(this);
        } 

    } 

}
