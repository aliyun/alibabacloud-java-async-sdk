// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20230522.models;

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
 * {@link DescribeLangfuseProjectMembershipsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLangfuseProjectMembershipsResponseBody</p>
 */
public class DescribeLangfuseProjectMembershipsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLangfuseProjectMembershipsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLangfuseProjectMembershipsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLangfuseProjectMembershipsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>A82758F8-E793-5610-BE11-0E46664305C2</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLangfuseProjectMembershipsResponseBody build() {
            return new DescribeLangfuseProjectMembershipsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLangfuseProjectMembershipsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLangfuseProjectMembershipsResponseBody</p>
     */
    public static class Memberships extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OrgRole")
        private String orgRole;

        @com.aliyun.core.annotation.NameInMap("ProjectRole")
        private String projectRole;

        private Memberships(Builder builder) {
            this.email = builder.email;
            this.name = builder.name;
            this.orgRole = builder.orgRole;
            this.projectRole = builder.projectRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Memberships create() {
            return builder().build();
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
         * @return orgRole
         */
        public String getOrgRole() {
            return this.orgRole;
        }

        /**
         * @return projectRole
         */
        public String getProjectRole() {
            return this.projectRole;
        }

        public static final class Builder {
            private String email; 
            private String name; 
            private String orgRole; 
            private String projectRole; 

            private Builder() {
            } 

            private Builder(Memberships model) {
                this.email = model.email;
                this.name = model.name;
                this.orgRole = model.orgRole;
                this.projectRole = model.projectRole;
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
             * OrgRole.
             */
            public Builder orgRole(String orgRole) {
                this.orgRole = orgRole;
                return this;
            }

            /**
             * ProjectRole.
             */
            public Builder projectRole(String projectRole) {
                this.projectRole = projectRole;
                return this;
            }

            public Memberships build() {
                return new Memberships(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLangfuseProjectMembershipsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLangfuseProjectMembershipsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Memberships")
        private java.util.List<Memberships> memberships;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.memberships = builder.memberships;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return memberships
         */
        public java.util.List<Memberships> getMemberships() {
            return this.memberships;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Memberships> memberships; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.memberships = model.memberships;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * Memberships.
             */
            public Builder memberships(java.util.List<Memberships> memberships) {
                this.memberships = memberships;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
