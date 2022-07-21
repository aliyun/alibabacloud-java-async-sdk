// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchCreateSoundCodeLabelWithLabelsRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateSoundCodeLabelWithLabelsRequest</p>
 */
public class BatchCreateSoundCodeLabelWithLabelsRequest extends Request {
    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Body
    @NameInMap("Labels")
    @Validation(required = true)
    private java.util.List < String > labels;

    @Body
    @NameInMap("ScheduleCode")
    @Validation(required = true)
    private String scheduleCode;

    private BatchCreateSoundCodeLabelWithLabelsRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.iotInstanceId = builder.iotInstanceId;
        this.labels = builder.labels;
        this.scheduleCode = builder.scheduleCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateSoundCodeLabelWithLabelsRequest create() {
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
     * @return labels
     */
    public java.util.List < String > getLabels() {
        return this.labels;
    }

    /**
     * @return scheduleCode
     */
    public String getScheduleCode() {
        return this.scheduleCode;
    }

    public static final class Builder extends Request.Builder<BatchCreateSoundCodeLabelWithLabelsRequest, Builder> {
        private String description; 
        private String iotInstanceId; 
        private java.util.List < String > labels; 
        private String scheduleCode; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateSoundCodeLabelWithLabelsRequest request) {
            super(request);
            this.description = request.description;
            this.iotInstanceId = request.iotInstanceId;
            this.labels = request.labels;
            this.scheduleCode = request.scheduleCode;
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
         * Labels.
         */
        public Builder labels(java.util.List < String > labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
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

        @Override
        public BatchCreateSoundCodeLabelWithLabelsRequest build() {
            return new BatchCreateSoundCodeLabelWithLabelsRequest(this);
        } 

    } 

}
