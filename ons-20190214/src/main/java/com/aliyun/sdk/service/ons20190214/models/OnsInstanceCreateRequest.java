// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ons20190214.models;

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
 * {@link OnsInstanceCreateRequest} extends {@link RequestModel}
 *
 * <p>OnsInstanceCreateRequest</p>
 */
public class OnsInstanceCreateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
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
         * <p>The name of the instance. The name must meet the following rules:</p>
         * <ul>
         * <li>The name of the instance must be unique in the region where the instance is deployed.</li>
         * <li>The name must be 3 to 64 characters in length and can contain letters, digits, hyphens (-), and underscores (_).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Description</p>
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
