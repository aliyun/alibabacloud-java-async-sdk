// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imagesearch20201214.models;

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
 * {@link DetailResponseBody} extends {@link TeaModel}
 *
 * <p>DetailResponseBody</p>
 */
public class DetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Instance")
    private Instance instance;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DetailResponseBody(Builder builder) {
        this.instance = builder.instance;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return instance
     */
    public Instance getInstance() {
        return this.instance;
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
        private Instance instance; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The details about the instance.</p>
         */
        public Builder instance(Instance instance) {
            this.instance = instance;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>36C43E96-8F68-44AA-B1AF-B1F7AB94A6C1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DetailResponseBody build() {
            return new DetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DetailResponseBody} extends {@link TeaModel}
     *
     * <p>DetailResponseBody</p>
     */
    public static class Instance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Capacity")
        private Integer capacity;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private Integer qps;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("ServiceType")
        private Integer serviceType;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("UtcCreate")
        private String utcCreate;

        @com.aliyun.core.annotation.NameInMap("UtcExpireTime")
        private String utcExpireTime;

        private Instance(Builder builder) {
            this.capacity = builder.capacity;
            this.name = builder.name;
            this.qps = builder.qps;
            this.region = builder.region;
            this.serviceType = builder.serviceType;
            this.totalCount = builder.totalCount;
            this.utcCreate = builder.utcCreate;
            this.utcExpireTime = builder.utcExpireTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Instance create() {
            return builder().build();
        }

        /**
         * @return capacity
         */
        public Integer getCapacity() {
            return this.capacity;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return qps
         */
        public Integer getQps() {
            return this.qps;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return serviceType
         */
        public Integer getServiceType() {
            return this.serviceType;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return utcCreate
         */
        public String getUtcCreate() {
            return this.utcCreate;
        }

        /**
         * @return utcExpireTime
         */
        public String getUtcExpireTime() {
            return this.utcExpireTime;
        }

        public static final class Builder {
            private Integer capacity; 
            private String name; 
            private Integer qps; 
            private String region; 
            private Integer serviceType; 
            private Long totalCount; 
            private String utcCreate; 
            private String utcExpireTime; 

            /**
             * <p>The capacity of the plan. Unit: × 10,000 images.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder capacity(Integer capacity) {
                this.capacity = capacity;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>imagesearchName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of queries per second supported by the plan.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder qps(Integer qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The information about the region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * <p>The Image Search model.</p>
             * <p>0: commodity search. 1: generic image search.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder serviceType(Integer serviceType) {
                this.serviceType = serviceType;
                return this;
            }

            /**
             * <p>The number of images.</p>
             * 
             * <strong>example:</strong>
             * <p>10063</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The time when the instance was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1620382716000</p>
             */
            public Builder utcCreate(String utcCreate) {
                this.utcCreate = utcCreate;
                return this;
            }

            /**
             * <p>The time when the instance expires. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1623081600000</p>
             */
            public Builder utcExpireTime(String utcExpireTime) {
                this.utcExpireTime = utcExpireTime;
                return this;
            }

            public Instance build() {
                return new Instance(this);
            } 

        } 

    }
}
