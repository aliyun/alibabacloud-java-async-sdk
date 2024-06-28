// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePopApiVersionListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePopApiVersionListResponseBody</p>
 */
public class DescribePopApiVersionListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PopCode")
    private String popCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    @com.aliyun.core.annotation.NameInMap("VersionList")
    private java.util.List < VersionList> versionList;

    private DescribePopApiVersionListResponseBody(Builder builder) {
        this.popCode = builder.popCode;
        this.requestId = builder.requestId;
        this.total = builder.total;
        this.versionList = builder.versionList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePopApiVersionListResponseBody create() {
        return builder().build();
    }

    /**
     * @return popCode
     */
    public String getPopCode() {
        return this.popCode;
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

    /**
     * @return versionList
     */
    public java.util.List < VersionList> getVersionList() {
        return this.versionList;
    }

    public static final class Builder {
        private String popCode; 
        private String requestId; 
        private Integer total; 
        private java.util.List < VersionList> versionList; 

        /**
         * The POP code of the Alibaba Cloud service.
         */
        public Builder popCode(String popCode) {
            this.popCode = popCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        /**
         * The information about the versions of API operations.
         */
        public Builder versionList(java.util.List < VersionList> versionList) {
            this.versionList = versionList;
            return this;
        }

        public DescribePopApiVersionListResponseBody build() {
            return new DescribePopApiVersionListResponseBody(this);
        } 

    } 

    public static class VersionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("PopCode")
        private String popCode;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private VersionList(Builder builder) {
            this.apiName = builder.apiName;
            this.popCode = builder.popCode;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionList create() {
            return builder().build();
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return popCode
         */
        public String getPopCode() {
            return this.popCode;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String apiName; 
            private String popCode; 
            private String version; 

            /**
             * The name of the API operation.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * The POP code of the Alibaba Cloud service.
             */
            public Builder popCode(String popCode) {
                this.popCode = popCode;
                return this;
            }

            /**
             * The version number of the API for the Alibaba Cloud service.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public VersionList build() {
                return new VersionList(this);
            } 

        } 

    }
}
