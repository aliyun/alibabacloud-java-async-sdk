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
 * {@link UpdateServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceRequest</p>
 */
public class UpdateServiceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateType")
    private String updateType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private UpdateServiceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.updateType = builder.updateType;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceRequest create() {
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
     * @return updateType
     */
    public String getUpdateType() {
        return this.updateType;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateServiceRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String updateType; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.updateType = request.updateType;
            this.body = request.body;
        } 

        /**
         * <p>The region ID of the service.</p>
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
         * <p>The type of the service update. Valid values: merge and replace. By default, merge is used if you do not specify this parameter.</p>
         * <ul>
         * <li>merge: If the JSON string configured for the existing service is <code>{&quot;a&quot;:&quot;b&quot;}</code> and the JSON string specified in the body parameter is <code>{&quot;c&quot;:&quot;d&quot;}</code>, the JSON string is <code>{&quot;a&quot;:&quot;b&quot;,&quot;c&quot;:&quot;d&quot;}</code> after the service update.</li>
         * <li>replace: If the JSON string configured for the existing service is <code>{&quot;a&quot;:&quot;b&quot;}</code> and the JSON string specified in the body parameter is <code>{&quot;c&quot;:&quot;d&quot;}</code>, the JSON string is <code>{&quot;c&quot;:&quot;d&quot;}</code> after the service update.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>merge</p>
         */
        public Builder updateType(String updateType) {
            this.putQueryParameter("UpdateType", updateType);
            this.updateType = updateType;
            return this;
        }

        /**
         * <p>The request body. The body includes the request parameters that you want to update. For more information about the request parameters, see <a href="https://help.aliyun.com/document_detail/412086.html">CreateService</a>.</p>
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
        public UpdateServiceRequest build() {
            return new UpdateServiceRequest(this);
        } 

    } 

}
