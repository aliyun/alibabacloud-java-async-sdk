// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SelectResourceResponseBody} extends {@link TeaModel}
 *
 * <p>SelectResourceResponseBody</p>
 */
public class SelectResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resourceInfoList")
    private java.util.List < ResourceInfoList> resourceInfoList;

    private SelectResourceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceInfoList = builder.resourceInfoList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceInfoList
     */
    public java.util.List < ResourceInfoList> getResourceInfoList() {
        return this.resourceInfoList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceInfoList> resourceInfoList; 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resourceInfoList.
         */
        public Builder resourceInfoList(java.util.List < ResourceInfoList> resourceInfoList) {
            this.resourceInfoList = resourceInfoList;
            return this;
        }

        public SelectResourceResponseBody build() {
            return new SelectResourceResponseBody(this);
        } 

    } 

    public static class ResourceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("expireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("lastExpire")
        private Integer lastExpire;

        @com.aliyun.core.annotation.NameInMap("remainCount")
        private Integer remainCount;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private Integer resourceType;

        @com.aliyun.core.annotation.NameInMap("unit")
        private String unit;

        private ResourceInfoList(Builder builder) {
            this.expireTime = builder.expireTime;
            this.lastExpire = builder.lastExpire;
            this.remainCount = builder.remainCount;
            this.resourceType = builder.resourceType;
            this.unit = builder.unit;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInfoList create() {
            return builder().build();
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return lastExpire
         */
        public Integer getLastExpire() {
            return this.lastExpire;
        }

        /**
         * @return remainCount
         */
        public Integer getRemainCount() {
            return this.remainCount;
        }

        /**
         * @return resourceType
         */
        public Integer getResourceType() {
            return this.resourceType;
        }

        /**
         * @return unit
         */
        public String getUnit() {
            return this.unit;
        }

        public static final class Builder {
            private String expireTime; 
            private Integer lastExpire; 
            private Integer remainCount; 
            private Integer resourceType; 
            private String unit; 

            /**
             * expireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * lastExpire.
             */
            public Builder lastExpire(Integer lastExpire) {
                this.lastExpire = lastExpire;
                return this;
            }

            /**
             * remainCount.
             */
            public Builder remainCount(Integer remainCount) {
                this.remainCount = remainCount;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(Integer resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * unit.
             */
            public Builder unit(String unit) {
                this.unit = unit;
                return this;
            }

            public ResourceInfoList build() {
                return new ResourceInfoList(this);
            } 

        } 

    }
}
