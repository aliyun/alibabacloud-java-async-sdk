// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr_serverless_spark20230808.models;

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
 * {@link ListKyuubiServicesRequest} extends {@link RequestModel}
 *
 * <p>ListKyuubiServicesRequest</p>
 */
public class ListKyuubiServicesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("token")
    private String token;

    private ListKyuubiServicesRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.token = builder.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListKyuubiServicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<ListKyuubiServicesRequest, Builder> {
        private String workspaceId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(ListKyuubiServicesRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.token = request.token;
        } 

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>w-d2d82aa09155****</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The token of the Kyuubi Gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>6w3s2e7y7t9fxnvtai9sv1uebw8b7bvc</p>
         */
        public Builder token(String token) {
            this.putQueryParameter("token", token);
            this.token = token;
            return this;
        }

        @Override
        public ListKyuubiServicesRequest build() {
            return new ListKyuubiServicesRequest(this);
        } 

    } 

}
