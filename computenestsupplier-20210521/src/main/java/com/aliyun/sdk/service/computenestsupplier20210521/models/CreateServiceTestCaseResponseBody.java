// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

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
 * {@link CreateServiceTestCaseResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceTestCaseResponseBody</p>
 */
public class CreateServiceTestCaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TestCaseId")
    private String testCaseId;

    private CreateServiceTestCaseResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.testCaseId = builder.testCaseId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceTestCaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return testCaseId
     */
    public String getTestCaseId() {
        return this.testCaseId;
    }

    public static final class Builder {
        private String requestId; 
        private String testCaseId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>E50287CB-AABF-4877-92C0-289B339A1546</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The test case Id</p>
         * 
         * <strong>example:</strong>
         * <p>stc-5ba03a6a9a2746be8739</p>
         */
        public Builder testCaseId(String testCaseId) {
            this.testCaseId = testCaseId;
            return this;
        }

        public CreateServiceTestCaseResponseBody build() {
            return new CreateServiceTestCaseResponseBody(this);
        } 

    } 

}
