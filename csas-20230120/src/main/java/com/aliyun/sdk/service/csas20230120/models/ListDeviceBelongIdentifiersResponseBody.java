// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link ListDeviceBelongIdentifiersResponseBody} extends {@link TeaModel}
 *
 * <p>ListDeviceBelongIdentifiersResponseBody</p>
 */
public class ListDeviceBelongIdentifiersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Identifiers")
    private java.util.List<Identifiers> identifiers;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListDeviceBelongIdentifiersResponseBody(Builder builder) {
        this.identifiers = builder.identifiers;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListDeviceBelongIdentifiersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return identifiers
     */
    public java.util.List<Identifiers> getIdentifiers() {
        return this.identifiers;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Identifiers> identifiers; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListDeviceBelongIdentifiersResponseBody model) {
            this.identifiers = model.identifiers;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Identifiers.
         */
        public Builder identifiers(java.util.List<Identifiers> identifiers) {
            this.identifiers = identifiers;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListDeviceBelongIdentifiersResponseBody build() {
            return new ListDeviceBelongIdentifiersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListDeviceBelongIdentifiersResponseBody} extends {@link TeaModel}
     *
     * <p>ListDeviceBelongIdentifiersResponseBody</p>
     */
    public static class Identifiers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("IdentifierId")
        private String identifierId;

        @com.aliyun.core.annotation.NameInMap("IdentifierType")
        private String identifierType;

        @com.aliyun.core.annotation.NameInMap("IdentifierValue")
        private String identifierValue;

        private Identifiers(Builder builder) {
            this.createTime = builder.createTime;
            this.identifierId = builder.identifierId;
            this.identifierType = builder.identifierType;
            this.identifierValue = builder.identifierValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Identifiers create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return identifierId
         */
        public String getIdentifierId() {
            return this.identifierId;
        }

        /**
         * @return identifierType
         */
        public String getIdentifierType() {
            return this.identifierType;
        }

        /**
         * @return identifierValue
         */
        public String getIdentifierValue() {
            return this.identifierValue;
        }

        public static final class Builder {
            private String createTime; 
            private String identifierId; 
            private String identifierType; 
            private String identifierValue; 

            private Builder() {
            } 

            private Builder(Identifiers model) {
                this.createTime = model.createTime;
                this.identifierId = model.identifierId;
                this.identifierType = model.identifierType;
                this.identifierValue = model.identifierValue;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IdentifierId.
             */
            public Builder identifierId(String identifierId) {
                this.identifierId = identifierId;
                return this;
            }

            /**
             * IdentifierType.
             */
            public Builder identifierType(String identifierType) {
                this.identifierType = identifierType;
                return this;
            }

            /**
             * IdentifierValue.
             */
            public Builder identifierValue(String identifierValue) {
                this.identifierValue = identifierValue;
                return this;
            }

            public Identifiers build() {
                return new Identifiers(this);
            } 

        } 

    }
}
