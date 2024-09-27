// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ReleaseInstancePublicConnectionRequest} extends {@link RequestModel}
 *
 * <p>ReleaseInstancePublicConnectionRequest</p>
 */
public class ReleaseInstancePublicConnectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AddressType")
    private String addressType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CurrentConnectionString")
    @com.aliyun.core.annotation.Validation(required = true)
    private String currentConnectionString;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    private ReleaseInstancePublicConnectionRequest(Builder builder) {
        super(builder);
        this.addressType = builder.addressType;
        this.currentConnectionString = builder.currentConnectionString;
        this.DBInstanceId = builder.DBInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseInstancePublicConnectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return addressType
     */
    public String getAddressType() {
        return this.addressType;
    }

    /**
     * @return currentConnectionString
     */
    public String getCurrentConnectionString() {
        return this.currentConnectionString;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public static final class Builder extends Request.Builder<ReleaseInstancePublicConnectionRequest, Builder> {
        private String addressType; 
        private String currentConnectionString; 
        private String DBInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseInstancePublicConnectionRequest request) {
            super(request);
            this.addressType = request.addressType;
            this.currentConnectionString = request.currentConnectionString;
            this.DBInstanceId = request.DBInstanceId;
        } 

        /**
         * <p>The type of the endpoint. Default value: primary. Valid values:</p>
         * <ul>
         * <li><strong>primary</strong>: primary endpoint.</li>
         * <li><strong>cluster</strong>: cluster endpoint. This type of endpoints can be created only for instances that have multiple coordinator nodes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Intranet</p>
         */
        public Builder addressType(String addressType) {
            this.putQueryParameter("AddressType", addressType);
            this.addressType = addressType;
            return this;
        }

        /**
         * <p>The public endpoint of the instance.</p>
         * <p>You can log on to the AnalyticDB for PostgreSQL console and go to the <strong>Basic Information</strong> page of the instance to view the <strong>public endpoint</strong> in the <strong>Database Connection</strong> section.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****.gpdb.rds.aliyuncs.com</p>
         */
        public Builder currentConnectionString(String currentConnectionString) {
            this.putQueryParameter("CurrentConnectionString", currentConnectionString);
            this.currentConnectionString = currentConnectionString;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <blockquote>
         * <p> You can call the <a href="~~86911~~">DescribeDBInstances</a> operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
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

        @Override
        public ReleaseInstancePublicConnectionRequest build() {
            return new ReleaseInstancePublicConnectionRequest(this);
        } 

    } 

}
