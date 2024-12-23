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
 * {@link GetDoctorComputeSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetDoctorComputeSummaryRequest</p>
 */
public class GetDoctorComputeSummaryRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComponentInfo")
    private ComponentInfo componentInfo;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DateTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dateTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private GetDoctorComputeSummaryRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.componentInfo = builder.componentInfo;
        this.dateTime = builder.dateTime;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDoctorComputeSummaryRequest create() {
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
     * @return componentInfo
     */
    public ComponentInfo getComponentInfo() {
        return this.componentInfo;
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

    public static final class Builder extends Request.Builder<GetDoctorComputeSummaryRequest, Builder> {
        private String clusterId; 
        private ComponentInfo componentInfo; 
        private String dateTime; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(GetDoctorComputeSummaryRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.componentInfo = request.componentInfo;
            this.dateTime = request.dateTime;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The cluster ID.</p>
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
         * <p>The resource information, which is used to filter the results.</p>
         */
        public Builder componentInfo(ComponentInfo componentInfo) {
            this.putQueryParameter("ComponentInfo", componentInfo);
            this.componentInfo = componentInfo;
            return this;
        }

        /**
         * <p>Specify the date in the ISO 8601 standard. For example, 2023-01-01 represents January 1, 2023.</p>
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
         * <p>The region ID.</p>
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
        public GetDoctorComputeSummaryRequest build() {
            return new GetDoctorComputeSummaryRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetDoctorComputeSummaryRequest} extends {@link TeaModel}
     *
     * <p>GetDoctorComputeSummaryRequest</p>
     */
    public static class ComponentInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ComponentName")
        private String componentName;

        @com.aliyun.core.annotation.NameInMap("ComponentType")
        private String componentType;

        private ComponentInfo(Builder builder) {
            this.componentName = builder.componentName;
            this.componentType = builder.componentType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComponentInfo create() {
            return builder().build();
        }

        /**
         * @return componentName
         */
        public String getComponentName() {
            return this.componentName;
        }

        /**
         * @return componentType
         */
        public String getComponentType() {
            return this.componentType;
        }

        public static final class Builder {
            private String componentName; 
            private String componentType; 

            /**
             * <p>Set the filter condition name based on the value of ComponentType. For example, if you set ComponentType to queue, you can specify a specific queue name to obtain the resource usage of a specific queue.</p>
             * 
             * <strong>example:</strong>
             * <p>MAPREDUCE</p>
             */
            public Builder componentName(String componentName) {
                this.componentName = componentName;
                return this;
            }

            /**
             * <p>The resource type for filtering. Valid values:</p>
             * <ul>
             * <li>engine: filters results by engine.</li>
             * <li>queue: filters results by queue.</li>
             * <li>cluster: displays the results at the cluster level.</li>
             * </ul>
             * <p>If you do not specify this parameter, the information at the cluster level is displayed by default.</p>
             * 
             * <strong>example:</strong>
             * <p>engine</p>
             */
            public Builder componentType(String componentType) {
                this.componentType = componentType;
                return this;
            }

            public ComponentInfo build() {
                return new ComponentInfo(this);
            } 

        } 

    }
}
