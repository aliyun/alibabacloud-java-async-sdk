// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeDBInstancePromoteActivityResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstancePromoteActivityResponseBody</p>
 */
public class DescribeDBInstancePromoteActivityResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliUid")
    private String aliUid;

    @com.aliyun.core.annotation.NameInMap("Bid")
    private String bid;

    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("DBType")
    private String DBType;

    @com.aliyun.core.annotation.NameInMap("IsActivity")
    private String isActivity;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>22973492**********</p>
         */
        public Builder aliUid(String aliUid) {
            this.aliUid = aliUid;
            return this;
        }

        /**
         * <ul>
         * <li>China site: 26842</li>
         * <li>International site: 26888</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>268**</p>
         */
        public Builder bid(String bid) {
            this.bid = bid;
            return this;
        }

        /**
         * <p>The instance ID. You can call the <a href="https://help.aliyun.com/document_detail/26232.html">DescribeDBInstances</a> operation to query the instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The instance name.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-uf6wjk5xxxxxxx</p>
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * <p>The type of the database engine. Valid values:</p>
         * <ul>
         * <li><strong>MySQL</strong></li>
         * <li><strong>PostgreSQL</strong></li>
         * <li><strong>Oracle</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        public Builder DBType(String DBType) {
            this.DBType = DBType;
            return this;
        }

        /**
         * <p>The activity information about the instance. For more information, see <a href="https://help.aliyun.com/document_detail/2391834.html">Instance activities</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder isActivity(String isActivity) {
            this.isActivity = isActivity;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>94CB8D93-017A-5AE7-A118-6E0F89D93C0A</p>
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
