// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eduembed20240101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLabRequest} extends {@link RequestModel}
 *
 * <p>DescribeLabRequest</p>
 */
public class DescribeLabRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LabId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long labId;

    private DescribeLabRequest(Builder builder) {
        super(builder);
        this.labId = builder.labId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLabRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return labId
     */
    public Long getLabId() {
        return this.labId;
    }

    public static final class Builder extends Request.Builder<DescribeLabRequest, Builder> {
        private Long labId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLabRequest request) {
            super(request);
            this.labId = request.labId;
        } 

        /**
         * LabId.
         */
        public Builder labId(Long labId) {
            this.putQueryParameter("LabId", labId);
            this.labId = labId;
            return this;
        }

        @Override
        public DescribeLabRequest build() {
            return new DescribeLabRequest(this);
        } 

    } 

}
