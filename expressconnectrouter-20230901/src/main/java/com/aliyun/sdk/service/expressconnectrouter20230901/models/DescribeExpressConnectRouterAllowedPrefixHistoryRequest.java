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
 * {@link DescribeExpressConnectRouterAllowedPrefixHistoryRequest} extends {@link RequestModel}
 *
 * <p>DescribeExpressConnectRouterAllowedPrefixHistoryRequest</p>
 */
public class DescribeExpressConnectRouterAllowedPrefixHistoryRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssociationId")
    private String associationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EcrId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ecrId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceType")
    private String instanceType;

    private DescribeExpressConnectRouterAllowedPrefixHistoryRequest(Builder builder) {
        super(builder);
        this.associationId = builder.associationId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ecrId = builder.ecrId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressConnectRouterAllowedPrefixHistoryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associationId
     */
    public String getAssociationId() {
        return this.associationId;
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
     * @return ecrId
     */
    public String getEcrId() {
        return this.ecrId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    public static final class Builder extends Request.Builder<DescribeExpressConnectRouterAllowedPrefixHistoryRequest, Builder> {
        private String associationId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String ecrId; 
        private String instanceId; 
        private String instanceType; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExpressConnectRouterAllowedPrefixHistoryRequest request) {
            super(request);
            this.associationId = request.associationId;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ecrId = request.ecrId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
        } 

        /**
         * <p>The ID of the association between the ECR and the virtual private cloud (VPC) or transit router (TR).</p>
         * <blockquote>
         * <p> You must specify either <strong>InstanceId</strong> or <strong>AssociationId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecr-assoc-9p2qxx5phpca2m****</p>
         */
        public Builder associationId(String associationId) {
            this.putBodyParameter("AssociationId", associationId);
            this.associationId = associationId;
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
         * <p>FF9nMec/RZ6H9oqFn1pvyir/SLRlxCCyHJonbGzqL01hiM6Jb3wJowdHvjCfog7ww1b9rSHMRFJnrUBfVba68TJg==</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * <p>ecr-mezk2idmsd0vx2****</p>
         */
        public Builder ecrId(String ecrId) {
            this.putBodyParameter("EcrId", ecrId);
            this.ecrId = ecrId;
            return this;
        }

        /**
         * <p>The ID of the network instance that is associated with the ECR.</p>
         * <blockquote>
         * <p> You must specify either <strong>InstanceId</strong> or <strong>AssociationId</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>vbr-j6cwxhgg0s5nuephp****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The type of the network instance. Valid values:</p>
         * <ul>
         * <li><strong>VPC</strong></li>
         * <li><strong>TR</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        @Override
        public DescribeExpressConnectRouterAllowedPrefixHistoryRequest build() {
            return new DescribeExpressConnectRouterAllowedPrefixHistoryRequest(this);
        } 

    } 

}
