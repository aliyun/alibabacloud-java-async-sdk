// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

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
 * {@link CancelOperationTicketRequest} extends {@link RequestModel}
 *
 * <p>CancelOperationTicketRequest</p>
 */
public class CancelOperationTicketRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationTicketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operationTicketId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private CancelOperationTicketRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.operationTicketId = builder.operationTicketId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelOperationTicketRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operationTicketId
     */
    public String getOperationTicketId() {
        return this.operationTicketId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CancelOperationTicketRequest, Builder> {
        private String instanceId; 
        private String operationTicketId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CancelOperationTicketRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.operationTicketId = request.operationTicketId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The instance ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/153281.html">DescribeInstances</a> operation to obtain this parameter.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bastionhost-cn-78v1gh****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The ID of the O&amp;M request to be withdrawn.</p>
         * <blockquote>
         * <p>You can only withdraw O&amp;M requests that have not been fully approved.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder operationTicketId(String operationTicketId) {
            this.putQueryParameter("OperationTicketId", operationTicketId);
            this.operationTicketId = operationTicketId;
            return this;
        }

        /**
         * <p>The region ID of the Bastionhost instance.</p>
         * <blockquote>
         * <p>For more information about the mapping between region IDs and region names, see <a href="https://help.aliyun.com/document_detail/40654.html">Regions and zones</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CancelOperationTicketRequest build() {
            return new CancelOperationTicketRequest(this);
        } 

    } 

}
