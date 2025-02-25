// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link SwitchServiceRequest} extends {@link RequestModel}
 *
 * <p>SwitchServiceRequest</p>
 */
public class SwitchServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    private SwitchServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.operate = builder.operate;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return operate
     */
    public String getOperate() {
        return this.operate;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<SwitchServiceRequest, Builder> {
        private String clusterId; 
        private String operate; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(SwitchServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.operate = request.operate;
            this.serviceName = request.serviceName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-uf6r2hn2zrxxxxxx</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder operate(String operate) {
            this.putQueryParameter("Operate", operate);
            this.operate = operate;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>HBaseProxy</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public SwitchServiceRequest build() {
            return new SwitchServiceRequest(this);
        } 

    } 

}
