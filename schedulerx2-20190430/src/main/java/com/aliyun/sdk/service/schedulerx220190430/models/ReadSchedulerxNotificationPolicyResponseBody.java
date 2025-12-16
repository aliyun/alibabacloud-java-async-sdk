// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

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
 * {@link ReadSchedulerxNotificationPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>ReadSchedulerxNotificationPolicyResponseBody</p>
 */
public class ReadSchedulerxNotificationPolicyResponseBody extends TeaModel {
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

    private ReadSchedulerxNotificationPolicyResponseBody(Builder builder) {
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

    public static ReadSchedulerxNotificationPolicyResponseBody create() {
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

        private Builder() {
        } 

        private Builder(ReadSchedulerxNotificationPolicyResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The access denial details.</p>
         */
        public Builder accessDeniedDetail(AccessDeniedDetail accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>unknown exception occurred</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The unique request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>71BCC0E3-64B2-4B63-A870-AFB64EBCB5A7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ReadSchedulerxNotificationPolicyResponseBody build() {
            return new ReadSchedulerxNotificationPolicyResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ReadSchedulerxNotificationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ReadSchedulerxNotificationPolicyResponseBody</p>
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
             * <p>The authentication operation.</p>
             * 
             * <strong>example:</strong>
             * <p>edas:ReadSchedulerxNotificationPolicy</p>
             */
            public Builder authAction(String authAction) {
                this.authAction = authAction;
                return this;
            }

            /**
             * <p>The principal name.</p>
             * 
             * <strong>example:</strong>
             * <p>209312833131416xxx</p>
             */
            public Builder authPrincipalDisplayName(String authPrincipalDisplayName) {
                this.authPrincipalDisplayName = authPrincipalDisplayName;
                return this;
            }

            /**
             * <p>The account of the principal.</p>
             * 
             * <strong>example:</strong>
             * <p>1827811800526xxx</p>
             */
            public Builder authPrincipalOwnerId(String authPrincipalOwnerId) {
                this.authPrincipalOwnerId = authPrincipalOwnerId;
                return this;
            }

            /**
             * <p>The principal type.</p>
             * 
             * <strong>example:</strong>
             * <p>SubUser</p>
             */
            public Builder authPrincipalType(String authPrincipalType) {
                this.authPrincipalType = authPrincipalType;
                return this;
            }

            /**
             * <p>The encoded diagnostic message.</p>
             * 
             * <strong>example:</strong>
             * <p>AQFn/cLPZ/3Cz0YxQkZBMjVGLTY0REUtNTlGNS05NzUwLTgyMUE4M0MwMTFDRQ==</p>
             */
            public Builder encodedDiagnosticMessage(String encodedDiagnosticMessage) {
                this.encodedDiagnosticMessage = encodedDiagnosticMessage;
                return this;
            }

            /**
             * <p>The permission denial type.</p>
             * 
             * <strong>example:</strong>
             * <p>ImplicitDeny</p>
             */
            public Builder noPermissionType(String noPermissionType) {
                this.noPermissionType = noPermissionType;
                return this;
            }

            /**
             * <p>The policy type.</p>
             * 
             * <strong>example:</strong>
             * <p>AccountLevelIdentityBasedPolicy</p>
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
     * {@link ReadSchedulerxNotificationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ReadSchedulerxNotificationPolicyResponseBody</p>
     */
    public static class ReferenceApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppGroupId")
        private Long appGroupId;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("NamespaceName")
        private String namespaceName;

        @com.aliyun.core.annotation.NameInMap("NamespaceUid")
        private String namespaceUid;

        private ReferenceApps(Builder builder) {
            this.appGroupId = builder.appGroupId;
            this.groupId = builder.groupId;
            this.namespaceName = builder.namespaceName;
            this.namespaceUid = builder.namespaceUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReferenceApps create() {
            return builder().build();
        }

        /**
         * @return appGroupId
         */
        public Long getAppGroupId() {
            return this.appGroupId;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return namespaceName
         */
        public String getNamespaceName() {
            return this.namespaceName;
        }

        /**
         * @return namespaceUid
         */
        public String getNamespaceUid() {
            return this.namespaceUid;
        }

        public static final class Builder {
            private Long appGroupId; 
            private String groupId; 
            private String namespaceName; 
            private String namespaceUid; 

            private Builder() {
            } 

            private Builder(ReferenceApps model) {
                this.appGroupId = model.appGroupId;
                this.groupId = model.groupId;
                this.namespaceName = model.namespaceName;
                this.namespaceUid = model.namespaceUid;
            } 

            /**
             * <p>The ID of the task group.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder appGroupId(Long appGroupId) {
                this.appGroupId = appGroupId;
                return this;
            }

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>test-app</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The name of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>Notification strategy testing namespace</p>
             */
            public Builder namespaceName(String namespaceName) {
                this.namespaceName = namespaceName;
                return this;
            }

            /**
             * <p>The unique identifier of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>18271388-aa16-4eab-9a6f-55f65d7e4391</p>
             */
            public Builder namespaceUid(String namespaceUid) {
                this.namespaceUid = namespaceUid;
                return this;
            }

            public ReferenceApps build() {
                return new ReferenceApps(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadSchedulerxNotificationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ReadSchedulerxNotificationPolicyResponseBody</p>
     */
    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelTimeRange")
        private String channelTimeRange;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Creator")
        private String creator;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("PolicyName")
        private String policyName;

        @com.aliyun.core.annotation.NameInMap("ReferenceApps")
        private java.util.List<ReferenceApps> referenceApps;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Updater")
        private String updater;

        private Records(Builder builder) {
            this.channelTimeRange = builder.channelTimeRange;
            this.createTime = builder.createTime;
            this.creator = builder.creator;
            this.description = builder.description;
            this.policyName = builder.policyName;
            this.referenceApps = builder.referenceApps;
            this.updateTime = builder.updateTime;
            this.updater = builder.updater;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return channelTimeRange
         */
        public String getChannelTimeRange() {
            return this.channelTimeRange;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return creator
         */
        public String getCreator() {
            return this.creator;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return policyName
         */
        public String getPolicyName() {
            return this.policyName;
        }

        /**
         * @return referenceApps
         */
        public java.util.List<ReferenceApps> getReferenceApps() {
            return this.referenceApps;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return updater
         */
        public String getUpdater() {
            return this.updater;
        }

        public static final class Builder {
            private String channelTimeRange; 
            private String createTime; 
            private String creator; 
            private String description; 
            private String policyName; 
            private java.util.List<ReferenceApps> referenceApps; 
            private String updateTime; 
            private String updater; 

            private Builder() {
            } 

            private Builder(Records model) {
                this.channelTimeRange = model.channelTimeRange;
                this.createTime = model.createTime;
                this.creator = model.creator;
                this.description = model.description;
                this.policyName = model.policyName;
                this.referenceApps = model.referenceApps;
                this.updateTime = model.updateTime;
                this.updater = model.updater;
            } 

            /**
             * <p>The configuration of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *   &quot;isUnifiedSetting&quot;: false,
             *   &quot;timezone&quot;: &quot;GMT+8&quot;,
             *   &quot;webhookIsAtAll&quot;: &quot;false&quot;,
             *   &quot;timeRanges&quot;: {
             *     &quot;webhook&quot;: [
             *       {
             *         &quot;startTime&quot;: &quot;08:00&quot;,
             *         &quot;endTime&quot;: &quot;18:00&quot;,
             *         &quot;daysOfWeek&quot;: [
             *           1,
             *           2,
             *           3,
             *           4,
             *           5
             *         ]
             *       }
             *     ],
             *     &quot;sms&quot;: [
             *       {
             *         &quot;startTime&quot;: &quot;08:00&quot;,
             *         &quot;endTime&quot;: &quot;18:00&quot;,
             *         &quot;daysOfWeek&quot;: [
             *           1,
             *           2,
             *           3,
             *           4,
             *           5
             *         ]
             *       }
             *     ],
             *     &quot;mail&quot;: [
             *       {
             *         &quot;startTime&quot;: &quot;08:00&quot;,
             *         &quot;endTime&quot;: &quot;18:00&quot;,
             *         &quot;daysOfWeek&quot;: [
             *           1,
             *           2,
             *           3,
             *           4,
             *           5
             *         ]
             *       }
             *     ],
             *     &quot;phone&quot;: [
             *       {
             *         &quot;startTime&quot;: &quot;08:00&quot;,
             *         &quot;endTime&quot;: &quot;18:00&quot;,
             *         &quot;daysOfWeek&quot;: [
             *           1,
             *           2,
             *           3,
             *           4,
             *           5
             *         ]
             *       }
             *     ]
             *   }
             * }</p>
             */
            public Builder channelTimeRange(String channelTimeRange) {
                this.channelTimeRange = channelTimeRange;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-17 11:21:01</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The creator.</p>
             * 
             * <strong>example:</strong>
             * <p>201576653956616970</p>
             */
            public Builder creator(String creator) {
                this.creator = creator;
                return this;
            }

            /**
             * <p>The description of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>Monday-Friday only</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the notification policy.</p>
             * 
             * <strong>example:</strong>
             * <p>test-weekdays</p>
             */
            public Builder policyName(String policyName) {
                this.policyName = policyName;
                return this;
            }

            /**
             * <p>The list of applications associated with the notification policy.</p>
             */
            public Builder referenceApps(java.util.List<ReferenceApps> referenceApps) {
                this.referenceApps = referenceApps;
                return this;
            }

            /**
             * <p>The update time.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-09-17 11:21:01</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The updater.</p>
             * 
             * <strong>example:</strong>
             * <p>1144881807903942</p>
             */
            public Builder updater(String updater) {
                this.updater = updater;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    /**
     * 
     * {@link ReadSchedulerxNotificationPolicyResponseBody} extends {@link TeaModel}
     *
     * <p>ReadSchedulerxNotificationPolicyResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("Records")
        private java.util.List<Records> records;

        @com.aliyun.core.annotation.NameInMap("Total")
        private Long total;

        private Data(Builder builder) {
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.records = builder.records;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
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
         * @return records
         */
        public java.util.List<Records> getRecords() {
            return this.records;
        }

        /**
         * @return total
         */
        public Long getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer maxResults; 
            private String nextToken; 
            private java.util.List<Records> records; 
            private Long total; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.maxResults = model.maxResults;
                this.nextToken = model.nextToken;
                this.records = model.records;
                this.total = model.total;
            } 

            /**
             * <p>The maximum number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * <p>When data that matches the query conditions has not been fully retrieved, the server returns nextToken. You can then use nextToken to continue retrieving the remaining data.</p>
             * 
             * <strong>example:</strong>
             * <p>O39nXKu5XafATl3/cJjSJw==</p>
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * <p>The data records.</p>
             */
            public Builder records(java.util.List<Records> records) {
                this.records = records;
                return this;
            }

            /**
             * <p>The total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>42</p>
             */
            public Builder total(Long total) {
                this.total = total;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
