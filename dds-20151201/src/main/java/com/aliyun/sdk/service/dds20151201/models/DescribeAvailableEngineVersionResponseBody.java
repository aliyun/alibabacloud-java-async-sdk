// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableEngineVersionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableEngineVersionResponseBody</p>
 */
public class DescribeAvailableEngineVersionResponseBody extends TeaModel {
    @NameInMap("EngineVersions")
    private EngineVersions engineVersions;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeAvailableEngineVersionResponseBody(Builder builder) {
        this.engineVersions = builder.engineVersions;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableEngineVersionResponseBody create() {
        return builder().build();
    }

    /**
     * @return engineVersions
     */
    public EngineVersions getEngineVersions() {
        return this.engineVersions;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private EngineVersions engineVersions; 
        private String requestId; 

        /**
         * EngineVersions.
         */
        public Builder engineVersions(EngineVersions engineVersions) {
            this.engineVersions = engineVersions;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeAvailableEngineVersionResponseBody build() {
            return new DescribeAvailableEngineVersionResponseBody(this);
        } 

    } 

    public static class EngineVersions extends TeaModel {
        @NameInMap("EngineVersion")
        private java.util.List < String > engineVersion;

        private EngineVersions(Builder builder) {
            this.engineVersion = builder.engineVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EngineVersions create() {
            return builder().build();
        }

        /**
         * @return engineVersion
         */
        public java.util.List < String > getEngineVersion() {
            return this.engineVersion;
        }

        public static final class Builder {
            private java.util.List < String > engineVersion; 

            /**
             * EngineVersion.
             */
            public Builder engineVersion(java.util.List < String > engineVersion) {
                this.engineVersion = engineVersion;
                return this;
            }

            public EngineVersions build() {
                return new EngineVersions(this);
            } 

        } 

    }
}
