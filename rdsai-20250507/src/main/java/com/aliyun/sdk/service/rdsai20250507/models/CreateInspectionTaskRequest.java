// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rdsai20250507.models;

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
 * {@link CreateInspectionTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateInspectionTaskRequest</p>
 */
public class CreateInspectionTaskRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InspectionItems")
    private String inspectionItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private CreateInspectionTaskRequest(Builder builder) {
        super(builder);
        this.endTime = builder.endTime;
        this.inspectionItems = builder.inspectionItems;
        this.instanceIds = builder.instanceIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInspectionTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return inspectionItems
     */
    public String getInspectionItems() {
        return this.inspectionItems;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateInspectionTaskRequest, Builder> {
        private String endTime; 
        private String inspectionItems; 
        private String instanceIds; 
        private String startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateInspectionTaskRequest request) {
            super(request);
            this.endTime = request.endTime;
            this.inspectionItems = request.inspectionItems;
            this.instanceIds = request.instanceIds;
            this.startTime = request.startTime;
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
         * InspectionItems.
         */
        public Builder inspectionItems(String inspectionItems) {
            this.putQueryParameter("InspectionItems", inspectionItems);
            this.inspectionItems = inspectionItems;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-2ze6mk259v322****,rm-2zef3b65430j0****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
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
        public CreateInspectionTaskRequest build() {
            return new CreateInspectionTaskRequest(this);
        } 

    } 

}
