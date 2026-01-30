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
    @com.aliyun.core.annotation.NameInMap("ClusterTypeInfos")
    private java.util.List<ClusterTypeInfos> clusterTypeInfos;

    @com.aliyun.core.annotation.NameInMap("ClusterTypes")
    private java.util.List<String> clusterTypes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListClusterTypeResponseBody(Builder builder) {
        this.clusterTypeInfos = builder.clusterTypeInfos;
        this.clusterTypes = builder.clusterTypes;
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
     * @return clusterTypeInfos
     */
    public java.util.List<ClusterTypeInfos> getClusterTypeInfos() {
        return this.clusterTypeInfos;
    }

    /**
     * @return clusterTypes
     */
    public java.util.List<String> getClusterTypes() {
        return this.clusterTypes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ClusterTypeInfos> clusterTypeInfos; 
        private java.util.List<String> clusterTypes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListClusterTypeResponseBody model) {
            this.clusterTypeInfos = model.clusterTypeInfos;
            this.clusterTypes = model.clusterTypes;
            this.requestId = model.requestId;
        } 

        /**
         * ClusterTypeInfos.
         */
        public Builder clusterTypeInfos(java.util.List<ClusterTypeInfos> clusterTypeInfos) {
            this.clusterTypeInfos = clusterTypeInfos;
            return this;
        }

        /**
         * ClusterTypes.
         */
        public Builder clusterTypes(java.util.List<String> clusterTypes) {
            this.clusterTypes = clusterTypes;
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
    public static class ClusterTypeInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("IsMultiAZ")
        private Boolean isMultiAZ;

        private ClusterTypeInfos(Builder builder) {
            this.clusterType = builder.clusterType;
            this.isMultiAZ = builder.isMultiAZ;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypeInfos create() {
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

            private Builder(ClusterTypeInfos model) {
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

            public ClusterTypeInfos build() {
                return new ClusterTypeInfos(this);
            } 

        } 

    }
}
