// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchplat20240401.models;

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
 * {@link GetOfflineTaskLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetOfflineTaskLogResponseBody</p>
 */
public class GetOfflineTaskLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("result")
    private Result result;

    private GetOfflineTaskLogResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOfflineTaskLogResponseBody create() {
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
    public Result getResult() {
        return this.result;
    }

    public static final class Builder {
        private String requestId; 
        private Result result; 

        private Builder() {
        } 

        private Builder(GetOfflineTaskLogResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
        } 

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public GetOfflineTaskLogResponseBody build() {
            return new GetOfflineTaskLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetOfflineTaskLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOfflineTaskLogResponseBody</p>
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
             * <p>groupName</p>
             * 
             * <strong>example:</strong>
             * <p>kevintest</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>ips</p>
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
     * {@link GetOfflineTaskLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOfflineTaskLogResponseBody</p>
     */
    public static class PrivateEs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("whiteIpGroup")
        private java.util.List<WhiteIpGroup> whiteIpGroup;

        private PrivateEs(Builder builder) {
            this.domain = builder.domain;
            this.enabled = builder.enabled;
            this.whiteIpGroup = builder.whiteIpGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrivateEs create() {
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
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return whiteIpGroup
         */
        public java.util.List<WhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

        public static final class Builder {
            private String domain; 
            private Boolean enabled; 
            private java.util.List<WhiteIpGroup> whiteIpGroup; 

            private Builder() {
            } 

            private Builder(PrivateEs model) {
                this.domain = model.domain;
                this.enabled = model.enabled;
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
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * whiteIpGroup.
             */
            public Builder whiteIpGroup(java.util.List<WhiteIpGroup> whiteIpGroup) {
                this.whiteIpGroup = whiteIpGroup;
                return this;
            }

            public PrivateEs build() {
                return new PrivateEs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOfflineTaskLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOfflineTaskLogResponseBody</p>
     */
    public static class PublicEsWhiteIpGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ips")
        private java.util.List<String> ips;

        private PublicEsWhiteIpGroup(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicEsWhiteIpGroup create() {
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

            private Builder(PublicEsWhiteIpGroup model) {
                this.groupName = model.groupName;
                this.ips = model.ips;
            } 

            /**
             * <p>groupName</p>
             * 
             * <strong>example:</strong>
             * <p>kevintest</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>ips</p>
             */
            public Builder ips(java.util.List<String> ips) {
                this.ips = ips;
                return this;
            }

            public PublicEsWhiteIpGroup build() {
                return new PublicEsWhiteIpGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOfflineTaskLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOfflineTaskLogResponseBody</p>
     */
    public static class PublicEs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("whiteIpGroup")
        private java.util.List<PublicEsWhiteIpGroup> whiteIpGroup;

        private PublicEs(Builder builder) {
            this.domain = builder.domain;
            this.enabled = builder.enabled;
            this.whiteIpGroup = builder.whiteIpGroup;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PublicEs create() {
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
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return whiteIpGroup
         */
        public java.util.List<PublicEsWhiteIpGroup> getWhiteIpGroup() {
            return this.whiteIpGroup;
        }

        public static final class Builder {
            private String domain; 
            private Boolean enabled; 
            private java.util.List<PublicEsWhiteIpGroup> whiteIpGroup; 

            private Builder() {
            } 

            private Builder(PublicEs model) {
                this.domain = model.domain;
                this.enabled = model.enabled;
                this.whiteIpGroup = model.whiteIpGroup;
            } 

            /**
             * <p>domain</p>
             * 
             * <strong>example:</strong>
             * <p>test.public.cn-hangzhou.log.elasticsearch.aliyuncs.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>enabled</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * whiteIpGroup.
             */
            public Builder whiteIpGroup(java.util.List<PublicEsWhiteIpGroup> whiteIpGroup) {
                this.whiteIpGroup = whiteIpGroup;
                return this;
            }

            public PublicEs build() {
                return new PublicEs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOfflineTaskLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOfflineTaskLogResponseBody</p>
     */
    public static class Network extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("privateEs")
        private PrivateEs privateEs;

        @com.aliyun.core.annotation.NameInMap("publicEs")
        private PublicEs publicEs;

        private Network(Builder builder) {
            this.privateEs = builder.privateEs;
            this.publicEs = builder.publicEs;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Network create() {
            return builder().build();
        }

        /**
         * @return privateEs
         */
        public PrivateEs getPrivateEs() {
            return this.privateEs;
        }

        /**
         * @return publicEs
         */
        public PublicEs getPublicEs() {
            return this.publicEs;
        }

        public static final class Builder {
            private PrivateEs privateEs; 
            private PublicEs publicEs; 

            private Builder() {
            } 

            private Builder(Network model) {
                this.privateEs = model.privateEs;
                this.publicEs = model.publicEs;
            } 

            /**
             * privateEs.
             */
            public Builder privateEs(PrivateEs privateEs) {
                this.privateEs = privateEs;
                return this;
            }

            /**
             * <p>publicEs</p>
             */
            public Builder publicEs(PublicEs publicEs) {
                this.publicEs = publicEs;
                return this;
            }

            public Network build() {
                return new Network(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetOfflineTaskLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetOfflineTaskLogResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("network")
        private Network network;

        private Result(Builder builder) {
            this.network = builder.network;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return network
         */
        public Network getNetwork() {
            return this.network;
        }

        public static final class Builder {
            private Network network; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.network = model.network;
            } 

            /**
             * network.
             */
            public Builder network(Network network) {
                this.network = network;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
