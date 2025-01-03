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
 * {@link GetAdvanceConfigRequest} extends {@link RequestModel}
 *
 * <p>GetAdvanceConfigRequest</p>
 */
public class GetAdvanceConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("configName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String configName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private GetAdvanceConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.configName = builder.configName;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAdvanceConfigRequest create() {
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetAdvanceConfigRequest, Builder> {
        private String instanceId; 
        private String configName; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetAdvanceConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.configName = request.configName;
            this.type = request.type;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-18qug6zlc1r</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the advanced configuration.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-18qug6zlc1r_offline_adv_edit</p>
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * <ul>
         * <li>The type of the advanced configuration. Valid values: -ONLINE: online configuration</li>
         * <li>-ONLINE_CAVA: online Cava configuration</li>
         * <li>-ONLINE_PLUGIN: online plug-in configuration</li>
         * <li>-ONLINE_QUERY: query configuration</li>
         * <li>-OFFLINE_DICT: offline dictionary configuration</li>
         * <li>-OFFLINE_TABLE: offline table configuration</li>
         * <li>-OFFLINE_COMMON: offline configuration</li>
         * <li>-OFFLINE_PLUGIN: offline plug-in configuration</li>
         * <li>-OFFLINE_INDEX: index configuration</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetAdvanceConfigRequest build() {
            return new GetAdvanceConfigRequest(this);
        } 

    } 

}
