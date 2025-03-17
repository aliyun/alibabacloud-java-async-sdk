// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link GetMediaLiveInputSecurityGroupResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaLiveInputSecurityGroupResponseBody</p>
 */
public class GetMediaLiveInputSecurityGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityGroup")
    private SecurityGroup securityGroup;

    private GetMediaLiveInputSecurityGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityGroup = builder.securityGroup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaLiveInputSecurityGroupResponseBody create() {
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
     * @return securityGroup
     */
    public SecurityGroup getSecurityGroup() {
        return this.securityGroup;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityGroup securityGroup; 

        private Builder() {
        } 

        private Builder(GetMediaLiveInputSecurityGroupResponseBody model) {
            this.requestId = model.requestId;
            this.securityGroup = model.securityGroup;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security group information.</p>
         */
        public Builder securityGroup(SecurityGroup securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }

        public GetMediaLiveInputSecurityGroupResponseBody build() {
            return new GetMediaLiveInputSecurityGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaLiveInputSecurityGroupResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaLiveInputSecurityGroupResponseBody</p>
     */
    public static class SecurityGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("InputIds")
        private java.util.List<String> inputIds;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SecurityGroupId")
        private String securityGroupId;

        @com.aliyun.core.annotation.NameInMap("WhitelistRules")
        private java.util.List<String> whitelistRules;

        private SecurityGroup(Builder builder) {
            this.createTime = builder.createTime;
            this.inputIds = builder.inputIds;
            this.name = builder.name;
            this.securityGroupId = builder.securityGroupId;
            this.whitelistRules = builder.whitelistRules;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityGroup create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return inputIds
         */
        public java.util.List<String> getInputIds() {
            return this.inputIds;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return securityGroupId
         */
        public String getSecurityGroupId() {
            return this.securityGroupId;
        }

        /**
         * @return whitelistRules
         */
        public java.util.List<String> getWhitelistRules() {
            return this.whitelistRules;
        }

        public static final class Builder {
            private String createTime; 
            private java.util.List<String> inputIds; 
            private String name; 
            private String securityGroupId; 
            private java.util.List<String> whitelistRules; 

            private Builder() {
            } 

            private Builder(SecurityGroup model) {
                this.createTime = model.createTime;
                this.inputIds = model.inputIds;
                this.name = model.name;
                this.securityGroupId = model.securityGroupId;
                this.whitelistRules = model.whitelistRules;
            } 

            /**
             * <p>The time when the security group was created. It follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-06-13T08:31:56Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The IDs of the inputs associated with the security group.</p>
             */
            public Builder inputIds(java.util.List<String> inputIds) {
                this.inputIds = inputIds;
                return this;
            }

            /**
             * <p>The name of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>mysg</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>SEGK5KA6KYKAWQQH</p>
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * <p>The security group rules.</p>
             */
            public Builder whitelistRules(java.util.List<String> whitelistRules) {
                this.whitelistRules = whitelistRules;
                return this;
            }

            public SecurityGroup build() {
                return new SecurityGroup(this);
            } 

        } 

    }
}
