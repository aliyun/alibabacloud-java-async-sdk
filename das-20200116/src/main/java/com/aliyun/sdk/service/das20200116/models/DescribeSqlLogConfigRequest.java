// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link DescribeSqlLogConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeSqlLogConfigRequest</p>
 */
public class DescribeSqlLogConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private DescribeSqlLogConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSqlLogConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeSqlLogConfigRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeSqlLogConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The ID of the database instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze8g2am97624****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeSqlLogConfigRequest build() {
            return new DescribeSqlLogConfigRequest(this);
        } 

    } 

}
