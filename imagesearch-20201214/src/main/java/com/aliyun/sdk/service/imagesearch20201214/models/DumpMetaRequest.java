// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link DumpMetaRequest} extends {@link RequestModel}
 *
 * <p>DumpMetaRequest</p>
 */
public class DumpMetaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 10000000, minimum = 1)
    private String instanceName;

    private DumpMetaRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DumpMetaRequest create() {
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

    public static final class Builder extends Request.Builder<DumpMetaRequest, Builder> {
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(DumpMetaRequest request) {
            super(request);
            this.instanceName = request.instanceName;
        } 

        /**
         * <p>The name of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>imagesearchName</p>
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public DumpMetaRequest build() {
            return new DumpMetaRequest(this);
        } 

    } 

}
