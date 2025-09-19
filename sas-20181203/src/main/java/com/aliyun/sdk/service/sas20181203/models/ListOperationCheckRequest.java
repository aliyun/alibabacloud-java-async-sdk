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
 * {@link ListOperationCheckRequest} extends {@link RequestModel}
 *
 * <p>ListOperationCheckRequest</p>
 */
public class ListOperationCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private Long checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationTaskInstances")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<OperationTaskInstances> operationTaskInstances;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private Long startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private ListOperationCheckRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.endTime = builder.endTime;
        this.lang = builder.lang;
        this.operationTaskInstances = builder.operationTaskInstances;
        this.startTime = builder.startTime;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOperationCheckRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public Long getCheckId() {
        return this.checkId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return operationTaskInstances
     */
    public java.util.List<OperationTaskInstances> getOperationTaskInstances() {
        return this.operationTaskInstances;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<ListOperationCheckRequest, Builder> {
        private Long checkId; 
        private Long endTime; 
        private String lang; 
        private java.util.List<OperationTaskInstances> operationTaskInstances; 
        private Long startTime; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(ListOperationCheckRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.endTime = request.endTime;
            this.lang = request.lang;
            this.operationTaskInstances = request.operationTaskInstances;
            this.startTime = request.startTime;
            this.type = request.type;
        } 

        /**
         * <p>Check item ID.</p>
         * <blockquote>
         * <p>Obtain this parameter by calling the <a href="~~ListCheckResult~~">ListCheckResult</a> interface.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        public Builder checkId(Long checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * <p>Timestamp (in milliseconds) of the end time of the queried task.</p>
         * 
         * <strong>example:</strong>
         * <p>1719923175001</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Language type for request and response messages, default value is zh. Values:</p>
         * <ul>
         * <li><strong>zh</strong>: Chinese</li>
         * <li><strong>en</strong>: English</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Information about the operated instances.</p>
         * <p>This parameter is required.</p>
         */
        public Builder operationTaskInstances(java.util.List<OperationTaskInstances> operationTaskInstances) {
            this.putQueryParameter("OperationTaskInstances", operationTaskInstances);
            this.operationTaskInstances = operationTaskInstances;
            return this;
        }

        /**
         * <p>Timestamp (in milliseconds) of the start time of the queried task.</p>
         * 
         * <strong>example:</strong>
         * <p>1719923175000</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>Task type corresponding to the task:</p>
         * <ul>
         * <li><strong>REPAIR</strong>: Repair task</li>
         * <li><strong>ROLLBACK</strong>: Rollback task</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>REPAIR</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public ListOperationCheckRequest build() {
            return new ListOperationCheckRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListOperationCheckRequest} extends {@link TeaModel}
     *
     * <p>ListOperationCheckRequest</p>
     */
    public static class OperationTaskInstances extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Vendor")
        private String vendor;

        private OperationTaskInstances(Builder builder) {
            this.instanceId = builder.instanceId;
            this.regionId = builder.regionId;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OperationTaskInstances create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return vendor
         */
        public String getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String instanceId; 
            private String regionId; 
            private String vendor; 

            private Builder() {
            } 

            private Builder(OperationTaskInstances model) {
                this.instanceId = model.instanceId;
                this.regionId = model.regionId;
                this.vendor = model.vendor;
            } 

            /**
             * <p>Cloud asset instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>r-bp1642ib4bg2bm****</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>Region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>Asset vendor. Values:</p>
             * <ul>
             * <li><strong>ALIYUN</strong>: Alibaba Cloud</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder vendor(String vendor) {
                this.vendor = vendor;
                return this;
            }

            public OperationTaskInstances build() {
                return new OperationTaskInstances(this);
            } 

        } 

    }
}
