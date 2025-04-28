// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link DescribeSQAConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSQAConfigResponseBody</p>
 */
public class DescribeSQAConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBClusterId")
    private String DBClusterId;

    @com.aliyun.core.annotation.NameInMap("GroupName")
    private String groupName;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SQAStatus")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeSQAConfigResponseBody model) {
            this.DBClusterId = model.DBClusterId;
            this.groupName = model.groupName;
            this.requestId = model.requestId;
            this.SQAStatus = model.SQAStatus;
        } 

        /**
         * <p>The ID of the AnalyticDB for MySQL Data Warehouse Edition (V3.0) cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/129857.html">DescribeDBClusters</a> operation to query the IDs of all AnalyticDB for MySQL Data Warehouse Edition (V3.0) clusters within a region.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>am-8vbyw9awuj141haf9</p>
         */
        public Builder DBClusterId(String DBClusterId) {
            this.DBClusterId = DBClusterId;
            return this;
        }

        /**
         * <p>The name of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>test_group</p>
         */
        public Builder groupName(String groupName) {
            this.groupName = groupName;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CBE843D8-964D-5EA3-9D31-822125611B6E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether short query acceleration (SQA) is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>off</p>
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
