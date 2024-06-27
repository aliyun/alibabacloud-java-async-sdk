// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SampleFileDownloadRequest} extends {@link RequestModel}
 *
 * <p>SampleFileDownloadRequest</p>
 */
public class SampleFileDownloadRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegId")
    private String regId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tab")
    private String tab;

    private SampleFileDownloadRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.regId = builder.regId;
        this.tab = builder.tab;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SampleFileDownloadRequest create() {
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
     * @return tab
     */
    public String getTab() {
        return this.tab;
    }

    public static final class Builder extends Request.Builder<SampleFileDownloadRequest, Builder> {
        private String lang; 
        private String regId; 
        private String tab; 

        private Builder() {
            super();
        } 

        private Builder(SampleFileDownloadRequest request) {
            super(request);
            this.lang = request.lang;
            this.regId = request.regId;
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
         * Tab.
         */
        public Builder tab(String tab) {
            this.putQueryParameter("Tab", tab);
            this.tab = tab;
            return this;
        }

        @Override
        public SampleFileDownloadRequest build() {
            return new SampleFileDownloadRequest(this);
        } 

    } 

}
