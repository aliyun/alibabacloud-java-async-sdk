// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteHbaseHaSlbRequest} extends {@link RequestModel}
 *
 * <p>DeleteHbaseHaSlbRequest</p>
 */
public class DeleteHbaseHaSlbRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HaTypes")
    @com.aliyun.core.annotation.Validation(required = true)
    private String haTypes;

    private DeleteHbaseHaSlbRequest(Builder builder) {
        super(builder);
        this.bdsId = builder.bdsId;
        this.haId = builder.haId;
        this.haTypes = builder.haTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteHbaseHaSlbRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteHbaseHaSlbRequest, Builder> {
        private String bdsId; 
        private String haId; 
        private String haTypes; 

        private Builder() {
            super();
        } 

        private Builder(DeleteHbaseHaSlbRequest request) {
            super(request);
            this.bdsId = request.bdsId;
            this.haId = request.haId;
            this.haTypes = request.haTypes;
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

        @Override
        public DeleteHbaseHaSlbRequest build() {
            return new DeleteHbaseHaSlbRequest(this);
        } 

    } 

}
