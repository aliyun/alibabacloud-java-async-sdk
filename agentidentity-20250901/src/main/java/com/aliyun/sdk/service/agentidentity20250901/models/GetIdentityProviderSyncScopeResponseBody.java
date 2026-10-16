// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentidentity20250901.models;

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
 * {@link GetIdentityProviderSyncScopeResponseBody} extends {@link TeaModel}
 *
 * <p>GetIdentityProviderSyncScopeResponseBody</p>
 */
public class GetIdentityProviderSyncScopeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EstimateStatus")
    private String estimateStatus;

    @com.aliyun.core.annotation.NameInMap("EstimatedUserCount")
    private Long estimatedUserCount;

    @com.aliyun.core.annotation.NameInMap("ExpandedDepartmentCount")
    private Long expandedDepartmentCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SelectedDepartments")
    private java.util.List<SelectedDepartments> selectedDepartments;

    @com.aliyun.core.annotation.NameInMap("SyncScope")
    private SyncScope syncScope;

    private GetIdentityProviderSyncScopeResponseBody(Builder builder) {
        this.estimateStatus = builder.estimateStatus;
        this.estimatedUserCount = builder.estimatedUserCount;
        this.expandedDepartmentCount = builder.expandedDepartmentCount;
        this.requestId = builder.requestId;
        this.selectedDepartments = builder.selectedDepartments;
        this.syncScope = builder.syncScope;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIdentityProviderSyncScopeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return estimateStatus
     */
    public String getEstimateStatus() {
        return this.estimateStatus;
    }

    /**
     * @return estimatedUserCount
     */
    public Long getEstimatedUserCount() {
        return this.estimatedUserCount;
    }

    /**
     * @return expandedDepartmentCount
     */
    public Long getExpandedDepartmentCount() {
        return this.expandedDepartmentCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return selectedDepartments
     */
    public java.util.List<SelectedDepartments> getSelectedDepartments() {
        return this.selectedDepartments;
    }

    /**
     * @return syncScope
     */
    public SyncScope getSyncScope() {
        return this.syncScope;
    }

    public static final class Builder {
        private String estimateStatus; 
        private Long estimatedUserCount; 
        private Long expandedDepartmentCount; 
        private String requestId; 
        private java.util.List<SelectedDepartments> selectedDepartments; 
        private SyncScope syncScope; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderSyncScopeResponseBody model) {
            this.estimateStatus = model.estimateStatus;
            this.estimatedUserCount = model.estimatedUserCount;
            this.expandedDepartmentCount = model.expandedDepartmentCount;
            this.requestId = model.requestId;
            this.selectedDepartments = model.selectedDepartments;
            this.syncScope = model.syncScope;
        } 

        /**
         * EstimateStatus.
         */
        public Builder estimateStatus(String estimateStatus) {
            this.estimateStatus = estimateStatus;
            return this;
        }

        /**
         * EstimatedUserCount.
         */
        public Builder estimatedUserCount(Long estimatedUserCount) {
            this.estimatedUserCount = estimatedUserCount;
            return this;
        }

        /**
         * ExpandedDepartmentCount.
         */
        public Builder expandedDepartmentCount(Long expandedDepartmentCount) {
            this.expandedDepartmentCount = expandedDepartmentCount;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SelectedDepartments.
         */
        public Builder selectedDepartments(java.util.List<SelectedDepartments> selectedDepartments) {
            this.selectedDepartments = selectedDepartments;
            return this;
        }

        /**
         * SyncScope.
         */
        public Builder syncScope(SyncScope syncScope) {
            this.syncScope = syncScope;
            return this;
        }

        public GetIdentityProviderSyncScopeResponseBody build() {
            return new GetIdentityProviderSyncScopeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIdentityProviderSyncScopeResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderSyncScopeResponseBody</p>
     */
    public static class SelectedDepartments extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exists")
        private Boolean exists;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private SelectedDepartments(Builder builder) {
            this.exists = builder.exists;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SelectedDepartments create() {
            return builder().build();
        }

        /**
         * @return exists
         */
        public Boolean getExists() {
            return this.exists;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Boolean exists; 
            private String id; 
            private String name; 

            private Builder() {
            } 

            private Builder(SelectedDepartments model) {
                this.exists = model.exists;
                this.id = model.id;
                this.name = model.name;
            } 

            /**
             * Exists.
             */
            public Builder exists(Boolean exists) {
                this.exists = exists;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SelectedDepartments build() {
                return new SelectedDepartments(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIdentityProviderSyncScopeResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderSyncScopeResponseBody</p>
     */
    public static class SyncScope extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DepartmentIds")
        private java.util.List<String> departmentIds;

        @com.aliyun.core.annotation.NameInMap("Mode")
        private String mode;

        private SyncScope(Builder builder) {
            this.departmentIds = builder.departmentIds;
            this.mode = builder.mode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SyncScope create() {
            return builder().build();
        }

        /**
         * @return departmentIds
         */
        public java.util.List<String> getDepartmentIds() {
            return this.departmentIds;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        public static final class Builder {
            private java.util.List<String> departmentIds; 
            private String mode; 

            private Builder() {
            } 

            private Builder(SyncScope model) {
                this.departmentIds = model.departmentIds;
                this.mode = model.mode;
            } 

            /**
             * DepartmentIds.
             */
            public Builder departmentIds(java.util.List<String> departmentIds) {
                this.departmentIds = departmentIds;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            public SyncScope build() {
                return new SyncScope(this);
            } 

        } 

    }
}
