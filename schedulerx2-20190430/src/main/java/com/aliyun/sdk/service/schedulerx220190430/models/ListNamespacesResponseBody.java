// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListNamespacesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNamespacesResponseBody</p>
 */
public class ListNamespacesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListNamespacesResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNamespacesResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private AccessDeniedDetail accessDeniedDetail; 
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The information about the namespaces.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71BCC0E3-64B2-4B63-A870-AFB64EBCB58C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListNamespacesResponseBody build() {
            return new ListNamespacesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamespacesResponseBody</p>
     */
    public static class AccessDeniedDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthAction")
        private String authAction;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalDisplayName")
        private String authPrincipalDisplayName;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalOwnerId")
        private String authPrincipalOwnerId;

        @com.aliyun.core.annotation.NameInMap("AuthPrincipalType")
        private String authPrincipalType;

        @com.aliyun.core.annotation.NameInMap("EncodedDiagnosticMessage")
        private String encodedDiagnosticMessage;

        @com.aliyun.core.annotation.NameInMap("NoPermissionType")
        private String noPermissionType;

        @com.aliyun.core.annotation.NameInMap("PolicyType")
        private String policyType;

        private AccessDeniedDetail(Builder builder) {
            this.authAction = builder.authAction;
            this.authPrincipalDisplayName = builder.authPrincipalDisplayName;
            this.authPrincipalOwnerId = builder.authPrincipalOwnerId;
            this.authPrincipalType = builder.authPrincipalType;
            this.encodedDiagnosticMessage = builder.encodedDiagnosticMessage;
            this.noPermissionType = builder.noPermissionType;
            this.policyType = builder.policyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessDeniedDetail create() {
            return builder().build();
        }

        /**
         * @return authAction
         */
        public String getAuthAction() {
            return this.authAction;
        }

        /**
         * @return authPrincipalDisplayName
         */
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        /**
         * @return authPrincipalOwnerId
         */
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        /**
         * @return authPrincipalType
         */
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        /**
         * @return encodedDiagnosticMessage
         */
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        /**
         * @return noPermissionType
         */
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        /**
         * @return policyType
         */
        public String getPolicyType() {
            return this.policyType;
        }

        public static final class Builder {
            private String authAction; 
            private String authPrincipalDisplayName; 
            private String authPrincipalOwnerId; 
            private String authPrincipalType; 
            private String encodedDiagnosticMessage; 
            private String noPermissionType; 
            private String policyType; 

            /**
             * AuthAction.
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * AuthPrincipalDisplayName.
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * AuthPrincipalOwnerId.
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * AuthPrincipalType.
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * EncodedDiagnosticMessage.
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * NoPermissionType.
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * PolicyType.
             */
            public Builder policyType(String policyType) {
                this.policyType = policyType;
                return this;
            }

            public AccessDeniedDetail build() {
                return new AccessDeniedDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamespacesResponseBody</p>
     */
    public static class Namespaces extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("UId")
        private String uId;

        private Namespaces(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.uId = builder.uId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Namespaces create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return uId
         */
        public String getUId() {
            return this.uId;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String uId; 

            /**
             * <p>The description of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>doc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1a72ecb1-b4cc-400a-a71b-20cdec9b****</p>
             */
            public Builder uId(String uId) {
                this.uId = uId;
                return this;
            }

            public Namespaces build() {
                return new Namespaces(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNamespacesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNamespacesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Namespaces")
        private java.util.List < Namespaces> namespaces;

        private Data(Builder builder) {
            this.namespaces = builder.namespaces;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return namespaces
         */
        public java.util.List < Namespaces> getNamespaces() {
            return this.namespaces;
        }

        public static final class Builder {
            private java.util.List < Namespaces> namespaces; 

            /**
             * <p>The namespaces and their details.</p>
             */
            public Builder namespaces(java.util.List < Namespaces> namespaces) {
                this.namespaces = namespaces;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
