// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hologram20220601.models;

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
 * {@link ListDatabasesRequest} extends {@link RequestModel}
 *
 * <p>ListDatabasesRequest</p>
 */
public class ListDatabasesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("external")
    private Boolean external;

    private ListDatabasesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.external = builder.external;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDatabasesRequest create() {
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
     * @return external
     */
    public Boolean getExternal() {
        return this.external;
    }

    public static final class Builder extends Request.Builder<ListDatabasesRequest, Builder> {
        private String instanceId; 
        private Boolean external; 

        private Builder() {
            super();
        } 

        private Builder(ListDatabasesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.external = request.external;
        } 

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hgpostcn-cn-jfj3zckut008</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>Specifies whether to list foreign tables separately. Valid values: true: yes, false or null: no.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder external(Boolean external) {
            this.putQueryParameter("external", external);
            this.external = external;
            return this;
        }

        @Override
        public ListDatabasesRequest build() {
            return new ListDatabasesRequest(this);
        } 

    } 

}
