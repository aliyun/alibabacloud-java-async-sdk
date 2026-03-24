// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link ScaleServiceRequest} extends {@link RequestModel}
 *
 * <p>ScaleServiceRequest</p>
 */
public class ScaleServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Instance")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long instance;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstancesToDelete")
    private java.util.List<String> instancesToDelete;

    private ScaleServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.instance = builder.instance;
        this.instancesToDelete = builder.instancesToDelete;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleServiceRequest create() {
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
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return instance
     */
    public Long getInstance() {
        return this.instance;
    }

    /**
     * @return instancesToDelete
     */
    public java.util.List<String> getInstancesToDelete() {
        return this.instancesToDelete;
    }

    public static final class Builder extends Request.Builder<ScaleServiceRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private Long instance; 
        private java.util.List<String> instancesToDelete; 

        private Builder() {
            super();
        } 

        private Builder(ScaleServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.instance = request.instance;
            this.instancesToDelete = request.instancesToDelete;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder instance(Long instance) {
            this.putBodyParameter("Instance", instance);
            this.instance = instance;
            return this;
        }

        /**
         * InstancesToDelete.
         */
        public Builder instancesToDelete(java.util.List<String> instancesToDelete) {
            this.putBodyParameter("InstancesToDelete", instancesToDelete);
            this.instancesToDelete = instancesToDelete;
            return this;
        }

        @Override
        public ScaleServiceRequest build() {
            return new ScaleServiceRequest(this);
        } 

    } 

}
