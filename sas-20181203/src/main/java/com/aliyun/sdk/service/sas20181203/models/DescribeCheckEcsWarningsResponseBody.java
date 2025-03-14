// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeCheckEcsWarningsResponseBody model) {
            this.canTry = model.canTry;
            this.requestId = model.requestId;
            this.sasVersion = model.sasVersion;
            this.weakPasswordCount = model.weakPasswordCount;
        } 

        /**
         * <p>Indicates whether you use the free trial of Security Center. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder canTry(String canTry) {
            this.canTry = canTry;
            return this;
        }

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>4E5BFDCF-B9DD-430D-9DA4-151BCB581C9D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The edition of Security Center that you use. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic edition</li>
         * <li><strong>2</strong> or <strong>3</strong>: Enterprise edition</li>
         * <li><strong>5</strong>: Advanced edition</li>
         * <li><strong>6</strong>: Anti-virus edition</li>
         * </ul>
         * <blockquote>
         * <p> Both the value 2 and the value 3 indicate the Enterprise edition.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder sasVersion(String sasVersion) {
            this.sasVersion = sasVersion;
            return this;
        }

        /**
         * <p>The number of weak passwords that can cause high risks to your assets.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
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
