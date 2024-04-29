// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCheckEcsWarningsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckEcsWarningsResponseBody</p>
 */
public class DescribeCheckEcsWarningsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanTry")
    private String canTry;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SasVersion")
    private String sasVersion;

    @com.aliyun.core.annotation.NameInMap("WeakPasswordCount")
    private String weakPasswordCount;

    private DescribeCheckEcsWarningsResponseBody(Builder builder) {
        this.canTry = builder.canTry;
        this.requestId = builder.requestId;
        this.sasVersion = builder.sasVersion;
        this.weakPasswordCount = builder.weakPasswordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCheckEcsWarningsResponseBody create() {
        return builder().build();
    }

    /**
     * @return canTry
     */
    public String getCanTry() {
        return this.canTry;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sasVersion
     */
    public String getSasVersion() {
        return this.sasVersion;
    }

    /**
     * @return weakPasswordCount
     */
    public String getWeakPasswordCount() {
        return this.weakPasswordCount;
    }

    public static final class Builder {
        private String canTry; 
        private String requestId; 
        private String sasVersion; 
        private String weakPasswordCount; 

        /**
         * CanTry.
         */
        public Builder canTry(String canTry) {
            this.canTry = canTry;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SasVersion.
         */
        public Builder sasVersion(String sasVersion) {
            this.sasVersion = sasVersion;
            return this;
        }

        /**
         * WeakPasswordCount.
         */
        public Builder weakPasswordCount(String weakPasswordCount) {
            this.weakPasswordCount = weakPasswordCount;
            return this;
        }

        public DescribeCheckEcsWarningsResponseBody build() {
            return new DescribeCheckEcsWarningsResponseBody(this);
        } 

    } 

}
