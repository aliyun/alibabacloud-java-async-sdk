// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link BindLicenseDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>BindLicenseDeviceResponseBody</p>
 */
public class BindLicenseDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BindLicenseDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BindLicenseDeviceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BindLicenseDeviceResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the request fails. For more information, see the &quot;Error codes&quot; section in this topic.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.system.SystemException</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The result of the batch binding operation.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the request fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E4F94B97-1D64-4080-BFD2-67461667AA43</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BindLicenseDeviceResponseBody build() {
            return new BindLicenseDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BindLicenseDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>BindLicenseDeviceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CheckProgressId")
        private String checkProgressId;

        @com.aliyun.core.annotation.NameInMap("FailSum")
        private Long failSum;

        @com.aliyun.core.annotation.NameInMap("Progress")
        private Integer progress;

        @com.aliyun.core.annotation.NameInMap("ResultCsvFile")
        private String resultCsvFile;

        @com.aliyun.core.annotation.NameInMap("SuccessSum")
        private Long successSum;

        private Data(Builder builder) {
            this.checkProgressId = builder.checkProgressId;
            this.failSum = builder.failSum;
            this.progress = builder.progress;
            this.resultCsvFile = builder.resultCsvFile;
            this.successSum = builder.successSum;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return checkProgressId
         */
        public String getCheckProgressId() {
            return this.checkProgressId;
        }

        /**
         * @return failSum
         */
        public Long getFailSum() {
            return this.failSum;
        }

        /**
         * @return progress
         */
        public Integer getProgress() {
            return this.progress;
        }

        /**
         * @return resultCsvFile
         */
        public String getResultCsvFile() {
            return this.resultCsvFile;
        }

        /**
         * @return successSum
         */
        public Long getSuccessSum() {
            return this.successSum;
        }

        public static final class Builder {
            private String checkProgressId; 
            private Long failSum; 
            private Integer progress; 
            private String resultCsvFile; 
            private Long successSum; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.checkProgressId = model.checkProgressId;
                this.failSum = model.failSum;
                this.progress = model.progress;
                this.resultCsvFile = model.resultCsvFile;
                this.successSum = model.successSum;
            } 

            /**
             * <p>The unique ID that can be used to query the progress of the batch binding operation.</p>
             * 
             * <strong>example:</strong>
             * <p>123***</p>
             */
            public Builder checkProgressId(String checkProgressId) {
                this.checkProgressId = checkProgressId;
                return this;
            }

            /**
             * <p>The number of devices that failed to be bound to the license.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder failSum(Long failSum) {
                this.failSum = failSum;
                return this;
            }

            /**
             * <p>The progress of the batch binding operation. The progress is a percentage. Valid values: 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder progress(Integer progress) {
                this.progress = progress;
                return this;
            }

            /**
             * <p>The URL of the file that contains unbound devices. The devices failed to be bound to the license.</p>
             * 
             * <strong>example:</strong>
             * <p>http://***</p>
             */
            public Builder resultCsvFile(String resultCsvFile) {
                this.resultCsvFile = resultCsvFile;
                return this;
            }

            /**
             * <p>The number of devices to which the license is successfully bound.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder successSum(Long successSum) {
                this.successSum = successSum;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
