// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSQAConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQAConfigResponseBody</p>
 */
public class DescribeSQAConfigResponseBody extends TeaModel {
    @NameInMap("DBClusterId")
    private String DBClusterId;

    @NameInMap("GroupName")
    private String groupName;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SQAStatus")
    private String SQAStatus;

    private DescribeSQAConfigResponseBody(Builder builder) {
        this.DBClusterId = builder.DBClusterId;
        this.groupName = builder.groupName;
        this.requestId = builder.requestId;
        this.SQAStatus = builder.SQAStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSQAConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBClusterId
     */
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return SQAStatus
     */
    public String getSQAStatus() {
        return this.SQAStatus;
    }

    public static final class Builder {
        private String DBClusterId; 
        private String groupName; 
        private String requestId; 
        private String SQAStatus; 

        /**
         * The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.
         * <p>
         * 
         * >  You can call the [DescribeDBClusters](~~129857~~) operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * The name of the resource group.
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether short query acceleration (SQA) is enabled.
         */
        public Builder SQAStatus(String SQAStatus) {
            this.SQAStatus = SQAStatus;
            return this;
        }

        public DescribeSQAConfigResponseBody build() {
            return new DescribeSQAConfigResponseBody(this);
        } 

    } 

}
