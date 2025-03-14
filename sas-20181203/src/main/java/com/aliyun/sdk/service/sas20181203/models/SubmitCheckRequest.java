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

    private SubmitCheckRequest(Builder builder) {
        super(builder);
        this.scanRange = builder.scanRange;
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

    public static final class Builder extends Request.Builder<SubmitCheckRequest, Builder> {
        private String scanRange; 

        private Builder() {
            super();
        } 

        private Builder(SubmitCheckRequest request) {
            super(request);
            this.scanRange = request.scanRange;
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

        @Override
        public SubmitCheckRequest build() {
            return new SubmitCheckRequest(this);
        } 

    } 

}
