// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link ListDpiGroupsResponseBody} extends {@link TeaModel}
 *
 * <p>ListDpiGroupsResponseBody</p>
 */
public class ListDpiGroupsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DpiGroup")
    private java.util.List<DpiGroup> dpiGroup;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDpiGroupsResponseBody(Builder builder) {
        this.dpiGroup = builder.dpiGroup;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDpiGroupsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dpiGroup
     */
    public java.util.List<DpiGroup> getDpiGroup() {
        return this.dpiGroup;
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

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<DpiGroup> dpiGroup; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDpiGroupsResponseBody model) {
            this.dpiGroup = model.dpiGroup;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the application group.</p>
         */
        public Builder dpiGroup(java.util.List<DpiGroup> dpiGroup) {
            this.dpiGroup = dpiGroup;
            return this;
        }

        /**
         * <p>The token returned for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>FFPSpX59Ebw****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>EC184A86-3C93-49D6-BB34-6C193E14D37F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDpiGroupsResponseBody build() {
            return new ListDpiGroupsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDpiGroupsResponseBody} extends {@link TeaModel}
     *
     * <p>ListDpiGroupsResponseBody</p>
     */
    public static class DpiGroup extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DpiGroupId")
        private String dpiGroupId;

        @com.aliyun.core.annotation.NameInMap("DpiGroupName")
        private String dpiGroupName;

        @com.aliyun.core.annotation.NameInMap("MinEngineVersion")
        private String minEngineVersion;

        @com.aliyun.core.annotation.NameInMap("MinSignatureDbVersion")
        private String minSignatureDbVersion;

        private DpiGroup(Builder builder) {
            this.dpiGroupId = builder.dpiGroupId;
            this.dpiGroupName = builder.dpiGroupName;
            this.minEngineVersion = builder.minEngineVersion;
            this.minSignatureDbVersion = builder.minSignatureDbVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DpiGroup create() {
            return builder().build();
        }

        /**
         * @return dpiGroupId
         */
        public String getDpiGroupId() {
            return this.dpiGroupId;
        }

        /**
         * @return dpiGroupName
         */
        public String getDpiGroupName() {
            return this.dpiGroupName;
        }

        /**
         * @return minEngineVersion
         */
        public String getMinEngineVersion() {
            return this.minEngineVersion;
        }

        /**
         * @return minSignatureDbVersion
         */
        public String getMinSignatureDbVersion() {
            return this.minSignatureDbVersion;
        }

        public static final class Builder {
            private String dpiGroupId; 
            private String dpiGroupName; 
            private String minEngineVersion; 
            private String minSignatureDbVersion; 

            private Builder() {
            } 

            private Builder(DpiGroup model) {
                this.dpiGroupId = model.dpiGroupId;
                this.dpiGroupName = model.dpiGroupName;
                this.minEngineVersion = model.minEngineVersion;
                this.minSignatureDbVersion = model.minSignatureDbVersion;
            } 

            /**
             * <p>The ID of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dpiGroupId(String dpiGroupId) {
                this.dpiGroupId = dpiGroupId;
                return this;
            }

            /**
             * <p>The name of the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>P2P</p>
             */
            public Builder dpiGroupName(String dpiGroupName) {
                this.dpiGroupName = dpiGroupName;
                return this;
            }

            /**
             * <p>The earliest version of engine that supports the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>0-0.0.1</p>
             */
            public Builder minEngineVersion(String minEngineVersion) {
                this.minEngineVersion = minEngineVersion;
                return this;
            }

            /**
             * <p>The earliest version of signature database that supports the application group.</p>
             * 
             * <strong>example:</strong>
             * <p>20201117_1_0-0.0.1</p>
             */
            public Builder minSignatureDbVersion(String minSignatureDbVersion) {
                this.minSignatureDbVersion = minSignatureDbVersion;
                return this;
            }

            public DpiGroup build() {
                return new DpiGroup(this);
            } 

        } 

    }
}
