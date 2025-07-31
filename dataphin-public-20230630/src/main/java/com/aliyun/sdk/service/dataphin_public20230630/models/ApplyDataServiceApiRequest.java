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
 * {@link ApplyDataServiceApiRequest} extends {@link RequestModel}
 *
 * <p>ApplyDataServiceApiRequest</p>
 */
public class ApplyDataServiceApiRequest extends Request {
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

    private ApplyDataServiceApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applyCommand = builder.applyCommand;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyDataServiceApiRequest create() {
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

    public static final class Builder extends Request.Builder<ApplyDataServiceApiRequest, Builder> {
        private String regionId; 
        private ApplyCommand applyCommand; 
        private Long opTenantId; 
        private Integer projectId; 

        private Builder() {
            super();
        } 

        private Builder(ApplyDataServiceApiRequest request) {
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
        public ApplyDataServiceApiRequest build() {
            return new ApplyDataServiceApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link ApplyDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>ApplyDataServiceApiRequest</p>
     */
    public static class DevFieldList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer id;

        private DevFieldList(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DevFieldList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        public static final class Builder {
            private Integer id; 

            private Builder() {
            } 

            private Builder(DevFieldList model) {
                this.id = model.id;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            public DevFieldList build() {
                return new DevFieldList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>ApplyDataServiceApiRequest</p>
     */
    public static class ProdFieldList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer id;

        private ProdFieldList(Builder builder) {
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProdFieldList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        public static final class Builder {
            private Integer id; 

            private Builder() {
            } 

            private Builder(ProdFieldList model) {
                this.id = model.id;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>22</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            public ProdFieldList build() {
                return new ProdFieldList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ApplyDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>ApplyDataServiceApiRequest</p>
     */
    public static class ApplyCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("AppId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("DevFieldList")
        private java.util.List<DevFieldList> devFieldList;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("ProdFieldList")
        private java.util.List<ProdFieldList> prodFieldList;

        @com.aliyun.core.annotation.NameInMap("Reason")
        @com.aliyun.core.annotation.Validation(required = true)
        private String reason;

        private ApplyCommand(Builder builder) {
            this.apiId = builder.apiId;
            this.appId = builder.appId;
            this.devFieldList = builder.devFieldList;
            this.expireDate = builder.expireDate;
            this.prodFieldList = builder.prodFieldList;
            this.reason = builder.reason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyCommand create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public Long getApiId() {
            return this.apiId;
        }

        /**
         * @return appId
         */
        public Integer getAppId() {
            return this.appId;
        }

        /**
         * @return devFieldList
         */
        public java.util.List<DevFieldList> getDevFieldList() {
            return this.devFieldList;
        }

        /**
         * @return expireDate
         */
        public String getExpireDate() {
            return this.expireDate;
        }

        /**
         * @return prodFieldList
         */
        public java.util.List<ProdFieldList> getProdFieldList() {
            return this.prodFieldList;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        public static final class Builder {
            private Long apiId; 
            private Integer appId; 
            private java.util.List<DevFieldList> devFieldList; 
            private String expireDate; 
            private java.util.List<ProdFieldList> prodFieldList; 
            private String reason; 

            private Builder() {
            } 

            private Builder(ApplyCommand model) {
                this.apiId = model.apiId;
                this.appId = model.appId;
                this.devFieldList = model.devFieldList;
                this.expireDate = model.expireDate;
                this.prodFieldList = model.prodFieldList;
                this.reason = model.reason;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1021</p>
             */
            public Builder apiId(Long apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>AppId</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1203</p>
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * DevFieldList.
             */
            public Builder devFieldList(java.util.List<DevFieldList> devFieldList) {
                this.devFieldList = devFieldList;
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
             * ProdFieldList.
             */
            public Builder prodFieldList(java.util.List<ProdFieldList> prodFieldList) {
                this.prodFieldList = prodFieldList;
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
