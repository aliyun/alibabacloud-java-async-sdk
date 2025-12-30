// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link DashscopeAsyncTaskFinishEventRequest} extends {@link RequestModel}
 *
 * <p>DashscopeAsyncTaskFinishEventRequest</p>
 */
public class DashscopeAsyncTaskFinishEventRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("X-Load-Test")
    private Boolean xLoadTest;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.Map<String, ?> body;

    private DashscopeAsyncTaskFinishEventRequest(Builder builder) {
        super(builder);
        this.workspaceId = builder.workspaceId;
        this.xLoadTest = builder.xLoadTest;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DashscopeAsyncTaskFinishEventRequest create() {
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
     * @return xLoadTest
     */
    public Boolean getXLoadTest() {
        return this.xLoadTest;
    }

    /**
     * @return body
     */
    public java.util.Map<String, ?> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<DashscopeAsyncTaskFinishEventRequest, Builder> {
        private String workspaceId; 
        private Boolean xLoadTest; 
        private java.util.Map<String, ?> body; 

        private Builder() {
            super();
        } 

        private Builder(DashscopeAsyncTaskFinishEventRequest request) {
            super(request);
            this.workspaceId = request.workspaceId;
            this.xLoadTest = request.xLoadTest;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("workspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * X-Load-Test.
         */
        public Builder xLoadTest(Boolean xLoadTest) {
            this.putHeaderParameter("X-Load-Test", xLoadTest);
            this.xLoadTest = xLoadTest;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.Map<String, ?> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public DashscopeAsyncTaskFinishEventRequest build() {
            return new DashscopeAsyncTaskFinishEventRequest(this);
        } 

    } 

}
