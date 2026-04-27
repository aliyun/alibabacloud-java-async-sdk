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
 * {@link OperateUnknownThreatDetectMachineRequest} extends {@link RequestModel}
 *
 * <p>OperateUnknownThreatDetectMachineRequest</p>
 */
public class OperateUnknownThreatDetectMachineRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperateType")
    private String operateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UuidList")
    private java.util.List<String> uuidList;

    private OperateUnknownThreatDetectMachineRequest(Builder builder) {
        super(builder);
        this.operateType = builder.operateType;
        this.status = builder.status;
        this.uuidList = builder.uuidList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperateUnknownThreatDetectMachineRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return operateType
     */
    public String getOperateType() {
        return this.operateType;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return uuidList
     */
    public java.util.List<String> getUuidList() {
        return this.uuidList;
    }

    public static final class Builder extends Request.Builder<OperateUnknownThreatDetectMachineRequest, Builder> {
        private String operateType; 
        private String status; 
        private java.util.List<String> uuidList; 

        private Builder() {
            super();
        } 

        private Builder(OperateUnknownThreatDetectMachineRequest request) {
            super(request);
            this.operateType = request.operateType;
            this.status = request.status;
            this.uuidList = request.uuidList;
        } 

        /**
         * OperateType.
         */
        public Builder operateType(String operateType) {
            this.putQueryParameter("OperateType", operateType);
            this.operateType = operateType;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        /**
         * UuidList.
         */
        public Builder uuidList(java.util.List<String> uuidList) {
            this.putQueryParameter("UuidList", uuidList);
            this.uuidList = uuidList;
            return this;
        }

        @Override
        public OperateUnknownThreatDetectMachineRequest build() {
            return new OperateUnknownThreatDetectMachineRequest(this);
        } 

    } 

}
