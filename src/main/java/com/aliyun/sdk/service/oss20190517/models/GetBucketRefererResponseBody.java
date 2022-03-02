// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetBucketRefererResponseBody} extends {@link TeaModel}
 *
 * <p>GetBucketRefererResponseBody</p>
 */
public class GetBucketRefererResponseBody extends TeaModel {
    @ParentIgnore("RefererConfiguration")
    @NameInMap("AllowEmptyReferer")
    private Boolean allowEmptyReferer;

    @ParentIgnore("RefererConfiguration")
    @NameInMap("RefererList")
    private RefererList refererList;

    private GetBucketRefererResponseBody(Builder builder) {
        this.allowEmptyReferer = builder.allowEmptyReferer;
        this.refererList = builder.refererList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBucketRefererResponseBody create() {
        return builder().build();
    }

    /**
     * @return allowEmptyReferer
     */
    public Boolean getAllowEmptyReferer() {
        return this.allowEmptyReferer;
    }

    /**
     * @return refererList
     */
    public RefererList getRefererList() {
        return this.refererList;
    }

    public static final class Builder {
        private Boolean allowEmptyReferer; 
        private RefererList refererList; 

        /**
         * AllowEmptyReferer.
         */
        public Builder allowEmptyReferer(Boolean allowEmptyReferer) {
            this.allowEmptyReferer = allowEmptyReferer;
            return this;
        }

        /**
         * RefererList.
         */
        public Builder refererList(RefererList refererList) {
            this.refererList = refererList;
            return this;
        }

        public GetBucketRefererResponseBody build() {
            return new GetBucketRefererResponseBody(this);
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
             * Referer.
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
