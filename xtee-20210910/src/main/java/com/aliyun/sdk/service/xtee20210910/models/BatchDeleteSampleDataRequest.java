// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link BatchDeleteSampleDataRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteSampleDataRequest</p>
 */
public class BatchDeleteSampleDataRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("regId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("uuids")
    private String uuids;

    private BatchDeleteSampleDataRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.uuids = builder.uuids;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteSampleDataRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return regId
     */
    public String getRegId() {
        return this.regId;
    }

    /**
     * @return uuids
     */
    public String getUuids() {
        return this.uuids;
    }

    public static final class Builder extends Request.Builder<BatchDeleteSampleDataRequest, Builder> {
        private String lang; 
        private String regId; 
        private String uuids; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteSampleDataRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.uuids = request.uuids;
        } 

        /**
         * <p>Language of the error message returned by the interface. Values: zh: Chinese; en: English. Default is en.</p>
         * 
         * <strong>example:</strong>
         * <p>zh</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>Region code</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regId(String regId) {
            this.putQueryParameter("regId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * <p>UUID.</p>
         * 
         * <strong>example:</strong>
         * <p>89cd3e44cd2f4a529fb020f3bab3ee1c</p>
         */
        public Builder uuids(String uuids) {
            this.putQueryParameter("uuids", uuids);
            this.uuids = uuids;
            return this;
        }

        @Override
        public BatchDeleteSampleDataRequest build() {
            return new BatchDeleteSampleDataRequest(this);
        } 

    } 

}
