// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListInvocationStatusRequest} extends {@link RequestModel}
 *
 * <p>ListInvocationStatusRequest</p>
 */
public class ListInvocationStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CommandId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String commandId;

    private ListInvocationStatusRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.commandId = builder.commandId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInvocationStatusRequest create() {
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
     * @return commandId
     */
    public String getCommandId() {
        return this.commandId;
    }

    public static final class Builder extends Request.Builder<ListInvocationStatusRequest, Builder> {
        private String clusterId; 
        private String commandId; 

        private Builder() {
            super();
        } 

        private Builder(ListInvocationStatusRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.commandId = request.commandId;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The command ID.</p>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/87388.html">ListCommands</a> operation to query the command ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-hz01v8x80o3****</p>
         */
        public Builder commandId(String commandId) {
            this.putQueryParameter("CommandId", commandId);
            this.commandId = commandId;
            return this;
        }

        @Override
        public ListInvocationStatusRequest build() {
            return new ListInvocationStatusRequest(this);
        } 

    } 

}
