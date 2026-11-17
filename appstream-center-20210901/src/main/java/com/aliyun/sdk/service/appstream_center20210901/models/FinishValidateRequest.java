// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link FinishValidateRequest} extends {@link RequestModel}
 *
 * <p>FinishValidateRequest</p>
 */
public class FinishValidateRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppVersionId")
    private String appVersionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String taskId;

    private FinishValidateRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.appVersionId = builder.appVersionId;
        this.status = builder.status;
        this.taskId = builder.taskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FinishValidateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return appVersionId
     */
    public String getAppVersionId() {
        return this.appVersionId;
    }

    /**
     * @return status
     */
    public Boolean getStatus() {
        return this.status;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    public static final class Builder extends Request.Builder<FinishValidateRequest, Builder> {
        private String regionId; 
        private String appId; 
        private String appVersionId; 
        private Boolean status; 
        private String taskId; 

        private Builder() {
            super();
        } 

        private Builder(FinishValidateRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.appVersionId = request.appVersionId;
            this.status = request.status;
            this.taskId = request.taskId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The application ID for exact match queries. If this parameter is omitted, the results are not filtered by application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>app-0aae4rxw7ql*****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The application version ID. <strong>Required</strong>. It must match the application version corresponding to the AdaptorId. This parameter is not the image version ID.</p>
         * 
         * <strong>example:</strong>
         * <p>apv-bp1example****</p>
         */
        public Builder appVersionId(String appVersionId) {
            this.putBodyParameter("AppVersionId", appVersionId);
            this.appVersionId = appVersionId;
            return this;
        }

        /**
         * <p>The verification result.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder status(Boolean status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tid-bp1example****</p>
         */
        public Builder taskId(String taskId) {
            this.putBodyParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        @Override
        public FinishValidateRequest build() {
            return new FinishValidateRequest(this);
        } 

    } 

}
