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
 * {@link SyncDepartmentRequest} extends {@link RequestModel}
 *
 * <p>SyncDepartmentRequest</p>
 */
public class SyncDepartmentRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SyncDepartmentCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private SyncDepartmentCommand syncDepartmentCommand;

    private SyncDepartmentRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.syncDepartmentCommand = builder.syncDepartmentCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncDepartmentRequest create() {
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
     * @return syncDepartmentCommand
     */
    public SyncDepartmentCommand getSyncDepartmentCommand() {
        return this.syncDepartmentCommand;
    }

    public static final class Builder extends Request.Builder<SyncDepartmentRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private SyncDepartmentCommand syncDepartmentCommand; 

        private Builder() {
            super();
        } 

        private Builder(SyncDepartmentRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.syncDepartmentCommand = request.syncDepartmentCommand;
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
        public Builder syncDepartmentCommand(SyncDepartmentCommand syncDepartmentCommand) {
            String syncDepartmentCommandShrink = shrink(syncDepartmentCommand, "SyncDepartmentCommand", "json");
            this.putBodyParameter("SyncDepartmentCommand", syncDepartmentCommandShrink);
            this.syncDepartmentCommand = syncDepartmentCommand;
            return this;
        }

        @Override
        public SyncDepartmentRequest build() {
            return new SyncDepartmentRequest(this);
        } 

    } 

    /**
     * 
     * {@link SyncDepartmentRequest} extends {@link TeaModel}
     *
     * <p>SyncDepartmentRequest</p>
     */
    public static class DepartmentList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departmentId;

        @com.aliyun.core.annotation.NameInMap("DepartmentName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String departmentName;

        @com.aliyun.core.annotation.NameInMap("ParentDepartmentId")
        private String parentDepartmentId;

        private DepartmentList(Builder builder) {
            this.departmentId = builder.departmentId;
            this.departmentName = builder.departmentName;
            this.parentDepartmentId = builder.parentDepartmentId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DepartmentList create() {
            return builder().build();
        }

        /**
         * @return departmentId
         */
        public String getDepartmentId() {
            return this.departmentId;
        }

        /**
         * @return departmentName
         */
        public String getDepartmentName() {
            return this.departmentName;
        }

        /**
         * @return parentDepartmentId
         */
        public String getParentDepartmentId() {
            return this.parentDepartmentId;
        }

        public static final class Builder {
            private String departmentId; 
            private String departmentName; 
            private String parentDepartmentId; 

            private Builder() {
            } 

            private Builder(DepartmentList model) {
                this.departmentId = model.departmentId;
                this.departmentName = model.departmentName;
                this.parentDepartmentId = model.parentDepartmentId;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder departmentId(String departmentId) {
                this.departmentId = departmentId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>研发中心</p>
             */
            public Builder departmentName(String departmentName) {
                this.departmentName = departmentName;
                return this;
            }

            /**
             * ParentDepartmentId.
             */
            public Builder parentDepartmentId(String parentDepartmentId) {
                this.parentDepartmentId = parentDepartmentId;
                return this;
            }

            public DepartmentList build() {
                return new DepartmentList(this);
            } 

        } 

    }
    /**
     * 
     * {@link SyncDepartmentRequest} extends {@link TeaModel}
     *
     * <p>SyncDepartmentRequest</p>
     */
    public static class SyncDepartmentCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<DepartmentList> departmentList;

        private SyncDepartmentCommand(Builder builder) {
            this.departmentList = builder.departmentList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncDepartmentCommand create() {
            return builder().build();
        }

        /**
         * @return departmentList
         */
        public java.util.List<DepartmentList> getDepartmentList() {
            return this.departmentList;
        }

        public static final class Builder {
            private java.util.List<DepartmentList> departmentList; 

            private Builder() {
            } 

            private Builder(SyncDepartmentCommand model) {
                this.departmentList = model.departmentList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder departmentList(java.util.List<DepartmentList> departmentList) {
                this.departmentList = departmentList;
                return this;
            }

            public SyncDepartmentCommand build() {
                return new SyncDepartmentCommand(this);
            } 

        } 

    }
}
