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
 * {@link UpdatePostPaidBindRelRequest} extends {@link RequestModel}
 *
 * <p>UpdatePostPaidBindRelRequest</p>
 */
public class UpdatePostPaidBindRelRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoBind")
    private Integer autoBind;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoBindVersion")
    private Integer autoBindVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BindAction")
    private java.util.List<BindAction> bindAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateIfNecessary")
    private Boolean updateIfNecessary;

    private UpdatePostPaidBindRelRequest(Builder builder) {
        super(builder);
        this.autoBind = builder.autoBind;
        this.autoBindVersion = builder.autoBindVersion;
        this.bindAction = builder.bindAction;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.productCode = builder.productCode;
        this.updateIfNecessary = builder.updateIfNecessary;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePostPaidBindRelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoBind
     */
    public Integer getAutoBind() {
        return this.autoBind;
    }

    /**
     * @return autoBindVersion
     */
    public Integer getAutoBindVersion() {
        return this.autoBindVersion;
    }

    /**
     * @return bindAction
     */
    public java.util.List<BindAction> getBindAction() {
        return this.bindAction;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return updateIfNecessary
     */
    public Boolean getUpdateIfNecessary() {
        return this.updateIfNecessary;
    }

    public static final class Builder extends Request.Builder<UpdatePostPaidBindRelRequest, Builder> {
        private Integer autoBind; 
        private Integer autoBindVersion; 
        private java.util.List<BindAction> bindAction; 
        private String clientToken; 
        private Boolean dryRun; 
        private String productCode; 
        private Boolean updateIfNecessary; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePostPaidBindRelRequest request) {
            super(request);
            this.autoBind = request.autoBind;
            this.autoBindVersion = request.autoBindVersion;
            this.bindAction = request.bindAction;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.productCode = request.productCode;
            this.updateIfNecessary = request.updateIfNecessary;
        } 

        /**
         * <p>Specifies whether to automatically bind new assets. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Disabled.</li>
         * <li><strong>1</strong>: Enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoBind(Integer autoBind) {
            this.putQueryParameter("AutoBind", autoBind);
            this.autoBind = autoBind;
            return this;
        }

        /**
         * <p>The edition to automatically bind when new assets are added. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Free Edition </li>
         * <li><strong>3</strong>: Enterprise Edition</li>
         * <li><strong>5</strong>: Advanced Edition</li>
         * <li><strong>6</strong>: Anti-virus Edition    </li>
         * <li><strong>7</strong>: Ultimate Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder autoBindVersion(Integer autoBindVersion) {
            this.putQueryParameter("AutoBindVersion", autoBindVersion);
            this.autoBindVersion = autoBindVersion;
            return this;
        }

        /**
         * <p>The binding action parameter.</p>
         */
        public Builder bindAction(java.util.List<BindAction> bindAction) {
            this.putQueryParameter("BindAction", bindAction);
            this.bindAction = bindAction;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Different requests should use different tokens. The token supports only ASCII characters and cannot exceed 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>是否只预检此次请求。true：仅检查请求，不执行实际操作；false：正常执行请求。默认值为 false。</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The abbreviated name of the cloud service. Valid values:</p>
         * <ul>
         * <li><strong>sas</strong>: Security Center</li>
         * </ul>
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>Specifies whether to forcibly upgrade the edition.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder updateIfNecessary(Boolean updateIfNecessary) {
            this.putQueryParameter("UpdateIfNecessary", updateIfNecessary);
            this.updateIfNecessary = updateIfNecessary;
            return this;
        }

        @Override
        public UpdatePostPaidBindRelRequest build() {
            return new UpdatePostPaidBindRelRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePostPaidBindRelRequest} extends {@link TeaModel}
     *
     * <p>UpdatePostPaidBindRelRequest</p>
     */
    public static class BindAction extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BindAll")
        private Boolean bindAll;

        @com.aliyun.core.annotation.NameInMap("FreeType")
        private String freeType;

        @com.aliyun.core.annotation.NameInMap("UuidList")
        private java.util.List<String> uuidList;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private BindAction(Builder builder) {
            this.bindAll = builder.bindAll;
            this.freeType = builder.freeType;
            this.uuidList = builder.uuidList;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BindAction create() {
            return builder().build();
        }

        /**
         * @return bindAll
         */
        public Boolean getBindAll() {
            return this.bindAll;
        }

        /**
         * @return freeType
         */
        public String getFreeType() {
            return this.freeType;
        }

        /**
         * @return uuidList
         */
        public java.util.List<String> getUuidList() {
            return this.uuidList;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean bindAll; 
            private String freeType; 
            private java.util.List<String> uuidList; 
            private String version; 

            private Builder() {
            } 

            private Builder(BindAction model) {
                this.bindAll = model.bindAll;
                this.freeType = model.freeType;
                this.uuidList = model.uuidList;
                this.version = model.version;
            } 

            /**
             * <p>Specifies whether to bind all servers. Default value: <strong>false</strong>. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: Bind all servers.</li>
             * <li><strong>false</strong>: Do not bind all servers.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder bindAll(Boolean bindAll) {
                this.bindAll = bindAll;
                return this;
            }

            /**
             * <p>The free quota type.</p>
             */
            public Builder freeType(String freeType) {
                this.freeType = freeType;
                return this;
            }

            /**
             * <p>The list of server UUIDs.</p>
             */
            public Builder uuidList(java.util.List<String> uuidList) {
                this.uuidList = uuidList;
                return this;
            }

            /**
             * <p>The protection edition of Security Center to bind. Valid values:  </p>
             * <ul>
             * <li><strong>1</strong>: Free Edition </li>
             * <li><strong>3</strong>: Enterprise Edition</li>
             * <li><strong>5</strong>: Advanced Edition</li>
             * <li><strong>6</strong>: Anti-virus Edition    </li>
             * <li><strong>7</strong>: Ultimate Edition</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public BindAction build() {
                return new BindAction(this);
            } 

        } 

    }
}
