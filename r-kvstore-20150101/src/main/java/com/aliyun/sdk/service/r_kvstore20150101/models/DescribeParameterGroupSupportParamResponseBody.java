// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.r_kvstore20150101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeParameterGroupSupportParamResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeParameterGroupSupportParamResponseBody</p>
 */
public class DescribeParameterGroupSupportParamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResourceList")
    private java.util.List < ResourceList> resourceList;

    private DescribeParameterGroupSupportParamResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resourceList = builder.resourceList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeParameterGroupSupportParamResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resourceList
     */
    public java.util.List < ResourceList> getResourceList() {
        return this.resourceList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResourceList> resourceList; 

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The parameters.
         */
        public Builder resourceList(java.util.List < ResourceList> resourceList) {
            this.resourceList = resourceList;
            return this;
        }

        public DescribeParameterGroupSupportParamResponseBody build() {
            return new DescribeParameterGroupSupportParamResponseBody(this);
        } 

    } 

    public static class ResourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("DbVersion")
        private String dbVersion;

        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        private ResourceList(Builder builder) {
            this.category = builder.category;
            this.dbType = builder.dbType;
            this.dbVersion = builder.dbVersion;
            this.paramName = builder.paramName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceList create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return dbVersion
         */
        public String getDbVersion() {
            return this.dbVersion;
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        public static final class Builder {
            private String category; 
            private String dbType; 
            private String dbVersion; 
            private String paramName; 

            /**
             * The service category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The engine type.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * The engine version.
             */
            public Builder dbVersion(String dbVersion) {
                this.dbVersion = dbVersion;
                return this;
            }

            /**
             * The name of the parameter.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            public ResourceList build() {
                return new ResourceList(this);
            } 

        } 

    }
}
