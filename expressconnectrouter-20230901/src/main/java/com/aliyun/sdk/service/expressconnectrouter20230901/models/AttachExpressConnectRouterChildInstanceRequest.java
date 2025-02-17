// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.expressconnectrouter20230901.models;

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
 * {@link AttachExpressConnectRouterChildInstanceRequest} extends {@link RequestModel}
 *
 * <p>AttachExpressConnectRouterChildInstanceRequest</p>
 */
public class AttachExpressConnectRouterChildInstanceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChildInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChildInstanceOwnerId")
    private Long childInstanceOwnerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChildInstanceRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ChildInstanceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String childInstanceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecrId;

    private AttachExpressConnectRouterChildInstanceRequest(Builder builder) {
        super(builder);
        this.childInstanceId = builder.childInstanceId;
        this.childInstanceOwnerId = builder.childInstanceOwnerId;
        this.childInstanceRegionId = builder.childInstanceRegionId;
        this.childInstanceType = builder.childInstanceType;
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachExpressConnectRouterChildInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return childInstanceId
     */
    public String getChildInstanceId() {
        return this.childInstanceId;
    }

    /**
     * @return childInstanceOwnerId
     */
    public Long getChildInstanceOwnerId() {
        return this.childInstanceOwnerId;
    }

    /**
     * @return childInstanceRegionId
     */
    public String getChildInstanceRegionId() {
        return this.childInstanceRegionId;
    }

    /**
     * @return childInstanceType
     */
    public String getChildInstanceType() {
        return this.childInstanceType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return ecrId
     */
    public String getEcrId() {
        return this.ecrId;
    }

    public static final class Builder extends Request.Builder<AttachExpressConnectRouterChildInstanceRequest, Builder> {
        private String childInstanceId; 
        private Long childInstanceOwnerId; 
        private String childInstanceRegionId; 
        private String childInstanceType; 
        private String clientToken; 
        private String description; 
        private Boolean dryRun; 
        private String ecrId; 

        private Builder() {
            super();
        } 

        private Builder(AttachExpressConnectRouterChildInstanceRequest request) {
            super(request);
            this.childInstanceId = request.childInstanceId;
            this.childInstanceOwnerId = request.childInstanceOwnerId;
            this.childInstanceRegionId = request.childInstanceRegionId;
            this.childInstanceType = request.childInstanceType;
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
        } 

        /**
         * <p>The VBR ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>vbr-j6cwxhgg0s5nuephp****</p>
         */
        public Builder childInstanceId(String childInstanceId) {
            this.putBodyParameter("ChildInstanceId", childInstanceId);
            this.childInstanceId = childInstanceId;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the VBR belongs.</p>
         * <blockquote>
         * <p> If you want to connect to a network instance that belongs to a different account, this parameter is required.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>190550144868****</p>
         */
        public Builder childInstanceOwnerId(Long childInstanceOwnerId) {
            this.putBodyParameter("ChildInstanceOwnerId", childInstanceOwnerId);
            this.childInstanceOwnerId = childInstanceOwnerId;
            return this;
        }

        /**
         * <p>The region ID of the VBR.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder childInstanceRegionId(String childInstanceRegionId) {
            this.putBodyParameter("ChildInstanceRegionId", childInstanceRegionId);
            this.childInstanceRegionId = childInstanceRegionId;
            return this;
        }

        /**
         * <p>The type of the network instance. Set the value to <strong>VBR</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>VBR</p>
         */
        public Builder childInstanceType(String childInstanceType) {
            this.putBodyParameter("ChildInstanceType", childInstanceType);
            this.childInstanceType = childInstanceType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>02fb3da4-130e-11e9-8e44-00****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run.</li>
         * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putBodyParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ECR ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecr-a5xqrgbeidz1w8****</p>
         */
        public Builder ecrId(String ecrId) {
            this.putBodyParameter("EcrId", ecrId);
            this.ecrId = ecrId;
            return this;
        }

        @Override
        public AttachExpressConnectRouterChildInstanceRequest build() {
            return new AttachExpressConnectRouterChildInstanceRequest(this);
        } 

    } 

}
