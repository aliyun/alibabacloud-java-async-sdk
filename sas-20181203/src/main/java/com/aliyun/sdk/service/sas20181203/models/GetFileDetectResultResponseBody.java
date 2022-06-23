// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFileDetectResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetFileDetectResultResponseBody</p>
 */
public class GetFileDetectResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultList")
    private java.util.List < ResultList> resultList;

    private GetFileDetectResultResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultList = builder.resultList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDetectResultResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultList
     */
    public java.util.List < ResultList> getResultList() {
        return this.resultList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultList> resultList; 

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultList.
         */
        public Builder resultList(java.util.List < ResultList> resultList) {
            this.resultList = resultList;
            return this;
        }

        public GetFileDetectResultResponseBody build() {
            return new GetFileDetectResultResponseBody(this);
        } 

    } 

    public static class Ext extends TeaModel {
        @NameInMap("VirusName")
        private String virusName;

        private Ext(Builder builder) {
            this.virusName = builder.virusName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Ext create() {
            return builder().build();
        }

        /**
         * @return virusName
         */
        public String getVirusName() {
            return this.virusName;
        }

        public static final class Builder {
            private String virusName; 

            /**
             * VirusName.
             */
            public Builder virusName(String virusName) {
                this.virusName = virusName;
                return this;
            }

            public Ext build() {
                return new Ext(this);
            } 

        } 

    }
    public static class ResultList extends TeaModel {
        @NameInMap("Ext")
        private Ext ext;

        @NameInMap("HashKey")
        private String hashKey;

        @NameInMap("Result")
        private Integer result;

        private ResultList(Builder builder) {
            this.ext = builder.ext;
            this.hashKey = builder.hashKey;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultList create() {
            return builder().build();
        }

        /**
         * @return ext
         */
        public Ext getExt() {
            return this.ext;
        }

        /**
         * @return hashKey
         */
        public String getHashKey() {
            return this.hashKey;
        }

        /**
         * @return result
         */
        public Integer getResult() {
            return this.result;
        }

        public static final class Builder {
            private Ext ext; 
            private String hashKey; 
            private Integer result; 

            /**
             * Ext.
             */
            public Builder ext(Ext ext) {
                this.ext = ext;
                return this;
            }

            /**
             * HashKey.
             */
            public Builder hashKey(String hashKey) {
                this.hashKey = hashKey;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(Integer result) {
                this.result = result;
                return this;
            }

            public ResultList build() {
                return new ResultList(this);
            } 

        } 

    }
}
