// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

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
 * {@link DescribeNodeParamTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeParamTagsResponseBody</p>
 */
public class DescribeNodeParamTagsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ParamReferredPaths")
    private java.util.List<ParamReferredPaths> paramReferredPaths;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeNodeParamTagsResponseBody(Builder builder) {
        this.paramReferredPaths = builder.paramReferredPaths;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeParamTagsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paramReferredPaths
     */
    public java.util.List<ParamReferredPaths> getParamReferredPaths() {
        return this.paramReferredPaths;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ParamReferredPaths> paramReferredPaths; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeNodeParamTagsResponseBody model) {
            this.paramReferredPaths = model.paramReferredPaths;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The configuration of the recommended path.</p>
         */
        public Builder paramReferredPaths(java.util.List<ParamReferredPaths> paramReferredPaths) {
            this.paramReferredPaths = paramReferredPaths;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6BE94351-712A-505D-A40A-BC77CC8254A9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNodeParamTagsResponseBody build() {
            return new DescribeNodeParamTagsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeNodeParamTagsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeNodeParamTagsResponseBody</p>
     */
    public static class ParamReferredPaths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParamName")
        private String paramName;

        @com.aliyun.core.annotation.NameInMap("ReferredPath")
        private java.util.List<String> referredPath;

        private ParamReferredPaths(Builder builder) {
            this.paramName = builder.paramName;
            this.referredPath = builder.referredPath;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamReferredPaths create() {
            return builder().build();
        }

        /**
         * @return paramName
         */
        public String getParamName() {
            return this.paramName;
        }

        /**
         * @return referredPath
         */
        public java.util.List<String> getReferredPath() {
            return this.referredPath;
        }

        public static final class Builder {
            private String paramName; 
            private java.util.List<String> referredPath; 

            private Builder() {
            } 

            private Builder(ParamReferredPaths model) {
                this.paramName = model.paramName;
                this.referredPath = model.referredPath;
            } 

            /**
             * <p>The name of the upstream node.</p>
             * 
             * <strong>example:</strong>
             * <p>DataFormat_1</p>
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * <p>The paths.</p>
             */
            public Builder referredPath(java.util.List<String> referredPath) {
                this.referredPath = referredPath;
                return this;
            }

            public ParamReferredPaths build() {
                return new ParamReferredPaths(this);
            } 

        } 

    }
}
