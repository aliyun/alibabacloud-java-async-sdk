// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeParamTagsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeParamTagsResponseBody</p>
 */
public class DescribeNodeParamTagsResponseBody extends TeaModel {
    @NameInMap("ParamReferredPaths")
    private java.util.List < ParamReferredPaths> paramReferredPaths;

    @NameInMap("RequestId")
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

    /**
     * @return paramReferredPaths
     */
    public java.util.List < ParamReferredPaths> getParamReferredPaths() {
        return this.paramReferredPaths;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < ParamReferredPaths> paramReferredPaths; 
        private String requestId; 

        /**
         * The configuration of the recommended path.
         */
        public Builder paramReferredPaths(java.util.List < ParamReferredPaths> paramReferredPaths) {
            this.paramReferredPaths = paramReferredPaths;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeNodeParamTagsResponseBody build() {
            return new DescribeNodeParamTagsResponseBody(this);
        } 

    } 

    public static class ParamReferredPaths extends TeaModel {
        @NameInMap("ParamName")
        private String paramName;

        @NameInMap("ReferredPath")
        private java.util.List < String > referredPath;

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
        public java.util.List < String > getReferredPath() {
            return this.referredPath;
        }

        public static final class Builder {
            private String paramName; 
            private java.util.List < String > referredPath; 

            /**
             * The name of the upstream node.
             */
            public Builder paramName(String paramName) {
                this.paramName = paramName;
                return this;
            }

            /**
             * The paths.
             */
            public Builder referredPath(java.util.List < String > referredPath) {
                this.referredPath = referredPath;
                return this;
            }

            public ParamReferredPaths build() {
                return new ParamReferredPaths(this);
            } 

        } 

    }
}
