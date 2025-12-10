// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetExperimentsUsersStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentsUsersStatisticsRequest</p>
 */
public class GetExperimentsUsersStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private GetExperimentsUsersStatisticsRequest(Builder builder) {
        super(builder);
        this.source = builder.source;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentsUsersStatisticsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<GetExperimentsUsersStatisticsRequest, Builder> {
        private String source; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentsUsersStatisticsRequest request) {
            super(request);
            this.source = request.source;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Source.
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public GetExperimentsUsersStatisticsRequest build() {
            return new GetExperimentsUsersStatisticsRequest(this);
        } 

    } 

}
