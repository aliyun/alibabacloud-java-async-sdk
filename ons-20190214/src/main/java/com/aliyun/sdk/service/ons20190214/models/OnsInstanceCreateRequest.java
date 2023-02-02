// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OnsInstanceCreateRequest} extends {@link RequestModel}
 *
 * <p>OnsInstanceCreateRequest</p>
 */
public class OnsInstanceCreateRequest extends Request {
    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("Remark")
    private String remark;

    private OnsInstanceCreateRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.remark = builder.remark;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OnsInstanceCreateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    public static final class Builder extends Request.Builder<OnsInstanceCreateRequest, Builder> {
        private String instanceName; 
        private String remark; 

        private Builder() {
            super();
        } 

        private Builder(OnsInstanceCreateRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.remark = request.remark;
        } 

        /**
         * The name of the instance. Valid values:
         * <p>
         * 
         * *   The name of the instance must be unique in the region where the instance is deployed.
         * *   The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (\_).
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The description of the instance.
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        @Override
        public OnsInstanceCreateRequest build() {
            return new OnsInstanceCreateRequest(this);
        } 

    } 

}
