// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link DeleteAgentInstanceConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgentInstanceConfigRequest</p>
 */
public class DeleteAgentInstanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("isGray")
    private Boolean isGray;

    private DeleteAgentInstanceConfigRequest(Builder builder) {
        super(builder);
        this.configName = builder.configName;
        this.isGray = builder.isGray;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgentInstanceConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    /**
     * @return isGray
     */
    public Boolean getIsGray() {
        return this.isGray;
    }

    public static final class Builder extends Request.Builder<DeleteAgentInstanceConfigRequest, Builder> {
        private String configName; 
        private Boolean isGray; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgentInstanceConfigRequest request) {
            super(request);
            this.configName = request.configName;
            this.isGray = request.isGray;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * isGray.
         */
        public Builder isGray(Boolean isGray) {
            this.putQueryParameter("isGray", isGray);
            this.isGray = isGray;
            return this;
        }

        @Override
        public DeleteAgentInstanceConfigRequest build() {
            return new DeleteAgentInstanceConfigRequest(this);
        } 

    } 

}
