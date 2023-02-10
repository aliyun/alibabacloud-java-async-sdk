// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteServiceLabelRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceLabelRequest</p>
 */
public class DeleteServiceLabelRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Query
    @NameInMap("Keys")
    @Validation(required = true)
    private java.util.List < String > keys;

    private DeleteServiceLabelRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.keys = builder.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteServiceLabelRequest create() {
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
     * @return keys
     */
    public java.util.List < String > getKeys() {
        return this.keys;
    }

    public static final class Builder extends Request.Builder<DeleteServiceLabelRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private java.util.List < String > keys; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceLabelRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.keys = request.keys;
        } 

        /**
         * 服务所在区域。
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 服务名字。
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * 要删除的服务标签。
         */
        public Builder keys(java.util.List < String > keys) {
            String keysShrink = shrink(keys, "Keys", "simple");
            this.putQueryParameter("Keys", keysShrink);
            this.keys = keys;
            return this;
        }

        @Override
        public DeleteServiceLabelRequest build() {
            return new DeleteServiceLabelRequest(this);
        } 

    } 

}
