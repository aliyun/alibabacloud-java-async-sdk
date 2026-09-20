// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ExportRecallManagementTableResponseBody} extends {@link TeaModel}
 *
 * <p>ExportRecallManagementTableResponseBody</p>
 */
public class ExportRecallManagementTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecallManagementJobId")
    private String recallManagementJobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExportRecallManagementTableResponseBody(Builder builder) {
        this.recallManagementJobId = builder.recallManagementJobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportRecallManagementTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recallManagementJobId
     */
    public String getRecallManagementJobId() {
        return this.recallManagementJobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String recallManagementJobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ExportRecallManagementTableResponseBody model) {
            this.recallManagementJobId = model.recallManagementJobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The export job ID. Use this ID to track the job\&quot;s status.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder recallManagementJobId(String recallManagementJobId) {
            this.recallManagementJobId = recallManagementJobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExportRecallManagementTableResponseBody build() {
            return new ExportRecallManagementTableResponseBody(this);
        } 

    } 

}
