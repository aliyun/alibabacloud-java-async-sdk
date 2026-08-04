// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link GetListMcpServerToolsResultRequest} extends {@link RequestModel}
 *
 * <p>GetListMcpServerToolsResultRequest</p>
 */
public class GetListMcpServerToolsResultRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McpServerUuid")
    private String mcpServerUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SessionId")
    private String sessionId;

    private GetListMcpServerToolsResultRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.mcpServerUuid = builder.mcpServerUuid;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListMcpServerToolsResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return mcpServerUuid
     */
    public String getMcpServerUuid() {
        return this.mcpServerUuid;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<GetListMcpServerToolsResultRequest, Builder> {
        private String DMSUnit; 
        private String mcpServerUuid; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(GetListMcpServerToolsResultRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.mcpServerUuid = request.mcpServerUuid;
            this.sessionId = request.sessionId;
        } 

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * McpServerUuid.
         */
        public Builder mcpServerUuid(String mcpServerUuid) {
            this.putQueryParameter("McpServerUuid", mcpServerUuid);
            this.mcpServerUuid = mcpServerUuid;
            return this;
        }

        /**
         * SessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putQueryParameter("SessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public GetListMcpServerToolsResultRequest build() {
            return new GetListMcpServerToolsResultRequest(this);
        } 

    } 

}
