// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;

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
    public Boolean allowEmptyReferer() {
        return this.allowEmptyReferer;
    }

    /**
     * @return refererList
     */
    public RefererList refererList() {
        return this.refererList;
    }

    public static final class Builder {
        private Boolean allowEmptyReferer; 
        private RefererList refererList; 

        /**
         * <p>AllowEmptyReferer.</p>
         */
        public Builder allowEmptyReferer(Boolean allowEmptyReferer) {
            this.allowEmptyReferer = allowEmptyReferer;
            return this;
        }

        /**
         * <p>RefererList.</p>
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
        public java.util.List < String > referer() {
            return this.referer;
        }

        public static final class Builder {
            private java.util.List < String > referer; 

            /**
             * <p>Referer.</p>
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
