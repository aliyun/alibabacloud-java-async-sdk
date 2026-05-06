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
 * {@link DeleteSampleRequest} extends {@link RequestModel}
 *
 * <p>DeleteSampleRequest</p>
 */
public class DeleteSampleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleId")
    private Integer sampleId;

    private DeleteSampleRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.sampleId = builder.sampleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSampleRequest create() {
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
     * @return sampleId
     */
    public Integer getSampleId() {
        return this.sampleId;
    }

    public static final class Builder extends Request.Builder<DeleteSampleRequest, Builder> {
        private String lang; 
        private String regId; 
        private Integer sampleId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSampleRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.sampleId = request.sampleId;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * RegId.
         */
        public Builder regId(String regId) {
            this.putQueryParameter("RegId", regId);
            this.regId = regId;
            return this;
        }

        /**
         * SampleId.
         */
        public Builder sampleId(Integer sampleId) {
            this.putQueryParameter("SampleId", sampleId);
            this.sampleId = sampleId;
            return this;
        }

        @Override
        public DeleteSampleRequest build() {
            return new DeleteSampleRequest(this);
        } 

    } 

}
