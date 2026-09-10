// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link UnbindResourceControlRequest} extends {@link RequestModel}
 *
 * <p>UnbindResourceControlRequest</p>
 */
public class UnbindResourceControlRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceControlName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceControlName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetValue;

    private UnbindResourceControlRequest(Builder builder) {
        super(builder);
        this.DBClusterId = builder.DBClusterId;
        this.regionId = builder.regionId;
        this.resourceControlName = builder.resourceControlName;
        this.targetType = builder.targetType;
        this.targetValue = builder.targetValue;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindResourceControlRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceControlName
     */
    public String getResourceControlName() {
        return this.resourceControlName;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    /**
     * @return targetValue
     */
    public String getTargetValue() {
        return this.targetValue;
    }

    public static final class Builder extends Request.Builder<UnbindResourceControlRequest, Builder> {
        private String DBClusterId; 
        private String regionId; 
        private String resourceControlName; 
        private String targetType; 
        private String targetValue; 

        private Builder() {
            super();
        } 

        private Builder(UnbindResourceControlRequest request) {
            super(request);
            this.DBClusterId = request.DBClusterId;
            this.regionId = request.regionId;
            this.resourceControlName = request.resourceControlName;
            this.targetType = request.targetType;
            this.targetValue = request.targetValue;
        } 

        /**
         * <p>The PolarDB cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-**************</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.putQueryParameter("DBClusterId", DBClusterId);
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The region ID of the PolarDB cluster.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query region IDs.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the resource control rule. The name must be 1 to 63 ASCII bytes in length, start with a letter, and can contain only letters, digits, and underscores.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_rc</p>
         */
        public Builder resourceControlName(String resourceControlName) {
            this.putQueryParameter("ResourceControlName", resourceControlName);
            this.resourceControlName = resourceControlName;
            return this;
        }

        /**
         * <p>The type of the target to unbind. Valid values: USER, DATABASE, QUERY, CONNECTION. The value is case-insensitive.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        /**
         * <p>The value of the target to unbind. The format is the same as the TargetValue for the corresponding target type in the BindResourceControl operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app_user</p>
         */
        public Builder targetValue(String targetValue) {
            this.putQueryParameter("TargetValue", targetValue);
            this.targetValue = targetValue;
            return this;
        }

        @Override
        public UnbindResourceControlRequest build() {
            return new UnbindResourceControlRequest(this);
        } 

    } 

}
