// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link ModifyDedicatedBlockStorageClusterAttributeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDedicatedBlockStorageClusterAttributeRequest</p>
 */
public class ModifyDedicatedBlockStorageClusterAttributeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbscId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbscId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbscName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbscName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ModifyDedicatedBlockStorageClusterAttributeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dbscId = builder.dbscId;
        this.dbscName = builder.dbscName;
        this.description = builder.description;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDedicatedBlockStorageClusterAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dbscId
     */
    public String getDbscId() {
        return this.dbscId;
    }

    /**
     * @return dbscName
     */
    public String getDbscName() {
        return this.dbscName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ModifyDedicatedBlockStorageClusterAttributeRequest, Builder> {
        private String clientToken; 
        private String dbscId; 
        private String dbscName; 
        private String description; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDedicatedBlockStorageClusterAttributeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dbscId = request.dbscId;
            this.dbscName = request.dbscName;
            this.description = request.description;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests.</p>
         * <p>The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How do I ensure idempotence </a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the dedicated block storage cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dbsc-cn-od43bf****</p>
         */
        public Builder dbscId(String dbscId) {
            this.putQueryParameter("DbscId", dbscId);
            this.dbscId = dbscId;
            return this;
        }

        /**
         * <p>The new name of the dedicated block storage cluster.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>my-test-dbsc</p>
         */
        public Builder dbscName(String dbscName) {
            this.putQueryParameter("DbscName", dbscName);
            this.dbscName = dbscName;
            return this;
        }

        /**
         * <p>The new description of dedicated block storage cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The region ID of the dedicated block storage cluster. You can call the <a href="https://help.aliyun.com/document_detail/25609.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-heyuan</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ModifyDedicatedBlockStorageClusterAttributeRequest build() {
            return new ModifyDedicatedBlockStorageClusterAttributeRequest(this);
        } 

    } 

}
