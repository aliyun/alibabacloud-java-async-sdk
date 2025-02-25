// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeResourceMetricRequest} extends {@link RequestModel}
 *
 * <p>DescribeResourceMetricRequest</p>
 */
public class DescribeResourceMetricRequest extends Request {
    @Query
    @NameInMap("EventId")
    @Validation(required = true)
    private String eventId;

    @Query
    @NameInMap("FirstLoad")
    private Integer firstLoad;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("ProductCode")
    private String productCode;

    private DescribeResourceMetricRequest(Builder builder) {
        super(builder);
        this.eventId = builder.eventId;
        this.firstLoad = builder.firstLoad;
        this.instanceId = builder.instanceId;
        this.operaUid = builder.operaUid;
        this.productCode = builder.productCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeResourceMetricRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventId
     */
    public String getEventId() {
        return this.eventId;
    }

    /**
     * @return firstLoad
     */
    public Integer getFirstLoad() {
        return this.firstLoad;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    public static final class Builder extends Request.Builder<DescribeResourceMetricRequest, Builder> {
        private String eventId; 
        private Integer firstLoad; 
        private String instanceId; 
        private String operaUid; 
        private String productCode; 

        private Builder() {
            super();
        } 

        private Builder(DescribeResourceMetricRequest request) {
            super(request);
            this.eventId = request.eventId;
            this.firstLoad = request.firstLoad;
            this.instanceId = request.instanceId;
            this.operaUid = request.operaUid;
            this.productCode = request.productCode;
        } 

        /**
         * EventId.
         */
        public Builder eventId(String eventId) {
            this.putQueryParameter("EventId", eventId);
            this.eventId = eventId;
            return this;
        }

        /**
         * FirstLoad.
         */
        public Builder firstLoad(Integer firstLoad) {
            this.putQueryParameter("FirstLoad", firstLoad);
            this.firstLoad = firstLoad;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * OperaUid.
         */
        public Builder operaUid(String operaUid) {
            this.putQueryParameter("OperaUid", operaUid);
            this.operaUid = operaUid;
            return this;
        }

        /**
         * ProductCode.
         */
        public Builder productCode(String productCode) {
            this.putQueryParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        @Override
        public DescribeResourceMetricRequest build() {
            return new DescribeResourceMetricRequest(this);
        } 

    } 

}
