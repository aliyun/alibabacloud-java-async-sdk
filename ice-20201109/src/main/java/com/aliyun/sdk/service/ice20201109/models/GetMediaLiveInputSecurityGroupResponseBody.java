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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SecurityGroup.
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

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * InputIds.
             */
            public Builder inputIds(java.util.List<String> inputIds) {
                this.inputIds = inputIds;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SecurityGroupId.
             */
            public Builder securityGroupId(String securityGroupId) {
                this.securityGroupId = securityGroupId;
                return this;
            }

            /**
             * WhitelistRules.
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
