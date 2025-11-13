// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link DescribeRecursionRecordRequest} extends {@link RequestModel}
 *
 * <p>DescribeRecursionRecordRequest</p>
 */
public class DescribeRecursionRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    private String recordId;

    private DescribeRecursionRecordRequest(Builder builder) {
        super(builder);
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRecursionRecordRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordId
     */
    public String getRecordId() {
        return this.recordId;
    }

    public static final class Builder extends Request.Builder<DescribeRecursionRecordRequest, Builder> {
        private String recordId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeRecursionRecordRequest request) {
            super(request);
            this.recordId = request.recordId;
        } 

        /**
         * RecordId.
         */
        public Builder recordId(String recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public DescribeRecursionRecordRequest build() {
            return new DescribeRecursionRecordRequest(this);
        } 

    } 

}
