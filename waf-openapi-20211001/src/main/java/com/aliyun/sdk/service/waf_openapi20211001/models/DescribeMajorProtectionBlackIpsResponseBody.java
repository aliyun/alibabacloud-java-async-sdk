// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMajorProtectionBlackIpsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMajorProtectionBlackIpsResponseBody</p>
 */
public class DescribeMajorProtectionBlackIpsResponseBody extends TeaModel {
    @NameInMap("IpList")
    private java.util.List < IpList> ipList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
         * An array of IP addresses in the IP address blacklist.
         */
        public Builder ipList(java.util.List < IpList> ipList) {
            this.ipList = ipList;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of IP addresses in the blacklist.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeMajorProtectionBlackIpsResponseBody build() {
            return new DescribeMajorProtectionBlackIpsResponseBody(this);
        } 

    } 

    public static class IpList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("ExpiredTime")
        private Long expiredTime;

        @NameInMap("GmtModified")
        private Long gmtModified;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("RuleId")
        private Long ruleId;

        @NameInMap("TemplateId")
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
             * The description of the IP address in the blacklist.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The time after which the IP address blacklist becomes invalid. Unit: seconds.
             * <p>
             * 
             * >  If the value of this parameter is **0**, the blacklist is permanently valid.
             */
            public Builder expiredTime(Long expiredTime) {
                this.expiredTime = expiredTime;
                return this;
            }

            /**
             * The most recent time when the IP address blacklist was modified.
             */
            public Builder gmtModified(Long gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The IP address in the IP address blacklist.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * The ID of the IP address blacklist rule for major event protection.
             */
            public Builder ruleId(Long ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * The ID of the rule template for major event protection.
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
