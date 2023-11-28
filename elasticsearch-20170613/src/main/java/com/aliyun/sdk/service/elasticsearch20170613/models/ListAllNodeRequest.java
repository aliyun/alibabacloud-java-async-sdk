// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAllNodeRequest} extends {@link RequestModel}
 *
 * <p>ListAllNodeRequest</p>
 */
public class ListAllNodeRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("extended")
    private Boolean extended;

    private ListAllNodeRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.extended = builder.extended;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAllNodeRequest create() {
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
     * @return extended
     */
    public Boolean getExtended() {
        return this.extended;
    }

    public static final class Builder extends Request.Builder<ListAllNodeRequest, Builder> {
        private String instanceId; 
        private Boolean extended; 

        private Builder() {
            super();
        } 

        private Builder(ListAllNodeRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.extended = request.extended;
        } 

        /**
         * The return results.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The Java Virtual Machine (JVM) heap memory usage of the node.
         */
        public Builder extended(Boolean extended) {
            this.putQueryParameter("extended", extended);
            this.extended = extended;
            return this;
        }

        @Override
        public ListAllNodeRequest build() {
            return new ListAllNodeRequest(this);
        } 

    } 

}
