// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link ListAtiRegistrantsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAtiRegistrantsResponseBody</p>
 */
public class ListAtiRegistrantsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private AccessDeniedDetail accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("Registrants")
    private Registrants registrants;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalItems")
    private Integer totalItems;

    @com.aliyun.core.annotation.NameInMap("TotalPages")
    private Integer totalPages;

    private ListAtiRegistrantsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.registrants = builder.registrants;
        this.requestId = builder.requestId;
        this.totalItems = builder.totalItems;
        this.totalPages = builder.totalPages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAtiRegistrantsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public AccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return registrants
     */
    public Registrants getRegistrants() {
        return this.registrants;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalItems
     */
    public Integer getTotalItems() {
        return this.totalItems;
    }

    /**
     * @return totalPages
     */
    public Integer getTotalPages() {
        return this.totalPages;
    }

    public static final class Builder {
        private AccessDeniedDetail accessDeniedDetail; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Registrants registrants; 
        private String requestId; 
        private Integer totalItems; 
        private Integer totalPages; 

        private Builder() {
        } 

        private Builder(ListAtiRegistrantsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.registrants = model.registrants;
            this.requestId = model.requestId;
            this.totalItems = model.totalItems;
            this.totalPages = model.totalPages;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Registrants.
         */
        public Builder registrants(Registrants registrants) {
            this.registrants = registrants;
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
         * TotalItems.
         */
        public Builder totalItems(Integer totalItems) {
            this.totalItems = totalItems;
            return this;
        }

        /**
         * TotalPages.
         */
        public Builder totalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        public ListAtiRegistrantsResponseBody build() {
            return new ListAtiRegistrantsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAtiRegistrantsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAtiRegistrantsResponseBody</p>
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

            private Builder() {
            } 

            private Builder(AccessDeniedDetail model) {
                this.authAction = model.authAction;
                this.authPrincipalDisplayName = model.authPrincipalDisplayName;
                this.authPrincipalOwnerId = model.authPrincipalOwnerId;
                this.authPrincipalType = model.authPrincipalType;
                this.encodedDiagnosticMessage = model.encodedDiagnosticMessage;
                this.noPermissionType = model.noPermissionType;
                this.policyType = model.policyType;
            } 

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
     * {@link ListAtiRegistrantsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAtiRegistrantsResponseBody</p>
     */
    public static class Registrant extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cc")
        private String cc;

        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("CreateTimestamp")
        private String createTimestamp;

        @com.aliyun.core.annotation.NameInMap("DocumentCode")
        private String documentCode;

        @com.aliyun.core.annotation.NameInMap("DocumentType")
        private String documentType;

        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegistrantId")
        private String registrantId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTimestamp")
        private String updateTimestamp;

        private Registrant(Builder builder) {
            this.cc = builder.cc;
            this.city = builder.city;
            this.createTimestamp = builder.createTimestamp;
            this.documentCode = builder.documentCode;
            this.documentType = builder.documentType;
            this.email = builder.email;
            this.name = builder.name;
            this.registrantId = builder.registrantId;
            this.state = builder.state;
            this.status = builder.status;
            this.updateTimestamp = builder.updateTimestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Registrant create() {
            return builder().build();
        }

        /**
         * @return cc
         */
        public String getCc() {
            return this.cc;
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return createTimestamp
         */
        public String getCreateTimestamp() {
            return this.createTimestamp;
        }

        /**
         * @return documentCode
         */
        public String getDocumentCode() {
            return this.documentCode;
        }

        /**
         * @return documentType
         */
        public String getDocumentType() {
            return this.documentType;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return registrantId
         */
        public String getRegistrantId() {
            return this.registrantId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTimestamp
         */
        public String getUpdateTimestamp() {
            return this.updateTimestamp;
        }

        public static final class Builder {
            private String cc; 
            private String city; 
            private String createTimestamp; 
            private String documentCode; 
            private String documentType; 
            private String email; 
            private String name; 
            private String registrantId; 
            private String state; 
            private String status; 
            private String updateTimestamp; 

            private Builder() {
            } 

            private Builder(Registrant model) {
                this.cc = model.cc;
                this.city = model.city;
                this.createTimestamp = model.createTimestamp;
                this.documentCode = model.documentCode;
                this.documentType = model.documentType;
                this.email = model.email;
                this.name = model.name;
                this.registrantId = model.registrantId;
                this.state = model.state;
                this.status = model.status;
                this.updateTimestamp = model.updateTimestamp;
            } 

            /**
             * Cc.
             */
            public Builder cc(String cc) {
                this.cc = cc;
                return this;
            }

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * CreateTimestamp.
             */
            public Builder createTimestamp(String createTimestamp) {
                this.createTimestamp = createTimestamp;
                return this;
            }

            /**
             * DocumentCode.
             */
            public Builder documentCode(String documentCode) {
                this.documentCode = documentCode;
                return this;
            }

            /**
             * DocumentType.
             */
            public Builder documentType(String documentType) {
                this.documentType = documentType;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * RegistrantId.
             */
            public Builder registrantId(String registrantId) {
                this.registrantId = registrantId;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UpdateTimestamp.
             */
            public Builder updateTimestamp(String updateTimestamp) {
                this.updateTimestamp = updateTimestamp;
                return this;
            }

            public Registrant build() {
                return new Registrant(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAtiRegistrantsResponseBody} extends {@link TeaModel}
     *
     * <p>ListAtiRegistrantsResponseBody</p>
     */
    public static class Registrants extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Registrant")
        private java.util.List<Registrant> registrant;

        private Registrants(Builder builder) {
            this.registrant = builder.registrant;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Registrants create() {
            return builder().build();
        }

        /**
         * @return registrant
         */
        public java.util.List<Registrant> getRegistrant() {
            return this.registrant;
        }

        public static final class Builder {
            private java.util.List<Registrant> registrant; 

            private Builder() {
            } 

            private Builder(Registrants model) {
                this.registrant = model.registrant;
            } 

            /**
             * Registrant.
             */
            public Builder registrant(java.util.List<Registrant> registrant) {
                this.registrant = registrant;
                return this;
            }

            public Registrants build() {
                return new Registrants(this);
            } 

        } 

    }
}
