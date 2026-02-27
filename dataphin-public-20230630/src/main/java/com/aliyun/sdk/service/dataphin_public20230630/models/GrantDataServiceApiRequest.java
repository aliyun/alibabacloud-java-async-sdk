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
 * {@link GrantDataServiceApiRequest} extends {@link RequestModel}
 *
 * <p>GrantDataServiceApiRequest</p>
 */
public class GrantDataServiceApiRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GrantCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private GrantCommand grantCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer projectId;

    private GrantDataServiceApiRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.grantCommand = builder.grantCommand;
        this.opTenantId = builder.opTenantId;
        this.projectId = builder.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantDataServiceApiRequest create() {
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
     * @return grantCommand
     */
    public GrantCommand getGrantCommand() {
        return this.grantCommand;
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

    public static final class Builder extends Request.Builder<GrantDataServiceApiRequest, Builder> {
        private String regionId; 
        private GrantCommand grantCommand; 
        private Long opTenantId; 
        private Integer projectId; 

        private Builder() {
            super();
        } 

        private Builder(GrantDataServiceApiRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.grantCommand = request.grantCommand;
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
        public Builder grantCommand(GrantCommand grantCommand) {
            String grantCommandShrink = shrink(grantCommand, "GrantCommand", "json");
            this.putBodyParameter("GrantCommand", grantCommandShrink);
            this.grantCommand = grantCommand;
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
        public GrantDataServiceApiRequest build() {
            return new GrantDataServiceApiRequest(this);
        } 

    } 

    /**
     * 
     * {@link GrantDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>GrantDataServiceApiRequest</p>
     */
    public static class DevFieldList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
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
             * Id.
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
     * {@link GrantDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>GrantDataServiceApiRequest</p>
     */
    public static class ProdFieldList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
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
             * Id.
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
     * {@link GrantDataServiceApiRequest} extends {@link TeaModel}
     *
     * <p>GrantDataServiceApiRequest</p>
     */
    public static class GrantCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long apiId;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private Integer appId;

        @com.aliyun.core.annotation.NameInMap("ApplyDev")
        private Boolean applyDev;

        @com.aliyun.core.annotation.NameInMap("ApplyProd")
        private Boolean applyProd;

        @com.aliyun.core.annotation.NameInMap("AuthTypes")
        private java.util.List<String> authTypes;

        @com.aliyun.core.annotation.NameInMap("DevFieldList")
        private java.util.List<DevFieldList> devFieldList;

        @com.aliyun.core.annotation.NameInMap("ExpireDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String expireDate;

        @com.aliyun.core.annotation.NameInMap("GranteeType")
        private String granteeType;

        @com.aliyun.core.annotation.NameInMap("ProdFieldList")
        private java.util.List<ProdFieldList> prodFieldList;

        @com.aliyun.core.annotation.NameInMap("Reason")
        @com.aliyun.core.annotation.Validation(required = true)
        private String reason;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private GrantCommand(Builder builder) {
            this.apiId = builder.apiId;
            this.appId = builder.appId;
            this.applyDev = builder.applyDev;
            this.applyProd = builder.applyProd;
            this.authTypes = builder.authTypes;
            this.devFieldList = builder.devFieldList;
            this.expireDate = builder.expireDate;
            this.granteeType = builder.granteeType;
            this.prodFieldList = builder.prodFieldList;
            this.reason = builder.reason;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GrantCommand create() {
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
         * @return applyDev
         */
        public Boolean getApplyDev() {
            return this.applyDev;
        }

        /**
         * @return applyProd
         */
        public Boolean getApplyProd() {
            return this.applyProd;
        }

        /**
         * @return authTypes
         */
        public java.util.List<String> getAuthTypes() {
            return this.authTypes;
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
         * @return granteeType
         */
        public String getGranteeType() {
            return this.granteeType;
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

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long apiId; 
            private Integer appId; 
            private Boolean applyDev; 
            private Boolean applyProd; 
            private java.util.List<String> authTypes; 
            private java.util.List<DevFieldList> devFieldList; 
            private String expireDate; 
            private String granteeType; 
            private java.util.List<ProdFieldList> prodFieldList; 
            private String reason; 
            private String userId; 

            private Builder() {
            } 

            private Builder(GrantCommand model) {
                this.apiId = model.apiId;
                this.appId = model.appId;
                this.applyDev = model.applyDev;
                this.applyProd = model.applyProd;
                this.authTypes = model.authTypes;
                this.devFieldList = model.devFieldList;
                this.expireDate = model.expireDate;
                this.granteeType = model.granteeType;
                this.prodFieldList = model.prodFieldList;
                this.reason = model.reason;
                this.userId = model.userId;
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
             * <p>AppID</p>
             * 
             * <strong>example:</strong>
             * <p>1201</p>
             */
            public Builder appId(Integer appId) {
                this.appId = appId;
                return this;
            }

            /**
             * ApplyDev.
             */
            public Builder applyDev(Boolean applyDev) {
                this.applyDev = applyDev;
                return this;
            }

            /**
             * ApplyProd.
             */
            public Builder applyProd(Boolean applyProd) {
                this.applyProd = applyProd;
                return this;
            }

            /**
             * AuthTypes.
             */
            public Builder authTypes(java.util.List<String> authTypes) {
                this.authTypes = authTypes;
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
             * GranteeType.
             */
            public Builder granteeType(String granteeType) {
                this.granteeType = granteeType;
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

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public GrantCommand build() {
                return new GrantCommand(this);
            } 

        } 

    }
}
