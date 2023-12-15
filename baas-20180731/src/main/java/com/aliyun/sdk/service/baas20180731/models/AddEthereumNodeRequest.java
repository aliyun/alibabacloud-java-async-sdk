// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddEthereumNodeRequest} extends {@link RequestModel}
 *
 * <p>AddEthereumNodeRequest</p>
 */
public class AddEthereumNodeRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("EthereumId")
    @Validation(required = true)
    private String ethereumId;

    @Body
    @NameInMap("ExternalNode")
    private Boolean externalNode;

    @Body
    @NameInMap("NodeName")
    private String nodeName;

    private AddEthereumNodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.ethereumId = builder.ethereumId;
        this.externalNode = builder.externalNode;
        this.nodeName = builder.nodeName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddEthereumNodeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ethereumId
     */
    public String getEthereumId() {
        return this.ethereumId;
    }

    /**
     * @return externalNode
     */
    public Boolean getExternalNode() {
        return this.externalNode;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    public static final class Builder extends Request.Builder<AddEthereumNodeRequest, Builder> {
        private String regionId; 
        private String description; 
        private String ethereumId; 
        private Boolean externalNode; 
        private String nodeName; 

        private Builder() {
            super();
        } 

        private Builder(AddEthereumNodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.ethereumId = request.ethereumId;
            this.externalNode = request.externalNode;
            this.nodeName = request.nodeName;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EthereumId.
         */
        public Builder ethereumId(String ethereumId) {
            this.putBodyParameter("EthereumId", ethereumId);
            this.ethereumId = ethereumId;
            return this;
        }

        /**
         * ExternalNode.
         */
        public Builder externalNode(Boolean externalNode) {
            this.putBodyParameter("ExternalNode", externalNode);
            this.externalNode = externalNode;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.putBodyParameter("NodeName", nodeName);
            this.nodeName = nodeName;
            return this;
        }

        @Override
        public AddEthereumNodeRequest build() {
            return new AddEthereumNodeRequest(this);
        } 

    } 

}
