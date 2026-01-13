// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tablestore20201209.models;

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
 * {@link ListClusterTypeResponseBody} extends {@link TeaModel}
 *
 * <p>ListClusterTypeResponseBody</p>
 */
public class ListClusterTypeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterTypeDetailList")
    private java.util.List<ClusterTypeDetailList> clusterTypeDetailList;

    @com.aliyun.core.annotation.NameInMap("ClusterTypeList")
    private java.util.List<String> clusterTypeList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClusterTypeResponseBody(Builder builder) {
        this.clusterTypeDetailList = builder.clusterTypeDetailList;
        this.clusterTypeList = builder.clusterTypeList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterTypeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterTypeDetailList
     */
    public java.util.List<ClusterTypeDetailList> getClusterTypeDetailList() {
        return this.clusterTypeDetailList;
    }

    /**
     * @return clusterTypeList
     */
    public java.util.List<String> getClusterTypeList() {
        return this.clusterTypeList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ClusterTypeDetailList> clusterTypeDetailList; 
        private java.util.List<String> clusterTypeList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListClusterTypeResponseBody model) {
            this.clusterTypeDetailList = model.clusterTypeDetailList;
            this.clusterTypeList = model.clusterTypeList;
            this.requestId = model.requestId;
        } 

        /**
         * ClusterTypeDetailList.
         */
        public Builder clusterTypeDetailList(java.util.List<ClusterTypeDetailList> clusterTypeDetailList) {
            this.clusterTypeDetailList = clusterTypeDetailList;
            return this;
        }

        /**
         * ClusterTypeList.
         */
        public Builder clusterTypeList(java.util.List<String> clusterTypeList) {
            this.clusterTypeList = clusterTypeList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListClusterTypeResponseBody build() {
            return new ListClusterTypeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClusterTypeResponseBody} extends {@link TeaModel}
     *
     * <p>ListClusterTypeResponseBody</p>
     */
    public static class ClusterTypeDetailList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("IsMultiAZ")
        private Boolean isMultiAZ;

        private ClusterTypeDetailList(Builder builder) {
            this.clusterType = builder.clusterType;
            this.isMultiAZ = builder.isMultiAZ;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypeDetailList create() {
            return builder().build();
        }

        /**
         * @return clusterType
         */
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return isMultiAZ
         */
        public Boolean getIsMultiAZ() {
            return this.isMultiAZ;
        }

        public static final class Builder {
            private String clusterType; 
            private Boolean isMultiAZ; 

            private Builder() {
            } 

            private Builder(ClusterTypeDetailList model) {
                this.clusterType = model.clusterType;
                this.isMultiAZ = model.isMultiAZ;
            } 

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * IsMultiAZ.
             */
            public Builder isMultiAZ(Boolean isMultiAZ) {
                this.isMultiAZ = isMultiAZ;
                return this;
            }

            public ClusterTypeDetailList build() {
                return new ClusterTypeDetailList(this);
            } 

        } 

    }
}
