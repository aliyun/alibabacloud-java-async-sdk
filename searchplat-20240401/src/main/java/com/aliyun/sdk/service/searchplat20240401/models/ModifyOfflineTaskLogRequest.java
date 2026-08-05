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
 * {@link ModifyOfflineTaskLogRequest} extends {@link RequestModel}
 *
 * <p>ModifyOfflineTaskLogRequest</p>
 */
public class ModifyOfflineTaskLogRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("workspaceName")
    private String workspaceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("taskName")
    private String taskName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("network")
    private Network network;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regionId")
    private String regionId;

    private ModifyOfflineTaskLogRequest(Builder builder) {
        super(builder);
        this.workspaceName = builder.workspaceName;
        this.type = builder.type;
        this.taskName = builder.taskName;
        this.network = builder.network;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyOfflineTaskLogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return taskName
     */
    public String getTaskName() {
        return this.taskName;
    }

    /**
     * @return network
     */
    public Network getNetwork() {
        return this.network;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyOfflineTaskLogRequest, Builder> {
        private String workspaceName; 
        private String type; 
        private String taskName; 
        private Network network; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyOfflineTaskLogRequest request) {
            super(request);
            this.workspaceName = request.workspaceName;
            this.type = request.type;
            this.taskName = request.taskName;
            this.network = request.network;
            this.regionId = request.regionId;
        } 

        /**
         * workspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putPathParameter("workspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putPathParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * taskName.
         */
        public Builder taskName(String taskName) {
            this.putPathParameter("taskName", taskName);
            this.taskName = taskName;
            return this;
        }

        /**
         * network.
         */
        public Builder network(Network network) {
            this.putBodyParameter("network", network);
            this.network = network;
            return this;
        }

        /**
         * regionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("regionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyOfflineTaskLogRequest build() {
            return new ModifyOfflineTaskLogRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyOfflineTaskLogRequest} extends {@link TeaModel}
     *
     * <p>ModifyOfflineTaskLogRequest</p>
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
     * {@link ModifyOfflineTaskLogRequest} extends {@link TeaModel}
     *
     * <p>ModifyOfflineTaskLogRequest</p>
     */
    public static class PrivateEs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("whiteIpGroup")
        private java.util.List<WhiteIpGroup> whiteIpGroup;

        private PrivateEs(Builder builder) {
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
            private Boolean enabled; 
            private java.util.List<WhiteIpGroup> whiteIpGroup; 

            private Builder() {
            } 

            private Builder(PrivateEs model) {
                this.enabled = model.enabled;
                this.whiteIpGroup = model.whiteIpGroup;
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
     * {@link ModifyOfflineTaskLogRequest} extends {@link TeaModel}
     *
     * <p>ModifyOfflineTaskLogRequest</p>
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

            public PublicEsWhiteIpGroup build() {
                return new PublicEsWhiteIpGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyOfflineTaskLogRequest} extends {@link TeaModel}
     *
     * <p>ModifyOfflineTaskLogRequest</p>
     */
    public static class PublicEs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("whiteIpGroup")
        private java.util.List<PublicEsWhiteIpGroup> whiteIpGroup;

        private PublicEs(Builder builder) {
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
            private Boolean enabled; 
            private java.util.List<PublicEsWhiteIpGroup> whiteIpGroup; 

            private Builder() {
            } 

            private Builder(PublicEs model) {
                this.enabled = model.enabled;
                this.whiteIpGroup = model.whiteIpGroup;
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
     * {@link ModifyOfflineTaskLogRequest} extends {@link TeaModel}
     *
     * <p>ModifyOfflineTaskLogRequest</p>
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
             * publicEs.
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
}
