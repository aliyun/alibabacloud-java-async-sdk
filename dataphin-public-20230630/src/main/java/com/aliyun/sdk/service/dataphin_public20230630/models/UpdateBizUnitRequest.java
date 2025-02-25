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
 * {@link UpdateBizUnitRequest} extends {@link RequestModel}
 *
 * <p>UpdateBizUnitRequest</p>
 */
public class UpdateBizUnitRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateBizUnitRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBizUnitRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateBizUnitRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBizUnitRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.updateCommand = request.updateCommand;
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
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateBizUnitRequest build() {
            return new UpdateBizUnitRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBizUnitRequest} extends {@link TeaModel}
     *
     * <p>UpdateBizUnitRequest</p>
     */
    public static class BizUnitAccountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private BizUnitAccountList(Builder builder) {
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizUnitAccountList create() {
            return builder().build();
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String userId; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20001201</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public BizUnitAccountList build() {
                return new BizUnitAccountList(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBizUnitRequest} extends {@link TeaModel}
     *
     * <p>UpdateBizUnitRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizUnitAccountList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<BizUnitAccountList> bizUnitAccountList;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Icon")
        @com.aliyun.core.annotation.Validation(required = true)
        private String icon;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        private UpdateCommand(Builder builder) {
            this.bizUnitAccountList = builder.bizUnitAccountList;
            this.bizUnitId = builder.bizUnitId;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.icon = builder.icon;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return bizUnitAccountList
         */
        public java.util.List<BizUnitAccountList> getBizUnitAccountList() {
            return this.bizUnitAccountList;
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private java.util.List<BizUnitAccountList> bizUnitAccountList; 
            private Long bizUnitId; 
            private String description; 
            private String displayName; 
            private String icon; 
            private String name; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder bizUnitAccountList(java.util.List<BizUnitAccountList> bizUnitAccountList) {
                this.bizUnitAccountList = bizUnitAccountList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>545844456</p>
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>测试</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>icon-environment</p>
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>bz_code_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
