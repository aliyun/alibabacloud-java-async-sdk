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
 * {@link GetContextRequest} extends {@link RequestModel}
 *
 * <p>GetContextRequest</p>
 */
public class GetContextRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String workspace;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextStoreName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String contextStoreName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("contextId")
    @com.aliyun.core.annotation.Validation(required = true, minLength = 1)
    private String contextId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("formatted")
    private Boolean formatted;

    private GetContextRequest(Builder builder) {
        super(builder);
        this.workspace = builder.workspace;
        this.contextStoreName = builder.contextStoreName;
        this.contextId = builder.contextId;
        this.formatted = builder.formatted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetContextRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspace
     */
    public String getWorkspace() {
        return this.workspace;
    }

    /**
     * @return contextStoreName
     */
    public String getContextStoreName() {
        return this.contextStoreName;
    }

    /**
     * @return contextId
     */
    public String getContextId() {
        return this.contextId;
    }

    /**
     * @return formatted
     */
    public Boolean getFormatted() {
        return this.formatted;
    }

    public static final class Builder extends Request.Builder<GetContextRequest, Builder> {
        private String workspace; 
        private String contextStoreName; 
        private String contextId; 
        private Boolean formatted; 

        private Builder() {
            super();
        } 

        private Builder(GetContextRequest request) {
            super(request);
            this.workspace = request.workspace;
            this.contextStoreName = request.contextStoreName;
            this.contextId = request.contextId;
            this.formatted = request.formatted;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>workspace-test</p>
         */
        public Builder workspace(String workspace) {
            this.putPathParameter("workspace", workspace);
            this.workspace = workspace;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-context-store</p>
         */
        public Builder contextStoreName(String contextStoreName) {
            this.putPathParameter("contextStoreName", contextStoreName);
            this.contextStoreName = contextStoreName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>897294a7-67a4-4f60-976c-e136edc5f97e</p>
         */
        public Builder contextId(String contextId) {
            this.putPathParameter("contextId", contextId);
            this.contextId = contextId;
            return this;
        }

        /**
         * formatted.
         */
        public Builder formatted(Boolean formatted) {
            this.putQueryParameter("formatted", formatted);
            this.formatted = formatted;
            return this;
        }

        @Override
        public GetContextRequest build() {
            return new GetContextRequest(this);
        } 

    } 

}
