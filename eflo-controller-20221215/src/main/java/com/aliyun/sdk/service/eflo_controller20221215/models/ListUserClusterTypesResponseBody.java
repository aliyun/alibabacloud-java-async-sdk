// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListUserClusterTypesResponseBody} extends {@link TeaModel}
 *
 * <p>ListUserClusterTypesResponseBody</p>
 */
public class ListUserClusterTypesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterTypes")
    private java.util.List<ClusterTypes> clusterTypes;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListUserClusterTypesResponseBody(Builder builder) {
        this.clusterTypes = builder.clusterTypes;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUserClusterTypesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterTypes
     */
    public java.util.List<ClusterTypes> getClusterTypes() {
        return this.clusterTypes;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ClusterTypes> clusterTypes; 
        private String nextToken; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListUserClusterTypesResponseBody model) {
            this.clusterTypes = model.clusterTypes;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
        } 

        /**
         * <p>List of cluster types. The number of array elements N ranges from 1 to 100.</p>
         */
        public Builder clusterTypes(java.util.List<ClusterTypes> clusterTypes) {
            this.clusterTypes = clusterTypes;
            return this;
        }

        /**
         * <p>The NextToken for the next page. Include this value when requesting the next page.</p>
         * 
         * <strong>example:</strong>
         * <p>3a6b93229825ac667104463b56790c91</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>4FD06DF0-9167-5C6F-A145-F30CA4A15D54</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListUserClusterTypesResponseBody build() {
            return new ListUserClusterTypesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListUserClusterTypesResponseBody} extends {@link TeaModel}
     *
     * <p>ListUserClusterTypesResponseBody</p>
     */
    public static class ClusterTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccessType")
        private String accessType;

        @com.aliyun.core.annotation.NameInMap("TypeName")
        private String typeName;

        private ClusterTypes(Builder builder) {
            this.accessType = builder.accessType;
            this.typeName = builder.typeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterTypes create() {
            return builder().build();
        }

        /**
         * @return accessType
         */
        public String getAccessType() {
            return this.accessType;
        }

        /**
         * @return typeName
         */
        public String getTypeName() {
            return this.typeName;
        }

        public static final class Builder {
            private String accessType; 
            private String typeName; 

            private Builder() {
            } 

            private Builder(ClusterTypes model) {
                this.accessType = model.accessType;
                this.typeName = model.typeName;
            } 

            /**
             * <p>访问类型。</p>
             * 
             * <strong>example:</strong>
             * <p>Public</p>
             */
            public Builder accessType(String accessType) {
                this.accessType = accessType;
                return this;
            }

            /**
             * <p>Type name</p>
             * 
             * <strong>example:</strong>
             * <p>AckEdgePro</p>
             */
            public Builder typeName(String typeName) {
                this.typeName = typeName;
                return this;
            }

            public ClusterTypes build() {
                return new ClusterTypes(this);
            } 

        } 

    }
}
