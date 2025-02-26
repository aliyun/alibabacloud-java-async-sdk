// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link UpdateTaskContentV2Request} extends {@link RequestModel}
 *
 * <p>UpdateTaskContentV2Request</p>
 */
public class UpdateTaskContentV2Request extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeContent")
    private String nodeContent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeId;

    private UpdateTaskContentV2Request(Builder builder) {
        super(builder);
        this.nodeContent = builder.nodeContent;
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTaskContentV2Request create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeContent
     */
    public String getNodeContent() {
        return this.nodeContent;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<UpdateTaskContentV2Request, Builder> {
        private String nodeContent; 
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTaskContentV2Request request) {
            super(request);
            this.nodeContent = request.nodeContent;
            this.nodeId = request.nodeId;
        } 

        /**
         * NodeContent.
         */
        public Builder nodeContent(String nodeContent) {
            this.putBodyParameter("NodeContent", nodeContent);
            this.nodeContent = nodeContent;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>449***</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public UpdateTaskContentV2Request build() {
            return new UpdateTaskContentV2Request(this);
        } 

    } 

}
