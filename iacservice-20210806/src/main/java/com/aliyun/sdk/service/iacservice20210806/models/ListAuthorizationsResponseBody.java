// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAuthorizationsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAuthorizationsResponseBody</p>
 */
public class ListAuthorizationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("authorizations")
    private java.util.List < Authorizations> authorizations;

    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("totalCount")
    private Integer totalCount;

    private ListAuthorizationsResponseBody(Builder builder) {
        this.authorizations = builder.authorizations;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAuthorizationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return authorizations
     */
    public java.util.List < Authorizations> getAuthorizations() {
        return this.authorizations;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Authorizations> authorizations; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * authorizations.
         */
        public Builder authorizations(java.util.List < Authorizations> authorizations) {
            this.authorizations = authorizations;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListAuthorizationsResponseBody build() {
            return new ListAuthorizationsResponseBody(this);
        } 

    } 

    public static class Authorizations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("authorizationId")
        private String authorizationId;

        @com.aliyun.core.annotation.NameInMap("createTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("dueTime")
        private String dueTime;

        @com.aliyun.core.annotation.NameInMap("moduleId")
        private String moduleId;

        @com.aliyun.core.annotation.NameInMap("moduleVersion")
        private String moduleVersion;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ownerUid")
        private Long ownerUid;

        @com.aliyun.core.annotation.NameInMap("uid")
        private Long uid;

        private Authorizations(Builder builder) {
            this.authorizationId = builder.authorizationId;
            this.createTime = builder.createTime;
            this.dueTime = builder.dueTime;
            this.moduleId = builder.moduleId;
            this.moduleVersion = builder.moduleVersion;
            this.name = builder.name;
            this.ownerUid = builder.ownerUid;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Authorizations create() {
            return builder().build();
        }

        /**
         * @return authorizationId
         */
        public String getAuthorizationId() {
            return this.authorizationId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dueTime
         */
        public String getDueTime() {
            return this.dueTime;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleVersion
         */
        public String getModuleVersion() {
            return this.moduleVersion;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return ownerUid
         */
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String authorizationId; 
            private String createTime; 
            private String dueTime; 
            private String moduleId; 
            private String moduleVersion; 
            private String name; 
            private Long ownerUid; 
            private Long uid; 

            /**
             * authorizationId.
             */
            public Builder authorizationId(String authorizationId) {
                this.authorizationId = authorizationId;
                return this;
            }

            /**
             * createTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * dueTime.
             */
            public Builder dueTime(String dueTime) {
                this.dueTime = dueTime;
                return this;
            }

            /**
             * moduleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * moduleVersion.
             */
            public Builder moduleVersion(String moduleVersion) {
                this.moduleVersion = moduleVersion;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ownerUid.
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            public Authorizations build() {
                return new Authorizations(this);
            } 

        } 

    }
}
