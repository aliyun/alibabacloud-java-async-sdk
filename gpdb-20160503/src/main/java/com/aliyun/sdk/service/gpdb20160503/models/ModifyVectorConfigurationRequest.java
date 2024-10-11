// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ModifyVectorConfigurationRequest} extends {@link RequestModel}
 *
 * <p>ModifyVectorConfigurationRequest</p>
 */
public class ModifyVectorConfigurationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VectorConfigurationStatus")
    private String vectorConfigurationStatus;

    private ModifyVectorConfigurationRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.ownerId = builder.ownerId;
        this.vectorConfigurationStatus = builder.vectorConfigurationStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyVectorConfigurationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return vectorConfigurationStatus
     */
    public String getVectorConfigurationStatus() {
        return this.vectorConfigurationStatus;
    }

    public static final class Builder extends Request.Builder<ModifyVectorConfigurationRequest, Builder> {
        private String DBInstanceId; 
        private Long ownerId; 
        private String vectorConfigurationStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyVectorConfigurationRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.ownerId = request.ownerId;
            this.vectorConfigurationStatus = request.vectorConfigurationStatus;
        } 

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>Specifies whether to enable vector engine optimization. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong></li>
         * <li><strong>disabled</strong></li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>We recommend that you <strong>do not enable</strong> vector engine optimization in mainstream analysis and real-time data warehousing scenarios.</li>
         * <li>We recommend that you <strong>enable</strong> vector engine optimization in AI Generated Content (AIGC) and vector retrieval scenarios that require the vector analysis engine.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder vectorConfigurationStatus(String vectorConfigurationStatus) {
            this.putQueryParameter("VectorConfigurationStatus", vectorConfigurationStatus);
            this.vectorConfigurationStatus = vectorConfigurationStatus;
            return this;
        }

        @Override
        public ModifyVectorConfigurationRequest build() {
            return new ModifyVectorConfigurationRequest(this);
        } 

    } 

}
