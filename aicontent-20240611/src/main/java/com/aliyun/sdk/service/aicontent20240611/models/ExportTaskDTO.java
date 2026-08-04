// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aicontent20240611.models;

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
 * {@link ExportTaskDTO} extends {@link TeaModel}
 *
 * <p>ExportTaskDTO</p>
 */
public class ExportTaskDTO extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("error")
    private String error;

    @com.aliyun.core.annotation.NameInMap("filename")
    private String filename;

    @com.aliyun.core.annotation.NameInMap("finishedAt")
    private Long finishedAt;

    @com.aliyun.core.annotation.NameInMap("id")
    private String id;

    @com.aliyun.core.annotation.NameInMap("maxRows")
    private Integer maxRows;

    @com.aliyun.core.annotation.NameInMap("progress")
    private Integer progress;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    private ExportTaskDTO(Builder builder) {
        this.createdAt = builder.createdAt;
        this.error = builder.error;
        this.filename = builder.filename;
        this.finishedAt = builder.finishedAt;
        this.id = builder.id;
        this.maxRows = builder.maxRows;
        this.progress = builder.progress;
        this.status = builder.status;
        this.total = builder.total;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportTaskDTO create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return error
     */
    public String getError() {
        return this.error;
    }

    /**
     * @return filename
     */
    public String getFilename() {
        return this.filename;
    }

    /**
     * @return finishedAt
     */
    public Long getFinishedAt() {
        return this.finishedAt;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return maxRows
     */
    public Integer getMaxRows() {
        return this.maxRows;
    }

    /**
     * @return progress
     */
    public Integer getProgress() {
        return this.progress;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Long createdAt; 
        private String error; 
        private String filename; 
        private Long finishedAt; 
        private String id; 
        private Integer maxRows; 
        private Integer progress; 
        private String status; 
        private Integer total; 
        private String type; 

        private Builder() {
        } 

        private Builder(ExportTaskDTO model) {
            this.createdAt = model.createdAt;
            this.error = model.error;
            this.filename = model.filename;
            this.finishedAt = model.finishedAt;
            this.id = model.id;
            this.maxRows = model.maxRows;
            this.progress = model.progress;
            this.status = model.status;
            this.total = model.total;
            this.type = model.type;
        } 

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * error.
         */
        public Builder error(String error) {
            this.error = error;
            return this;
        }

        /**
         * filename.
         */
        public Builder filename(String filename) {
            this.filename = filename;
            return this;
        }

        /**
         * finishedAt.
         */
        public Builder finishedAt(Long finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }

        /**
         * id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * maxRows.
         */
        public Builder maxRows(Integer maxRows) {
            this.maxRows = maxRows;
            return this;
        }

        /**
         * progress.
         */
        public Builder progress(Integer progress) {
            this.progress = progress;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public ExportTaskDTO build() {
            return new ExportTaskDTO(this);
        } 

    } 

}
