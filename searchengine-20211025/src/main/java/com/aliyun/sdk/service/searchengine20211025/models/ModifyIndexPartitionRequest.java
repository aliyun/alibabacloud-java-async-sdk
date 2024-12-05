// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyIndexPartitionRequest} extends {@link RequestModel}
 *
 * <p>ModifyIndexPartitionRequest</p>
 */
public class ModifyIndexPartitionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataSourceName")
    private String dataSourceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("domainName")
    private String domainName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("generation")
    private Long generation;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("indexInfos")
    private java.util.List < IndexInfos> indexInfos;

    private ModifyIndexPartitionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dataSourceName = builder.dataSourceName;
        this.domainName = builder.domainName;
        this.generation = builder.generation;
        this.indexInfos = builder.indexInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyIndexPartitionRequest create() {
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
     * @return dataSourceName
     */
    public String getDataSourceName() {
        return this.dataSourceName;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return generation
     */
    public Long getGeneration() {
        return this.generation;
    }

    /**
     * @return indexInfos
     */
    public java.util.List < IndexInfos> getIndexInfos() {
        return this.indexInfos;
    }

    public static final class Builder extends Request.Builder<ModifyIndexPartitionRequest, Builder> {
        private String instanceId; 
        private String dataSourceName; 
        private String domainName; 
        private Long generation; 
        private java.util.List < IndexInfos> indexInfos; 

        private Builder() {
            super();
        } 

        private Builder(ModifyIndexPartitionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dataSourceName = request.dataSourceName;
            this.domainName = request.domainName;
            this.generation = request.generation;
            this.indexInfos = request.indexInfos;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-7mz2ttxta01</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The name of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>test1</p>
         */
        public Builder dataSourceName(String dataSourceName) {
            this.putBodyParameter("dataSourceName", dataSourceName);
            this.dataSourceName = dataSourceName;
            return this;
        }

        /**
         * <p>The data center.</p>
         * 
         * <strong>example:</strong>
         * <p>pre_domain_1</p>
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("domainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>The primary key.</p>
         * 
         * <strong>example:</strong>
         * <p>1633293829</p>
         */
        public Builder generation(Long generation) {
            this.putBodyParameter("generation", generation);
            this.generation = generation;
            return this;
        }

        /**
         * <p>The index information.</p>
         */
        public Builder indexInfos(java.util.List < IndexInfos> indexInfos) {
            this.putBodyParameter("indexInfos", indexInfos);
            this.indexInfos = indexInfos;
            return this;
        }

        @Override
        public ModifyIndexPartitionRequest build() {
            return new ModifyIndexPartitionRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyIndexPartitionRequest} extends {@link TeaModel}
     *
     * <p>ModifyIndexPartitionRequest</p>
     */
    public static class IndexInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("indexName")
        private String indexName;

        @com.aliyun.core.annotation.NameInMap("parallelNum")
        private Integer parallelNum;

        @com.aliyun.core.annotation.NameInMap("partitionCount")
        private Integer partitionCount;

        private IndexInfos(Builder builder) {
            this.indexName = builder.indexName;
            this.parallelNum = builder.parallelNum;
            this.partitionCount = builder.partitionCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IndexInfos create() {
            return builder().build();
        }

        /**
         * @return indexName
         */
        public String getIndexName() {
            return this.indexName;
        }

        /**
         * @return parallelNum
         */
        public Integer getParallelNum() {
            return this.parallelNum;
        }

        /**
         * @return partitionCount
         */
        public Integer getPartitionCount() {
            return this.partitionCount;
        }

        public static final class Builder {
            private String indexName; 
            private Integer parallelNum; 
            private Integer partitionCount; 

            /**
             * <p>The index name.</p>
             * 
             * <strong>example:</strong>
             * <p>atest2</p>
             */
            public Builder indexName(String indexName) {
                this.indexName = indexName;
                return this;
            }

            /**
             * <p>The concurrency. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parallelNum(Integer parallelNum) {
                this.parallelNum = parallelNum;
                return this;
            }

            /**
             * <p>The number of shards.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder partitionCount(Integer partitionCount) {
                this.partitionCount = partitionCount;
                return this;
            }

            public IndexInfos build() {
                return new IndexInfos(this);
            } 

        } 

    }
}
