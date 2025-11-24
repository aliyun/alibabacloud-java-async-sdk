// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeServiceMeshAdditionalStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshAdditionalStatusRequest</p>
 */
public class DescribeServiceMeshAdditionalStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CheckMode")
    private String checkMode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    private DescribeServiceMeshAdditionalStatusRequest(Builder builder) {
        super(builder);
        this.checkMode = builder.checkMode;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshAdditionalStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkMode
     */
    public String getCheckMode() {
        return this.checkMode;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<DescribeServiceMeshAdditionalStatusRequest, Builder> {
        private String checkMode; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeServiceMeshAdditionalStatusRequest request) {
            super(request);
            this.checkMode = request.checkMode;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>The check mode of the ASM instance. Valid values:</p>
         * <ul>
         * <li><code>normal</code>: checks the Server Load Balancer (SLB) instances created for exposing the API server and Istio Pilot, audit logs, and installation of Logtail for clusters on the data plane.</li>
         * <li><code>full</code>: checks control plane logs, access logs, security groups, and the elastic IP addresses (EIPs) of the API server in addition to the check items in normal mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>full</p>
         */
        public Builder checkMode(String checkMode) {
            this.putBodyParameter("CheckMode", checkMode);
            this.checkMode = checkMode;
            return this;
        }

        /**
         * <p>The ID of the ASM instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ca04bc38979214bf2882be79d39b4****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public DescribeServiceMeshAdditionalStatusRequest build() {
            return new DescribeServiceMeshAdditionalStatusRequest(this);
        } 

    } 

}
