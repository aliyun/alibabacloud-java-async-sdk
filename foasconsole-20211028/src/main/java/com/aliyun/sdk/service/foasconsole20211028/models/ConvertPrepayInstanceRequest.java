// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20211028.models;

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
 * {@link ConvertPrepayInstanceRequest} extends {@link RequestModel}
 *
 * <p>ConvertPrepayInstanceRequest</p>
 */
public class ConvertPrepayInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    private ConvertPrepayInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.region = builder.region;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertPrepayInstanceRequest create() {
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
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    public static final class Builder extends Request.Builder<ConvertPrepayInstanceRequest, Builder> {
        private String instanceId; 
        private String region; 

        private Builder() {
            super();
        } 

        private Builder(ConvertPrepayInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.region = request.region;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f-cn-wwo36qj4g06</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder region(String region) {
            this.putBodyParameter("Region", region);
            this.region = region;
            return this;
        }

        @Override
        public ConvertPrepayInstanceRequest build() {
            return new ConvertPrepayInstanceRequest(this);
        } 

    } 

}
