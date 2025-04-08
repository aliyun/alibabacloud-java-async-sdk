// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link RollbackEdgeContainerAppVersionRequest} extends {@link RequestModel}
 *
 * <p>RollbackEdgeContainerAppVersionRequest</p>
 */
public class RollbackEdgeContainerAppVersionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 20)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Percentage")
    private Integer percentage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Remarks")
    @com.aliyun.core.annotation.Validation(maxLength = 1024)
    private String remarks;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedPercent")
    private Boolean usedPercent;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 20)
    private String versionId;

    private RollbackEdgeContainerAppVersionRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.percentage = builder.percentage;
        this.remarks = builder.remarks;
        this.usedPercent = builder.usedPercent;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackEdgeContainerAppVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return percentage
     */
    public Integer getPercentage() {
        return this.percentage;
    }

    /**
     * @return remarks
     */
    public String getRemarks() {
        return this.remarks;
    }

    /**
     * @return usedPercent
     */
    public Boolean getUsedPercent() {
        return this.usedPercent;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder extends Request.Builder<RollbackEdgeContainerAppVersionRequest, Builder> {
        private String appId; 
        private Integer percentage; 
        private String remarks; 
        private Boolean usedPercent; 
        private String versionId; 

        private Builder() {
            super();
        } 

        private Builder(RollbackEdgeContainerAppVersionRequest request) {
            super(request);
            this.appId = request.appId;
            this.percentage = request.percentage;
            this.remarks = request.remarks;
            this.usedPercent = request.usedPercent;
            this.versionId = request.versionId;
        } 

        /**
         * <p>The application ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app-88068867578379****</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Percentage.
         */
        public Builder percentage(Integer percentage) {
            this.putQueryParameter("Percentage", percentage);
            this.percentage = percentage;
            return this;
        }

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>test rollback app</p>
         */
        public Builder remarks(String remarks) {
            this.putBodyParameter("Remarks", remarks);
            this.remarks = remarks;
            return this;
        }

        /**
         * UsedPercent.
         */
        public Builder usedPercent(Boolean usedPercent) {
            this.putQueryParameter("UsedPercent", usedPercent);
            this.usedPercent = usedPercent;
            return this;
        }

        /**
         * <p>The ID of version that you want to roll back.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ver-87962637161651****</p>
         */
        public Builder versionId(String versionId) {
            this.putQueryParameter("VersionId", versionId);
            this.versionId = versionId;
            return this;
        }

        @Override
        public RollbackEdgeContainerAppVersionRequest build() {
            return new RollbackEdgeContainerAppVersionRequest(this);
        } 

    } 

}
