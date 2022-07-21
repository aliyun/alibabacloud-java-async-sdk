// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSoundCodeScheduleRequest} extends {@link RequestModel}
 *
 * <p>CreateSoundCodeScheduleRequest</p>
 */
public class CreateSoundCodeScheduleRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("EndDate")
    @Validation(required = true)
    private String endDate;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("OpenType")
    private String openType;

    @Body
    @NameInMap("StartDate")
    @Validation(required = true)
    private String startDate;

    private CreateSoundCodeScheduleRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.endDate = builder.endDate;
        this.iotInstanceId = builder.iotInstanceId;
        this.name = builder.name;
        this.openType = builder.openType;
        this.startDate = builder.startDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSoundCodeScheduleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return endDate
     */
    public String getEndDate() {
        return this.endDate;
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return openType
     */
    public String getOpenType() {
        return this.openType;
    }

    /**
     * @return startDate
     */
    public String getStartDate() {
        return this.startDate;
    }

    public static final class Builder extends Request.Builder<CreateSoundCodeScheduleRequest, Builder> {
        private String description; 
        private String endDate; 
        private String iotInstanceId; 
        private String name; 
        private String openType; 
        private String startDate; 

        private Builder() {
            super();
        } 

        private Builder(CreateSoundCodeScheduleRequest request) {
            super(request);
            this.description = request.description;
            this.endDate = request.endDate;
            this.iotInstanceId = request.iotInstanceId;
            this.name = request.name;
            this.openType = request.openType;
            this.startDate = request.startDate;
        } 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EndDate.
         */
        public Builder endDate(String endDate) {
            this.putBodyParameter("EndDate", endDate);
            this.endDate = endDate;
            return this;
        }

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OpenType.
         */
        public Builder openType(String openType) {
            this.putBodyParameter("OpenType", openType);
            this.openType = openType;
            return this;
        }

        /**
         * StartDate.
         */
        public Builder startDate(String startDate) {
            this.putBodyParameter("StartDate", startDate);
            this.startDate = startDate;
            return this;
        }

        @Override
        public CreateSoundCodeScheduleRequest build() {
            return new CreateSoundCodeScheduleRequest(this);
        } 

    } 

}
