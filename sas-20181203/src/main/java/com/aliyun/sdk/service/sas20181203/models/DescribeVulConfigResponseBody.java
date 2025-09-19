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
 * {@link DescribeVulConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVulConfigResponseBody</p>
 */
public class DescribeVulConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TargetConfigs")
    private java.util.List<TargetConfigs> targetConfigs;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeVulConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.targetConfigs = builder.targetConfigs;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVulConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return targetConfigs
     */
    public java.util.List<TargetConfigs> getTargetConfigs() {
        return this.targetConfigs;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<TargetConfigs> targetConfigs; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeVulConfigResponseBody model) {
            this.requestId = model.requestId;
            this.targetConfigs = model.targetConfigs;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>24A20733-10A0-4AF6-BE6B-E3322413BB68</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array that consists of the configurations of vulnerability management.</p>
         */
        public Builder targetConfigs(java.util.List<TargetConfigs> targetConfigs) {
            this.targetConfigs = targetConfigs;
            return this;
        }

        /**
         * <p>The total number of configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeVulConfigResponseBody build() {
            return new DescribeVulConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVulConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVulConfigResponseBody</p>
     */
    public static class TargetConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("OverAllConfig")
        private String overAllConfig;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private TargetConfigs(Builder builder) {
            this.config = builder.config;
            this.overAllConfig = builder.overAllConfig;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TargetConfigs create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return overAllConfig
         */
        public String getOverAllConfig() {
            return this.overAllConfig;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String config; 
            private String overAllConfig; 
            private String type; 

            private Builder() {
            } 

            private Builder(TargetConfigs model) {
                this.config = model.config;
                this.overAllConfig = model.overAllConfig;
                this.type = model.type;
            } 

            /**
             * <p>The configuration of vulnerability scan.</p>
             * <blockquote>
             * <p>Valid values when you set the Type parameter to <strong>cve</strong>, <strong>sys</strong>, <strong>cms</strong>, <strong>app</strong>, <strong>emg</strong>, or <strong>yum</strong>:</p>
             * </blockquote>
             * <ul>
             * <li><p><strong>on</strong>: enabled</p>
             * </li>
             * <li><p><strong>off</strong>: disabled</p>
             * </li>
             * </ul>
             * <p>Valid values when you set the Type parameter to <strong>scanMode</strong>:</p>
             * <ul>
             * <li><p><strong>real</strong>: displays easily exploitable vulnerability.</p>
             * </li>
             * <li><p><strong>all</strong>: displays all vulnerabilities.</p>
             * </li>
             * </ul>
             * <p>When you set the Type parameter to <strong>imageVulClean</strong>, the value of this parameter indicates the vulnerability retention period in days.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>Indicates whether the vulnerability management feature is enabled for all servers. Valid values:</p>
             * <ul>
             * <li><strong>off</strong>: disabled</li>
             * <li><strong>on</strong>: enabled</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>on</p>
             */
            public Builder overAllConfig(String overAllConfig) {
                this.overAllConfig = overAllConfig;
                return this;
            }

            /**
             * <p>The type of configuration. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: Linux software vulnerability.</li>
             * <li><strong>sys</strong>: Windows system vulnerability.</li>
             * <li><strong>cms</strong>: Web-CMS vulnerability.</li>
             * <li><strong>app</strong>: application vulnerability that is detected by using web scanner.</li>
             * <li><strong>emg</strong>: urgent vulnerability.</li>
             * <li><strong>scanMode</strong>: displays easily exploitable vulnerability.</li>
             * <li><strong>imageVulClean</strong>: vulnerability retention duration.</li>
             * <li><strong>yum</strong>: preferentially uses YUM or APT sources of Alibaba Cloud to fix vulnerabilities.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public TargetConfigs build() {
                return new TargetConfigs(this);
            } 

        } 

    }
}
