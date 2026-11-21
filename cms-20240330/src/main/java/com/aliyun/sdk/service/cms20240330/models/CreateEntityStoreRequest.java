// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link CreateEntityStoreRequest} extends {@link RequestModel}
 *
 * <p>CreateEntityStoreRequest</p>
 */
public class CreateEntityStoreRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dryRun")
    private Boolean dryRun;

    private CreateEntityStoreRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.dryRun = builder.dryRun;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateEntityStoreRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static final class Builder extends Request.Builder<CreateEntityStoreRequest, Builder> {
        private String workspaceName; 
        private Boolean dryRun; 

        private Builder() {
            super();
        } 

        private Builder(CreateEntityStoreRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.dryRun = request.dryRun;
        } 

        /**
         * <p>The name of the workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test-001</p>
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values: true: performs a dry run without making actual changes. false: sends a normal request. Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("dryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        @Override
        public CreateEntityStoreRequest build() {
            return new CreateEntityStoreRequest(this);
        } 

    } 

}
