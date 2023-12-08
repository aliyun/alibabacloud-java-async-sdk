// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alicloudproc20240104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSourcingProjectRequest} extends {@link RequestModel}
 *
 * <p>UpdateSourcingProjectRequest</p>
 */
public class UpdateSourcingProjectRequest extends Request {
    @Query
    @NameInMap("BizId")
    @Validation(required = true)
    private String bizId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
    private String status;

    @Query
    @NameInMap("UpdateTime")
    @Validation(required = true)
    private String updateTime;

    private UpdateSourcingProjectRequest(Builder builder) {
        super(builder);
        this.bizId = builder.bizId;
        this.status = builder.status;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSourcingProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder extends Request.Builder<UpdateSourcingProjectRequest, Builder> {
        private String bizId; 
        private String status; 
        private String updateTime; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSourcingProjectRequest request) {
            super(request);
            this.bizId = request.bizId;
            this.status = request.status;
            this.updateTime = request.updateTime;
        } 

        /**
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.putQueryParameter("UpdateTime", updateTime);
            this.updateTime = updateTime;
            return this;
        }

        @Override
        public UpdateSourcingProjectRequest build() {
            return new UpdateSourcingProjectRequest(this);
        } 

    } 

}
