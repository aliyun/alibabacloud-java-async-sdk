// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

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
 * {@link DeleteAdvanceConfigRequest} extends {@link RequestModel}
 *
 * <p>DeleteAdvanceConfigRequest</p>
 */
public class DeleteAdvanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    private String configName;

    private DeleteAdvanceConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.configName = builder.configName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAdvanceConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return configName
     */
    public String getConfigName() {
        return this.configName;
    }

    public static final class Builder extends Request.Builder<DeleteAdvanceConfigRequest, Builder> {
        private String instanceId; 
        private String configName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAdvanceConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.configName = request.configName;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2rps6c08</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The configuration name.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-0ju2rps6c08_offline_adv_v1</p>
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        @Override
        public DeleteAdvanceConfigRequest build() {
            return new DeleteAdvanceConfigRequest(this);
        } 

    } 

}
