// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDSRecordResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDSRecordResponseBody</p>
 */
public class QueryDSRecordResponseBody extends TeaModel {
    @NameInMap("DSRecordList")
    private java.util.List < DSRecordList> DSRecordList;

    @NameInMap("RequestId")
    private String requestId;

    private QueryDSRecordResponseBody(Builder builder) {
        this.DSRecordList = builder.DSRecordList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDSRecordResponseBody create() {
        return builder().build();
    }

    /**
     * @return DSRecordList
     */
    public java.util.List < DSRecordList> getDSRecordList() {
        return this.DSRecordList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < DSRecordList> DSRecordList; 
        private String requestId; 

        /**
         * DSRecordList.
         */
        public Builder DSRecordList(java.util.List < DSRecordList> DSRecordList) {
            this.DSRecordList = DSRecordList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDSRecordResponseBody build() {
            return new QueryDSRecordResponseBody(this);
        } 

    } 

    public static class DSRecordList extends TeaModel {
        @NameInMap("Algorithm")
        private Integer algorithm;

        @NameInMap("Digest")
        private String digest;

        @NameInMap("DigestType")
        private Integer digestType;

        @NameInMap("KeyTag")
        private Integer keyTag;

        private DSRecordList(Builder builder) {
            this.algorithm = builder.algorithm;
            this.digest = builder.digest;
            this.digestType = builder.digestType;
            this.keyTag = builder.keyTag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DSRecordList create() {
            return builder().build();
        }

        /**
         * @return algorithm
         */
        public Integer getAlgorithm() {
            return this.algorithm;
        }

        /**
         * @return digest
         */
        public String getDigest() {
            return this.digest;
        }

        /**
         * @return digestType
         */
        public Integer getDigestType() {
            return this.digestType;
        }

        /**
         * @return keyTag
         */
        public Integer getKeyTag() {
            return this.keyTag;
        }

        public static final class Builder {
            private Integer algorithm; 
            private String digest; 
            private Integer digestType; 
            private Integer keyTag; 

            /**
             * Algorithm.
             */
            public Builder algorithm(Integer algorithm) {
                this.algorithm = algorithm;
                return this;
            }

            /**
             * Digest.
             */
            public Builder digest(String digest) {
                this.digest = digest;
                return this;
            }

            /**
             * DigestType.
             */
            public Builder digestType(Integer digestType) {
                this.digestType = digestType;
                return this;
            }

            /**
             * KeyTag.
             */
            public Builder keyTag(Integer keyTag) {
                this.keyTag = keyTag;
                return this;
            }

            public DSRecordList build() {
                return new DSRecordList(this);
            } 

        } 

    }
}
