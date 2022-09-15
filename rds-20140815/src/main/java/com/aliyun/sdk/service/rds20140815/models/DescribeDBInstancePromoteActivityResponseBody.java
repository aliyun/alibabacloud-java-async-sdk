// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDBInstancePromoteActivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancePromoteActivityResponseBody</p>
 */
public class DescribeDBInstancePromoteActivityResponseBody extends TeaModel {
    @NameInMap("AliUid")
    private String aliUid;

    @NameInMap("Bid")
    private String bid;

    @NameInMap("DBInstanceId")
    private String DBInstanceId;

    @NameInMap("DBInstanceName")
    private String DBInstanceName;

    @NameInMap("DBType")
    private String DBType;

    @NameInMap("IsActivity")
    private String isActivity;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeDBInstancePromoteActivityResponseBody(Builder builder) {
        this.aliUid = builder.aliUid;
        this.bid = builder.bid;
        this.DBInstanceId = builder.DBInstanceId;
        this.DBInstanceName = builder.DBInstanceName;
        this.DBType = builder.DBType;
        this.isActivity = builder.isActivity;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstancePromoteActivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliUid
     */
    public String getAliUid() {
        return this.aliUid;
    }

    /**
     * @return bid
     */
    public String getBid() {
        return this.bid;
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    /**
     * @return DBType
     */
    public String getDBType() {
        return this.DBType;
    }

    /**
     * @return isActivity
     */
    public String getIsActivity() {
        return this.isActivity;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aliUid; 
        private String bid; 
        private String DBInstanceId; 
        private String DBInstanceName; 
        private String DBType; 
        private String isActivity; 
        private String requestId; 

        /**
         * AliUid.
         */
        public Builder aliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * Bid.
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * DBInstanceId.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DBType.
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * IsActivity.
         */
        public Builder isActivity(String isActivity) {
            this.isActivity = isActivity;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeDBInstancePromoteActivityResponseBody build() {
            return new DescribeDBInstancePromoteActivityResponseBody(this);
        } 

    } 

}
