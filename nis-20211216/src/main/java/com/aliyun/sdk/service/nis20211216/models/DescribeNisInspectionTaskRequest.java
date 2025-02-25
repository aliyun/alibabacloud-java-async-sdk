// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNisInspectionTaskRequest} extends {@link RequestModel}
 *
 * <p>DescribeNisInspectionTaskRequest</p>
 */
public class DescribeNisInspectionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionTaskId")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 128, minLength = 1)
    private String inspectionTaskId;

    private DescribeNisInspectionTaskRequest(Builder builder) {
        super(builder);
        this.inspectionTaskId = builder.inspectionTaskId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNisInspectionTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inspectionTaskId
     */
    public String getInspectionTaskId() {
        return this.inspectionTaskId;
    }

    public static final class Builder extends Request.Builder<DescribeNisInspectionTaskRequest, Builder> {
        private String inspectionTaskId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNisInspectionTaskRequest request) {
            super(request);
            this.inspectionTaskId = request.inspectionTaskId;
        } 

        /**
         * InspectionTaskId.
         */
        public Builder inspectionTaskId(String inspectionTaskId) {
            this.putQueryParameter("InspectionTaskId", inspectionTaskId);
            this.inspectionTaskId = inspectionTaskId;
            return this;
        }

        @Override
        public DescribeNisInspectionTaskRequest build() {
            return new DescribeNisInspectionTaskRequest(this);
        } 

    } 

}
