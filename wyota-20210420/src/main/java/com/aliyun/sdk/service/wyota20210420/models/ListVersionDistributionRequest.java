// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.wyota20210420.models;

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
 * {@link ListVersionDistributionRequest} extends {@link RequestModel}
 *
 * <p>ListVersionDistributionRequest</p>
 */
public class ListVersionDistributionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer clientType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InManage")
    private Boolean inManage;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MainBizType")
    private String mainBizType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    @com.aliyun.core.annotation.Validation(required = true)
    private String model;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionType;

    private ListVersionDistributionRequest(Builder builder) {
        super(builder);
        this.clientType = builder.clientType;
        this.inManage = builder.inManage;
        this.mainBizType = builder.mainBizType;
        this.model = builder.model;
        this.versionType = builder.versionType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVersionDistributionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientType
     */
    public Integer getClientType() {
        return this.clientType;
    }

    /**
     * @return inManage
     */
    public Boolean getInManage() {
        return this.inManage;
    }

    /**
     * @return mainBizType
     */
    public String getMainBizType() {
        return this.mainBizType;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return versionType
     */
    public String getVersionType() {
        return this.versionType;
    }

    public static final class Builder extends Request.Builder<ListVersionDistributionRequest, Builder> {
        private Integer clientType; 
        private Boolean inManage; 
        private String mainBizType; 
        private String model; 
        private String versionType; 

        private Builder() {
            super();
        } 

        private Builder(ListVersionDistributionRequest request) {
            super(request);
            this.clientType = request.clientType;
            this.inManage = request.inManage;
            this.mainBizType = request.mainBizType;
            this.model = request.model;
            this.versionType = request.versionType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder clientType(Integer clientType) {
            this.putBodyParameter("ClientType", clientType);
            this.clientType = clientType;
            return this;
        }

        /**
         * InManage.
         */
        public Builder inManage(Boolean inManage) {
            this.putBodyParameter("InManage", inManage);
            this.inManage = inManage;
            return this;
        }

        /**
         * MainBizType.
         */
        public Builder mainBizType(String mainBizType) {
            this.putBodyParameter("MainBizType", mainBizType);
            this.mainBizType = mainBizType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>AS05-2DCXG</p>
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SYS</p>
         */
        public Builder versionType(String versionType) {
            this.putBodyParameter("VersionType", versionType);
            this.versionType = versionType;
            return this;
        }

        @Override
        public ListVersionDistributionRequest build() {
            return new ListVersionDistributionRequest(this);
        } 

    } 

}
