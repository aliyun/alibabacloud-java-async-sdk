// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

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
 * {@link QueryRIUtilizationDetailRequest} extends {@link RequestModel}
 *
 * <p>QueryRIUtilizationDetailRequest</p>
 */
public class QueryRIUtilizationDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeductedInstanceId")
    private String deductedInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceSpec")
    private String instanceSpec;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNum")
    private Integer pageNum;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RICommodityCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String RICommodityCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RIInstanceId")
    private String RIInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    private QueryRIUtilizationDetailRequest(Builder builder) {
        super(builder);
        this.deductedInstanceId = builder.deductedInstanceId;
        this.endTime = builder.endTime;
        this.instanceSpec = builder.instanceSpec;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
        this.RICommodityCode = builder.RICommodityCode;
        this.RIInstanceId = builder.RIInstanceId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRIUtilizationDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deductedInstanceId
     */
    public String getDeductedInstanceId() {
        return this.deductedInstanceId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return instanceSpec
     */
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    /**
     * @return pageNum
     */
    public Integer getPageNum() {
        return this.pageNum;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return RICommodityCode
     */
    public String getRICommodityCode() {
        return this.RICommodityCode;
    }

    /**
     * @return RIInstanceId
     */
    public String getRIInstanceId() {
        return this.RIInstanceId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<QueryRIUtilizationDetailRequest, Builder> {
        private String deductedInstanceId; 
        private String endTime; 
        private String instanceSpec; 
        private Integer pageNum; 
        private Integer pageSize; 
        private String RICommodityCode; 
        private String RIInstanceId; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(QueryRIUtilizationDetailRequest request) {
            super(request);
            this.deductedInstanceId = request.deductedInstanceId;
            this.endTime = request.endTime;
            this.instanceSpec = request.instanceSpec;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
            this.RICommodityCode = request.RICommodityCode;
            this.RIInstanceId = request.RIInstanceId;
            this.startTime = request.startTime;
        } 

        /**
         * <p>The ID of the instance whose fees are deducted by using the RI. If this parameter is left empty, the usage details of all instances are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>jsdgfsdhgsdjh</p>
         */
        public Builder deductedInstanceId(String deductedInstanceId) {
            this.putQueryParameter("DeductedInstanceId", deductedInstanceId);
            this.deductedInstanceId = deductedInstanceId;
            return this;
        }

        /**
         * <p>The time when the RI expires. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-23 12:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The instance type of the RI.</p>
         * 
         * <strong>example:</strong>
         * <p>Instancetyp</p>
         */
        public Builder instanceSpec(String instanceSpec) {
            this.putQueryParameter("InstanceSpec", instanceSpec);
            this.instanceSpec = instanceSpec;
            return this;
        }

        /**
         * <p>The number of the page to return. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * <p>The number of entries to return on each page. Default value: 20. Maximum value: 300.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The code of the service to which the RI is applied. Default value: ecsRi. Valid values:</p>
         * <ul>
         * <li>ecsRi: ECS RI.</li>
         * <li>scu_bag: storage capacity unit (SCU).</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ecsRi</p>
         */
        public Builder RICommodityCode(String RICommodityCode) {
            this.putQueryParameter("RICommodityCode", RICommodityCode);
            this.RICommodityCode = RICommodityCode;
            return this;
        }

        /**
         * <p>The ID of the RI. If this parameter is left empty, the usage details of all RIs are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>dsudfgdsjh</p>
         */
        public Builder RIInstanceId(String RIInstanceId) {
            this.putQueryParameter("RIInstanceId", RIInstanceId);
            this.RIInstanceId = RIInstanceId;
            return this;
        }

        /**
         * <p>The time when the RI was created. Specify the time in the YYYY-MM-DD HH:mm:ss format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-05-23 12:00:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public QueryRIUtilizationDetailRequest build() {
            return new QueryRIUtilizationDetailRequest(this);
        } 

    } 

}
