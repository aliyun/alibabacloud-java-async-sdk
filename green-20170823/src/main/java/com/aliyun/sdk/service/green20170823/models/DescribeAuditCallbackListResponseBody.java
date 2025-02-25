// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAuditCallbackListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAuditCallbackListResponseBody</p>
 */
public class DescribeAuditCallbackListResponseBody extends TeaModel {
    @NameInMap("CallbackList")
    private java.util.List < CallbackList> callbackList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeAuditCallbackListResponseBody(Builder builder) {
        this.callbackList = builder.callbackList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAuditCallbackListResponseBody create() {
        return builder().build();
    }

    /**
     * @return callbackList
     */
    public java.util.List < CallbackList> getCallbackList() {
        return this.callbackList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < CallbackList> callbackList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CallbackList.
         */
        public Builder callbackList(java.util.List < CallbackList> callbackList) {
            this.callbackList = callbackList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAuditCallbackListResponseBody build() {
            return new DescribeAuditCallbackListResponseBody(this);
        } 

    } 

    public static class CallbackList extends TeaModel {
        @NameInMap("CallbackSuggestions")
        private java.util.List < String > callbackSuggestions;

        @NameInMap("CallbackTypes")
        private java.util.List < String > callbackTypes;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CryptType")
        private String cryptType;

        @NameInMap("Id")
        private Long id;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Name")
        private String name;

        @NameInMap("Seed")
        private String seed;

        @NameInMap("Url")
        private String url;

        private CallbackList(Builder builder) {
            this.callbackSuggestions = builder.callbackSuggestions;
            this.callbackTypes = builder.callbackTypes;
            this.createTime = builder.createTime;
            this.cryptType = builder.cryptType;
            this.id = builder.id;
            this.modifiedTime = builder.modifiedTime;
            this.name = builder.name;
            this.seed = builder.seed;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CallbackList create() {
            return builder().build();
        }

        /**
         * @return callbackSuggestions
         */
        public java.util.List < String > getCallbackSuggestions() {
            return this.callbackSuggestions;
        }

        /**
         * @return callbackTypes
         */
        public java.util.List < String > getCallbackTypes() {
            return this.callbackTypes;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return cryptType
         */
        public String getCryptType() {
            return this.cryptType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return seed
         */
        public String getSeed() {
            return this.seed;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.List < String > callbackSuggestions; 
            private java.util.List < String > callbackTypes; 
            private String createTime; 
            private String cryptType; 
            private Long id; 
            private String modifiedTime; 
            private String name; 
            private String seed; 
            private String url; 

            /**
             * CallbackSuggestions.
             */
            public Builder callbackSuggestions(java.util.List < String > callbackSuggestions) {
                this.callbackSuggestions = callbackSuggestions;
                return this;
            }

            /**
             * CallbackTypes.
             */
            public Builder callbackTypes(java.util.List < String > callbackTypes) {
                this.callbackTypes = callbackTypes;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CryptType.
             */
            public Builder cryptType(String cryptType) {
                this.cryptType = cryptType;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Seed.
             */
            public Builder seed(String seed) {
                this.seed = seed;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public CallbackList build() {
                return new CallbackList(this);
            } 

        } 

    }
}
