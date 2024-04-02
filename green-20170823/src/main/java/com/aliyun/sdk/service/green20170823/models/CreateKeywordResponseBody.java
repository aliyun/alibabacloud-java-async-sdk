// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateKeywordResponseBody} extends {@link TeaModel}
 *
 * <p>CreateKeywordResponseBody</p>
 */
public class CreateKeywordResponseBody extends TeaModel {
    @NameInMap("InvalidKeywordList")
    private java.util.List < String > invalidKeywordList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SuccessCount")
    private Integer successCount;

    @NameInMap("validKeywordList")
    private java.util.List < ValidKeywordList> validKeywordList;

    private CreateKeywordResponseBody(Builder builder) {
        this.invalidKeywordList = builder.invalidKeywordList;
        this.requestId = builder.requestId;
        this.successCount = builder.successCount;
        this.validKeywordList = builder.validKeywordList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateKeywordResponseBody create() {
        return builder().build();
    }

    /**
     * @return invalidKeywordList
     */
    public java.util.List < String > getInvalidKeywordList() {
        return this.invalidKeywordList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return successCount
     */
    public Integer getSuccessCount() {
        return this.successCount;
    }

    /**
     * @return validKeywordList
     */
    public java.util.List < ValidKeywordList> getValidKeywordList() {
        return this.validKeywordList;
    }

    public static final class Builder {
        private java.util.List < String > invalidKeywordList; 
        private String requestId; 
        private Integer successCount; 
        private java.util.List < ValidKeywordList> validKeywordList; 

        /**
         * InvalidKeywordList.
         */
        public Builder invalidKeywordList(java.util.List < String > invalidKeywordList) {
            this.invalidKeywordList = invalidKeywordList;
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
         * SuccessCount.
         */
        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        /**
         * validKeywordList.
         */
        public Builder validKeywordList(java.util.List < ValidKeywordList> validKeywordList) {
            this.validKeywordList = validKeywordList;
            return this;
        }

        public CreateKeywordResponseBody build() {
            return new CreateKeywordResponseBody(this);
        } 

    } 

    public static class ValidKeywordList extends TeaModel {
        @NameInMap("id")
        private Integer id;

        @NameInMap("keyword")
        private String keyword;

        private ValidKeywordList(Builder builder) {
            this.id = builder.id;
            this.keyword = builder.keyword;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ValidKeywordList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return keyword
         */
        public String getKeyword() {
            return this.keyword;
        }

        public static final class Builder {
            private Integer id; 
            private String keyword; 

            /**
             * id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * keyword.
             */
            public Builder keyword(String keyword) {
                this.keyword = keyword;
                return this;
            }

            public ValidKeywordList build() {
                return new ValidKeywordList(this);
            } 

        } 

    }
}
