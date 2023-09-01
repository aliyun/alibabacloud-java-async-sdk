// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserLangResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserLangResponseBody</p>
 */
public class GetUserLangResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SasUserLang")
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

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SasUserLang.
         */
        public Builder sasUserLang(SasUserLang sasUserLang) {
            this.sasUserLang = sasUserLang;
            return this;
        }

        public GetUserLangResponseBody build() {
            return new GetUserLangResponseBody(this);
        } 

    } 

    public static class SasUserLang extends TeaModel {
        @NameInMap("Lang")
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

            /**
             * Lang.
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
