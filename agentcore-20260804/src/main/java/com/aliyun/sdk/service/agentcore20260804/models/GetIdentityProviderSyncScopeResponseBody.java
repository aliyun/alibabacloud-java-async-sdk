// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentcore20260804.models;

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
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("httpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    private GetIdentityProviderSyncScopeResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
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
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetIdentityProviderSyncScopeResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business status code of the API request. SUCCESS indicates that the request is successful, but does not indicate that the asynchronous synchronization task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The business data returned by the request.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;syncScope&quot;:{&quot;mode&quot;:&quot;SelectedDepartments&quot;,&quot;departmentIds&quot;:[&quot;10001&quot;]},&quot;selectedDepartments&quot;:[{&quot;id&quot;:&quot;10001&quot;,&quot;name&quot;:&quot;R&amp;D Department&quot;,&quot;exists&quot;:true}],&quot;estimateStatus&quot;:&quot;Ready&quot;,&quot;expandedDepartmentCount&quot;:2,&quot;estimatedUserCount&quot;:12}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code of the API request. It does not indicate the execution result of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The response message of the API request.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique identifier of the request. Provide this value when troubleshooting issues.</p>
         * 
         * <strong>example:</strong>
         * <p>01234567-89AB-CDEF-0123-456789ABCDEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the API request is successful. To check whether the asynchronous task is completed, query the task status.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
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
        @com.aliyun.core.annotation.NameInMap("exists")
        private Boolean exists;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("name")
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
             * <p>Indicates whether the selected department still exists. A value of false indicates that the selection is invalid and the synchronization scope must be reconfirmed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder exists(Boolean exists) {
                this.exists = exists;
                return this;
            }

            /**
             * <p>The unique identifier of the department returned by the identity provider. When querying the sub-departments of this node, use this value as parentDepartmentId.</p>
             * 
             * <strong>example:</strong>
             * <p>10001</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the department returned by the identity provider.</p>
             * 
             * <strong>example:</strong>
             * <p>R&amp;D Department</p>
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
        @com.aliyun.core.annotation.NameInMap("departmentIds")
        private java.util.List<String> departmentIds;

        @com.aliyun.core.annotation.NameInMap("mode")
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
             * <p>When the mode is SelectedDepartments, this parameter contains at least one non-empty department ID, which should be obtained from ListIdentityProviderDepartments. When the mode is AllAuthorized, pass an empty array or omit this parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;10001&quot;]</p>
             */
            public Builder departmentIds(java.util.List<String> departmentIds) {
                this.departmentIds = departmentIds;
                return this;
            }

            /**
             * <p>The scope mode. Valid values: AllAuthorized (the entire authorized scope, limited by the application\&quot;s address book authorization) and SelectedDepartments (the selected departments and all their sub-departments). When explicitly submitting syncScope, a valid mode must be provided and verified by the backend.</p>
             * 
             * <strong>example:</strong>
             * <p>SelectedDepartments</p>
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
    /**
     * 
     * {@link GetIdentityProviderSyncScopeResponseBody} extends {@link TeaModel}
     *
     * <p>GetIdentityProviderSyncScopeResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("estimateStatus")
        private String estimateStatus;

        @com.aliyun.core.annotation.NameInMap("estimatedUserCount")
        private Long estimatedUserCount;

        @com.aliyun.core.annotation.NameInMap("expandedDepartmentCount")
        private Long expandedDepartmentCount;

        @com.aliyun.core.annotation.NameInMap("selectedDepartments")
        private java.util.List<SelectedDepartments> selectedDepartments;

        @com.aliyun.core.annotation.NameInMap("syncScope")
        private SyncScope syncScope;

        private Data(Builder builder) {
            this.estimateStatus = builder.estimateStatus;
            this.estimatedUserCount = builder.estimatedUserCount;
            this.expandedDepartmentCount = builder.expandedDepartmentCount;
            this.selectedDepartments = builder.selectedDepartments;
            this.syncScope = builder.syncScope;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
            private java.util.List<SelectedDepartments> selectedDepartments; 
            private SyncScope syncScope; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.estimateStatus = model.estimateStatus;
                this.estimatedUserCount = model.estimatedUserCount;
                this.expandedDepartmentCount = model.expandedDepartmentCount;
                this.selectedDepartments = model.selectedDepartments;
                this.syncScope = model.syncScope;
            } 

            /**
             * <p>The estimation status of the user count for the synchronization scope. The count is available only when the status is Ready. A missing count in other states cannot be considered as 0.</p>
             * 
             * <strong>example:</strong>
             * <p>Ready</p>
             */
            public Builder estimateStatus(String estimateStatus) {
                this.estimateStatus = estimateStatus;
                return this;
            }

            /**
             * <p>The estimated number of users in the saved synchronization scope. This parameter is returned only when estimateStatus is Ready and the downstream system provides the value. It does not represent the number of users that have been synchronized.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder estimatedUserCount(Long estimatedUserCount) {
                this.estimatedUserCount = estimatedUserCount;
                return this;
            }

            /**
             * <p>The estimated number of departments including sub-departments. This parameter is returned only when estimateStatus is Ready and the downstream system provides the value.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder expandedDepartmentCount(Long expandedDepartmentCount) {
                this.expandedDepartmentCount = expandedDepartmentCount;
                return this;
            }

            /**
             * <p>The names and validity of the saved selected departments. This parameter can be an empty array when the mode is AllAuthorized. An empty array does not indicate that the organization has no departments.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;id&quot;:&quot;10001&quot;,&quot;name&quot;:&quot;R&amp;D Department&quot;,&quot;exists&quot;:true}]</p>
             */
            public Builder selectedDepartments(java.util.List<SelectedDepartments> selectedDepartments) {
                this.selectedDepartments = selectedDepartments;
                return this;
            }

            /**
             * <p>The saved synchronization scope downstream. AllAuthorized indicates the address book scope authorized for the application.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;mode&quot;:&quot;SelectedDepartments&quot;,&quot;departmentIds&quot;:[&quot;10001&quot;]}</p>
             */
            public Builder syncScope(SyncScope syncScope) {
                this.syncScope = syncScope;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
