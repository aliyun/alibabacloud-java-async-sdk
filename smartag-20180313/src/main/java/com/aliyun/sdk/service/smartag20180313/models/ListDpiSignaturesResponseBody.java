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
 * {@link ListDpiSignaturesResponseBody} extends {@link TeaModel}
 *
 * <p>ListDpiSignaturesResponseBody</p>
 */
public class ListDpiSignaturesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DpiSignature")
    private java.util.List<DpiSignature> dpiSignature;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListDpiSignaturesResponseBody(Builder builder) {
        this.dpiSignature = builder.dpiSignature;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDpiSignaturesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dpiSignature
     */
    public java.util.List<DpiSignature> getDpiSignature() {
        return this.dpiSignature;
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
        private java.util.List<DpiSignature> dpiSignature; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListDpiSignaturesResponseBody model) {
            this.dpiSignature = model.dpiSignature;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The information about the application.</p>
         */
        public Builder dpiSignature(java.util.List<DpiSignature> dpiSignature) {
            this.dpiSignature = dpiSignature;
            return this;
        }

        /**
         * <p>The token returned for the next query.</p>
         * 
         * <strong>example:</strong>
         * <p>FFrMV38kR4****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>63081123-B7C0-4BC9-B9E5-59E77A616EC9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDpiSignaturesResponseBody build() {
            return new ListDpiSignaturesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDpiSignaturesResponseBody} extends {@link TeaModel}
     *
     * <p>ListDpiSignaturesResponseBody</p>
     */
    public static class DpiSignature extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DpiGroupId")
        private String dpiGroupId;

        @com.aliyun.core.annotation.NameInMap("DpiSignatureId")
        private String dpiSignatureId;

        @com.aliyun.core.annotation.NameInMap("DpiSignatureName")
        private String dpiSignatureName;

        @com.aliyun.core.annotation.NameInMap("MinEngineVersion")
        private String minEngineVersion;

        @com.aliyun.core.annotation.NameInMap("MinSignatureDbVersion")
        private String minSignatureDbVersion;

        private DpiSignature(Builder builder) {
            this.dpiGroupId = builder.dpiGroupId;
            this.dpiSignatureId = builder.dpiSignatureId;
            this.dpiSignatureName = builder.dpiSignatureName;
            this.minEngineVersion = builder.minEngineVersion;
            this.minSignatureDbVersion = builder.minSignatureDbVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DpiSignature create() {
            return builder().build();
        }

        /**
         * @return dpiGroupId
         */
        public String getDpiGroupId() {
            return this.dpiGroupId;
        }

        /**
         * @return dpiSignatureId
         */
        public String getDpiSignatureId() {
            return this.dpiSignatureId;
        }

        /**
         * @return dpiSignatureName
         */
        public String getDpiSignatureName() {
            return this.dpiSignatureName;
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
            private String dpiSignatureId; 
            private String dpiSignatureName; 
            private String minEngineVersion; 
            private String minSignatureDbVersion; 

            private Builder() {
            } 

            private Builder(DpiSignature model) {
                this.dpiGroupId = model.dpiGroupId;
                this.dpiSignatureId = model.dpiSignatureId;
                this.dpiSignatureName = model.dpiSignatureName;
                this.minEngineVersion = model.minEngineVersion;
                this.minSignatureDbVersion = model.minSignatureDbVersion;
            } 

            /**
             * <p>The ID of the application group to which the application belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder dpiGroupId(String dpiGroupId) {
                this.dpiGroupId = dpiGroupId;
                return this;
            }

            /**
             * <p>The ID of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>235</p>
             */
            public Builder dpiSignatureId(String dpiSignatureId) {
                this.dpiSignatureId = dpiSignatureId;
                return this;
            }

            /**
             * <p>The name of the application.</p>
             * 
             * <strong>example:</strong>
             * <p>EdgeCast</p>
             */
            public Builder dpiSignatureName(String dpiSignatureName) {
                this.dpiSignatureName = dpiSignatureName;
                return this;
            }

            /**
             * <p>The earliest version of engine that supports the application.</p>
             * 
             * <strong>example:</strong>
             * <p>0-0.0.1</p>
             */
            public Builder minEngineVersion(String minEngineVersion) {
                this.minEngineVersion = minEngineVersion;
                return this;
            }

            /**
             * <p>The earliest version of signature database that supports the application.</p>
             * 
             * <strong>example:</strong>
             * <p>20201117_1_0-0.0.1</p>
             */
            public Builder minSignatureDbVersion(String minSignatureDbVersion) {
                this.minSignatureDbVersion = minSignatureDbVersion;
                return this;
            }

            public DpiSignature build() {
                return new DpiSignature(this);
            } 

        } 

    }
}
