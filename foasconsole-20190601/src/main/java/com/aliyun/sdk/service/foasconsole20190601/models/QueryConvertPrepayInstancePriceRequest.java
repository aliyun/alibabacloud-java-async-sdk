// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.foasconsole20190601.models;

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
 * {@link QueryConvertPrepayInstancePriceRequest} extends {@link RequestModel}
 *
 * <p>QueryConvertPrepayInstancePriceRequest</p>
 */
public class QueryConvertPrepayInstancePriceRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConvertPrepayInstanceRequest")
    @com.aliyun.core.annotation.Validation(required = true)
    private ConvertPrepayInstanceRequest convertPrepayInstanceRequest;

    private QueryConvertPrepayInstancePriceRequest(Builder builder) {
        super(builder);
        this.convertPrepayInstanceRequest = builder.convertPrepayInstanceRequest;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryConvertPrepayInstancePriceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return convertPrepayInstanceRequest
     */
    public ConvertPrepayInstanceRequest getConvertPrepayInstanceRequest() {
        return this.convertPrepayInstanceRequest;
    }

    public static final class Builder extends Request.Builder<QueryConvertPrepayInstancePriceRequest, Builder> {
        private ConvertPrepayInstanceRequest convertPrepayInstanceRequest; 

        private Builder() {
            super();
        } 

        private Builder(QueryConvertPrepayInstancePriceRequest request) {
            super(request);
            this.convertPrepayInstanceRequest = request.convertPrepayInstanceRequest;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder convertPrepayInstanceRequest(ConvertPrepayInstanceRequest convertPrepayInstanceRequest) {
            this.putBodyParameter("ConvertPrepayInstanceRequest", convertPrepayInstanceRequest);
            this.convertPrepayInstanceRequest = convertPrepayInstanceRequest;
            return this;
        }

        @Override
        public QueryConvertPrepayInstancePriceRequest build() {
            return new QueryConvertPrepayInstancePriceRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryConvertPrepayInstancePriceRequest} extends {@link TeaModel}
     *
     * <p>QueryConvertPrepayInstancePriceRequest</p>
     */
    public static class ConvertPrepayInstanceRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Region")
        @com.aliyun.core.annotation.Validation(required = true)
        private String region;

        private ConvertPrepayInstanceRequest(Builder builder) {
            this.instanceId = builder.instanceId;
            this.region = builder.region;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConvertPrepayInstanceRequest create() {
            return builder().build();
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        public static final class Builder {
            private String instanceId; 
            private String region; 

            private Builder() {
            } 

            private Builder(ConvertPrepayInstanceRequest model) {
                this.instanceId = model.instanceId;
                this.region = model.region;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            public ConvertPrepayInstanceRequest build() {
                return new ConvertPrepayInstanceRequest(this);
            } 

        } 

    }
}
