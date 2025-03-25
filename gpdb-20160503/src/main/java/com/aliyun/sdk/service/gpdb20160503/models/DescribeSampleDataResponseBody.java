// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
 * {@link DescribeSampleDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSampleDataResponseBody</p>
 */
public class DescribeSampleDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    private String DBInstanceId;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HasSampleData")
    private Boolean hasSampleData;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SampleDataStatus")
    private String sampleDataStatus;

    private DescribeSampleDataResponseBody(Builder builder) {
        this.DBInstanceId = builder.DBInstanceId;
        this.errorMessage = builder.errorMessage;
        this.hasSampleData = builder.hasSampleData;
        this.requestId = builder.requestId;
        this.sampleDataStatus = builder.sampleDataStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSampleDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return hasSampleData
     */
    public Boolean getHasSampleData() {
        return this.hasSampleData;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sampleDataStatus
     */
    public String getSampleDataStatus() {
        return this.sampleDataStatus;
    }

    public static final class Builder {
        private String DBInstanceId; 
        private String errorMessage; 
        private Boolean hasSampleData; 
        private String requestId; 
        private String sampleDataStatus; 

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp12ga6v69h86****</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The error message returned if an error occurs. This message does not affect the execution of the operation.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>Indicates whether a sample dataset is loaded to the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: A sample dataset is loaded.</li>
         * <li><strong>false</strong>: No sample dataset is loaded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder hasSampleData(Boolean hasSampleData) {
            this.hasSampleData = hasSampleData;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>84CD7CAF-FA7B-5178-B19F-D8CDE307D5FA_8111</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The loading status of the sample dataset. Valid values:</p>
         * <ul>
         * <li><strong>loaded</strong></li>
         * <li><strong>loading</strong></li>
         * <li><strong>unload</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>loaded</p>
         */
        public Builder sampleDataStatus(String sampleDataStatus) {
            this.sampleDataStatus = sampleDataStatus;
            return this;
        }

        public DescribeSampleDataResponseBody build() {
            return new DescribeSampleDataResponseBody(this);
        } 

    } 

}
