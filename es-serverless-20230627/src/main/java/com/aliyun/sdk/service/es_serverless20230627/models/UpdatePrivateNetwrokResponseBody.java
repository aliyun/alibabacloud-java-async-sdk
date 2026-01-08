// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20230627.models;

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
 * {@link UpdatePrivateNetwrokResponseBody} extends {@link TeaModel}
 *
 * <p>UpdatePrivateNetwrokResponseBody</p>
 */
public class UpdatePrivateNetwrokResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private java.util.List<Result> result;

    private UpdatePrivateNetwrokResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivateNetwrokResponseBody create() {
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
     * @return result
     */
    public java.util.List<Result> getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Result> result; 

        private Builder() {
        } 

        private Builder(UpdatePrivateNetwrokResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2C5DAA30-****-5181-9B87-9D6181016197</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(java.util.List<Result> result) {
            this.result = result;
            return this;
        }

        public UpdatePrivateNetwrokResponseBody build() {
            return new UpdatePrivateNetwrokResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePrivateNetwrokResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePrivateNetwrokResponseBody</p>
     */
    public static class WhiteIpGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ips")
        private java.util.List<String> ips;

        private WhiteIpGroup(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WhiteIpGroup create() {
            return builder().build();
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return ips
         */
        public java.util.List<String> getIps() {
            return this.ips;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List<String> ips; 

            private Builder() {
            } 

            private Builder(WhiteIpGroup model) {
                this.groupName = model.groupName;
                this.ips = model.ips;
            } 

            /**
             * groupName.
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * ips.
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            public WhiteIpGroup build() {
                return new WhiteIpGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePrivateNetwrokResponseBody} extends {@link TeaModel}
     *
     * <p>UpdatePrivateNetwrokResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private String enabled;

        @com.aliyun.core.annotation.NameInMap("port")
        private String port;

        @com.aliyun.core.annotation.NameInMap("pvlEndpointId")
        private String pvlEndpointId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("whiteIpGroup")
        private java.util.List<WhiteIpGroup> whiteIpGroup;

        private Result(Builder builder) {
            this.domain = builder.domain;
            this.enabled = builder.enabled;
            this.port = builder.port;
            this.pvlEndpointId = builder.pvlEndpointId;
            this.type = builder.type;
            this.vpcId = builder.vpcId;
            this.whiteIpGroup = builder.whiteIpGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return port
         */
        public String getPort() {
            return this.port;
        }

        /**
         * @return pvlEndpointId
         */
        public String getPvlEndpointId() {
            return this.pvlEndpointId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return whiteIpGroup
         */
        public java.util.List<WhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

        public static final class Builder {
            private String domain; 
            private String enabled; 
            private String port; 
            private String pvlEndpointId; 
            private String type; 
            private String vpcId; 
            private java.util.List<WhiteIpGroup> whiteIpGroup; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.domain = model.domain;
                this.enabled = model.enabled;
                this.port = model.port;
                this.pvlEndpointId = model.pvlEndpointId;
                this.type = model.type;
                this.vpcId = model.vpcId;
                this.whiteIpGroup = model.whiteIpGroup;
            } 

            /**
             * domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * enabled.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * port.
             */
            public Builder port(String port) {
                this.port = port;
                return this;
            }

            /**
             * pvlEndpointId.
             */
            public Builder pvlEndpointId(String pvlEndpointId) {
                this.pvlEndpointId = pvlEndpointId;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * vpcId.
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * whiteIpGroup.
             */
            public Builder whiteIpGroup(java.util.List<WhiteIpGroup> whiteIpGroup) {
                this.whiteIpGroup = whiteIpGroup;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
