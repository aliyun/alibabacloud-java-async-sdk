// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePermissionApplyOrderRequest} extends {@link RequestModel}
 *
 * <p>CreatePermissionApplyOrderRequest</p>
 */
public class CreatePermissionApplyOrderRequest extends Request {
    @Query
    @NameInMap("ApplyObject")
    @Validation(required = true)
    private java.util.List < ApplyObject> applyObject;

    @Query
    @NameInMap("ApplyReason")
    @Validation(required = true)
    private String applyReason;

    @Query
    @NameInMap("ApplyUserIds")
    @Validation(required = true)
    private String applyUserIds;

    @Query
    @NameInMap("Deadline")
    private Long deadline;

    @Query
    @NameInMap("EngineType")
    private String engineType;

    @Query
    @NameInMap("MaxComputeProjectName")
    @Validation(required = true)
    private String maxComputeProjectName;

    @Query
    @NameInMap("OrderType")
    private Integer orderType;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("WorkspaceId")
    @Validation(required = true, maximum = 999999)
    private Integer workspaceId;

    private CreatePermissionApplyOrderRequest(Builder builder) {
        super(builder);
        this.applyObject = builder.applyObject;
        this.applyReason = builder.applyReason;
        this.applyUserIds = builder.applyUserIds;
        this.deadline = builder.deadline;
        this.engineType = builder.engineType;
        this.maxComputeProjectName = builder.maxComputeProjectName;
        this.orderType = builder.orderType;
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePermissionApplyOrderRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applyObject
     */
    public java.util.List < ApplyObject> getApplyObject() {
        return this.applyObject;
    }

    /**
     * @return applyReason
     */
    public String getApplyReason() {
        return this.applyReason;
    }

    /**
     * @return applyUserIds
     */
    public String getApplyUserIds() {
        return this.applyUserIds;
    }

    /**
     * @return deadline
     */
    public Long getDeadline() {
        return this.deadline;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return maxComputeProjectName
     */
    public String getMaxComputeProjectName() {
        return this.maxComputeProjectName;
    }

    /**
     * @return orderType
     */
    public Integer getOrderType() {
        return this.orderType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return workspaceId
     */
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreatePermissionApplyOrderRequest, Builder> {
        private java.util.List < ApplyObject> applyObject; 
        private String applyReason; 
        private String applyUserIds; 
        private Long deadline; 
        private String engineType; 
        private String maxComputeProjectName; 
        private Integer orderType; 
        private String regionId; 
        private Integer workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePermissionApplyOrderRequest request) {
            super(request);
            this.applyObject = request.applyObject;
            this.applyReason = request.applyReason;
            this.applyUserIds = request.applyUserIds;
            this.deadline = request.deadline;
            this.engineType = request.engineType;
            this.maxComputeProjectName = request.maxComputeProjectName;
            this.orderType = request.orderType;
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * ApplyObject.
         */
        public Builder applyObject(java.util.List < ApplyObject> applyObject) {
            this.putQueryParameter("ApplyObject", applyObject);
            this.applyObject = applyObject;
            return this;
        }

        /**
         * ApplyReason.
         */
        public Builder applyReason(String applyReason) {
            this.putQueryParameter("ApplyReason", applyReason);
            this.applyReason = applyReason;
            return this;
        }

        /**
         * ApplyUserIds.
         */
        public Builder applyUserIds(String applyUserIds) {
            this.putQueryParameter("ApplyUserIds", applyUserIds);
            this.applyUserIds = applyUserIds;
            return this;
        }

        /**
         * Deadline.
         */
        public Builder deadline(Long deadline) {
            this.putQueryParameter("Deadline", deadline);
            this.deadline = deadline;
            return this;
        }

        /**
         * EngineType.
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * MaxComputeProjectName.
         */
        public Builder maxComputeProjectName(String maxComputeProjectName) {
            this.putQueryParameter("MaxComputeProjectName", maxComputeProjectName);
            this.maxComputeProjectName = maxComputeProjectName;
            return this;
        }

        /**
         * OrderType.
         */
        public Builder orderType(Integer orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
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
         * WorkspaceId.
         */
        public Builder workspaceId(Integer workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreatePermissionApplyOrderRequest build() {
            return new CreatePermissionApplyOrderRequest(this);
        } 

    } 

    public static class ColumnMetaList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        private ColumnMetaList(Builder builder) {
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnMetaList create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String name; 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ColumnMetaList build() {
                return new ColumnMetaList(this);
            } 

        } 

    }
    public static class ApplyObject extends TeaModel {
        @NameInMap("Actions")
        @Validation(required = true)
        private String actions;

        @NameInMap("ColumnMetaList")
        @Validation(required = true)
        private java.util.List < ColumnMetaList> columnMetaList;

        @NameInMap("Name")
        @Validation(required = true)
        private String name;

        private ApplyObject(Builder builder) {
            this.actions = builder.actions;
            this.columnMetaList = builder.columnMetaList;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyObject create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public String getActions() {
            return this.actions;
        }

        /**
         * @return columnMetaList
         */
        public java.util.List < ColumnMetaList> getColumnMetaList() {
            return this.columnMetaList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String actions; 
            private java.util.List < ColumnMetaList> columnMetaList; 
            private String name; 

            /**
             * Actions.
             */
            public Builder actions(String actions) {
                this.actions = actions;
                return this;
            }

            /**
             * ColumnMetaList.
             */
            public Builder columnMetaList(java.util.List < ColumnMetaList> columnMetaList) {
                this.columnMetaList = columnMetaList;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ApplyObject build() {
                return new ApplyObject(this);
            } 

        } 

    }
}
