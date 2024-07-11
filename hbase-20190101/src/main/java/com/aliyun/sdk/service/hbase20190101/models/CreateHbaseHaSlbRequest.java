// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateHbaseHaSlbRequest} extends {@link RequestModel}
 *
 * <p>CreateHbaseHaSlbRequest</p>
 */
public class CreateHbaseHaSlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HbaseType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String hbaseType;

    private CreateHbaseHaSlbRequest(Builder builder) {
        super(builder);
        this.bdsId = builder.bdsId;
        this.clientToken = builder.clientToken;
        this.haId = builder.haId;
        this.haTypes = builder.haTypes;
        this.hbaseType = builder.hbaseType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateHbaseHaSlbRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bdsId
     */
    public String getBdsId() {
        return this.bdsId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return haId
     */
    public String getHaId() {
        return this.haId;
    }

    /**
     * @return haTypes
     */
    public String getHaTypes() {
        return this.haTypes;
    }

    /**
     * @return hbaseType
     */
    public String getHbaseType() {
        return this.hbaseType;
    }

    public static final class Builder extends Request.Builder<CreateHbaseHaSlbRequest, Builder> {
        private String bdsId; 
        private String clientToken; 
        private String haId; 
        private String haTypes; 
        private String hbaseType; 

        private Builder() {
            super();
        } 

        private Builder(CreateHbaseHaSlbRequest request) {
            super(request);
            this.bdsId = request.bdsId;
            this.clientToken = request.clientToken;
            this.haId = request.haId;
            this.haTypes = request.haTypes;
            this.hbaseType = request.hbaseType;
        } 

        /**
         * BdsId.
         */
        public Builder bdsId(String bdsId) {
            this.putQueryParameter("BdsId", bdsId);
            this.bdsId = bdsId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * HaId.
         */
        public Builder haId(String haId) {
            this.putQueryParameter("HaId", haId);
            this.haId = haId;
            return this;
        }

        /**
         * HaTypes.
         */
        public Builder haTypes(String haTypes) {
            this.putQueryParameter("HaTypes", haTypes);
            this.haTypes = haTypes;
            return this;
        }

        /**
         * HbaseType.
         */
        public Builder hbaseType(String hbaseType) {
            this.putQueryParameter("HbaseType", hbaseType);
            this.hbaseType = hbaseType;
            return this;
        }

        @Override
        public CreateHbaseHaSlbRequest build() {
            return new CreateHbaseHaSlbRequest(this);
        } 

    } 

}
