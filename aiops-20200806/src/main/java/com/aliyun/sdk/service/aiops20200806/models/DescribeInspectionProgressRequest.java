// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInspectionProgressRequest} extends {@link RequestModel}
 *
 * <p>DescribeInspectionProgressRequest</p>
 */
public class DescribeInspectionProgressRequest extends Request {
    @Body
    @NameInMap("InspectionRecordId")
    private Long inspectionRecordId;

    @Body
    @NameInMap("OperaUid")
    private String operaUid;

    private DescribeInspectionProgressRequest(Builder builder) {
        super(builder);
        this.inspectionRecordId = builder.inspectionRecordId;
        this.operaUid = builder.operaUid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInspectionProgressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return inspectionRecordId
     */
    public Long getInspectionRecordId() {
        return this.inspectionRecordId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    public static final class Builder extends Request.Builder<DescribeInspectionProgressRequest, Builder> {
        private Long inspectionRecordId; 
        private String operaUid; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInspectionProgressRequest request) {
            super(request);
            this.inspectionRecordId = request.inspectionRecordId;
            this.operaUid = request.operaUid;
        } 

        /**
         * InspectionRecordId.
         */
        public Builder inspectionRecordId(Long inspectionRecordId) {
            this.putBodyParameter("InspectionRecordId", inspectionRecordId);
            this.inspectionRecordId = inspectionRecordId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putBodyParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        @Override
        public DescribeInspectionProgressRequest build() {
            return new DescribeInspectionProgressRequest(this);
        } 

    } 

}
