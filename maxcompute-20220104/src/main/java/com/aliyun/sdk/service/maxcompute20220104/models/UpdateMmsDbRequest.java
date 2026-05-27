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
 * {@link UpdateMmsDbRequest} extends {@link RequestModel}
 *
 * <p>UpdateMmsDbRequest</p>
 */
public class UpdateMmsDbRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("dbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dbId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstName")
    private String dstName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstProjectName")
    private String dstProjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    private UpdateMmsDbRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.dbId = builder.dbId;
        this.dstName = builder.dstName;
        this.dstProjectName = builder.dstProjectName;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMmsDbRequest create() {
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
     * @return dbId
     */
    public Long getDbId() {
        return this.dbId;
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateMmsDbRequest, Builder> {
        private Long sourceId; 
        private Long dbId; 
        private String dstName; 
        private String dstProjectName; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMmsDbRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.dbId = request.dbId;
            this.dstName = request.dstName;
            this.dstProjectName = request.dstProjectName;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000014</p>
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
         * <p>2</p>
         */
        public Builder dbId(Long dbId) {
            this.putPathParameter("dbId", dbId);
            this.dbId = dbId;
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
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateMmsDbRequest build() {
            return new UpdateMmsDbRequest(this);
        } 

    } 

}
