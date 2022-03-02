// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link RefererConfiguration} extends {@link TeaModel}
 *
 * <p>RefererConfiguration</p>
 */
public class RefererConfiguration extends TeaModel {
    @NameInMap("AllowEmptyReferer")
    @Validation(required = true)
    private Boolean allowEmptyReferer;

    @NameInMap("AllowTruncateQueryString")
    private Boolean allowTruncateQueryString;

    @NameInMap("RefererList")
    @Validation(required = true)
    private RefererList refererList;

    private RefererConfiguration(Builder builder) {
        this.allowEmptyReferer = builder.allowEmptyReferer;
        this.allowTruncateQueryString = builder.allowTruncateQueryString;
        this.refererList = builder.refererList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefererConfiguration create() {
        return builder().build();
    }

    /**
     * @return allowEmptyReferer
     */
    public Boolean getAllowEmptyReferer() {
        return this.allowEmptyReferer;
    }

    /**
     * @return allowTruncateQueryString
     */
    public Boolean getAllowTruncateQueryString() {
        return this.allowTruncateQueryString;
    }

    /**
     * @return refererList
     */
    public RefererList getRefererList() {
        return this.refererList;
    }

    public static final class Builder {
        private Boolean allowEmptyReferer; 
        private Boolean allowTruncateQueryString; 
        private RefererList refererList; 

        /**
         * 是否允许Referer字段为空的请求访问
         */
        public Builder allowEmptyReferer(Boolean allowEmptyReferer) {
            this.allowEmptyReferer = allowEmptyReferer;
            return this;
        }

        /**
         * description
         */
        public Builder allowTruncateQueryString(Boolean allowTruncateQueryString) {
            this.allowTruncateQueryString = allowTruncateQueryString;
            return this;
        }

        /**
         * 保存Referer访问白名单
         */
        public Builder refererList(RefererList refererList) {
            this.refererList = refererList;
            return this;
        }

        public RefererConfiguration build() {
            return new RefererConfiguration(this);
        } 

    } 

    public static class RefererList extends TeaModel {
        @NameInMap("Referer")
        private java.util.List < String > referer;

        private RefererList(Builder builder) {
            this.referer = builder.referer;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RefererList create() {
            return builder().build();
        }

        /**
         * @return referer
         */
        public java.util.List < String > getReferer() {
            return this.referer;
        }

        public static final class Builder {
            private java.util.List < String > referer; 

            /**
             * 指定一条Referer访问白名单
             */
            public Builder referer(java.util.List < String > referer) {
                this.referer = referer;
                return this;
            }

            public RefererList build() {
                return new RefererList(this);
            } 

        } 

    }
}
