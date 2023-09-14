// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDoctorJobsStatsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDoctorJobsStatsResponseBody</p>
 */
public class ListDoctorJobsStatsResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("MaxResults")
    private Integer maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListDoctorJobsStatsResponseBody(Builder builder) {
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDoctorJobsStatsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
        private java.util.List < Data> data; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * 本次请求所返回的最大记录条数。
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * 返回读取到的数据位置，空代表数据已经读取完毕。
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 本次请求条件下的数据总量。
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDoctorJobsStatsResponseBody build() {
            return new ListDoctorJobsStatsResponseBody(this);
        } 

    } 

    public static class AppsCount extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Long value;

        private AppsCount(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppsCount create() {
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
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public AppsCount build() {
                return new AppsCount(this);
            } 

        } 

    }
    public static class MemSeconds extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Long value;

        private MemSeconds(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemSeconds create() {
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
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public MemSeconds build() {
                return new MemSeconds(this);
            } 

        } 

    }
    public static class VcoreSeconds extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Unit")
        private String unit;

        @NameInMap("Value")
        private Long value;

        private VcoreSeconds(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.unit = builder.unit;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VcoreSeconds create() {
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
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        /**
         * @return value
         */
        public Long getValue() {
            return this.value;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String unit; 
            private Long value; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
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
             * Unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(Long value) {
                this.value = value;
                return this;
            }

            public VcoreSeconds build() {
                return new VcoreSeconds(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppsCount")
        private AppsCount appsCount;

        @NameInMap("MemSeconds")
        private MemSeconds memSeconds;

        @NameInMap("Queue")
        private String queue;

        @NameInMap("Type")
        private String type;

        @NameInMap("User")
        private String user;

        @NameInMap("VcoreSeconds")
        private VcoreSeconds vcoreSeconds;

        private Data(Builder builder) {
            this.appsCount = builder.appsCount;
            this.memSeconds = builder.memSeconds;
            this.queue = builder.queue;
            this.type = builder.type;
            this.user = builder.user;
            this.vcoreSeconds = builder.vcoreSeconds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appsCount
         */
        public AppsCount getAppsCount() {
            return this.appsCount;
        }

        /**
         * @return memSeconds
         */
        public MemSeconds getMemSeconds() {
            return this.memSeconds;
        }

        /**
         * @return queue
         */
        public String getQueue() {
            return this.queue;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return user
         */
        public String getUser() {
            return this.user;
        }

        /**
         * @return vcoreSeconds
         */
        public VcoreSeconds getVcoreSeconds() {
            return this.vcoreSeconds;
        }

        public static final class Builder {
            private AppsCount appsCount; 
            private MemSeconds memSeconds; 
            private String queue; 
            private String type; 
            private String user; 
            private VcoreSeconds vcoreSeconds; 

            /**
             * AppsCount.
             */
            public Builder appsCount(AppsCount appsCount) {
                this.appsCount = appsCount;
                return this;
            }

            /**
             * MemSeconds.
             */
            public Builder memSeconds(MemSeconds memSeconds) {
                this.memSeconds = memSeconds;
                return this;
            }

            /**
             * Queue.
             */
            public Builder queue(String queue) {
                this.queue = queue;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * User.
             */
            public Builder user(String user) {
                this.user = user;
                return this;
            }

            /**
             * VcoreSeconds.
             */
            public Builder vcoreSeconds(VcoreSeconds vcoreSeconds) {
                this.vcoreSeconds = vcoreSeconds;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
