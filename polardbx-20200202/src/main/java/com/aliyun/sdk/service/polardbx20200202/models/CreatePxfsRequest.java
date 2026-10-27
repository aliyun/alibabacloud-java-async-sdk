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
 * {@link CreatePxfsRequest} extends {@link RequestModel}
 *
 * <p>CreatePxfsRequest</p>
 */
public class CreatePxfsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClassCode")
    private String classCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeCount")
    private Long nodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityIPList")
    private String securityIPList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StorageSize")
    private Long storageSize;

    private CreatePxfsRequest(Builder builder) {
        super(builder);
        this.classCode = builder.classCode;
        this.DBInstanceName = builder.DBInstanceName;
        this.nodeCount = builder.nodeCount;
        this.regionId = builder.regionId;
        this.securityIPList = builder.securityIPList;
        this.storageSize = builder.storageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePxfsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return classCode
     */
    public String getClassCode() {
        return this.classCode;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return nodeCount
     */
    public Long getNodeCount() {
        return this.nodeCount;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return securityIPList
     */
    public String getSecurityIPList() {
        return this.securityIPList;
    }

    /**
     * @return storageSize
     */
    public Long getStorageSize() {
        return this.storageSize;
    }

    public static final class Builder extends Request.Builder<CreatePxfsRequest, Builder> {
        private String classCode; 
        private String DBInstanceName; 
        private Long nodeCount; 
        private String regionId; 
        private String securityIPList; 
        private Long storageSize; 

        private Builder() {
            super();
        } 

        private Builder(CreatePxfsRequest request) {
            super(request);
            this.classCode = request.classCode;
            this.DBInstanceName = request.DBInstanceName;
            this.nodeCount = request.nodeCount;
            this.regionId = request.regionId;
            this.securityIPList = request.securityIPList;
            this.storageSize = request.storageSize;
        } 

        /**
         * <p>The node specifications.</p>
         * 
         * <strong>example:</strong>
         * <p>polarx.pxfs.x4.xlarge</p>
         */
        public Builder classCode(String classCode) {
            this.putQueryParameter("ClassCode", classCode);
            this.classCode = classCode;
            return this;
        }

        /**
         * <p>The PolarDB-X instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pxc-xxxxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.putQueryParameter("DBInstanceName", DBInstanceName);
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder nodeCount(Long nodeCount) {
            this.putQueryParameter("NodeCount", nodeCount);
            this.nodeCount = nodeCount;
            return this;
        }

        /**
         * <p>The region ID.</p>
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

        /**
         * <p>The IP whitelist.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.1.0/24,10.0.0.1</p>
         */
        public Builder securityIPList(String securityIPList) {
            this.putQueryParameter("SecurityIPList", securityIPList);
            this.securityIPList = securityIPList;
            return this;
        }

        /**
         * <p>The storage capacity.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        public Builder storageSize(Long storageSize) {
            this.putQueryParameter("StorageSize", storageSize);
            this.storageSize = storageSize;
            return this;
        }

        @Override
        public CreatePxfsRequest build() {
            return new CreatePxfsRequest(this);
        } 

    } 

}
