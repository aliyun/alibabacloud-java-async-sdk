// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchHbaseHaSlbRequest} extends {@link RequestModel}
 *
 * <p>SwitchHbaseHaSlbRequest</p>
 */
public class SwitchHbaseHaSlbRequest extends Request {
    @Query
    @NameInMap("BdsId")
    @Validation(required = true)
    private String bdsId;

    @Query
    @NameInMap("HaId")
    @Validation(required = true)
    private String haId;

    @Query
    @NameInMap("HaTypes")
    @Validation(required = true)
    private String haTypes;

    @Query
    @NameInMap("HbaseType")
    @Validation(required = true)
    private String hbaseType;

    private SwitchHbaseHaSlbRequest(Builder builder) {
        super(builder);
        this.bdsId = builder.bdsId;
        this.haId = builder.haId;
        this.haTypes = builder.haTypes;
        this.hbaseType = builder.hbaseType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchHbaseHaSlbRequest create() {
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

    /**
     * @return hbaseType
     */
    public String getHbaseType() {
        return this.hbaseType;
    }

    public static final class Builder extends Request.Builder<SwitchHbaseHaSlbRequest, Builder> {
        private String bdsId; 
        private String haId; 
        private String haTypes; 
        private String hbaseType; 

        private Builder() {
            super();
        } 

        private Builder(SwitchHbaseHaSlbRequest response) {
            super(response);
            this.bdsId = response.bdsId;
            this.haId = response.haId;
            this.haTypes = response.haTypes;
            this.hbaseType = response.hbaseType;
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

        /**
         * HbaseType.
         */
        public Builder hbaseType(String hbaseType) {
            this.putQueryParameter("HbaseType", hbaseType);
            this.hbaseType = hbaseType;
            return this;
        }

        @Override
        public SwitchHbaseHaSlbRequest build() {
            return new SwitchHbaseHaSlbRequest(this);
        } 

    } 

}
