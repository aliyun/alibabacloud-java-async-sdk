// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oosops20190601.models;

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
 * {@link SetQuotaRequest} extends {@link RequestModel}
 *
 * <p>SetQuotaRequest</p>
 */
public class SetQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Uid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private SetQuotaRequest(Builder builder) {
        super(builder);
        this.quotaName = builder.quotaName;
        this.regionId = builder.regionId;
        this.uid = builder.uid;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetQuotaRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return quotaName
     */
    public String getQuotaName() {
        return this.quotaName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<SetQuotaRequest, Builder> {
        private String quotaName; 
        private String regionId; 
        private String uid; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(SetQuotaRequest request) {
            super(request);
            this.quotaName = request.quotaName;
            this.regionId = request.regionId;
            this.uid = request.uid;
            this.value = request.value;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder quotaName(String quotaName) {
            this.putQueryParameter("QuotaName", quotaName);
            this.quotaName = quotaName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder uid(String uid) {
            this.putQueryParameter("Uid", uid);
            this.uid = uid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder value(String value) {
            this.putQueryParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public SetQuotaRequest build() {
            return new SetQuotaRequest(this);
        } 

    } 

}
