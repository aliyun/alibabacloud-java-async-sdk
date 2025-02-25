// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListPipelineIdsRequest} extends {@link RequestModel}
 *
 * <p>ListPipelineIdsRequest</p>
 */
public class ListPipelineIdsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private String body;

    private ListPipelineIdsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPipelineIdsRequest create() {
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
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<ListPipelineIdsRequest, Builder> {
        private String instanceId; 
        private String body; 

        private Builder() {
            super();
        } 

        private Builder(ListPipelineIdsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ls-cn-7g1umu96oit2e****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * body.
         */
        public Builder body(String body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public ListPipelineIdsRequest build() {
            return new ListPipelineIdsRequest(this);
        } 

    } 

}
