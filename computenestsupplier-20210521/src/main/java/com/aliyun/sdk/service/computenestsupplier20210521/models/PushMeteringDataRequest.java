// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushMeteringDataRequest} extends {@link RequestModel}
 *
 * <p>PushMeteringDataRequest</p>
 */
public class PushMeteringDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Metering")
    @com.aliyun.core.annotation.Validation(required = true)
    private String metering;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceInstanceId;

    private PushMeteringDataRequest(Builder builder) {
        super(builder);
        this.metering = builder.metering;
        this.serviceInstanceId = builder.serviceInstanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushMeteringDataRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metering
     */
    public String getMetering() {
        return this.metering;
    }

    /**
     * @return serviceInstanceId
     */
    public String getServiceInstanceId() {
        return this.serviceInstanceId;
    }

    public static final class Builder extends Request.Builder<PushMeteringDataRequest, Builder> {
        private String metering; 
        private String serviceInstanceId; 

        private Builder() {
            super();
        } 

        private Builder(PushMeteringDataRequest request) {
            super(request);
            this.metering = request.metering;
            this.serviceInstanceId = request.serviceInstanceId;
        } 

        /**
         * The metering data. Parameters in the example value:
         * <p>
         * 
         * *   InstanceId: the ID of an instance in Alibaba Cloud Marketplace. Parameter type: STRING.
         * 
         * *   StartTime: the time when the metering operation started. Set the parameter to a UNIX timestamp. Unit: seconds. Parameter type: LONG.
         * 
         * *   EndTime: the time when the metering operation ended. Set the parameter to a UNIX timestamp. Unit: seconds. Parameter type: LONG.
         * 
         * *   Entities: the metering entities. Parameter type: LIST.
         * 
         *     *   Key: the name of the metering item. Parameter type: STRING.
         * 
         *         *   Frequency: the number of times the instance was used.
         *         *   Period: the usage duration of the instance. Unit: seconds.
         * 
         *     Note: The metering unit is second, whereas the billing unit is hour. Therefore, when bills are generated, seconds are converted to hours. For example, the usage metered from 19:00 to 20:00 is 1800 seconds and the price is USD 1 per hour. In this case, the hourly bill for 19:00 to 20:00 is calculated by using the following formula: 1800/3600 x 1 = 0.5. If the result is a decimal, only the first two decimal places are retained.
         * 
         *           - Storage: The used storage space. Unit: bytes.   
         *            Note: The metering unit is byte, whereas the billing unit is MB. Therefore, when bills are generated, bytes are converted to megabytes. For example, the usage metered from 19:00 to 20:00 is 524,288 bytes and the price is USD 1 per MB. In this case, the hourly bill for 19:00 to 20:00 is calculated by using the following formula: 524288/1024/1024 x 1 = 0.5. If the result is a decimal, only the first two decimal places are retained.  - NetworkOut: the upstream traffic consumed. Unit: bit.  
         *            Note: The metering unit is bit, whereas the billing unit is Mbit. Therefore, when bills are generated, bits are converted to megabits. For example, the usage metered from 19:00 to 20:00 is 524,288 bits and the price is USD 1 per Mbit. In this case, the hourly bill for 19:00 to 20:00 is calculated by using the following formula: 524288/1024/1024 x 1 = 0.5. If the result is a decimal, only the first two decimal places are retained.  - NetworkIn: the downstream traffic consumed. Unit: bit.  
         *            Note: The metering unit is bit, whereas the billing unit is Mbit. Therefore, when bills are generated, bits are converted to megabits. For example, the usage metered from 19:00 to 20:00 is 524,288 bits and the price is USD 1 per Mbit. In this case, the hourly bill for 19:00 to 20:00 is calculated by using the following formula: 524288/1024/1024 x 1 = 0.5. If the result is a decimal, only the first two decimal places are retained.  - Character: the number of characters.
         *           - DailyActiveUser: the number of daily active users (DAU).
         *           - PeriodMin: the usage duration of the instance. Unit: minutes.  - VirtualCpu: the number of virtual CPU cores.
         * 
         *     *   Value: the value of the metering item. The value is equal to or greater than 0. Parameter type: INTEGER.
         * 
         * **Note**:
         * 
         * *   If bills are generated for the commodity in real time, the difference between the values of StartTime and EndTime is not limited. However, the time specified by EndTime must be later than that specified by StartTime.
         * *   If bills are generated for the commodity by billing cycle, such as by hour, by day, or by month, the difference between the values of StartTime and EndTime must be greater than 5 minutes.
         * *   In a request for pushing multiple metering data records, the values of InstanceId must indicate instances of the same commodity. You cannot push metering data of instances of multiple commodities at a time.
         */
        public Builder metering(String metering) {
            this.putQueryParameter("Metering", metering);
            this.metering = metering;
            return this;
        }

        /**
         * The service instance ID.
         */
        public Builder serviceInstanceId(String serviceInstanceId) {
            this.putQueryParameter("ServiceInstanceId", serviceInstanceId);
            this.serviceInstanceId = serviceInstanceId;
            return this;
        }

        @Override
        public PushMeteringDataRequest build() {
            return new PushMeteringDataRequest(this);
        } 

    } 

}
