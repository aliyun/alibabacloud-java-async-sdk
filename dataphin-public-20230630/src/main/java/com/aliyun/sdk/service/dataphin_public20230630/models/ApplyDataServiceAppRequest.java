// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link ApplyDataServiceAppRequest} extends {@link RequestModel}
 *
 * <p>ApplyDataServiceAppRequest</p>
 */
public class ApplyDataServiceAppRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApplyCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private ApplyCommand applyCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer projectId;

    private ApplyDataServiceAppRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applyCommand = builder.applyCommand;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyDataServiceAppRequest create() {
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
     * @return applyCommand
     */
    public ApplyCommand getApplyCommand() {
        return this.applyCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return projectId
     */
    public Integer getProjectId() {
        return this.projectId;
    }

    public static final class Builder extends Request.Builder<ApplyDataServiceAppRequest, Builder> {
        private String regionId; 
        private ApplyCommand applyCommand; 
        private Long opTenantId; 
        private Integer projectId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyDataServiceAppRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applyCommand = request.applyCommand;
            this.opTenantId = request.opTenantId;
            this.projectId = request.projectId;
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
         * <p>This parameter is required.</p>
         */
        public Builder applyCommand(ApplyCommand applyCommand) {
            String applyCommandShrink = shrink(applyCommand, "ApplyCommand", "json");
            this.putBodyParameter("ApplyCommand", applyCommandShrink);
            this.applyCommand = applyCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>102102</p>
         */
        public Builder projectId(Integer projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        @Override
        public ApplyDataServiceAppRequest build() {
            return new ApplyDataServiceAppRequest(this);
        } 

    } 

    /**
     * 
     * {@link ApplyDataServiceAppRequest} extends {@link TeaModel}
     *
     * <p>ApplyDataServiceAppRequest</p>
     */
    public static class ApplyCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("Reason")
        @com.aliyun.core.annotation.Validation(required = true)
        private String reason;

        private ApplyCommand(Builder builder) {
            this.appId = builder.appId;
            this.expireDate = builder.expireDate;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyCommand create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private Integer appId; 
            private String expireDate; 
            private String reason; 

            private Builder() {
            } 

            private Builder(ApplyCommand model) {
                this.appId = model.appId;
                this.expireDate = model.expireDate;
                this.reason = model.reason;
            } 

            /**
             * <p>appId</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2011</p>
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-30</p>
             */
            public Builder expireDate(String expireDate) {
                this.expireDate = expireDate;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            public ApplyCommand build() {
                return new ApplyCommand(this);
            } 

        } 

    }
}
