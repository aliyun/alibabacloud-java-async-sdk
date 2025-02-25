// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeWebsiteStatResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeWebsiteStatResponseBody</p>
 */
public class DescribeWebsiteStatResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("WebsiteStatList")
    private java.util.List < WebsiteStatList> websiteStatList;

    private DescribeWebsiteStatResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.websiteStatList = builder.websiteStatList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeWebsiteStatResponseBody create() {
        return builder().build();
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

    /**
     * @return websiteStatList
     */
    public java.util.List < WebsiteStatList> getWebsiteStatList() {
        return this.websiteStatList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List < WebsiteStatList> websiteStatList; 

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

        /**
         * WebsiteStatList.
         */
        public Builder websiteStatList(java.util.List < WebsiteStatList> websiteStatList) {
            this.websiteStatList = websiteStatList;
            return this;
        }

        public DescribeWebsiteStatResponseBody build() {
            return new DescribeWebsiteStatResponseBody(this);
        } 

    } 

    public static class WebsiteStatList extends TeaModel {
        @NameInMap("InstanceCount")
        private Integer instanceCount;

        @NameInMap("RiskCount")
        private Integer riskCount;

        @NameInMap("ScanCount")
        private Integer scanCount;

        @NameInMap("SubServiceModule")
        private String subServiceModule;

        private WebsiteStatList(Builder builder) {
            this.instanceCount = builder.instanceCount;
            this.riskCount = builder.riskCount;
            this.scanCount = builder.scanCount;
            this.subServiceModule = builder.subServiceModule;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WebsiteStatList create() {
            return builder().build();
        }

        /**
         * @return instanceCount
         */
        public Integer getInstanceCount() {
            return this.instanceCount;
        }

        /**
         * @return riskCount
         */
        public Integer getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return scanCount
         */
        public Integer getScanCount() {
            return this.scanCount;
        }

        /**
         * @return subServiceModule
         */
        public String getSubServiceModule() {
            return this.subServiceModule;
        }

        public static final class Builder {
            private Integer instanceCount; 
            private Integer riskCount; 
            private Integer scanCount; 
            private String subServiceModule; 

            /**
             * InstanceCount.
             */
            public Builder instanceCount(Integer instanceCount) {
                this.instanceCount = instanceCount;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Integer riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * ScanCount.
             */
            public Builder scanCount(Integer scanCount) {
                this.scanCount = scanCount;
                return this;
            }

            /**
             * SubServiceModule.
             */
            public Builder subServiceModule(String subServiceModule) {
                this.subServiceModule = subServiceModule;
                return this;
            }

            public WebsiteStatList build() {
                return new WebsiteStatList(this);
            } 

        } 

    }
}
