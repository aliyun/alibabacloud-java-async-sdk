// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170405.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EdasProduceRequest} extends {@link RequestModel}
 *
 * <p>EdasProduceRequest</p>
 */
public class EdasProduceRequest extends Request {
    @Query
    @NameInMap("data")
    @Validation(required = true)
    private String data;

    @Query
    @NameInMap("sourceFlag")
    private String sourceFlag;

    private EdasProduceRequest(Builder builder) {
        super(builder);
        this.data = builder.data;
        this.sourceFlag = builder.sourceFlag;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EdasProduceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return sourceFlag
     */
    public String getSourceFlag() {
        return this.sourceFlag;
    }

    public static final class Builder extends Request.Builder<EdasProduceRequest, Builder> {
        private String data; 
        private String sourceFlag; 

        private Builder() {
            super();
        } 

        private Builder(EdasProduceRequest request) {
            super(request);
            this.data = request.data;
            this.sourceFlag = request.sourceFlag;
        } 

        /**
         * data.
         */
        public Builder data(String data) {
            this.putQueryParameter("data", data);
            this.data = data;
            return this;
        }

        /**
         * sourceFlag.
         */
        public Builder sourceFlag(String sourceFlag) {
            this.putQueryParameter("sourceFlag", sourceFlag);
            this.sourceFlag = sourceFlag;
            return this;
        }

        @Override
        public EdasProduceRequest build() {
            return new EdasProduceRequest(this);
        } 

    } 

}
