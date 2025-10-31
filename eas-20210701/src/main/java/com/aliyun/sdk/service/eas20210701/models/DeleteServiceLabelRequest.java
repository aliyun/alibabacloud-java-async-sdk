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
 * {@link DeleteServiceLabelRequest} extends {@link RequestModel}
 *
 * <p>DeleteServiceLabelRequest</p>
 */
public class DeleteServiceLabelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Keys")
    @Deprecated
    private java.util.List<String> keys;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabelKeys")
    private java.util.List<String> labelKeys;

    private DeleteServiceLabelRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.keys = builder.keys;
        this.labelKeys = builder.labelKeys;
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
    public java.util.List<String> getKeys() {
        return this.keys;
    }

    /**
     * @return labelKeys
     */
    public java.util.List<String> getLabelKeys() {
        return this.labelKeys;
    }

    public static final class Builder extends Request.Builder<DeleteServiceLabelRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private java.util.List<String> keys; 
        private java.util.List<String> labelKeys; 

        private Builder() {
            super();
        } 

        private Builder(DeleteServiceLabelRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.keys = request.keys;
            this.labelKeys = request.labelKeys;
        } 

        /**
         * <p>The ID of the region where the service is deployed.</p>
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
         * <p>The service name. For more information about how to query the service name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
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
         * <p>The service tags that you want to delete.</p>
         */
        public Builder keys(java.util.List<String> keys) {
            String keysShrink = shrink(keys, "Keys", "simple");
            this.putQueryParameter("Keys", keysShrink);
            this.keys = keys;
            return this;
        }

        /**
         * LabelKeys.
         */
        public Builder labelKeys(java.util.List<String> labelKeys) {
            String labelKeysShrink = shrink(labelKeys, "LabelKeys", "json");
            this.putQueryParameter("LabelKeys", labelKeysShrink);
            this.labelKeys = labelKeys;
            return this;
        }

        @Override
        public DeleteServiceLabelRequest build() {
            return new DeleteServiceLabelRequest(this);
        } 

    } 

}
