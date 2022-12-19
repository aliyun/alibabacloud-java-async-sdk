// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

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
         * Indicates whether you use the free trial of Security Center. Valid values:
         * <p>
         * 
         * *   **0**: no
         * *   **1**: yes
         */
        public Builder canTry(String canTry) {
            this.canTry = canTry;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The edition of Security Center that you use. Valid values:
         * <p>
         * 
         * *   **1**: Basic edition
         * *   **2** or **3**: Enterprise edition
         * *   **5**: Advanced edition
         * *   **6**: Anti-virus edition
         * 
         * >  Both the value 2 and the value 3 indicate the Enterprise edition.
         */
        public Builder sasVersion(String sasVersion) {
            this.sasVersion = sasVersion;
            return this;
        }

        /**
         * The number of weak passwords that can cause high risks to your assets.
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
