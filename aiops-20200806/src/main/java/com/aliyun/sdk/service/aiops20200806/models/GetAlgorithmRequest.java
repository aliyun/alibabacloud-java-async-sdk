// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAlgorithmRequest} extends {@link RequestModel}
 *
 * <p>GetAlgorithmRequest</p>
 */
public class GetAlgorithmRequest extends Request {
    @Query
    @NameInMap("ExpandInformation")
    private String expandInformation;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("MetricName")
    private String metricName;

    @Query
    @NameInMap("OperaUid")
    private String operaUid;

    @Query
    @NameInMap("PageNum")
    private Integer pageNum;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    private GetAlgorithmRequest(Builder builder) {
        super(builder);
        this.expandInformation = builder.expandInformation;
        this.instanceId = builder.instanceId;
        this.metricName = builder.metricName;
        this.operaUid = builder.operaUid;
        this.pageNum = builder.pageNum;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAlgorithmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expandInformation
     */
    public String getExpandInformation() {
        return this.expandInformation;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return metricName
     */
    public String getMetricName() {
        return this.metricName;
    }

    /**
     * @return operaUid
     */
    public String getOperaUid() {
        return this.operaUid;
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

    public static final class Builder extends Request.Builder<GetAlgorithmRequest, Builder> {
        private String expandInformation; 
        private String instanceId; 
        private String metricName; 
        private String operaUid; 
        private Integer pageNum; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetAlgorithmRequest request) {
            super(request);
            this.expandInformation = request.expandInformation;
            this.instanceId = request.instanceId;
            this.metricName = request.metricName;
            this.operaUid = request.operaUid;
            this.pageNum = request.pageNum;
            this.pageSize = request.pageSize;
        } 

        /**
         * ExpandInformation.
         */
        public Builder expandInformation(String expandInformation) {
            this.putQueryParameter("ExpandInformation", expandInformation);
            this.expandInformation = expandInformation;
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
         * MetricName.
         */
        public Builder metricName(String metricName) {
            this.putQueryParameter("MetricName", metricName);
            this.metricName = metricName;
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
         * PageNum.
         */
        public Builder pageNum(Integer pageNum) {
            this.putQueryParameter("PageNum", pageNum);
            this.pageNum = pageNum;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetAlgorithmRequest build() {
            return new GetAlgorithmRequest(this);
        } 

    } 

}
