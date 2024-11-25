// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeZoneRecordRequest} extends {@link RequestModel}
 *
 * <p>DescribeZoneRecordRequest</p>
 */
public class DescribeZoneRecordRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RecordId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long recordId;

    private DescribeZoneRecordRequest(Builder builder) {
        super(builder);
        this.recordId = builder.recordId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeZoneRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordId
     */
    public Long getRecordId() {
        return this.recordId;
    }

    public static final class Builder extends Request.Builder<DescribeZoneRecordRequest, Builder> {
        private Long recordId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeZoneRecordRequest request) {
            super(request);
            this.recordId = request.recordId;
        } 

        /**
         * <p>The ID of the DNS record.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5808</p>
         */
        public Builder recordId(Long recordId) {
            this.putQueryParameter("RecordId", recordId);
            this.recordId = recordId;
            return this;
        }

        @Override
        public DescribeZoneRecordRequest build() {
            return new DescribeZoneRecordRequest(this);
        } 

    } 

}
