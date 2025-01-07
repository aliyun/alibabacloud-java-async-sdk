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
 * {@link GetVulWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>GetVulWhitelistResponseBody</p>
 */
public class GetVulWhitelistResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("VulWhitelist")
    private VulWhitelist vulWhitelist;

    private GetVulWhitelistResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vulWhitelist = builder.vulWhitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVulWhitelistResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vulWhitelist
     */
    public VulWhitelist getVulWhitelist() {
        return this.vulWhitelist;
    }

    public static final class Builder {
        private String requestId; 
        private VulWhitelist vulWhitelist; 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>09969D2C-4FAD-429E-BFBF-9A60DEF8BF6F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the whitelist.</p>
         */
        public Builder vulWhitelist(VulWhitelist vulWhitelist) {
            this.vulWhitelist = vulWhitelist;
            return this;
        }

        public GetVulWhitelistResponseBody build() {
            return new GetVulWhitelistResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVulWhitelistResponseBody} extends {@link TeaModel}
     *
     * <p>GetVulWhitelistResponseBody</p>
     */
    public static class VulWhitelist extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliasName")
        private String aliasName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("Target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Whitelist")
        private String whitelist;

        private VulWhitelist(Builder builder) {
            this.aliasName = builder.aliasName;
            this.id = builder.id;
            this.name = builder.name;
            this.reason = builder.reason;
            this.target = builder.target;
            this.type = builder.type;
            this.whitelist = builder.whitelist;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VulWhitelist create() {
            return builder().build();
        }

        /**
         * @return aliasName
         */
        public String getAliasName() {
            return this.aliasName;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return whitelist
         */
        public String getWhitelist() {
            return this.whitelist;
        }

        public static final class Builder {
            private String aliasName; 
            private Long id; 
            private String name; 
            private String reason; 
            private String target; 
            private String type; 
            private String whitelist; 

            /**
             * <p>The alias of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>RHSA-2017:3263: curl security update</p>
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * <p>The ID of the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>1275</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>oval:com.redhat.rhsa:def:20173263</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The reason why the vulnerability is added to the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>Ignore</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The application scope of the rule. The value is a JSON string that contains the following fields:</p>
             * <ul>
             * <li><p><strong>type</strong>: the type of the assets to which the rule is applied. Valid values:</p>
             * <ul>
             * <li><strong>Uuid</strong>: server</li>
             * <li><strong>GroupId</strong>: server group</li>
             * </ul>
             * </li>
             * <li><p><strong>groupIds</strong>: the ID of the server group</p>
             * </li>
             * <li><p><strong>uuids</strong>: the UUID of the server</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>If this parameter is empty, the rule is applied to all types of assets.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{
             *       &quot;type&quot;: &quot;GroupId&quot;,
             *       &quot;uuids&quot;: [],
             *       &quot;groupIds&quot;: [
             *             10782678
             *       ]
             * }</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The type of the vulnerability.</p>
             * 
             * <strong>example:</strong>
             * <p>cve</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The information about the vulnerability that is added to the whitelist. The value is a JSON string that contains the following fields:</p>
             * <ul>
             * <li><p><strong>Name</strong>: the name of the vulnerability.</p>
             * </li>
             * <li><p><strong>Type</strong>: the type of the vulnerability. Valid values:</p>
             * <ul>
             * <li><strong>cve</strong>: Linux software vulnerability</li>
             * <li><strong>sys</strong>: Windows system vulnerability</li>
             * <li><strong>cms</strong>: Web-CMS vulnerability</li>
             * <li><strong>app</strong>: application vulnerability</li>
             * <li><strong>emg</strong>: urgent vulnerabilities</li>
             * </ul>
             * </li>
             * <li><p><strong>AliasName</strong>: the alias of the vulnerability.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[
             *       {
             *             &quot;Name&quot;: &quot;oval:com.redhat.rhsa:def:20173263&quot;,
             *             &quot;Type&quot;: &quot;cve&quot;,
             *             &quot;AliasName&quot;: &quot;RHSA-2017:3263: curl security update&quot;
             *       }
             * ]</p>
             */
            public Builder whitelist(String whitelist) {
                this.whitelist = whitelist;
                return this;
            }

            public VulWhitelist build() {
                return new VulWhitelist(this);
            } 

        } 

    }
}
