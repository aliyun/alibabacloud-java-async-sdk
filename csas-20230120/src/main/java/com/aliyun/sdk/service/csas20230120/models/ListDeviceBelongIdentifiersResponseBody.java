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
         * <p>The device ownership identifier records on the current page. An empty list is returned if no matching records are found.</p>
         */
        public Builder identifiers(java.util.List<Identifiers> identifiers) {
            this.identifiers = identifiers;
            return this;
        }

        /**
         * <p>A reserved pagination field. No valid value is returned in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A reserved pagination cursor. No valid value is returned in the current version.</p>
         * 
         * <strong>example:</strong>
         * <p>d9fbd0d1ac24be90</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7A92B549-EC82-5F79-8301-63711AFC9DCE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records that match the filter conditions for the current tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
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
             * <p>The time when the record was created. The time is in RFC 3339 format and includes time zone information.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-11-24T10:30:00+08:00</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the identifier record, returned as a decimal string. You can use the ID to query or remove the record.</p>
             * 
             * <strong>example:</strong>
             * <p>482731</p>
             */
            public Builder identifierId(String identifierId) {
                this.identifierId = identifierId;
                return this;
            }

            /**
             * <p>The identifier type. MAC indicates the MAC address of the network interface controller (NIC), SystemSN indicates the system serial number, and BIOSSN indicates the BIOS serial number.</p>
             * 
             * <strong>example:</strong>
             * <p>MAC</p>
             */
            public Builder identifierType(String identifierType) {
                this.identifierType = identifierType;
                return this;
            }

            /**
             * <p>The identifier value in the record. MAC addresses are in the lowercase colon-separated format. System serial numbers and BIOS serial numbers are returned as recorded.</p>
             * 
             * <strong>example:</strong>
             * <p>02:00:00:00:00:01</p>
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
