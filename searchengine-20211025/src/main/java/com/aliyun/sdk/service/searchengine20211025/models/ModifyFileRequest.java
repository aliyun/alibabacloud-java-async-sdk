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
 * {@link ModifyFileRequest} extends {@link RequestModel}
 *
 * <p>ModifyFileRequest</p>
 */
public class ModifyFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("indexName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String indexName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("versionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("content")
    private String content;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("partition")
    private Integer partition;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("fileName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileName;

    private ModifyFileRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.indexName = builder.indexName;
        this.versionName = builder.versionName;
        this.content = builder.content;
        this.partition = builder.partition;
        this.fileName = builder.fileName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyFileRequest create() {
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
     * @return indexName
     */
    public String getIndexName() {
        return this.indexName;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    /**
     * @return content
     */
    public String getContent() {
        return this.content;
    }

    /**
     * @return partition
     */
    public Integer getPartition() {
        return this.partition;
    }

    /**
     * @return fileName
     */
    public String getFileName() {
        return this.fileName;
    }

    public static final class Builder extends Request.Builder<ModifyFileRequest, Builder> {
        private String instanceId; 
        private String indexName; 
        private String versionName; 
        private String content; 
        private Integer partition; 
        private String fileName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyFileRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.indexName = request.indexName;
            this.versionName = request.versionName;
            this.content = request.content;
            this.partition = request.partition;
            this.fileName = request.fileName;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-i7m2ne76e02</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("instanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The index name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>automobile_vector</p>
         */
        public Builder indexName(String indexName) {
            this.putPathParameter("indexName", indexName);
            this.indexName = indexName;
            return this;
        }

        /**
         * <p>The version name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-cn-tl32m2c4u01@ha-cn-tl32m2c4u01_00@bj_vpc_domain_1@automobile_vector@index_config_edit</p>
         */
        public Builder versionName(String versionName) {
            this.putPathParameter("versionName", versionName);
            this.versionName = versionName;
            return this;
        }

        /**
         * <p>The file content.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder content(String content) {
            this.putBodyParameter("content", content);
            this.content = content;
            return this;
        }

        /**
         * <p>The number of shards.</p>
         * 
         * <strong>example:</strong>
         * <p>ds=20220713</p>
         */
        public Builder partition(Integer partition) {
            this.putBodyParameter("partition", partition);
            this.partition = partition;
            return this;
        }

        /**
         * <p>The name of the file in the full path</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/schemas/generation_schema.json</p>
         */
        public Builder fileName(String fileName) {
            this.putQueryParameter("fileName", fileName);
            this.fileName = fileName;
            return this;
        }

        @Override
        public ModifyFileRequest build() {
            return new ModifyFileRequest(this);
        } 

    } 

}
