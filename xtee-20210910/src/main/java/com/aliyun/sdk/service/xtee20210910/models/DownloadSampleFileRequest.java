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
 * {@link DownloadSampleFileRequest} extends {@link RequestModel}
 *
 * <p>DownloadSampleFileRequest</p>
 */
public class DownloadSampleFileRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SampleId")
    private Integer sampleId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tab")
    private String tab;

    private DownloadSampleFileRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.sampleId = builder.sampleId;
        this.tab = builder.tab;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadSampleFileRequest create() {
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

    /**
     * @return tab
     */
    public String getTab() {
        return this.tab;
    }

    public static final class Builder extends Request.Builder<DownloadSampleFileRequest, Builder> {
        private String lang; 
        private String regId; 
        private Integer sampleId; 
        private String tab; 

        private Builder() {
            super();
        } 

        private Builder(DownloadSampleFileRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
            this.sampleId = request.sampleId;
            this.tab = request.tab;
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

        /**
         * Tab.
         */
        public Builder tab(String tab) {
            this.putQueryParameter("Tab", tab);
            this.tab = tab;
            return this;
        }

        @Override
        public DownloadSampleFileRequest build() {
            return new DownloadSampleFileRequest(this);
        } 

    } 

}
