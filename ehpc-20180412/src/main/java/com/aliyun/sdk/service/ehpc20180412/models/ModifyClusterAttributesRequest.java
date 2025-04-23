// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ModifyClusterAttributesRequest} extends {@link RequestModel}
 *
 * <p>ModifyClusterAttributesRequest</p>
 */
public class ModifyClusterAttributesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamNodeTypes")
    private java.util.List<String> ramNodeTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    private String ramRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WinAdPar")
    private WinAdPar winAdPar;

    private ModifyClusterAttributesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.description = builder.description;
        this.imageId = builder.imageId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
        this.name = builder.name;
        this.ramNodeTypes = builder.ramNodeTypes;
        this.ramRoleName = builder.ramRoleName;
        this.winAdPar = builder.winAdPar;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyClusterAttributesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return ramNodeTypes
     */
    public java.util.List<String> getRamNodeTypes() {
        return this.ramNodeTypes;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return winAdPar
     */
    public WinAdPar getWinAdPar() {
        return this.winAdPar;
    }

    public static final class Builder extends Request.Builder<ModifyClusterAttributesRequest, Builder> {
        private String clusterId; 
        private String description; 
        private String imageId; 
        private String imageOwnerAlias; 
        private String name; 
        private java.util.List<String> ramNodeTypes; 
        private String ramRoleName; 
        private WinAdPar winAdPar; 

        private Builder() {
            super();
        } 

        private Builder(ModifyClusterAttributesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.description = request.description;
            this.imageId = request.imageId;
            this.imageOwnerAlias = request.imageOwnerAlias;
            this.name = request.name;
            this.ramNodeTypes = request.ramNodeTypes;
            this.ramRoleName = request.ramRoleName;
            this.winAdPar = request.winAdPar;
        } 

        /**
         * <p>The ID of the cluster that you want to modify.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ehpc-hz-FYUr32****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The new cluster description.</p>
         * 
         * <strong>example:</strong>
         * <p>test-description</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The IDs of the images.</p>
         * 
         * <strong>example:</strong>
         * <p>centos_7_06_64_20G_alibase_2019071****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The new image type of the cluster. Valid values:</p>
         * <ul>
         * <li>system: public image</li>
         * <li>self: custom image</li>
         * <li>others: shared image</li>
         * <li>marketplace: Alibaba Cloud Marketplace image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>self</p>
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        /**
         * <p>The new cluster name.</p>
         * 
         * <strong>example:</strong>
         * <p>cluster1</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The type of the node to which you want to bind the RAM role.</p>
         */
        public Builder ramNodeTypes(java.util.List<String> ramNodeTypes) {
            this.putQueryParameter("RamNodeTypes", ramNodeTypes);
            this.ramNodeTypes = ramNodeTypes;
            return this;
        }

        /**
         * <p>The name of the instance RAM role.</p>
         * 
         * <strong>example:</strong>
         * <p>testRamRoleName</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The parameters that are used to connect to the Windows AD server.</p>
         */
        public Builder winAdPar(WinAdPar winAdPar) {
            this.putQueryParameter("WinAdPar", winAdPar);
            this.winAdPar = winAdPar;
            return this;
        }

        @Override
        public ModifyClusterAttributesRequest build() {
            return new ModifyClusterAttributesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyClusterAttributesRequest} extends {@link TeaModel}
     *
     * <p>ModifyClusterAttributesRequest</p>
     */
    public static class WinAdPar extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AdDc")
        private String adDc;

        @com.aliyun.core.annotation.NameInMap("AdIp")
        private String adIp;

        @com.aliyun.core.annotation.NameInMap("AdUser")
        private String adUser;

        @com.aliyun.core.annotation.NameInMap("AdUserPasswd")
        private String adUserPasswd;

        @com.aliyun.core.annotation.NameInMap("FallbackHomeDir")
        private String fallbackHomeDir;

        private WinAdPar(Builder builder) {
            this.adDc = builder.adDc;
            this.adIp = builder.adIp;
            this.adUser = builder.adUser;
            this.adUserPasswd = builder.adUserPasswd;
            this.fallbackHomeDir = builder.fallbackHomeDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WinAdPar create() {
            return builder().build();
        }

        /**
         * @return adDc
         */
        public String getAdDc() {
            return this.adDc;
        }

        /**
         * @return adIp
         */
        public String getAdIp() {
            return this.adIp;
        }

        /**
         * @return adUser
         */
        public String getAdUser() {
            return this.adUser;
        }

        /**
         * @return adUserPasswd
         */
        public String getAdUserPasswd() {
            return this.adUserPasswd;
        }

        /**
         * @return fallbackHomeDir
         */
        public String getFallbackHomeDir() {
            return this.fallbackHomeDir;
        }

        public static final class Builder {
            private String adDc; 
            private String adIp; 
            private String adUser; 
            private String adUserPasswd; 
            private String fallbackHomeDir; 

            private Builder() {
            } 

            private Builder(WinAdPar model) {
                this.adDc = model.adDc;
                this.adIp = model.adIp;
                this.adUser = model.adUser;
                this.adUserPasswd = model.adUserPasswd;
                this.fallbackHomeDir = model.fallbackHomeDir;
            } 

            /**
             * <p>The domain name of the Windows AD server.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpcad.com</p>
             */
            public Builder adDc(String adDc) {
                this.adDc = adDc;
                return this;
            }

            /**
             * <p>The IP address of the Windows AD server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.1.2</p>
             */
            public Builder adIp(String adIp) {
                this.adIp = adIp;
                return this;
            }

            /**
             * <p>The Windows AD server administrator.</p>
             * 
             * <strong>example:</strong>
             * <p>administrator</p>
             */
            public Builder adUser(String adUser) {
                this.adUser = adUser;
                return this;
            }

            /**
             * <p>The administrator password of the Windows AD server.</p>
             * 
             * <strong>example:</strong>
             * <p>xxxxxxx</p>
             */
            public Builder adUserPasswd(String adUserPasswd) {
                this.adUserPasswd = adUserPasswd;
                return this;
            }

            /**
             * <p>The home directory of the Linux server.</p>
             * 
             * <strong>example:</strong>
             * <p>/home</p>
             */
            public Builder fallbackHomeDir(String fallbackHomeDir) {
                this.fallbackHomeDir = fallbackHomeDir;
                return this;
            }

            public WinAdPar build() {
                return new WinAdPar(this);
            } 

        } 

    }
}
