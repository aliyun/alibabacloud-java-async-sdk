// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

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
 * {@link ListAllNodeRequest} extends {@link RequestModel}
 *
 * <p>ListAllNodeRequest</p>
 */
public class ListAllNodeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("extended")
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
         * <p>The return results.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>es-cn-tl32cpgwa002l****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The Java Virtual Machine (JVM) heap memory usage of the node.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
