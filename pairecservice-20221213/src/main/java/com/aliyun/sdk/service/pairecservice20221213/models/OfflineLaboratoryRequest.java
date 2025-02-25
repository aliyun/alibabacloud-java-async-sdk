// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OfflineLaboratoryRequest} extends {@link RequestModel}
 *
 * <p>OfflineLaboratoryRequest</p>
 */
public class OfflineLaboratoryRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("LaboratoryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String laboratoryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private OfflineLaboratoryRequest(Builder builder) {
        super(builder);
        this.laboratoryId = builder.laboratoryId;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OfflineLaboratoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return laboratoryId
     */
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<OfflineLaboratoryRequest, Builder> {
        private String laboratoryId; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(OfflineLaboratoryRequest request) {
            super(request);
            this.laboratoryId = request.laboratoryId;
            this.instanceId = request.instanceId;
        } 

        /**
         * LaboratoryId.
         */
        public Builder laboratoryId(String laboratoryId) {
            this.putPathParameter("LaboratoryId", laboratoryId);
            this.laboratoryId = laboratoryId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public OfflineLaboratoryRequest build() {
            return new OfflineLaboratoryRequest(this);
        } 

    } 

}
