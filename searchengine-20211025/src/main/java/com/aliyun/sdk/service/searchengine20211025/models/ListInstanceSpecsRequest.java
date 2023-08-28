// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceSpecsRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceSpecsRequest</p>
 */
public class ListInstanceSpecsRequest extends Request {
    @Path
    @NameInMap("instanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    private ListInstanceSpecsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceSpecsRequest create() {
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
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListInstanceSpecsRequest, Builder> {
        private String instanceId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceSpecsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.type = request.type;
        } 

        /**
         * The ID of the instance
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The node type. Valid values: qrs, search, index, and cluster. qrs specifies an Query Result Searcher (QRS) worker, search specifies a searcher worker, index specifies an index node, and cluster specifies a cluster.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListInstanceSpecsRequest build() {
            return new ListInstanceSpecsRequest(this);
        } 

    } 

}
