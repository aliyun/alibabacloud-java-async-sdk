// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link DetectImageCarsResponseBody} extends {@link TeaModel}
 *
 * <p>DetectImageCarsResponseBody</p>
 */
public class DetectImageCarsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cars")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Car> cars;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DetectImageCarsResponseBody(Builder builder) {
        this.cars = builder.cars;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetectImageCarsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cars
     */
    public java.util.List<Car> getCars() {
        return this.cars;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Car> cars; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DetectImageCarsResponseBody model) {
            this.cars = model.cars;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The vehicles.</p>
         * <p>This parameter is required.</p>
         */
        public Builder cars(java.util.List<Car> cars) {
            this.cars = cars;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A8745209-DD0E-027E-8ABA-085E0C******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DetectImageCarsResponseBody build() {
            return new DetectImageCarsResponseBody(this);
        } 

    } 

}
