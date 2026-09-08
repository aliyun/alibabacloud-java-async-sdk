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
 * {@link StartListMcpServerToolsRequest} extends {@link RequestModel}
 *
 * <p>StartListMcpServerToolsRequest</p>
 */
public class StartListMcpServerToolsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("McpServerUuid")
    private String mcpServerUuid;

    private StartListMcpServerToolsRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.language = builder.language;
        this.mcpServerUuid = builder.mcpServerUuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartListMcpServerToolsRequest create() {
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
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return mcpServerUuid
     */
    public String getMcpServerUuid() {
        return this.mcpServerUuid;
    }

    public static final class Builder extends Request.Builder<StartListMcpServerToolsRequest, Builder> {
        private String DMSUnit; 
        private String language; 
        private String mcpServerUuid; 

        private Builder() {
            super();
        } 

        private Builder(StartListMcpServerToolsRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.language = request.language;
            this.mcpServerUuid = request.mcpServerUuid;
        } 

        /**
         * <p>The identifier of the Data Management unit that runs the Data Agent resources.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * <p>The language used for the detection session.</p>
         * 
         * <strong>example:</strong>
         * <p>CHINESE</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>The ID of the MCP Server for which to detect connectivity and query the tool list. Only the service creator can trigger the detection.</p>
         * 
         * <strong>example:</strong>
         * <p>44lg***z65</p>
         */
        public Builder mcpServerUuid(String mcpServerUuid) {
            this.putQueryParameter("McpServerUuid", mcpServerUuid);
            this.mcpServerUuid = mcpServerUuid;
            return this;
        }

        @Override
        public StartListMcpServerToolsRequest build() {
            return new StartListMcpServerToolsRequest(this);
        } 

    } 

}
