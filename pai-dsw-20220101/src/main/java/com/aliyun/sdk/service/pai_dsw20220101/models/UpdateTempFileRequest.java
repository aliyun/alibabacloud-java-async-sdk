// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link UpdateTempFileRequest} extends {@link RequestModel}
 *
 * <p>UpdateTempFileRequest</p>
 */
public class UpdateTempFileRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TempFileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tempFileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GmtExpiredTime")
    private String gmtExpiredTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private UpdateTempFileRequest(Builder builder) {
        super(builder);
        this.tempFileId = builder.tempFileId;
        this.gmtExpiredTime = builder.gmtExpiredTime;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTempFileRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tempFileId
     */
    public String getTempFileId() {
        return this.tempFileId;
    }

    /**
     * @return gmtExpiredTime
     */
    public String getGmtExpiredTime() {
        return this.gmtExpiredTime;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateTempFileRequest, Builder> {
        private String tempFileId; 
        private String gmtExpiredTime; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTempFileRequest request) {
            super(request);
            this.tempFileId = request.tempFileId;
            this.gmtExpiredTime = request.gmtExpiredTime;
            this.status = request.status;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tempfile-05cexxxxxxxxx</p>
         */
        public Builder tempFileId(String tempFileId) {
            this.putPathParameter("TempFileId", tempFileId);
            this.tempFileId = tempFileId;
            return this;
        }

        /**
         * GmtExpiredTime.
         */
        public Builder gmtExpiredTime(String gmtExpiredTime) {
            this.putBodyParameter("GmtExpiredTime", gmtExpiredTime);
            this.gmtExpiredTime = gmtExpiredTime;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateTempFileRequest build() {
            return new UpdateTempFileRequest(this);
        } 

    } 

}
