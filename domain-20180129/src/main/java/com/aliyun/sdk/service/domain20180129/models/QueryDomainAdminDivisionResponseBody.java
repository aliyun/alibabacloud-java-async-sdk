// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDomainAdminDivisionResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDomainAdminDivisionResponseBody</p>
 */
public class QueryDomainAdminDivisionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdminDivisions")
    private AdminDivisions adminDivisions;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDomainAdminDivisionResponseBody(Builder builder) {
        this.adminDivisions = builder.adminDivisions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDomainAdminDivisionResponseBody create() {
        return builder().build();
    }

    /**
     * @return adminDivisions
     */
    public AdminDivisions getAdminDivisions() {
        return this.adminDivisions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AdminDivisions adminDivisions; 
        private String requestId; 

        /**
         * AdminDivisions.
         */
        public Builder adminDivisions(AdminDivisions adminDivisions) {
            this.adminDivisions = adminDivisions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDomainAdminDivisionResponseBody build() {
            return new QueryDomainAdminDivisionResponseBody(this);
        } 

    } 

    public static class Children extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChildDivisionName")
        private String childDivisionName;

        private Children(Builder builder) {
            this.childDivisionName = builder.childDivisionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Children create() {
            return builder().build();
        }

        /**
         * @return childDivisionName
         */
        public String getChildDivisionName() {
            return this.childDivisionName;
        }

        public static final class Builder {
            private String childDivisionName; 

            /**
             * ChildDivisionName.
             */
            public Builder childDivisionName(String childDivisionName) {
                this.childDivisionName = childDivisionName;
                return this;
            }

            public Children build() {
                return new Children(this);
            } 

        } 

    }
    public static class AdminDivisionChildren extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List < Children> children;

        private AdminDivisionChildren(Builder builder) {
            this.children = builder.children;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdminDivisionChildren create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List < Children> getChildren() {
            return this.children;
        }

        public static final class Builder {
            private java.util.List < Children> children; 

            /**
             * Children.
             */
            public Builder children(java.util.List < Children> children) {
                this.children = children;
                return this;
            }

            public AdminDivisionChildren build() {
                return new AdminDivisionChildren(this);
            } 

        } 

    }
    public static class AdminDivision extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private AdminDivisionChildren children;

        @com.aliyun.core.annotation.NameInMap("DivisionName")
        private String divisionName;

        private AdminDivision(Builder builder) {
            this.children = builder.children;
            this.divisionName = builder.divisionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdminDivision create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public AdminDivisionChildren getChildren() {
            return this.children;
        }

        /**
         * @return divisionName
         */
        public String getDivisionName() {
            return this.divisionName;
        }

        public static final class Builder {
            private AdminDivisionChildren children; 
            private String divisionName; 

            /**
             * Children.
             */
            public Builder children(AdminDivisionChildren children) {
                this.children = children;
                return this;
            }

            /**
             * DivisionName.
             */
            public Builder divisionName(String divisionName) {
                this.divisionName = divisionName;
                return this;
            }

            public AdminDivision build() {
                return new AdminDivision(this);
            } 

        } 

    }
    public static class AdminDivisions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdminDivision")
        private java.util.List < AdminDivision> adminDivision;

        private AdminDivisions(Builder builder) {
            this.adminDivision = builder.adminDivision;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AdminDivisions create() {
            return builder().build();
        }

        /**
         * @return adminDivision
         */
        public java.util.List < AdminDivision> getAdminDivision() {
            return this.adminDivision;
        }

        public static final class Builder {
            private java.util.List < AdminDivision> adminDivision; 

            /**
             * AdminDivision.
             */
            public Builder adminDivision(java.util.List < AdminDivision> adminDivision) {
                this.adminDivision = adminDivision;
                return this;
            }

            public AdminDivisions build() {
                return new AdminDivisions(this);
            } 

        } 

    }
}
