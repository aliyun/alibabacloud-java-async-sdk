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
 * {@link CreateSubCNInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateSubCNInstanceRequest</p>
 */
public class CreateSubCNInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsAutoCreate")
    private Boolean isAutoCreate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ReadType")
    private String readType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateSubCNInstanceRequest(Builder builder) {
        super(builder);
        this.DBInstanceName = builder.DBInstanceName;
        this.isAutoCreate = builder.isAutoCreate;
        this.readType = builder.readType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubCNInstanceRequest create() {
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
     * @return isAutoCreate
     */
    public Boolean getIsAutoCreate() {
        return this.isAutoCreate;
    }

    /**
     * @return readType
     */
    public String getReadType() {
        return this.readType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateSubCNInstanceRequest, Builder> {
        private String DBInstanceName; 
        private Boolean isAutoCreate; 
        private String readType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubCNInstanceRequest request) {
            super(request);
            this.DBInstanceName = request.DBInstanceName;
            this.isAutoCreate = request.isAutoCreate;
            this.readType = request.readType;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The instance ID. &gt; You can call the <a href="https://help.aliyun.com/document_detail/196830.html">DescribeDBInstances</a> operation to query the details of all instances in the specified region, including instance IDs.</p>
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
         * <p>Specifies whether to automatically calculate compute resource parameters. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>:</li>
         * </ul>
         */
        public Builder isAutoCreate(Boolean isAutoCreate) {
            this.putQueryParameter("IsAutoCreate", isAutoCreate);
            this.isAutoCreate = isAutoCreate;
            return this;
        }

        /**
         * <p>The read/write type. Valid values:</p>
         * <ul>
         * <li>ReadWrite: row store read/write.</li>
         * <li>ColumnarRead: column store read-only.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ReadWrite</p>
         */
        public Builder readType(String readType) {
            this.putQueryParameter("ReadType", readType);
            this.readType = readType;
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

        @Override
        public CreateSubCNInstanceRequest build() {
            return new CreateSubCNInstanceRequest(this);
        } 

    } 

}
