// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link SwitchHbaseHaSlbRequest} extends {@link RequestModel}
 *
 * <p>SwitchHbaseHaSlbRequest</p>
 */
public class SwitchHbaseHaSlbRequest extends Request {
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("HbaseType")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(SwitchHbaseHaSlbRequest request) {
            super(request);
            this.bdsId = request.bdsId;
            this.haId = request.haId;
            this.haTypes = request.haTypes;
            this.hbaseType = request.hbaseType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bds-t4n3496whj23ia4k</p>
         */
        public Builder bdsId(String bdsId) {
            this.putQueryParameter("BdsId", bdsId);
            this.bdsId = bdsId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ha-v21tmnxjwh2yuy1il</p>
         */
        public Builder haId(String haId) {
            this.putQueryParameter("HaId", haId);
            this.haId = haId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>thrift</p>
         */
        public Builder haTypes(String haTypes) {
            this.putQueryParameter("HaTypes", haTypes);
            this.haTypes = haTypes;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Active</p>
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
