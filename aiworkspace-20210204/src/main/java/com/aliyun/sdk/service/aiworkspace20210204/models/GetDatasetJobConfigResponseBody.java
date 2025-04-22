// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link GetDatasetJobConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetDatasetJobConfigResponseBody</p>
 */
public class GetDatasetJobConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("ConfigType")
    private String configType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DatasetId")
    private String datasetId;

    @com.aliyun.core.annotation.NameInMap("ModifyTime")
    private String modifyTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetDatasetJobConfigResponseBody(Builder builder) {
        this.config = builder.config;
        this.configType = builder.configType;
        this.createTime = builder.createTime;
        this.datasetId = builder.datasetId;
        this.modifyTime = builder.modifyTime;
        this.requestId = builder.requestId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDatasetJobConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return configType
     */
    public String getConfigType() {
        return this.configType;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return datasetId
     */
    public String getDatasetId() {
        return this.datasetId;
    }

    /**
     * @return modifyTime
     */
    public String getModifyTime() {
        return this.modifyTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String config; 
        private String configType; 
        private String createTime; 
        private String datasetId; 
        private String modifyTime; 
        private String requestId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetDatasetJobConfigResponseBody model) {
            this.config = model.config;
            this.configType = model.configType;
            this.createTime = model.createTime;
            this.datasetId = model.datasetId;
            this.modifyTime = model.modifyTime;
            this.requestId = model.requestId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The configuration content. Configuration format for MultimodalIntelligentTag:</p>
         * <p>{ &quot;apiKey&quot;:&quot;sk-xxxxxxxxxxxxxxxxxxxxx&quot; }</p>
         * <p>MultimodalSemanticIndex</p>
         * <p>{ &quot;defaultModelId&quot;: &quot;xxx&quot; &quot;defaultModelVersion&quot;:&quot;1.0.0&quot; }</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;apiKey&quot;:&quot;sk-xxxxxxxxxxxxxxxxxxxxx&quot; }</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The configuration type. Valid values:</p>
         * <ul>
         * <li>MultimodalIntelligentTag</li>
         * <li>MultimodalSemanticIndex</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MultimodalIntelligentTag</p>
         */
        public Builder configType(String configType) {
            this.configType = configType;
            return this;
        }

        /**
         * <p>The time when the configuration is created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-10-16T01:44:10Z</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The dataset ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-lfd60v0p****ujtsdx</p>
         */
        public Builder datasetId(String datasetId) {
            this.datasetId = datasetId;
            return this;
        }

        /**
         * <p>The time when the configuration is modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-26T02:17:18Z</p>
         */
        public Builder modifyTime(String modifyTime) {
            this.modifyTime = modifyTime;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D5BFFEE3-6025-443F-8A03-02D619B5C4B9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>114243</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetDatasetJobConfigResponseBody build() {
            return new GetDatasetJobConfigResponseBody(this);
        } 

    } 

}
