// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeAclBackupListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAclBackupListResponseBody</p>
 */
public class DescribeAclBackupListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Backups")
    private java.util.List<Backups> backups;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAclBackupListResponseBody(Builder builder) {
        this.backups = builder.backups;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAclBackupListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backups
     */
    public java.util.List<Backups> getBackups() {
        return this.backups;
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
        private java.util.List<Backups> backups; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAclBackupListResponseBody model) {
            this.backups = model.backups;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Backups.
         */
        public Builder backups(java.util.List<Backups> backups) {
            this.backups = backups;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAclBackupListResponseBody build() {
            return new DescribeAclBackupListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAclBackupListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAclBackupListResponseBody</p>
     */
    public static class Backups extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AclCount")
        private Integer aclCount;

        @com.aliyun.core.annotation.NameInMap("BackUpTime")
        private Long backUpTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        private Backups(Builder builder) {
            this.aclCount = builder.aclCount;
            this.backUpTime = builder.backUpTime;
            this.description = builder.description;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Backups create() {
            return builder().build();
        }

        /**
         * @return aclCount
         */
        public Integer getAclCount() {
            return this.aclCount;
        }

        /**
         * @return backUpTime
         */
        public Long getBackUpTime() {
            return this.backUpTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        public static final class Builder {
            private Integer aclCount; 
            private Long backUpTime; 
            private String description; 

            private Builder() {
            } 

            private Builder(Backups model) {
                this.aclCount = model.aclCount;
                this.backUpTime = model.backUpTime;
                this.description = model.description;
            } 

            /**
             * AclCount.
             */
            public Builder aclCount(Integer aclCount) {
                this.aclCount = aclCount;
                return this;
            }

            /**
             * BackUpTime.
             */
            public Builder backUpTime(Long backUpTime) {
                this.backUpTime = backUpTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            public Backups build() {
                return new Backups(this);
            } 

        } 

    }
}
