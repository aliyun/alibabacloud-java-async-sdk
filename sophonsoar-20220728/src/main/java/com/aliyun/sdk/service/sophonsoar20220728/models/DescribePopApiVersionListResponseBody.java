// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePopApiVersionListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePopApiVersionListResponseBody</p>
 */
public class DescribePopApiVersionListResponseBody extends TeaModel {
    @NameInMap("PopCode")
    private String popCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Integer total;

    @NameInMap("VersionList")
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
         * PopCode.
         */
        public Builder popCode(String popCode) {
            this.popCode = popCode;
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

        /**
         * VersionList.
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
        @NameInMap("ApiName")
        private String apiName;

        @NameInMap("PopCode")
        private String popCode;

        @NameInMap("Version")
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
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * PopCode.
             */
            public Builder popCode(String popCode) {
                this.popCode = popCode;
                return this;
            }

            /**
             * Version.
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
