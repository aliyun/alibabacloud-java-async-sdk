// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceMeshAdditionalStatusRequest} extends {@link RequestModel}
 *
 * <p>DescribeServiceMeshAdditionalStatusRequest</p>
 */
public class DescribeServiceMeshAdditionalStatusRequest extends Request {
    @Body
    @NameInMap("CheckMode")
    private String checkMode;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
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
         * The check mode of the ASM instance. Valid values:
         * <p>
         * 
         * *   `normal`: checks the Server Load Balancer (SLB) instances created for exposing the API server and Istio Pilot, audit logs, and installation of Logtail for clusters on the data plane.
         * *   `full`: checks control plane logs, access logs, security groups, and the elastic IP addresses (EIPs) of the API server in addition to the check items in normal mode.
         */
        public Builder checkMode(String checkMode) {
            this.putBodyParameter("CheckMode", checkMode);
            this.checkMode = checkMode;
            return this;
        }

        /**
         * The ID of the ASM instance.
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
