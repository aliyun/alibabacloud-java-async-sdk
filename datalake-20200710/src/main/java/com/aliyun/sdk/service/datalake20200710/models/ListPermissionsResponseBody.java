// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListPermissionsResponseBody</p>
 */
public class ListPermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextPageToken")
    private String nextPageToken;

    @com.aliyun.core.annotation.NameInMap("PrincipalResourcePermissionsList")
    private java.util.List < PrincipalResourcePermissions > principalResourcePermissionsList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListPermissionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.nextPageToken = builder.nextPageToken;
        this.principalResourcePermissionsList = builder.principalResourcePermissionsList;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPermissionsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextPageToken
     */
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * @return principalResourcePermissionsList
     */
    public java.util.List < PrincipalResourcePermissions > getPrincipalResourcePermissionsList() {
        return this.principalResourcePermissionsList;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String nextPageToken; 
        private java.util.List < PrincipalResourcePermissions > principalResourcePermissionsList; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Response Code
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message Code
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * NextPageToken
         */
        public Builder nextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }

        /**
         * PrincipalResourcePermissionsList.
         */
        public Builder principalResourcePermissionsList(java.util.List < PrincipalResourcePermissions > principalResourcePermissionsList) {
            this.principalResourcePermissionsList = principalResourcePermissionsList;
            return this;
        }

        /**
         * RequestId
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListPermissionsResponseBody build() {
            return new ListPermissionsResponseBody(this);
        } 

    } 

}
