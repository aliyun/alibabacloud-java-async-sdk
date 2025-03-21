// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeDomainSecureVulListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDomainSecureVulListResponseBody</p>
 */
public class DescribeDomainSecureVulListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("VulList")
    private java.util.List<VulList> vulList;

    private DescribeDomainSecureVulListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.vulList = builder.vulList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDomainSecureVulListResponseBody create() {
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
     * @return vulList
     */
    public java.util.List<VulList> getVulList() {
        return this.vulList;
    }

    public static final class Builder {
        private String requestId; 
        private Integer totalCount; 
        private java.util.List<VulList> vulList; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7532B7EE-7CE7-5F4D-BF04-B12447DD****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of vulnerabilities returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The domain name-related vulnerabilities.</p>
         */
        public Builder vulList(java.util.List<VulList> vulList) {
            this.vulList = vulList;
            return this;
        }

        public DescribeDomainSecureVulListResponseBody build() {
            return new DescribeDomainSecureVulListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDomainSecureVulListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDomainSecureVulListResponseBody</p>
     */
    public static class VulList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("AsapCount")
        private Integer asapCount;

        @com.aliyun.core.annotation.NameInMap("GmtLast")
        private Long gmtLast;

        @com.aliyun.core.annotation.NameInMap("HandledCount")
        private Integer handledCount;

        @com.aliyun.core.annotation.NameInMap("LaterCount")
        private Integer laterCount;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NntfCount")
        private Integer nntfCount;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private String tags;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private VulList(Builder builder) {
            this.aliasName = builder.aliasName;
            this.asapCount = builder.asapCount;
            this.gmtLast = builder.gmtLast;
            this.handledCount = builder.handledCount;
            this.laterCount = builder.laterCount;
            this.name = builder.name;
            this.nntfCount = builder.nntfCount;
            this.tags = builder.tags;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulList create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return asapCount
         */
        public Integer getAsapCount() {
            return this.asapCount;
        }

        /**
         * @return gmtLast
         */
        public Long getGmtLast() {
            return this.gmtLast;
        }

        /**
         * @return handledCount
         */
        public Integer getHandledCount() {
            return this.handledCount;
        }

        /**
         * @return laterCount
         */
        public Integer getLaterCount() {
            return this.laterCount;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nntfCount
         */
        public Integer getNntfCount() {
            return this.nntfCount;
        }

        /**
         * @return tags
         */
        public String getTags() {
            return this.tags;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String aliasName; 
            private Integer asapCount; 
            private Long gmtLast; 
            private Integer handledCount; 
            private Integer laterCount; 
            private String name; 
            private Integer nntfCount; 
            private String tags; 
            private String type; 

            /**
             * <p>The alias of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>CESA-2023:3555: python Security Update</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The number of the vulnerabilities that have the <strong>high</strong> priority.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder asapCount(Integer asapCount) {
                this.asapCount = asapCount;
                return this;
            }

            /**
             * <p>The timestamp when the vulnerability was last detected. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1639371446000</p>
             */
            public Builder gmtLast(Long gmtLast) {
                this.gmtLast = gmtLast;
                return this;
            }

            /**
             * <p>The number of handled vulnerabilities.</p>
             * 
             * <strong>example:</strong>
             * <p>33</p>
             */
            public Builder handledCount(Integer handledCount) {
                this.handledCount = handledCount;
                return this;
            }

            /**
             * <p>The number of the vulnerabilities that have the <strong>medium</strong> priority.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder laterCount(Integer laterCount) {
                this.laterCount = laterCount;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>oval:com.redhat.rhsa:def:20170574</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of the vulnerabilities that have the <strong>low</strong> priority.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder nntfCount(Integer nntfCount) {
                this.nntfCount = nntfCount;
                return this;
            }

            /**
             * <p>The tag that is added to the vulnerability. Valid values:</p>
             * <ul>
             * <li>Restart required</li>
             * <li>Remote utilization</li>
             * <li>EXP exists</li>
             * <li>Available</li>
             * <li>Elevation of Privilege</li>
             * <li>Code Execution</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Code Execution</p>
             */
            public Builder tags(String tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The type of the vulnerability. Default value: cve. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: Linux software vulnerability.</li>
             * <li><strong>sys</strong>: Windows system vulnerability.</li>
             * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
             * <li><strong>app</strong>: application vulnerability that is detected by network scanning.</li>
             * <li><strong>sca</strong>: application vulnerability that is detected by using software component analysis.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>app</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public VulList build() {
                return new VulList(this);
            } 

        } 

    }
}
