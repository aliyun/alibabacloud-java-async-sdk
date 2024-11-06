// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The information about each origin server and the corresponding domain names.</p>
         * <p>This parameter is required.</p>
         */
        public Builder domainInfo(java.util.List < DomainInfo> domainInfo) {
            this.domainInfo = domainInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>F61CDR30-E83C-4FDA-BF73-9A94CDD44229</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDcdnDomainsBySourceResponseBody build() {
            return new DescribeDcdnDomainsBySourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDcdnDomainsBySourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainsBySourceResponseBody</p>
     */
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
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-08-21T03:05:20+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The CNAME record assigned to the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.org.alikunlun.com</p>
             */
            public Builder domainCname(String domainCname) {
                this.domainCname = domainCname;
                return this;
            }

            /**
             * <p>The accelerated domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.org</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The workload type of the accelerated domain name. Valid value:</p>
             * <ul>
             * <li><strong>ipa</strong>: layer 4 acceleration</li>
             * <li><strong>dynamic</strong>: layer 7 acceleration</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dynamic</p>
             */
            public Builder domainType(String domainType) {
                this.domainType = domainType;
                return this;
            }

            /**
             * <p>The status of the domain name. Valid value:</p>
             * <ul>
             * <li><strong>applying</strong>: The domain name is under review.</li>
             * <li><strong>configuring</strong>: The domain name is being configured.</li>
             * <li><strong>online</strong>: The domain name is working as expected.</li>
             * <li><strong>stopping</strong>: The domain name is being stopped.</li>
             * <li><strong>offline</strong>: The domain name is disabled.</li>
             * <li><strong>disabling</strong>: The domain name is being removed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>online</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The time when the domain name was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-12-01T03:26:55+08:00</p>
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
    /**
     * 
     * {@link DescribeDcdnDomainsBySourceResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDcdnDomainsBySourceResponseBody</p>
     */
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
             * <p>The information about the domain names.</p>
             */
            public Builder domainList(java.util.List < DomainList> domainList) {
                this.domainList = domainList;
                return this;
            }

            /**
             * <p>The origin server.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
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
