// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInvocationStatusRequest} extends {@link RequestModel}
 *
 * <p>ListInvocationStatusRequest</p>
 */
public class ListInvocationStatusRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("CommandId")
    @Validation(required = true)
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
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The ID of the command.
         * <p>
         * 
         * You can call the [ListCommands](~~87388~~) operation to query the command ID.
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
