// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDcdnDomainsBySourceResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDcdnDomainsBySourceResponseBody</p>
 */
public class DescribeDcdnDomainsBySourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DomainInfo")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < DomainInfo> domainInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeDcdnDomainsBySourceResponseBody(Builder builder) {
        this.domainInfo = builder.domainInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDcdnDomainsBySourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return domainInfo
     */
    public java.util.List < DomainInfo> getDomainInfo() {
        return this.domainInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DomainInfo> domainInfo; 
        private String requestId; 

        /**
         * The information about each origin server and the corresponding domain names.
         */
        public Builder domainInfo(java.util.List < DomainInfo> domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainsBySourceResponseBody build() {
            return new DescribeDcdnDomainsBySourceResponseBody(this);
        } 

    } 

    public static class DomainList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DomainCname")
        private String domainCname;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("DomainType")
        private String domainType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private DomainList(Builder builder) {
            this.createTime = builder.createTime;
            this.domainCname = builder.domainCname;
            this.domainName = builder.domainName;
            this.domainType = builder.domainType;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return domainCname
         */
        public String getDomainCname() {
            return this.domainCname;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return domainType
         */
        public String getDomainType() {
            return this.domainType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String createTime; 
            private String domainCname; 
            private String domainName; 
            private String domainType; 
            private String status; 
            private String updateTime; 

            /**
             * The creation time.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The CNAME record assigned to the domain name.
             */
            public Builder domainCname(String domainCname) {
                this.domainCname = domainCname;
                return this;
            }

            /**
             * The accelerated domain name.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * The workload type of the accelerated domain name. Valid value:
             * <p>
             * 
             * *   **ipa**: layer 4 acceleration
             * *   **dynamic**: layer 7 acceleration
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * The status of the domain name. Valid value:
             * <p>
             * 
             * *   **applying**: The domain name is under review.
             * *   **configuring**: The domain name is being configured.
             * *   **online**: The domain name is working as expected.
             * *   **stopping**: The domain name is being stopped.
             * *   **offline**: The domain name is disabled.
             * *   **disabling**: The domain name is being removed.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The time when the domain name was updated.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public DomainList build() {
                return new DomainList(this);
            } 

        } 

    }
    public static class DomainInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DomainList")
        private java.util.List < DomainList> domainList;

        @com.aliyun.core.annotation.NameInMap("Source")
        private String source;

        private DomainInfo(Builder builder) {
            this.domainList = builder.domainList;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DomainInfo create() {
            return builder().build();
        }

        /**
         * @return domainList
         */
        public java.util.List < DomainList> getDomainList() {
            return this.domainList;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private java.util.List < DomainList> domainList; 
            private String source; 

            /**
             * The information about the domain names.
             */
            public Builder domainList(java.util.List < DomainList> domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * The origin server.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public DomainInfo build() {
                return new DomainInfo(this);
            } 

        } 

    }
}
