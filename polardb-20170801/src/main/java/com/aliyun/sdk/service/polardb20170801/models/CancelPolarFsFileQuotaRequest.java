// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link CancelPolarFsFileQuotaRequest} extends {@link RequestModel}
 *
 * <p>CancelPolarFsFileQuotaRequest</p>
 */
public class CancelPolarFsFileQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FilePathIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String filePathIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PolarFsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String polarFsInstanceId;

    private CancelPolarFsFileQuotaRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.filePathIds = builder.filePathIds;
        this.polarFsInstanceId = builder.polarFsInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelPolarFsFileQuotaRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return filePathIds
     */
    public String getFilePathIds() {
        return this.filePathIds;
    }

    /**
     * @return polarFsInstanceId
     */
    public String getPolarFsInstanceId() {
        return this.polarFsInstanceId;
    }

    public static final class Builder extends Request.Builder<CancelPolarFsFileQuotaRequest, Builder> {
        private String DBClusterId; 
        private String filePathIds; 
        private String polarFsInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(CancelPolarFsFileQuotaRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.filePathIds = request.filePathIds;
            this.polarFsInstanceId = request.polarFsInstanceId;
        } 

        /**
         * DBClusterId.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>/path1,/path2</p>
         */
        public Builder filePathIds(String filePathIds) {
            this.putQueryParameter("FilePathIds", filePathIds);
            this.filePathIds = filePathIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pfs-2ze0i74ka607*****</p>
         */
        public Builder polarFsInstanceId(String polarFsInstanceId) {
            this.putQueryParameter("PolarFsInstanceId", polarFsInstanceId);
            this.polarFsInstanceId = polarFsInstanceId;
            return this;
        }

        @Override
        public CancelPolarFsFileQuotaRequest build() {
            return new CancelPolarFsFileQuotaRequest(this);
        } 

    } 

}
