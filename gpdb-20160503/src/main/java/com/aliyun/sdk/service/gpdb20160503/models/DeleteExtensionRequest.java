// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DeleteExtensionRequest} extends {@link RequestModel}
 *
 * <p>DeleteExtensionRequest</p>
 */
public class DeleteExtensionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Extension")
    @com.aliyun.core.annotation.Validation(required = true)
    private String extension;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteExtensionRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.DBNames = builder.DBNames;
        this.extension = builder.extension;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteExtensionRequest create() {
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
     * @return DBNames
     */
    public String getDBNames() {
        return this.DBNames;
    }

    /**
     * @return extension
     */
    public String getExtension() {
        return this.extension;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteExtensionRequest, Builder> {
        private String DBInstanceId; 
        private String DBNames; 
        private String extension; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteExtensionRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.DBNames = request.DBNames;
            this.extension = request.extension;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The instance ID.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query the IDs of all AnalyticDB for PostgreSQL instances in a specific region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-xxxxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The name of the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo1</p>
         */
        public Builder DBNames(String DBNames) {
            this.putQueryParameter("DBNames", DBNames);
            this.DBNames = DBNames;
            return this;
        }

        /**
         * <p>The name of the extension.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>citext</p>
         */
        public Builder extension(String extension) {
            this.putQueryParameter("Extension", extension);
            this.extension = extension;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
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
        public DeleteExtensionRequest build() {
            return new DeleteExtensionRequest(this);
        } 

    } 

}
