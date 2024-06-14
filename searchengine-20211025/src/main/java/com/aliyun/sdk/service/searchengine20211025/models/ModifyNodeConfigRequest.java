// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNodeConfigRequest} extends {@link RequestModel}
 *
 * <p>ModifyNodeConfigRequest</p>
 */
public class ModifyNodeConfigRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("active")
    private Boolean active;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataDuplicateNumber")
    private Integer dataDuplicateNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataFragmentNumber")
    private Integer dataFragmentNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("flowRatio")
    private Integer flowRatio;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("minServicePercent")
    private Integer minServicePercent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("published")
    private Boolean published;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("clusterName")
    private String clusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ModifyNodeConfigRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.active = builder.active;
        this.dataDuplicateNumber = builder.dataDuplicateNumber;
        this.dataFragmentNumber = builder.dataFragmentNumber;
        this.flowRatio = builder.flowRatio;
        this.minServicePercent = builder.minServicePercent;
        this.published = builder.published;
        this.clusterName = builder.clusterName;
        this.dataSourceName = builder.dataSourceName;
        this.name = builder.name;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyNodeConfigRequest create() {
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
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return dataDuplicateNumber
     */
    public Integer getDataDuplicateNumber() {
        return this.dataDuplicateNumber;
    }

    /**
     * @return dataFragmentNumber
     */
    public Integer getDataFragmentNumber() {
        return this.dataFragmentNumber;
    }

    /**
     * @return flowRatio
     */
    public Integer getFlowRatio() {
        return this.flowRatio;
    }

    /**
     * @return minServicePercent
     */
    public Integer getMinServicePercent() {
        return this.minServicePercent;
    }

    /**
     * @return published
     */
    public Boolean getPublished() {
        return this.published;
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ModifyNodeConfigRequest, Builder> {
        private String instanceId; 
        private Boolean active; 
        private Integer dataDuplicateNumber; 
        private Integer dataFragmentNumber; 
        private Integer flowRatio; 
        private Integer minServicePercent; 
        private Boolean published; 
        private String clusterName; 
        private String dataSourceName; 
        private String name; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ModifyNodeConfigRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.active = request.active;
            this.dataDuplicateNumber = request.dataDuplicateNumber;
            this.dataFragmentNumber = request.dataFragmentNumber;
            this.flowRatio = request.flowRatio;
            this.minServicePercent = request.minServicePercent;
            this.published = request.published;
            this.clusterName = request.clusterName;
            this.dataSourceName = request.dataSourceName;
            this.name = request.name;
            this.type = request.type;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * Specifies whether to enable the index.
         */
        public Builder active(Boolean active) {
            this.putBodyParameter("active", active);
            this.active = active;
            return this;
        }

        /**
         * The number of data replicas.
         */
        public Builder dataDuplicateNumber(Integer dataDuplicateNumber) {
            this.putBodyParameter("dataDuplicateNumber", dataDuplicateNumber);
            this.dataDuplicateNumber = dataDuplicateNumber;
            return this;
        }

        /**
         * The number of data shards.
         */
        public Builder dataFragmentNumber(Integer dataFragmentNumber) {
            this.putBodyParameter("dataFragmentNumber", dataFragmentNumber);
            this.dataFragmentNumber = dataFragmentNumber;
            return this;
        }

        /**
         * The traffic percentage.
         */
        public Builder flowRatio(Integer flowRatio) {
            this.putBodyParameter("flowRatio", flowRatio);
            this.flowRatio = flowRatio;
            return this;
        }

        /**
         * The minimum service ratio.
         */
        public Builder minServicePercent(Integer minServicePercent) {
            this.putBodyParameter("minServicePercent", minServicePercent);
            this.minServicePercent = minServicePercent;
            return this;
        }

        /**
         * Specifies whether to mount the cluster.
         */
        public Builder published(Boolean published) {
            this.putBodyParameter("published", published);
            this.published = published;
            return this;
        }

        /**
         * The name of the cluster.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("clusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * The name of the data source. Valid values: search and not_search. search indicates to search data. not_search indicates not to search data.
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putQueryParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * The original name of the node.
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * The type of the algorithm. Valid values: pop, cp, hot, hint, and suggest.
         * <p>
         * 
         * *   pop indicates the popularity model.
         * *   cp indicates the category prediction model.
         * *   hot indicates the top search model.
         * *   hint indicates the hint model.
         * *   suggest indicates the drop-down suggestion model.
         */
        public Builder type(String type) {
            this.putQueryParameter("type", type);
            this.type = type;
            return this;
        }

        @Override
        public ModifyNodeConfigRequest build() {
            return new ModifyNodeConfigRequest(this);
        } 

    } 

}
