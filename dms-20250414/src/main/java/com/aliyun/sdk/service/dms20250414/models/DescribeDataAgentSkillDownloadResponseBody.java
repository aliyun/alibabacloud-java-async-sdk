// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link DescribeDataAgentSkillDownloadResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDataAgentSkillDownloadResponseBody</p>
 */
public class DescribeDataAgentSkillDownloadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeDataAgentSkillDownloadResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDataAgentSkillDownloadResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeDataAgentSkillDownloadResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response struct.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code. This parameter is returned when a request exception occurs.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidTid</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message returned when the call fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Specified parameter Tid is not valid.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>E0D21075-CD3E-4D98-8264-FD8AD04A63B6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request is successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The request is successful.</li>
         * <li><strong>false</strong>: The request fails.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeDataAgentSkillDownloadResponseBody build() {
            return new DescribeDataAgentSkillDownloadResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDataAgentSkillDownloadResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDataAgentSkillDownloadResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadLink")
        private String downloadLink;

        @com.aliyun.core.annotation.NameInMap("IntranetDownloadLink")
        private String intranetDownloadLink;

        @com.aliyun.core.annotation.NameInMap("SkillId")
        private String skillId;

        @com.aliyun.core.annotation.NameInMap("SkillName")
        private String skillName;

        private Data(Builder builder) {
            this.downloadLink = builder.downloadLink;
            this.intranetDownloadLink = builder.intranetDownloadLink;
            this.skillId = builder.skillId;
            this.skillName = builder.skillName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return downloadLink
         */
        public String getDownloadLink() {
            return this.downloadLink;
        }

        /**
         * @return intranetDownloadLink
         */
        public String getIntranetDownloadLink() {
            return this.intranetDownloadLink;
        }

        /**
         * @return skillId
         */
        public String getSkillId() {
            return this.skillId;
        }

        /**
         * @return skillName
         */
        public String getSkillName() {
            return this.skillName;
        }

        public static final class Builder {
            private String downloadLink; 
            private String intranetDownloadLink; 
            private String skillId; 
            private String skillName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.downloadLink = model.downloadLink;
                this.intranetDownloadLink = model.intranetDownloadLink;
                this.skillId = model.skillId;
                this.skillName = model.skillName;
            } 

            /**
             * <p>The public download link.</p>
             * 
             * <strong>example:</strong>
             * <p>https://<em><strong><strong><strong>.oss-cn-hangzhou.aliyuncs.com/data_agent/skill_download/1673826</strong></strong></strong>66/ski-1giw1afhxxl6**<strong><strong><strong>ygcir/</strong></strong></strong></em>.zip?Expires=1793935883&amp;OSSAccessKeyId=STS.NXy5M8bN5wuNt*******NxDW&amp;Signature=%2FrU3FTVCAdtJJvZQvrftw6AWQug%3D&amp;response-content-disposition=attachment&amp;security-token=CAISiQR1q6Ft5B2yfSjIr5vMfveMj5EUwLeldmzA1lA6ZLlBob3vtTz2IHhMdXlrCOgYt%2F8xnG1V6f8flrJ%2FToQAX0HfatZq5ZkS9AqnaoXM%2Fte496IFg5D9pf1flOynjqHoeOzcYI734p7PAgm2FEYRrJL%2BcTK9JRPHVbSClZ9gaPkOQwC8dkAoLdxKJwxk2qh4UHzKLqSCPwLNiGjdB1YSZWMe71ly8qOi2MaRxwPDhVnhsI8vqp%2F2P4KvYrueVfWAOt6%2Bx75xbbGTknwSuRRP7%2BJ6hbBNvD7Is9eBRlJXpg6GOuzb8tRuawNweqENEqFJquS7jv55vujkm4PozRJKNO0SCnqAH9D6npWZQLr0bI9nK%2FHgOHWIi9%2BOKcD8vQM0cXZFKwRYKtQ8LWBhBhctUHbKMqPi9lTNfUK%2FQrOGlagt0pZ801zfpIXbfAnUGe%2FJi3dBY9kublsKT0dOhTG5K%2FJfLlEcKAg5WeevIN8tPEwEm8TBphbPUyBs9HZTssDlaune0qJlMt2nD8IdgNJDPc8Y6zZ3EA2qUcGnjkYFaWppRK1Oyq7mNISk6bmKzOyPaPTBDv0Xb%2BrupowlAUBnIFEnzk2ZjrVLATLwcBQLRCBzwt1KpKo%2FNH0u7BAEADeclSYSR4GYQXr9nsHtPA6ksAQWlPeWMacBiy9GOsPAqYv0GlbRDSX9P8FR8BqAARLcIr26y%2BphYuiqaegPh83GYEiMKKQS66fO%2FbR98Z9kD2BZrL%2FN3hztB48fQZyNeNE9AMmLzxuyk%2BHfEozrUOP7nvr%2F73NxdW5ydDWgil66VEwx5Grjy43Q3OZPIPUrn7t4WFMWd8oxvqgo47IApLHY3G5akK6pzYHmVrskTrtjIAA%3D</p>
             */
            public Builder downloadLink(String downloadLink) {
                this.downloadLink = downloadLink;
                return this;
            }

            /**
             * <p>The internal network download link.</p>
             * 
             * <strong>example:</strong>
             * <p>https://<em><strong><strong><strong>.oss-cn-hangzhou-internal.aliyuncs.com/data_agent/skill_download/1673826</strong></strong></strong>66/ski-1giw1afhxxl6**<strong><strong><strong>ygcir/</strong></strong></strong></em>.zip?Expires=1793935883&amp;OSSAccessKeyId=STS.NXy5M8bN5wuNt*******NxDW&amp;Signature=%2FrU3FTVCAdtJJvZQvrftw6AWQug%3D&amp;response-content-disposition=attachment&amp;security-token=CAISiQR1q6Ft5B2yfSjIr5vMfveMj5EUwLeldmzA1lA6ZLlBob3vtTz2IHhMdXlrCOgYt%2F8xnG1V6f8flrJ%2FToQAX0HfatZq5ZkS9AqnaoXM%2Fte496IFg5D9pf1flOynjqHoeOzcYI734p7PAgm2FEYRrJL%2BcTK9JRPHVbSClZ9gaPkOQwC8dkAoLdxKJwxk2qh4UHzKLqSCPwLNiGjdB1YSZWMe71ly8qOi2MaRxwPDhVnhsI8vqp%2F2P4KvYrueVfWAOt6%2Bx75xbbGTknwSuRRP7%2BJ6hbBNvD7Is9eBRlJXpg6GOuzb8tRuawNweqENEqFJquS7jv55vujkm4PozRJKNO0SCnqAH9D6npWZQLr0bI9nK%2FHgOHWIi9%2BOKcD8vQM0cXZFKwRYKtQ8LWBhBhctUHbKMqPi9lTNfUK%2FQrOGlagt0pZ801zfpIXbfAnUGe%2FJi3dBY9kublsKT0dOhTG5K%2FJfLlEcKAg5WeevIN8tPEwEm8TBphbPUyBs9HZTssDlaune0qJlMt2nD8IdgNJDPc8Y6zZ3EA2qUcGnjkYFaWppRK1Oyq7mNISk6bmKzOyPaPTBDv0Xb%2BrupowlAUBnIFEnzk2ZjrVLATLwcBQLRCBzwt1KpKo%2FNH0u7BAEADeclSYSR4GYQXr9nsHtPA6ksAQWlPeWMacBiy9GOsPAqYv0GlbRDSX9P8FR8BqAARLcIr26y%2BphYuiqaegPh83GYEiMKKQS66fO%2FbR98Z9kD2BZrL%2FN3hztB48fQZyNeNE9AMmLzxuyk%2BHfEozrUOP7nvr%2F73NxdW5ydDWgil66VEwx5Grjy43Q3OZPIPUrn7t4WFMWd8oxvqgo47IApLHY3G5akK6pzYHmVrskTrtjIAA%3D</p>
             */
            public Builder intranetDownloadLink(String intranetDownloadLink) {
                this.intranetDownloadLink = intranetDownloadLink;
                return this;
            }

            /**
             * <p>The skill ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ski-04pomiln*************j0</p>
             */
            public Builder skillId(String skillId) {
                this.skillId = skillId;
                return this;
            }

            /**
             * <p>The skill name.</p>
             * 
             * <strong>example:</strong>
             * <p>data-query-skill</p>
             */
            public Builder skillName(String skillName) {
                this.skillName = skillName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
