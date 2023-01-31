// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceBindNumberRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceBindNumberRequest</p>
 */
public class CreateInstanceBindNumberRequest extends Request {
    @Query
    @NameInMap("InstanceList")
    private String instanceList;

    @Query
    @NameInMap("Number")
    private String number;

    private CreateInstanceBindNumberRequest(Builder builder) {
        super(builder);
        this.instanceList = builder.instanceList;
        this.number = builder.number;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceBindNumberRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceList
     */
    public String getInstanceList() {
        return this.instanceList;
    }

    /**
     * @return number
     */
    public String getNumber() {
        return this.number;
    }

    public static final class Builder extends Request.Builder<CreateInstanceBindNumberRequest, Builder> {
        private String instanceList; 
        private String number; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceBindNumberRequest request) {
            super(request);
            this.instanceList = request.instanceList;
            this.number = request.number;
        } 

        /**
         * 智能外呼实例ID。
         */
        public Builder instanceList(String instanceList) {
            this.putQueryParameter("InstanceList", instanceList);
            this.instanceList = instanceList;
            return this;
        }

        /**
         * Number.
         */
        public Builder number(String number) {
            this.putQueryParameter("Number", number);
            this.number = number;
            return this;
        }

        @Override
        public CreateInstanceBindNumberRequest build() {
            return new CreateInstanceBindNumberRequest(this);
        } 

    } 

}
