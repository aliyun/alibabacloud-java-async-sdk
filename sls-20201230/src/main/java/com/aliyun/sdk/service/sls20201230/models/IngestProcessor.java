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
 * {@link IngestProcessor} extends {@link TeaModel}
 *
 * <p>IngestProcessor</p>
 */
public class IngestProcessor extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("configuration")
    @com.aliyun.core.annotation.Validation(required = true)
    private IngestProcessorConfiguration configuration;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("displayName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String displayName;

    @com.aliyun.core.annotation.NameInMap("processorName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String processorName;

    @com.aliyun.core.annotation.NameInMap("updateTime")
    private Long updateTime;

    private IngestProcessor(Builder builder) {
        this.configuration = builder.configuration;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.displayName = builder.displayName;
        this.processorName = builder.processorName;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IngestProcessor create() {
        return builder().build();
    }

    /**
     * @return configuration
     */
    public IngestProcessorConfiguration getConfiguration() {
        return this.configuration;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return processorName
     */
    public String getProcessorName() {
        return this.processorName;
    }

    /**
     * @return updateTime
     */
    public Long getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private IngestProcessorConfiguration configuration; 
        private Long createTime; 
        private String description; 
        private String displayName; 
        private String processorName; 
        private Long updateTime; 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder configuration(IngestProcessorConfiguration configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>字段过滤处理</p>
         */
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ingest-processor-1</p>
         */
        public Builder processorName(String processorName) {
            this.processorName = processorName;
            return this;
        }

        /**
         * updateTime.
         */
        public Builder updateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public IngestProcessor build() {
            return new IngestProcessor(this);
        } 

    } 

}
