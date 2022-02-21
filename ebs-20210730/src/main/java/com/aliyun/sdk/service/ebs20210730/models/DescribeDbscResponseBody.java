// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDbscResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDbscResponseBody</p>
 */
public class DescribeDbscResponseBody extends TeaModel {
    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("ReplicaPairs")
    private java.util.List < ReplicaPairs> replicaPairs;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDbscResponseBody(Builder builder) {
        this.nextToken = builder.nextToken;
        this.replicaPairs = builder.replicaPairs;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDbscResponseBody create() {
        return builder().build();
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return replicaPairs
     */
    public java.util.List < ReplicaPairs> getReplicaPairs() {
        return this.replicaPairs;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String nextToken; 
        private java.util.List < ReplicaPairs> replicaPairs; 
        private String requestId; 

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * ReplicaPairs.
         */
        public Builder replicaPairs(java.util.List < ReplicaPairs> replicaPairs) {
            this.replicaPairs = replicaPairs;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDbscResponseBody build() {
            return new DescribeDbscResponseBody(this);
        } 

    } 

    public static class ReplicaPairs extends TeaModel {
        @NameInMap("DbscId")
        private String dbscId;

        @NameInMap("DbscName")
        private String dbscName;

        @NameInMap("Description")
        private String description;

        @NameInMap("Region")
        private String region;

        @NameInMap("Status")
        private String status;

        private ReplicaPairs(Builder builder) {
            this.dbscId = builder.dbscId;
            this.dbscName = builder.dbscName;
            this.description = builder.description;
            this.region = builder.region;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ReplicaPairs create() {
            return builder().build();
        }

        /**
         * @return dbscId
         */
        public String getDbscId() {
            return this.dbscId;
        }

        /**
         * @return dbscName
         */
        public String getDbscName() {
            return this.dbscName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String dbscId; 
            private String dbscName; 
            private String description; 
            private String region; 
            private String status; 

            /**
             * DbscId.
             */
            public Builder dbscId(String dbscId) {
                this.dbscId = dbscId;
                return this;
            }

            /**
             * DbscName.
             */
            public Builder dbscName(String dbscName) {
                this.dbscName = dbscName;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ReplicaPairs build() {
                return new ReplicaPairs(this);
            } 

        } 

    }
}
