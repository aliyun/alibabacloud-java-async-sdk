// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeMajorProtectionBlackIpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMajorProtectionBlackIpsResponseBody</p>
 */
public class DescribeMajorProtectionBlackIpsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IpList")
    private java.util.List < IpList> ipList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeMajorProtectionBlackIpsResponseBody(Builder builder) {
        this.ipList = builder.ipList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMajorProtectionBlackIpsResponseBody create() {
        return builder().build();
    }

    /**
     * @return ipList
     */
    public java.util.List < IpList> getIpList() {
        return this.ipList;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < IpList> ipList; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>An array of IP addresses in the IP address blacklist.</p>
         */
        public Builder ipList(java.util.List < IpList> ipList) {
            this.ipList = ipList;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>41631674-EEB0-5B02-BEB4-40A758E9B841</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of IP addresses in the blacklist.</p>
         * 
         * <strong>example:</strong>
         * <p>63</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMajorProtectionBlackIpsResponseBody build() {
            return new DescribeMajorProtectionBlackIpsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMajorProtectionBlackIpsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMajorProtectionBlackIpsResponseBody</p>
     */
    public static class IpList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("ExpiredTime")
        private Long expiredTime;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private Long gmtModified;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Long ruleId;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private Long templateId;

        private IpList(Builder builder) {
            this.description = builder.description;
            this.expiredTime = builder.expiredTime;
            this.gmtModified = builder.gmtModified;
            this.ip = builder.ip;
            this.ruleId = builder.ruleId;
            this.templateId = builder.templateId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IpList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return expiredTime
         */
        public Long getExpiredTime() {
            return this.expiredTime;
        }

        /**
         * @return gmtModified
         */
        public Long getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return ruleId
         */
        public Long getRuleId() {
            return this.ruleId;
        }

        /**
         * @return templateId
         */
        public Long getTemplateId() {
            return this.templateId;
        }

        public static final class Builder {
            private String description; 
            private Long expiredTime; 
            private Long gmtModified; 
            private String ip; 
            private Long ruleId; 
            private Long templateId; 

            /**
             * <p>The description of the IP address in the blacklist.</p>
             * 
             * <strong>example:</strong>
             * <p>test0003asdffas</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The time after which the IP address blacklist becomes invalid. Unit: seconds.</p>
             * <blockquote>
             * <p> If the value of this parameter is <strong>0</strong>, the blacklist is permanently valid.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>1662603328</p>
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * <p>The most recent time when the IP address blacklist was modified.</p>
             * 
             * <strong>example:</strong>
             * <p>1665456202000</p>
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The IP address in the IP address blacklist.</p>
             * 
             * <strong>example:</strong>
             * <p>192.0.XX.XX</p>
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * <p>The ID of the IP address blacklist rule for major event protection.</p>
             * 
             * <strong>example:</strong>
             * <p>8508970</p>
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * <p>The ID of the rule template for major event protection.</p>
             * 
             * <strong>example:</strong>
             * <p>9684</p>
             */
            public Builder templateId(Long templateId) {
                this.templateId = templateId;
                return this;
            }

            public IpList build() {
                return new IpList(this);
            } 

        } 

    }
}
