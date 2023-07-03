// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlp_automl20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FindUserReport4AlinlpRequest} extends {@link RequestModel}
 *
 * <p>FindUserReport4AlinlpRequest</p>
 */
public class FindUserReport4AlinlpRequest extends Request {
    @Body
    @NameInMap("BeginTime")
    private String beginTime;

    @Body
    @NameInMap("CustomerUserParentId")
    private Long customerUserParentId;

    @Body
    @NameInMap("EndTime")
    private String endTime;

    @Body
    @NameInMap("ModelType")
    private String modelType;

    @Body
    @NameInMap("Type")
    private String type;

    private FindUserReport4AlinlpRequest(Builder builder) {
        super(builder);
        this.beginTime = builder.beginTime;
        this.customerUserParentId = builder.customerUserParentId;
        this.endTime = builder.endTime;
        this.modelType = builder.modelType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FindUserReport4AlinlpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return beginTime
     */
    public String getBeginTime() {
        return this.beginTime;
    }

    /**
     * @return customerUserParentId
     */
    public Long getCustomerUserParentId() {
        return this.customerUserParentId;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<FindUserReport4AlinlpRequest, Builder> {
        private String beginTime; 
        private Long customerUserParentId; 
        private String endTime; 
        private String modelType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(FindUserReport4AlinlpRequest request) {
            super(request);
            this.beginTime = request.beginTime;
            this.customerUserParentId = request.customerUserParentId;
            this.endTime = request.endTime;
            this.modelType = request.modelType;
            this.type = request.type;
        } 

        /**
         * BeginTime.
         */
        public Builder beginTime(String beginTime) {
            this.putBodyParameter("BeginTime", beginTime);
            this.beginTime = beginTime;
            return this;
        }

        /**
         * CustomerUserParentId.
         */
        public Builder customerUserParentId(Long customerUserParentId) {
            this.putBodyParameter("CustomerUserParentId", customerUserParentId);
            this.customerUserParentId = customerUserParentId;
            return this;
        }

        /**
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putBodyParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * ModelType.
         */
        public Builder modelType(String modelType) {
            this.putBodyParameter("ModelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public FindUserReport4AlinlpRequest build() {
            return new FindUserReport4AlinlpRequest(this);
        } 

    } 

}
