// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

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
 * {@link CreateSecurityIPGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateSecurityIPGroupResponseBody</p>
 */
public class CreateSecurityIPGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private CreateSecurityIPGroupResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSecurityIPGroupResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(CreateSecurityIPGroupResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The returned status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>ListResult<InstanceSSL></p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * <blockquote>
         * <p>If the request is successful, <strong>Successful</strong> is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D578DB3C-06BF-54F2-A78F-C6C25Exxxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public CreateSecurityIPGroupResponseBody build() {
            return new CreateSecurityIPGroupResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateSecurityIPGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSecurityIPGroupResponseBody</p>
     */
    public static class GlobalSecurityIPGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GIpList")
        private String gIpList;

        @com.aliyun.core.annotation.NameInMap("GlobalIgName")
        private String globalIgName;

        @com.aliyun.core.annotation.NameInMap("GlobalSecurityGroupId")
        private String globalSecurityGroupId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SecurityIpType")
        private String securityIpType;

        @com.aliyun.core.annotation.NameInMap("WhitelistNetType")
        private String whitelistNetType;

        private GlobalSecurityIPGroup(Builder builder) {
            this.gIpList = builder.gIpList;
            this.globalIgName = builder.globalIgName;
            this.globalSecurityGroupId = builder.globalSecurityGroupId;
            this.regionId = builder.regionId;
            this.securityIpType = builder.securityIpType;
            this.whitelistNetType = builder.whitelistNetType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalSecurityIPGroup create() {
            return builder().build();
        }

        /**
         * @return gIpList
         */
        public String getGIpList() {
            return this.gIpList;
        }

        /**
         * @return globalIgName
         */
        public String getGlobalIgName() {
            return this.globalIgName;
        }

        /**
         * @return globalSecurityGroupId
         */
        public String getGlobalSecurityGroupId() {
            return this.globalSecurityGroupId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return securityIpType
         */
        public String getSecurityIpType() {
            return this.securityIpType;
        }

        /**
         * @return whitelistNetType
         */
        public String getWhitelistNetType() {
            return this.whitelistNetType;
        }

        public static final class Builder {
            private String gIpList; 
            private String globalIgName; 
            private String globalSecurityGroupId; 
            private String regionId; 
            private String securityIpType; 
            private String whitelistNetType; 

            private Builder() {
            } 

            private Builder(GlobalSecurityIPGroup model) {
                this.gIpList = model.gIpList;
                this.globalIgName = model.globalIgName;
                this.globalSecurityGroupId = model.globalSecurityGroupId;
                this.regionId = model.regionId;
                this.securityIpType = model.securityIpType;
                this.whitelistNetType = model.whitelistNetType;
            } 

            /**
             * <p>The IP addresses in the whitelist template.</p>
             * <blockquote>
             * <p>Separate multiple IP addresses with commas (,). A maximum of 1000 IP addresses or CIDR blocks can be added across all IP whitelists.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/24</p>
             */
            public Builder gIpList(String gIpList) {
                this.gIpList = gIpList;
                return this;
            }

            /**
             * <p>The name of the IP whitelist template. The name must meet the following requirements:</p>
             * <ul>
             * <li><p>Contains only lowercase letters, digits, and underscores (_).</p>
             * </li>
             * <li><p>Starts with a letter and ends with a letter or digit.</p>
             * </li>
             * <li><p>Is 2 to 120 characters in length.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder globalIgName(String globalIgName) {
                this.globalIgName = globalIgName;
                return this;
            }

            /**
             * <p>The ID of the IP whitelist template.</p>
             * 
             * <strong>example:</strong>
             * <p>g-2uztsd6yvhmsqyjXXX</p>
             */
            public Builder globalSecurityGroupId(String globalSecurityGroupId) {
                this.globalSecurityGroupId = globalSecurityGroupId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * <p>Example value:
             * cn-hangzhou</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shenzhen</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The IP type.</p>
             * 
             * <strong>example:</strong>
             * <p>ipv4</p>
             */
            public Builder securityIpType(String securityIpType) {
                this.securityIpType = securityIpType;
                return this;
            }

            /**
             * <p>The network type of the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>mix</p>
             */
            public Builder whitelistNetType(String whitelistNetType) {
                this.whitelistNetType = whitelistNetType;
                return this;
            }

            public GlobalSecurityIPGroup build() {
                return new GlobalSecurityIPGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateSecurityIPGroupResponseBody} extends {@link TeaModel}
     *
     * <p>CreateSecurityIPGroupResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GlobalSecurityIPGroup")
        private java.util.List<GlobalSecurityIPGroup> globalSecurityIPGroup;

        private Data(Builder builder) {
            this.globalSecurityIPGroup = builder.globalSecurityIPGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return globalSecurityIPGroup
         */
        public java.util.List<GlobalSecurityIPGroup> getGlobalSecurityIPGroup() {
            return this.globalSecurityIPGroup;
        }

        public static final class Builder {
            private java.util.List<GlobalSecurityIPGroup> globalSecurityIPGroup; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.globalSecurityIPGroup = model.globalSecurityIPGroup;
            } 

            /**
             * <p>The cross-service whitelist template information.</p>
             */
            public Builder globalSecurityIPGroup(java.util.List<GlobalSecurityIPGroup> globalSecurityIPGroup) {
                this.globalSecurityIPGroup = globalSecurityIPGroup;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
