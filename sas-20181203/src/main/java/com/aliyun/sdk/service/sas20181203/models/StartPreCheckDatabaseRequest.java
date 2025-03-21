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
 * {@link StartPreCheckDatabaseRequest} extends {@link RequestModel}
 *
 * <p>StartPreCheckDatabaseRequest</p>
 */
public class StartPreCheckDatabaseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DatabaseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String databaseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceUuid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UniRegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uniRegionId;

    private StartPreCheckDatabaseRequest(Builder builder) {
        super(builder);
        this.databaseType = builder.databaseType;
        this.instanceUuid = builder.instanceUuid;
        this.uniRegionId = builder.uniRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPreCheckDatabaseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return databaseType
     */
    public String getDatabaseType() {
        return this.databaseType;
    }

    /**
     * @return instanceUuid
     */
    public String getInstanceUuid() {
        return this.instanceUuid;
    }

    /**
     * @return uniRegionId
     */
    public String getUniRegionId() {
        return this.uniRegionId;
    }

    public static final class Builder extends Request.Builder<StartPreCheckDatabaseRequest, Builder> {
        private String databaseType; 
        private String instanceUuid; 
        private String uniRegionId; 

        private Builder() {
            super();
        } 

        private Builder(StartPreCheckDatabaseRequest request) {
            super(request);
            this.databaseType = request.databaseType;
            this.instanceUuid = request.instanceUuid;
            this.uniRegionId = request.uniRegionId;
        } 

        /**
         * <p>The type of the database. Valid values:</p>
         * <ul>
         * <li><strong>MYSQL</strong></li>
         * <li><strong>MSSQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        public Builder databaseType(String databaseType) {
            this.putQueryParameter("DatabaseType", databaseType);
            this.databaseType = databaseType;
            return this;
        }

        /**
         * <p>The UUID of the agent that is used to back up the data of the database.</p>
         * <blockquote>
         * <p>You can call the <a href="~~DescribeUniBackupDatabase~~">DescribeUniBackupDatabase</a> operation to query the UUID.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ec1c0ba21d2911ed800000163e0e****</p>
         */
        public Builder instanceUuid(String instanceUuid) {
            this.putQueryParameter("InstanceUuid", instanceUuid);
            this.instanceUuid = instanceUuid;
            return this;
        }

        /**
         * <p>The region ID of the server that hosts the database.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hongkong</p>
         */
        public Builder uniRegionId(String uniRegionId) {
            this.putQueryParameter("UniRegionId", uniRegionId);
            this.uniRegionId = uniRegionId;
            return this;
        }

        @Override
        public StartPreCheckDatabaseRequest build() {
            return new StartPreCheckDatabaseRequest(this);
        } 

    } 

}
