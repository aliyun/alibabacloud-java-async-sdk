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
 * {@link UpdateTempFileTaskRequest} extends {@link RequestModel}
 *
 * <p>UpdateTempFileTaskRequest</p>
 */
public class UpdateTempFileTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TempFileTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tempFileTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GmtExpiredTime")
    private String gmtExpiredTime;

    private UpdateTempFileTaskRequest(Builder builder) {
        super(builder);
        this.tempFileTaskId = builder.tempFileTaskId;
        this.gmtExpiredTime = builder.gmtExpiredTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTempFileTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tempFileTaskId
     */
    public String getTempFileTaskId() {
        return this.tempFileTaskId;
    }

    /**
     * @return gmtExpiredTime
     */
    public String getGmtExpiredTime() {
        return this.gmtExpiredTime;
    }

    public static final class Builder extends Request.Builder<UpdateTempFileTaskRequest, Builder> {
        private String tempFileTaskId; 
        private String gmtExpiredTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTempFileTaskRequest request) {
            super(request);
            this.tempFileTaskId = request.tempFileTaskId;
            this.gmtExpiredTime = request.gmtExpiredTime;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-05cexxxxxxxxx</p>
         */
        public Builder tempFileTaskId(String tempFileTaskId) {
            this.putPathParameter("TempFileTaskId", tempFileTaskId);
            this.tempFileTaskId = tempFileTaskId;
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

        @Override
        public UpdateTempFileTaskRequest build() {
            return new UpdateTempFileTaskRequest(this);
        } 

    } 

}
