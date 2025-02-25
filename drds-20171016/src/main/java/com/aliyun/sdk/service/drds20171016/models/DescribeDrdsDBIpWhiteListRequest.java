// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20171016.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDrdsDBIpWhiteListRequest} extends {@link RequestModel}
 *
 * <p>DescribeDrdsDBIpWhiteListRequest</p>
 */
public class DescribeDrdsDBIpWhiteListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DrdsInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String drdsInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    private DescribeDrdsDBIpWhiteListRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.drdsInstanceId = builder.drdsInstanceId;
        this.groupName = builder.groupName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDrdsDBIpWhiteListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return drdsInstanceId
     */
    public String getDrdsInstanceId() {
        return this.drdsInstanceId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    public static final class Builder extends Request.Builder<DescribeDrdsDBIpWhiteListRequest, Builder> {
        private String dbName; 
        private String drdsInstanceId; 
        private String groupName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeDrdsDBIpWhiteListRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.drdsInstanceId = request.drdsInstanceId;
            this.groupName = request.groupName;
        } 

        /**
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * DrdsInstanceId.
         */
        public Builder drdsInstanceId(String drdsInstanceId) {
            this.putQueryParameter("DrdsInstanceId", drdsInstanceId);
            this.drdsInstanceId = drdsInstanceId;
            return this;
        }

        /**
         * GroupName.
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        @Override
        public DescribeDrdsDBIpWhiteListRequest build() {
            return new DescribeDrdsDBIpWhiteListRequest(this);
        } 

    } 

}
