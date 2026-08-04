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
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
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

        @Override
        public StartListMcpServerToolsRequest build() {
            return new StartListMcpServerToolsRequest(this);
        } 

    } 

}
