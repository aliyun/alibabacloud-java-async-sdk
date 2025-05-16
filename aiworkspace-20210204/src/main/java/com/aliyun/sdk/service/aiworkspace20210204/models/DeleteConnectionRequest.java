// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link DeleteConnectionRequest} extends {@link RequestModel}
 *
 * <p>DeleteConnectionRequest</p>
 */
public class DeleteConnectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ConnectionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectionId;

    private DeleteConnectionRequest(Builder builder) {
        super(builder);
        this.connectionId = builder.connectionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteConnectionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return connectionId
     */
    public String getConnectionId() {
        return this.connectionId;
    }

    public static final class Builder extends Request.Builder<DeleteConnectionRequest, Builder> {
        private String connectionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteConnectionRequest request) {
            super(request);
            this.connectionId = request.connectionId;
        } 

        /**
         * <p>The connection ID. You can call <a href="url">ListConnections</a> to obtain the connection ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>conn-pai9m***mi47</p>
         */
        public Builder connectionId(String connectionId) {
            this.putPathParameter("ConnectionId", connectionId);
            this.connectionId = connectionId;
            return this;
        }

        @Override
        public DeleteConnectionRequest build() {
            return new DeleteConnectionRequest(this);
        } 

    } 

}
