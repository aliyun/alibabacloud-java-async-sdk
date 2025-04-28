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
 * {@link SyncDepartmentUserRequest} extends {@link RequestModel}
 *
 * <p>SyncDepartmentUserRequest</p>
 */
public class SyncDepartmentUserRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SyncDepartmentUserCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private SyncDepartmentUserCommand syncDepartmentUserCommand;

    private SyncDepartmentUserRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.syncDepartmentUserCommand = builder.syncDepartmentUserCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncDepartmentUserRequest create() {
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
     * @return syncDepartmentUserCommand
     */
    public SyncDepartmentUserCommand getSyncDepartmentUserCommand() {
        return this.syncDepartmentUserCommand;
    }

    public static final class Builder extends Request.Builder<SyncDepartmentUserRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private SyncDepartmentUserCommand syncDepartmentUserCommand; 

        private Builder() {
            super();
        } 

        private Builder(SyncDepartmentUserRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.syncDepartmentUserCommand = request.syncDepartmentUserCommand;
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
        public Builder syncDepartmentUserCommand(SyncDepartmentUserCommand syncDepartmentUserCommand) {
            String syncDepartmentUserCommandShrink = shrink(syncDepartmentUserCommand, "SyncDepartmentUserCommand", "json");
            this.putBodyParameter("SyncDepartmentUserCommand", syncDepartmentUserCommandShrink);
            this.syncDepartmentUserCommand = syncDepartmentUserCommand;
            return this;
        }

        @Override
        public SyncDepartmentUserRequest build() {
            return new SyncDepartmentUserRequest(this);
        } 

    } 

    /**
     * 
     * {@link SyncDepartmentUserRequest} extends {@link TeaModel}
     *
     * <p>SyncDepartmentUserRequest</p>
     */
    public static class DeptUserMapping extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentIdList")
        private java.util.List<String> departmentIdList;

        @com.aliyun.core.annotation.NameInMap("SourceUserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceUserId;

        private DeptUserMapping(Builder builder) {
            this.departmentIdList = builder.departmentIdList;
            this.sourceUserId = builder.sourceUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeptUserMapping create() {
            return builder().build();
        }

        /**
         * @return departmentIdList
         */
        public java.util.List<String> getDepartmentIdList() {
            return this.departmentIdList;
        }

        /**
         * @return sourceUserId
         */
        public String getSourceUserId() {
            return this.sourceUserId;
        }

        public static final class Builder {
            private java.util.List<String> departmentIdList; 
            private String sourceUserId; 

            private Builder() {
            } 

            private Builder(DeptUserMapping model) {
                this.departmentIdList = model.departmentIdList;
                this.sourceUserId = model.sourceUserId;
            } 

            /**
             * DepartmentIdList.
             */
            public Builder departmentIdList(java.util.List<String> departmentIdList) {
                this.departmentIdList = departmentIdList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30000001</p>
             */
            public Builder sourceUserId(String sourceUserId) {
                this.sourceUserId = sourceUserId;
                return this;
            }

            public DeptUserMapping build() {
                return new DeptUserMapping(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncDepartmentUserRequest} extends {@link TeaModel}
     *
     * <p>SyncDepartmentUserRequest</p>
     */
    public static class SyncDepartmentUserCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeptUserMapping")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<DeptUserMapping> deptUserMapping;

        private SyncDepartmentUserCommand(Builder builder) {
            this.deptUserMapping = builder.deptUserMapping;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncDepartmentUserCommand create() {
            return builder().build();
        }

        /**
         * @return deptUserMapping
         */
        public java.util.List<DeptUserMapping> getDeptUserMapping() {
            return this.deptUserMapping;
        }

        public static final class Builder {
            private java.util.List<DeptUserMapping> deptUserMapping; 

            private Builder() {
            } 

            private Builder(SyncDepartmentUserCommand model) {
                this.deptUserMapping = model.deptUserMapping;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder deptUserMapping(java.util.List<DeptUserMapping> deptUserMapping) {
                this.deptUserMapping = deptUserMapping;
                return this;
            }

            public SyncDepartmentUserCommand build() {
                return new SyncDepartmentUserCommand(this);
            } 

        } 

    }
}
