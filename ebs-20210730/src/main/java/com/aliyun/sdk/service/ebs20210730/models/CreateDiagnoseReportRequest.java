// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

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
 * {@link CreateDiagnoseReportRequest} extends {@link RequestModel}
 *
 * <p>CreateDiagnoseReportRequest</p>
 */
public class CreateDiagnoseReportRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DiagnoseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diagnoseType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    private String resourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private CreateDiagnoseReportRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.diagnoseType = builder.diagnoseType;
        this.endTime = builder.endTime;
        this.regionId = builder.regionId;
        this.resourceId = builder.resourceId;
        this.resourceType = builder.resourceType;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDiagnoseReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return diagnoseType
     */
    public String getDiagnoseType() {
        return this.diagnoseType;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateDiagnoseReportRequest, Builder> {
        private String clientToken; 
        private String diagnoseType; 
        private String endTime; 
        private String regionId; 
        private String resourceId; 
        private String resourceType; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateDiagnoseReportRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.diagnoseType = request.diagnoseType;
            this.endTime = request.endTime;
            this.regionId = request.regionId;
            this.resourceId = request.resourceId;
            this.resourceType = request.resourceType;
            this.startTime = request.startTime;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Performance</p>
         */
        public Builder diagnoseType(String diagnoseType) {
            this.putQueryParameter("DiagnoseType", diagnoseType);
            this.diagnoseType = diagnoseType;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * ResourceType.
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateDiagnoseReportRequest build() {
            return new CreateDiagnoseReportRequest(this);
        } 

    } 

}
