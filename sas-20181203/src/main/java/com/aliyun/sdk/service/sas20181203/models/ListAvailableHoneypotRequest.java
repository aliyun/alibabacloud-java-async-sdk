// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAvailableHoneypotRequest} extends {@link RequestModel}
 *
 * <p>ListAvailableHoneypotRequest</p>
 */
public class ListAvailableHoneypotRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    private ListAvailableHoneypotRequest(Builder builder) {
        super(builder);
        this.nodeId = builder.nodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAvailableHoneypotRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
    }

    public static final class Builder extends Request.Builder<ListAvailableHoneypotRequest, Builder> {
        private String nodeId; 

        private Builder() {
            super();
        } 

        private Builder(ListAvailableHoneypotRequest request) {
            super(request);
            this.nodeId = request.nodeId;
        } 

        /**
         * <p>The ID of the management node to which the honeypot is deployed.</p>
         * 
         * <strong>example:</strong>
         * <p>4341018b-8e01-43f6-b1d2-af29a2a4****</p>
         */
        public Builder nodeId(String nodeId) {
            this.putQueryParameter("NodeId", nodeId);
            this.nodeId = nodeId;
            return this;
        }

        @Override
        public ListAvailableHoneypotRequest build() {
            return new ListAvailableHoneypotRequest(this);
        } 

    } 

}
