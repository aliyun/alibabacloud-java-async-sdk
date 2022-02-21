// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProductRequest} extends {@link RequestModel}
 *
 * <p>CreateProductRequest</p>
 */
public class CreateProductRequest extends Request {
    @Query
    @NameInMap("AliyunCommodityCode")
    private String aliyunCommodityCode;

    @Query
    @NameInMap("AuthType")
    private String authType;

    @Query
    @NameInMap("CategoryKey")
    private String categoryKey;

    @Query
    @NameInMap("DataFormat")
    private Integer dataFormat;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("Id2")
    private Boolean id2;

    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("JoinPermissionId")
    private String joinPermissionId;

    @Query
    @NameInMap("NetType")
    private String netType;

    @Query
    @NameInMap("NodeType")
    @Validation(required = true)
    private Integer nodeType;

    @Query
    @NameInMap("ProductName")
    @Validation(required = true)
    private String productName;

    @Query
    @NameInMap("ProtocolType")
    private String protocolType;

    @Query
    @NameInMap("PublishAuto")
    private Boolean publishAuto;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("ValidateType")
    private Integer validateType;

    private CreateProductRequest(Builder builder) {
        super(builder);
        this.aliyunCommodityCode = builder.aliyunCommodityCode;
        this.authType = builder.authType;
        this.categoryKey = builder.categoryKey;
        this.dataFormat = builder.dataFormat;
        this.description = builder.description;
        this.id2 = builder.id2;
        this.iotInstanceId = builder.iotInstanceId;
        this.joinPermissionId = builder.joinPermissionId;
        this.netType = builder.netType;
        this.nodeType = builder.nodeType;
        this.productName = builder.productName;
        this.protocolType = builder.protocolType;
        this.publishAuto = builder.publishAuto;
        this.resourceGroupId = builder.resourceGroupId;
        this.validateType = builder.validateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProductRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aliyunCommodityCode
     */
    public String getAliyunCommodityCode() {
        return this.aliyunCommodityCode;
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return categoryKey
     */
    public String getCategoryKey() {
        return this.categoryKey;
    }

    /**
     * @return dataFormat
     */
    public Integer getDataFormat() {
        return this.dataFormat;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return id2
     */
    public Boolean getId2() {
        return this.id2;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return joinPermissionId
     */
    public String getJoinPermissionId() {
        return this.joinPermissionId;
    }

    /**
     * @return netType
     */
    public String getNetType() {
        return this.netType;
    }

    /**
     * @return nodeType
     */
    public Integer getNodeType() {
        return this.nodeType;
    }

    /**
     * @return productName
     */
    public String getProductName() {
        return this.productName;
    }

    /**
     * @return protocolType
     */
    public String getProtocolType() {
        return this.protocolType;
    }

    /**
     * @return publishAuto
     */
    public Boolean getPublishAuto() {
        return this.publishAuto;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return validateType
     */
    public Integer getValidateType() {
        return this.validateType;
    }

    public static final class Builder extends Request.Builder<CreateProductRequest, Builder> {
        private String aliyunCommodityCode; 
        private String authType; 
        private String categoryKey; 
        private Integer dataFormat; 
        private String description; 
        private Boolean id2; 
        private String iotInstanceId; 
        private String joinPermissionId; 
        private String netType; 
        private Integer nodeType; 
        private String productName; 
        private String protocolType; 
        private Boolean publishAuto; 
        private String resourceGroupId; 
        private Integer validateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateProductRequest response) {
            super(response);
            this.aliyunCommodityCode = response.aliyunCommodityCode;
            this.authType = response.authType;
            this.categoryKey = response.categoryKey;
            this.dataFormat = response.dataFormat;
            this.description = response.description;
            this.id2 = response.id2;
            this.iotInstanceId = response.iotInstanceId;
            this.joinPermissionId = response.joinPermissionId;
            this.netType = response.netType;
            this.nodeType = response.nodeType;
            this.productName = response.productName;
            this.protocolType = response.protocolType;
            this.publishAuto = response.publishAuto;
            this.resourceGroupId = response.resourceGroupId;
            this.validateType = response.validateType;
        } 

        /**
         * AliyunCommodityCode.
         */
        public Builder aliyunCommodityCode(String aliyunCommodityCode) {
            this.putQueryParameter("AliyunCommodityCode", aliyunCommodityCode);
            this.aliyunCommodityCode = aliyunCommodityCode;
            return this;
        }

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * CategoryKey.
         */
        public Builder categoryKey(String categoryKey) {
            this.putQueryParameter("CategoryKey", categoryKey);
            this.categoryKey = categoryKey;
            return this;
        }

        /**
         * DataFormat.
         */
        public Builder dataFormat(Integer dataFormat) {
            this.putQueryParameter("DataFormat", dataFormat);
            this.dataFormat = dataFormat;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Id2.
         */
        public Builder id2(Boolean id2) {
            this.putQueryParameter("Id2", id2);
            this.id2 = id2;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * JoinPermissionId.
         */
        public Builder joinPermissionId(String joinPermissionId) {
            this.putQueryParameter("JoinPermissionId", joinPermissionId);
            this.joinPermissionId = joinPermissionId;
            return this;
        }

        /**
         * NetType.
         */
        public Builder netType(String netType) {
            this.putQueryParameter("NetType", netType);
            this.netType = netType;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(Integer nodeType) {
            this.putQueryParameter("NodeType", nodeType);
            this.nodeType = nodeType;
            return this;
        }

        /**
         * ProductName.
         */
        public Builder productName(String productName) {
            this.putQueryParameter("ProductName", productName);
            this.productName = productName;
            return this;
        }

        /**
         * ProtocolType.
         */
        public Builder protocolType(String protocolType) {
            this.putQueryParameter("ProtocolType", protocolType);
            this.protocolType = protocolType;
            return this;
        }

        /**
         * PublishAuto.
         */
        public Builder publishAuto(Boolean publishAuto) {
            this.putQueryParameter("PublishAuto", publishAuto);
            this.publishAuto = publishAuto;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * ValidateType.
         */
        public Builder validateType(Integer validateType) {
            this.putQueryParameter("ValidateType", validateType);
            this.validateType = validateType;
            return this;
        }

        @Override
        public CreateProductRequest build() {
            return new CreateProductRequest(this);
        } 

    } 

}
