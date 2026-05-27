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
 * {@link UpdateMmsTableRequest} extends {@link RequestModel}
 *
 * <p>UpdateMmsTableRequest</p>
 */
public class UpdateMmsTableRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("tableId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long tableId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstName")
    private String dstName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstProjectName")
    private String dstProjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstSchemaName")
    private String dstSchemaName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private UpdateMmsTableRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.tableId = builder.tableId;
        this.dstName = builder.dstName;
        this.dstProjectName = builder.dstProjectName;
        this.dstSchemaName = builder.dstSchemaName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMmsTableRequest create() {
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
     * @return tableId
     */
    public Long getTableId() {
        return this.tableId;
    }

    /**
     * @return dstName
     */
    public String getDstName() {
        return this.dstName;
    }

    /**
     * @return dstProjectName
     */
    public String getDstProjectName() {
        return this.dstProjectName;
    }

    /**
     * @return dstSchemaName
     */
    public String getDstSchemaName() {
        return this.dstSchemaName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateMmsTableRequest, Builder> {
        private Long sourceId; 
        private Long tableId; 
        private String dstName; 
        private String dstProjectName; 
        private String dstSchemaName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMmsTableRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.tableId = request.tableId;
            this.dstName = request.dstName;
            this.dstProjectName = request.dstProjectName;
            this.dstSchemaName = request.dstSchemaName;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000015</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20323</p>
         */
        public Builder tableId(Long tableId) {
            this.putPathParameter("tableId", tableId);
            this.tableId = tableId;
            return this;
        }

        /**
         * dstName.
         */
        public Builder dstName(String dstName) {
            this.putBodyParameter("dstName", dstName);
            this.dstName = dstName;
            return this;
        }

        /**
         * dstProjectName.
         */
        public Builder dstProjectName(String dstProjectName) {
            this.putBodyParameter("dstProjectName", dstProjectName);
            this.dstProjectName = dstProjectName;
            return this;
        }

        /**
         * dstSchemaName.
         */
        public Builder dstSchemaName(String dstSchemaName) {
            this.putBodyParameter("dstSchemaName", dstSchemaName);
            this.dstSchemaName = dstSchemaName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateMmsTableRequest build() {
            return new UpdateMmsTableRequest(this);
        } 

    } 

}
