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
 * {@link DescribePolarxDataNodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolarxDataNodesResponseBody</p>
 */
public class DescribePolarxDataNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceDataNodes")
    private java.util.List<DBInstanceDataNodes> DBInstanceDataNodes;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalNumber")
    private Integer totalNumber;

    private DescribePolarxDataNodesResponseBody(Builder builder) {
        this.DBInstanceDataNodes = builder.DBInstanceDataNodes;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalNumber = builder.totalNumber;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolarxDataNodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceDataNodes
     */
    public java.util.List<DBInstanceDataNodes> getDBInstanceDataNodes() {
        return this.DBInstanceDataNodes;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalNumber
     */
    public Integer getTotalNumber() {
        return this.totalNumber;
    }

    public static final class Builder {
        private java.util.List<DBInstanceDataNodes> DBInstanceDataNodes; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalNumber; 

        private Builder() {
        } 

        private Builder(DescribePolarxDataNodesResponseBody model) {
            this.DBInstanceDataNodes = model.DBInstanceDataNodes;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalNumber = model.totalNumber;
        } 

        /**
         * <p>The list of node information.</p>
         */
        public Builder DBInstanceDataNodes(java.util.List<DBInstanceDataNodes> DBInstanceDataNodes) {
            this.DBInstanceDataNodes = DBInstanceDataNodes;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BD99340C-4A45-548B-****-27584B0BCFFF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder totalNumber(Integer totalNumber) {
            this.totalNumber = totalNumber;
            return this;
        }

        public DescribePolarxDataNodesResponseBody build() {
            return new DescribePolarxDataNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribePolarxDataNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribePolarxDataNodesResponseBody</p>
     */
    public static class DBInstanceDataNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DBInstanceDescription")
        private String DBInstanceDescription;

        @com.aliyun.core.annotation.NameInMap("DBInstanceId")
        private String DBInstanceId;

        @com.aliyun.core.annotation.NameInMap("DBInstanceName")
        private String DBInstanceName;

        private DBInstanceDataNodes(Builder builder) {
            this.DBInstanceDescription = builder.DBInstanceDescription;
            this.DBInstanceId = builder.DBInstanceId;
            this.DBInstanceName = builder.DBInstanceName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DBInstanceDataNodes create() {
            return builder().build();
        }

        /**
         * @return DBInstanceDescription
         */
        public String getDBInstanceDescription() {
            return this.DBInstanceDescription;
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

        public static final class Builder {
            private String DBInstanceDescription; 
            private String DBInstanceId; 
            private String DBInstanceName; 

            private Builder() {
            } 

            private Builder(DBInstanceDataNodes model) {
                this.DBInstanceDescription = model.DBInstanceDescription;
                this.DBInstanceId = model.DBInstanceId;
                this.DBInstanceName = model.DBInstanceName;
            } 

            /**
             * <p>The description of the node instance.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-z****nfxsxy728 : PROD-OMS-Auto-ProductionDBCloneInstance</p>
             */
            public Builder DBInstanceDescription(String DBInstanceDescription) {
                this.DBInstanceDescription = DBInstanceDescription;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-hzrlcjc****sz9</p>
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * <p>The instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pxc-hzrp5m****04w4</p>
             */
            public Builder DBInstanceName(String DBInstanceName) {
                this.DBInstanceName = DBInstanceName;
                return this;
            }

            public DBInstanceDataNodes build() {
                return new DBInstanceDataNodes(this);
            } 

        } 

    }
}
