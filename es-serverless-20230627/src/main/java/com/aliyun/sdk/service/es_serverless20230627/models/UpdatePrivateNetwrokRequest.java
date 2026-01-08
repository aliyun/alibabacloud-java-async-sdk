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
 * {@link UpdatePrivateNetwrokRequest} extends {@link RequestModel}
 *
 * <p>UpdatePrivateNetwrokRequest</p>
 */
public class UpdatePrivateNetwrokRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    private java.util.List<UpdatePrivateNetwrokRequestBody> body;

    private UpdatePrivateNetwrokRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePrivateNetwrokRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return body
     */
    public java.util.List<UpdatePrivateNetwrokRequestBody> getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdatePrivateNetwrokRequest, Builder> {
        private String appName; 
        private java.util.List<UpdatePrivateNetwrokRequestBody> body; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePrivateNetwrokRequest request) {
            super(request);
            this.appName = request.appName;
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder appName(String appName) {
            this.putPathParameter("appName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * body.
         */
        public Builder body(java.util.List<UpdatePrivateNetwrokRequestBody> body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdatePrivateNetwrokRequest build() {
            return new UpdatePrivateNetwrokRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePrivateNetwrokRequest} extends {@link TeaModel}
     *
     * <p>UpdatePrivateNetwrokRequest</p>
     */
    public static class WhiteIpGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("groupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("ips")
        private java.util.List<String> ips;

        @com.aliyun.core.annotation.NameInMap("modifyMode")
        private String modifyMode;

        private WhiteIpGroup(Builder builder) {
            this.groupName = builder.groupName;
            this.ips = builder.ips;
            this.modifyMode = builder.modifyMode;
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

        /**
         * @return modifyMode
         */
        public String getModifyMode() {
            return this.modifyMode;
        }

        public static final class Builder {
            private String groupName; 
            private java.util.List<String> ips; 
            private String modifyMode; 

            private Builder() {
            } 

            private Builder(WhiteIpGroup model) {
                this.groupName = model.groupName;
                this.ips = model.ips;
                this.modifyMode = model.modifyMode;
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

            /**
             * modifyMode.
             */
            public Builder modifyMode(String modifyMode) {
                this.modifyMode = modifyMode;
                return this;
            }

            public WhiteIpGroup build() {
                return new WhiteIpGroup(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePrivateNetwrokRequest} extends {@link TeaModel}
     *
     * <p>UpdatePrivateNetwrokRequest</p>
     */
    public static class UpdatePrivateNetwrokRequestBody extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("pvlEndpointId")
        private String pvlEndpointId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("vpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("whiteIpGroup")
        private java.util.List<WhiteIpGroup> whiteIpGroup;

        private UpdatePrivateNetwrokRequestBody(Builder builder) {
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

        public static UpdatePrivateNetwrokRequestBody create() {
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
         * @return port
         */
        public Integer getPort() {
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
            private Boolean enabled; 
            private Integer port; 
            private String pvlEndpointId; 
            private String type; 
            private String vpcId; 
            private java.util.List<WhiteIpGroup> whiteIpGroup; 

            private Builder() {
            } 

            private Builder(UpdatePrivateNetwrokRequestBody model) {
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
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
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

            public UpdatePrivateNetwrokRequestBody build() {
                return new UpdatePrivateNetwrokRequestBody(this);
            } 

        } 

    }
}
