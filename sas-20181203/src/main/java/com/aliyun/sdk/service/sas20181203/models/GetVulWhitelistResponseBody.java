// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVulWhitelistResponseBody} extends {@link TeaModel}
 *
 * <p>GetVulWhitelistResponseBody</p>
 */
public class GetVulWhitelistResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VulWhitelist")
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
         * The ID of the request, which is used to locate and troubleshoot issues.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information about the whitelist.
         */
        public Builder vulWhitelist(VulWhitelist vulWhitelist) {
            this.vulWhitelist = vulWhitelist;
            return this;
        }

        public GetVulWhitelistResponseBody build() {
            return new GetVulWhitelistResponseBody(this);
        } 

    } 

    public static class VulWhitelist extends TeaModel {
        @NameInMap("AliasName")
        private String aliasName;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("Target")
        private String target;

        @NameInMap("Type")
        private String type;

        @NameInMap("Whitelist")
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
             * The alias of the vulnerability.
             */
            public Builder aliasName(String aliasName) {
                this.aliasName = aliasName;
                return this;
            }

            /**
             * The ID of the whitelist.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The name of the vulnerability.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The reason why the vulnerability is added to the whitelist.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The application scope of the rule. The value is a JSON string that contains the following fields:
             * <p>
             * 
             * *   **type**: the type of the assets to which the rule is applied. Valid values:
             * 
             *     *   **Uuid**: server
             *     *   **GroupId**: server group
             * 
             * *   **groupIds**: the IDs of server groups.
             * 
             * *   **uuids**: the UUIDs of servers.
             * 
             * >  If this parameter is empty, the rule is applied to all assets.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The type of the vulnerability.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The information about the vulnerability that is added to the whitelist. The value is a JSON string that contains the following fields:
             * <p>
             * 
             * *   **Name**: the name of the vulnerability.
             * 
             * *   **Type**: the type of the vulnerability. Valid values:
             * 
             *     *   **cve**: Linux software vulnerability
             *     *   **sys**: Windows system vulnerability
             *     *   **cms**: Web-CMS vulnerability
             *     *   **app**: application vulnerability
             *     *   **emg**: urgent vulnerability
             * 
             * *   **AliasName**: the alias of the vulnerability.
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
