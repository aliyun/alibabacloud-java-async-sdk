// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceSpecsRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceSpecsRequest</p>
 */
public class ListInstanceSpecsRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The node type. Valid values:
         * <p>
         * 
         * *   qrs: Query Result Searcher (QRS) Worker
         * *   search: Searcher Worker
         * *   index: index node
         * *   cluster: cluster
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
