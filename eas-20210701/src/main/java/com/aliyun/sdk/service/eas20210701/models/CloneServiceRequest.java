// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CloneServiceRequest} extends {@link RequestModel}
 *
 * <p>CloneServiceRequest</p>
 */
public class CloneServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.Map < String, String > labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private CloneServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.labels = builder.labels;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CloneServiceRequest create() {
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
     * @return labels
     */
    public java.util.Map < String, String > getLabels() {
        return this.labels;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CloneServiceRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private java.util.Map < String, String > labels; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(CloneServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.labels = request.labels;
            this.body = request.body;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
         * <p>The label of the service to be cloned.</p>
         */
        public Builder labels(java.util.Map < String, String > labels) {
            String labelsShrink = shrink(labels, "Labels", "json");
            this.putQueryParameter("Labels", labelsShrink);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The request body. For more information, see <a href="https://help.aliyun.com/document_detail/412086.html">CreateService</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;name&quot;: &quot;foo&quot;,   &quot;model_path&quot;: &quot;<a href="http://path/to/model.tar.gz">http://path/to/model.tar.gz</a>&quot;,   &quot;processor&quot;: &quot;tensorflow_cpu&quot;,   &quot;metadata&quot;: {     &quot;instance&quot;: 2,     &quot;memory&quot;: 7000,     &quot;cpu&quot;: 4   } }</p>
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CloneServiceRequest build() {
            return new CloneServiceRequest(this);
        } 

    } 

}
