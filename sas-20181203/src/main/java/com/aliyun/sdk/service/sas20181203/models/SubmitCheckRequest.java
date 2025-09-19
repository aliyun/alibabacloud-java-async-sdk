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
 * {@link SubmitCheckRequest} extends {@link RequestModel}
 *
 * <p>SubmitCheckRequest</p>
 */
public class SubmitCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScanRange")
    private String scanRange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskSource")
    private String taskSource;

    private SubmitCheckRequest(Builder builder) {
        super(builder);
        this.scanRange = builder.scanRange;
        this.taskSource = builder.taskSource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return scanRange
     */
    public String getScanRange() {
        return this.scanRange;
    }

    /**
     * @return taskSource
     */
    public String getTaskSource() {
        return this.taskSource;
    }

    public static final class Builder extends Request.Builder<SubmitCheckRequest, Builder> {
        private String scanRange; 
        private String taskSource; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCheckRequest request) {
            super(request);
            this.scanRange = request.scanRange;
            this.taskSource = request.taskSource;
        } 

        /**
         * <p>The check items that are scanned. Valid values:</p>
         * <ul>
         * <li><strong>FULL</strong>: All check items are scanned.</li>
         * <li><strong>FULL</strong>: Only the check items that are configured are scanned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POLICY</p>
         */
        public Builder scanRange(String scanRange) {
            this.putQueryParameter("ScanRange", scanRange);
            this.scanRange = scanRange;
            return this;
        }

        /**
         * TaskSource.
         */
        public Builder taskSource(String taskSource) {
            this.putQueryParameter("TaskSource", taskSource);
            this.taskSource = taskSource;
            return this;
        }

        @Override
        public SubmitCheckRequest build() {
            return new SubmitCheckRequest(this);
        } 

    } 

}
