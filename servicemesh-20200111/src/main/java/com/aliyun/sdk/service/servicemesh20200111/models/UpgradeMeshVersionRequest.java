// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeMeshVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeMeshVersionRequest</p>
 */
public class UpgradeMeshVersionRequest extends Request {
    @Query
    @NameInMap("PreCheck")
    private Boolean preCheck;

    @Query
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private UpgradeMeshVersionRequest(Builder builder) {
        super(builder);
        this.preCheck = builder.preCheck;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeMeshVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return preCheck
     */
    public Boolean getPreCheck() {
        return this.preCheck;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<UpgradeMeshVersionRequest, Builder> {
        private Boolean preCheck; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeMeshVersionRequest request) {
            super(request);
            this.preCheck = request.preCheck;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * Specifies whether to perform a precheck. Default value: false. If this parameter is set to true, this call only checks whether the current ASM instance meets the upgrade conditions and does not actually perform an upgrade.
         */
        public Builder preCheck(Boolean preCheck) {
            this.putQueryParameter("PreCheck", preCheck);
            this.preCheck = preCheck;
            return this;
        }

        /**
         * The ASM instance ID.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putQueryParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public UpgradeMeshVersionRequest build() {
            return new UpgradeMeshVersionRequest(this);
        } 

    } 

}
