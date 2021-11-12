// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

/**
 * {@link DescribeCheckEcsWarningsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCheckEcsWarningsResponseBody</p>
 */
public class DescribeCheckEcsWarningsResponseBody extends TeaModel {
    @NameInMap("CanTry")
    private String canTry;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SasVersion")
    private String sasVersion;

    @NameInMap("WeakPasswordCount")
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
         * <p>CanTry.</p>
         */
        public Builder canTry(String canTry) {
            this.canTry = canTry;
            return this;
        }

        /**
         * <p>RequestId.</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>SasVersion.</p>
         */
        public Builder sasVersion(String sasVersion) {
            this.sasVersion = sasVersion;
            return this;
        }

        /**
         * <p>WeakPasswordCount.</p>
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
