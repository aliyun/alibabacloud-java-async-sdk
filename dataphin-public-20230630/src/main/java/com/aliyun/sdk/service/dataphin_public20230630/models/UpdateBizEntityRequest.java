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
 * {@link UpdateBizEntityRequest} extends {@link RequestModel}
 *
 * <p>UpdateBizEntityRequest</p>
 */
public class UpdateBizEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateBizEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateBizEntityRequest create() {
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
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateBizEntityRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private String opUserId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateBizEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
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
         * <p>The tenant ID.</p>
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
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>The update request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateBizEntityRequest build() {
            return new UpdateBizEntityRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateBizEntityRequest} extends {@link TeaModel}
     *
     * <p>UpdateBizEntityRequest</p>
     */
    public static class BizObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private Long parentId;

        @com.aliyun.core.annotation.NameInMap("RefBizEntityIdList")
        private java.util.List<Long> refBizEntityIdList;

        private BizObject(Builder builder) {
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.ownerUserId = builder.ownerUserId;
            this.parentId = builder.parentId;
            this.refBizEntityIdList = builder.refBizEntityIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizObject create() {
            return builder().build();
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return parentId
         */
        public Long getParentId() {
            return this.parentId;
        }

        /**
         * @return refBizEntityIdList
         */
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        public static final class Builder {
            private String description; 
            private String displayName; 
            private String name; 
            private String ownerUserId; 
            private Long parentId; 
            private java.util.List<Long> refBizEntityIdList; 

            private Builder() {
            } 

            private Builder(BizObject model) {
                this.description = model.description;
                this.displayName = model.displayName;
                this.name = model.name;
                this.ownerUserId = model.ownerUserId;
                this.parentId = model.parentId;
                this.refBizEntityIdList = model.refBizEntityIdList;
            } 

            /**
             * <p>The description of the business object. The description can be up to 128 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the business object. The name can be up to 64 characters in length and can contain only Chinese characters, letters, digits, underscores, and hyphens.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>create_object_name</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The code name of the business object. The name can be up to 64 characters in length and can contain only letters, digits, and underscores. For the ADB_PG engine, the code name can be up to 40 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>create_object_code_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The user ID of the business object owner.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30010010</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The inherited entity of the business object. Only common business objects support inherited entity configuration, and only online business objects can be inherited.</p>
             * 
             * <strong>example:</strong>
             * <p>116306</p>
             */
            public Builder parentId(Long parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * <p>The list of associated online business entity IDs. If this parameter is not specified, the existing values are cleared.</p>
             */
            public Builder refBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
                this.refBizEntityIdList = refBizEntityIdList;
                return this;
            }

            public BizObject build() {
                return new BizObject(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBizEntityRequest} extends {@link TeaModel}
     *
     * <p>UpdateBizEntityRequest</p>
     */
    public static class BizProcess extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizEventEntityIdList")
        private java.util.List<Long> bizEventEntityIdList;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("OwnerUserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String ownerUserId;

        @com.aliyun.core.annotation.NameInMap("PreBizProcessIdList")
        private java.util.List<Long> preBizProcessIdList;

        @com.aliyun.core.annotation.NameInMap("RefBizEntityIdList")
        private java.util.List<Long> refBizEntityIdList;

        private BizProcess(Builder builder) {
            this.bizEventEntityIdList = builder.bizEventEntityIdList;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.name = builder.name;
            this.ownerUserId = builder.ownerUserId;
            this.preBizProcessIdList = builder.preBizProcessIdList;
            this.refBizEntityIdList = builder.refBizEntityIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BizProcess create() {
            return builder().build();
        }

        /**
         * @return bizEventEntityIdList
         */
        public java.util.List<Long> getBizEventEntityIdList() {
            return this.bizEventEntityIdList;
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
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return preBizProcessIdList
         */
        public java.util.List<Long> getPreBizProcessIdList() {
            return this.preBizProcessIdList;
        }

        /**
         * @return refBizEntityIdList
         */
        public java.util.List<Long> getRefBizEntityIdList() {
            return this.refBizEntityIdList;
        }

        public static final class Builder {
            private java.util.List<Long> bizEventEntityIdList; 
            private String description; 
            private String displayName; 
            private String name; 
            private String ownerUserId; 
            private java.util.List<Long> preBizProcessIdList; 
            private java.util.List<Long> refBizEntityIdList; 

            private Builder() {
            } 

            private Builder(BizProcess model) {
                this.bizEventEntityIdList = model.bizEventEntityIdList;
                this.description = model.description;
                this.displayName = model.displayName;
                this.name = model.name;
                this.ownerUserId = model.ownerUserId;
                this.preBizProcessIdList = model.preBizProcessIdList;
                this.refBizEntityIdList = model.refBizEntityIdList;
            } 

            /**
             * <p>The list of business event activity IDs contained in the business flow activity. This parameter is valid only when the current entity is a business flow activity.</p>
             */
            public Builder bizEventEntityIdList(java.util.List<Long> bizEventEntityIdList) {
                this.bizEventEntityIdList = bizEventEntityIdList;
                return this;
            }

            /**
             * <p>The description of the business process. The description can be up to 128 characters in length.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the business process. The name can be up to 64 characters in length and can contain only Chinese characters, letters, digits, underscores, and hyphens.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>create_process_name</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The code name of the business process. The name can be up to 64 characters in length and can contain only letters, digits, and underscores. For the ADB_PG engine, the code name can be up to 40 characters in length.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>create_process_code_name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The user ID of the business process owner.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30010010</p>
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * <p>The preceding business flow activities of the business flow activity.</p>
             */
            public Builder preBizProcessIdList(java.util.List<Long> preBizProcessIdList) {
                this.preBizProcessIdList = preBizProcessIdList;
                return this;
            }

            /**
             * <p>The list of associated online business entity IDs. If this parameter is not specified, the existing values are cleared.</p>
             */
            public Builder refBizEntityIdList(java.util.List<Long> refBizEntityIdList) {
                this.refBizEntityIdList = refBizEntityIdList;
                return this;
            }

            public BizProcess build() {
                return new BizProcess(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateBizEntityRequest} extends {@link TeaModel}
     *
     * <p>UpdateBizEntityRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BizObject")
        private BizObject bizObject;

        @com.aliyun.core.annotation.NameInMap("BizProcess")
        private BizProcess bizProcess;

        @com.aliyun.core.annotation.NameInMap("BizUnitId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long bizUnitId;

        @com.aliyun.core.annotation.NameInMap("DataDomainId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long dataDomainId;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private UpdateCommand(Builder builder) {
            this.bizObject = builder.bizObject;
            this.bizProcess = builder.bizProcess;
            this.bizUnitId = builder.bizUnitId;
            this.dataDomainId = builder.dataDomainId;
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return bizObject
         */
        public BizObject getBizObject() {
            return this.bizObject;
        }

        /**
         * @return bizProcess
         */
        public BizProcess getBizProcess() {
            return this.bizProcess;
        }

        /**
         * @return bizUnitId
         */
        public Long getBizUnitId() {
            return this.bizUnitId;
        }

        /**
         * @return dataDomainId
         */
        public Long getDataDomainId() {
            return this.dataDomainId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private BizObject bizObject; 
            private BizProcess bizProcess; 
            private Long bizUnitId; 
            private Long dataDomainId; 
            private Long id; 
            private String type; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.bizObject = model.bizObject;
                this.bizProcess = model.bizProcess;
                this.bizUnitId = model.bizUnitId;
                this.dataDomainId = model.dataDomainId;
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>The business object.</p>
             */
            public Builder bizObject(BizObject bizObject) {
                this.bizObject = bizObject;
                return this;
            }

            /**
             * <p>The business process.</p>
             */
            public Builder bizProcess(BizProcess bizProcess) {
                this.bizProcess = bizProcess;
                return this;
            }

            /**
             * <p>The ID of the business unit to which the business process belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>6798087749072704</p>
             */
            public Builder bizUnitId(Long bizUnitId) {
                this.bizUnitId = bizUnitId;
                return this;
            }

            /**
             * <p>The ID of the data domain to which the business process belongs.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>20101011</p>
             */
            public Builder dataDomainId(Long dataDomainId) {
                this.dataDomainId = dataDomainId;
                return this;
            }

            /**
             * <p>The ID of the business entity.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>101001201</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the business entity. For more information, refer to the create business entity operation.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BIZ_OBJECT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
