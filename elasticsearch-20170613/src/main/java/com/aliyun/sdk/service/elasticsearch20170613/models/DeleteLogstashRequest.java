// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteLogstashRequest} extends {@link RequestModel}
 *
 * <p>DeleteLogstashRequest</p>
 */
public class DeleteLogstashRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deleteType")
    private String deleteType;

    private DeleteLogstashRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.clientToken = builder.clientToken;
        this.deleteType = builder.deleteType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLogstashRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return deleteType
     */
    public String getDeleteType() {
        return this.deleteType;
    }

    public static final class Builder extends Request.Builder<DeleteLogstashRequest, Builder> {
        private String instanceId; 
        private String clientToken; 
        private String deleteType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLogstashRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.clientToken = request.clientToken;
            this.deleteType = request.deleteType;
        } 

        /**
         * <p>The ID of the cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-n6w1o5jq****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The type of the release operation. Valid values:</p>
         * <ul>
         * <li>immediate: The cluster is immediately deleted when it is released. After the cluster is deleted, the data stored in the cluster is deleted, and the system removes the cluster from the Logstash cluster list.</li>
         * <li>protective: The cluster is released 24 hours later. During the period of 24 hours, you can still find the cluster in the Logstash cluster list, and <a href="https://help.aliyun.com/document_detail/202205.html">restore the cluster</a> or <a href="https://help.aliyun.com/document_detail/160591.html">immediately release the cluster</a>. After 24 hours elapse, the data stored in the cluster is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>protective</p>
         */
        public Builder deleteType(String deleteType) {
            this.putQueryParameter("deleteType", deleteType);
            this.deleteType = deleteType;
            return this;
        }

        @Override
        public DeleteLogstashRequest build() {
            return new DeleteLogstashRequest(this);
        } 

    } 

}
