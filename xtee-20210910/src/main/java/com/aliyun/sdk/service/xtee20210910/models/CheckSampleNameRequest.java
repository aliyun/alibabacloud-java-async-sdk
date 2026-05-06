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
 * {@link CheckSampleNameRequest} extends {@link RequestModel}
 *
 * <p>CheckSampleNameRequest</p>
 */
public class CheckSampleNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleName")
    private String sampleName;

    private CheckSampleNameRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.sampleName = builder.sampleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSampleNameRequest create() {
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
     * @return sampleName
     */
    public String getSampleName() {
        return this.sampleName;
    }

    public static final class Builder extends Request.Builder<CheckSampleNameRequest, Builder> {
        private String lang; 
        private String regId; 
        private String sampleName; 

        private Builder() {
            super();
        } 

        private Builder(CheckSampleNameRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.sampleName = request.sampleName;
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
         * SampleName.
         */
        public Builder sampleName(String sampleName) {
            this.putQueryParameter("SampleName", sampleName);
            this.sampleName = sampleName;
            return this;
        }

        @Override
        public CheckSampleNameRequest build() {
            return new CheckSampleNameRequest(this);
        } 

    } 

}
