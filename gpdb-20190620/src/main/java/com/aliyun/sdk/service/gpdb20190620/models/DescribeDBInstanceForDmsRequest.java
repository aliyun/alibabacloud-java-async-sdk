// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20190620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstanceForDmsRequest} extends {@link RequestModel}
 *
 * <p>DescribeDBInstanceForDmsRequest</p>
 */
public class DescribeDBInstanceForDmsRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @Query
    @NameInMap("Host")
    @Validation(required = true)
    private String host;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Port")
    private Long port;

    private DescribeDBInstanceForDmsRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.host = builder.host;
        this.ownerId = builder.ownerId;
        this.port = builder.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceForDmsRequest create() {
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
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return port
     */
    public Long getPort() {
        return this.port;
    }

    public static final class Builder extends Request.Builder<DescribeDBInstanceForDmsRequest, Builder> {
        private String DBInstanceId; 
        private String host; 
        private Long ownerId; 
        private Long port; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDBInstanceForDmsRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.host = request.host;
            this.ownerId = request.ownerId;
            this.port = request.port;
        } 

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.putQueryParameter("Host", host);
            this.host = host;
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
         * Port.
         */
        public Builder port(Long port) {
            this.putQueryParameter("Port", port);
            this.port = port;
            return this;
        }

        @Override
        public DescribeDBInstanceForDmsRequest build() {
            return new DescribeDBInstanceForDmsRequest(this);
        } 

    } 

}
