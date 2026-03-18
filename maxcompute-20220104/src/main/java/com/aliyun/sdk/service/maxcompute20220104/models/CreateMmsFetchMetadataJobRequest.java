// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link CreateMmsFetchMetadataJobRequest} extends {@link RequestModel}
 *
 * <p>CreateMmsFetchMetadataJobRequest</p>
 */
public class CreateMmsFetchMetadataJobRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dbName")
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableNames")
    private java.util.List<String> tableNames;

    private CreateMmsFetchMetadataJobRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.dbName = builder.dbName;
        this.tableNames = builder.tableNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMmsFetchMetadataJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return tableNames
     */
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

    public static final class Builder extends Request.Builder<CreateMmsFetchMetadataJobRequest, Builder> {
        private Long sourceId; 
        private String dbName; 
        private java.util.List<String> tableNames; 

        private Builder() {
            super();
        } 

        private Builder(CreateMmsFetchMetadataJobRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.dbName = request.dbName;
            this.tableNames = request.tableNames;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000021</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * dbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("dbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * tableNames.
         */
        public Builder tableNames(java.util.List<String> tableNames) {
            this.putBodyParameter("tableNames", tableNames);
            this.tableNames = tableNames;
            return this;
        }

        @Override
        public CreateMmsFetchMetadataJobRequest build() {
            return new CreateMmsFetchMetadataJobRequest(this);
        } 

    } 

}
