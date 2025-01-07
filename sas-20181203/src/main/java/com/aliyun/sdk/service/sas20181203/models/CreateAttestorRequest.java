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
 * {@link CreateAttestorRequest} extends {@link RequestModel}
 *
 * <p>CreateAttestorRequest</p>
 */
public class CreateAttestorRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyId")
    private String keyId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyRegionId")
    private String keyRegionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyVersionId")
    private String keyVersionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Remark")
    private String remark;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    private CreateAttestorRequest(Builder builder) {
        super(builder);
        this.keyId = builder.keyId;
        this.keyRegionId = builder.keyRegionId;
        this.keyVersionId = builder.keyVersionId;
        this.name = builder.name;
        this.remark = builder.remark;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.sourceIp = builder.sourceIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAttestorRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyId
     */
    public String getKeyId() {
        return this.keyId;
    }

    /**
     * @return keyRegionId
     */
    public String getKeyRegionId() {
        return this.keyRegionId;
    }

    /**
     * @return keyVersionId
     */
    public String getKeyVersionId() {
        return this.keyVersionId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return this.remark;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    public static final class Builder extends Request.Builder<CreateAttestorRequest, Builder> {
        private String keyId; 
        private String keyRegionId; 
        private String keyVersionId; 
        private String name; 
        private String remark; 
        private Long resourceOwnerId; 
        private String sourceIp; 

        private Builder() {
            super();
        } 

        private Builder(CreateAttestorRequest request) {
            super(request);
            this.keyId = request.keyId;
            this.keyRegionId = request.keyRegionId;
            this.keyVersionId = request.keyVersionId;
            this.name = request.name;
            this.remark = request.remark;
            this.resourceOwnerId = request.resourceOwnerId;
            this.sourceIp = request.sourceIp;
        } 

        /**
         * <p>The ID of the KMS key.</p>
         * 
         * <strong>example:</strong>
         * <p>2e81355b-f8e7-4090-8082-a8f8124a****</p>
         */
        public Builder keyId(String keyId) {
            this.putQueryParameter("KeyId", keyId);
            this.keyId = keyId;
            return this;
        }

        /**
         * <p>The region ID of the Key Management Service (KMS) key.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder keyRegionId(String keyRegionId) {
            this.putQueryParameter("KeyRegionId", keyRegionId);
            this.keyRegionId = keyRegionId;
            return this;
        }

        /**
         * <p>The version ID of the KMS key.</p>
         * 
         * <strong>example:</strong>
         * <p>8d7c9c91-57ce-4cf4-a959-1e700e13****</p>
         */
        public Builder keyVersionId(String keyVersionId) {
            this.putQueryParameter("KeyVersionId", keyVersionId);
            this.keyVersionId = keyVersionId;
            return this;
        }

        /**
         * <p>The name of the witness.</p>
         * 
         * <strong>example:</strong>
         * <p>attestor-auto-ad5316</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>attestor</p>
         */
        public Builder remark(String remark) {
            this.putQueryParameter("Remark", remark);
            this.remark = remark;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        @Override
        public CreateAttestorRequest build() {
            return new CreateAttestorRequest(this);
        } 

    } 

}
