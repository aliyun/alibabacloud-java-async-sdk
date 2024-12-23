// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

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
 * {@link GetDoctorReportComponentSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetDoctorReportComponentSummaryRequest</p>
 */
public class GetDoctorReportComponentSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String componentType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetDoctorReportComponentSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentType = builder.componentType;
        this.dateTime = builder.dateTime;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorReportComponentSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return componentType
     */
    public String getComponentType() {
        return this.componentType;
    }

    /**
     * @return dateTime
     */
    public String getDateTime() {
        return this.dateTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<GetDoctorReportComponentSummaryRequest, Builder> {
        private String clusterId; 
        private String componentType; 
        private String dateTime; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDoctorReportComponentSummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentType = request.componentType;
            this.dateTime = request.dateTime;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>Select component filter type. Values: </p>
         * <ul>
         * <li>compute </li>
         * <li>hive</li>
         * <li>hdfs</li>
         * <li>yarn</li>
         * <li>oss</li>
         * <li>hbase</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>compute</p>
         */
        public Builder componentType(String componentType) {
            this.putQueryParameter("ComponentType", componentType);
            this.componentType = componentType;
            return this;
        }

        /**
         * <p>Report date.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-01-01</p>
         */
        public Builder dateTime(String dateTime) {
            this.putQueryParameter("DateTime", dateTime);
            this.dateTime = dateTime;
            return this;
        }

        /**
         * <p>Region ID.</p>
         * <p>This parameter is required.</p>
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
        public GetDoctorReportComponentSummaryRequest build() {
            return new GetDoctorReportComponentSummaryRequest(this);
        } 

    } 

}
