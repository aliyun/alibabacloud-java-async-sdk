// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link CreateCloudConnectNetworkResponseBody} extends {@link TeaModel}
 *
 * <p>CreateCloudConnectNetworkResponseBody</p>
 */
public class CreateCloudConnectNetworkResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CcnId")
    private String ccnId;

    @com.aliyun.core.annotation.NameInMap("CidrBlock")
    private String cidrBlock;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("SnatCidrBlock")
    private String snatCidrBlock;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    private CreateCloudConnectNetworkResponseBody(Builder builder) {
        this.ccnId = builder.ccnId;
        this.cidrBlock = builder.cidrBlock;
        this.description = builder.description;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.resourceGroupId = builder.resourceGroupId;
        this.snatCidrBlock = builder.snatCidrBlock;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCloudConnectNetworkResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ccnId
     */
    public String getCcnId() {
        return this.ccnId;
    }

    /**
     * @return cidrBlock
     */
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return snatCidrBlock
     */
    public String getSnatCidrBlock() {
        return this.snatCidrBlock;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String ccnId; 
        private String cidrBlock; 
        private String description; 
        private String name; 
        private String requestId; 
        private String resourceGroupId; 
        private String snatCidrBlock; 
        private String status; 

        private Builder() {
        } 

        private Builder(CreateCloudConnectNetworkResponseBody model) {
            this.ccnId = model.ccnId;
            this.cidrBlock = model.cidrBlock;
            this.description = model.description;
            this.name = model.name;
            this.requestId = model.requestId;
            this.resourceGroupId = model.resourceGroupId;
            this.snatCidrBlock = model.snatCidrBlock;
            this.status = model.status;
        } 

        /**
         * <p>The ID of the CCN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ccn-l9340rlu5ens*****</p>
         */
        public Builder ccnId(String ccnId) {
            this.ccnId = ccnId;
            return this;
        }

        /**
         * <p>The private CIDR block.</p>
         * 
         * <strong>example:</strong>
         * <p>172.XX.XX.0/24</p>
         */
        public Builder cidrBlock(String cidrBlock) {
            this.cidrBlock = cidrBlock;
            return this;
        }

        /**
         * <p>The description about the CCN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ccndesc</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the CCN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ccnname</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C48E8EB2-37A4-495B-A95C-29CA1FD26C82</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the resource group to which the CCN instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfm2iu4fnc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The private CIDR block used for SNAT.</p>
         * 
         * <strong>example:</strong>
         * <p>172.XX.XX.0/25</p>
         */
        public Builder snatCidrBlock(String snatCidrBlock) {
            this.snatCidrBlock = snatCidrBlock;
            return this;
        }

        /**
         * <p>The status of the CCN instance. Valid values:</p>
         * <ul>
         * <li><strong>Active</strong>: indicates the CNN instance running as expected.</li>
         * <li><strong>Pending</strong>: indicates the CCN instance is to be created.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public CreateCloudConnectNetworkResponseBody build() {
            return new CreateCloudConnectNetworkResponseBody(this);
        } 

    } 

}
