// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateSoundCodeLabelRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateSoundCodeLabelRequest</p>
 */
public class BatchCreateSoundCodeLabelRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("ScheduleCode")
    @Validation(required = true)
    private String scheduleCode;

    @Body
    @NameInMap("Total")
    @Validation(required = true, maximum = 200, minimum = 1)
    private Integer total;

    private BatchCreateSoundCodeLabelRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.iotInstanceId = builder.iotInstanceId;
        this.scheduleCode = builder.scheduleCode;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateSoundCodeLabelRequest create() {
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
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return scheduleCode
     */
    public String getScheduleCode() {
        return this.scheduleCode;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder extends Request.Builder<BatchCreateSoundCodeLabelRequest, Builder> {
        private String description; 
        private String iotInstanceId; 
        private String scheduleCode; 
        private Integer total; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateSoundCodeLabelRequest request) {
            super(request);
            this.description = request.description;
            this.iotInstanceId = request.iotInstanceId;
            this.scheduleCode = request.scheduleCode;
            this.total = request.total;
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
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putBodyParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ScheduleCode.
         */
        public Builder scheduleCode(String scheduleCode) {
            this.putBodyParameter("ScheduleCode", scheduleCode);
            this.scheduleCode = scheduleCode;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Integer total) {
            this.putBodyParameter("Total", total);
            this.total = total;
            return this;
        }

        @Override
        public BatchCreateSoundCodeLabelRequest build() {
            return new BatchCreateSoundCodeLabelRequest(this);
        } 

    } 

}
