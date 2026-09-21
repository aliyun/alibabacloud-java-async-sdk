// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ModifyWuyingServerAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyWuyingServerAttributeRequest</p>
 */
public class ModifyWuyingServerAttributeRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ErdmaEnabled")
    private Boolean erdmaEnabled;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Password")
    private String password;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductType")
    private String productType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerId")
    private String wuyingServerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WuyingServerName")
    private String wuyingServerName;

    private ModifyWuyingServerAttributeRequest(Builder builder) {
        super(builder);
        this.erdmaEnabled = builder.erdmaEnabled;
        this.password = builder.password;
        this.productType = builder.productType;
        this.wuyingServerId = builder.wuyingServerId;
        this.wuyingServerName = builder.wuyingServerName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyWuyingServerAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return erdmaEnabled
     */
    public Boolean getErdmaEnabled() {
        return this.erdmaEnabled;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return this.password;
    }

    /**
     * @return productType
     */
    public String getProductType() {
        return this.productType;
    }

    /**
     * @return wuyingServerId
     */
    public String getWuyingServerId() {
        return this.wuyingServerId;
    }

    /**
     * @return wuyingServerName
     */
    public String getWuyingServerName() {
        return this.wuyingServerName;
    }

    public static final class Builder extends Request.Builder<ModifyWuyingServerAttributeRequest, Builder> {
        private Boolean erdmaEnabled; 
        private String password; 
        private String productType; 
        private String wuyingServerId; 
        private String wuyingServerName; 

        private Builder() {
            super();
        } 

        private Builder(ModifyWuyingServerAttributeRequest request) {
            super(request);
            this.erdmaEnabled = request.erdmaEnabled;
            this.password = request.password;
            this.productType = request.productType;
            this.wuyingServerId = request.wuyingServerId;
            this.wuyingServerName = request.wuyingServerName;
        } 

        /**
         * <p>Specifies whether to enable dedicated eRDMA network interfaces. Only true is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder erdmaEnabled(Boolean erdmaEnabled) {
            this.putBodyParameter("ErdmaEnabled", erdmaEnabled);
            this.erdmaEnabled = erdmaEnabled;
            return this;
        }

        /**
         * <p>The logon password of the workstation.</p>
         * 
         * <strong>example:</strong>
         * <p>yourPassword</p>
         */
        public Builder password(String password) {
            this.putBodyParameter("Password", password);
            this.password = password;
            return this;
        }

        /**
         * <p>The product type.</p>
         * 
         * <strong>example:</strong>
         * <p>WuyingServer</p>
         */
        public Builder productType(String productType) {
            this.putBodyParameter("ProductType", productType);
            this.productType = productType;
            return this;
        }

        /**
         * <p>The workstation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ws-0bw2f11****dial</p>
         */
        public Builder wuyingServerId(String wuyingServerId) {
            this.putBodyParameter("WuyingServerId", wuyingServerId);
            this.wuyingServerId = wuyingServerId;
            return this;
        }

        /**
         * <p>The name.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleServerName</p>
         */
        public Builder wuyingServerName(String wuyingServerName) {
            this.putBodyParameter("WuyingServerName", wuyingServerName);
            this.wuyingServerName = wuyingServerName;
            return this;
        }

        @Override
        public ModifyWuyingServerAttributeRequest build() {
            return new ModifyWuyingServerAttributeRequest(this);
        } 

    } 

}
