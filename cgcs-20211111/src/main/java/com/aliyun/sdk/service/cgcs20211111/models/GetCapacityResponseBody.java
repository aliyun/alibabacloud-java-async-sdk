// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cgcs20211111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCapacityResponseBody} extends {@link TeaModel}
 *
 * <p>GetCapacityResponseBody</p>
 */
public class GetCapacityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Capacities")
    private java.util.List < Capacities> capacities;

    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private GetCapacityResponseBody(Builder builder) {
        this.capacities = builder.capacities;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCapacityResponseBody create() {
        return builder().build();
    }

    /**
     * @return capacities
     */
    public java.util.List < Capacities> getCapacities() {
        return this.capacities;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
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
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List < Capacities> capacities; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String requestId; 
        private Integer total; 

        /**
         * Capacities.
         */
        public Builder capacities(java.util.List < Capacities> capacities) {
            this.capacities = capacities;
            return this;
        }

        /**
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * Total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public GetCapacityResponseBody build() {
            return new GetCapacityResponseBody(this);
        } 

    } 

    public static class Capacities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppVersion")
        private String appVersion;

        @com.aliyun.core.annotation.NameInMap("DistrictId")
        private String districtId;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("SessionCapacity")
        private Integer sessionCapacity;

        private Capacities(Builder builder) {
            this.appId = builder.appId;
            this.appVersion = builder.appVersion;
            this.districtId = builder.districtId;
            this.projectId = builder.projectId;
            this.sessionCapacity = builder.sessionCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Capacities create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appVersion
         */
        public String getAppVersion() {
            return this.appVersion;
        }

        /**
         * @return districtId
         */
        public String getDistrictId() {
            return this.districtId;
        }

        /**
         * @return projectId
         */
        public String getProjectId() {
            return this.projectId;
        }

        /**
         * @return sessionCapacity
         */
        public Integer getSessionCapacity() {
            return this.sessionCapacity;
        }

        public static final class Builder {
            private String appId; 
            private String appVersion; 
            private String districtId; 
            private String projectId; 
            private Integer sessionCapacity; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppVersion.
             */
            public Builder appVersion(String appVersion) {
                this.appVersion = appVersion;
                return this;
            }

            /**
             * DistrictId.
             */
            public Builder districtId(String districtId) {
                this.districtId = districtId;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * SessionCapacity.
             */
            public Builder sessionCapacity(Integer sessionCapacity) {
                this.sessionCapacity = sessionCapacity;
                return this;
            }

            public Capacities build() {
                return new Capacities(this);
            } 

        } 

    }
}
