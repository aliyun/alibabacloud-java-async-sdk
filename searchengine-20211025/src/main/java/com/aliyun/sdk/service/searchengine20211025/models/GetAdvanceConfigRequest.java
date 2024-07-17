// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The name of the advanced configuration.
         */
        public Builder configName(String configName) {
            this.putPathParameter("configName", configName);
            this.configName = configName;
            return this;
        }

        /**
         * *   The type of the advanced configuration. Valid values: -ONLINE: online configuration
         * <p>
         * *   \-ONLINE_CAVA: online Cava configuration
         * *   \-ONLINE_PLUGIN: online plug-in configuration
         * *   \-ONLINE_QUERY: query configuration
         * *   \-OFFLINE_DICT: offline dictionary configuration
         * *   \-OFFLINE_TABLE: offline table configuration
         * *   \-OFFLINE_COMMON: offline configuration
         * *   \-OFFLINE_PLUGIN: offline plug-in configuration
         * *   \-OFFLINE_INDEX: index configuration
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
