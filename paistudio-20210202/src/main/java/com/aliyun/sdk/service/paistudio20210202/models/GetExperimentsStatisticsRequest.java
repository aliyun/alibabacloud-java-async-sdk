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
 * {@link GetExperimentsStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetExperimentsStatisticsRequest</p>
 */
public class GetExperimentsStatisticsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceIds;

    private GetExperimentsStatisticsRequest(Builder builder) {
        super(builder);
        this.source = builder.source;
        this.workspaceIds = builder.workspaceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentsStatisticsRequest create() {
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
     * @return workspaceIds
     */
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    public static final class Builder extends Request.Builder<GetExperimentsStatisticsRequest, Builder> {
        private String source; 
        private String workspaceIds; 

        private Builder() {
            super();
        } 

        private Builder(GetExperimentsStatisticsRequest request) {
            super(request);
            this.source = request.source;
            this.workspaceIds = request.workspaceIds;
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
         * <p>123,345</p>
         */
        public Builder workspaceIds(String workspaceIds) {
            this.putQueryParameter("WorkspaceIds", workspaceIds);
            this.workspaceIds = workspaceIds;
            return this;
        }

        @Override
        public GetExperimentsStatisticsRequest build() {
            return new GetExperimentsStatisticsRequest(this);
        } 

    } 

}
