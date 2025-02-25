// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReleaseDdosOriginInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseDdosOriginInstanceRequest</p>
 */
public class ReleaseDdosOriginInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ReleaseDdosOriginInstanceRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseDdosOriginInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<ReleaseDdosOriginInstanceRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseDdosOriginInstanceRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>The ID of the Anti-DDoS Origin instance that you want to release.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/118698.html">DescribeInstanceList</a> operation to query the IDs of all Anti-DDoS Origin instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosorigin_cn-pe335v7gs01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ReleaseDdosOriginInstanceRequest build() {
            return new ReleaseDdosOriginInstanceRequest(this);
        } 

    } 

}
