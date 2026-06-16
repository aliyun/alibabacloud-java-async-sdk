// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbx20200202.models;

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
 * {@link ResetMem0AccountPasswordRequest} extends {@link RequestModel}
 *
 * <p>ResetMem0AccountPasswordRequest</p>
 */
public class ResetMem0AccountPasswordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mem0ApiKey")
    @com.aliyun.core.annotation.Validation(maxLength = 128, minLength = 32)
    private String mem0ApiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ResetMem0AccountPasswordRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.mem0ApiKey = builder.mem0ApiKey;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResetMem0AccountPasswordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return mem0ApiKey
     */
    public String getMem0ApiKey() {
        return this.mem0ApiKey;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ResetMem0AccountPasswordRequest, Builder> {
        private String DBInstanceName; 
        private String mem0ApiKey; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ResetMem0AccountPasswordRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.mem0ApiKey = request.mem0ApiKey;
            this.regionId = request.regionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-hzravgpt8q****</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>apikey</p>
         * 
         * <strong>example:</strong>
         * <p>aafdf2e7d0988ef623***</p>
         */
        public Builder mem0ApiKey(String mem0ApiKey) {
            this.putQueryParameter("Mem0ApiKey", mem0ApiKey);
            this.mem0ApiKey = mem0ApiKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ResetMem0AccountPasswordRequest build() {
            return new ResetMem0AccountPasswordRequest(this);
        } 

    } 

}
