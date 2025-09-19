// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link GetUserLangResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserLangResponseBody</p>
 */
public class GetUserLangResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SasUserLang")
    private SasUserLang sasUserLang;

    private GetUserLangResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sasUserLang = builder.sasUserLang;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserLangResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sasUserLang
     */
    public SasUserLang getSasUserLang() {
        return this.sasUserLang;
    }

    public static final class Builder {
        private String requestId; 
        private SasUserLang sasUserLang; 

        private Builder() {
        } 

        private Builder(GetUserLangResponseBody model) {
            this.requestId = model.requestId;
            this.sasUserLang = model.sasUserLang;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23AD0BD2-8771-5647-819E-6BA51E21****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The language settings.</p>
         */
        public Builder sasUserLang(SasUserLang sasUserLang) {
            this.sasUserLang = sasUserLang;
            return this;
        }

        public GetUserLangResponseBody build() {
            return new GetUserLangResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetUserLangResponseBody} extends {@link TeaModel}
     *
     * <p>GetUserLangResponseBody</p>
     */
    public static class SasUserLang extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Lang")
        private String lang;

        private SasUserLang(Builder builder) {
            this.lang = builder.lang;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SasUserLang create() {
            return builder().build();
        }

        /**
         * @return lang
         */
        public String getLang() {
            return this.lang;
        }

        public static final class Builder {
            private String lang; 

            private Builder() {
            } 

            private Builder(SasUserLang model) {
                this.lang = model.lang;
            } 

            /**
             * <p>The language specified for log analysis. Valid values:</p>
             * <ul>
             * <li>zh: Chinese</li>
             * <li>en: English</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>zh</p>
             */
            public Builder lang(String lang) {
                this.lang = lang;
                return this;
            }

            public SasUserLang build() {
                return new SasUserLang(this);
            } 

        } 

    }
}
